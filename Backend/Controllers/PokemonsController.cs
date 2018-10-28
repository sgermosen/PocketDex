using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Threading.Tasks;
using System.Net;
using System.Web;
using System.Web.Mvc;
using Backend.Models;
using Domain;
using PsTools;

namespace Backend.Controllers
{
    public class PokemonsController : Controller
    {
        private readonly DataContext _db = new DataContext();

        // GET: Pokemons
        public async Task<ActionResult> Index()
        {
            return View(await _db.Pokemons.ToListAsync());
        }

        // GET: Pokemons/Details/5
        public async Task<ActionResult> Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Pokemon pokemon = await _db.Pokemons.FindAsync(id);
            if (pokemon == null)
            {
                return HttpNotFound();
            }
            return View(pokemon);
        }

        // GET: Pokemons/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Pokemons/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<ActionResult> Create(PokemonView view)
        {
            if (ModelState.IsValid)
            {

                var pokemon = new Pokemon
                {
                    Name = view.Name,
                    Abilities = view.Abilities,
                    LocationLat = view.LocationLat,
                    LocationLong = view.LocationLong,
                    Moves = view.Moves,
                    PokedexNumber = view.PokedexNumber,
                    Sprite = view.Sprite,Types= view.Types
                };

                var pic = string.Empty;
                var folder = "~/Content/Pokemons";

                if (view.SpriteFile != null)
                {
                    pic = Files.UploadPhoto(view.SpriteFile, folder, "");
                    pic = string.Format("{0}/{1}", folder, pic);
                }
                pokemon.Sprite = pic;
                _db.Pokemons.Add(pokemon);
                await _db.SaveChangesAsync();
                return RedirectToAction("Index");
            }

            return View(view);
        }

        // GET: Pokemons/Edit/5
        public async Task<ActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            var pokemon = await _db.Pokemons.FindAsync(id);
            if (pokemon == null)
            {
                return HttpNotFound();
            }
            return View(pokemon);
        }

        // POST: Pokemons/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<ActionResult> Edit( Pokemon pokemon)
        {
            if (ModelState.IsValid)
            {
                _db.Entry(pokemon).State = EntityState.Modified;
                await _db.SaveChangesAsync();
                return RedirectToAction("Index");
            }
            return View(pokemon);
        }

        // GET: Pokemons/Delete/5
        public async Task<ActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Pokemon pokemon = await _db.Pokemons.FindAsync(id);
            if (pokemon == null)
            {
                return HttpNotFound();
            }
            return View(pokemon);
        }

        // POST: Pokemons/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<ActionResult> DeleteConfirmed(int id)
        {
            Pokemon pokemon = await _db.Pokemons.FindAsync(id);
            _db.Pokemons.Remove(pokemon);
            await _db.SaveChangesAsync();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                _db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
