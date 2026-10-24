// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ACCESS_ALLOWED_ACE_TYPE`: UInt = 0u;
public const val `ACCESS_ALLOWED_CALLBACK_ACE_TYPE`: UInt = 9u;
public const val `ACCESS_ALLOWED_CALLBACK_OBJECT_ACE_TYPE`: UInt = 11u;
public const val `ACCESS_ALLOWED_COMPOUND_ACE_TYPE`: UInt = 4u;
public const val `ACCESS_ALLOWED_OBJECT_ACE_TYPE`: UInt = 5u;
public const val `ACCESS_DENIED_ACE_TYPE`: UInt = 1u;
public const val `ACCESS_DENIED_CALLBACK_ACE_TYPE`: UInt = 10u;
public const val `ACCESS_DENIED_CALLBACK_OBJECT_ACE_TYPE`: UInt = 12u;
public const val `ACCESS_DENIED_OBJECT_ACE_TYPE`: UInt = 6u;
// UNSUPPORTED Rust 10:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ACCESS_DS_OBJECT_TYPE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Directory Service Object");

// UNSUPPORTED Rust 11:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ACCESS_DS_OBJECT_TYPE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Directory Service Object");

// UNSUPPORTED Rust 12:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ACCESS_DS_SOURCE_A: windows_sys::core::PCSTR = windows_sys::core::s!("DS");

// UNSUPPORTED Rust 13:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ACCESS_DS_SOURCE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DS");

public const val `ACCESS_FILTER_SECURITY_INFORMATION`: Int = 256;
public const val `ACCESS_MAX_LEVEL`: UInt = 4u;
public const val `ACCESS_MAX_MS_ACE_TYPE`: UInt = 8u;
public const val `ACCESS_MAX_MS_OBJECT_ACE_TYPE`: UInt = 8u;
public const val `ACCESS_MAX_MS_V2_ACE_TYPE`: UInt = 3u;
public const val `ACCESS_MAX_MS_V3_ACE_TYPE`: UInt = 4u;
public const val `ACCESS_MAX_MS_V4_ACE_TYPE`: UInt = 8u;
public const val `ACCESS_MAX_MS_V5_ACE_TYPE`: UInt = 21u;
public const val `ACCESS_MIN_MS_ACE_TYPE`: UInt = 0u;
public const val `ACCESS_MIN_MS_OBJECT_ACE_TYPE`: UInt = 5u;
public const val `ACCESS_OBJECT_GUID`: UInt = 0u;
public const val `ACCESS_PROPERTY_GUID`: UInt = 2u;
public const val `ACCESS_PROPERTY_SET_GUID`: UInt = 1u;
public const val `ACCESS_REASON_DATA_MASK`: UInt = 65535u;
public const val `ACCESS_REASON_EXDATA_MASK`: UInt = 2130706432u;
public const val `ACCESS_REASON_STAGING_MASK`: UInt = 2147483648u;
public typealias `ACCESS_REASON_TYPE` = Int;
public const val `ACCESS_REASON_TYPE_MASK`: UInt = 16711680u;
public const val `ACCESS_SYSTEM_SECURITY`: UInt = 16777216u;
public const val `ACL_REVISION1`: UInt = 1u;
public const val `ACL_REVISION2`: UInt = 2u;
public const val `ACL_REVISION3`: UInt = 3u;
public const val `ACL_REVISION4`: UInt = 4u;
public const val `ACPI_PPM_HARDWARE_ALL`: UInt = 254u;
public const val `ACPI_PPM_SOFTWARE_ALL`: UInt = 252u;
public const val `ACPI_PPM_SOFTWARE_ANY`: UInt = 253u;
public typealias `ACTIVATION_CONTEXT_INFO_CLASS` = Int;
public const val `ACTIVATION_CONTEXT_PATH_TYPE_ASSEMBLYREF`: UInt = 4u;
public const val `ACTIVATION_CONTEXT_PATH_TYPE_NONE`: UInt = 1u;
public const val `ACTIVATION_CONTEXT_PATH_TYPE_URL`: UInt = 3u;
public const val `ACTIVATION_CONTEXT_PATH_TYPE_WIN32_FILE`: UInt = 2u;
public const val `ACTIVATION_CONTEXT_SECTION_APPLICATION_SETTINGS`: UInt = 10u;
public const val `ACTIVATION_CONTEXT_SECTION_ASSEMBLY_INFORMATION`: UInt = 1u;
public const val `ACTIVATION_CONTEXT_SECTION_CLR_SURROGATES`: UInt = 9u;
public const val `ACTIVATION_CONTEXT_SECTION_COMPATIBILITY_INFO`: UInt = 11u;
public const val `ACTIVATION_CONTEXT_SECTION_COM_INTERFACE_REDIRECTION`: UInt = 5u;
public const val `ACTIVATION_CONTEXT_SECTION_COM_PROGID_REDIRECTION`: UInt = 7u;
public const val `ACTIVATION_CONTEXT_SECTION_COM_SERVER_REDIRECTION`: UInt = 4u;
public const val `ACTIVATION_CONTEXT_SECTION_COM_TYPE_LIBRARY_REDIRECTION`: UInt = 6u;
public const val `ACTIVATION_CONTEXT_SECTION_DLL_REDIRECTION`: UInt = 2u;
public const val `ACTIVATION_CONTEXT_SECTION_GLOBAL_OBJECT_RENAME_TABLE`: UInt = 8u;
public const val `ACTIVATION_CONTEXT_SECTION_WINDOW_CLASS_REDIRECTION`: UInt = 3u;
public const val `ACTIVATION_CONTEXT_SECTION_WINRT_ACTIVATABLE_CLASSES`: UInt = 12u;
public const val `ALERT_SYSTEM_CRITICAL`: `ALERT_SYSTEM_SEV` = 5u;
public const val `ALERT_SYSTEM_ERROR`: `ALERT_SYSTEM_SEV` = 3u;
public const val `ALERT_SYSTEM_INFORMATIONAL`: `ALERT_SYSTEM_SEV` = 1u;
public const val `ALERT_SYSTEM_QUERY`: `ALERT_SYSTEM_SEV` = 4u;
public typealias `ALERT_SYSTEM_SEV` = UInt;
public const val `ALERT_SYSTEM_WARNING`: `ALERT_SYSTEM_SEV` = 2u;
// UNSUPPORTED Rust 63:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ALL_POWERSCHEMES_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68a1e95e_13ea_41e1_8011_0c496ca490b0);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ANON_OBJECT_HEADER` (
    public var `Sig1`: UShort,
    public var `Sig2`: UShort,
    public var `Version`: UShort,
    public var `Machine`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `ClassID`: `windows_sys`.`core`.`GUID`,
    public var `SizeOfData`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ANON_OBJECT_HEADER_BIGOBJ` (
    public var `Sig1`: UShort,
    public var `Sig2`: UShort,
    public var `Version`: UShort,
    public var `Machine`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `ClassID`: `windows_sys`.`core`.`GUID`,
    public var `SizeOfData`: UInt,
    public var `Flags`: UInt,
    public var `MetaDataSize`: UInt,
    public var `MetaDataOffset`: UInt,
    public var `NumberOfSections`: UInt,
    public var `PointerToSymbolTable`: UInt,
    public var `NumberOfSymbols`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ANON_OBJECT_HEADER_V2` (
    public var `Sig1`: UShort,
    public var `Sig2`: UShort,
    public var `Version`: UShort,
    public var `Machine`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `ClassID`: `windows_sys`.`core`.`GUID`,
    public var `SizeOfData`: UInt,
    public var `Flags`: UInt,
    public var `MetaDataSize`: UInt,
    public var `MetaDataOffset`: UInt,
)
public const val `ANYSIZE_ARRAY`: UInt = 1u;
public const val `APPCOMMAND_BASS_BOOST`: `APPCOMMAND_ID` = 20u;
public const val `APPCOMMAND_BASS_DOWN`: `APPCOMMAND_ID` = 19u;
public const val `APPCOMMAND_BASS_UP`: `APPCOMMAND_ID` = 21u;
public const val `APPCOMMAND_BROWSER_BACKWARD`: `APPCOMMAND_ID` = 1u;
public const val `APPCOMMAND_BROWSER_FAVORITES`: `APPCOMMAND_ID` = 6u;
public const val `APPCOMMAND_BROWSER_FORWARD`: `APPCOMMAND_ID` = 2u;
public const val `APPCOMMAND_BROWSER_HOME`: `APPCOMMAND_ID` = 7u;
public const val `APPCOMMAND_BROWSER_REFRESH`: `APPCOMMAND_ID` = 3u;
public const val `APPCOMMAND_BROWSER_SEARCH`: `APPCOMMAND_ID` = 5u;
public const val `APPCOMMAND_BROWSER_STOP`: `APPCOMMAND_ID` = 4u;
public const val `APPCOMMAND_CLOSE`: `APPCOMMAND_ID` = 31u;
public const val `APPCOMMAND_COPY`: `APPCOMMAND_ID` = 36u;
public const val `APPCOMMAND_CORRECTION_LIST`: `APPCOMMAND_ID` = 45u;
public const val `APPCOMMAND_CUT`: `APPCOMMAND_ID` = 37u;
public const val `APPCOMMAND_DELETE`: `APPCOMMAND_ID` = 53u;
public const val `APPCOMMAND_DICTATE_OR_COMMAND_CONTROL_TOGGLE`: `APPCOMMAND_ID` = 43u;
public const val `APPCOMMAND_DWM_FLIP3D`: `APPCOMMAND_ID` = 54u;
public const val `APPCOMMAND_FIND`: `APPCOMMAND_ID` = 28u;
public const val `APPCOMMAND_FORWARD_MAIL`: `APPCOMMAND_ID` = 40u;
public const val `APPCOMMAND_HELP`: `APPCOMMAND_ID` = 27u;
public typealias `APPCOMMAND_ID` = UInt;
public const val `APPCOMMAND_LAUNCH_APP1`: `APPCOMMAND_ID` = 17u;
public const val `APPCOMMAND_LAUNCH_APP2`: `APPCOMMAND_ID` = 18u;
public const val `APPCOMMAND_LAUNCH_MAIL`: `APPCOMMAND_ID` = 15u;
public const val `APPCOMMAND_LAUNCH_MEDIA_SELECT`: `APPCOMMAND_ID` = 16u;
public const val `APPCOMMAND_MEDIA_CHANNEL_DOWN`: `APPCOMMAND_ID` = 52u;
public const val `APPCOMMAND_MEDIA_CHANNEL_UP`: `APPCOMMAND_ID` = 51u;
public const val `APPCOMMAND_MEDIA_FAST_FORWARD`: `APPCOMMAND_ID` = 49u;
public const val `APPCOMMAND_MEDIA_NEXTTRACK`: `APPCOMMAND_ID` = 11u;
public const val `APPCOMMAND_MEDIA_PAUSE`: `APPCOMMAND_ID` = 47u;
public const val `APPCOMMAND_MEDIA_PLAY`: `APPCOMMAND_ID` = 46u;
public const val `APPCOMMAND_MEDIA_PLAY_PAUSE`: `APPCOMMAND_ID` = 14u;
public const val `APPCOMMAND_MEDIA_PREVIOUSTRACK`: `APPCOMMAND_ID` = 12u;
public const val `APPCOMMAND_MEDIA_RECORD`: `APPCOMMAND_ID` = 48u;
public const val `APPCOMMAND_MEDIA_REWIND`: `APPCOMMAND_ID` = 50u;
public const val `APPCOMMAND_MEDIA_STOP`: `APPCOMMAND_ID` = 13u;
public const val `APPCOMMAND_MICROPHONE_VOLUME_DOWN`: `APPCOMMAND_ID` = 25u;
public const val `APPCOMMAND_MICROPHONE_VOLUME_MUTE`: `APPCOMMAND_ID` = 24u;
public const val `APPCOMMAND_MICROPHONE_VOLUME_UP`: `APPCOMMAND_ID` = 26u;
public const val `APPCOMMAND_MIC_ON_OFF_TOGGLE`: `APPCOMMAND_ID` = 44u;
public const val `APPCOMMAND_NEW`: `APPCOMMAND_ID` = 29u;
public const val `APPCOMMAND_OPEN`: `APPCOMMAND_ID` = 30u;
public const val `APPCOMMAND_PASTE`: `APPCOMMAND_ID` = 38u;
public const val `APPCOMMAND_PRINT`: `APPCOMMAND_ID` = 33u;
public const val `APPCOMMAND_REDO`: `APPCOMMAND_ID` = 35u;
public const val `APPCOMMAND_REPLY_TO_MAIL`: `APPCOMMAND_ID` = 39u;
public const val `APPCOMMAND_SAVE`: `APPCOMMAND_ID` = 32u;
public const val `APPCOMMAND_SEND_MAIL`: `APPCOMMAND_ID` = 41u;
public const val `APPCOMMAND_SPELL_CHECK`: `APPCOMMAND_ID` = 42u;
public const val `APPCOMMAND_TREBLE_DOWN`: `APPCOMMAND_ID` = 22u;
public const val `APPCOMMAND_TREBLE_UP`: `APPCOMMAND_ID` = 23u;
public const val `APPCOMMAND_UNDO`: `APPCOMMAND_ID` = 34u;
public const val `APPCOMMAND_VOLUME_DOWN`: `APPCOMMAND_ID` = 9u;
public const val `APPCOMMAND_VOLUME_MUTE`: `APPCOMMAND_ID` = 8u;
public const val `APPCOMMAND_VOLUME_UP`: `APPCOMMAND_ID` = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `APPLICATIONLAUNCH_SETTING_VALUE` (
    public var `ActivationTime`: Long,
    public var `Flags`: UInt,
    public var `ButtonInstanceID`: UInt,
)
public const val `APPLICATION_ERROR_MASK`: UInt = 536870912u;
public typealias `ARM64_FNPDATA_CR` = Int;
public typealias `ARM64_FNPDATA_FLAGS` = Int;
public const val `ARM64_MAX_BREAKPOINTS`: UInt = 8u;
public const val `ARM64_MAX_WATCHPOINTS`: UInt = 2u;
public const val `ARM64_MULT_INTRINSICS_SUPPORTED`: UInt = 1u;
public const val `ARM64_PREFETCH_KEEP`: UInt = 0u;
public const val `ARM64_PREFETCH_L1`: UInt = 0u;
public const val `ARM64_PREFETCH_L2`: UInt = 2u;
public const val `ARM64_PREFETCH_L3`: UInt = 4u;
public const val `ARM64_PREFETCH_PLD`: UInt = 0u;
public const val `ARM64_PREFETCH_PLI`: UInt = 8u;
public const val `ARM64_PREFETCH_PST`: UInt = 16u;
public const val `ARM64_PREFETCH_STRM`: UInt = 1u;
public const val `ARM_CACHE_ALIGNMENT_SIZE`: UInt = 128u;
public const val `ARM_MAX_BREAKPOINTS`: UInt = 8u;
public const val `ARM_MAX_WATCHPOINTS`: UInt = 1u;
public const val `ASSERT_BREAKPOINT`: UInt = 524291u;
public typealias `ATF_FLAGS` = UInt;
public const val `ATF_ONOFFFEEDBACK`: `ATF_FLAGS` = 2u;
public const val `ATF_TIMEOUTON`: `ATF_FLAGS` = 1u;
public const val `AUDIT_ALLOW_NO_PRIVILEGE`: UInt = 1u;
public const val `AccessReasonAllowedAce`: `ACCESS_REASON_TYPE` = 65536;
public const val `AccessReasonAllowedParentAce`: `ACCESS_REASON_TYPE` = 196608;
public const val `AccessReasonDeniedAce`: `ACCESS_REASON_TYPE` = 131072;
public const val `AccessReasonDeniedParentAce`: `ACCESS_REASON_TYPE` = 262144;
public const val `AccessReasonEmptyDacl`: `ACCESS_REASON_TYPE` = 6291456;
public const val `AccessReasonFilterAce`: `ACCESS_REASON_TYPE` = 10485760;
public const val `AccessReasonFromPrivilege`: `ACCESS_REASON_TYPE` = 2097152;
public const val `AccessReasonIntegrityLevel`: `ACCESS_REASON_TYPE` = 3145728;
public const val `AccessReasonMissingPrivilege`: `ACCESS_REASON_TYPE` = 1048576;
public const val `AccessReasonNoGrant`: `ACCESS_REASON_TYPE` = 8388608;
public const val `AccessReasonNoSD`: `ACCESS_REASON_TYPE` = 7340032;
public const val `AccessReasonNone`: `ACCESS_REASON_TYPE` = 0;
public const val `AccessReasonNotGrantedByCape`: `ACCESS_REASON_TYPE` = 327680;
public const val `AccessReasonNotGrantedByParentCape`: `ACCESS_REASON_TYPE` = 393216;
public const val `AccessReasonNotGrantedToAppContainer`: `ACCESS_REASON_TYPE` = 458752;
public const val `AccessReasonNullDacl`: `ACCESS_REASON_TYPE` = 5242880;
public const val `AccessReasonOwnership`: `ACCESS_REASON_TYPE` = 4194304;
public const val `AccessReasonTrustLabel`: `ACCESS_REASON_TYPE` = 9437184;
public const val `ActivationContextBasicInformation`: `ACTIVATION_CONTEXT_INFO_CLASS` = 1;
public const val `ActivationContextDetailedInformation`: `ACTIVATION_CONTEXT_INFO_CLASS` = 2;
public const val `ActivationContextManifestResourceName`: `ACTIVATION_CONTEXT_INFO_CLASS` = 7;
public const val `AdapterType`: `SERVICE_NODE_TYPE` = 4;
public const val `AssemblyDetailedInformationInActivationContext`: `ACTIVATION_CONTEXT_INFO_CLASS` = 3;
public const val `AssemblyDetailedInformationInActivationContxt`: `ACTIVATION_CONTEXT_INFO_CLASS` = 3;
public const val `AutoLoad`: `SERVICE_LOAD_TYPE` = 2;
public const val `BATTERY_DISCHARGE_FLAGS_ENABLE`: UInt = 2147483648u;
public const val `BATTERY_DISCHARGE_FLAGS_EVENTCODE_MASK`: UInt = 7u;
public const val `BREAK_DEBUG_BASE`: UInt = 524288u;
public const val `BootLoad`: `SERVICE_LOAD_TYPE` = 0;
public const val `CACHE_FULLY_ASSOCIATIVE`: UInt = 255u;
public typealias `CFE_UNDERLINE` = UInt;
public const val `CFG_CALL_TARGET_CONVERT_EXPORT_SUPPRESSED_TO_VALID`: UInt = 4u;
public const val `CFG_CALL_TARGET_CONVERT_XFG_TO_CFG`: UInt = 16u;
public const val `CFG_CALL_TARGET_PROCESSED`: UInt = 2u;
public const val `CFG_CALL_TARGET_VALID`: UInt = 1u;
public const val `CFG_CALL_TARGET_VALID_XFG`: UInt = 8u;
public const val `CFU_CF1UNDERLINE`: `CFE_UNDERLINE` = 255u;
public const val `CFU_INVERT`: `CFE_UNDERLINE` = 254u;
public const val `CFU_UNDERLINE`: `CFE_UNDERLINE` = 1u;
public const val `CFU_UNDERLINEDASH`: `CFE_UNDERLINE` = 5u;
public const val `CFU_UNDERLINEDASHDOT`: `CFE_UNDERLINE` = 6u;
public const val `CFU_UNDERLINEDASHDOTDOT`: `CFE_UNDERLINE` = 7u;
public const val `CFU_UNDERLINEDOTTED`: `CFE_UNDERLINE` = 4u;
public const val `CFU_UNDERLINEDOUBLE`: `CFE_UNDERLINE` = 3u;
public const val `CFU_UNDERLINEDOUBLEWAVE`: `CFE_UNDERLINE` = 11u;
public const val `CFU_UNDERLINEHAIRLINE`: `CFE_UNDERLINE` = 10u;
public const val `CFU_UNDERLINEHEAVYWAVE`: `CFE_UNDERLINE` = 12u;
public const val `CFU_UNDERLINELONGDASH`: `CFE_UNDERLINE` = 13u;
public const val `CFU_UNDERLINENONE`: `CFE_UNDERLINE` = 0u;
public const val `CFU_UNDERLINETHICK`: `CFE_UNDERLINE` = 9u;
public const val `CFU_UNDERLINETHICKDASH`: `CFE_UNDERLINE` = 14u;
public const val `CFU_UNDERLINETHICKDASHDOT`: `CFE_UNDERLINE` = 15u;
public const val `CFU_UNDERLINETHICKDASHDOTDOT`: `CFE_UNDERLINE` = 16u;
public const val `CFU_UNDERLINETHICKDOTTED`: `CFE_UNDERLINE` = 17u;
public const val `CFU_UNDERLINETHICKLONGDASH`: `CFE_UNDERLINE` = 18u;
public const val `CFU_UNDERLINEWAVE`: `CFE_UNDERLINE` = 8u;
public const val `CFU_UNDERLINEWORD`: `CFE_UNDERLINE` = 2u;
public const val `CLAIM_SECURITY_ATTRIBUTES_INFORMATION_VERSION`: UInt = 1u;
public const val `CLAIM_SECURITY_ATTRIBUTES_INFORMATION_VERSION_V1`: UInt = 1u;
public const val `CLAIM_SECURITY_ATTRIBUTE_CUSTOM_FLAGS`: UInt = 4294901760u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_INVALID`: UInt = 0u;
public const val `CM_SERVICE_MEASURED_BOOT_LOAD`: UInt = 32u;
public const val `CM_SERVICE_NETWORK_BOOT_LOAD`: UInt = 1u;
public const val `CM_SERVICE_RAM_DISK_BOOT_LOAD`: UInt = 256u;
public const val `CM_SERVICE_SD_DISK_BOOT_LOAD`: UInt = 8u;
public const val `CM_SERVICE_USB3_DISK_BOOT_LOAD`: UInt = 16u;
public const val `CM_SERVICE_USB_DISK_BOOT_LOAD`: UInt = 4u;
public const val `CM_SERVICE_VERIFIER_BOOT_LOAD`: UInt = 64u;
public const val `CM_SERVICE_VIRTUAL_DISK_BOOT_LOAD`: UInt = 2u;
public const val `CM_SERVICE_WINPE_BOOT_LOAD`: UInt = 128u;
public const val `COMIMAGE_FLAGS_32BITPREFERRED`: `ReplacesCorHdrNumericDefines` = 131072;
public const val `COMIMAGE_FLAGS_32BITREQUIRED`: `ReplacesCorHdrNumericDefines` = 2;
public const val `COMIMAGE_FLAGS_ILONLY`: `ReplacesCorHdrNumericDefines` = 1;
public const val `COMIMAGE_FLAGS_IL_LIBRARY`: `ReplacesCorHdrNumericDefines` = 4;
public const val `COMIMAGE_FLAGS_NATIVE_ENTRYPOINT`: `ReplacesCorHdrNumericDefines` = 16;
public const val `COMIMAGE_FLAGS_STRONGNAMESIGNED`: `ReplacesCorHdrNumericDefines` = 8;
public const val `COMIMAGE_FLAGS_TRACKDEBUGDATA`: `ReplacesCorHdrNumericDefines` = 65536;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMPONENT_FILTER` (
    public var `ComponentFlags`: UInt,
)
public const val `COMPONENT_KTM`: UInt = 1u;
public const val `COMPONENT_VALID_FLAGS`: UInt = 1u;
public const val `COMPRESSION_ENGINE_HIBER`: UInt = 512u;
public const val `COMPRESSION_ENGINE_MAXIMUM`: UInt = 256u;
public const val `COMPRESSION_ENGINE_STANDARD`: UInt = 0u;
public const val `CORE_PARKING_POLICY_CHANGE_IDEAL`: UInt = 0u;
public const val `CORE_PARKING_POLICY_CHANGE_MAX`: UInt = 3u;
public const val `CORE_PARKING_POLICY_CHANGE_MULTISTEP`: UInt = 3u;
public const val `CORE_PARKING_POLICY_CHANGE_ROCKET`: UInt = 2u;
public const val `CORE_PARKING_POLICY_CHANGE_SINGLE`: UInt = 1u;
public const val `COR_DELETED_NAME_LENGTH`: `ReplacesCorHdrNumericDefines` = 8;
public const val `COR_ILMETHOD_SECT_SMALL_MAX_DATASIZE`: `ReplacesCorHdrNumericDefines` = 255;
public const val `COR_VERSION_MAJOR`: `ReplacesCorHdrNumericDefines` = 2;
public const val `COR_VERSION_MAJOR_V2`: `ReplacesCorHdrNumericDefines` = 2;
public const val `COR_VERSION_MINOR`: `ReplacesCorHdrNumericDefines` = 5;
public const val `COR_VTABLEGAP_NAME_LENGTH`: `ReplacesCorHdrNumericDefines` = 8;
public const val `COR_VTABLE_32BIT`: `ReplacesCorHdrNumericDefines` = 1;
public const val `COR_VTABLE_64BIT`: `ReplacesCorHdrNumericDefines` = 2;
public const val `COR_VTABLE_CALL_MOST_DERIVED`: `ReplacesCorHdrNumericDefines` = 16;
public const val `COR_VTABLE_FROM_UNMANAGED`: `ReplacesCorHdrNumericDefines` = 4;
public const val `COR_VTABLE_FROM_UNMANAGED_RETAIN_APPDOMAIN`: `ReplacesCorHdrNumericDefines` = 8;
public const val `CREATE_BOUNDARY_DESCRIPTOR_ADD_APPCONTAINER_SID`: UInt = 1u;
public const val `CRITICAL_ACE_FLAG`: UInt = 32u;
public const val `CTMF_INCLUDE_APPCONTAINER`: UInt = 1u;
public const val `CTMF_INCLUDE_LPAC`: UInt = 2u;
public const val `CompatibilityInformationInActivationContext`: `ACTIVATION_CONTEXT_INFO_CLASS` = 6;
public const val `CriticalError`: `SERVICE_ERROR_TYPE` = 3;
public const val `DECIMAL_NEG`: UByte = 128u;
public const val `DEDICATED_MEMORY_CACHE_ELIGIBLE`: UInt = 1u;
// UNSUPPORTED Rust 302:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DEVICEFAMILYDEVICEFORM_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\Software\\Microsoft\\Windows NT\\CurrentVersion\\OEM");

// UNSUPPORTED Rust 303:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DEVICEFAMILYDEVICEFORM_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceForm");

public const val `DIAGNOSTIC_REASON_DETAILED_STRING`: UInt = 2u;
public const val `DIAGNOSTIC_REASON_NOT_SPECIFIED`: UInt = 2147483648u;
public const val `DIAGNOSTIC_REASON_SIMPLE_STRING`: UInt = 1u;
public const val `DIAGNOSTIC_REASON_VERSION`: UInt = 0u;
public const val `DISCHARGE_POLICY_CRITICAL`: UInt = 0u;
public const val `DISCHARGE_POLICY_LOW`: UInt = 1u;
// UNSUPPORTED Rust 310:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_CONTEXT_NONVOLREG_ARM64 {
//     pub Buffer: [u8; 152],
//     pub Anonymous: DISPATCHER_CONTEXT_NONVOLREG_ARM64_0,
// }

// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPATCHER_CONTEXT_NONVOLREG_ARM64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_CONTEXT_NONVOLREG_ARM64_0` (
    public var `GpNvRegs`: ULongArray,
    public var `FpNvRegs`: DoubleArray,
)
// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPATCHER_CONTEXT_NONVOLREG_ARM64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DLL_PROCESS_ATTACH`: UInt = 1u;
public const val `DLL_PROCESS_DETACH`: UInt = 0u;
public const val `DLL_THREAD_ATTACH`: UInt = 2u;
public const val `DLL_THREAD_DETACH`: UInt = 3u;
public const val `DOMAIN_ALIAS_RID_ACCESS_CONTROL_ASSISTANCE_OPS`: Int = 579;
public const val `DOMAIN_ALIAS_RID_ACCOUNT_OPS`: Int = 548;
public const val `DOMAIN_ALIAS_RID_ADMINS`: Int = 544;
public const val `DOMAIN_ALIAS_RID_AUTHORIZATIONACCESS`: Int = 560;
public const val `DOMAIN_ALIAS_RID_BACKUP_OPS`: Int = 551;
public const val `DOMAIN_ALIAS_RID_CACHEABLE_PRINCIPALS_GROUP`: Int = 571;
public const val `DOMAIN_ALIAS_RID_CERTSVC_DCOM_ACCESS_GROUP`: Int = 574;
public const val `DOMAIN_ALIAS_RID_CRYPTO_OPERATORS`: Int = 569;
public const val `DOMAIN_ALIAS_RID_DCOM_USERS`: Int = 562;
public const val `DOMAIN_ALIAS_RID_DEFAULT_ACCOUNT`: Int = 581;
public const val `DOMAIN_ALIAS_RID_DEVICE_OWNERS`: Int = 583;
public const val `DOMAIN_ALIAS_RID_EVENT_LOG_READERS_GROUP`: Int = 573;
public const val `DOMAIN_ALIAS_RID_GUESTS`: Int = 546;
public const val `DOMAIN_ALIAS_RID_HYPER_V_ADMINS`: Int = 578;
public const val `DOMAIN_ALIAS_RID_INCOMING_FOREST_TRUST_BUILDERS`: Int = 557;
public const val `DOMAIN_ALIAS_RID_IUSERS`: Int = 568;
public const val `DOMAIN_ALIAS_RID_LOGGING_USERS`: Int = 559;
public const val `DOMAIN_ALIAS_RID_MONITORING_USERS`: Int = 558;
public const val `DOMAIN_ALIAS_RID_NETWORK_CONFIGURATION_OPS`: Int = 556;
public const val `DOMAIN_ALIAS_RID_NON_CACHEABLE_PRINCIPALS_GROUP`: Int = 572;
public const val `DOMAIN_ALIAS_RID_POWER_USERS`: Int = 547;
public const val `DOMAIN_ALIAS_RID_PREW2KCOMPACCESS`: Int = 554;
public const val `DOMAIN_ALIAS_RID_PRINT_OPS`: Int = 550;
public const val `DOMAIN_ALIAS_RID_RAS_SERVERS`: Int = 553;
public const val `DOMAIN_ALIAS_RID_RDS_ENDPOINT_SERVERS`: Int = 576;
public const val `DOMAIN_ALIAS_RID_RDS_MANAGEMENT_SERVERS`: Int = 577;
public const val `DOMAIN_ALIAS_RID_RDS_REMOTE_ACCESS_SERVERS`: Int = 575;
public const val `DOMAIN_ALIAS_RID_REMOTE_DESKTOP_USERS`: Int = 555;
public const val `DOMAIN_ALIAS_RID_REMOTE_MANAGEMENT_USERS`: Int = 580;
public const val `DOMAIN_ALIAS_RID_REPLICATOR`: Int = 552;
public const val `DOMAIN_ALIAS_RID_STORAGE_REPLICA_ADMINS`: Int = 582;
public const val `DOMAIN_ALIAS_RID_SYSTEM_OPS`: Int = 549;
public const val `DOMAIN_ALIAS_RID_TS_LICENSE_SERVERS`: Int = 561;
public const val `DOMAIN_ALIAS_RID_USERS`: Int = 545;
public const val `DOMAIN_GROUP_RID_ADMINS`: Int = 512;
public const val `DOMAIN_GROUP_RID_AUTHORIZATION_DATA_CONTAINS_CLAIMS`: Int = 497;
public const val `DOMAIN_GROUP_RID_AUTHORIZATION_DATA_IS_COMPOUNDED`: Int = 496;
public const val `DOMAIN_GROUP_RID_CDC_RESERVED`: Int = 524;
public const val `DOMAIN_GROUP_RID_CERT_ADMINS`: Int = 517;
public const val `DOMAIN_GROUP_RID_CLONEABLE_CONTROLLERS`: Int = 522;
public const val `DOMAIN_GROUP_RID_COMPUTERS`: Int = 515;
public const val `DOMAIN_GROUP_RID_CONTROLLERS`: Int = 516;
public const val `DOMAIN_GROUP_RID_ENTERPRISE_ADMINS`: Int = 519;
public const val `DOMAIN_GROUP_RID_ENTERPRISE_KEY_ADMINS`: Int = 527;
public const val `DOMAIN_GROUP_RID_ENTERPRISE_READONLY_DOMAIN_CONTROLLERS`: Int = 498;
public const val `DOMAIN_GROUP_RID_GUESTS`: Int = 514;
public const val `DOMAIN_GROUP_RID_KEY_ADMINS`: Int = 526;
public const val `DOMAIN_GROUP_RID_POLICY_ADMINS`: Int = 520;
public const val `DOMAIN_GROUP_RID_PROTECTED_USERS`: Int = 525;
public const val `DOMAIN_GROUP_RID_READONLY_CONTROLLERS`: Int = 521;
public const val `DOMAIN_GROUP_RID_SCHEMA_ADMINS`: Int = 518;
public const val `DOMAIN_GROUP_RID_USERS`: Int = 513;
public const val `DOMAIN_USER_RID_ADMIN`: Int = 500;
public const val `DOMAIN_USER_RID_DEFAULT_ACCOUNT`: Int = 503;
public const val `DOMAIN_USER_RID_GUEST`: Int = 501;
public const val `DOMAIN_USER_RID_KRBTGT`: Int = 502;
public const val `DOMAIN_USER_RID_MAX`: Int = 999;
public const val `DOMAIN_USER_RID_WDAG_ACCOUNT`: Int = 504;
public const val `DYNAMIC_EH_CONTINUATION_TARGET_ADD`: UInt = 1u;
public const val `DYNAMIC_EH_CONTINUATION_TARGET_PROCESSED`: UInt = 2u;
public const val `DYNAMIC_ENFORCED_ADDRESS_RANGE_ADD`: UInt = 1u;
public const val `DYNAMIC_ENFORCED_ADDRESS_RANGE_PROCESSED`: UInt = 2u;
public const val `DemandLoad`: `SERVICE_LOAD_TYPE` = 3;
public const val `DisableLoad`: `SERVICE_LOAD_TYPE` = 4;
public const val `DriverType`: `SERVICE_NODE_TYPE` = 1;
public const val `EMARCH_ENC_I17_IC_INST_WORD_POS_X`: UInt = 12u;
public const val `EMARCH_ENC_I17_IC_INST_WORD_X`: UInt = 3u;
public const val `EMARCH_ENC_I17_IC_SIZE_X`: UInt = 1u;
public const val `EMARCH_ENC_I17_IC_VAL_POS_X`: UInt = 21u;
public const val `EMARCH_ENC_I17_IMM41a_INST_WORD_POS_X`: UInt = 14u;
public const val `EMARCH_ENC_I17_IMM41a_INST_WORD_X`: UInt = 1u;
public const val `EMARCH_ENC_I17_IMM41a_SIZE_X`: UInt = 10u;
public const val `EMARCH_ENC_I17_IMM41a_VAL_POS_X`: UInt = 22u;
public const val `EMARCH_ENC_I17_IMM41b_INST_WORD_POS_X`: UInt = 24u;
public const val `EMARCH_ENC_I17_IMM41b_INST_WORD_X`: UInt = 1u;
public const val `EMARCH_ENC_I17_IMM41b_SIZE_X`: UInt = 8u;
public const val `EMARCH_ENC_I17_IMM41b_VAL_POS_X`: UInt = 32u;
public const val `EMARCH_ENC_I17_IMM41c_INST_WORD_POS_X`: UInt = 0u;
public const val `EMARCH_ENC_I17_IMM41c_INST_WORD_X`: UInt = 2u;
public const val `EMARCH_ENC_I17_IMM41c_SIZE_X`: UInt = 23u;
public const val `EMARCH_ENC_I17_IMM41c_VAL_POS_X`: UInt = 40u;
public const val `EMARCH_ENC_I17_IMM5C_INST_WORD_POS_X`: UInt = 13u;
public const val `EMARCH_ENC_I17_IMM5C_INST_WORD_X`: UInt = 3u;
public const val `EMARCH_ENC_I17_IMM5C_SIZE_X`: UInt = 5u;
public const val `EMARCH_ENC_I17_IMM5C_VAL_POS_X`: UInt = 16u;
public const val `EMARCH_ENC_I17_IMM7B_INST_WORD_POS_X`: UInt = 4u;
public const val `EMARCH_ENC_I17_IMM7B_INST_WORD_X`: UInt = 3u;
public const val `EMARCH_ENC_I17_IMM7B_SIZE_X`: UInt = 7u;
public const val `EMARCH_ENC_I17_IMM7B_VAL_POS_X`: UInt = 0u;
public const val `EMARCH_ENC_I17_IMM9D_INST_WORD_POS_X`: UInt = 18u;
public const val `EMARCH_ENC_I17_IMM9D_INST_WORD_X`: UInt = 3u;
public const val `EMARCH_ENC_I17_IMM9D_SIZE_X`: UInt = 9u;
public const val `EMARCH_ENC_I17_IMM9D_VAL_POS_X`: UInt = 7u;
public const val `EMARCH_ENC_I17_SIGN_INST_WORD_POS_X`: UInt = 27u;
public const val `EMARCH_ENC_I17_SIGN_INST_WORD_X`: UInt = 3u;
public const val `EMARCH_ENC_I17_SIGN_SIZE_X`: UInt = 1u;
public const val `EMARCH_ENC_I17_SIGN_VAL_POS_X`: UInt = 63u;
public const val `ENCLAVE_LONG_ID_LENGTH`: UInt = 32u;
public const val `ENCLAVE_SHORT_ID_LENGTH`: UInt = 16u;
public const val `ENCLAVE_TYPE_SGX`: UInt = 1u;
public const val `ENCLAVE_TYPE_SGX2`: UInt = 2u;
public const val `ENCLAVE_TYPE_VBS`: UInt = 16u;
public const val `ENCLAVE_TYPE_VBS_BASIC`: UInt = 17u;
public const val `ENCLAVE_VBS_FLAG_DEBUG`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENLISTMENT_BASIC_INFORMATION` (
    public var `EnlistmentId`: `windows_sys`.`core`.`GUID`,
    public var `TransactionId`: `windows_sys`.`core`.`GUID`,
    public var `ResourceManagerId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENLISTMENT_CRM_INFORMATION` (
    public var `CrmTransactionManagerId`: `windows_sys`.`core`.`GUID`,
    public var `CrmResourceManagerId`: `windows_sys`.`core`.`GUID`,
    public var `CrmEnlistmentId`: `windows_sys`.`core`.`GUID`,
)
public typealias `ENLISTMENT_INFORMATION_CLASS` = Int;
public const val `ENLISTMENT_QUERY_INFORMATION`: UInt = 1u;
public const val `ENLISTMENT_RECOVER`: UInt = 4u;
public const val `ENLISTMENT_SET_INFORMATION`: UInt = 2u;
public const val `ENLISTMENT_SUBORDINATE_RIGHTS`: UInt = 8u;
public const val `ENLISTMENT_SUPERIOR_RIGHTS`: UInt = 16u;
public const val `ERROR_SEVERITY_ERROR`: UInt = 3221225472u;
public const val `ERROR_SEVERITY_INFORMATIONAL`: UInt = 1073741824u;
public const val `ERROR_SEVERITY_SUCCESS`: UInt = 0u;
public const val `ERROR_SEVERITY_WARNING`: UInt = 2147483648u;
public const val `EVENTLOG_BACKWARDS_READ`: UInt = 8u;
public const val `EVENTLOG_END_ALL_PAIRED_EVENTS`: UInt = 4u;
public const val `EVENTLOG_END_PAIRED_EVENT`: UInt = 2u;
public const val `EVENTLOG_FORWARDS_READ`: UInt = 4u;
public const val `EVENTLOG_PAIRED_EVENT_ACTIVE`: UInt = 8u;
public const val `EVENTLOG_PAIRED_EVENT_INACTIVE`: UInt = 16u;
public const val `EVENTLOG_START_PAIRED_EVENT`: UInt = 1u;
public const val `EXCEPTION_COLLIDED_UNWIND`: UInt = 64u;
public const val `EXCEPTION_EXECUTE_FAULT`: UInt = 8u;
public const val `EXCEPTION_EXIT_UNWIND`: UInt = 4u;
public const val `EXCEPTION_MAXIMUM_PARAMETERS`: UInt = 15u;
public const val `EXCEPTION_NESTED_CALL`: UInt = 16u;
public const val `EXCEPTION_NONCONTINUABLE`: UInt = 1u;
public const val `EXCEPTION_READ_FAULT`: UInt = 0u;
public const val `EXCEPTION_SOFTWARE_ORIGINATE`: UInt = 128u;
public const val `EXCEPTION_STACK_INVALID`: UInt = 8u;
public const val `EXCEPTION_TARGET_UNWIND`: UInt = 32u;
public const val `EXCEPTION_UNWINDING`: UInt = 2u;
public const val `EXCEPTION_WRITE_FAULT`: UInt = 1u;
public const val `EnlistmentBasicInformation`: `ENLISTMENT_INFORMATION_CLASS` = 0;
public const val `EnlistmentCrmInformation`: `ENLISTMENT_INFORMATION_CLASS` = 2;
public const val `EnlistmentRecoveryInformation`: `ENLISTMENT_INFORMATION_CLASS` = 1;
public const val `FAST_FAIL_ADMINLESS_ACCESS_DENIED`: UInt = 55u;
public const val `FAST_FAIL_APCS_DISABLED`: UInt = 32u;
public const val `FAST_FAIL_CAST_GUARD`: UInt = 65u;
public const val `FAST_FAIL_CERTIFICATION_FAILURE`: UInt = 20u;
public const val `FAST_FAIL_CONTROL_INVALID_RETURN_ADDRESS`: UInt = 57u;
public const val `FAST_FAIL_CORRUPT_LIST_ENTRY`: UInt = 3u;
public const val `FAST_FAIL_CRYPTO_LIBRARY`: UInt = 22u;
public const val `FAST_FAIL_DEPRECATED_SERVICE_INVOKED`: UInt = 27u;
public const val `FAST_FAIL_DLOAD_PROTECTION_FAILURE`: UInt = 25u;
public const val `FAST_FAIL_ENCLAVE_CALL_FAILURE`: UInt = 53u;
public const val `FAST_FAIL_ETW_CORRUPTION`: UInt = 61u;
public const val `FAST_FAIL_FATAL_APP_EXIT`: UInt = 7u;
public const val `FAST_FAIL_FLAGS_CORRUPTION`: UInt = 59u;
public const val `FAST_FAIL_GS_COOKIE_INIT`: UInt = 6u;
public const val `FAST_FAIL_GUARD_EXPORT_SUPPRESSION_FAILURE`: UInt = 46u;
public const val `FAST_FAIL_GUARD_ICALL_CHECK_FAILURE`: UInt = 10u;
public const val `FAST_FAIL_GUARD_ICALL_CHECK_FAILURE_XFG`: UInt = 64u;
public const val `FAST_FAIL_GUARD_ICALL_CHECK_SUPPRESSED`: UInt = 31u;
public const val `FAST_FAIL_GUARD_JUMPTABLE`: UInt = 37u;
public const val `FAST_FAIL_GUARD_SS_FAILURE`: UInt = 44u;
public const val `FAST_FAIL_GUARD_WRITE_CHECK_FAILURE`: UInt = 11u;
public const val `FAST_FAIL_HEAP_METADATA_CORRUPTION`: UInt = 50u;
public const val `FAST_FAIL_HOST_VISIBILITY_CHANGE`: UInt = 66u;
public const val `FAST_FAIL_INCORRECT_STACK`: UInt = 4u;
public const val `FAST_FAIL_INVALID_ARG`: UInt = 5u;
public const val `FAST_FAIL_INVALID_BALANCED_TREE`: UInt = 29u;
public const val `FAST_FAIL_INVALID_BUFFER_ACCESS`: UInt = 28u;
public const val `FAST_FAIL_INVALID_CALL_IN_DLL_CALLOUT`: UInt = 23u;
public const val `FAST_FAIL_INVALID_CONTROL_STACK`: UInt = 47u;
public const val `FAST_FAIL_INVALID_DISPATCH_CONTEXT`: UInt = 39u;
public const val `FAST_FAIL_INVALID_EXCEPTION_CHAIN`: UInt = 21u;
public const val `FAST_FAIL_INVALID_FAST_FAIL_CODE`: UInt = 4294967295u;
public const val `FAST_FAIL_INVALID_FIBER_SWITCH`: UInt = 12u;
public const val `FAST_FAIL_INVALID_FILE_OPERATION`: UInt = 42u;
public const val `FAST_FAIL_INVALID_FLS_DATA`: UInt = 70u;
public const val `FAST_FAIL_INVALID_IAT`: UInt = 49u;
public const val `FAST_FAIL_INVALID_IDLE_STATE`: UInt = 33u;
public const val `FAST_FAIL_INVALID_IMAGE_BASE`: UInt = 24u;
public const val `FAST_FAIL_INVALID_JUMP_BUFFER`: UInt = 18u;
public const val `FAST_FAIL_INVALID_LOCK_STATE`: UInt = 36u;
public const val `FAST_FAIL_INVALID_LONGJUMP_TARGET`: UInt = 38u;
public const val `FAST_FAIL_INVALID_NEXT_THREAD`: UInt = 30u;
public const val `FAST_FAIL_INVALID_PFN`: UInt = 63u;
public const val `FAST_FAIL_INVALID_REFERENCE_COUNT`: UInt = 14u;
public const val `FAST_FAIL_INVALID_SET_OF_CONTEXT`: UInt = 13u;
public const val `FAST_FAIL_INVALID_SYSCALL_NUMBER`: UInt = 41u;
public const val `FAST_FAIL_INVALID_THREAD`: UInt = 40u;
public const val `FAST_FAIL_KERNEL_CET_SHADOW_STACK_ASSIST`: UInt = 67u;
public const val `FAST_FAIL_LEGACY_GS_VIOLATION`: UInt = 0u;
public const val `FAST_FAIL_LOADER_CONTINUITY_FAILURE`: UInt = 45u;
public const val `FAST_FAIL_LOW_LABEL_ACCESS_DENIED`: UInt = 52u;
public const val `FAST_FAIL_LPAC_ACCESS_DENIED`: UInt = 43u;
public const val `FAST_FAIL_MRDATA_MODIFIED`: UInt = 19u;
public const val `FAST_FAIL_MRDATA_PROTECTION_FAILURE`: UInt = 34u;
public const val `FAST_FAIL_NTDLL_PATCH_FAILED`: UInt = 69u;
public const val `FAST_FAIL_PATCH_CALLBACK_FAILED`: UInt = 68u;
public const val `FAST_FAIL_PAYLOAD_RESTRICTION_VIOLATION`: UInt = 51u;
public const val `FAST_FAIL_RANGE_CHECK_FAILURE`: UInt = 8u;
public const val `FAST_FAIL_RIO_ABORT`: UInt = 62u;
public const val `FAST_FAIL_SET_CONTEXT_DENIED`: UInt = 48u;
public const val `FAST_FAIL_STACK_COOKIE_CHECK_FAILURE`: UInt = 2u;
public const val `FAST_FAIL_UNEXPECTED_CALL`: UInt = 56u;
public const val `FAST_FAIL_UNEXPECTED_HEAP_EXCEPTION`: UInt = 35u;
public const val `FAST_FAIL_UNEXPECTED_HOST_BEHAVIOR`: UInt = 58u;
public const val `FAST_FAIL_UNHANDLED_LSS_EXCEPTON`: UInt = 54u;
public const val `FAST_FAIL_UNSAFE_EXTENSION_CALL`: UInt = 26u;
public const val `FAST_FAIL_UNSAFE_REGISTRY_ACCESS`: UInt = 9u;
public const val `FAST_FAIL_VEH_CORRUPTION`: UInt = 60u;
public const val `FAST_FAIL_VTGUARD_CHECK_FAILURE`: UInt = 1u;
public const val `FILE_ATTRIBUTE_STRICTLY_SEQUENTIAL`: UInt = 536870912u;
public const val `FILE_CASE_PRESERVED_NAMES`: UInt = 2u;
public const val `FILE_CASE_SENSITIVE_SEARCH`: UInt = 1u;
public const val `FILE_CS_FLAG_CASE_SENSITIVE_DIR`: UInt = 1u;
public const val `FILE_DAX_VOLUME`: UInt = 536870912u;
public const val `FILE_FILE_COMPRESSION`: UInt = 16u;
public const val `FILE_NAMED_STREAMS`: UInt = 262144u;
public const val `FILE_NAME_FLAGS_UNSPECIFIED`: UInt = 128u;
public const val `FILE_NAME_FLAG_BOTH`: UInt = 3u;
public const val `FILE_NAME_FLAG_DOS`: UInt = 2u;
public const val `FILE_NAME_FLAG_HARDLINK`: UInt = 0u;
public const val `FILE_NAME_FLAG_NTFS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_NOTIFY_FULL_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `Action`: UInt,
    public var `CreationTime`: Long,
    public var `LastModificationTime`: Long,
    public var `LastChangeTime`: Long,
    public var `LastAccessTime`: Long,
    public var `AllocatedLength`: Long,
    public var `FileSize`: Long,
    public var `FileAttributes`: UInt,
    public var `Anonymous`: `FILE_NOTIFY_FULL_INFORMATION_0`,
    public var `FileId`: Long,
    public var `ParentFileId`: Long,
    public var `FileNameLength`: UShort,
    public var `FileNameFlags`: UByte,
    public var `Reserved`: UByte,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 587:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NOTIFY_FULL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 592:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_NOTIFY_FULL_INFORMATION_0 {
//     pub ReparsePointTag: u32,
//     pub EaSize: u32,
// }

// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NOTIFY_FULL_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PERSISTENT_ACLS`: UInt = 8u;
public const val `FILE_READ_ONLY_VOLUME`: UInt = 524288u;
public const val `FILE_RETURNS_CLEANUP_RESULT_INFO`: UInt = 512u;
public const val `FILE_SEQUENTIAL_WRITE_ONCE`: UInt = 1048576u;
public const val `FILE_SUPPORTS_BLOCK_REFCOUNTING`: UInt = 134217728u;
public const val `FILE_SUPPORTS_BYPASS_IO`: UInt = 2048u;
public const val `FILE_SUPPORTS_CASE_SENSITIVE_DIRS`: UInt = 8192u;
public const val `FILE_SUPPORTS_ENCRYPTION`: UInt = 131072u;
public const val `FILE_SUPPORTS_EXTENDED_ATTRIBUTES`: UInt = 8388608u;
public const val `FILE_SUPPORTS_GHOSTING`: UInt = 1073741824u;
public const val `FILE_SUPPORTS_HARD_LINKS`: UInt = 4194304u;
public const val `FILE_SUPPORTS_INTEGRITY_STREAMS`: UInt = 67108864u;
public const val `FILE_SUPPORTS_OBJECT_IDS`: UInt = 65536u;
public const val `FILE_SUPPORTS_OPEN_BY_FILE_ID`: UInt = 16777216u;
public const val `FILE_SUPPORTS_POSIX_UNLINK_RENAME`: UInt = 1024u;
public const val `FILE_SUPPORTS_REMOTE_STORAGE`: UInt = 256u;
public const val `FILE_SUPPORTS_REPARSE_POINTS`: UInt = 128u;
public const val `FILE_SUPPORTS_SPARSE_FILES`: UInt = 64u;
public const val `FILE_SUPPORTS_SPARSE_VDL`: UInt = 268435456u;
public const val `FILE_SUPPORTS_STREAM_SNAPSHOTS`: UInt = 4096u;
public const val `FILE_SUPPORTS_TRANSACTIONS`: UInt = 2097152u;
public const val `FILE_SUPPORTS_USN_JOURNAL`: UInt = 33554432u;
public const val `FILE_UNICODE_ON_DISK`: UInt = 4u;
public const val `FILE_VOLUME_IS_COMPRESSED`: UInt = 32768u;
public const val `FILE_VOLUME_QUOTAS`: UInt = 32u;
public const val `FILL_NV_MEMORY_FLAG_FLUSH`: UInt = 1u;
public const val `FILL_NV_MEMORY_FLAG_NON_TEMPORAL`: UInt = 2u;
public const val `FILL_NV_MEMORY_FLAG_NO_DRAIN`: UInt = 256u;
public const val `FLS_MAXIMUM_AVAILABLE`: UInt = 4080u;
public const val `FLUSH_FLAGS_FILE_DATA_ONLY`: UInt = 1u;
public const val `FLUSH_FLAGS_FILE_DATA_SYNC_ONLY`: UInt = 4u;
public const val `FLUSH_FLAGS_NO_SYNC`: UInt = 2u;
public const val `FLUSH_NV_MEMORY_IN_FLAG_NO_DRAIN`: UInt = 1u;
public const val `FOREST_USER_RID_MAX`: Int = 499;
public const val `FRAME_FPO`: UInt = 0u;
public const val `FRAME_NONFPO`: UInt = 3u;
public const val `FRAME_TRAP`: UInt = 1u;
public const val `FRAME_TSS`: UInt = 2u;
public const val `FileInformationInAssemblyOfAssemblyInActivationContext`: `ACTIVATION_CONTEXT_INFO_CLASS` = 4;
public const val `FileInformationInAssemblyOfAssemblyInActivationContxt`: `ACTIVATION_CONTEXT_INFO_CLASS` = 4;
public const val `FileSystemType`: `SERVICE_NODE_TYPE` = 2;
public const val `GC_ALLGESTURES`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_PAN`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_PAN_WITH_GUTTER`: `GESTURECONFIG_FLAGS` = 8u;
public const val `GC_PAN_WITH_INERTIA`: `GESTURECONFIG_FLAGS` = 16u;
public const val `GC_PAN_WITH_SINGLE_FINGER_HORIZONTALLY`: `GESTURECONFIG_FLAGS` = 4u;
public const val `GC_PAN_WITH_SINGLE_FINGER_VERTICALLY`: `GESTURECONFIG_FLAGS` = 2u;
public const val `GC_PRESSANDTAP`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_ROLLOVER`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_ROTATE`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_TWOFINGERTAP`: `GESTURECONFIG_FLAGS` = 1u;
public const val `GC_ZOOM`: `GESTURECONFIG_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GDI_NONREMOTE` (
    public var `fContext`: Int,
    public var `u`: `GDI_NONREMOTE_0`,
)
// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for GDI_NONREMOTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 668:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union GDI_NONREMOTE_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut super::Com::DWORD_BLOB,
// }

// UNSUPPORTED Rust 675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for GDI_NONREMOTE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `GESTURECONFIG_FLAGS` = UInt;
// UNSUPPORTED Rust 682:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ACDC_POWER_SOURCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d3e9a59_e9d5_4b00_a6bd_ff34ff516548);

// UNSUPPORTED Rust 683:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ACTIVE_POWERSCHEME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31f9f286_5084_42fe_b720_2b0264993763);

// UNSUPPORTED Rust 684:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ADAPTIVE_INPUT_CONTROLLER_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e98fae9_f45a_4de1_a757_6031f197f6ea);

// UNSUPPORTED Rust 685:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ADAPTIVE_POWER_BEHAVIOR_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8619b916_e004_4dd8_9b66_dae86f806698);

// UNSUPPORTED Rust 686:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ADVANCED_COLOR_QUALITY_BIAS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x684c3e69_a4f7_4014_8754_d45179a56167);

// UNSUPPORTED Rust 687:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ALLOW_AWAYMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25dfa149_5dd1_4736_b5ab_e8a37b5b8187);

// UNSUPPORTED Rust 688:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ALLOW_DISPLAY_REQUIRED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9ceb8da_cd46_44fb_a98b_02af69de4623);

// UNSUPPORTED Rust 689:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ALLOW_RTC_WAKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd3b718a_0680_4d9d_8ab2_e1d2b4ac806d);

// UNSUPPORTED Rust 690:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ALLOW_STANDBY_STATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabfc2519_3608_4c2a_94ea_171b0ed546ab);

// UNSUPPORTED Rust 691:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ALLOW_SYSTEM_REQUIRED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa4b195f5_8225_47d8_8012_9d41369786e2);

// UNSUPPORTED Rust 692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_APPLAUNCH_BUTTON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a689231_7399_4e9a_8f99_b71f999db3fa);

// UNSUPPORTED Rust 693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BACKGROUND_TASK_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf23f240_2a54_48d8_b114_de1518ff052e);

// UNSUPPORTED Rust 694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_COUNT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d263f15_fca4_49e5_854b_a9f2bfbd5c24);

// UNSUPPORTED Rust 695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_ACTION_0: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x637ea02f_bbcb_4015_8e2c_a1c7b9c0b546);

// UNSUPPORTED Rust 696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_ACTION_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8742dcb_3e6a_4b3c_b3fe_374623cdcf06);

// UNSUPPORTED Rust 697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_ACTION_2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x421cba38_1a8e_4881_ac89_e33a8b04ece4);

// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_ACTION_3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x80472613_9780_455e_b308_72d3003cf2f8);

// UNSUPPORTED Rust 699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_FLAGS_0: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5dbb7c9f_38e9_40d2_9749_4f8a0e9f640f);

// UNSUPPORTED Rust 700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_FLAGS_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbcded951_187b_4d05_bccc_f7e51960c258);

// UNSUPPORTED Rust 701:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_FLAGS_2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fd2f0c4_feb7_4da3_8117_e3fbedc46582);

// UNSUPPORTED Rust 702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_FLAGS_3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73613ccf_dbfa_4279_8356_4935f6bf62f3);

// UNSUPPORTED Rust 703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_LEVEL_0: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a66d8d7_4ff7_4ef9_b5a2_5a326ca2a469);

// UNSUPPORTED Rust 704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_LEVEL_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8183ba9a_e910_48da_8769_14ae6dc1170a);

// UNSUPPORTED Rust 705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_LEVEL_2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07a07ca2_adaf_40d7_b077_533aaded1bfa);

// UNSUPPORTED Rust 706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_DISCHARGE_LEVEL_3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x58afd5a6_c2dd_47d2_9fbf_ef70cc5c5965);

// UNSUPPORTED Rust 707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_PERCENTAGE_REMAINING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7ad8041_b45a_4cae_87a3_eecbb468a9e1);

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_BATTERY_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe73a048d_bf27_4f12_9731_8b2076e8891f);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_CONNECTIVITY_IN_STANDBY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf15576e8_98b7_4186_b944_eafa664402d9);

// UNSUPPORTED Rust 710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_CONSOLE_DISPLAY_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6fe69556_704a_47a0_8f24_c28d936fda47);

// UNSUPPORTED Rust 711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_CRITICAL_POWER_TRANSITION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7a27025_e569_46c2_a504_2b96cad225a1);

// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEEP_SLEEP_ENABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd502f7ee_1dc7_4efd_a55d_f04b6f5c0545);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEEP_SLEEP_PLATFORM_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd23f2fb8_9536_4038_9c94_1ce02e5c2152);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVICE_IDLE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4faab71a_92e5_4726_b531_224559672d19);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaded5e82_b909_4619_9949_f5d71dac0bcb);

// UNSUPPORTED Rust 716:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1fbfde2_a960_4165_9f88_50667911ce96);

// UNSUPPORTED Rust 717:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISCONNECTED_STANDBY_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68afb2d9_ee95_47a8_8f50_4115088073b1);

// UNSUPPORTED Rust 718:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_ADAPTIVE_POWERDOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x396a32e1_499a_40b2_9124_a96afe707667);

// UNSUPPORTED Rust 719:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_BURST_IGNORE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x80e3c60e_bb94_4ad8_bbe0_0d3195efc663);

// UNSUPPORTED Rust 720:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_COALESCING_POWERDOWN_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc36f0eb4_2988_4a70_8eee_0884fc2c2433);

// UNSUPPORTED Rust 721:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_IDLE_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x58e39ba8_b8e6_4ef6_90d0_89ae32b258d6);

// UNSUPPORTED Rust 722:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_MAX_POWER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x51dea550_bb38_4bc4_991b_eacf37be5ec8);

// UNSUPPORTED Rust 723:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_NVME_NOPPME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc7372b6_ab2d_43ee_8797_15e9841f2cca);

// UNSUPPORTED Rust 724:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_POWERDOWN_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6738e2c4_e8a5_4a42_b16a_e040e769756e);

// UNSUPPORTED Rust 725:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISK_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0012ee47_9041_4b5d_9b77_535fba8b1442);

// UNSUPPORTED Rust 726:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ENABLE_SWITCH_FORCED_SHUTDOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x833a6b62_dfa4_46d1_82f8_e09e34d029d6);

// UNSUPPORTED Rust 727:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ENERGY_SAVER_BATTERY_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe69653ca_cf7f_4f05_aa73_cb833fa90ad4);

// UNSUPPORTED Rust 728:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ENERGY_SAVER_BRIGHTNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13d09884_f74e_474a_a852_b6bde8ad03a8);

// UNSUPPORTED Rust 729:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ENERGY_SAVER_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c5bb349_ad29_4ee2_9d0b_2b25270f7a81);

// UNSUPPORTED Rust 730:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ENERGY_SAVER_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde830923_a562_41af_a086_e3a2c6bad2da);

// UNSUPPORTED Rust 731:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3166bc41_7e98_4e03_b34e_ec0f5f2b218e);

// UNSUPPORTED Rust 732:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_GLOBAL_USER_PRESENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x786e8a1d_b427_4344_9207_09e70bdcbea9);

// UNSUPPORTED Rust 733:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_GPU_PREFERENCE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd848b2a_8a5d_4451_9ae2_39cd41658f6c);

// UNSUPPORTED Rust 734:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_GRAPHICS_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fb4938d_1ee8_4b0f_9a3c_5036b0ab995c);

// UNSUPPORTED Rust 735:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HIBERNATE_FASTS4_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94ac6d29_73ce_41a6_809f_6363ba21b47e);

// UNSUPPORTED Rust 736:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HIBERNATE_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d7815a6_7ee4_497e_8888_515a05f02364);

// UNSUPPORTED Rust 737:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HUPR_ADAPTIVE_AWAY_DIM_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa79c8e0e_f271_482d_8f8a_5db9a18312de);

// UNSUPPORTED Rust 738:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HUPR_ADAPTIVE_AWAY_DISPLAY_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a7d6ab6_ac83_4ad1_8282_eca5b58308f3);

// UNSUPPORTED Rust 739:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HUPR_ADAPTIVE_INATTENTIVE_DIM_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf8c6097_12b8_4279_bbdd_44601ee5209d);

// UNSUPPORTED Rust 740:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HUPR_ADAPTIVE_INATTENTIVE_DISPLAY_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xee16691e_6ab3_4619_bb48_1c77c9357e5a);

// UNSUPPORTED Rust 741:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IDLE_BACKGROUND_TASK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x515c31d8_f734_163d_a0fd_11a08c91e8f1);

// UNSUPPORTED Rust 742:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IDLE_RESILIENCY_PERIOD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc42b79aa_aa3a_484b_a98f_2cf32aa90a28);

// UNSUPPORTED Rust 743:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IDLE_RESILIENCY_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2e601130_5351_4d9d_8e04_252966bad054);

// UNSUPPORTED Rust 744:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_INTSTEER_LOAD_PER_PROC_TRIGGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73cde64d_d720_4bb2_a860_c755afe77ef2);

// UNSUPPORTED Rust 745:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_INTSTEER_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2bfc24f9_5ea2_4801_8213_3dbae01aa39d);

// UNSUPPORTED Rust 746:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_INTSTEER_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48672f38_7a9a_4bb2_8bf8_3d85be19de4e);

// UNSUPPORTED Rust 747:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_INTSTEER_TIME_UNPARK_TRIGGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6ba4903_386f_4c2c_8adb_5c21b3328d25);

// UNSUPPORTED Rust 748:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LEGACY_RTC_MITIGATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a34bdc3_7e6b_442e_a9d0_64b6ef378e84);

// UNSUPPORTED Rust 749:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LIDCLOSE_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ca83367_6e45_459f_a27b_476b1d01c936);

// UNSUPPORTED Rust 750:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LIDOPEN_POWERSTATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x99ff10e7_23b1_4c07_a9d1_5c3206d741b4);

// UNSUPPORTED Rust 751:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LIDSWITCH_STATE_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba3e0f4d_b817_4094_a2d1_d56379e6a0f3);

// UNSUPPORTED Rust 752:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LIDSWITCH_STATE_RELIABILITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae4c4ff1_d361_43f4_80aa_bbb6eb03de94);

// UNSUPPORTED Rust 753:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_LOCK_CONSOLE_ON_WAKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e796bdb_100d_47d6_a2d5_f7d2daa51f51);

// UNSUPPORTED Rust 754:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MAX_POWER_SAVINGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1841308_3541_4fab_bc81_f71556f20b4a);

// UNSUPPORTED Rust 755:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MIN_POWER_SAVINGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c5e7fda_e8bf_4a96_9a85_a6e23a8c635c);

// UNSUPPORTED Rust 756:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MIXED_REALITY_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1e626b4e_cf04_4f8d_9cc7_c97c5b0f2391);

// UNSUPPORTED Rust 757:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MONITOR_POWER_ON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x02731015_4510_4526_99e6_e5a17ebd1aea);

// UNSUPPORTED Rust 758:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_NON_ADAPTIVE_INPUT_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5adbbfbc_074e_4da1_ba38_db8b36b2c8f3);

// UNSUPPORTED Rust 759:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PCIEXPRESS_ASPM_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xee12f906_d277_404b_b6da_e5fa1a576df5);

// UNSUPPORTED Rust 760:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PCIEXPRESS_SETTINGS_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x501a4d13_42af_4429_9fd1_a8218c268e20);

// UNSUPPORTED Rust 761:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_POWERBUTTON_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7648efa3_dd9c_4e3e_b566_50f929386280);

// UNSUPPORTED Rust 762:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_POWERSCHEME_PERSONALITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x245d8541_3943_4422_b025_13a784f679b7);

// UNSUPPORTED Rust 763:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_POWER_SAVING_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe00958c0_c213_4ace_ac77_fecced2eeea5);

// UNSUPPORTED Rust 764:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_ALLOW_THROTTLING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b04d4fd_1cc7_4f23_ab1c_d1337819c4bb);

// UNSUPPORTED Rust 765:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CLASS0_FLOOR_PERF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfddc842b_8364_4edc_94cf_c17f60de1c80);

// UNSUPPORTED Rust 766:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CLASS1_INITIAL_PERF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1facfc65_a930_4bc5_9f38_504ec097bbc0);

// UNSUPPORTED Rust 767:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_COMPLEX_PARKING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb669a5e9_7b1d_4132_baaa_49190abcfeb6);

// UNSUPPORTED Rust 768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f7b45e3_c393_480a_878c_f67ac3d07082);

// UNSUPPORTED Rust 769:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b33697b_e89d_4d38_aa46_9e7dfb7cd2f9);

// UNSUPPORTED Rust 770:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe70867f1_fa2f_4f4e_aea1_4d8a0ba23b20);

// UNSUPPORTED Rust 771:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71021b41_c749_4d21_be74_a00f335d582b);

// UNSUPPORTED Rust 772:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68dd2f27_a4ce_4e11_8487_3794e4135dfa);

// UNSUPPORTED Rust 773:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_DECREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdfd10d17_d5eb_45dd_877a_9a34ddd15c82);

// UNSUPPORTED Rust 774:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7be0679_2817_4d69_9d02_519a537ed0c6);

// UNSUPPORTED Rust 775:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf142941_20f3_4edf_9a4a_9c83d3d717d1);

// UNSUPPORTED Rust 776:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_INCREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ddd5a84_5a71_437e_912a_db0b8c788732);

// UNSUPPORTED Rust 777:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_MAX_CORES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea062031_0e34_4ff1_9b6d_eb1059334028);

// UNSUPPORTED Rust 778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_MAX_CORES_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea062031_0e34_4ff1_9b6d_eb1059334029);

// UNSUPPORTED Rust 779:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_MIN_CORES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cc5b647_c1df_4637_891a_dec35c318583);

// UNSUPPORTED Rust 780:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_MIN_CORES_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cc5b647_c1df_4637_891a_dec35c318584);

// UNSUPPORTED Rust 781:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1299023c_bc28_4f0a_81ec_d3295a8d815d);

// UNSUPPORTED Rust 782:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ac18e92_aa3c_4e27_b307_01ae37307129);

// UNSUPPORTED Rust 783:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x943c8cb6_6f93_4227_ad87_e9a3feec08d1);

// UNSUPPORTED Rust 784:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8809c2d8_b155_42d4_bcda_0d345651b1db);

// UNSUPPORTED Rust 785:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_DISTRIBUTE_UTILITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0007330_f589_42ed_a401_5ddb10e785d3);

// UNSUPPORTED Rust 786:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_DUTY_CYCLING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e4450b3_6179_4e91_b8f1_5bb9938f81a1);

// UNSUPPORTED Rust 787:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_FREQUENCY_LIMIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75b0ae3f_bce0_45a7_8c89_c9611c25e100);

// UNSUPPORTED Rust 788:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_FREQUENCY_LIMIT_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75b0ae3f_bce0_45a7_8c89_c9611c25e101);

// UNSUPPORTED Rust 789:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETEROGENEOUS_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f2f5cfa_f10c_4823_b5e1_e93ae85f46b5);

// UNSUPPORTED Rust 790:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8861c27_95e7_475c_865b_13c0cb3f9d6b);

// UNSUPPORTED Rust 791:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8861c27_95e7_475c_865b_13c0cb3f9d6c);

// UNSUPPORTED Rust 792:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_DECREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f2492b6_60b1_45e5_ae55_773f8cd5caec);

// UNSUPPORTED Rust 793:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_INCREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb000397d_9b0b_483d_98c9_692a6060cfbf);

// UNSUPPORTED Rust 794:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_INCREASE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb000397d_9b0b_483d_98c9_692a6060cfc0);

// UNSUPPORTED Rust 795:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_HETERO_INCREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4009efa7_e72d_4cba_9edf_91084ea8cbc3);

// UNSUPPORTED Rust 796:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLESTATE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68f262a7_f621_4069_b9a5_4874169be23c);

// UNSUPPORTED Rust 797:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_ALLOW_SCALING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c2993b0_8f48_481f_bcc6_00dd2742aa06);

// UNSUPPORTED Rust 798:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b92d758_5a24_4851_a470_815d78aee119);

// UNSUPPORTED Rust 799:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_DISABLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d76a2ca_e8c0_402f_a133_2158492d58ad);

// UNSUPPORTED Rust 800:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b224883_b3cc_4d79_819f_8374152cbe7c);

// UNSUPPORTED Rust 801:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_STATE_MAXIMUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9943e905_9a30_4ec1_9b99_44dd3b76f7a2);

// UNSUPPORTED Rust 802:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_IDLE_TIME_CHECK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4581c31_89ab_4597_8e2b_9c9cab440e6b);

// UNSUPPORTED Rust 803:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x616cdaa5_695e_4545_97ad_97dc2d1bdd88);

// UNSUPPORTED Rust 804:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x616cdaa5_695e_4545_97ad_97dc2d1bdd89);

// UNSUPPORTED Rust 805:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_LONG_THREAD_ARCH_CLASS_LOWER_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43f278bc_0f8a_46d0_8b31_9a23e615d713);

// UNSUPPORTED Rust 806:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_LONG_THREAD_ARCH_CLASS_UPPER_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf903d33_9d24_49d3_a468_e65e0325046a);

// UNSUPPORTED Rust 807:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_MODULE_PARKING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb0deaf6b_59c0_4523_8a45_ca7f40244114);

// UNSUPPORTED Rust 808:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_CONCURRENCY_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2430ab6f_a520_44a2_9601_f7f23b5134b1);

// UNSUPPORTED Rust 809:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_CORE_OVERRIDE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa55612aa_f624_42c6_a443_7397d064c04f);

// UNSUPPORTED Rust 810:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_DISTRIBUTION_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4bdaf4e9_d103_46d7_a5f0_6280121616ef);

// UNSUPPORTED Rust 811:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_HEADROOM_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf735a673_2066_4f80_a0c5_ddee0cf1bf5d);

// UNSUPPORTED Rust 812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_PERF_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447235c7_6a8d_4cc0_8e24_9eaf70b96e2b);

// UNSUPPORTED Rust 813:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PARKING_PERF_STATE_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447235c7_6a8d_4cc0_8e24_9eaf70b96e2c);

// UNSUPPORTED Rust 814:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERFSTATE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbbdc3814_18e9_4463_8a55_d197327c45c0);

// UNSUPPORTED Rust 815:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcfeda3d0_7697_4566_a922_a9086cd49dfa);

// UNSUPPORTED Rust 816:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_AUTONOMOUS_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8baa4a8a_14c6_4451_8e8b_14bdbd197537);

// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_BOOST_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe337238_0d82_4146_a960_4f3749d470c7);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_BOOST_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45bcc044_d885_43e2_8605_ee0ec6e96b59);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_CORE_PARKING_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77d7f282_8f1a_42cd_8537_45450a839be8);

// UNSUPPORTED Rust 820:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0300f6f8_abd6_45a9_b74f_4908691a40b5);

// UNSUPPORTED Rust 821:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40fbefc7_2e9d_4d25_a185_0cfd8574bac6);

// UNSUPPORTED Rust 822:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_POLICY_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40fbefc7_2e9d_4d25_a185_0cfd8574bac7);

// UNSUPPORTED Rust 823:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x12a0ab44_fe28_4fa9_b3bd_4b64f44960a6);

// UNSUPPORTED Rust 824:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x12a0ab44_fe28_4fa9_b3bd_4b64f44960a7);

// UNSUPPORTED Rust 825:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8edeb9b_95cf_4f95_a73c_b061973693c8);

// UNSUPPORTED Rust 826:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_DECREASE_TIME_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8edeb9b_95cf_4f95_a73c_b061973693c9);

// UNSUPPORTED Rust 827:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_ENERGY_PERFORMANCE_PREFERENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36687f9e_e3a5_4dbf_b1dc_15eb381c6863);

// UNSUPPORTED Rust 828:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_ENERGY_PERFORMANCE_PREFERENCE_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36687f9e_e3a5_4dbf_b1dc_15eb381c6864);

// UNSUPPORTED Rust 829:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d24baa7_0b84_480f_840c_1b0743c00f5f);

// UNSUPPORTED Rust 830:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_HISTORY_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d24baa7_0b84_480f_840c_1b0743c00f60);

// UNSUPPORTED Rust 831:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x99b3ef01_752f_46a1_80fb_7730011f2354);

// UNSUPPORTED Rust 832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x465e1f50_b610_473a_ab58_00d1077dc418);

// UNSUPPORTED Rust 833:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_POLICY_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x465e1f50_b610_473a_ab58_00d1077dc419);

// UNSUPPORTED Rust 834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06cadf0e_64ed_448a_8927_ce7bf90eb35d);

// UNSUPPORTED Rust 835:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06cadf0e_64ed_448a_8927_ce7bf90eb35e);

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x984cf492_3bed_4488_a8f9_4286c97bf5aa);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_INCREASE_TIME_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x984cf492_3bed_4488_a8f9_4286c97bf5ab);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_LATENCY_HINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0822df31_9c83_441c_a079_0de4cf009c7b);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_LATENCY_HINT_PERF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x619b7505_003b_4e82_b7a6_4dd29c300971);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_LATENCY_HINT_PERF_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x619b7505_003b_4e82_b7a6_4dd29c300972);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_PERF_TIME_CHECK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d2b0152_7d5c_498b_88e2_34345392a2c5);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_DISABLE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38b8383d_cce0_4c79_9e3e_56a4f17cc480);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_DISABLE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38b8383d_cce0_4c79_9e3e_56a4f17cc481);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf565999f_3fb0_411a_a226_3f0198dec130);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf565999f_3fb0_411a_a226_3f0198dec131);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d44e256_7222_4415_a9ed_9c45fa3dd830);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d44e256_7222_4415_a9ed_9c45fa3dd831);

// UNSUPPORTED Rust 848:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d915188_7830_49ae_a79a_0fb0a1e5a200);

// UNSUPPORTED Rust 849:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d915188_7830_49ae_a79a_0fb0a1e5a201);

// UNSUPPORTED Rust 850:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4427c73b_9756_4a5c_b84b_c7bda79c7320);

// UNSUPPORTED Rust 851:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4427c73b_9756_4a5c_b84b_c7bda79c7321);

// UNSUPPORTED Rust 852:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_PERF_FLOOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce8e92ee_6a86_4572_bfe0_20c21d03cd40);

// UNSUPPORTED Rust 853:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_RESPONSIVENESS_PERF_FLOOR_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce8e92ee_6a86_4572_bfe0_20c21d03cd41);

// UNSUPPORTED Rust 854:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SETTINGS_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54533251_82be_4824_96c1_47b60b740d00);

// UNSUPPORTED Rust 855:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SHORT_THREAD_ARCH_CLASS_LOWER_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53824d46_87bd_4739_aa1b_aa793fac36d6);

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SHORT_THREAD_ARCH_CLASS_UPPER_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x828423eb_8662_4344_90f7_52bf15870f5a);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SHORT_THREAD_RUNTIME_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd92998c2_6a48_49ca_85d4_8cceec294570);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SHORT_THREAD_SCHEDULING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbae08b81_2d5e_4688_ad6a_13243356654b);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SMT_UNPARKING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb28a6829_c5f7_444e_8f61_10e24e85c532);

// UNSUPPORTED Rust 860:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_SOFT_PARKING_LATENCY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97cfac41_2217_47eb_992d_618b1977c907);

// UNSUPPORTED Rust 861:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THREAD_SCHEDULING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x93b8b6dc_0698_4d1c_9ee4_0644e900c85d);

// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THROTTLE_MAXIMUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc5038f7_23e0_4960_96da_33abaf5935ec);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THROTTLE_MAXIMUM_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc5038f7_23e0_4960_96da_33abaf5935ed);

// UNSUPPORTED Rust 864:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THROTTLE_MINIMUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x893dee8e_2bef_41e0_89c6_b55d0929964c);

// UNSUPPORTED Rust 865:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THROTTLE_MINIMUM_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x893dee8e_2bef_41e0_89c6_b55d0929964d);

// UNSUPPORTED Rust 866:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_PROCESSOR_THROTTLE_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57027304_4af6_4104_9260_e3d95248fc36);

// UNSUPPORTED Rust 867:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SESSION_DISPLAY_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b84c20e_ad23_4ddf_93db_05ffbd7efca5);

// UNSUPPORTED Rust 868:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SESSION_USER_PRESENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c0f4548_c03f_4c4d_b9f2_237ede686376);

// UNSUPPORTED Rust 869:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SLEEPBUTTON_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x96996bc0_ad50_47ec_923b_6f41874dd9eb);

// UNSUPPORTED Rust 870:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SLEEP_IDLE_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81cd32e0_7833_44f3_8737_7081f38d1f70);

// UNSUPPORTED Rust 871:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SLEEP_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x238c9fa8_0aad_41ed_83f4_97be242c8f20);

// UNSUPPORTED Rust 872:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SPR_ACTIVE_SESSION_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e24ce38_c393_4742_bdb1_744f4b9ee08e);

// UNSUPPORTED Rust 873:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_BUDGET_GRACE_PERIOD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60c07fe1_0556_45cf_9903_d56e32210242);

// UNSUPPORTED Rust 874:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_BUDGET_PERCENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9fe527be_1b70_48da_930d_7bcf17b44990);

// UNSUPPORTED Rust 875:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_RESERVE_GRACE_PERIOD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc763ee92_71e8_4127_84eb_f6ed043a3e3d);

// UNSUPPORTED Rust 876:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_RESERVE_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x468fe7e5_1158_46ec_88bc_5b96c9e44fd0);

// UNSUPPORTED Rust 877:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_RESET_PERCENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49cb11a5_56e2_4afb_9d38_3df47872e21b);

// UNSUPPORTED Rust 878:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_STANDBY_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x29f6c1db_86da_48c5_9fdb_f2b67b1f44da);

// UNSUPPORTED Rust 879:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SYSTEM_AWAYMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98a7f580_01f7_48aa_9c0f_44352c29e5c0);

// UNSUPPORTED Rust 880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SYSTEM_BUTTON_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f971e89_eebd_4455_a8de_9e59040e7347);

// UNSUPPORTED Rust 881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SYSTEM_COOLING_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94d3a615_a899_4ac5_ae2b_e4d8f634367f);

// UNSUPPORTED Rust 882:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_TYPICAL_POWER_SAVINGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x381b4222_f694_41f0_9685_ff5bb260df2e);

// UNSUPPORTED Rust 883:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_UNATTEND_SLEEP_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bc4a2f9_d8fc_4469_b07b_33eb785aaca0);

// UNSUPPORTED Rust 884:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_USERINTERFACEBUTTON_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7066653_8d6c_40a8_910e_a1f54b84c7e5);

// UNSUPPORTED Rust 885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_USER_PRESENCE_PREDICTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82011705_fb95_4d46_8d35_4042b1d20def);

// UNSUPPORTED Rust 886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbd9aa66_9553_4097_ba44_ed6e9d65eab8);

// UNSUPPORTED Rust 887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeed904df_b142_4183_b10b_5a1197a37864);

// UNSUPPORTED Rust 888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_ADAPTIVE_POWERDOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90959d22_d6a1_49b9_af93_bce885ad335b);

// UNSUPPORTED Rust 889:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_ANNOYANCE_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82dbcf2d_cd67_40c5_bfdc_9f1a5ccd4663);

// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_CONSOLE_LOCK_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ec4b3a5_6868_48c2_be75_4f3044be88a7);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ffee2c6_2d01_46be_adb9_398addc5b4ff);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_DIM_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17aaa29b_8b43_4b94_aafe_35f64daaf1ee);

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_POWERDOWN_TIMEOUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c0bc021_c8a8_4e07_a973_6b14cbcb2b7e);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_VIDEO_SUBGROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7516b95f_f776_4464_8c53_06167f40cc99);

public const val `HEAP_OPTIMIZE_RESOURCES_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HEAP_OPTIMIZE_RESOURCES_INFORMATION` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIBERFILE_BUCKET` (
    public var `MaxPhysicalMemory`: ULong,
    public var `PhysicalMemoryPercent`: UIntArray,
)
// UNSUPPORTED Rust 908:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIBERFILE_BUCKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HIBERFILE_BUCKET_SIZE` = Int;
public const val `HIBERFILE_TYPE_FULL`: UInt = 2u;
public const val `HIBERFILE_TYPE_MAX`: UInt = 3u;
public const val `HIBERFILE_TYPE_NONE`: UInt = 0u;
public const val `HIBERFILE_TYPE_REDUCED`: UInt = 1u;
public const val `HiberFileBucket16GB`: `HIBERFILE_BUCKET_SIZE` = 4;
public const val `HiberFileBucket1GB`: `HIBERFILE_BUCKET_SIZE` = 0;
public const val `HiberFileBucket2GB`: `HIBERFILE_BUCKET_SIZE` = 1;
public const val `HiberFileBucket32GB`: `HIBERFILE_BUCKET_SIZE` = 5;
public const val `HiberFileBucket4GB`: `HIBERFILE_BUCKET_SIZE` = 2;
public const val `HiberFileBucket8GB`: `HIBERFILE_BUCKET_SIZE` = 3;
public const val `HiberFileBucketMax`: `HIBERFILE_BUCKET_SIZE` = 7;
public const val `HiberFileBucketUnlimited`: `HIBERFILE_BUCKET_SIZE` = 6;
public const val `IGP_CONVERSION`: `IGP_ID` = 8u;
public const val `IGP_GETIMEVERSION`: `IGP_ID` = 4294967292u;
public typealias `IGP_ID` = UInt;
public const val `IGP_PROPERTY`: `IGP_ID` = 4u;
public const val `IGP_SELECT`: `IGP_ID` = 24u;
public const val `IGP_SENTENCE`: `IGP_ID` = 12u;
public const val `IGP_SETCOMPSTR`: `IGP_ID` = 20u;
public const val `IGP_UI`: `IGP_ID` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY` (
    public var `BeginAddress`: ULong,
    public var `EndAddress`: ULong,
    public var `ExceptionHandler`: ULong,
    public var `HandlerData`: ULong,
    public var `PrologEndAddress`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ALPHA_RUNTIME_FUNCTION_ENTRY` (
    public var `BeginAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `ExceptionHandler`: UInt,
    public var `HandlerData`: UInt,
    public var `PrologEndAddress`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ARCHITECTURE_ENTRY` (
    public var `FixupInstRVA`: UInt,
    public var `NewInst`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ARCHITECTURE_HEADER` (
    public var `_bitfield`: UInt,
    public var `FirstEntryRVA`: UInt,
)
// UNSUPPORTED Rust 964:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_END: windows_sys::core::PCSTR = windows_sys::core::s!("`\n");

// UNSUPPORTED Rust 965:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_HYBRIDMAP_MEMBER: windows_sys::core::PCSTR = windows_sys::core::s!("/<HYBRIDMAP>/   ");

// UNSUPPORTED Rust 966:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_LINKER_MEMBER: windows_sys::core::PCSTR = windows_sys::core::s!("/               ");

// UNSUPPORTED Rust 967:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_LONGNAMES_MEMBER: windows_sys::core::PCSTR = windows_sys::core::s!("//              ");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_ARCHIVE_MEMBER_HEADER` (
    public var `Name`: UByteArray,
    public var `Date`: UByteArray,
    public var `UserID`: UByteArray,
    public var `GroupID`: UByteArray,
    public var `Mode`: UByteArray,
    public var `Size`: UByteArray,
    public var `EndHeader`: UByteArray,
)
// UNSUPPORTED Rust 979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARCHIVE_MEMBER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 984:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_PAD: windows_sys::core::PCSTR = windows_sys::core::s!("\n");

// UNSUPPORTED Rust 985:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_ARCHIVE_START: windows_sys::core::PCSTR = windows_sys::core::s!("!<arch>\n");

public const val `IMAGE_ARCHIVE_START_SIZE`: UInt = 8u;
// UNSUPPORTED Rust 987:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA {
//     pub HeaderData: u32,
//     pub Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA_0,
// }

// UNSUPPORTED Rust 993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_ARM_RUNTIME_FUNCTION_ENTRY` (
    public var `BeginAddress`: UInt,
    public var `Anonymous`: `IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0`,
)
// UNSUPPORTED Rust 1009:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARM_RUNTIME_FUNCTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1014:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0 {
//     pub UnwindData: u32,
//     pub Anonymous: IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0_0,
// }

// UNSUPPORTED Rust 1020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1030:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_AUX_SYMBOL {
//     pub Sym: IMAGE_AUX_SYMBOL_0,
//     pub File: IMAGE_AUX_SYMBOL_1,
//     pub Section: IMAGE_AUX_SYMBOL_2,
//     pub TokenDef: IMAGE_AUX_SYMBOL_TOKEN_DEF,
//     pub CRC: IMAGE_AUX_SYMBOL_3,
// }

// UNSUPPORTED Rust 1039:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 14 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_3` (
    public var `crc`: UInt,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1050:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 18 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_1` (
    public var `Name`: UByteArray,
)
// UNSUPPORTED Rust 1060:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_AUX_SYMBOL_2` (
    public var `Length`: UInt,
    public var `NumberOfRelocations`: UShort,
    public var `NumberOfLinenumbers`: UShort,
    public var `CheckSum`: UInt,
    public var `Number`: Short,
    public var `Selection`: UByte,
    public var `bReserved`: UByte,
    public var `HighNumber`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_0` (
    public var `TagIndex`: UInt,
    public var `Misc`: `IMAGE_AUX_SYMBOL_0_0`,
    public var `FcnAry`: `IMAGE_AUX_SYMBOL_0_1`,
    public var `TvIndex`: UShort,
)
// UNSUPPORTED Rust 1085:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1090:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_AUX_SYMBOL_0_1 {
//     pub Function: IMAGE_AUX_SYMBOL_0_1_0,
//     pub Array: IMAGE_AUX_SYMBOL_0_1_1,
// }

// UNSUPPORTED Rust 1096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_0_1_1` (
    public var `Dimension`: UShortArray,
)
// UNSUPPORTED Rust 1106:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_0_1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_AUX_SYMBOL_0_1_0` (
    public var `PointerToLinenumber`: UInt,
    public var `PointerToNextFunction`: UInt,
)
// UNSUPPORTED Rust 1117:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[derive(Clone, Copy)]
// pub union IMAGE_AUX_SYMBOL_0_0 {
//     pub LnSz: IMAGE_AUX_SYMBOL_0_0_0,
//     pub TotalSize: u32,
// }

// UNSUPPORTED Rust 1123:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_AUX_SYMBOL_0_0_0` (
    public var `Linenumber`: UShort,
    public var `Size`: UShort,
)
// UNSUPPORTED Rust 1134:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_AUX_SYMBOL_EX {
//     pub Sym: IMAGE_AUX_SYMBOL_EX_0,
//     pub File: IMAGE_AUX_SYMBOL_EX_1,
//     pub Section: IMAGE_AUX_SYMBOL_EX_2,
//     pub Anonymous: IMAGE_AUX_SYMBOL_EX_3,
//     pub CRC: IMAGE_AUX_SYMBOL_EX_4,
// }

// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_EX_3` (
    public var `TokenDef`: `IMAGE_AUX_SYMBOL_TOKEN_DEF`,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_EX_4` (
    public var `crc`: UInt,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_EX_1` (
    public var `Name`: UByteArray,
)
// UNSUPPORTED Rust 1175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_EX_2` (
    public var `Length`: UInt,
    public var `NumberOfRelocations`: UShort,
    public var `NumberOfLinenumbers`: UShort,
    public var `CheckSum`: UInt,
    public var `Number`: Short,
    public var `Selection`: UByte,
    public var `bReserved`: UByte,
    public var `HighNumber`: Short,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1193:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_EX_0` (
    public var `WeakDefaultSymIndex`: UInt,
    public var `WeakSearchType`: UInt,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_AUX_SYMBOL_TOKEN_DEF` (
    public var `bAuxType`: UByte,
    public var `bReserved`: UByte,
    public var `SymbolTableIndex`: UInt,
    public var `rgbReserved`: UByteArray,
)
// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_AUX_SYMBOL_TOKEN_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_AUX_SYMBOL_TYPE` = Int;
public const val `IMAGE_AUX_SYMBOL_TYPE_TOKEN_DEF`: `IMAGE_AUX_SYMBOL_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_BASE_RELOCATION` (
    public var `VirtualAddress`: UInt,
    public var `SizeOfBlock`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_BDD_DYNAMIC_RELOCATION` (
    public var `Left`: UShort,
    public var `Right`: UShort,
    public var `Value`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_BDD_INFO` (
    public var `Version`: UInt,
    public var `BDDSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_BOUND_FORWARDER_REF` (
    public var `TimeDateStamp`: UInt,
    public var `OffsetModuleName`: UShort,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_BOUND_IMPORT_DESCRIPTOR` (
    public var `TimeDateStamp`: UInt,
    public var `OffsetModuleName`: UShort,
    public var `NumberOfModuleForwarderRefs`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_CE_RUNTIME_FUNCTION_ENTRY` (
    public var `FuncStart`: UInt,
    public var `_bitfield`: UInt,
)
public const val `IMAGE_COMDAT_SELECT_ANY`: UInt = 2u;
public const val `IMAGE_COMDAT_SELECT_ASSOCIATIVE`: UInt = 5u;
public const val `IMAGE_COMDAT_SELECT_EXACT_MATCH`: UInt = 4u;
public const val `IMAGE_COMDAT_SELECT_LARGEST`: UInt = 6u;
public const val `IMAGE_COMDAT_SELECT_NEWEST`: UInt = 7u;
public const val `IMAGE_COMDAT_SELECT_NODUPLICATES`: UInt = 1u;
public const val `IMAGE_COMDAT_SELECT_SAME_SIZE`: UInt = 3u;
public const val `IMAGE_COR_EATJ_THUNK_SIZE`: `ReplacesCorHdrNumericDefines` = 32;
public const val `IMAGE_COR_MIH_BASICBLOCK`: `ReplacesCorHdrNumericDefines` = 8;
public const val `IMAGE_COR_MIH_EHRVA`: `ReplacesCorHdrNumericDefines` = 2;
public const val `IMAGE_COR_MIH_METHODRVA`: `ReplacesCorHdrNumericDefines` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_DEBUG_MISC` (
    public var `DataType`: UInt,
    public var `Length`: UInt,
    public var `Unicode`: Boolean,
    public var `Reserved`: UByteArray,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_DEBUG_MISC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_DEBUG_MISC_EXENAME`: UInt = 1u;
public const val `IMAGE_DEBUG_TYPE_BBT`: UInt = 10u;
public const val `IMAGE_DEBUG_TYPE_CLSID`: UInt = 11u;
public const val `IMAGE_DEBUG_TYPE_EX_DLLCHARACTERISTICS`: UInt = 20u;
public const val `IMAGE_DEBUG_TYPE_ILTCG`: UInt = 14u;
public const val `IMAGE_DEBUG_TYPE_MPX`: UInt = 15u;
public const val `IMAGE_DEBUG_TYPE_OMAP_FROM_SRC`: UInt = 8u;
public const val `IMAGE_DEBUG_TYPE_OMAP_TO_SRC`: UInt = 7u;
public const val `IMAGE_DEBUG_TYPE_POGO`: UInt = 13u;
public const val `IMAGE_DEBUG_TYPE_REPRO`: UInt = 16u;
public const val `IMAGE_DEBUG_TYPE_RESERVED10`: UInt = 10u;
public const val `IMAGE_DEBUG_TYPE_SPGO`: UInt = 18u;
public const val `IMAGE_DEBUG_TYPE_VC_FEATURE`: UInt = 12u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_DOS_HEADER` (
    public var `e_magic`: UShort,
    public var `e_cblp`: UShort,
    public var `e_cp`: UShort,
    public var `e_crlc`: UShort,
    public var `e_cparhdr`: UShort,
    public var `e_minalloc`: UShort,
    public var `e_maxalloc`: UShort,
    public var `e_ss`: UShort,
    public var `e_sp`: UShort,
    public var `e_csum`: UShort,
    public var `e_ip`: UShort,
    public var `e_cs`: UShort,
    public var `e_lfarlc`: UShort,
    public var `e_ovno`: UShort,
    public var `e_res`: UShortArray,
    public var `e_oemid`: UShort,
    public var `e_oeminfo`: UShort,
    public var `e_res2`: UShortArray,
    public var `e_lfanew`: Int,
)
// UNSUPPORTED Rust 1325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_DOS_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_DOS_SIGNATURE`: UShort = 23117u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DYNAMIC_RELOCATION32` (
    public var `Symbol`: UInt,
    public var `BaseRelocSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DYNAMIC_RELOCATION32_V2` (
    public var `HeaderSize`: UInt,
    public var `FixupInfoSize`: UInt,
    public var `Symbol`: UInt,
    public var `SymbolGroup`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DYNAMIC_RELOCATION64` (
    public var `Symbol`: ULong,
    public var `BaseRelocSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DYNAMIC_RELOCATION64_V2` (
    public var `HeaderSize`: UInt,
    public var `FixupInfoSize`: UInt,
    public var `Symbol`: ULong,
    public var `SymbolGroup`: UInt,
    public var `Flags`: UInt,
)
public const val `IMAGE_DYNAMIC_RELOCATION_FUNCTION_OVERRIDE`: UInt = 7u;
public const val `IMAGE_DYNAMIC_RELOCATION_GUARD_IMPORT_CONTROL_TRANSFER`: UInt = 3u;
public const val `IMAGE_DYNAMIC_RELOCATION_GUARD_INDIR_CONTROL_TRANSFER`: UInt = 4u;
public const val `IMAGE_DYNAMIC_RELOCATION_GUARD_RF_EPILOGUE`: UInt = 2u;
public const val `IMAGE_DYNAMIC_RELOCATION_GUARD_RF_PROLOGUE`: UInt = 1u;
public const val `IMAGE_DYNAMIC_RELOCATION_GUARD_SWITCHTABLE_BRANCH`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DYNAMIC_RELOCATION_TABLE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
)
public const val `IMAGE_ENCLAVE_FLAG_PRIMARY_IMAGE`: UInt = 1u;
public const val `IMAGE_ENCLAVE_IMPORT_MATCH_AUTHOR_ID`: UInt = 2u;
public const val `IMAGE_ENCLAVE_IMPORT_MATCH_FAMILY_ID`: UInt = 3u;
public const val `IMAGE_ENCLAVE_IMPORT_MATCH_IMAGE_ID`: UInt = 4u;
public const val `IMAGE_ENCLAVE_IMPORT_MATCH_NONE`: UInt = 0u;
public const val `IMAGE_ENCLAVE_IMPORT_MATCH_UNIQUE_ID`: UInt = 1u;
public const val `IMAGE_ENCLAVE_LONG_ID_LENGTH`: UInt = 32u;
public const val `IMAGE_ENCLAVE_POLICY_DEBUGGABLE`: UInt = 1u;
public const val `IMAGE_ENCLAVE_SHORT_ID_LENGTH`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_EPILOGUE_DYNAMIC_RELOCATION_HEADER` (
    public var `EpilogueCount`: UInt,
    public var `EpilogueByteCount`: UByte,
    public var `BranchDescriptorElementSize`: UByte,
    public var `BranchDescriptorCount`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_EXPORT_DIRECTORY` (
    public var `Characteristics`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `Name`: UInt,
    public var `Base`: UInt,
    public var `NumberOfFunctions`: UInt,
    public var `NumberOfNames`: UInt,
    public var `AddressOfFunctions`: UInt,
    public var `AddressOfNames`: UInt,
    public var `AddressOfNameOrdinals`: UInt,
)
public const val `IMAGE_FUNCTION_OVERRIDE_ARM64_BRANCH26`: UInt = 2u;
public const val `IMAGE_FUNCTION_OVERRIDE_ARM64_THUNK`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_FUNCTION_OVERRIDE_DYNAMIC_RELOCATION` (
    public var `OriginalRva`: UInt,
    public var `BDDOffset`: UInt,
    public var `RvaSize`: UInt,
    public var `BaseRelocSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_FUNCTION_OVERRIDE_HEADER` (
    public var `FuncOverrideSize`: UInt,
)
public const val `IMAGE_FUNCTION_OVERRIDE_INVALID`: UInt = 0u;
public const val `IMAGE_FUNCTION_OVERRIDE_X64_REL32`: UInt = 1u;
public const val `IMAGE_GUARD_CASTGUARD_PRESENT`: UInt = 16777216u;
public const val `IMAGE_GUARD_CFW_INSTRUMENTED`: UInt = 512u;
public const val `IMAGE_GUARD_CF_ENABLE_EXPORT_SUPPRESSION`: UInt = 32768u;
public const val `IMAGE_GUARD_CF_EXPORT_SUPPRESSION_INFO_PRESENT`: UInt = 16384u;
public const val `IMAGE_GUARD_CF_FUNCTION_TABLE_PRESENT`: UInt = 1024u;
public const val `IMAGE_GUARD_CF_FUNCTION_TABLE_SIZE_MASK`: UInt = 4026531840u;
public const val `IMAGE_GUARD_CF_FUNCTION_TABLE_SIZE_SHIFT`: UInt = 28u;
public const val `IMAGE_GUARD_CF_INSTRUMENTED`: UInt = 256u;
public const val `IMAGE_GUARD_CF_LONGJUMP_TABLE_PRESENT`: UInt = 65536u;
public const val `IMAGE_GUARD_DELAYLOAD_IAT_IN_ITS_OWN_SECTION`: UInt = 8192u;
public const val `IMAGE_GUARD_EH_CONTINUATION_TABLE_PRESENT`: UInt = 4194304u;
public const val `IMAGE_GUARD_FLAG_EXPORT_SUPPRESSED`: UInt = 2u;
public const val `IMAGE_GUARD_FLAG_FID_LANGEXCPTHANDLER`: UInt = 4u;
public const val `IMAGE_GUARD_FLAG_FID_SUPPRESSED`: UInt = 1u;
public const val `IMAGE_GUARD_FLAG_FID_XFG`: UInt = 8u;
public const val `IMAGE_GUARD_MEMCPY_PRESENT`: UInt = 33554432u;
public const val `IMAGE_GUARD_PROTECT_DELAYLOAD_IAT`: UInt = 4096u;
public const val `IMAGE_GUARD_RETPOLINE_PRESENT`: UInt = 1048576u;
public const val `IMAGE_GUARD_RF_ENABLE`: UInt = 262144u;
public const val `IMAGE_GUARD_RF_INSTRUMENTED`: UInt = 131072u;
public const val `IMAGE_GUARD_RF_STRICT`: UInt = 524288u;
public const val `IMAGE_GUARD_SECURITY_COOKIE_UNUSED`: UInt = 2048u;
public const val `IMAGE_GUARD_XFG_ENABLED`: UInt = 8388608u;
public const val `IMAGE_HOT_PATCH_ABSOLUTE`: UInt = 180224u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_HOT_PATCH_BASE` (
    public var `SequenceNumber`: UInt,
    public var `Flags`: UInt,
    public var `OriginalTimeDateStamp`: UInt,
    public var `OriginalCheckSum`: UInt,
    public var `CodeIntegrityInfo`: UInt,
    public var `CodeIntegritySize`: UInt,
    public var `PatchTable`: UInt,
    public var `BufferOffset`: UInt,
)
public const val `IMAGE_HOT_PATCH_BASE_CAN_ROLL_BACK`: UInt = 2u;
public const val `IMAGE_HOT_PATCH_BASE_OBLIGATORY`: UInt = 1u;
public const val `IMAGE_HOT_PATCH_CALL_TARGET`: UInt = 278528u;
public const val `IMAGE_HOT_PATCH_CHUNK_INVERSE`: UInt = 2147483648u;
public const val `IMAGE_HOT_PATCH_CHUNK_OBLIGATORY`: UInt = 1073741824u;
public const val `IMAGE_HOT_PATCH_CHUNK_RESERVED`: UInt = 1072705536u;
public const val `IMAGE_HOT_PATCH_CHUNK_SIZE`: UInt = 4095u;
public const val `IMAGE_HOT_PATCH_CHUNK_SOURCE_RVA`: UInt = 32768u;
public const val `IMAGE_HOT_PATCH_CHUNK_TARGET_RVA`: UInt = 16384u;
public const val `IMAGE_HOT_PATCH_CHUNK_TYPE`: UInt = 1032192u;
public const val `IMAGE_HOT_PATCH_DYNAMIC_VALUE`: UInt = 491520u;
public const val `IMAGE_HOT_PATCH_FUNCTION`: UInt = 114688u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_HOT_PATCH_HASHES` (
    public var `SHA256`: UByteArray,
    public var `SHA1`: UByteArray,
)
// UNSUPPORTED Rust 1476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_HOT_PATCH_HASHES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_HOT_PATCH_INDIRECT`: UInt = 376832u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_HOT_PATCH_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SequenceNumber`: UInt,
    public var `BaseImageList`: UInt,
    public var `BaseImageCount`: UInt,
    public var `BufferOffset`: UInt,
    public var `ExtraPatchSize`: UInt,
)
public const val `IMAGE_HOT_PATCH_NONE`: UInt = 0u;
public const val `IMAGE_HOT_PATCH_NO_CALL_TARGET`: UInt = 409600u;
public const val `IMAGE_HOT_PATCH_REL32`: UInt = 245760u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_IMPORT_BY_NAME` (
    public var `Hint`: UShort,
    public var `Name`: ByteArray,
)
// UNSUPPORTED Rust 1502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_IMPORT_BY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_IMPORT_CONTROL_TRANSFER_DYNAMIC_RELOCATION` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_IMPORT_DESCRIPTOR` (
    public var `Anonymous`: `IMAGE_IMPORT_DESCRIPTOR_0`,
    public var `TimeDateStamp`: UInt,
    public var `ForwarderChain`: UInt,
    public var `Name`: UInt,
    public var `FirstThunk`: UInt,
)
// UNSUPPORTED Rust 1521:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_IMPORT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1526:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_IMPORT_DESCRIPTOR_0 {
//     pub Characteristics: u32,
//     pub OriginalFirstThunk: u32,
// }

// UNSUPPORTED Rust 1532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_IMPORT_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_INDIR_CONTROL_TRANSFER_DYNAMIC_RELOCATION` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_LINENUMBER` (
    public var `Type`: `IMAGE_LINENUMBER_0`,
    public var `Linenumber`: UShort,
)
// UNSUPPORTED Rust 1548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_LINENUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1553:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[derive(Clone, Copy)]
// pub union IMAGE_LINENUMBER_0 {
//     pub SymbolTableIndex: u32,
//     pub VirtualAddress: u32,
// }

// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_LINENUMBER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_NT_SIGNATURE`: UInt = 17744u;
public const val `IMAGE_NUMBEROF_DIRECTORY_ENTRIES`: UInt = 16u;
public const val `IMAGE_ORDINAL_FLAG32`: UInt = 2147483648u;
public const val `IMAGE_ORDINAL_FLAG64`: ULong = 9223372036854775808uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_OS2_HEADER` (
    public var `ne_magic`: UShort,
    public var `ne_ver`: Byte,
    public var `ne_rev`: Byte,
    public var `ne_enttab`: UShort,
    public var `ne_cbenttab`: UShort,
    public var `ne_crc`: Int,
    public var `ne_flags`: UShort,
    public var `ne_autodata`: UShort,
    public var `ne_heap`: UShort,
    public var `ne_stack`: UShort,
    public var `ne_csip`: Int,
    public var `ne_sssp`: Int,
    public var `ne_cseg`: UShort,
    public var `ne_cmod`: UShort,
    public var `ne_cbnrestab`: UShort,
    public var `ne_segtab`: UShort,
    public var `ne_rsrctab`: UShort,
    public var `ne_restab`: UShort,
    public var `ne_modtab`: UShort,
    public var `ne_imptab`: UShort,
    public var `ne_nrestab`: Int,
    public var `ne_cmovent`: UShort,
    public var `ne_align`: UShort,
    public var `ne_cres`: UShort,
    public var `ne_exetyp`: UByte,
    public var `ne_flagsothers`: UByte,
    public var `ne_pretthunks`: UShort,
    public var `ne_psegrefbytes`: UShort,
    public var `ne_swaparea`: UShort,
    public var `ne_expver`: UShort,
)
public const val `IMAGE_OS2_SIGNATURE`: UShort = 17742u;
public const val `IMAGE_OS2_SIGNATURE_LE`: UShort = 17740u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_POLICY_ENTRY` (
    public var `Type`: `IMAGE_POLICY_ENTRY_TYPE`,
    public var `PolicyId`: `IMAGE_POLICY_ID`,
    public var `u`: `IMAGE_POLICY_ENTRY_0`,
)
// UNSUPPORTED Rust 1611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_POLICY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1616:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_POLICY_ENTRY_0 {
//     pub None: *const core::ffi::c_void,
//     pub BoolValue: bool,
//     pub Int8Value: i8,
//     pub UInt8Value: u8,
//     pub Int16Value: i16,
//     pub UInt16Value: u16,
//     pub Int32Value: i32,
//     pub UInt32Value: u32,
//     pub Int64Value: i64,
//     pub UInt64Value: u64,
//     pub AnsiStringValue: windows_sys::core::PCSTR,
//     pub UnicodeStringValue: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_POLICY_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_POLICY_ENTRY_TYPE` = Int;
public typealias `IMAGE_POLICY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_POLICY_METADATA` (
    public var `Version`: UByte,
    public var `Reserved0`: UByteArray,
    public var `ApplicationId`: ULong,
    public var `Policies`: Array<`IMAGE_POLICY_ENTRY`>,
)
// UNSUPPORTED Rust 1647:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_POLICY_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_POLICY_METADATA_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1653:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IMAGE_POLICY_SECTION_NAME: windows_sys::core::PCSTR = windows_sys::core::s!(".tPolicy");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER` (
    public var `PrologueByteCount`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_RELOCATION` (
    public var `Anonymous`: `IMAGE_RELOCATION_0`,
    public var `SymbolTableIndex`: UInt,
    public var `Type`: UShort,
)
// UNSUPPORTED Rust 1666:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RELOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1671:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[derive(Clone, Copy)]
// pub union IMAGE_RELOCATION_0 {
//     pub VirtualAddress: u32,
//     pub RelocCount: u32,
// }

// UNSUPPORTED Rust 1677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RELOCATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_REL_ALPHA_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_ALPHA_BRADDR`: UInt = 7u;
public const val `IMAGE_REL_ALPHA_GPDISP`: UInt = 6u;
public const val `IMAGE_REL_ALPHA_GPREL32`: UInt = 3u;
public const val `IMAGE_REL_ALPHA_GPRELHI`: UInt = 23u;
public const val `IMAGE_REL_ALPHA_GPRELLO`: UInt = 22u;
public const val `IMAGE_REL_ALPHA_HINT`: UInt = 8u;
public const val `IMAGE_REL_ALPHA_INLINE_REFLONG`: UInt = 9u;
public const val `IMAGE_REL_ALPHA_LITERAL`: UInt = 4u;
public const val `IMAGE_REL_ALPHA_LITUSE`: UInt = 5u;
public const val `IMAGE_REL_ALPHA_MATCH`: UInt = 13u;
public const val `IMAGE_REL_ALPHA_PAIR`: UInt = 12u;
public const val `IMAGE_REL_ALPHA_REFHI`: UInt = 10u;
public const val `IMAGE_REL_ALPHA_REFLO`: UInt = 11u;
public const val `IMAGE_REL_ALPHA_REFLONG`: UInt = 1u;
public const val `IMAGE_REL_ALPHA_REFLONGNB`: UInt = 16u;
public const val `IMAGE_REL_ALPHA_REFQ1`: UInt = 21u;
public const val `IMAGE_REL_ALPHA_REFQ2`: UInt = 20u;
public const val `IMAGE_REL_ALPHA_REFQ3`: UInt = 19u;
public const val `IMAGE_REL_ALPHA_REFQUAD`: UInt = 2u;
public const val `IMAGE_REL_ALPHA_SECREL`: UInt = 15u;
public const val `IMAGE_REL_ALPHA_SECRELHI`: UInt = 18u;
public const val `IMAGE_REL_ALPHA_SECRELLO`: UInt = 17u;
public const val `IMAGE_REL_ALPHA_SECTION`: UInt = 14u;
public const val `IMAGE_REL_AMD64_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_AMD64_ADDR32`: UInt = 2u;
public const val `IMAGE_REL_AMD64_ADDR32NB`: UInt = 3u;
public const val `IMAGE_REL_AMD64_ADDR64`: UInt = 1u;
public const val `IMAGE_REL_AMD64_CFG_BR`: UInt = 20u;
public const val `IMAGE_REL_AMD64_CFG_BR_REX`: UInt = 21u;
public const val `IMAGE_REL_AMD64_CFG_CALL`: UInt = 22u;
public const val `IMAGE_REL_AMD64_EHANDLER`: UInt = 17u;
public const val `IMAGE_REL_AMD64_IMPORT_BR`: UInt = 18u;
public const val `IMAGE_REL_AMD64_IMPORT_CALL`: UInt = 19u;
public const val `IMAGE_REL_AMD64_INDIR_BR`: UInt = 23u;
public const val `IMAGE_REL_AMD64_INDIR_BR_REX`: UInt = 24u;
public const val `IMAGE_REL_AMD64_INDIR_BR_SWITCHTABLE_FIRST`: UInt = 32u;
public const val `IMAGE_REL_AMD64_INDIR_BR_SWITCHTABLE_LAST`: UInt = 47u;
public const val `IMAGE_REL_AMD64_INDIR_CALL`: UInt = 25u;
public const val `IMAGE_REL_AMD64_PAIR`: UInt = 15u;
public const val `IMAGE_REL_AMD64_REL32`: UInt = 4u;
public const val `IMAGE_REL_AMD64_REL32_1`: UInt = 5u;
public const val `IMAGE_REL_AMD64_REL32_2`: UInt = 6u;
public const val `IMAGE_REL_AMD64_REL32_3`: UInt = 7u;
public const val `IMAGE_REL_AMD64_REL32_4`: UInt = 8u;
public const val `IMAGE_REL_AMD64_REL32_5`: UInt = 9u;
public const val `IMAGE_REL_AMD64_SECREL`: UInt = 11u;
public const val `IMAGE_REL_AMD64_SECREL7`: UInt = 12u;
public const val `IMAGE_REL_AMD64_SECTION`: UInt = 10u;
public const val `IMAGE_REL_AMD64_SREL32`: UInt = 14u;
public const val `IMAGE_REL_AMD64_SSPAN32`: UInt = 16u;
public const val `IMAGE_REL_AMD64_TOKEN`: UInt = 13u;
public const val `IMAGE_REL_AM_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_AM_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_AM_ADDR32NB`: UInt = 2u;
public const val `IMAGE_REL_AM_CALL32`: UInt = 3u;
public const val `IMAGE_REL_AM_FUNCINFO`: UInt = 4u;
public const val `IMAGE_REL_AM_REL32_1`: UInt = 5u;
public const val `IMAGE_REL_AM_REL32_2`: UInt = 6u;
public const val `IMAGE_REL_AM_SECREL`: UInt = 7u;
public const val `IMAGE_REL_AM_SECTION`: UInt = 8u;
public const val `IMAGE_REL_AM_TOKEN`: UInt = 9u;
public const val `IMAGE_REL_ARM64_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_ARM64_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_ARM64_ADDR32NB`: UInt = 2u;
public const val `IMAGE_REL_ARM64_ADDR64`: UInt = 14u;
public const val `IMAGE_REL_ARM64_BRANCH19`: UInt = 15u;
public const val `IMAGE_REL_ARM64_BRANCH26`: UInt = 3u;
public const val `IMAGE_REL_ARM64_PAGEBASE_REL21`: UInt = 4u;
public const val `IMAGE_REL_ARM64_PAGEOFFSET_12A`: UInt = 6u;
public const val `IMAGE_REL_ARM64_PAGEOFFSET_12L`: UInt = 7u;
public const val `IMAGE_REL_ARM64_REL21`: UInt = 5u;
public const val `IMAGE_REL_ARM64_SECREL`: UInt = 8u;
public const val `IMAGE_REL_ARM64_SECREL_HIGH12A`: UInt = 10u;
public const val `IMAGE_REL_ARM64_SECREL_LOW12A`: UInt = 9u;
public const val `IMAGE_REL_ARM64_SECREL_LOW12L`: UInt = 11u;
public const val `IMAGE_REL_ARM64_SECTION`: UInt = 13u;
public const val `IMAGE_REL_ARM64_TOKEN`: UInt = 12u;
public const val `IMAGE_REL_ARM_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_ARM_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_ARM_ADDR32NB`: UInt = 2u;
public const val `IMAGE_REL_ARM_BLX11`: UInt = 9u;
public const val `IMAGE_REL_ARM_BLX23T`: UInt = 21u;
public const val `IMAGE_REL_ARM_BLX24`: UInt = 8u;
public const val `IMAGE_REL_ARM_BRANCH11`: UInt = 4u;
public const val `IMAGE_REL_ARM_BRANCH20T`: UInt = 18u;
public const val `IMAGE_REL_ARM_BRANCH24`: UInt = 3u;
public const val `IMAGE_REL_ARM_BRANCH24T`: UInt = 20u;
public const val `IMAGE_REL_ARM_GPREL12`: UInt = 6u;
public const val `IMAGE_REL_ARM_GPREL7`: UInt = 7u;
public const val `IMAGE_REL_ARM_MOV32`: UInt = 16u;
public const val `IMAGE_REL_ARM_MOV32A`: UInt = 16u;
public const val `IMAGE_REL_ARM_MOV32T`: UInt = 17u;
public const val `IMAGE_REL_ARM_SECREL`: UInt = 15u;
public const val `IMAGE_REL_ARM_SECTION`: UInt = 14u;
public const val `IMAGE_REL_ARM_TOKEN`: UInt = 5u;
public const val `IMAGE_REL_BASED_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_BASED_ARM_MOV32`: UInt = 5u;
public const val `IMAGE_REL_BASED_DIR64`: UInt = 10u;
public const val `IMAGE_REL_BASED_HIGH`: UInt = 1u;
public const val `IMAGE_REL_BASED_HIGHADJ`: UInt = 4u;
public const val `IMAGE_REL_BASED_HIGHLOW`: UInt = 3u;
public const val `IMAGE_REL_BASED_IA64_IMM64`: UInt = 9u;
public const val `IMAGE_REL_BASED_LOW`: UInt = 2u;
public const val `IMAGE_REL_BASED_MACHINE_SPECIFIC_5`: UInt = 5u;
public const val `IMAGE_REL_BASED_MACHINE_SPECIFIC_7`: UInt = 7u;
public const val `IMAGE_REL_BASED_MACHINE_SPECIFIC_8`: UInt = 8u;
public const val `IMAGE_REL_BASED_MACHINE_SPECIFIC_9`: UInt = 9u;
public const val `IMAGE_REL_BASED_MIPS_JMPADDR`: UInt = 5u;
public const val `IMAGE_REL_BASED_MIPS_JMPADDR16`: UInt = 9u;
public const val `IMAGE_REL_BASED_RESERVED`: UInt = 6u;
public const val `IMAGE_REL_BASED_THUMB_MOV32`: UInt = 7u;
public const val `IMAGE_REL_CEE_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_CEE_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_CEE_ADDR32NB`: UInt = 3u;
public const val `IMAGE_REL_CEE_ADDR64`: UInt = 2u;
public const val `IMAGE_REL_CEE_SECREL`: UInt = 5u;
public const val `IMAGE_REL_CEE_SECTION`: UInt = 4u;
public const val `IMAGE_REL_CEE_TOKEN`: UInt = 6u;
public const val `IMAGE_REL_CEF_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_CEF_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_CEF_ADDR32NB`: UInt = 3u;
public const val `IMAGE_REL_CEF_ADDR64`: UInt = 2u;
public const val `IMAGE_REL_CEF_SECREL`: UInt = 5u;
public const val `IMAGE_REL_CEF_SECTION`: UInt = 4u;
public const val `IMAGE_REL_CEF_TOKEN`: UInt = 6u;
public const val `IMAGE_REL_EBC_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_EBC_ADDR32NB`: UInt = 1u;
public const val `IMAGE_REL_EBC_REL32`: UInt = 2u;
public const val `IMAGE_REL_EBC_SECREL`: UInt = 4u;
public const val `IMAGE_REL_EBC_SECTION`: UInt = 3u;
public const val `IMAGE_REL_I386_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_I386_DIR16`: UInt = 1u;
public const val `IMAGE_REL_I386_DIR32`: UInt = 6u;
public const val `IMAGE_REL_I386_DIR32NB`: UInt = 7u;
public const val `IMAGE_REL_I386_REL16`: UInt = 2u;
public const val `IMAGE_REL_I386_REL32`: UInt = 20u;
public const val `IMAGE_REL_I386_SECREL`: UInt = 11u;
public const val `IMAGE_REL_I386_SECREL7`: UInt = 13u;
public const val `IMAGE_REL_I386_SECTION`: UInt = 10u;
public const val `IMAGE_REL_I386_SEG12`: UInt = 9u;
public const val `IMAGE_REL_I386_TOKEN`: UInt = 12u;
public const val `IMAGE_REL_IA64_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_IA64_ADDEND`: UInt = 31u;
public const val `IMAGE_REL_IA64_DIR32`: UInt = 4u;
public const val `IMAGE_REL_IA64_DIR32NB`: UInt = 16u;
public const val `IMAGE_REL_IA64_DIR64`: UInt = 5u;
public const val `IMAGE_REL_IA64_GPREL22`: UInt = 9u;
public const val `IMAGE_REL_IA64_GPREL32`: UInt = 28u;
public const val `IMAGE_REL_IA64_IMM14`: UInt = 1u;
public const val `IMAGE_REL_IA64_IMM22`: UInt = 2u;
public const val `IMAGE_REL_IA64_IMM64`: UInt = 3u;
public const val `IMAGE_REL_IA64_IMMGPREL64`: UInt = 26u;
public const val `IMAGE_REL_IA64_LTOFF22`: UInt = 10u;
public const val `IMAGE_REL_IA64_PCREL21B`: UInt = 6u;
public const val `IMAGE_REL_IA64_PCREL21F`: UInt = 8u;
public const val `IMAGE_REL_IA64_PCREL21M`: UInt = 7u;
public const val `IMAGE_REL_IA64_PCREL60B`: UInt = 22u;
public const val `IMAGE_REL_IA64_PCREL60F`: UInt = 23u;
public const val `IMAGE_REL_IA64_PCREL60I`: UInt = 24u;
public const val `IMAGE_REL_IA64_PCREL60M`: UInt = 25u;
public const val `IMAGE_REL_IA64_PCREL60X`: UInt = 21u;
public const val `IMAGE_REL_IA64_SECREL22`: UInt = 12u;
public const val `IMAGE_REL_IA64_SECREL32`: UInt = 14u;
public const val `IMAGE_REL_IA64_SECREL64I`: UInt = 13u;
public const val `IMAGE_REL_IA64_SECTION`: UInt = 11u;
public const val `IMAGE_REL_IA64_SREL14`: UInt = 17u;
public const val `IMAGE_REL_IA64_SREL22`: UInt = 18u;
public const val `IMAGE_REL_IA64_SREL32`: UInt = 19u;
public const val `IMAGE_REL_IA64_TOKEN`: UInt = 27u;
public const val `IMAGE_REL_IA64_UREL32`: UInt = 20u;
public const val `IMAGE_REL_M32R_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_M32R_ADDR24`: UInt = 3u;
public const val `IMAGE_REL_M32R_ADDR32`: UInt = 1u;
public const val `IMAGE_REL_M32R_ADDR32NB`: UInt = 2u;
public const val `IMAGE_REL_M32R_GPREL16`: UInt = 4u;
public const val `IMAGE_REL_M32R_PAIR`: UInt = 11u;
public const val `IMAGE_REL_M32R_PCREL16`: UInt = 6u;
public const val `IMAGE_REL_M32R_PCREL24`: UInt = 5u;
public const val `IMAGE_REL_M32R_PCREL8`: UInt = 7u;
public const val `IMAGE_REL_M32R_REFHALF`: UInt = 8u;
public const val `IMAGE_REL_M32R_REFHI`: UInt = 9u;
public const val `IMAGE_REL_M32R_REFLO`: UInt = 10u;
public const val `IMAGE_REL_M32R_SECREL32`: UInt = 13u;
public const val `IMAGE_REL_M32R_SECTION`: UInt = 12u;
public const val `IMAGE_REL_M32R_TOKEN`: UInt = 14u;
public const val `IMAGE_REL_MIPS_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_MIPS_GPREL`: UInt = 6u;
public const val `IMAGE_REL_MIPS_JMPADDR`: UInt = 3u;
public const val `IMAGE_REL_MIPS_JMPADDR16`: UInt = 16u;
public const val `IMAGE_REL_MIPS_LITERAL`: UInt = 7u;
public const val `IMAGE_REL_MIPS_PAIR`: UInt = 37u;
public const val `IMAGE_REL_MIPS_REFHALF`: UInt = 1u;
public const val `IMAGE_REL_MIPS_REFHI`: UInt = 4u;
public const val `IMAGE_REL_MIPS_REFLO`: UInt = 5u;
public const val `IMAGE_REL_MIPS_REFWORD`: UInt = 2u;
public const val `IMAGE_REL_MIPS_REFWORDNB`: UInt = 34u;
public const val `IMAGE_REL_MIPS_SECREL`: UInt = 11u;
public const val `IMAGE_REL_MIPS_SECRELHI`: UInt = 13u;
public const val `IMAGE_REL_MIPS_SECRELLO`: UInt = 12u;
public const val `IMAGE_REL_MIPS_SECTION`: UInt = 10u;
public const val `IMAGE_REL_MIPS_TOKEN`: UInt = 14u;
public const val `IMAGE_REL_PPC_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_PPC_ADDR14`: UInt = 5u;
public const val `IMAGE_REL_PPC_ADDR16`: UInt = 4u;
public const val `IMAGE_REL_PPC_ADDR24`: UInt = 3u;
public const val `IMAGE_REL_PPC_ADDR32`: UInt = 2u;
public const val `IMAGE_REL_PPC_ADDR32NB`: UInt = 10u;
public const val `IMAGE_REL_PPC_ADDR64`: UInt = 1u;
public const val `IMAGE_REL_PPC_BRNTAKEN`: UInt = 1024u;
public const val `IMAGE_REL_PPC_BRTAKEN`: UInt = 512u;
public const val `IMAGE_REL_PPC_GPREL`: UInt = 21u;
public const val `IMAGE_REL_PPC_IFGLUE`: UInt = 13u;
public const val `IMAGE_REL_PPC_IMGLUE`: UInt = 14u;
public const val `IMAGE_REL_PPC_NEG`: UInt = 256u;
public const val `IMAGE_REL_PPC_PAIR`: UInt = 18u;
public const val `IMAGE_REL_PPC_REFHI`: UInt = 16u;
public const val `IMAGE_REL_PPC_REFLO`: UInt = 17u;
public const val `IMAGE_REL_PPC_REL14`: UInt = 7u;
public const val `IMAGE_REL_PPC_REL24`: UInt = 6u;
public const val `IMAGE_REL_PPC_SECREL`: UInt = 11u;
public const val `IMAGE_REL_PPC_SECREL16`: UInt = 15u;
public const val `IMAGE_REL_PPC_SECRELHI`: UInt = 20u;
public const val `IMAGE_REL_PPC_SECRELLO`: UInt = 19u;
public const val `IMAGE_REL_PPC_SECTION`: UInt = 12u;
public const val `IMAGE_REL_PPC_TOCDEFN`: UInt = 2048u;
public const val `IMAGE_REL_PPC_TOCREL14`: UInt = 9u;
public const val `IMAGE_REL_PPC_TOCREL16`: UInt = 8u;
public const val `IMAGE_REL_PPC_TOKEN`: UInt = 22u;
public const val `IMAGE_REL_PPC_TYPEMASK`: UInt = 255u;
public const val `IMAGE_REL_SH3_ABSOLUTE`: UInt = 0u;
public const val `IMAGE_REL_SH3_DIRECT16`: UInt = 1u;
public const val `IMAGE_REL_SH3_DIRECT32`: UInt = 2u;
public const val `IMAGE_REL_SH3_DIRECT32_NB`: UInt = 16u;
public const val `IMAGE_REL_SH3_DIRECT4`: UInt = 6u;
public const val `IMAGE_REL_SH3_DIRECT4_LONG`: UInt = 8u;
public const val `IMAGE_REL_SH3_DIRECT4_WORD`: UInt = 7u;
public const val `IMAGE_REL_SH3_DIRECT8`: UInt = 3u;
public const val `IMAGE_REL_SH3_DIRECT8_LONG`: UInt = 5u;
public const val `IMAGE_REL_SH3_DIRECT8_WORD`: UInt = 4u;
public const val `IMAGE_REL_SH3_GPREL4_LONG`: UInt = 17u;
public const val `IMAGE_REL_SH3_PCREL12_WORD`: UInt = 11u;
public const val `IMAGE_REL_SH3_PCREL8_LONG`: UInt = 10u;
public const val `IMAGE_REL_SH3_PCREL8_WORD`: UInt = 9u;
public const val `IMAGE_REL_SH3_SECREL`: UInt = 15u;
public const val `IMAGE_REL_SH3_SECTION`: UInt = 14u;
public const val `IMAGE_REL_SH3_SIZEOF_SECTION`: UInt = 13u;
public const val `IMAGE_REL_SH3_STARTOF_SECTION`: UInt = 12u;
public const val `IMAGE_REL_SH3_TOKEN`: UInt = 18u;
public const val `IMAGE_REL_SHM_PAIR`: UInt = 24u;
public const val `IMAGE_REL_SHM_PCRELPT`: UInt = 19u;
public const val `IMAGE_REL_SHM_REFHALF`: UInt = 21u;
public const val `IMAGE_REL_SHM_REFLO`: UInt = 20u;
public const val `IMAGE_REL_SHM_RELHALF`: UInt = 23u;
public const val `IMAGE_REL_SHM_RELLO`: UInt = 22u;
public const val `IMAGE_REL_SH_NOMODE`: UInt = 32768u;
public const val `IMAGE_REL_THUMB_BLX23`: UInt = 21u;
public const val `IMAGE_REL_THUMB_BRANCH20`: UInt = 18u;
public const val `IMAGE_REL_THUMB_BRANCH24`: UInt = 20u;
public const val `IMAGE_REL_THUMB_MOV32`: UInt = 17u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_RESOURCE_DATA_ENTRY` (
    public var `OffsetToData`: UInt,
    public var `Size`: UInt,
    public var `CodePage`: UInt,
    public var `Reserved`: UInt,
)
public const val `IMAGE_RESOURCE_DATA_IS_DIRECTORY`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_RESOURCE_DIRECTORY` (
    public var `Characteristics`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `NumberOfNamedEntries`: UShort,
    public var `NumberOfIdEntries`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_RESOURCE_DIRECTORY_ENTRY` (
    public var `Anonymous1`: `IMAGE_RESOURCE_DIRECTORY_ENTRY_0`,
    public var `Anonymous2`: `IMAGE_RESOURCE_DIRECTORY_ENTRY_1`,
)
// UNSUPPORTED Rust 1967:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RESOURCE_DIRECTORY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1972:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_RESOURCE_DIRECTORY_ENTRY_0 {
//     pub Anonymous: IMAGE_RESOURCE_DIRECTORY_ENTRY_0_0,
//     pub Name: u32,
//     pub Id: u16,
// }

// UNSUPPORTED Rust 1979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RESOURCE_DIRECTORY_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_RESOURCE_DIRECTORY_ENTRY_0_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1989:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_RESOURCE_DIRECTORY_ENTRY_1 {
//     pub OffsetToData: u32,
//     pub Anonymous: IMAGE_RESOURCE_DIRECTORY_ENTRY_1_0,
// }

// UNSUPPORTED Rust 1995:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RESOURCE_DIRECTORY_ENTRY_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_RESOURCE_DIRECTORY_ENTRY_1_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_RESOURCE_DIRECTORY_STRING` (
    public var `Length`: UShort,
    public var `NameString`: ByteArray,
)
// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RESOURCE_DIRECTORY_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_RESOURCE_DIR_STRING_U` (
    public var `Length`: UShort,
    public var `NameString`: UShortArray,
)
// UNSUPPORTED Rust 2022:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RESOURCE_DIR_STRING_U {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_RESOURCE_NAME_IS_STRING`: UInt = 2147483648u;
public const val `IMAGE_SEPARATE_DEBUG_FLAGS_MASK`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_SEPARATE_DEBUG_HEADER` (
    public var `Signature`: UShort,
    public var `Flags`: UShort,
    public var `Machine`: UShort,
    public var `Characteristics`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `ImageBase`: UInt,
    public var `SizeOfImage`: UInt,
    public var `NumberOfSections`: UInt,
    public var `ExportedNamesSize`: UInt,
    public var `DebugDirectorySize`: UInt,
    public var `SectionAlignment`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 2046:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SEPARATE_DEBUG_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_SEPARATE_DEBUG_MISMATCH`: UInt = 32768u;
public const val `IMAGE_SEPARATE_DEBUG_SIGNATURE`: UInt = 18756u;
public const val `IMAGE_SIZEOF_ARCHIVE_MEMBER_HDR`: UInt = 60u;
public const val `IMAGE_SIZEOF_FILE_HEADER`: UInt = 20u;
public const val `IMAGE_SIZEOF_SECTION_HEADER`: UInt = 40u;
public const val `IMAGE_SIZEOF_SHORT_NAME`: UInt = 8u;
public const val `IMAGE_SIZEOF_SYMBOL`: UInt = 18u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_SWITCHTABLE_BRANCH_DYNAMIC_RELOCATION` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_SYMBOL` (
    public var `N`: `IMAGE_SYMBOL_0`,
    public var `Value`: UInt,
    public var `SectionNumber`: Short,
    public var `Type`: UShort,
    public var `StorageClass`: UByte,
    public var `NumberOfAuxSymbols`: UByte,
)
// UNSUPPORTED Rust 2073:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2078:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[derive(Clone, Copy)]
// pub union IMAGE_SYMBOL_0 {
//     pub ShortName: [u8; 8],
//     pub Name: IMAGE_SYMBOL_0_0,
//     pub LongName: [u32; 2],
// }

// UNSUPPORTED Rust 2085:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SYMBOL_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_SYMBOL_0_0` (
    public var `Short`: UInt,
    public var `Long`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_SYMBOL_EX` (
    public var `N`: `IMAGE_SYMBOL_EX_0`,
    public var `Value`: UInt,
    public var `SectionNumber`: Int,
    public var `Type`: UShort,
    public var `StorageClass`: UByte,
    public var `NumberOfAuxSymbols`: UByte,
)
// UNSUPPORTED Rust 2106:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SYMBOL_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2111:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[derive(Clone, Copy)]
// pub union IMAGE_SYMBOL_EX_0 {
//     pub ShortName: [u8; 8],
//     pub Name: IMAGE_SYMBOL_EX_0_0,
//     pub LongName: [u32; 2],
// }

// UNSUPPORTED Rust 2118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SYMBOL_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_SYMBOL_EX_0_0` (
    public var `Short`: UInt,
    public var `Long`: UInt,
)
public const val `IMAGE_SYM_CLASS_ARGUMENT`: UInt = 9u;
public const val `IMAGE_SYM_CLASS_AUTOMATIC`: UInt = 1u;
public const val `IMAGE_SYM_CLASS_BIT_FIELD`: UInt = 18u;
public const val `IMAGE_SYM_CLASS_BLOCK`: UInt = 100u;
public const val `IMAGE_SYM_CLASS_CLR_TOKEN`: UInt = 107u;
public const val `IMAGE_SYM_CLASS_END_OF_STRUCT`: UInt = 102u;
public const val `IMAGE_SYM_CLASS_ENUM_TAG`: UInt = 15u;
public const val `IMAGE_SYM_CLASS_EXTERNAL`: UInt = 2u;
public const val `IMAGE_SYM_CLASS_EXTERNAL_DEF`: UInt = 5u;
public const val `IMAGE_SYM_CLASS_FAR_EXTERNAL`: UInt = 68u;
public const val `IMAGE_SYM_CLASS_FILE`: UInt = 103u;
public const val `IMAGE_SYM_CLASS_FUNCTION`: UInt = 101u;
public const val `IMAGE_SYM_CLASS_LABEL`: UInt = 6u;
public const val `IMAGE_SYM_CLASS_MEMBER_OF_ENUM`: UInt = 16u;
public const val `IMAGE_SYM_CLASS_MEMBER_OF_STRUCT`: UInt = 8u;
public const val `IMAGE_SYM_CLASS_MEMBER_OF_UNION`: UInt = 11u;
public const val `IMAGE_SYM_CLASS_NULL`: UInt = 0u;
public const val `IMAGE_SYM_CLASS_REGISTER`: UInt = 4u;
public const val `IMAGE_SYM_CLASS_REGISTER_PARAM`: UInt = 17u;
public const val `IMAGE_SYM_CLASS_SECTION`: UInt = 104u;
public const val `IMAGE_SYM_CLASS_STATIC`: UInt = 3u;
public const val `IMAGE_SYM_CLASS_STRUCT_TAG`: UInt = 10u;
public const val `IMAGE_SYM_CLASS_TYPE_DEFINITION`: UInt = 13u;
public const val `IMAGE_SYM_CLASS_UNDEFINED_LABEL`: UInt = 7u;
public const val `IMAGE_SYM_CLASS_UNDEFINED_STATIC`: UInt = 14u;
public const val `IMAGE_SYM_CLASS_UNION_TAG`: UInt = 12u;
public const val `IMAGE_SYM_CLASS_WEAK_EXTERNAL`: UInt = 105u;
public const val `IMAGE_SYM_DTYPE_ARRAY`: UInt = 3u;
public const val `IMAGE_SYM_DTYPE_FUNCTION`: UInt = 2u;
public const val `IMAGE_SYM_DTYPE_NULL`: UInt = 0u;
public const val `IMAGE_SYM_DTYPE_POINTER`: UInt = 1u;
public const val `IMAGE_SYM_SECTION_MAX`: UInt = 65279u;
public const val `IMAGE_SYM_SECTION_MAX_EX`: UInt = 2147483647u;
public const val `IMAGE_SYM_TYPE_BYTE`: UInt = 12u;
public const val `IMAGE_SYM_TYPE_CHAR`: UInt = 2u;
public const val `IMAGE_SYM_TYPE_DOUBLE`: UInt = 7u;
public const val `IMAGE_SYM_TYPE_DWORD`: UInt = 15u;
public const val `IMAGE_SYM_TYPE_ENUM`: UInt = 10u;
public const val `IMAGE_SYM_TYPE_FLOAT`: UInt = 6u;
public const val `IMAGE_SYM_TYPE_INT`: UInt = 4u;
public const val `IMAGE_SYM_TYPE_LONG`: UInt = 5u;
public const val `IMAGE_SYM_TYPE_MOE`: UInt = 11u;
public const val `IMAGE_SYM_TYPE_NULL`: UInt = 0u;
public const val `IMAGE_SYM_TYPE_PCODE`: UInt = 32768u;
public const val `IMAGE_SYM_TYPE_SHORT`: UInt = 3u;
public const val `IMAGE_SYM_TYPE_STRUCT`: UInt = 8u;
public const val `IMAGE_SYM_TYPE_UINT`: UInt = 14u;
public const val `IMAGE_SYM_TYPE_UNION`: UInt = 9u;
public const val `IMAGE_SYM_TYPE_VOID`: UInt = 1u;
public const val `IMAGE_SYM_TYPE_WORD`: UInt = 13u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_TLS_DIRECTORY32` (
    public var `StartAddressOfRawData`: UInt,
    public var `EndAddressOfRawData`: UInt,
    public var `AddressOfIndex`: UInt,
    public var `AddressOfCallBacks`: UInt,
    public var `SizeOfZeroFill`: UInt,
    public var `Anonymous`: `IMAGE_TLS_DIRECTORY32_0`,
)
// UNSUPPORTED Rust 2189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_TLS_DIRECTORY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2194:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_TLS_DIRECTORY32_0 {
//     pub Characteristics: u32,
//     pub Anonymous: IMAGE_TLS_DIRECTORY32_0_0,
// }

// UNSUPPORTED Rust 2200:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_TLS_DIRECTORY32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_TLS_DIRECTORY32_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_TLS_DIRECTORY64` (
    public var `StartAddressOfRawData`: ULong,
    public var `EndAddressOfRawData`: ULong,
    public var `AddressOfIndex`: ULong,
    public var `AddressOfCallBacks`: ULong,
    public var `SizeOfZeroFill`: UInt,
    public var `Anonymous`: `IMAGE_TLS_DIRECTORY64_0`,
)
// UNSUPPORTED Rust 2220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_TLS_DIRECTORY64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2225:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_TLS_DIRECTORY64_0 {
//     pub Characteristics: u32,
//     pub Anonymous: IMAGE_TLS_DIRECTORY64_0_0,
// }

// UNSUPPORTED Rust 2231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_TLS_DIRECTORY64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_TLS_DIRECTORY64_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_VXD_HEADER` (
    public var `e32_magic`: UShort,
    public var `e32_border`: UByte,
    public var `e32_worder`: UByte,
    public var `e32_level`: UInt,
    public var `e32_cpu`: UShort,
    public var `e32_os`: UShort,
    public var `e32_ver`: UInt,
    public var `e32_mflags`: UInt,
    public var `e32_mpages`: UInt,
    public var `e32_startobj`: UInt,
    public var `e32_eip`: UInt,
    public var `e32_stackobj`: UInt,
    public var `e32_esp`: UInt,
    public var `e32_pagesize`: UInt,
    public var `e32_lastpagesize`: UInt,
    public var `e32_fixupsize`: UInt,
    public var `e32_fixupsum`: UInt,
    public var `e32_ldrsize`: UInt,
    public var `e32_ldrsum`: UInt,
    public var `e32_objtab`: UInt,
    public var `e32_objcnt`: UInt,
    public var `e32_objmap`: UInt,
    public var `e32_itermap`: UInt,
    public var `e32_rsrctab`: UInt,
    public var `e32_rsrccnt`: UInt,
    public var `e32_restab`: UInt,
    public var `e32_enttab`: UInt,
    public var `e32_dirtab`: UInt,
    public var `e32_dircnt`: UInt,
    public var `e32_fpagetab`: UInt,
    public var `e32_frectab`: UInt,
    public var `e32_impmod`: UInt,
    public var `e32_impmodcnt`: UInt,
    public var `e32_impproc`: UInt,
    public var `e32_pagesum`: UInt,
    public var `e32_datapage`: UInt,
    public var `e32_preload`: UInt,
    public var `e32_nrestab`: UInt,
    public var `e32_cbnrestab`: UInt,
    public var `e32_nressum`: UInt,
    public var `e32_autodata`: UInt,
    public var `e32_debuginfo`: UInt,
    public var `e32_debuglen`: UInt,
    public var `e32_instpreload`: UInt,
    public var `e32_instdemand`: UInt,
    public var `e32_heapsize`: UInt,
    public var `e32_res3`: UByteArray,
    public var `e32_winresoff`: UInt,
    public var `e32_winreslen`: UInt,
    public var `e32_devid`: UShort,
    public var `e32_ddkver`: UShort,
)
// UNSUPPORTED Rust 2296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_VXD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_VXD_SIGNATURE`: UShort = 17740u;
public const val `IMAGE_WEAK_EXTERN_ANTI_DEPENDENCY`: UInt = 4u;
public const val `IMAGE_WEAK_EXTERN_SEARCH_ALIAS`: UInt = 3u;
public const val `IMAGE_WEAK_EXTERN_SEARCH_LIBRARY`: UInt = 2u;
public const val `IMAGE_WEAK_EXTERN_SEARCH_NOLIBRARY`: UInt = 1u;
public const val `IMPORT_OBJECT_CODE`: `IMPORT_OBJECT_TYPE` = 0;
public const val `IMPORT_OBJECT_CONST`: `IMPORT_OBJECT_TYPE` = 2;
public const val `IMPORT_OBJECT_DATA`: `IMPORT_OBJECT_TYPE` = 1;
public const val `IMPORT_OBJECT_HDR_SIG2`: UInt = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMPORT_OBJECT_HEADER` (
    public var `Sig1`: UShort,
    public var `Sig2`: UShort,
    public var `Version`: UShort,
    public var `Machine`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `SizeOfData`: UInt,
    public var `Anonymous`: `IMPORT_OBJECT_HEADER_0`,
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 2322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMPORT_OBJECT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2327:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMPORT_OBJECT_HEADER_0 {
//     pub Ordinal: u16,
//     pub Hint: u16,
// }

// UNSUPPORTED Rust 2333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMPORT_OBJECT_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMPORT_OBJECT_NAME`: `IMPORT_OBJECT_NAME_TYPE` = 1;
public const val `IMPORT_OBJECT_NAME_EXPORTAS`: `IMPORT_OBJECT_NAME_TYPE` = 4;
public const val `IMPORT_OBJECT_NAME_NO_PREFIX`: `IMPORT_OBJECT_NAME_TYPE` = 2;
public typealias `IMPORT_OBJECT_NAME_TYPE` = Int;
public const val `IMPORT_OBJECT_NAME_UNDECORATE`: `IMPORT_OBJECT_NAME_TYPE` = 3;
public const val `IMPORT_OBJECT_ORDINAL`: `IMPORT_OBJECT_NAME_TYPE` = 0;
public typealias `IMPORT_OBJECT_TYPE` = Int;
public const val `INITIAL_CPSR`: UInt = 16u;
public const val `INITIAL_FPCSR`: UInt = 639u;
public const val `INITIAL_FPSCR`: UInt = 0u;
public const val `INITIAL_MXCSR`: UInt = 8064u;
public const val `IO_COMPLETION_MODIFY_STATE`: UInt = 2u;
public const val `IO_REPARSE_TAG_AF_UNIX`: UInt = 2147483683u;
public const val `IO_REPARSE_TAG_APPEXECLINK`: UInt = 2147483675u;
public const val `IO_REPARSE_TAG_CLOUD`: UInt = 2415919130u;
public const val `IO_REPARSE_TAG_CLOUD_1`: UInt = 2415923226u;
public const val `IO_REPARSE_TAG_CLOUD_2`: UInt = 2415927322u;
public const val `IO_REPARSE_TAG_CLOUD_3`: UInt = 2415931418u;
public const val `IO_REPARSE_TAG_CLOUD_4`: UInt = 2415935514u;
public const val `IO_REPARSE_TAG_CLOUD_5`: UInt = 2415939610u;
public const val `IO_REPARSE_TAG_CLOUD_6`: UInt = 2415943706u;
public const val `IO_REPARSE_TAG_CLOUD_7`: UInt = 2415947802u;
public const val `IO_REPARSE_TAG_CLOUD_8`: UInt = 2415951898u;
public const val `IO_REPARSE_TAG_CLOUD_9`: UInt = 2415955994u;
public const val `IO_REPARSE_TAG_CLOUD_A`: UInt = 2415960090u;
public const val `IO_REPARSE_TAG_CLOUD_B`: UInt = 2415964186u;
public const val `IO_REPARSE_TAG_CLOUD_C`: UInt = 2415968282u;
public const val `IO_REPARSE_TAG_CLOUD_D`: UInt = 2415972378u;
public const val `IO_REPARSE_TAG_CLOUD_E`: UInt = 2415976474u;
public const val `IO_REPARSE_TAG_CLOUD_F`: UInt = 2415980570u;
public const val `IO_REPARSE_TAG_CLOUD_MASK`: UInt = 61440u;
public const val `IO_REPARSE_TAG_CSV`: UInt = 2147483657u;
public const val `IO_REPARSE_TAG_DATALESS_CIM`: UInt = 2684354600u;
public const val `IO_REPARSE_TAG_DEDUP`: UInt = 2147483667u;
public const val `IO_REPARSE_TAG_DFS`: UInt = 2147483658u;
public const val `IO_REPARSE_TAG_DFSR`: UInt = 2147483666u;
public const val `IO_REPARSE_TAG_FILE_PLACEHOLDER`: UInt = 2147483669u;
public const val `IO_REPARSE_TAG_GLOBAL_REPARSE`: UInt = 2684354585u;
public const val `IO_REPARSE_TAG_HSM`: UInt = 3221225476u;
public const val `IO_REPARSE_TAG_HSM2`: UInt = 2147483654u;
public const val `IO_REPARSE_TAG_MOUNT_POINT`: UInt = 2684354563u;
public const val `IO_REPARSE_TAG_NFS`: UInt = 2147483668u;
public const val `IO_REPARSE_TAG_ONEDRIVE`: UInt = 2147483681u;
public const val `IO_REPARSE_TAG_PROJFS`: UInt = 2415919132u;
public const val `IO_REPARSE_TAG_PROJFS_TOMBSTONE`: UInt = 2684354594u;
public const val `IO_REPARSE_TAG_RESERVED_INVALID`: Int = -1073709056;
public const val `IO_REPARSE_TAG_RESERVED_ONE`: UInt = 1u;
public const val `IO_REPARSE_TAG_RESERVED_RANGE`: UInt = 2u;
public const val `IO_REPARSE_TAG_RESERVED_TWO`: UInt = 2u;
public const val `IO_REPARSE_TAG_RESERVED_ZERO`: UInt = 0u;
public const val `IO_REPARSE_TAG_SIS`: UInt = 2147483655u;
public const val `IO_REPARSE_TAG_STORAGE_SYNC`: UInt = 2147483678u;
public const val `IO_REPARSE_TAG_SYMLINK`: UInt = 2684354572u;
public const val `IO_REPARSE_TAG_UNHANDLED`: UInt = 2147483680u;
public const val `IO_REPARSE_TAG_WCI`: UInt = 2147483672u;
public const val `IO_REPARSE_TAG_WCI_1`: UInt = 2415923224u;
public const val `IO_REPARSE_TAG_WCI_LINK`: UInt = 2684354599u;
public const val `IO_REPARSE_TAG_WCI_LINK_1`: UInt = 2684358695u;
public const val `IO_REPARSE_TAG_WCI_TOMBSTONE`: UInt = 2684354591u;
public const val `IO_REPARSE_TAG_WIM`: UInt = 2147483656u;
public const val `IO_REPARSE_TAG_WOF`: UInt = 2147483671u;
public const val `IS_TEXT_UNICODE_DBCS_LEADBYTE`: UInt = 1024u;
public const val `IS_TEXT_UNICODE_UTF8`: UInt = 2048u;
public const val `ITWW_OPEN_CONNECT`: `WORD_WHEEL_OPEN_FLAGS` = 0u;
public const val `IgnoreError`: `SERVICE_ERROR_TYPE` = 0;
public const val `ImagePolicyEntryTypeAnsiString`: `IMAGE_POLICY_ENTRY_TYPE` = 10;
public const val `ImagePolicyEntryTypeBool`: `IMAGE_POLICY_ENTRY_TYPE` = 1;
public const val `ImagePolicyEntryTypeInt16`: `IMAGE_POLICY_ENTRY_TYPE` = 4;
public const val `ImagePolicyEntryTypeInt32`: `IMAGE_POLICY_ENTRY_TYPE` = 6;
public const val `ImagePolicyEntryTypeInt64`: `IMAGE_POLICY_ENTRY_TYPE` = 8;
public const val `ImagePolicyEntryTypeInt8`: `IMAGE_POLICY_ENTRY_TYPE` = 2;
public const val `ImagePolicyEntryTypeMaximum`: `IMAGE_POLICY_ENTRY_TYPE` = 13;
public const val `ImagePolicyEntryTypeNone`: `IMAGE_POLICY_ENTRY_TYPE` = 0;
public const val `ImagePolicyEntryTypeOverride`: `IMAGE_POLICY_ENTRY_TYPE` = 12;
public const val `ImagePolicyEntryTypeUInt16`: `IMAGE_POLICY_ENTRY_TYPE` = 5;
public const val `ImagePolicyEntryTypeUInt32`: `IMAGE_POLICY_ENTRY_TYPE` = 7;
public const val `ImagePolicyEntryTypeUInt64`: `IMAGE_POLICY_ENTRY_TYPE` = 9;
public const val `ImagePolicyEntryTypeUInt8`: `IMAGE_POLICY_ENTRY_TYPE` = 3;
public const val `ImagePolicyEntryTypeUnicodeString`: `IMAGE_POLICY_ENTRY_TYPE` = 11;
public const val `ImagePolicyIdCapability`: `IMAGE_POLICY_ID` = 10;
public const val `ImagePolicyIdCrashDump`: `IMAGE_POLICY_ID` = 3;
public const val `ImagePolicyIdCrashDumpKey`: `IMAGE_POLICY_ID` = 4;
public const val `ImagePolicyIdCrashDumpKeyGuid`: `IMAGE_POLICY_ID` = 5;
public const val `ImagePolicyIdDebug`: `IMAGE_POLICY_ID` = 2;
public const val `ImagePolicyIdDeviceId`: `IMAGE_POLICY_ID` = 9;
public const val `ImagePolicyIdEtw`: `IMAGE_POLICY_ID` = 1;
public const val `ImagePolicyIdMaximum`: `IMAGE_POLICY_ID` = 12;
public const val `ImagePolicyIdNone`: `IMAGE_POLICY_ID` = 0;
public const val `ImagePolicyIdParentSd`: `IMAGE_POLICY_ID` = 6;
public const val `ImagePolicyIdParentSdRev`: `IMAGE_POLICY_ID` = 7;
public const val `ImagePolicyIdScenarioId`: `IMAGE_POLICY_ID` = 11;
public const val `ImagePolicyIdSvn`: `IMAGE_POLICY_ID` = 8;
public const val `JOB_OBJECT_ASSIGN_PROCESS`: UInt = 1u;
public const val `JOB_OBJECT_IMPERSONATE`: UInt = 32u;
public const val `JOB_OBJECT_MSG_ABNORMAL_EXIT_PROCESS`: UInt = 8u;
public const val `JOB_OBJECT_MSG_ACTIVE_PROCESS_LIMIT`: UInt = 3u;
public const val `JOB_OBJECT_MSG_ACTIVE_PROCESS_ZERO`: UInt = 4u;
public const val `JOB_OBJECT_MSG_END_OF_JOB_TIME`: UInt = 1u;
public const val `JOB_OBJECT_MSG_END_OF_PROCESS_TIME`: UInt = 2u;
public const val `JOB_OBJECT_MSG_EXIT_PROCESS`: UInt = 7u;
public const val `JOB_OBJECT_MSG_JOB_CYCLE_TIME_LIMIT`: UInt = 12u;
public const val `JOB_OBJECT_MSG_JOB_MEMORY_LIMIT`: UInt = 10u;
public const val `JOB_OBJECT_MSG_MAXIMUM`: UInt = 13u;
public const val `JOB_OBJECT_MSG_MINIMUM`: UInt = 1u;
public const val `JOB_OBJECT_MSG_NEW_PROCESS`: UInt = 6u;
public const val `JOB_OBJECT_MSG_NOTIFICATION_LIMIT`: UInt = 11u;
public const val `JOB_OBJECT_MSG_PROCESS_MEMORY_LIMIT`: UInt = 9u;
public const val `JOB_OBJECT_MSG_SILO_TERMINATED`: UInt = 13u;
public const val `JOB_OBJECT_NET_RATE_CONTROL_MAX_DSCP_TAG`: UInt = 64u;
public const val `JOB_OBJECT_QUERY`: UInt = 4u;
public const val `JOB_OBJECT_SET_ATTRIBUTES`: UInt = 2u;
public const val `JOB_OBJECT_SET_SECURITY_ATTRIBUTES`: UInt = 16u;
public const val `JOB_OBJECT_TERMINATE`: UInt = 8u;
public const val `JOB_OBJECT_UILIMIT_ALL`: UInt = 511u;
public const val `JOB_OBJECT_UILIMIT_IME`: UInt = 256u;
public const val `JOB_OBJECT_UI_VALID_FLAGS`: UInt = 511u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERNEL_CET_CONTEXT` (
    public var `Ssp`: ULong,
    public var `Rip`: ULong,
    public var `SegCs`: UShort,
    public var `Anonymous`: `KERNEL_CET_CONTEXT_0`,
    public var `Fill`: UShortArray,
)
// UNSUPPORTED Rust 2463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERNEL_CET_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2468:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KERNEL_CET_CONTEXT_0 {
//     pub AllFlags: u16,
//     pub Anonymous: KERNEL_CET_CONTEXT_0_0,
// }

// UNSUPPORTED Rust 2474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERNEL_CET_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERNEL_CET_CONTEXT_0_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KTMOBJECT_CURSOR` (
    public var `LastQuery`: `windows_sys`.`core`.`GUID`,
    public var `ObjectIdCount`: UInt,
    public var `ObjectIds`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 2491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KTMOBJECT_CURSOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KTMOBJECT_ENLISTMENT`: `KTMOBJECT_TYPE` = 3;
public const val `KTMOBJECT_INVALID`: `KTMOBJECT_TYPE` = 4;
public const val `KTMOBJECT_RESOURCE_MANAGER`: `KTMOBJECT_TYPE` = 2;
public const val `KTMOBJECT_TRANSACTION`: `KTMOBJECT_TYPE` = 0;
public const val `KTMOBJECT_TRANSACTION_MANAGER`: `KTMOBJECT_TYPE` = 1;
public typealias `KTMOBJECT_TYPE` = Int;
public const val `LANG_AFRIKAANS`: UInt = 54u;
public const val `LANG_ALBANIAN`: UInt = 28u;
public const val `LANG_ALSATIAN`: UInt = 132u;
public const val `LANG_AMHARIC`: UInt = 94u;
public const val `LANG_ARABIC`: UInt = 1u;
public const val `LANG_ARMENIAN`: UInt = 43u;
public const val `LANG_ASSAMESE`: UInt = 77u;
public const val `LANG_AZERBAIJANI`: UInt = 44u;
public const val `LANG_AZERI`: UInt = 44u;
public const val `LANG_BANGLA`: UInt = 69u;
public const val `LANG_BASHKIR`: UInt = 109u;
public const val `LANG_BASQUE`: UInt = 45u;
public const val `LANG_BELARUSIAN`: UInt = 35u;
public const val `LANG_BENGALI`: UInt = 69u;
public const val `LANG_BOSNIAN`: UInt = 26u;
public const val `LANG_BOSNIAN_NEUTRAL`: UInt = 30746u;
public const val `LANG_BRETON`: UInt = 126u;
public const val `LANG_BULGARIAN`: UInt = 2u;
public const val `LANG_CATALAN`: UInt = 3u;
public const val `LANG_CENTRAL_KURDISH`: UInt = 146u;
public const val `LANG_CHEROKEE`: UInt = 92u;
public const val `LANG_CHINESE`: UInt = 4u;
public const val `LANG_CHINESE_SIMPLIFIED`: UInt = 4u;
public const val `LANG_CHINESE_TRADITIONAL`: UInt = 31748u;
public const val `LANG_CORSICAN`: UInt = 131u;
public const val `LANG_CROATIAN`: UInt = 26u;
public const val `LANG_CZECH`: UInt = 5u;
public const val `LANG_DANISH`: UInt = 6u;
public const val `LANG_DARI`: UInt = 140u;
public const val `LANG_DIVEHI`: UInt = 101u;
public const val `LANG_DUTCH`: UInt = 19u;
public const val `LANG_ENGLISH`: UInt = 9u;
public const val `LANG_ESTONIAN`: UInt = 37u;
public const val `LANG_FAEROESE`: UInt = 56u;
public const val `LANG_FARSI`: UInt = 41u;
public const val `LANG_FILIPINO`: UInt = 100u;
public const val `LANG_FINNISH`: UInt = 11u;
public const val `LANG_FRENCH`: UInt = 12u;
public const val `LANG_FRISIAN`: UInt = 98u;
public const val `LANG_FULAH`: UInt = 103u;
public const val `LANG_GALICIAN`: UInt = 86u;
public const val `LANG_GEORGIAN`: UInt = 55u;
public const val `LANG_GERMAN`: UInt = 7u;
public const val `LANG_GREEK`: UInt = 8u;
public const val `LANG_GREENLANDIC`: UInt = 111u;
public const val `LANG_GUJARATI`: UInt = 71u;
public const val `LANG_HAUSA`: UInt = 104u;
public const val `LANG_HAWAIIAN`: UInt = 117u;
public const val `LANG_HEBREW`: UInt = 13u;
public const val `LANG_HINDI`: UInt = 57u;
public const val `LANG_HUNGARIAN`: UInt = 14u;
public const val `LANG_ICELANDIC`: UInt = 15u;
public const val `LANG_IGBO`: UInt = 112u;
public const val `LANG_INDONESIAN`: UInt = 33u;
public const val `LANG_INUKTITUT`: UInt = 93u;
public const val `LANG_INVARIANT`: UInt = 127u;
public const val `LANG_IRISH`: UInt = 60u;
public const val `LANG_ITALIAN`: UInt = 16u;
public const val `LANG_JAPANESE`: UInt = 17u;
public const val `LANG_KANNADA`: UInt = 75u;
public const val `LANG_KASHMIRI`: UInt = 96u;
public const val `LANG_KAZAK`: UInt = 63u;
public const val `LANG_KHMER`: UInt = 83u;
public const val `LANG_KICHE`: UInt = 134u;
public const val `LANG_KINYARWANDA`: UInt = 135u;
public const val `LANG_KONKANI`: UInt = 87u;
public const val `LANG_KOREAN`: UInt = 18u;
public const val `LANG_KYRGYZ`: UInt = 64u;
public const val `LANG_LAO`: UInt = 84u;
public const val `LANG_LATVIAN`: UInt = 38u;
public const val `LANG_LITHUANIAN`: UInt = 39u;
public const val `LANG_LOWER_SORBIAN`: UInt = 46u;
public const val `LANG_LUXEMBOURGISH`: UInt = 110u;
public const val `LANG_MACEDONIAN`: UInt = 47u;
public const val `LANG_MALAY`: UInt = 62u;
public const val `LANG_MALAYALAM`: UInt = 76u;
public const val `LANG_MALTESE`: UInt = 58u;
public const val `LANG_MANIPURI`: UInt = 88u;
public const val `LANG_MAORI`: UInt = 129u;
public const val `LANG_MAPUDUNGUN`: UInt = 122u;
public const val `LANG_MARATHI`: UInt = 78u;
public const val `LANG_MOHAWK`: UInt = 124u;
public const val `LANG_MONGOLIAN`: UInt = 80u;
public const val `LANG_NEPALI`: UInt = 97u;
public const val `LANG_NEUTRAL`: UInt = 0u;
public const val `LANG_NORWEGIAN`: UInt = 20u;
public const val `LANG_OCCITAN`: UInt = 130u;
public const val `LANG_ODIA`: UInt = 72u;
public const val `LANG_ORIYA`: UInt = 72u;
public const val `LANG_PASHTO`: UInt = 99u;
public const val `LANG_PERSIAN`: UInt = 41u;
public const val `LANG_POLISH`: UInt = 21u;
public const val `LANG_PORTUGUESE`: UInt = 22u;
public const val `LANG_PULAR`: UInt = 103u;
public const val `LANG_PUNJABI`: UInt = 70u;
public const val `LANG_QUECHUA`: UInt = 107u;
public const val `LANG_ROMANIAN`: UInt = 24u;
public const val `LANG_ROMANSH`: UInt = 23u;
public const val `LANG_RUSSIAN`: UInt = 25u;
public const val `LANG_SAKHA`: UInt = 133u;
public const val `LANG_SAMI`: UInt = 59u;
public const val `LANG_SANSKRIT`: UInt = 79u;
public const val `LANG_SCOTTISH_GAELIC`: UInt = 145u;
public const val `LANG_SERBIAN`: UInt = 26u;
public const val `LANG_SERBIAN_NEUTRAL`: UInt = 31770u;
public const val `LANG_SINDHI`: UInt = 89u;
public const val `LANG_SINHALESE`: UInt = 91u;
public const val `LANG_SLOVAK`: UInt = 27u;
public const val `LANG_SLOVENIAN`: UInt = 36u;
public const val `LANG_SOTHO`: UInt = 108u;
public const val `LANG_SPANISH`: UInt = 10u;
public const val `LANG_SWAHILI`: UInt = 65u;
public const val `LANG_SWEDISH`: UInt = 29u;
public const val `LANG_SYRIAC`: UInt = 90u;
public const val `LANG_TAJIK`: UInt = 40u;
public const val `LANG_TAMAZIGHT`: UInt = 95u;
public const val `LANG_TAMIL`: UInt = 73u;
public const val `LANG_TATAR`: UInt = 68u;
public const val `LANG_TELUGU`: UInt = 74u;
public const val `LANG_THAI`: UInt = 30u;
public const val `LANG_TIBETAN`: UInt = 81u;
public const val `LANG_TIGRIGNA`: UInt = 115u;
public const val `LANG_TIGRINYA`: UInt = 115u;
public const val `LANG_TSWANA`: UInt = 50u;
public const val `LANG_TURKISH`: UInt = 31u;
public const val `LANG_TURKMEN`: UInt = 66u;
public const val `LANG_UIGHUR`: UInt = 128u;
public const val `LANG_UKRAINIAN`: UInt = 34u;
public const val `LANG_UPPER_SORBIAN`: UInt = 46u;
public const val `LANG_URDU`: UInt = 32u;
public const val `LANG_UZBEK`: UInt = 67u;
public const val `LANG_VALENCIAN`: UInt = 3u;
public const val `LANG_VIETNAMESE`: UInt = 42u;
public const val `LANG_WELSH`: UInt = 82u;
public const val `LANG_WOLOF`: UInt = 136u;
public const val `LANG_XHOSA`: UInt = 52u;
public const val `LANG_YAKUT`: UInt = 133u;
public const val `LANG_YI`: UInt = 120u;
public const val `LANG_YORUBA`: UInt = 106u;
public const val `LANG_ZULU`: UInt = 53u;
public const val `LMEM_DISCARDABLE`: UInt = 3840u;
public const val `LMEM_DISCARDED`: UInt = 16384u;
public const val `LMEM_INVALID_HANDLE`: UInt = 32768u;
public const val `LMEM_LOCKCOUNT`: UInt = 255u;
public const val `LMEM_MODIFY`: UInt = 128u;
public const val `LMEM_NOCOMPACT`: UInt = 16u;
public const val `LMEM_NODISCARD`: UInt = 32u;
public const val `LMEM_VALID_FLAGS`: UInt = 3954u;
public const val `LOCALE_NAME_MAX_LENGTH`: UInt = 85u;
public const val `LOCALE_TRANSIENT_KEYBOARD1`: UInt = 8192u;
public const val `LOCALE_TRANSIENT_KEYBOARD2`: UInt = 9216u;
public const val `LOCALE_TRANSIENT_KEYBOARD3`: UInt = 10240u;
public const val `LOCALE_TRANSIENT_KEYBOARD4`: UInt = 11264u;
public const val `LTP_PC_SMT`: UInt = 1u;
public const val `MAILSLOT_NO_MESSAGE`: UInt = 4294967295u;
public const val `MAILSLOT_WAIT_FOREVER`: UInt = 4294967295u;
public const val `MAXBYTE`: UInt = 255u;
public const val `MAXCHAR`: UInt = 127u;
public const val `MAXDWORD`: UInt = 4294967295u;
public const val `MAXIMUM_ALLOWED`: UInt = 33554432u;
public const val `MAXIMUM_PROCESSORS`: UInt = 64u;
public const val `MAXIMUM_PROC_PER_GROUP`: UInt = 64u;
public const val `MAXIMUM_SUPPORTED_EXTENSION`: UInt = 512u;
public const val `MAXIMUM_SUSPEND_COUNT`: UInt = 127u;
public const val `MAXIMUM_WAIT_OBJECTS`: UInt = 64u;
public const val `MAXIMUM_XSTATE_FEATURES`: UInt = 64u;
public const val `MAXLOGICALLOGNAMESIZE`: UInt = 256u;
public const val `MAXLONG`: UInt = 2147483647u;
public const val `MAXLONGLONG`: ULong = 9223372036854775807uL;
public const val `MAXSHORT`: UInt = 32767u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MAXVERSIONTESTED_INFO` (
    public var `MaxVersionTested`: ULong,
)
public const val `MAXWORD`: UInt = 65535u;
public const val `MAX_ACL_REVISION`: UInt = 4u;
public const val `MAX_CLASS_NAME`: `ReplacesCorHdrNumericDefines` = 1024;
public const val `MAX_HW_COUNTERS`: UInt = 16u;
public const val `MAX_PACKAGE_NAME`: `ReplacesCorHdrNumericDefines` = 1024;
public const val `MAX_UCSCHAR`: UInt = 1114111u;
public const val `MEMORY_ALLOCATION_ALIGNMENT`: UInt = 16u;
public const val `MEMORY_PARTITION_MODIFY_ACCESS`: UInt = 2u;
public const val `MEMORY_PARTITION_QUERY_ACCESS`: UInt = 1u;
public const val `MEMORY_PRIORITY_LOWEST`: UInt = 0u;
public const val `MEM_4MB_PAGES`: UInt = 2147483648u;
public const val `MEM_COALESCE_PLACEHOLDERS`: UInt = 1u;
public const val `MEM_DIFFERENT_IMAGE_BASE_OK`: UInt = 8388608u;
public const val `MEM_EXTENDED_PARAMETER_EC_CODE`: UInt = 64u;
public const val `MEM_EXTENDED_PARAMETER_GRAPHICS`: UInt = 1u;
public const val `MEM_EXTENDED_PARAMETER_IMAGE_NO_HPAT`: UInt = 128u;
public const val `MEM_EXTENDED_PARAMETER_NONPAGED`: UInt = 2u;
public const val `MEM_EXTENDED_PARAMETER_NONPAGED_HUGE`: UInt = 16u;
public const val `MEM_EXTENDED_PARAMETER_NONPAGED_LARGE`: UInt = 8u;
public const val `MEM_EXTENDED_PARAMETER_SOFT_FAULT_PAGES`: UInt = 32u;
public const val `MEM_EXTENDED_PARAMETER_TYPE_BITS`: UInt = 8u;
public const val `MEM_EXTENDED_PARAMETER_ZERO_PAGES_OPTIONAL`: UInt = 4u;
public const val `MEM_PHYSICAL`: UInt = 4194304u;
public const val `MEM_ROTATE`: UInt = 8388608u;
public const val `MEM_TOP_DOWN`: UInt = 1048576u;
public const val `MEM_WRITE_WATCH`: UInt = 2097152u;
public const val `MESSAGE_RESOURCE_UNICODE`: UInt = 1u;
public const val `MESSAGE_RESOURCE_UTF8`: UInt = 2u;
public const val `MINCHAR`: UInt = 128u;
public const val `MINLONG`: UInt = 2147483648u;
public const val `MINSHORT`: UInt = 32768u;
public const val `MIN_UCSCHAR`: UInt = 0u;
public const val `MK_CONTROL`: `MODIFIERKEYS_FLAGS` = 8u;
public const val `MK_LBUTTON`: `MODIFIERKEYS_FLAGS` = 1u;
public const val `MK_MBUTTON`: `MODIFIERKEYS_FLAGS` = 16u;
public const val `MK_RBUTTON`: `MODIFIERKEYS_FLAGS` = 2u;
public const val `MK_SHIFT`: `MODIFIERKEYS_FLAGS` = 4u;
public const val `MK_XBUTTON1`: `MODIFIERKEYS_FLAGS` = 32u;
public const val `MK_XBUTTON2`: `MODIFIERKEYS_FLAGS` = 64u;
public typealias `MODIFIERKEYS_FLAGS` = UInt;
public typealias `MONITOR_DISPLAY_STATE` = Int;
public const val `MS_PPM_SOFTWARE_ALL`: UInt = 1u;
public const val `MUTANT_QUERY_STATE`: UInt = 1u;
public const val `MaxActivationContextInfoClass`: `ACTIVATION_CONTEXT_INFO_CLASS` = 8;
public const val `NATIVE_TYPE_MAX_CB`: `ReplacesCorHdrNumericDefines` = 1;
public const val `NETWORK_APP_INSTANCE_CSV_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETWORK_APP_INSTANCE_EA` (
    public var `AppInstanceID`: `windows_sys`.`core`.`GUID`,
    public var `CsvFlags`: UInt,
)
public const val `NLS_VALID_LOCALE_MASK`: UInt = 1048575u;
public const val `NONVOL_FP_NUMREG_ARM64`: UInt = 8u;
public const val `NONVOL_INT_NUMREG_ARM64`: UInt = 11u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NON_PAGED_DEBUG_INFO` (
    public var `Signature`: UShort,
    public var `Flags`: UShort,
    public var `Size`: UInt,
    public var `Machine`: UShort,
    public var `Characteristics`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `SizeOfImage`: UInt,
    public var `ImageBase`: ULong,
)
public const val `NON_PAGED_DEBUG_SIGNATURE`: UInt = 18766u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NOTIFY_USER_POWER_SETTING` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2751:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const NO_SUBGROUP_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfea3413e_7e05_4911_9a71_700331f1c294);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NT_TIB32` (
    public var `ExceptionList`: UInt,
    public var `StackBase`: UInt,
    public var `StackLimit`: UInt,
    public var `SubSystemTib`: UInt,
    public var `Anonymous`: `NT_TIB32_0`,
    public var `ArbitraryUserPointer`: UInt,
    public var `Self_`: UInt,
)
// UNSUPPORTED Rust 2763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NT_TIB32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2768:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NT_TIB32_0 {
//     pub FiberData: u32,
//     pub Version: u32,
// }

// UNSUPPORTED Rust 2774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NT_TIB32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NT_TIB64` (
    public var `ExceptionList`: ULong,
    public var `StackBase`: ULong,
    public var `StackLimit`: ULong,
    public var `SubSystemTib`: ULong,
    public var `Anonymous`: `NT_TIB64_0`,
    public var `ArbitraryUserPointer`: ULong,
    public var `Self_`: ULong,
)
// UNSUPPORTED Rust 2790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NT_TIB64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2795:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NT_TIB64_0 {
//     pub FiberData: u64,
//     pub Version: u32,
// }

