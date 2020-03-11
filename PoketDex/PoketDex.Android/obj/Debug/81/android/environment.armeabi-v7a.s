	.arch	armv7-a
	.syntax unified
	.eabi_attribute 67, "2.09"	@ Tag_conformance
	.eabi_attribute 6, 10	@ Tag_CPU_arch
	.eabi_attribute 7, 65	@ Tag_CPU_arch_profile
	.eabi_attribute 8, 1	@ Tag_ARM_ISA_use
	.eabi_attribute 9, 2	@ Tag_THUMB_ISA_use
	.fpu	vfpv3-d16
	.eabi_attribute 34, 1	@ Tag_CPU_unaligned_access
	.eabi_attribute 15, 1	@ Tag_ABI_PCS_RW_data
	.eabi_attribute 16, 1	@ Tag_ABI_PCS_RO_data
	.eabi_attribute 17, 2	@ Tag_ABI_PCS_GOT_use
	.eabi_attribute 20, 2	@ Tag_ABI_FP_denormal
	.eabi_attribute 21, 0	@ Tag_ABI_FP_exceptions
	.eabi_attribute 23, 3	@ Tag_ABI_FP_number_model
	.eabi_attribute 24, 1	@ Tag_ABI_align_needed
	.eabi_attribute 25, 1	@ Tag_ABI_align_preserved
	.eabi_attribute 38, 1	@ Tag_ABI_FP_16bit_format
	.eabi_attribute 18, 4	@ Tag_ABI_PCS_wchar_t
	.eabi_attribute 26, 2	@ Tag_ABI_enum_size
	.eabi_attribute 14, 0	@ Tag_ABI_PCS_R9_use
	.file	"environment.armeabi-v7a.s"
	.section	.rodata..L.str.1,"aMS",%progbits,1
	.type	.L.str.1, %object
.L.str.1:
	.asciz	"com.praysoft.poketdex"
	.size	.L.str.1, 22
	.section	.data.application_config,"aw",%progbits
	.type	application_config, %object
	.p2align	2
	.global	application_config
application_config:
	/* uses_mono_llvm */
	.byte	0
	/* uses_mono_aot */
	.byte	0
	/* uses_assembly_preload */
	.byte	1
	/* is_a_bundled_app */
	.byte	0
	/* environment_variable_count */
	.long	12
	/* system_property_count */
	.long	0
	/* android_package_name */
	.long	.L.str.1
	.size	application_config, 16
	.section	.rodata..L.str.2,"aMS",%progbits,1
	.type	.L.str.2, %object
.L.str.2:
	.asciz	"0"
	.size	.L.str.2, 2
	.section	.data.mono_aot_mode_name,"aw",%progbits
	.global	mono_aot_mode_name
mono_aot_mode_name:
	.long	.L.str.2
	.section	.rodata..L.str.3,"aMS",%progbits,1
	.type	.L.str.3, %object
.L.str.3:
	.asciz	"MONO_GC_PARAMS"
	.size	.L.str.3, 15
	.section	.rodata..L.str.4,"aMS",%progbits,1
	.type	.L.str.4, %object
.L.str.4:
	.asciz	"major=marksweep"
	.size	.L.str.4, 16
	.section	.rodata..L.str.5,"aMS",%progbits,1
	.type	.L.str.5, %object
.L.str.5:
	.asciz	"MONO_LOG_LEVEL"
	.size	.L.str.5, 15
	.section	.rodata..L.str.6,"aMS",%progbits,1
	.type	.L.str.6, %object
.L.str.6:
	.asciz	"info"
	.size	.L.str.6, 5
	.section	.rodata..L.str.7,"aMS",%progbits,1
	.type	.L.str.7, %object
.L.str.7:
	.asciz	"XAMARIN_BUILD_ID"
	.size	.L.str.7, 17
	.section	.rodata..L.str.8,"aMS",%progbits,1
	.type	.L.str.8, %object
.L.str.8:
	.asciz	"fb73e0d3-349e-4a29-b47d-3fb1e7856351"
	.size	.L.str.8, 37
	.section	.rodata..L.str.9,"aMS",%progbits,1
	.type	.L.str.9, %object
.L.str.9:
	.asciz	"XA_HTTP_CLIENT_HANDLER_TYPE"
	.size	.L.str.9, 28
	.section	.rodata..L.str.10,"aMS",%progbits,1
	.type	.L.str.10, %object
.L.str.10:
	.asciz	"System.Net.Http.HttpClientHandler, System.Net.Http"
	.size	.L.str.10, 51
	.section	.rodata..L.str.11,"aMS",%progbits,1
	.type	.L.str.11, %object
.L.str.11:
	.asciz	"XA_TLS_PROVIDER"
	.size	.L.str.11, 16
	.section	.rodata..L.str.12,"aMS",%progbits,1
	.type	.L.str.12, %object
.L.str.12:
	.asciz	"btls"
	.size	.L.str.12, 5
	.section	.rodata..L.str.13,"aMS",%progbits,1
	.type	.L.str.13, %object
.L.str.13:
	.asciz	"__XA_PACKAGE_NAMING_POLICY__"
	.size	.L.str.13, 29
	.section	.rodata..L.str.14,"aMS",%progbits,1
	.type	.L.str.14, %object
.L.str.14:
	.asciz	"LowercaseCrc64"
	.size	.L.str.14, 15
	.section	.data.app_environment_variables,"aw",%progbits
	.type	app_environment_variables, %object
	.p2align	2
	.global	app_environment_variables
app_environment_variables:
	.long	.L.str.3
	.long	.L.str.4
	.long	.L.str.5
	.long	.L.str.6
	.long	.L.str.7
	.long	.L.str.8
	.long	.L.str.9
	.long	.L.str.10
	.long	.L.str.11
	.long	.L.str.12
	.long	.L.str.13
	.long	.L.str.14
	.size	app_environment_variables, 48
	.section	.data.app_system_properties,"aw",%progbits
	.type	app_system_properties, %object
	.p2align	2
	.global	app_system_properties
app_system_properties:
	.size	app_system_properties, 0