// UNSUPPORTED Rust 2801:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NT_TIB64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NUMA_NO_PREFERRED_NODE`: UInt = 4294967295u;
public const val `NUM_DISCHARGE_POLICIES`: UInt = 4u;
public const val `N_BTMASK`: UInt = 15u;
public const val `N_BTSHFT`: UInt = 4u;
public const val `N_TMASK`: UInt = 48u;
public const val `N_TMASK1`: UInt = 192u;
public const val `N_TMASK2`: UInt = 240u;
public const val `N_TSHIFT`: UInt = 2u;
public const val `NormalError`: `SERVICE_ERROR_TYPE` = 1;
// UNSUPPORTED Rust 2815:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK_EXPORT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessFunctionTableCallback");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKEDEVENTINFO` (
    public var `ulSize`: UInt,
    public var `ulNumEventsForLogFile`: UInt,
    public var `ulOffsets`: UIntArray,
)
// UNSUPPORTED Rust 2823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PACKEDEVENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PARKING_TOPOLOGY_POLICY_DISABLED`: UInt = 0u;
public const val `PARKING_TOPOLOGY_POLICY_ROUNDROBIN`: UInt = 1u;
public const val `PARKING_TOPOLOGY_POLICY_SEQUENTIAL`: UInt = 2u;
public const val `PERFORMANCE_DATA_VERSION`: UInt = 1u;
public const val `PERFSTATE_POLICY_CHANGE_DECREASE_MAX`: UInt = 2u;
public const val `PERFSTATE_POLICY_CHANGE_IDEAL`: UInt = 0u;
public const val `PERFSTATE_POLICY_CHANGE_IDEAL_AGGRESSIVE`: UInt = 3u;
public const val `PERFSTATE_POLICY_CHANGE_INCREASE_MAX`: UInt = 3u;
public const val `PERFSTATE_POLICY_CHANGE_ROCKET`: UInt = 2u;
public const val `PERFSTATE_POLICY_CHANGE_SINGLE`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `PEXCEPTION_FILTER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`EXCEPTION_POINTERS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
public const val `PF_NON_TEMPORAL_LEVEL_ALL`: UInt = 0u;
public const val `PF_TEMPORAL_LEVEL_1`: UInt = 1u;
public const val `PF_TEMPORAL_LEVEL_2`: UInt = 2u;
public const val `PF_TEMPORAL_LEVEL_3`: UInt = 3u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIMAGE_TLS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `POLICY_AUDIT_SUBCATEGORY_COUNT`: UInt = 59u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Diagnostics_Debug")]
public typealias `POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Diagnostics`.`Debug`.`IMAGE_RUNTIME_FUNCTION_ENTRY`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Diagnostics_Debug")]
public typealias `POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Diagnostics`.`Debug`.`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>>?) -> UInt>>>;
public const val `POWERBUTTON_ACTION_INDEX_HIBERNATE`: UInt = 2u;
public const val `POWERBUTTON_ACTION_INDEX_NOTHING`: UInt = 0u;
public const val `POWERBUTTON_ACTION_INDEX_SHUTDOWN`: UInt = 3u;
public const val `POWERBUTTON_ACTION_INDEX_SLEEP`: UInt = 1u;
public const val `POWERBUTTON_ACTION_INDEX_TURN_OFF_THE_DISPLAY`: UInt = 4u;
public const val `POWERBUTTON_ACTION_VALUE_HIBERNATE`: UInt = 3u;
public const val `POWERBUTTON_ACTION_VALUE_NOTHING`: UInt = 0u;
public const val `POWERBUTTON_ACTION_VALUE_SHUTDOWN`: UInt = 6u;
public const val `POWERBUTTON_ACTION_VALUE_SLEEP`: UInt = 2u;
public const val `POWERBUTTON_ACTION_VALUE_TURN_OFF_THE_DISPLAY`: UInt = 8u;
public const val `POWER_ACTION_ACPI_CRITICAL`: UInt = 16777216u;
public const val `POWER_ACTION_ACPI_USER_NOTIFY`: UInt = 33554432u;
public const val `POWER_ACTION_CRITICAL`: UInt = 2147483648u;
public const val `POWER_ACTION_DIRECTED_DRIPS`: UInt = 67108864u;
public const val `POWER_ACTION_DISABLE_WAKES`: UInt = 1073741824u;
public const val `POWER_ACTION_DOZE_TO_HIBERNATE`: UInt = 32u;
public const val `POWER_ACTION_HIBERBOOT`: UInt = 8u;
public const val `POWER_ACTION_LIGHTEST_FIRST`: UInt = 268435456u;
public const val `POWER_ACTION_LOCK_CONSOLE`: UInt = 536870912u;
public const val `POWER_ACTION_OVERRIDE_APPS`: UInt = 4u;
public const val `POWER_ACTION_PSEUDO_TRANSITION`: UInt = 134217728u;
public const val `POWER_ACTION_QUERY_ALLOWED`: UInt = 1u;
public const val `POWER_ACTION_UI_ALLOWED`: UInt = 2u;
public const val `POWER_ACTION_USER_NOTIFY`: UInt = 16u;
public const val `POWER_CONNECTIVITY_IN_STANDBY_DISABLED`: UInt = 0u;
public const val `POWER_CONNECTIVITY_IN_STANDBY_ENABLED`: UInt = 1u;
public const val `POWER_CONNECTIVITY_IN_STANDBY_SYSTEM_MANAGED`: UInt = 2u;
public const val `POWER_DEVICE_IDLE_POLICY_CONSERVATIVE`: UInt = 1u;
public const val `POWER_DEVICE_IDLE_POLICY_PERFORMANCE`: UInt = 0u;
public const val `POWER_DISCONNECTED_STANDBY_MODE_AGGRESSIVE`: UInt = 1u;
public const val `POWER_DISCONNECTED_STANDBY_MODE_NORMAL`: UInt = 0u;
public const val `POWER_REQUEST_CONTEXT_VERSION`: UInt = 0u;
public const val `POWER_SETTING_VALUE_VERSION`: UInt = 1u;
public const val `POWER_SYSTEM_MAXIMUM`: UInt = 7u;
public const val `POWER_USER_NOTIFY_FORCED_SHUTDOWN`: UInt = 32u;
public const val `PO_THROTTLE_ADAPTIVE`: UInt = 3u;
public const val `PO_THROTTLE_CONSTANT`: UInt = 1u;
public const val `PO_THROTTLE_DEGRADE`: UInt = 2u;
public const val `PO_THROTTLE_MAXIMUM`: UInt = 4u;
public const val `PO_THROTTLE_NONE`: UInt = 0u;
public const val `PRAGMA_DEPRECATED_DDK`: UInt = 1u;
public const val `PRIVILEGE_SET_ALL_NECESSARY`: UInt = 1u;
public const val `PROCESSOR_ALPHA_21064`: UInt = 21064u;
public const val `PROCESSOR_AMD_X8664`: UInt = 8664u;
public const val `PROCESSOR_ARM720`: UInt = 1824u;
public const val `PROCESSOR_ARM820`: UInt = 2080u;
public const val `PROCESSOR_ARM920`: UInt = 2336u;
public const val `PROCESSOR_ARM_7TDMI`: UInt = 70001u;
public const val `PROCESSOR_DUTY_CYCLING_DISABLED`: UInt = 0u;
public const val `PROCESSOR_DUTY_CYCLING_ENABLED`: UInt = 1u;
public const val `PROCESSOR_HITACHI_SH3`: UInt = 10003u;
public const val `PROCESSOR_HITACHI_SH3E`: UInt = 10004u;
public const val `PROCESSOR_HITACHI_SH4`: UInt = 10005u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSOR_IDLESTATE_INFO` (
    public var `TimeCheck`: UInt,
    public var `DemotePercent`: UByte,
    public var `PromotePercent`: UByte,
    public var `Spare`: UByteArray,
)
// UNSUPPORTED Rust 2914:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_IDLESTATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSOR_IDLESTATE_POLICY` (
    public var `Revision`: UShort,
    public var `Flags`: `PROCESSOR_IDLESTATE_POLICY_0`,
    public var `PolicyCount`: UInt,
    public var `Policy`: Array<`PROCESSOR_IDLESTATE_INFO`>,
)
// UNSUPPORTED Rust 2927:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_IDLESTATE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2932:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESSOR_IDLESTATE_POLICY_0 {
//     pub AsWORD: u16,
//     pub Anonymous: PROCESSOR_IDLESTATE_POLICY_0_0,
// }

// UNSUPPORTED Rust 2938:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_IDLESTATE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSOR_IDLESTATE_POLICY_0_0` (
    public var `_bitfield`: UShort,
)
public const val `PROCESSOR_IDLESTATE_POLICY_COUNT`: UInt = 3u;
public const val `PROCESSOR_INTEL_386`: UInt = 386u;
public const val `PROCESSOR_INTEL_486`: UInt = 486u;
public const val `PROCESSOR_INTEL_IA64`: UInt = 2200u;
public const val `PROCESSOR_INTEL_PENTIUM`: UInt = 586u;
public const val `PROCESSOR_MIPS_R4000`: UInt = 4000u;
public const val `PROCESSOR_MOTOROLA_821`: UInt = 821u;
public const val `PROCESSOR_OPTIL`: UInt = 18767u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSOR_PERFSTATE_POLICY` (
    public var `Revision`: UInt,
    public var `MaxThrottle`: UByte,
    public var `MinThrottle`: UByte,
    public var `BusyAdjThreshold`: UByte,
    public var `Anonymous`: `PROCESSOR_PERFSTATE_POLICY_0`,
    public var `TimeCheck`: UInt,
    public var `IncreaseTime`: UInt,
    public var `DecreaseTime`: UInt,
    public var `IncreasePercent`: UInt,
    public var `DecreasePercent`: UInt,
)
// UNSUPPORTED Rust 2970:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_PERFSTATE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2975:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESSOR_PERFSTATE_POLICY_0 {
//     pub Spare: u8,
//     pub Flags: PROCESSOR_PERFSTATE_POLICY_0_0,
// }

// UNSUPPORTED Rust 2981:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_PERFSTATE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2986:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESSOR_PERFSTATE_POLICY_0_0 {
//     pub AsBYTE: u8,
//     pub Anonymous: PROCESSOR_PERFSTATE_POLICY_0_0_0,
// }

// UNSUPPORTED Rust 2992:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_PERFSTATE_POLICY_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSOR_PERFSTATE_POLICY_0_0_0` (
    public var `_bitfield`: UByte,
)
public const val `PROCESSOR_PERF_AUTONOMOUS_MODE_DISABLED`: UInt = 0u;
public const val `PROCESSOR_PERF_AUTONOMOUS_MODE_ENABLED`: UInt = 1u;
public const val `PROCESSOR_PERF_BOOST_MODE_AGGRESSIVE`: UInt = 2u;
public const val `PROCESSOR_PERF_BOOST_MODE_AGGRESSIVE_AT_GUARANTEED`: UInt = 5u;
public const val `PROCESSOR_PERF_BOOST_MODE_DISABLED`: UInt = 0u;
public const val `PROCESSOR_PERF_BOOST_MODE_EFFICIENT_AGGRESSIVE`: UInt = 4u;
public const val `PROCESSOR_PERF_BOOST_MODE_EFFICIENT_AGGRESSIVE_AT_GUARANTEED`: UInt = 6u;
public const val `PROCESSOR_PERF_BOOST_MODE_EFFICIENT_ENABLED`: UInt = 3u;
public const val `PROCESSOR_PERF_BOOST_MODE_ENABLED`: UInt = 1u;
public const val `PROCESSOR_PERF_BOOST_MODE_MAX`: UInt = 6u;
public const val `PROCESSOR_PERF_BOOST_POLICY_DISABLED`: UInt = 0u;
public const val `PROCESSOR_PERF_BOOST_POLICY_MAX`: UInt = 100u;
public const val `PROCESSOR_PERF_ENERGY_PREFERENCE`: UInt = 0u;
public const val `PROCESSOR_PERF_MAXIMUM_ACTIVITY_WINDOW`: UInt = 1270000000u;
public const val `PROCESSOR_PERF_MINIMUM_ACTIVITY_WINDOW`: UInt = 0u;
public const val `PROCESSOR_PERF_PERFORMANCE_PREFERENCE`: UInt = 255u;
public const val `PROCESSOR_PPC_601`: UInt = 601u;
public const val `PROCESSOR_PPC_603`: UInt = 603u;
public const val `PROCESSOR_PPC_604`: UInt = 604u;
public const val `PROCESSOR_PPC_620`: UInt = 620u;
public const val `PROCESSOR_SHx_SH3`: UInt = 103u;
public const val `PROCESSOR_SHx_SH4`: UInt = 104u;
public const val `PROCESSOR_STRONGARM`: UInt = 2577u;
public const val `PROCESSOR_THROTTLE_AUTOMATIC`: UInt = 2u;
public const val `PROCESSOR_THROTTLE_DISABLED`: UInt = 0u;
public const val `PROCESSOR_THROTTLE_ENABLED`: UInt = 1u;
public const val `PROCESS_HEAP_ENTRY_BUSY`: UInt = 4u;
public const val `PROCESS_HEAP_ENTRY_DDESHARE`: UInt = 32u;
public const val `PROCESS_HEAP_ENTRY_MOVEABLE`: UInt = 16u;
public const val `PROCESS_HEAP_REGION`: UInt = 1u;
public const val `PROCESS_HEAP_SEG_ALLOC`: UInt = 8u;
public const val `PROCESS_HEAP_UNCOMMITTED_RANGE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0`,
)
// UNSUPPORTED Rust 3039:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3044:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0_0,
// }

// UNSUPPORTED Rust 3050:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_ASLR_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_ASLR_POLICY_0`,
)
// UNSUPPORTED Rust 3065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_ASLR_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3070:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_ASLR_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_ASLR_POLICY_0_0,
// }

// UNSUPPORTED Rust 3076:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_ASLR_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_ASLR_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0`,
)
// UNSUPPORTED Rust 3091:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3096:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0_0,
// }

// UNSUPPORTED Rust 3102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_CHILD_PROCESS_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0`,
)
// UNSUPPORTED Rust 3117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_CHILD_PROCESS_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3122:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0_0,
// }

// UNSUPPORTED Rust 3128:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0`,
)
// UNSUPPORTED Rust 3143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3148:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0_0,
// }

// UNSUPPORTED Rust 3154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_DEP_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_DEP_POLICY_0`,
    public var `Permanent`: Boolean,
)
// UNSUPPORTED Rust 3170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_DEP_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3175:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_DEP_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_DEP_POLICY_0_0,
// }

// UNSUPPORTED Rust 3181:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_DEP_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_DEP_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_DYNAMIC_CODE_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0`,
)
// UNSUPPORTED Rust 3196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_DYNAMIC_CODE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3201:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0_0,
// }

// UNSUPPORTED Rust 3207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0`,
)
// UNSUPPORTED Rust 3222:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3227:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0_0,
// }

// UNSUPPORTED Rust 3233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_FONT_DISABLE_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_FONT_DISABLE_POLICY_0`,
)
// UNSUPPORTED Rust 3248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_FONT_DISABLE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3253:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_FONT_DISABLE_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_FONT_DISABLE_POLICY_0_0,
// }

// UNSUPPORTED Rust 3259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_FONT_DISABLE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_FONT_DISABLE_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_IMAGE_LOAD_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0`,
)
// UNSUPPORTED Rust 3274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_IMAGE_LOAD_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3279:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0_0,
// }

// UNSUPPORTED Rust 3285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0`,
)
// UNSUPPORTED Rust 3300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3305:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0_0,
// }

// UNSUPPORTED Rust 3311:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0`,
)
// UNSUPPORTED Rust 3326:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3331:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0_0,
// }

// UNSUPPORTED Rust 3337:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_SEHOP_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_SEHOP_POLICY_0`,
)
// UNSUPPORTED Rust 3352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SEHOP_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3357:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_SEHOP_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_SEHOP_POLICY_0_0,
// }

// UNSUPPORTED Rust 3363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SEHOP_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_SEHOP_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0`,
)
// UNSUPPORTED Rust 3378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3383:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0_0,
// }

// UNSUPPORTED Rust 3389:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0`,
)
// UNSUPPORTED Rust 3404:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3409:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0_0,
// }

// UNSUPPORTED Rust 3415:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0`,
)
// UNSUPPORTED Rust 3430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3435:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0_0,
// }

// UNSUPPORTED Rust 3441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0`,
)
// UNSUPPORTED Rust 3456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3461:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0_0,
// }

// UNSUPPORTED Rust 3467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0`,
)
// UNSUPPORTED Rust 3482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3487:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0_0,
// }

// UNSUPPORTED Rust 3493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY` (
    public var `Anonymous`: `PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0`,
)
// UNSUPPORTED Rust 3508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3513:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0 {
//     pub Flags: u32,
//     pub Anonymous: PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0_0,
// }

// UNSUPPORTED Rust 3519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0_0` (
    public var `_bitfield`: UInt,
)
public const val `PROCESS_TRUST_LABEL_SECURITY_INFORMATION`: Int = 128;
public const val `PROC_IDLE_BUCKET_COUNT`: UInt = 6u;
public const val `PROC_IDLE_BUCKET_COUNT_EX`: UInt = 16u;
public const val `PRODUCT_ARM64_SERVER`: UInt = 120u;
public const val `PRODUCT_AZURESTACKHCI_SERVER_CORE`: UInt = 406u;
public const val `PRODUCT_AZURE_NANO_SERVER`: UInt = 169u;
public const val `PRODUCT_AZURE_SERVER_CLOUDHOST`: UInt = 199u;
public const val `PRODUCT_AZURE_SERVER_CLOUDMOS`: UInt = 200u;
public const val `PRODUCT_AZURE_SERVER_CORE`: UInt = 168u;
public const val `PRODUCT_CLOUD`: UInt = 178u;
public const val `PRODUCT_CLOUDE`: UInt = 183u;
public const val `PRODUCT_CLOUDEDITION`: UInt = 203u;
public const val `PRODUCT_CLOUDEDITIONN`: UInt = 202u;
public const val `PRODUCT_CLOUDEN`: UInt = 186u;
public const val `PRODUCT_CLOUDN`: UInt = 179u;
public const val `PRODUCT_CLOUD_HOST_INFRASTRUCTURE_SERVER`: UInt = 124u;
public const val `PRODUCT_CLOUD_STORAGE_SERVER`: UInt = 110u;
public const val `PRODUCT_CONNECTED_CAR`: UInt = 117u;
public const val `PRODUCT_CORE_ARM`: UInt = 97u;
public const val `PRODUCT_CORE_CONNECTED`: UInt = 111u;
public const val `PRODUCT_CORE_CONNECTED_COUNTRYSPECIFIC`: UInt = 116u;
public const val `PRODUCT_CORE_CONNECTED_N`: UInt = 113u;
public const val `PRODUCT_CORE_CONNECTED_SINGLELANGUAGE`: UInt = 115u;
public const val `PRODUCT_DATACENTER_EVALUATION_SERVER_CORE`: UInt = 159u;
public const val `PRODUCT_DATACENTER_NANO_SERVER`: UInt = 143u;
public const val `PRODUCT_DATACENTER_SERVER_AZURE_EDITION`: UInt = 407u;
public const val `PRODUCT_DATACENTER_SERVER_CORE_AZURE_EDITION`: UInt = 408u;
public const val `PRODUCT_DATACENTER_WS_SERVER_CORE`: UInt = 147u;
public const val `PRODUCT_EMBEDDED`: UInt = 65u;
public const val `PRODUCT_EMBEDDED_A`: UInt = 88u;
public const val `PRODUCT_EMBEDDED_AUTOMOTIVE`: UInt = 85u;
public const val `PRODUCT_EMBEDDED_E`: UInt = 90u;
public const val `PRODUCT_EMBEDDED_EVAL`: UInt = 107u;
public const val `PRODUCT_EMBEDDED_E_EVAL`: UInt = 108u;
public const val `PRODUCT_EMBEDDED_INDUSTRY`: UInt = 89u;
public const val `PRODUCT_EMBEDDED_INDUSTRY_A`: UInt = 86u;
public const val `PRODUCT_EMBEDDED_INDUSTRY_A_E`: UInt = 92u;
public const val `PRODUCT_EMBEDDED_INDUSTRY_E`: UInt = 91u;
public const val `PRODUCT_EMBEDDED_INDUSTRY_EVAL`: UInt = 105u;
public const val `PRODUCT_EMBEDDED_INDUSTRY_E_EVAL`: UInt = 106u;
public const val `PRODUCT_ENTERPRISEG`: UInt = 171u;
public const val `PRODUCT_ENTERPRISEGN`: UInt = 172u;
public const val `PRODUCT_ENTERPRISE_SUBSCRIPTION`: UInt = 140u;
public const val `PRODUCT_ENTERPRISE_SUBSCRIPTION_N`: UInt = 141u;
public const val `PRODUCT_HOLOGRAPHIC`: UInt = 135u;
public const val `PRODUCT_HOLOGRAPHIC_BUSINESS`: UInt = 136u;
public const val `PRODUCT_HUBOS`: UInt = 180u;
public const val `PRODUCT_INDUSTRY_HANDHELD`: UInt = 118u;
public const val `PRODUCT_IOTEDGEOS`: UInt = 187u;
public const val `PRODUCT_IOTENTERPRISE`: UInt = 188u;
public const val `PRODUCT_IOTENTERPRISES`: UInt = 191u;
public const val `PRODUCT_IOTOS`: UInt = 185u;
public const val `PRODUCT_LITE`: UInt = 189u;
public const val `PRODUCT_NANO_SERVER`: UInt = 109u;
public const val `PRODUCT_ONECOREUPDATEOS`: UInt = 182u;
public const val `PRODUCT_PPI_PRO`: UInt = 119u;
public const val `PRODUCT_PROFESSIONAL_EMBEDDED`: UInt = 58u;
public const val `PRODUCT_PROFESSIONAL_S`: UInt = 127u;
public const val `PRODUCT_PROFESSIONAL_STUDENT`: UInt = 112u;
public const val `PRODUCT_PROFESSIONAL_STUDENT_N`: UInt = 114u;
public const val `PRODUCT_PROFESSIONAL_S_N`: UInt = 128u;
public const val `PRODUCT_PRO_CHINA`: UInt = 139u;
public const val `PRODUCT_PRO_FOR_EDUCATION`: UInt = 164u;
public const val `PRODUCT_PRO_FOR_EDUCATION_N`: UInt = 165u;
public const val `PRODUCT_PRO_SINGLE_LANGUAGE`: UInt = 138u;
public const val `PRODUCT_SERVERRDSH`: UInt = 175u;
public const val `PRODUCT_SOLUTION_EMBEDDEDSERVER_CORE`: UInt = 57u;
public const val `PRODUCT_STANDARD_EVALUATION_SERVER_CORE`: UInt = 160u;
public const val `PRODUCT_STANDARD_NANO_SERVER`: UInt = 144u;
public const val `PRODUCT_STANDARD_SERVER_CORE`: UInt = 13u;
public const val `PRODUCT_STANDARD_WS_SERVER_CORE`: UInt = 148u;
public const val `PRODUCT_THINPC`: UInt = 87u;
public const val `PRODUCT_UNLICENSED`: UInt = 2882382797u;
public const val `PRODUCT_UTILITY_VM`: UInt = 149u;
public const val `PRODUCT_XBOX_DURANGOHOSTOS`: UInt = 196u;
public const val `PRODUCT_XBOX_ERAOS`: UInt = 195u;
public const val `PRODUCT_XBOX_GAMEOS`: UInt = 194u;
public const val `PRODUCT_XBOX_KEYSTONE`: UInt = 198u;
public const val `PRODUCT_XBOX_SCARLETTHOSTOS`: UInt = 197u;
public const val `PRODUCT_XBOX_SYSTEMOS`: UInt = 192u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public typealias `PTERMINATION_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public typealias `PTERMINATION_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Boolean, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PUMS_SCHEDULER_ENTRY_POINT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`RTL_UMS_SCHEDULER_REASON`, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `PcTeb`: UInt = 24u;
public const val `PdataCrChained`: `ARM64_FNPDATA_CR` = 3;
public const val `PdataCrChainedWithPac`: `ARM64_FNPDATA_CR` = 2;
public const val `PdataCrUnchained`: `ARM64_FNPDATA_CR` = 0;
public const val `PdataCrUnchainedSavedLr`: `ARM64_FNPDATA_CR` = 1;
public const val `PdataPackedUnwindFragment`: `ARM64_FNPDATA_FLAGS` = 2;
public const val `PdataPackedUnwindFunction`: `ARM64_FNPDATA_FLAGS` = 1;
public const val `PdataRefToFullXdata`: `ARM64_FNPDATA_FLAGS` = 0;
public const val `PowerMonitorDim`: `MONITOR_DISPLAY_STATE` = 2;
public const val `PowerMonitorOff`: `MONITOR_DISPLAY_STATE` = 0;
public const val `PowerMonitorOn`: `MONITOR_DISPLAY_STATE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUOTA_LIMITS_EX` (
    public var `PagedPoolLimit`: ULong,
    public var `NonPagedPoolLimit`: ULong,
    public var `MinimumWorkingSetSize`: ULong,
    public var `MaximumWorkingSetSize`: ULong,
    public var `PagefileLimit`: ULong,
    public var `TimeLimit`: Long,
    public var `WorkingSetLimit`: ULong,
    public var `Reserved2`: ULong,
    public var `Reserved3`: ULong,
    public var `Reserved4`: ULong,
    public var `Flags`: UInt,
    public var `CpuRateLimit`: `RATE_QUOTA_LIMIT`,
)
// UNSUPPORTED Rust 3641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUOTA_LIMITS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `QUOTA_LIMITS_USE_DEFAULT_LIMITS`: UInt = 16u;
// UNSUPPORTED Rust 3647:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RATE_QUOTA_LIMIT {
//     pub RateData: u32,
//     pub Anonymous: RATE_QUOTA_LIMIT_0,
// }

// UNSUPPORTED Rust 3653:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RATE_QUOTA_LIMIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RATE_QUOTA_LIMIT_0` (
    public var `_bitfield`: UInt,
)
public const val `READ_THREAD_PROFILING_FLAG_DISPATCHING`: UInt = 1u;
public const val `READ_THREAD_PROFILING_FLAG_HARDWARE_COUNTERS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REARRANGE_FILE_DATA` (
    public var `SourceStartingOffset`: ULong,
    public var `TargetOffset`: ULong,
    public var `SourceFileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 3674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REARRANGE_FILE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REARRANGE_FILE_DATA32` (
    public var `SourceStartingOffset`: ULong,
    public var `TargetOffset`: ULong,
    public var `SourceFileHandle`: UInt,
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
public const val `RECO_COPY`: `RECO_FLAGS` = 2u;
public const val `RECO_CUT`: `RECO_FLAGS` = 3u;
public const val `RECO_DRAG`: `RECO_FLAGS` = 4u;
public const val `RECO_DROP`: `RECO_FLAGS` = 1u;
public typealias `RECO_FLAGS` = UInt;
public const val `RECO_PASTE`: `RECO_FLAGS` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REDBOOK_DIGITAL_AUDIO_EXTRACTION_INFO` (
    public var `Version`: UInt,
    public var `Accurate`: UInt,
    public var `Supported`: UInt,
    public var `AccurateMask0`: UInt,
)
public const val `REDBOOK_DIGITAL_AUDIO_EXTRACTION_INFO_VERSION`: UInt = 1u;
public const val `REG_APP_HIVE`: Int = 16;
public const val `REG_APP_HIVE_OPEN_READ_ONLY`: Int = 8192;
public const val `REG_BOOT_HIVE`: Int = 1024;
public const val `REG_FLUSH_HIVE_FILE_GROWTH`: Int = 4096;
public const val `REG_FORCE_UNLOAD`: UInt = 1u;
public const val `REG_HIVE_EXACT_FILE_GROWTH`: Int = 128;
public const val `REG_HIVE_NO_RM`: Int = 256;
public const val `REG_HIVE_SINGLE_LOG`: Int = 512;
public const val `REG_IMMUTABLE`: Int = 16384;
public const val `REG_LOAD_HIVE_OPEN_HANDLE`: Int = 2048;
public const val `REG_NO_IMPERSONATION_FALLBACK`: Int = 32768;
public const val `REG_NO_LAZY_FLUSH`: Int = 4;
public const val `REG_OPEN_READ_ONLY`: Int = 8192;
public const val `REG_PROCESS_PRIVATE`: Int = 32;
public const val `REG_REFRESH_HIVE`: Int = 2;
public const val `REG_START_JOURNAL`: Int = 64;
public const val `REG_UNLOAD_LEGAL_FLAGS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESOURCEMANAGER_BASIC_INFORMATION` (
    public var `ResourceManagerId`: `windows_sys`.`core`.`GUID`,
    public var `DescriptionLength`: UInt,
    public var `Description`: UShortArray,
)
// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESOURCEMANAGER_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RESOURCEMANAGER_COMPLETE_PROPAGATION`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESOURCEMANAGER_COMPLETION_INFORMATION` (
    public var `IoCompletionPortHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CompletionKey`: ULong,
)
// UNSUPPORTED Rust 3740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESOURCEMANAGER_COMPLETION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RESOURCEMANAGER_ENLIST`: UInt = 8u;
public const val `RESOURCEMANAGER_GET_NOTIFICATION`: UInt = 16u;
public typealias `RESOURCEMANAGER_INFORMATION_CLASS` = Int;
public const val `RESOURCEMANAGER_QUERY_INFORMATION`: UInt = 1u;
public const val `RESOURCEMANAGER_RECOVER`: UInt = 4u;
public const val `RESOURCEMANAGER_REGISTER_PROTOCOL`: UInt = 32u;
public const val `RESOURCEMANAGER_SET_INFORMATION`: UInt = 2u;
public const val `ROT_COMPARE_MAX`: UInt = 2048u;
public typealias `RTL_UMS_SCHEDULER_REASON` = Int;
public const val `RTL_UMS_VERSION`: UInt = 256u;
public const val `RTL_VIRTUAL_UNWIND2_VALIDATE_PAC`: UInt = 1u;
public const val `RUNTIME_FUNCTION_INDIRECT`: UInt = 1u;
public const val `RecognizerType`: `SERVICE_NODE_TYPE` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHBITMAP` (
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHBITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHBRUSH` (
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHBRUSH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHENHMETAFILE` (
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3786:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHENHMETAFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHGLOBAL` (
    public var `fNullHGlobal`: Int,
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHGLOBAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHMETAFILEPICT` (
    public var `mm`: Int,
    public var `xExt`: Int,
    public var `yExt`: Int,
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHMETAFILEPICT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemHPALETTE` (
    public var `cbData`: UInt,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 3823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemHPALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemotableHandle` (
    public var `fContext`: Int,
    public var `u`: `RemotableHandle_0`,
)
// UNSUPPORTED Rust 3834:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemotableHandle {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3839:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RemotableHandle_0 {
//     pub hInproc: i32,
//     pub hRemote: i32,
// }

// UNSUPPORTED Rust 3845:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemotableHandle_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ReplacesCorHdrNumericDefines` = Int;
public const val `ResourceManagerBasicInformation`: `RESOURCEMANAGER_INFORMATION_CLASS` = 0;
public const val `ResourceManagerCompletionInformation`: `RESOURCEMANAGER_INFORMATION_CLASS` = 1;
public const val `RunlevelInformationInActivationContext`: `ACTIVATION_CONTEXT_INFO_CLASS` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCOPE_TABLE_AMD64` (
    public var `Count`: UInt,
    public var `ScopeRecord`: Array<`SCOPE_TABLE_AMD64_0`>,
)
// UNSUPPORTED Rust 3860:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCOPE_TABLE_AMD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_TABLE_AMD64_0` (
    public var `BeginAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `HandlerAddress`: UInt,
    public var `JumpTarget`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCOPE_TABLE_ARM` (
    public var `Count`: UInt,
    public var `ScopeRecord`: Array<`SCOPE_TABLE_ARM_0`>,
)
// UNSUPPORTED Rust 3879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCOPE_TABLE_ARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_TABLE_ARM_0` (
    public var `BeginAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `HandlerAddress`: UInt,
    public var `JumpTarget`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCOPE_TABLE_ARM64` (
    public var `Count`: UInt,
    public var `ScopeRecord`: Array<`SCOPE_TABLE_ARM64_0`>,
)
// UNSUPPORTED Rust 3898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCOPE_TABLE_ARM64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_TABLE_ARM64_0` (
    public var `BeginAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `HandlerAddress`: UInt,
    public var `JumpTarget`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 41 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1040 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCRUB_DATA_INPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `MaximumIos`: UInt,
    public var `ObjectId`: UIntArray,
    public var `Reserved`: UIntArray,
    public var `ResumeContext`: UByteArray,
)
// UNSUPPORTED Rust 3921:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCRUB_DATA_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCRUB_DATA_INPUT_FLAG_IGNORE_REDUNDANCY`: UInt = 8u;
public const val `SCRUB_DATA_INPUT_FLAG_OPLOCK_NOT_ACQUIRED`: UInt = 64u;
public const val `SCRUB_DATA_INPUT_FLAG_RESUME`: UInt = 1u;
public const val `SCRUB_DATA_INPUT_FLAG_SCRUB_BY_OBJECT_ID`: UInt = 32u;
public const val `SCRUB_DATA_INPUT_FLAG_SKIP_DATA`: UInt = 16u;
public const val `SCRUB_DATA_INPUT_FLAG_SKIP_IN_SYNC`: UInt = 2u;
public const val `SCRUB_DATA_INPUT_FLAG_SKIP_NON_INTEGRITY_DATA`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1040 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCRUB_DATA_OUTPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Status`: UInt,
    public var `ErrorFileOffset`: ULong,
    public var `ErrorLength`: ULong,
    public var `NumberOfBytesRepaired`: ULong,
    public var `NumberOfBytesFailed`: ULong,
    public var `InternalFileReference`: ULong,
    public var `ResumeContextLength`: UShort,
    public var `ParityExtentDataOffset`: UShort,
    public var `Reserved`: UIntArray,
    public var `NumberOfMetadataBytesProcessed`: ULong,
    public var `NumberOfDataBytesProcessed`: ULong,
    public var `TotalNumberOfMetadataBytesInUse`: ULong,
    public var `TotalNumberOfDataBytesInUse`: ULong,
    public var `DataBytesSkippedDueToNoAllocation`: ULong,
    public var `DataBytesSkippedDueToInvalidRun`: ULong,
    public var `DataBytesSkippedDueToIntegrityStream`: ULong,
    public var `DataBytesSkippedDueToRegionBeingClean`: ULong,
    public var `DataBytesSkippedDueToLockConflict`: ULong,
    public var `DataBytesSkippedDueToNoScrubDataFlag`: ULong,
    public var `DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag`: ULong,
    public var `DataBytesScrubbed`: ULong,
    public var `ResumeContext`: UByteArray,
)
// UNSUPPORTED Rust 3961:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCRUB_DATA_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCRUB_DATA_OUTPUT_FLAG_INCOMPLETE`: UInt = 1u;
public const val `SCRUB_DATA_OUTPUT_FLAG_NON_USER_DATA_RANGE`: UInt = 65536u;
public const val `SCRUB_DATA_OUTPUT_FLAG_PARITY_EXTENT_DATA_RETURNED`: UInt = 131072u;
public const val `SCRUB_DATA_OUTPUT_FLAG_RESUME_CONTEXT_LENGTH_SPECIFIED`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCRUB_PARITY_EXTENT` (
    public var `Offset`: Long,
    public var `Length`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCRUB_PARITY_EXTENT_DATA` (
    public var `Size`: UShort,
    public var `Flags`: UShort,
    public var `NumberOfParityExtents`: UShort,
    public var `MaximumNumberOfParityExtents`: UShort,
    public var `ParityExtents`: Array<`SCRUB_PARITY_EXTENT`>,
)
// UNSUPPORTED Rust 3985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCRUB_PARITY_EXTENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECURITY_ANONYMOUS_LOGON_RID`: Int = 7;
public const val `SECURITY_APPPOOL_ID_BASE_RID`: Int = 82;
public const val `SECURITY_APPPOOL_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_APP_PACKAGE_BASE_RID`: Int = 2;
public const val `SECURITY_APP_PACKAGE_RID_COUNT`: Int = 8;
public const val `SECURITY_AUTHENTICATED_USER_RID`: Int = 11;
public const val `SECURITY_AUTHENTICATION_AUTHORITY_ASSERTED_RID`: Int = 1;
public const val `SECURITY_AUTHENTICATION_AUTHORITY_RID_COUNT`: Int = 1;
public const val `SECURITY_AUTHENTICATION_FRESH_KEY_AUTH_RID`: Int = 3;
public const val `SECURITY_AUTHENTICATION_KEY_PROPERTY_ATTESTATION_RID`: Int = 6;
public const val `SECURITY_AUTHENTICATION_KEY_PROPERTY_MFA_RID`: Int = 5;
public const val `SECURITY_AUTHENTICATION_KEY_TRUST_RID`: Int = 4;
public const val `SECURITY_AUTHENTICATION_SERVICE_ASSERTED_RID`: Int = 2;
public const val `SECURITY_BATCH_RID`: Int = 3;
public const val `SECURITY_BUILTIN_APP_PACKAGE_RID_COUNT`: Int = 2;
public const val `SECURITY_BUILTIN_CAPABILITY_RID_COUNT`: Int = 2;
public const val `SECURITY_BUILTIN_DOMAIN_RID`: Int = 32;
public const val `SECURITY_BUILTIN_PACKAGE_ANY_PACKAGE`: Int = 1;
public const val `SECURITY_BUILTIN_PACKAGE_ANY_RESTRICTED_PACKAGE`: Int = 2;
public const val `SECURITY_CAPABILITY_APPOINTMENTS`: Int = 11;
public const val `SECURITY_CAPABILITY_APP_RID`: Int = 1024;
public const val `SECURITY_CAPABILITY_APP_SILO_RID`: Int = 65536;
public const val `SECURITY_CAPABILITY_BASE_RID`: Int = 3;
public const val `SECURITY_CAPABILITY_CONTACTS`: Int = 12;
public const val `SECURITY_CAPABILITY_DOCUMENTS_LIBRARY`: Int = 7;
public const val `SECURITY_CAPABILITY_ENTERPRISE_AUTHENTICATION`: Int = 8;
public const val `SECURITY_CAPABILITY_INTERNET_CLIENT`: Int = 1;
public const val `SECURITY_CAPABILITY_INTERNET_CLIENT_SERVER`: Int = 2;
public const val `SECURITY_CAPABILITY_INTERNET_EXPLORER`: Int = 4096;
public const val `SECURITY_CAPABILITY_MUSIC_LIBRARY`: Int = 6;
public const val `SECURITY_CAPABILITY_PICTURES_LIBRARY`: Int = 4;
public const val `SECURITY_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER`: Int = 3;
public const val `SECURITY_CAPABILITY_REMOVABLE_STORAGE`: Int = 10;
public const val `SECURITY_CAPABILITY_RID_COUNT`: Int = 5;
public const val `SECURITY_CAPABILITY_SHARED_USER_CERTIFICATES`: Int = 9;
public const val `SECURITY_CAPABILITY_VIDEOS_LIBRARY`: Int = 5;
public const val `SECURITY_CCG_ID_BASE_RID`: Int = 95;
public const val `SECURITY_CHILD_PACKAGE_RID_COUNT`: Int = 12;
public const val `SECURITY_CLOUD_INFRASTRUCTURE_SERVICES_ID_BASE_RID`: Int = 85;
public const val `SECURITY_CLOUD_INFRASTRUCTURE_SERVICES_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_COM_ID_BASE_RID`: Int = 89;
public const val `SECURITY_CREATOR_GROUP_RID`: Int = 1;
public const val `SECURITY_CREATOR_GROUP_SERVER_RID`: Int = 3;
public const val `SECURITY_CREATOR_OWNER_RID`: Int = 0;
public const val `SECURITY_CREATOR_OWNER_RIGHTS_RID`: Int = 4;
public const val `SECURITY_CREATOR_OWNER_SERVER_RID`: Int = 2;
public const val `SECURITY_CRED_TYPE_BASE_RID`: Int = 65;
public const val `SECURITY_CRED_TYPE_RID_COUNT`: Int = 2;
public const val `SECURITY_CRED_TYPE_THIS_ORG_CERT_RID`: Int = 1;
public const val `SECURITY_DASHOST_ID_BASE_RID`: Int = 92;
public const val `SECURITY_DASHOST_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_DESCRIPTOR_REVISION`: UInt = 1u;
public const val `SECURITY_DESCRIPTOR_REVISION1`: UInt = 1u;
public const val `SECURITY_DIALUP_RID`: Int = 1;
public const val `SECURITY_ENTERPRISE_CONTROLLERS_RID`: Int = 9;
public const val `SECURITY_ENTERPRISE_READONLY_CONTROLLERS_RID`: Int = 22;
public const val `SECURITY_INSTALLER_CAPABILITY_RID_COUNT`: UInt = 10u;
public const val `SECURITY_INSTALLER_GROUP_CAPABILITY_BASE`: UInt = 32u;
public const val `SECURITY_INSTALLER_GROUP_CAPABILITY_RID_COUNT`: UInt = 9u;
public const val `SECURITY_INTERACTIVE_RID`: Int = 4;
public const val `SECURITY_IUSER_RID`: Int = 17;
public const val `SECURITY_LOCAL_ACCOUNT_AND_ADMIN_RID`: Int = 114;
public const val `SECURITY_LOCAL_ACCOUNT_RID`: Int = 113;
public const val `SECURITY_LOCAL_LOGON_RID`: Int = 1;
public const val `SECURITY_LOCAL_RID`: Int = 0;
public const val `SECURITY_LOCAL_SERVICE_RID`: Int = 19;
public const val `SECURITY_LOCAL_SYSTEM_RID`: Int = 18;
public const val `SECURITY_LOGON_IDS_RID`: Int = 5;
public const val `SECURITY_LOGON_IDS_RID_COUNT`: Int = 3;
public const val `SECURITY_MANDATORY_HIGH_RID`: Int = 12288;
public const val `SECURITY_MANDATORY_LOW_RID`: Int = 4096;
public const val `SECURITY_MANDATORY_MAXIMUM_USER_RID`: Int = 16384;
public const val `SECURITY_MANDATORY_MEDIUM_PLUS_RID`: UInt = 8448u;
public const val `SECURITY_MANDATORY_MEDIUM_RID`: Int = 8192;
public const val `SECURITY_MANDATORY_PROTECTED_PROCESS_RID`: Int = 20480;
public const val `SECURITY_MANDATORY_SYSTEM_RID`: Int = 16384;
public const val `SECURITY_MANDATORY_UNTRUSTED_RID`: Int = 0;
public const val `SECURITY_MAX_ALWAYS_FILTERED`: Int = 999;
public const val `SECURITY_MAX_BASE_RID`: Int = 111;
public const val `SECURITY_MIN_BASE_RID`: Int = 80;
public const val `SECURITY_MIN_NEVER_FILTERED`: Int = 1000;
public const val `SECURITY_NETWORK_RID`: Int = 2;
public const val `SECURITY_NETWORK_SERVICE_RID`: Int = 20;
public const val `SECURITY_NFS_ID_BASE_RID`: Int = 88;
public const val `SECURITY_NT_NON_UNIQUE`: Int = 21;
public const val `SECURITY_NT_NON_UNIQUE_SUB_AUTH_COUNT`: Int = 3;
public const val `SECURITY_NULL_RID`: Int = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECURITY_OBJECT_AI_PARAMS` (
    public var `Size`: UInt,
    public var `ConstraintMask`: UInt,
)
public const val `SECURITY_OTHER_ORGANIZATION_RID`: Int = 1000;
public const val `SECURITY_PACKAGE_BASE_RID`: Int = 64;
public const val `SECURITY_PACKAGE_DIGEST_RID`: Int = 21;
public const val `SECURITY_PACKAGE_NTLM_RID`: Int = 10;
public const val `SECURITY_PACKAGE_RID_COUNT`: Int = 2;
public const val `SECURITY_PACKAGE_SCHANNEL_RID`: Int = 14;
public const val `SECURITY_PARENT_PACKAGE_RID_COUNT`: Int = 8;
public const val `SECURITY_PRINCIPAL_SELF_RID`: Int = 10;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_ANTIMALWARE_RID`: Int = 1536;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_APP_RID`: Int = 2048;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_AUTHENTICODE_RID`: Int = 1024;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_NONE_RID`: Int = 0;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_WINDOWS_RID`: Int = 4096;
public const val `SECURITY_PROCESS_PROTECTION_LEVEL_WINTCB_RID`: Int = 8192;
public const val `SECURITY_PROCESS_PROTECTION_TYPE_FULL_RID`: Int = 1024;
public const val `SECURITY_PROCESS_PROTECTION_TYPE_LITE_RID`: Int = 512;
public const val `SECURITY_PROCESS_PROTECTION_TYPE_NONE_RID`: Int = 0;
public const val `SECURITY_PROCESS_TRUST_AUTHORITY_RID_COUNT`: Int = 2;
public const val `SECURITY_PROXY_RID`: Int = 8;
public const val `SECURITY_RDV_GFX_BASE_RID`: Int = 91;
public const val `SECURITY_REMOTE_LOGON_RID`: Int = 14;
public const val `SECURITY_RESERVED_ID_BASE_RID`: Int = 81;
public const val `SECURITY_RESTRICTED_CODE_RID`: Int = 12;
public const val `SECURITY_SERVER_LOGON_RID`: Int = 9;
public const val `SECURITY_SERVICE_ID_BASE_RID`: Int = 80;
public const val `SECURITY_SERVICE_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_SERVICE_RID`: Int = 6;
public const val `SECURITY_TASK_ID_BASE_RID`: Int = 87;
public const val `SECURITY_TERMINAL_SERVER_RID`: Int = 13;
public const val `SECURITY_THIS_ORGANIZATION_RID`: Int = 15;
public const val `SECURITY_TRUSTED_INSTALLER_RID1`: UInt = 956008885u;
public const val `SECURITY_TRUSTED_INSTALLER_RID2`: UInt = 3418522649u;
public const val `SECURITY_TRUSTED_INSTALLER_RID3`: UInt = 1831038044u;
public const val `SECURITY_TRUSTED_INSTALLER_RID4`: UInt = 1853292631u;
public const val `SECURITY_TRUSTED_INSTALLER_RID5`: UInt = 2271478464u;
public const val `SECURITY_UMFD_BASE_RID`: Int = 96;
public const val `SECURITY_USERMANAGER_ID_BASE_RID`: Int = 93;
public const val `SECURITY_USERMANAGER_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_USERMODEDRIVERHOST_ID_BASE_RID`: Int = 84;
public const val `SECURITY_USERMODEDRIVERHOST_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_VIRTUALACCOUNT_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_VIRTUALSERVER_ID_BASE_RID`: Int = 83;
public const val `SECURITY_VIRTUALSERVER_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_WINDOWSMOBILE_ID_BASE_RID`: Int = 112;
public const val `SECURITY_WINDOW_MANAGER_BASE_RID`: Int = 90;
public const val `SECURITY_WINRM_ID_BASE_RID`: Int = 94;
public const val `SECURITY_WINRM_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_WMIHOST_ID_BASE_RID`: Int = 86;
public const val `SECURITY_WMIHOST_ID_RID_COUNT`: Int = 6;
public const val `SECURITY_WORLD_RID`: Int = 0;
public const val `SECURITY_WRITE_RESTRICTED_CODE_RID`: Int = 33;
public const val `SEC_HUGE_PAGES`: UInt = 131072u;
public const val `SEF_AI_USE_EXTRA_PARAMS`: UInt = 2048u;
public const val `SEF_FORCE_USER_MODE`: UInt = 8192u;
public const val `SEF_NORMALIZE_OUTPUT_DESCRIPTOR`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVERSILO_BASIC_INFORMATION` (
    public var `ServiceSessionId`: UInt,
    public var `State`: `SERVERSILO_STATE`,
    public var `ExitStatus`: UInt,
    public var `IsDownlevelContainer`: Boolean,
    public var `ApiSetSchema`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HostApiSetSchema`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERVERSILO_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVERSILO_INITING`: `SERVERSILO_STATE` = 0;
public const val `SERVERSILO_SHUTTING_DOWN`: `SERVERSILO_STATE` = 2;
public const val `SERVERSILO_STARTED`: `SERVERSILO_STATE` = 1;
public typealias `SERVERSILO_STATE` = Int;
public const val `SERVERSILO_TERMINATED`: `SERVERSILO_STATE` = 4;
public const val `SERVERSILO_TERMINATING`: `SERVERSILO_STATE` = 3;
public typealias `SERVICE_ERROR_TYPE` = Int;
public const val `SERVICE_INTERACTIVE_PROCESS`: UInt = 256u;
public typealias `SERVICE_LOAD_TYPE` = Int;
public typealias `SERVICE_NODE_TYPE` = Int;
public const val `SERVICE_PKG_SERVICE`: UInt = 512u;
public const val `SERVICE_USERSERVICE_INSTANCE`: UInt = 128u;
public const val `SERVICE_USER_SERVICE`: UInt = 64u;
public const val `SESSION_MODIFY_ACCESS`: UInt = 2u;
public const val `SESSION_QUERY_ACCESS`: UInt = 1u;
public const val `SE_ACCESS_CHECK_FLAG_NO_LEARNING_MODE_LOGGING`: UInt = 8u;
public const val `SE_ACCESS_CHECK_VALID_FLAGS`: UInt = 8u;
// UNSUPPORTED Rust 4170:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_ACTIVATE_AS_USER_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("activateAsUser");

// UNSUPPORTED Rust 4171:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_APP_SILO_PRINT_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("isolatedWin32-print");

// UNSUPPORTED Rust 4172:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_APP_SILO_PROFILES_ROOT_MINIMAL_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("isolatedWin32-profilesRootMinimal");

// UNSUPPORTED Rust 4173:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_APP_SILO_USER_PROFILE_MINIMAL_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("isolatedWin32-userProfileMinimal");

// UNSUPPORTED Rust 4174:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_APP_SILO_VOLUME_ROOT_MINIMAL_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("isolatedWin32-volumeRootMinimal");

// UNSUPPORTED Rust 4175:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_CONSTRAINED_IMPERSONATION_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("constrainedImpersonation");

// UNSUPPORTED Rust 4176:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_DEVELOPMENT_MODE_NETWORK_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("developmentModeNetwork");

public const val `SE_GROUP_ENABLED`: Int = 4;
public const val `SE_GROUP_ENABLED_BY_DEFAULT`: Int = 2;
public const val `SE_GROUP_INTEGRITY`: Int = 32;
public const val `SE_GROUP_INTEGRITY_ENABLED`: Int = 64;
public const val `SE_GROUP_LOGON_ID`: Int = -1073741824;
public const val `SE_GROUP_MANDATORY`: Int = 1;
public const val `SE_GROUP_OWNER`: Int = 8;
public const val `SE_GROUP_RESOURCE`: Int = 536870912;
public const val `SE_GROUP_USE_FOR_DENY_ONLY`: Int = 16;
public typealias `SE_IMAGE_SIGNATURE_TYPE` = Int;
// UNSUPPORTED Rust 4187:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_LEARNING_MODE_LOGGING_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("learningModeLogging");

// UNSUPPORTED Rust 4188:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_MUMA_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("muma");

// UNSUPPORTED Rust 4189:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_PERMISSIVE_LEARNING_MODE_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("permissiveLearningMode");

public const val `SE_SECURITY_DESCRIPTOR_FLAG_NO_ACCESS_FILTER_ACE`: UInt = 4u;
public const val `SE_SECURITY_DESCRIPTOR_FLAG_NO_LABEL_ACE`: UInt = 2u;
public const val `SE_SECURITY_DESCRIPTOR_FLAG_NO_OWNER_ACE`: UInt = 1u;
public const val `SE_SECURITY_DESCRIPTOR_VALID_FLAGS`: UInt = 7u;
// UNSUPPORTED Rust 4194:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SE_SESSION_IMPERSONATION_CAPABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("sessionImpersonation");

public const val `SE_SIGNING_LEVEL_ANTIMALWARE`: UInt = 7u;
public const val `SE_SIGNING_LEVEL_AUTHENTICODE`: UInt = 4u;
public const val `SE_SIGNING_LEVEL_CUSTOM_1`: UInt = 3u;
public const val `SE_SIGNING_LEVEL_CUSTOM_2`: UInt = 5u;
public const val `SE_SIGNING_LEVEL_CUSTOM_3`: UInt = 7u;
public const val `SE_SIGNING_LEVEL_CUSTOM_4`: UInt = 9u;
public const val `SE_SIGNING_LEVEL_CUSTOM_5`: UInt = 10u;
public const val `SE_SIGNING_LEVEL_CUSTOM_6`: UInt = 15u;
public const val `SE_SIGNING_LEVEL_CUSTOM_7`: UInt = 13u;
public const val `SE_SIGNING_LEVEL_DEVELOPER`: UInt = 3u;
public const val `SE_SIGNING_LEVEL_DYNAMIC_CODEGEN`: UInt = 11u;
public const val `SE_SIGNING_LEVEL_ENTERPRISE`: UInt = 2u;
public const val `SE_SIGNING_LEVEL_MICROSOFT`: UInt = 8u;
public const val `SE_SIGNING_LEVEL_STORE`: UInt = 6u;
public const val `SE_SIGNING_LEVEL_UNCHECKED`: UInt = 0u;
public const val `SE_SIGNING_LEVEL_UNSIGNED`: UInt = 1u;
public const val `SE_SIGNING_LEVEL_WINDOWS`: UInt = 12u;
public const val `SE_SIGNING_LEVEL_WINDOWS_TCB`: UInt = 14u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_TOKEN_USER` (
    public var `Anonymous1`: `SE_TOKEN_USER_0`,
    public var `Anonymous2`: `SE_TOKEN_USER_1`,
)
// UNSUPPORTED Rust 4220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SE_TOKEN_USER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4226:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union SE_TOKEN_USER_0 {
//     pub TokenUser: super::super::Security::TOKEN_USER,
//     pub User: super::super::Security::SID_AND_ATTRIBUTES,
// }

// UNSUPPORTED Rust 4233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SE_TOKEN_USER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4239:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union SE_TOKEN_USER_1 {
//     pub Sid: super::super::Security::SID,
//     pub Buffer: [u8; 68],
// }

// UNSUPPORTED Rust 4246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SE_TOKEN_USER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SFGAO_BROWSABLE`: `SFGAO_FLAGS` = 134217728u;
public const val `SFGAO_CANCOPY`: `SFGAO_FLAGS` = 1u;
public const val `SFGAO_CANDELETE`: `SFGAO_FLAGS` = 32u;
public const val `SFGAO_CANLINK`: `SFGAO_FLAGS` = 4u;
public const val `SFGAO_CANMONIKER`: `SFGAO_FLAGS` = 4194304u;
public const val `SFGAO_CANMOVE`: `SFGAO_FLAGS` = 2u;
public const val `SFGAO_CANRENAME`: `SFGAO_FLAGS` = 16u;
public const val `SFGAO_CAPABILITYMASK`: `SFGAO_FLAGS` = 375u;
public const val `SFGAO_COMPRESSED`: `SFGAO_FLAGS` = 67108864u;
public const val `SFGAO_CONTENTSMASK`: `SFGAO_FLAGS` = 2147483648u;
public const val `SFGAO_DISPLAYATTRMASK`: `SFGAO_FLAGS` = 1032192u;
public const val `SFGAO_DROPTARGET`: `SFGAO_FLAGS` = 256u;
public const val `SFGAO_ENCRYPTED`: `SFGAO_FLAGS` = 8192u;
public const val `SFGAO_FILESYSANCESTOR`: `SFGAO_FLAGS` = 268435456u;
public const val `SFGAO_FILESYSTEM`: `SFGAO_FLAGS` = 1073741824u;
public typealias `SFGAO_FLAGS` = UInt;
public const val `SFGAO_FOLDER`: `SFGAO_FLAGS` = 536870912u;
public const val `SFGAO_GHOSTED`: `SFGAO_FLAGS` = 32768u;
public const val `SFGAO_HASPROPSHEET`: `SFGAO_FLAGS` = 64u;
public const val `SFGAO_HASSTORAGE`: `SFGAO_FLAGS` = 4194304u;
public const val `SFGAO_HASSUBFOLDER`: `SFGAO_FLAGS` = 2147483648u;
public const val `SFGAO_HIDDEN`: `SFGAO_FLAGS` = 524288u;
public const val `SFGAO_ISSLOW`: `SFGAO_FLAGS` = 16384u;
public const val `SFGAO_LINK`: `SFGAO_FLAGS` = 65536u;
public const val `SFGAO_NEWCONTENT`: `SFGAO_FLAGS` = 2097152u;
public const val `SFGAO_NONENUMERATED`: `SFGAO_FLAGS` = 1048576u;
public const val `SFGAO_PKEYSFGAOMASK`: `SFGAO_FLAGS` = 2164539392u;
public const val `SFGAO_PLACEHOLDER`: `SFGAO_FLAGS` = 2048u;
public const val `SFGAO_READONLY`: `SFGAO_FLAGS` = 262144u;
public const val `SFGAO_REMOVABLE`: `SFGAO_FLAGS` = 33554432u;
public const val `SFGAO_SHARE`: `SFGAO_FLAGS` = 131072u;
public const val `SFGAO_STORAGE`: `SFGAO_FLAGS` = 8u;
public const val `SFGAO_STORAGEANCESTOR`: `SFGAO_FLAGS` = 8388608u;
public const val `SFGAO_STORAGECAPMASK`: `SFGAO_FLAGS` = 1891958792u;
public const val `SFGAO_STREAM`: `SFGAO_FLAGS` = 4194304u;
public const val `SFGAO_SYSTEM`: `SFGAO_FLAGS` = 4096u;
public const val `SFGAO_VALIDATE`: `SFGAO_FLAGS` = 16777216u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHARED_VIRTUAL_DISK_SUPPORT` (
    public var `SharedVirtualDiskSupport`: `SharedVirtualDiskSupportType`,
    public var `HandleState`: `SharedVirtualDiskHandleState`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHUFFLE_FILE_DATA` (
    public var `StartingOffset`: Long,
    public var `Length`: Long,
    public var `Flags`: UInt,
)
public const val `SHUFFLE_FILE_FLAG_SKIP_INITIALIZING_NEW_CLUSTERS`: UInt = 1u;
public const val `SID_HASH_SIZE`: UInt = 32u;
public const val `SID_MAX_SUB_AUTHORITIES`: UInt = 15u;
public const val `SID_RECOMMENDED_SUB_AUTHORITIES`: UInt = 1u;
public const val `SID_REVISION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SILOOBJECT_BASIC_INFORMATION` (
    public var `SiloId`: UInt,
    public var `SiloParentId`: UInt,
    public var `NumberOfProcesses`: UInt,
    public var `IsInServerSilo`: Boolean,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 4316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SILOOBJECT_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIZEOF_RFPO_DATA`: UInt = 16u;
public const val `SIZE_OF_80387_REGISTERS`: UInt = 80u;
// UNSUPPORTED Rust 4323:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SMB_CCF_APP_INSTANCE_EA_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("ClusteredApplicationInstance");

public const val `SMT_UNPARKING_POLICY_CORE`: UInt = 0u;
public const val `SMT_UNPARKING_POLICY_CORE_PER_THREAD`: UInt = 1u;
public const val `SMT_UNPARKING_POLICY_LP_ROUNDROBIN`: UInt = 2u;
public const val `SMT_UNPARKING_POLICY_LP_SEQUENTIAL`: UInt = 3u;
public const val `SORT_CHINESE_BIG5`: UInt = 0u;
public const val `SORT_CHINESE_BOPOMOFO`: UInt = 3u;
public const val `SORT_CHINESE_PRC`: UInt = 2u;
public const val `SORT_CHINESE_PRCP`: UInt = 0u;
public const val `SORT_CHINESE_RADICALSTROKE`: UInt = 4u;
public const val `SORT_CHINESE_UNICODE`: UInt = 1u;
public const val `SORT_DEFAULT`: UInt = 0u;
public const val `SORT_GEORGIAN_MODERN`: UInt = 1u;
public const val `SORT_GEORGIAN_TRADITIONAL`: UInt = 0u;
public const val `SORT_GERMAN_PHONE_BOOK`: UInt = 1u;
public const val `SORT_HUNGARIAN_DEFAULT`: UInt = 0u;
public const val `SORT_HUNGARIAN_TECHNICAL`: UInt = 1u;
public const val `SORT_INVARIANT_MATH`: UInt = 1u;
public const val `SORT_JAPANESE_RADICALSTROKE`: UInt = 4u;
public const val `SORT_JAPANESE_UNICODE`: UInt = 1u;
public const val `SORT_JAPANESE_XJIS`: UInt = 0u;
public const val `SORT_KOREAN_KSC`: UInt = 0u;
public const val `SORT_KOREAN_UNICODE`: UInt = 1u;
public const val `SS_BITMAP`: `STATIC_STYLES` = 14u;
public const val `SS_BLACKFRAME`: `STATIC_STYLES` = 7u;
public const val `SS_BLACKRECT`: `STATIC_STYLES` = 4u;
public const val `SS_CENTER`: `STATIC_STYLES` = 1u;
public const val `SS_CENTERIMAGE`: `STATIC_STYLES` = 512u;
public const val `SS_EDITCONTROL`: `STATIC_STYLES` = 8192u;
public const val `SS_ELLIPSISMASK`: `STATIC_STYLES` = 49152u;
public const val `SS_ENDELLIPSIS`: `STATIC_STYLES` = 16384u;
public const val `SS_ENHMETAFILE`: `STATIC_STYLES` = 15u;
public const val `SS_ETCHEDFRAME`: `STATIC_STYLES` = 18u;
public const val `SS_ETCHEDHORZ`: `STATIC_STYLES` = 16u;
public const val `SS_ETCHEDVERT`: `STATIC_STYLES` = 17u;
public const val `SS_GRAYFRAME`: `STATIC_STYLES` = 8u;
public const val `SS_GRAYRECT`: `STATIC_STYLES` = 5u;
public const val `SS_ICON`: `STATIC_STYLES` = 3u;
public const val `SS_LEFT`: `STATIC_STYLES` = 0u;
public const val `SS_LEFTNOWORDWRAP`: `STATIC_STYLES` = 12u;
public const val `SS_NOPREFIX`: `STATIC_STYLES` = 128u;
public const val `SS_NOTIFY`: `STATIC_STYLES` = 256u;
public const val `SS_OWNERDRAW`: `STATIC_STYLES` = 13u;
public const val `SS_PATHELLIPSIS`: `STATIC_STYLES` = 32768u;
public const val `SS_REALSIZECONTROL`: `STATIC_STYLES` = 64u;
public const val `SS_REALSIZEIMAGE`: `STATIC_STYLES` = 2048u;
public const val `SS_RIGHT`: `STATIC_STYLES` = 2u;
public const val `SS_RIGHTJUST`: `STATIC_STYLES` = 1024u;
public const val `SS_SIMPLE`: `STATIC_STYLES` = 11u;
public const val `SS_SUNKEN`: `STATIC_STYLES` = 4096u;
public const val `SS_TYPEMASK`: `STATIC_STYLES` = 31u;
public const val `SS_USERITEM`: `STATIC_STYLES` = 10u;
public const val `SS_WHITEFRAME`: `STATIC_STYLES` = 9u;
public const val `SS_WHITERECT`: `STATIC_STYLES` = 6u;
public const val `SS_WORDELLIPSIS`: `STATIC_STYLES` = 49152u;
public typealias `STATIC_STYLES` = UInt;
public const val `SUBLANG_AFRIKAANS_SOUTH_AFRICA`: UInt = 1u;
public const val `SUBLANG_ALBANIAN_ALBANIA`: UInt = 1u;
public const val `SUBLANG_ALSATIAN_FRANCE`: UInt = 1u;
public const val `SUBLANG_AMHARIC_ETHIOPIA`: UInt = 1u;
public const val `SUBLANG_ARABIC_ALGERIA`: UInt = 5u;
public const val `SUBLANG_ARABIC_BAHRAIN`: UInt = 15u;
public const val `SUBLANG_ARABIC_EGYPT`: UInt = 3u;
public const val `SUBLANG_ARABIC_IRAQ`: UInt = 2u;
public const val `SUBLANG_ARABIC_JORDAN`: UInt = 11u;
public const val `SUBLANG_ARABIC_KUWAIT`: UInt = 13u;
public const val `SUBLANG_ARABIC_LEBANON`: UInt = 12u;
public const val `SUBLANG_ARABIC_LIBYA`: UInt = 4u;
public const val `SUBLANG_ARABIC_MOROCCO`: UInt = 6u;
public const val `SUBLANG_ARABIC_OMAN`: UInt = 8u;
public const val `SUBLANG_ARABIC_QATAR`: UInt = 16u;
public const val `SUBLANG_ARABIC_SAUDI_ARABIA`: UInt = 1u;
public const val `SUBLANG_ARABIC_SYRIA`: UInt = 10u;
public const val `SUBLANG_ARABIC_TUNISIA`: UInt = 7u;
public const val `SUBLANG_ARABIC_UAE`: UInt = 14u;
public const val `SUBLANG_ARABIC_YEMEN`: UInt = 9u;
public const val `SUBLANG_ARMENIAN_ARMENIA`: UInt = 1u;
public const val `SUBLANG_ASSAMESE_INDIA`: UInt = 1u;
public const val `SUBLANG_AZERBAIJANI_AZERBAIJAN_CYRILLIC`: UInt = 2u;
public const val `SUBLANG_AZERBAIJANI_AZERBAIJAN_LATIN`: UInt = 1u;
public const val `SUBLANG_AZERI_CYRILLIC`: UInt = 2u;
public const val `SUBLANG_AZERI_LATIN`: UInt = 1u;
public const val `SUBLANG_BANGLA_BANGLADESH`: UInt = 2u;
public const val `SUBLANG_BANGLA_INDIA`: UInt = 1u;
public const val `SUBLANG_BASHKIR_RUSSIA`: UInt = 1u;
public const val `SUBLANG_BASQUE_BASQUE`: UInt = 1u;
public const val `SUBLANG_BELARUSIAN_BELARUS`: UInt = 1u;
public const val `SUBLANG_BENGALI_BANGLADESH`: UInt = 2u;
public const val `SUBLANG_BENGALI_INDIA`: UInt = 1u;
public const val `SUBLANG_BOSNIAN_BOSNIA_HERZEGOVINA_CYRILLIC`: UInt = 8u;
public const val `SUBLANG_BOSNIAN_BOSNIA_HERZEGOVINA_LATIN`: UInt = 5u;
public const val `SUBLANG_BRETON_FRANCE`: UInt = 1u;
public const val `SUBLANG_BULGARIAN_BULGARIA`: UInt = 1u;
public const val `SUBLANG_CATALAN_CATALAN`: UInt = 1u;
public const val `SUBLANG_CENTRAL_KURDISH_IRAQ`: UInt = 1u;
public const val `SUBLANG_CHEROKEE_CHEROKEE`: UInt = 1u;
public const val `SUBLANG_CHINESE_HONGKONG`: UInt = 3u;
public const val `SUBLANG_CHINESE_MACAU`: UInt = 5u;
public const val `SUBLANG_CHINESE_SIMPLIFIED`: UInt = 2u;
public const val `SUBLANG_CHINESE_SINGAPORE`: UInt = 4u;
public const val `SUBLANG_CHINESE_TRADITIONAL`: UInt = 1u;
public const val `SUBLANG_CORSICAN_FRANCE`: UInt = 1u;
public const val `SUBLANG_CROATIAN_BOSNIA_HERZEGOVINA_LATIN`: UInt = 4u;
public const val `SUBLANG_CROATIAN_CROATIA`: UInt = 1u;
public const val `SUBLANG_CUSTOM_DEFAULT`: UInt = 3u;
public const val `SUBLANG_CUSTOM_UNSPECIFIED`: UInt = 4u;
public const val `SUBLANG_CZECH_CZECH_REPUBLIC`: UInt = 1u;
public const val `SUBLANG_DANISH_DENMARK`: UInt = 1u;
public const val `SUBLANG_DARI_AFGHANISTAN`: UInt = 1u;
public const val `SUBLANG_DEFAULT`: UInt = 1u;
public const val `SUBLANG_DIVEHI_MALDIVES`: UInt = 1u;
public const val `SUBLANG_DUTCH`: UInt = 1u;
public const val `SUBLANG_DUTCH_BELGIAN`: UInt = 2u;
public const val `SUBLANG_ENGLISH_AUS`: UInt = 3u;
public const val `SUBLANG_ENGLISH_BELIZE`: UInt = 10u;
public const val `SUBLANG_ENGLISH_CAN`: UInt = 4u;
public const val `SUBLANG_ENGLISH_CARIBBEAN`: UInt = 9u;
public const val `SUBLANG_ENGLISH_EIRE`: UInt = 6u;
public const val `SUBLANG_ENGLISH_INDIA`: UInt = 16u;
public const val `SUBLANG_ENGLISH_JAMAICA`: UInt = 8u;
public const val `SUBLANG_ENGLISH_MALAYSIA`: UInt = 17u;
public const val `SUBLANG_ENGLISH_NZ`: UInt = 5u;
public const val `SUBLANG_ENGLISH_PHILIPPINES`: UInt = 13u;
public const val `SUBLANG_ENGLISH_SINGAPORE`: UInt = 18u;
public const val `SUBLANG_ENGLISH_SOUTH_AFRICA`: UInt = 7u;
public const val `SUBLANG_ENGLISH_TRINIDAD`: UInt = 11u;
public const val `SUBLANG_ENGLISH_UK`: UInt = 2u;
public const val `SUBLANG_ENGLISH_US`: UInt = 1u;
public const val `SUBLANG_ENGLISH_ZIMBABWE`: UInt = 12u;
public const val `SUBLANG_ESTONIAN_ESTONIA`: UInt = 1u;
public const val `SUBLANG_FAEROESE_FAROE_ISLANDS`: UInt = 1u;
public const val `SUBLANG_FILIPINO_PHILIPPINES`: UInt = 1u;
public const val `SUBLANG_FINNISH_FINLAND`: UInt = 1u;
public const val `SUBLANG_FRENCH`: UInt = 1u;
public const val `SUBLANG_FRENCH_BELGIAN`: UInt = 2u;
public const val `SUBLANG_FRENCH_CANADIAN`: UInt = 3u;
public const val `SUBLANG_FRENCH_LUXEMBOURG`: UInt = 5u;
public const val `SUBLANG_FRENCH_MONACO`: UInt = 6u;
public const val `SUBLANG_FRENCH_SWISS`: UInt = 4u;
public const val `SUBLANG_FRISIAN_NETHERLANDS`: UInt = 1u;
public const val `SUBLANG_FULAH_SENEGAL`: UInt = 2u;
public const val `SUBLANG_GALICIAN_GALICIAN`: UInt = 1u;
public const val `SUBLANG_GEORGIAN_GEORGIA`: UInt = 1u;
public const val `SUBLANG_GERMAN`: UInt = 1u;
public const val `SUBLANG_GERMAN_AUSTRIAN`: UInt = 3u;
public const val `SUBLANG_GERMAN_LIECHTENSTEIN`: UInt = 5u;
public const val `SUBLANG_GERMAN_LUXEMBOURG`: UInt = 4u;
public const val `SUBLANG_GERMAN_SWISS`: UInt = 2u;
public const val `SUBLANG_GREEK_GREECE`: UInt = 1u;
public const val `SUBLANG_GREENLANDIC_GREENLAND`: UInt = 1u;
public const val `SUBLANG_GUJARATI_INDIA`: UInt = 1u;
public const val `SUBLANG_HAUSA_NIGERIA_LATIN`: UInt = 1u;
public const val `SUBLANG_HAWAIIAN_US`: UInt = 1u;
public const val `SUBLANG_HEBREW_ISRAEL`: UInt = 1u;
public const val `SUBLANG_HINDI_INDIA`: UInt = 1u;
public const val `SUBLANG_HUNGARIAN_HUNGARY`: UInt = 1u;
public const val `SUBLANG_ICELANDIC_ICELAND`: UInt = 1u;
public const val `SUBLANG_IGBO_NIGERIA`: UInt = 1u;
public const val `SUBLANG_INDONESIAN_INDONESIA`: UInt = 1u;
public const val `SUBLANG_INUKTITUT_CANADA`: UInt = 1u;
public const val `SUBLANG_INUKTITUT_CANADA_LATIN`: UInt = 2u;
public const val `SUBLANG_IRISH_IRELAND`: UInt = 2u;
public const val `SUBLANG_ITALIAN`: UInt = 1u;
public const val `SUBLANG_ITALIAN_SWISS`: UInt = 2u;
public const val `SUBLANG_JAPANESE_JAPAN`: UInt = 1u;
public const val `SUBLANG_KANNADA_INDIA`: UInt = 1u;
public const val `SUBLANG_KASHMIRI_INDIA`: UInt = 2u;
public const val `SUBLANG_KASHMIRI_SASIA`: UInt = 2u;
public const val `SUBLANG_KAZAK_KAZAKHSTAN`: UInt = 1u;
public const val `SUBLANG_KHMER_CAMBODIA`: UInt = 1u;
public const val `SUBLANG_KICHE_GUATEMALA`: UInt = 1u;
public const val `SUBLANG_KINYARWANDA_RWANDA`: UInt = 1u;
public const val `SUBLANG_KONKANI_INDIA`: UInt = 1u;
public const val `SUBLANG_KOREAN`: UInt = 1u;
public const val `SUBLANG_KYRGYZ_KYRGYZSTAN`: UInt = 1u;
public const val `SUBLANG_LAO_LAO`: UInt = 1u;
public const val `SUBLANG_LATVIAN_LATVIA`: UInt = 1u;
public const val `SUBLANG_LITHUANIAN`: UInt = 1u;
public const val `SUBLANG_LOWER_SORBIAN_GERMANY`: UInt = 2u;
public const val `SUBLANG_LUXEMBOURGISH_LUXEMBOURG`: UInt = 1u;
public const val `SUBLANG_MACEDONIAN_MACEDONIA`: UInt = 1u;
public const val `SUBLANG_MALAYALAM_INDIA`: UInt = 1u;
public const val `SUBLANG_MALAY_BRUNEI_DARUSSALAM`: UInt = 2u;
public const val `SUBLANG_MALAY_MALAYSIA`: UInt = 1u;
public const val `SUBLANG_MALTESE_MALTA`: UInt = 1u;
public const val `SUBLANG_MAORI_NEW_ZEALAND`: UInt = 1u;
public const val `SUBLANG_MAPUDUNGUN_CHILE`: UInt = 1u;
public const val `SUBLANG_MARATHI_INDIA`: UInt = 1u;
public const val `SUBLANG_MOHAWK_MOHAWK`: UInt = 1u;
public const val `SUBLANG_MONGOLIAN_CYRILLIC_MONGOLIA`: UInt = 1u;
public const val `SUBLANG_MONGOLIAN_PRC`: UInt = 2u;
public const val `SUBLANG_NEPALI_INDIA`: UInt = 2u;
public const val `SUBLANG_NEPALI_NEPAL`: UInt = 1u;
public const val `SUBLANG_NEUTRAL`: UInt = 0u;
public const val `SUBLANG_NORWEGIAN_BOKMAL`: UInt = 1u;
public const val `SUBLANG_NORWEGIAN_NYNORSK`: UInt = 2u;
public const val `SUBLANG_OCCITAN_FRANCE`: UInt = 1u;
public const val `SUBLANG_ODIA_INDIA`: UInt = 1u;
public const val `SUBLANG_ORIYA_INDIA`: UInt = 1u;
public const val `SUBLANG_PASHTO_AFGHANISTAN`: UInt = 1u;
public const val `SUBLANG_PERSIAN_IRAN`: UInt = 1u;
public const val `SUBLANG_POLISH_POLAND`: UInt = 1u;
public const val `SUBLANG_PORTUGUESE`: UInt = 2u;
public const val `SUBLANG_PORTUGUESE_BRAZILIAN`: UInt = 1u;
public const val `SUBLANG_PULAR_SENEGAL`: UInt = 2u;
public const val `SUBLANG_PUNJABI_INDIA`: UInt = 1u;
public const val `SUBLANG_PUNJABI_PAKISTAN`: UInt = 2u;
public const val `SUBLANG_QUECHUA_BOLIVIA`: UInt = 1u;
public const val `SUBLANG_QUECHUA_ECUADOR`: UInt = 2u;
public const val `SUBLANG_QUECHUA_PERU`: UInt = 3u;
public const val `SUBLANG_ROMANIAN_ROMANIA`: UInt = 1u;
public const val `SUBLANG_ROMANSH_SWITZERLAND`: UInt = 1u;
public const val `SUBLANG_RUSSIAN_RUSSIA`: UInt = 1u;
public const val `SUBLANG_SAKHA_RUSSIA`: UInt = 1u;
public const val `SUBLANG_SAMI_INARI_FINLAND`: UInt = 9u;
public const val `SUBLANG_SAMI_LULE_NORWAY`: UInt = 4u;
public const val `SUBLANG_SAMI_LULE_SWEDEN`: UInt = 5u;
public const val `SUBLANG_SAMI_NORTHERN_FINLAND`: UInt = 3u;
public const val `SUBLANG_SAMI_NORTHERN_NORWAY`: UInt = 1u;
public const val `SUBLANG_SAMI_NORTHERN_SWEDEN`: UInt = 2u;
public const val `SUBLANG_SAMI_SKOLT_FINLAND`: UInt = 8u;
public const val `SUBLANG_SAMI_SOUTHERN_NORWAY`: UInt = 6u;
public const val `SUBLANG_SAMI_SOUTHERN_SWEDEN`: UInt = 7u;
public const val `SUBLANG_SANSKRIT_INDIA`: UInt = 1u;
public const val `SUBLANG_SCOTTISH_GAELIC`: UInt = 1u;
public const val `SUBLANG_SERBIAN_BOSNIA_HERZEGOVINA_CYRILLIC`: UInt = 7u;
public const val `SUBLANG_SERBIAN_BOSNIA_HERZEGOVINA_LATIN`: UInt = 6u;
public const val `SUBLANG_SERBIAN_CROATIA`: UInt = 1u;
public const val `SUBLANG_SERBIAN_CYRILLIC`: UInt = 3u;
public const val `SUBLANG_SERBIAN_LATIN`: UInt = 2u;
public const val `SUBLANG_SERBIAN_MONTENEGRO_CYRILLIC`: UInt = 12u;
public const val `SUBLANG_SERBIAN_MONTENEGRO_LATIN`: UInt = 11u;
public const val `SUBLANG_SERBIAN_SERBIA_CYRILLIC`: UInt = 10u;
public const val `SUBLANG_SERBIAN_SERBIA_LATIN`: UInt = 9u;
public const val `SUBLANG_SINDHI_AFGHANISTAN`: UInt = 2u;
public const val `SUBLANG_SINDHI_INDIA`: UInt = 1u;
public const val `SUBLANG_SINDHI_PAKISTAN`: UInt = 2u;
public const val `SUBLANG_SINHALESE_SRI_LANKA`: UInt = 1u;
public const val `SUBLANG_SLOVAK_SLOVAKIA`: UInt = 1u;
public const val `SUBLANG_SLOVENIAN_SLOVENIA`: UInt = 1u;
public const val `SUBLANG_SOTHO_NORTHERN_SOUTH_AFRICA`: UInt = 1u;
public const val `SUBLANG_SPANISH`: UInt = 1u;
public const val `SUBLANG_SPANISH_ARGENTINA`: UInt = 11u;
public const val `SUBLANG_SPANISH_BOLIVIA`: UInt = 16u;
public const val `SUBLANG_SPANISH_CHILE`: UInt = 13u;
public const val `SUBLANG_SPANISH_COLOMBIA`: UInt = 9u;
public const val `SUBLANG_SPANISH_COSTA_RICA`: UInt = 5u;
public const val `SUBLANG_SPANISH_DOMINICAN_REPUBLIC`: UInt = 7u;
public const val `SUBLANG_SPANISH_ECUADOR`: UInt = 12u;
public const val `SUBLANG_SPANISH_EL_SALVADOR`: UInt = 17u;
public const val `SUBLANG_SPANISH_GUATEMALA`: UInt = 4u;
public const val `SUBLANG_SPANISH_HONDURAS`: UInt = 18u;
public const val `SUBLANG_SPANISH_MEXICAN`: UInt = 2u;
public const val `SUBLANG_SPANISH_MODERN`: UInt = 3u;
public const val `SUBLANG_SPANISH_NICARAGUA`: UInt = 19u;
public const val `SUBLANG_SPANISH_PANAMA`: UInt = 6u;
public const val `SUBLANG_SPANISH_PARAGUAY`: UInt = 15u;
public const val `SUBLANG_SPANISH_PERU`: UInt = 10u;
public const val `SUBLANG_SPANISH_PUERTO_RICO`: UInt = 20u;
public const val `SUBLANG_SPANISH_URUGUAY`: UInt = 14u;
public const val `SUBLANG_SPANISH_US`: UInt = 21u;
public const val `SUBLANG_SPANISH_VENEZUELA`: UInt = 8u;
public const val `SUBLANG_SWAHILI_KENYA`: UInt = 1u;
public const val `SUBLANG_SWEDISH`: UInt = 1u;
public const val `SUBLANG_SWEDISH_FINLAND`: UInt = 2u;
public const val `SUBLANG_SYRIAC_SYRIA`: UInt = 1u;
public const val `SUBLANG_SYS_DEFAULT`: UInt = 2u;
public const val `SUBLANG_TAJIK_TAJIKISTAN`: UInt = 1u;
public const val `SUBLANG_TAMAZIGHT_ALGERIA_LATIN`: UInt = 2u;
public const val `SUBLANG_TAMAZIGHT_MOROCCO_TIFINAGH`: UInt = 4u;
public const val `SUBLANG_TAMIL_INDIA`: UInt = 1u;
public const val `SUBLANG_TAMIL_SRI_LANKA`: UInt = 2u;
public const val `SUBLANG_TATAR_RUSSIA`: UInt = 1u;
public const val `SUBLANG_TELUGU_INDIA`: UInt = 1u;
public const val `SUBLANG_THAI_THAILAND`: UInt = 1u;
public const val `SUBLANG_TIBETAN_PRC`: UInt = 1u;
public const val `SUBLANG_TIGRIGNA_ERITREA`: UInt = 2u;
public const val `SUBLANG_TIGRINYA_ERITREA`: UInt = 2u;
public const val `SUBLANG_TIGRINYA_ETHIOPIA`: UInt = 1u;
public const val `SUBLANG_TSWANA_BOTSWANA`: UInt = 2u;
public const val `SUBLANG_TSWANA_SOUTH_AFRICA`: UInt = 1u;
public const val `SUBLANG_TURKISH_TURKEY`: UInt = 1u;
public const val `SUBLANG_TURKMEN_TURKMENISTAN`: UInt = 1u;
public const val `SUBLANG_UIGHUR_PRC`: UInt = 1u;
public const val `SUBLANG_UI_CUSTOM_DEFAULT`: UInt = 5u;
public const val `SUBLANG_UKRAINIAN_UKRAINE`: UInt = 1u;
public const val `SUBLANG_UPPER_SORBIAN_GERMANY`: UInt = 1u;
public const val `SUBLANG_URDU_INDIA`: UInt = 2u;
public const val `SUBLANG_URDU_PAKISTAN`: UInt = 1u;
public const val `SUBLANG_UZBEK_CYRILLIC`: UInt = 2u;
public const val `SUBLANG_UZBEK_LATIN`: UInt = 1u;
public const val `SUBLANG_VALENCIAN_VALENCIA`: UInt = 2u;
public const val `SUBLANG_VIETNAMESE_VIETNAM`: UInt = 1u;
public const val `SUBLANG_WELSH_UNITED_KINGDOM`: UInt = 1u;
public const val `SUBLANG_WOLOF_SENEGAL`: UInt = 1u;
public const val `SUBLANG_XHOSA_SOUTH_AFRICA`: UInt = 1u;
public const val `SUBLANG_YAKUT_RUSSIA`: UInt = 1u;
public const val `SUBLANG_YI_PRC`: UInt = 1u;
public const val `SUBLANG_YORUBA_NIGERIA`: UInt = 1u;
public const val `SUBLANG_ZULU_SOUTH_AFRICA`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SUPPORTED_OS_INFO` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
public const val `SYSTEM_ACCESS_FILTER_ACE_TYPE`: UInt = 21u;
public const val `SYSTEM_ACCESS_FILTER_NOCONSTRAINT_MASK`: UInt = 4294967295u;
public const val `SYSTEM_ACCESS_FILTER_VALID_MASK`: UInt = 16777215u;
public const val `SYSTEM_ALARM_ACE_TYPE`: UInt = 3u;
public const val `SYSTEM_ALARM_CALLBACK_ACE_TYPE`: UInt = 14u;
public const val `SYSTEM_ALARM_CALLBACK_OBJECT_ACE_TYPE`: UInt = 16u;
public const val `SYSTEM_ALARM_OBJECT_ACE_TYPE`: UInt = 8u;
public const val `SYSTEM_AUDIT_ACE_TYPE`: UInt = 2u;
public const val `SYSTEM_AUDIT_CALLBACK_ACE_TYPE`: UInt = 13u;
public const val `SYSTEM_AUDIT_CALLBACK_OBJECT_ACE_TYPE`: UInt = 15u;
public const val `SYSTEM_AUDIT_OBJECT_ACE_TYPE`: UInt = 7u;
public const val `SYSTEM_CACHE_ALIGNMENT_SIZE`: UInt = 64u;
public const val `SYSTEM_MANDATORY_LABEL_ACE_TYPE`: UInt = 17u;
public const val `SYSTEM_MANDATORY_LABEL_NO_EXECUTE_UP`: UInt = 4u;
public const val `SYSTEM_MANDATORY_LABEL_NO_READ_UP`: UInt = 2u;
public const val `SYSTEM_MANDATORY_LABEL_NO_WRITE_UP`: UInt = 1u;
public const val `SYSTEM_PROCESS_TRUST_LABEL_ACE_TYPE`: UInt = 20u;
public const val `SYSTEM_PROCESS_TRUST_LABEL_VALID_MASK`: UInt = 16777215u;
public const val `SYSTEM_PROCESS_TRUST_NOCONSTRAINT_MASK`: UInt = 4294967295u;
public const val `SYSTEM_RESOURCE_ATTRIBUTE_ACE_TYPE`: UInt = 18u;
public const val `SYSTEM_SCOPED_POLICY_ID_ACE_TYPE`: UInt = 19u;
public const val `SeImageSignatureCache`: `SE_IMAGE_SIGNATURE_TYPE` = 2;
public const val `SeImageSignatureCatalogCached`: `SE_IMAGE_SIGNATURE_TYPE` = 3;
public const val `SeImageSignatureCatalogHint`: `SE_IMAGE_SIGNATURE_TYPE` = 5;
public const val `SeImageSignatureCatalogNotCached`: `SE_IMAGE_SIGNATURE_TYPE` = 4;
public const val `SeImageSignatureEmbedded`: `SE_IMAGE_SIGNATURE_TYPE` = 1;
public const val `SeImageSignatureNone`: `SE_IMAGE_SIGNATURE_TYPE` = 0;
public const val `SeImageSignaturePackageCatalog`: `SE_IMAGE_SIGNATURE_TYPE` = 6;
public const val `SeImageSignaturePplMitigated`: `SE_IMAGE_SIGNATURE_TYPE` = 7;
public const val `SevereError`: `SERVICE_ERROR_TYPE` = 2;
public const val `SharedVirtualDiskCDPSnapshotsSupported`: `SharedVirtualDiskSupportType` = 7;
public typealias `SharedVirtualDiskHandleState` = Int;
public const val `SharedVirtualDiskHandleStateFileShared`: `SharedVirtualDiskHandleState` = 1;
public const val `SharedVirtualDiskHandleStateHandleShared`: `SharedVirtualDiskHandleState` = 3;
public const val `SharedVirtualDiskHandleStateNone`: `SharedVirtualDiskHandleState` = 0;
public const val `SharedVirtualDiskSnapshotsSupported`: `SharedVirtualDiskSupportType` = 3;
public typealias `SharedVirtualDiskSupportType` = Int;
public const val `SharedVirtualDisksSupported`: `SharedVirtualDiskSupportType` = 1;
public const val `SharedVirtualDisksUnsupported`: `SharedVirtualDiskSupportType` = 0;
public const val `SystemLoad`: `SERVICE_LOAD_TYPE` = 1;
public const val `TAPE_CHECK_FOR_DRIVE_PROBLEM`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_CREATE_PARTITION` (
    public var `Method`: UInt,
    public var `Count`: UInt,
    public var `Size`: UInt,
)
public const val `TAPE_DRIVE_ABSOLUTE_BLK`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147487744u;
public const val `TAPE_DRIVE_ABS_BLK_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147491840u;
public const val `TAPE_DRIVE_CLEAN_REQUESTS`: UInt = 33554432u;
public const val `TAPE_DRIVE_COMPRESSION`: UInt = 131072u;
public const val `TAPE_DRIVE_ECC`: UInt = 65536u;
public const val `TAPE_DRIVE_EJECT_MEDIA`: UInt = 16777216u;
public const val `TAPE_DRIVE_END_OF_DATA`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147549184u;
public const val `TAPE_DRIVE_EOT_WZ_SIZE`: UInt = 8192u;
public const val `TAPE_DRIVE_ERASE_BOP_ONLY`: UInt = 64u;
public const val `TAPE_DRIVE_ERASE_IMMEDIATE`: UInt = 128u;
public const val `TAPE_DRIVE_ERASE_LONG`: UInt = 32u;
public const val `TAPE_DRIVE_ERASE_SHORT`: UInt = 16u;
public const val `TAPE_DRIVE_FILEMARKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147745792u;
public const val `TAPE_DRIVE_FIXED`: UInt = 1u;
public const val `TAPE_DRIVE_FIXED_BLOCK`: UInt = 1024u;
public const val `TAPE_DRIVE_FORMAT`: UInt = 2684354560u;
public const val `TAPE_DRIVE_FORMAT_IMMEDIATE`: UInt = 3221225472u;
public const val `TAPE_DRIVE_GET_ABSOLUTE_BLK`: UInt = 1048576u;
public const val `TAPE_DRIVE_GET_LOGICAL_BLK`: UInt = 2097152u;
public const val `TAPE_DRIVE_HIGH_FEATURES`: UInt = 2147483648u;
public const val `TAPE_DRIVE_INITIATOR`: UInt = 4u;
public const val `TAPE_DRIVE_LOAD_UNLD_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483680u;
public const val `TAPE_DRIVE_LOAD_UNLOAD`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483649u;
public const val `TAPE_DRIVE_LOCK_UNLK_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483776u;
public const val `TAPE_DRIVE_LOCK_UNLOCK`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483652u;
public const val `TAPE_DRIVE_LOGICAL_BLK`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147500032u;
public const val `TAPE_DRIVE_LOG_BLK_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147516416u;
public const val `TAPE_DRIVE_PADDING`: UInt = 262144u;
public typealias `TAPE_DRIVE_PROBLEM_TYPE` = Int;
public const val `TAPE_DRIVE_RELATIVE_BLKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147614720u;
public const val `TAPE_DRIVE_REPORT_SMKS`: UInt = 524288u;
public const val `TAPE_DRIVE_RESERVED_BIT`: UInt = 2147483648u;
public const val `TAPE_DRIVE_REVERSE_POSITION`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2151677952u;
public const val `TAPE_DRIVE_REWIND_IMMEDIATE`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483656u;
public const val `TAPE_DRIVE_SELECT`: UInt = 2u;
public const val `TAPE_DRIVE_SEQUENTIAL_FMKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2148007936u;
public const val `TAPE_DRIVE_SEQUENTIAL_SMKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2149580800u;
public const val `TAPE_DRIVE_SETMARKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2148532224u;
public const val `TAPE_DRIVE_SET_BLOCK_SIZE`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483664u;
public const val `TAPE_DRIVE_SET_CMP_BOP_ONLY`: UInt = 67108864u;
public const val `TAPE_DRIVE_SET_COMPRESSION`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147484160u;
public const val `TAPE_DRIVE_SET_ECC`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483904u;
public const val `TAPE_DRIVE_SET_EOT_WZ_SIZE`: UInt = 4194304u;
public const val `TAPE_DRIVE_SET_PADDING`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147484672u;
public const val `TAPE_DRIVE_SET_REPORT_SMKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147485696u;
public const val `TAPE_DRIVE_SPACE_IMMEDIATE`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2155872256u;
public const val `TAPE_DRIVE_TAPE_CAPACITY`: UInt = 256u;
public const val `TAPE_DRIVE_TAPE_REMAINING`: UInt = 512u;
public const val `TAPE_DRIVE_TENSION`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483650u;
public const val `TAPE_DRIVE_TENSION_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2147483712u;
public const val `TAPE_DRIVE_VARIABLE_BLOCK`: UInt = 2048u;
public const val `TAPE_DRIVE_WRITE_FILEMARKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2181038080u;
public const val `TAPE_DRIVE_WRITE_LONG_FMKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2281701376u;
public const val `TAPE_DRIVE_WRITE_MARK_IMMED`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2415919104u;
public const val `TAPE_DRIVE_WRITE_PROTECT`: UInt = 4096u;
public const val `TAPE_DRIVE_WRITE_SETMARKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2164260864u;
public const val `TAPE_DRIVE_WRITE_SHORT_FMKS`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = 2214592512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_GET_DRIVE_PARAMETERS` (
    public var `ECC`: Boolean,
    public var `Compression`: Boolean,
    public var `DataPadding`: Boolean,
    public var `ReportSetmarks`: Boolean,
    public var `DefaultBlockSize`: UInt,
    public var `MaximumBlockSize`: UInt,
    public var `MinimumBlockSize`: UInt,
    public var `MaximumPartitionCount`: UInt,
    public var `FeaturesLow`: UInt,
    public var `FeaturesHigh`: `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH`,
    public var `EOTWarningZoneSize`: UInt,
)
public typealias `TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_GET_MEDIA_PARAMETERS` (
    public var `Capacity`: Long,
    public var `Remaining`: Long,
    public var `BlockSize`: UInt,
    public var `PartitionCount`: UInt,
    public var `WriteProtected`: Boolean,
)
public const val `TAPE_PSEUDO_LOGICAL_BLOCK`: Int = 3;
public const val `TAPE_PSEUDO_LOGICAL_POSITION`: Int = 2;
public const val `TAPE_QUERY_DEVICE_ERROR_DATA`: Int = 4;
public const val `TAPE_QUERY_DRIVE_PARAMETERS`: Int = 0;
public const val `TAPE_QUERY_IO_ERROR_DATA`: Int = 3;
public const val `TAPE_QUERY_MEDIA_CAPACITY`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_SET_DRIVE_PARAMETERS` (
    public var `ECC`: Boolean,
    public var `Compression`: Boolean,
    public var `DataPadding`: Boolean,
    public var `ReportSetmarks`: Boolean,
    public var `EOTWarningZoneSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_SET_MEDIA_PARAMETERS` (
    public var `BlockSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TAPE_WMI_OPERATIONS` (
    public var `Method`: UInt,
    public var `DataBufferSize`: UInt,
    public var `DataBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4786:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TAPE_WMI_OPERATIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `THREAD_BASE_PRIORITY_IDLE`: Int = -15;
public const val `THREAD_BASE_PRIORITY_LOWRT`: UInt = 15u;
public const val `THREAD_BASE_PRIORITY_MAX`: UInt = 2u;
public const val `THREAD_BASE_PRIORITY_MIN`: Int = -2;
public const val `THREAD_DYNAMIC_CODE_ALLOW`: UInt = 1u;
public const val `THREAD_PROFILING_FLAG_DISPATCH`: UInt = 1u;
public const val `TIME_ZONE_ID_DAYLIGHT`: UInt = 2u;
public const val `TIME_ZONE_ID_STANDARD`: UInt = 1u;
public const val `TIME_ZONE_ID_UNKNOWN`: UInt = 0u;
public const val `TLS_MINIMUM_AVAILABLE`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKEN_BNO_ISOLATION_INFORMATION` (
    public var `IsolationPrefix`: `windows_sys`.`core`.`PWSTR`,
    public var `IsolationEnabled`: Boolean,
)
// UNSUPPORTED Rust 4807:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TOKEN_BNO_ISOLATION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKEN_SID_INFORMATION` (
    public var `Sid`: `super`.`super`.`Security`.`PSID`,
)
// UNSUPPORTED Rust 4818:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for TOKEN_SID_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_SOURCE_LENGTH`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTIONMANAGER_BASIC_INFORMATION` (
    public var `TmIdentity`: `windows_sys`.`core`.`GUID`,
    public var `VirtualClock`: Long,
)
public const val `TRANSACTIONMANAGER_BIND_TRANSACTION`: UInt = 32u;
public const val `TRANSACTIONMANAGER_CREATE_RM`: UInt = 16u;
public typealias `TRANSACTIONMANAGER_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTIONMANAGER_LOGPATH_INFORMATION` (
    public var `LogPathLength`: UInt,
    public var `LogPath`: UShortArray,
)
// UNSUPPORTED Rust 4840:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTIONMANAGER_LOGPATH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTIONMANAGER_LOG_INFORMATION` (
    public var `LogIdentity`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTIONMANAGER_OLDEST_INFORMATION` (
    public var `OldestTransactionGuid`: `windows_sys`.`core`.`GUID`,
)
public const val `TRANSACTIONMANAGER_QUERY_INFORMATION`: UInt = 1u;
public const val `TRANSACTIONMANAGER_RECOVER`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTIONMANAGER_RECOVERY_INFORMATION` (
    public var `LastRecoveredLsn`: ULong,
)
public const val `TRANSACTIONMANAGER_RENAME`: UInt = 8u;
public const val `TRANSACTIONMANAGER_SET_INFORMATION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_BASIC_INFORMATION` (
    public var `TransactionId`: `windows_sys`.`core`.`GUID`,
    public var `State`: UInt,
    public var `Outcome`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTION_BIND_INFORMATION` (
    public var `TmHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 4876:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTION_BIND_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRANSACTION_COMMIT`: UInt = 8u;
public const val `TRANSACTION_ENLIST`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTION_ENLISTMENTS_INFORMATION` (
    public var `NumberOfEnlistments`: UInt,
    public var `EnlistmentPair`: Array<`TRANSACTION_ENLISTMENT_PAIR`>,
)
// UNSUPPORTED Rust 4889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTION_ENLISTMENTS_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_ENLISTMENT_PAIR` (
    public var `EnlistmentId`: `windows_sys`.`core`.`GUID`,
    public var `ResourceManagerId`: `windows_sys`.`core`.`GUID`,
)
public typealias `TRANSACTION_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_LIST_ENTRY` (
    public var `UOW`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTION_LIST_INFORMATION` (
    public var `NumberOfTransactions`: UInt,
    public var `TransactionInformation`: Array<`TRANSACTION_LIST_ENTRY`>,
)
// UNSUPPORTED Rust 4912:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTION_LIST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRANSACTION_PROPAGATE`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTION_PROPERTIES_INFORMATION` (
    public var `IsolationLevel`: UInt,
    public var `IsolationFlags`: UInt,
    public var `Timeout`: Long,
    public var `Outcome`: UInt,
    public var `DescriptionLength`: UInt,
    public var `Description`: UShortArray,
)
// UNSUPPORTED Rust 4928:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTION_PROPERTIES_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRANSACTION_QUERY_INFORMATION`: UInt = 1u;
public const val `TRANSACTION_RIGHT_RESERVED1`: UInt = 64u;
public const val `TRANSACTION_ROLLBACK`: UInt = 16u;
public const val `TRANSACTION_SET_INFORMATION`: UInt = 2u;
public typealias `TRANSACTION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION` (
    public var `SuperiorEnlistmentPair`: `TRANSACTION_ENLISTMENT_PAIR`,
)
public const val `TREE_CONNECT_ATTRIBUTE_GLOBAL`: UInt = 4u;
public const val `TREE_CONNECT_ATTRIBUTE_INTEGRITY`: UInt = 32768u;
public const val `TREE_CONNECT_ATTRIBUTE_PINNED`: UInt = 2u;
public const val `TREE_CONNECT_ATTRIBUTE_PRIVACY`: UInt = 16384u;
public const val `TRUST_PROTECTED_FILTER_ACE_FLAG`: UInt = 64u;
public const val `TapeDriveCleanDriveNow`: `TAPE_DRIVE_PROBLEM_TYPE` = 11;
public const val `TapeDriveHardwareError`: `TAPE_DRIVE_PROBLEM_TYPE` = 7;
public const val `TapeDriveMediaLifeExpired`: `TAPE_DRIVE_PROBLEM_TYPE` = 12;
public const val `TapeDriveProblemNone`: `TAPE_DRIVE_PROBLEM_TYPE` = 0;
public const val `TapeDriveReadError`: `TAPE_DRIVE_PROBLEM_TYPE` = 5;
public const val `TapeDriveReadWarning`: `TAPE_DRIVE_PROBLEM_TYPE` = 3;
public const val `TapeDriveReadWriteError`: `TAPE_DRIVE_PROBLEM_TYPE` = 2;
public const val `TapeDriveReadWriteWarning`: `TAPE_DRIVE_PROBLEM_TYPE` = 1;
public const val `TapeDriveScsiConnectionError`: `TAPE_DRIVE_PROBLEM_TYPE` = 9;
public const val `TapeDriveSnappedTape`: `TAPE_DRIVE_PROBLEM_TYPE` = 13;
public const val `TapeDriveTimetoClean`: `TAPE_DRIVE_PROBLEM_TYPE` = 10;
public const val `TapeDriveUnsupportedMedia`: `TAPE_DRIVE_PROBLEM_TYPE` = 8;
public const val `TapeDriveWriteError`: `TAPE_DRIVE_PROBLEM_TYPE` = 6;
public const val `TapeDriveWriteWarning`: `TAPE_DRIVE_PROBLEM_TYPE` = 4;
public const val `TransactionBasicInformation`: `TRANSACTION_INFORMATION_CLASS` = 0;
public const val `TransactionBindInformation`: `TRANSACTION_INFORMATION_CLASS` = 4;
public const val `TransactionDTCPrivateInformation`: `TRANSACTION_INFORMATION_CLASS` = 5;
public const val `TransactionEnlistmentInformation`: `TRANSACTION_INFORMATION_CLASS` = 2;
public const val `TransactionManagerBasicInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 0;
public const val `TransactionManagerLogInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 1;
public const val `TransactionManagerLogPathInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 2;
public const val `TransactionManagerOldestTransactionInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 5;
public const val `TransactionManagerOnlineProbeInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 3;
public const val `TransactionManagerRecoveryInformation`: `TRANSACTIONMANAGER_INFORMATION_CLASS` = 4;
public const val `TransactionPropertiesInformation`: `TRANSACTION_INFORMATION_CLASS` = 1;
public const val `TransactionStateCommittedNotify`: `TRANSACTION_STATE` = 3;
public const val `TransactionStateIndoubt`: `TRANSACTION_STATE` = 2;
public const val `TransactionStateNormal`: `TRANSACTION_STATE` = 1;
public const val `TransactionSuperiorEnlistmentInformation`: `TRANSACTION_INFORMATION_CLASS` = 3;
public const val `UCSCHAR_INVALID_CHARACTER`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UMS_CREATE_THREAD_ATTRIBUTES` (
    public var `UmsVersion`: UInt,
    public var `UmsContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UmsCompletionList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UMS_CREATE_THREAD_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNICODE_STRING_MAX_CHARS`: UInt = 32767u;
// UNSUPPORTED Rust 4991:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const UNIFIEDBUILDREVISION_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\Software\\Microsoft\\Windows NT\\CurrentVersion");

public const val `UNIFIEDBUILDREVISION_MIN`: UInt = 0u;
// UNSUPPORTED Rust 4993:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const UNIFIEDBUILDREVISION_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("UBR");

public const val `UNWIND_CHAIN_LIMIT`: UInt = 32u;
public const val `UNWIND_HISTORY_TABLE_SIZE`: UInt = 12u;
public const val `UNW_FLAG_NO_EPILOGUE`: UInt = 2147483648u;
public const val `UmsSchedulerStartup`: `RTL_UMS_SCHEDULER_REASON` = 0;
public const val `UmsSchedulerThreadBlocked`: `RTL_UMS_SCHEDULER_REASON` = 1;
public const val `UmsSchedulerThreadYield`: `RTL_UMS_SCHEDULER_REASON` = 2;
public const val `VALID_INHERIT_FLAGS`: UInt = 31u;
public const val `VBS_BASIC_PAGE_MEASURED_DATA`: UInt = 1u;
public const val `VBS_BASIC_PAGE_SYSTEM_CALL`: UInt = 5u;
public const val `VBS_BASIC_PAGE_THREAD_DESCRIPTOR`: UInt = 4u;
public const val `VBS_BASIC_PAGE_UNMEASURED_DATA`: UInt = 2u;
public const val `VBS_BASIC_PAGE_ZERO_FILL`: UInt = 3u;
public const val `VER_AND`: UInt = 6u;
public const val `VER_CONDITION_MASK`: UInt = 7u;
public const val `VER_EQUAL`: UInt = 1u;
public const val `VER_GREATER`: UInt = 2u;
public const val `VER_GREATER_EQUAL`: UInt = 3u;
public const val `VER_LESS`: UInt = 4u;
public const val `VER_LESS_EQUAL`: UInt = 5u;
public const val `VER_NT_DOMAIN_CONTROLLER`: UInt = 2u;
public const val `VER_NT_SERVER`: UInt = 3u;
public const val `VER_NT_WORKSTATION`: UInt = 1u;
public const val `VER_NUM_BITS_PER_CONDITION_MASK`: UInt = 3u;
public const val `VER_OR`: UInt = 7u;
public const val `VER_SERVER_NT`: UInt = 2147483648u;
public const val `VER_SUITE_BACKOFFICE`: UInt = 4u;
public const val `VER_SUITE_BLADE`: UInt = 1024u;
public const val `VER_SUITE_COMMUNICATIONS`: UInt = 8u;
public const val `VER_SUITE_COMPUTE_SERVER`: UInt = 16384u;
public const val `VER_SUITE_DATACENTER`: UInt = 128u;
public const val `VER_SUITE_EMBEDDEDNT`: UInt = 64u;
public const val `VER_SUITE_EMBEDDED_RESTRICTED`: UInt = 2048u;
public const val `VER_SUITE_ENTERPRISE`: UInt = 2u;
public const val `VER_SUITE_MULTIUSERTS`: UInt = 131072u;
public const val `VER_SUITE_PERSONAL`: UInt = 512u;
public const val `VER_SUITE_SECURITY_APPLIANCE`: UInt = 4096u;
public const val `VER_SUITE_SINGLEUSERTS`: UInt = 256u;
public const val `VER_SUITE_SMALLBUSINESS`: UInt = 1u;
public const val `VER_SUITE_SMALLBUSINESS_RESTRICTED`: UInt = 32u;
public const val `VER_SUITE_STORAGE_SERVER`: UInt = 8192u;
public const val `VER_SUITE_TERMINAL`: UInt = 16u;
public const val `VER_SUITE_WH_SERVER`: UInt = 32768u;
public const val `VER_WORKSTATION_NT`: UInt = 1073741824u;
public const val `VRL_CUSTOM_CLASS_BEGIN`: UInt = 256u;
public const val `VRL_ENABLE_KERNEL_BREAKS`: UInt = 2147483648u;
public const val `VRL_PREDEFINED_CLASS_BEGIN`: UInt = 1u;
public const val `WDT_INPROC64_CALL`: UInt = 1349805143u;
public const val `WDT_INPROC_CALL`: UInt = 1215587415u;
public const val `WDT_REMOTE_CALL`: UInt = 1383359575u;
public typealias `WORD_WHEEL_OPEN_FLAGS` = UInt;
public const val `WRITE_NV_MEMORY_FLAG_FLUSH`: UInt = 1u;
public const val `WRITE_NV_MEMORY_FLAG_NON_TEMPORAL`: UInt = 2u;
public const val `WRITE_NV_MEMORY_FLAG_NO_DRAIN`: UInt = 256u;
public const val `WRITE_WATCH_FLAG_RESET`: UInt = 1u;
public const val `WT_EXECUTEDELETEWAIT`: UInt = 8u;
public const val `WT_EXECUTEINLONGTHREAD`: UInt = 16u;
public const val `WT_EXECUTEINPERSISTENTIOTHREAD`: UInt = 64u;
public const val `WT_EXECUTEINUITHREAD`: UInt = 2u;
public const val `Win32ServiceOwnProcess`: `SERVICE_NODE_TYPE` = 16;
public const val `Win32ServiceShareProcess`: `SERVICE_NODE_TYPE` = 32;
public const val `X3_BTYPE_QP_INST_VAL_POS_X`: UInt = 0u;
public const val `X3_BTYPE_QP_INST_WORD_POS_X`: UInt = 23u;
public const val `X3_BTYPE_QP_INST_WORD_X`: UInt = 2u;
public const val `X3_BTYPE_QP_SIZE_X`: UInt = 9u;
public const val `X3_D_WH_INST_WORD_POS_X`: UInt = 24u;
public const val `X3_D_WH_INST_WORD_X`: UInt = 3u;
public const val `X3_D_WH_SIGN_VAL_POS_X`: UInt = 0u;
public const val `X3_D_WH_SIZE_X`: UInt = 3u;
public const val `X3_EMPTY_INST_VAL_POS_X`: UInt = 0u;
public const val `X3_EMPTY_INST_WORD_POS_X`: UInt = 14u;
public const val `X3_EMPTY_INST_WORD_X`: UInt = 1u;
public const val `X3_EMPTY_SIZE_X`: UInt = 2u;
public const val `X3_IMM20_INST_WORD_POS_X`: UInt = 4u;
public const val `X3_IMM20_INST_WORD_X`: UInt = 3u;
public const val `X3_IMM20_SIGN_VAL_POS_X`: UInt = 0u;
public const val `X3_IMM20_SIZE_X`: UInt = 20u;
public const val `X3_IMM39_1_INST_WORD_POS_X`: UInt = 0u;
public const val `X3_IMM39_1_INST_WORD_X`: UInt = 2u;
public const val `X3_IMM39_1_SIGN_VAL_POS_X`: UInt = 36u;
public const val `X3_IMM39_1_SIZE_X`: UInt = 23u;
public const val `X3_IMM39_2_INST_WORD_POS_X`: UInt = 16u;
public const val `X3_IMM39_2_INST_WORD_X`: UInt = 1u;
public const val `X3_IMM39_2_SIGN_VAL_POS_X`: UInt = 20u;
public const val `X3_IMM39_2_SIZE_X`: UInt = 16u;
public const val `X3_I_INST_WORD_POS_X`: UInt = 27u;
public const val `X3_I_INST_WORD_X`: UInt = 3u;
public const val `X3_I_SIGN_VAL_POS_X`: UInt = 59u;
public const val `X3_I_SIZE_X`: UInt = 1u;
public const val `X3_OPCODE_INST_WORD_POS_X`: UInt = 28u;
public const val `X3_OPCODE_INST_WORD_X`: UInt = 3u;
public const val `X3_OPCODE_SIGN_VAL_POS_X`: UInt = 0u;
public const val `X3_OPCODE_SIZE_X`: UInt = 4u;
public const val `X3_P_INST_WORD_POS_X`: UInt = 0u;
public const val `X3_P_INST_WORD_X`: UInt = 3u;
public const val `X3_P_SIGN_VAL_POS_X`: UInt = 0u;
public const val `X3_P_SIZE_X`: UInt = 4u;
public const val `X3_TMPLT_INST_WORD_POS_X`: UInt = 0u;
public const val `X3_TMPLT_INST_WORD_X`: UInt = 0u;
public const val `X3_TMPLT_SIGN_VAL_POS_X`: UInt = 0u;
public const val `X3_TMPLT_SIZE_X`: UInt = 4u;
public const val `X86_CACHE_ALIGNMENT_SIZE`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XSAVE_CET_U_FORMAT` (
    public var `Ia32CetUMsr`: ULong,
    public var `Ia32Pl3SspMsr`: ULong,
)
public const val `XSTATE_ALIGN_BIT`: UInt = 1u;
public const val `XSTATE_AMX_TILE_CONFIG`: UInt = 17u;
public const val `XSTATE_AMX_TILE_DATA`: UInt = 18u;
public const val `XSTATE_AVX`: UInt = 2u;
public const val `XSTATE_AVX512_KMASK`: UInt = 5u;
public const val `XSTATE_AVX512_ZMM`: UInt = 7u;
public const val `XSTATE_AVX512_ZMM_H`: UInt = 6u;
public const val `XSTATE_CET_S`: UInt = 12u;
public const val `XSTATE_CET_U`: UInt = 11u;
public const val `XSTATE_COMPACTION_ENABLE`: UInt = 63u;
public const val `XSTATE_CONTROLFLAG_XFD_MASK`: UInt = 4u;
public const val `XSTATE_CONTROLFLAG_XSAVEC_MASK`: UInt = 2u;
public const val `XSTATE_CONTROLFLAG_XSAVEOPT_MASK`: UInt = 1u;
public const val `XSTATE_GSSE`: UInt = 2u;
public const val `XSTATE_IPT`: UInt = 8u;
public const val `XSTATE_LEGACY_FLOATING_POINT`: UInt = 0u;
public const val `XSTATE_LEGACY_SSE`: UInt = 1u;
public const val `XSTATE_LWP`: UInt = 62u;
public const val `XSTATE_MPX_BNDCSR`: UInt = 4u;
public const val `XSTATE_MPX_BNDREGS`: UInt = 3u;
public const val `XSTATE_PASID`: UInt = 10u;
public const val `XSTATE_XFD_BIT`: UInt = 2u;
public const val `_MM_HINT_NTA`: UInt = 0u;
public const val `_MM_HINT_T0`: UInt = 1u;
public const val `_MM_HINT_T1`: UInt = 2u;
public const val `_MM_HINT_T2`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `remoteMETAFILEPICT` (
    public var `mm`: Int,
    public var `xExt`: Int,
    public var `yExt`: Int,
    public var `hMF`: /* Rust *mut */ kotlinx.cinterop.CPointer<`userHMETAFILE`>?,
)
// UNSUPPORTED Rust 5136:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for remoteMETAFILEPICT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userBITMAP` (
    public var `bmType`: Int,
    public var `bmWidth`: Int,
    public var `bmHeight`: Int,
    public var `bmWidthBytes`: Int,
    public var `bmPlanes`: UShort,
    public var `bmBitsPixel`: UShort,
    public var `cbSize`: UInt,
    public var `pBuffer`: UByteArray,
)
// UNSUPPORTED Rust 5154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for userBITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userCLIPFORMAT` (
    public var `fContext`: Int,
    public var `u`: `userCLIPFORMAT_0`,
)
// UNSUPPORTED Rust 5165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for userCLIPFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5170:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union userCLIPFORMAT_0 {
//     pub dwValue: u32,
//     pub pwszName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5176:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for userCLIPFORMAT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHBITMAP` (
    public var `fContext`: Int,
    public var `u`: `userHBITMAP_0`,
)
// UNSUPPORTED Rust 5187:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for userHBITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5192:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union userHBITMAP_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut userBITMAP,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5199:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for userHBITMAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHENHMETAFILE` (
    public var `fContext`: Int,
    public var `u`: `userHENHMETAFILE_0`,
)
// UNSUPPORTED Rust 5211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHENHMETAFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5217:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union userHENHMETAFILE_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut super::Com::BYTE_BLOB,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHENHMETAFILE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHGLOBAL` (
    public var `fContext`: Int,
    public var `u`: `userHGLOBAL_0`,
)
// UNSUPPORTED Rust 5238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHGLOBAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5244:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union userHGLOBAL_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut super::Com::FLAGGED_BYTE_BLOB,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5252:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHGLOBAL_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHMETAFILE` (
    public var `fContext`: Int,
    public var `u`: `userHMETAFILE_0`,
)
// UNSUPPORTED Rust 5265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHMETAFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5271:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union userHMETAFILE_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut super::Com::BYTE_BLOB,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5279:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHMETAFILE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHMETAFILEPICT` (
    public var `fContext`: Int,
    public var `u`: `userHMETAFILEPICT_0`,
)
// UNSUPPORTED Rust 5292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHMETAFILEPICT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5298:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union userHMETAFILEPICT_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut remoteMETAFILEPICT,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for userHMETAFILEPICT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `userHPALETTE` (
    public var `fContext`: Int,
    public var `u`: `userHPALETTE_0`,
)
// UNSUPPORTED Rust 5319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for userHPALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5325:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub union userHPALETTE_0 {
//     pub hInproc: i32,
//     pub hRemote: *mut super::super::Graphics::Gdi::LOGPALETTE,
//     pub hInproc64: i64,
// }

// UNSUPPORTED Rust 5333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for userHPALETTE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

