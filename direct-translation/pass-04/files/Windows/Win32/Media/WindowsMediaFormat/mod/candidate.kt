// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateBackupRestorer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateBackupRestorer`(`pcallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppbackup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateEditor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateEditor`(`ppeditor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateIndexer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateIndexer`(`ppindexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateProfileManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateProfileManager`(`ppprofilemanager` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateReader`(`punkcert` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwrights` : UInt, `ppreader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateSyncReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateSyncReader`(`punkcert` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwrights` : UInt, `ppsyncreader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateWriter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateWriter`(`punkcert` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwriter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateWriterFileSink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateWriterFileSink`(`ppsink` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateWriterNetworkSink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateWriterNetworkSink`(`ppsink` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMCreateWriterPushSink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMCreateWriterPushSink`(`ppsink` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wmvcore.dll, ABI=system, export=WMIsContentProtected; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WMIsContentProtected`(`pwszfilename` : `windows_sys`.`core`.`PCWSTR`, `pfisprotected` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
public const val `AM_CONFIGASFWRITER_PARAM_AUTOINDEX`: `_AM_ASFWRITERCONFIG_PARAM` = 1;
public const val `AM_CONFIGASFWRITER_PARAM_DONTCOMPRESS`: `_AM_ASFWRITERCONFIG_PARAM` = 3;
public const val `AM_CONFIGASFWRITER_PARAM_MULTIPASS`: `_AM_ASFWRITERCONFIG_PARAM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AM_WMT_EVENT_DATA` (
    public var `hrStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 21:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AM_WMT_EVENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 26:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_ClientNetManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd12a3ce_9c42_11d2_beed_0060082f2054);

// UNSUPPORTED Rust 27:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMBandwidthSharing_Exclusive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf6060aa_5197_11d2_b6af_00c04fd908e9);

// UNSUPPORTED Rust 28:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMBandwidthSharing_Partial: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf6060ab_5197_11d2_b6af_00c04fd908e9);

// UNSUPPORTED Rust 29:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMMUTEX_Bitrate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6e22a01_35da_11d1_9034_00a0c90349be);

// UNSUPPORTED Rust 30:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMMUTEX_Language: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6e22a00_35da_11d1_9034_00a0c90349be);

// UNSUPPORTED Rust 31:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMMUTEX_Presentation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6e22a02_35da_11d1_9034_00a0c90349be);

// UNSUPPORTED Rust 32:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WMMUTEX_Unknown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6e22a03_35da_11d1_9034_00a0c90349be);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRM_COPY_OPL` (
    public var `wMinimumCopyLevel`: UShort,
    public var `oplIdIncludes`: `DRM_OPL_OUTPUT_IDS`,
    public var `oplIdExcludes`: `DRM_OPL_OUTPUT_IDS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRM_MINIMUM_OUTPUT_PROTECTION_LEVELS` (
    public var `wCompressedDigitalVideo`: UShort,
    public var `wUncompressedDigitalVideo`: UShort,
    public var `wAnalogVideo`: UShort,
    public var `wCompressedDigitalAudio`: UShort,
    public var `wUncompressedDigitalAudio`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_OPL_OUTPUT_IDS` (
    public var `cIds`: UShort,
    public var `rgIds`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 55:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRM_OPL_OUTPUT_IDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DRM_OPL_TYPES`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRM_OUTPUT_PROTECTION` (
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `bConfigData`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRM_PLAY_OPL` (
    public var `minOPL`: `DRM_MINIMUM_OUTPUT_PROTECTION_LEVELS`,
    public var `oplIdReserved`: `DRM_OPL_OUTPUT_IDS`,
    public var `vopi`: `DRM_VIDEO_OUTPUT_PROTECTION_IDS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_VAL16` (
    public var `val`: UByteArray,
)
// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRM_VAL16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_VIDEO_OUTPUT_PROTECTION_IDS` (
    public var `cEntries`: UShort,
    public var `rgVop`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRM_OUTPUT_PROTECTION`>?,
)
// UNSUPPORTED Rust 90:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRM_VIDEO_OUTPUT_PROTECTION_IDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NETSOURCE_URLCREDPOLICY_SETTINGS` = Int;
public const val `NETSOURCE_URLCREDPOLICY_SETTING_ANONYMOUSONLY`: `NETSOURCE_URLCREDPOLICY_SETTINGS` = 2;
public const val `NETSOURCE_URLCREDPOLICY_SETTING_MUSTPROMPTUSER`: `NETSOURCE_URLCREDPOLICY_SETTINGS` = 1;
public const val `NETSOURCE_URLCREDPOLICY_SETTING_SILENTLOGONOK`: `NETSOURCE_URLCREDPOLICY_SETTINGS` = 0;
public typealias `WEBSTREAM_SAMPLE_TYPE` = Int;
public const val `WEBSTREAM_SAMPLE_TYPE_FILE`: `WEBSTREAM_SAMPLE_TYPE` = 1;
public const val `WEBSTREAM_SAMPLE_TYPE_RENDER`: `WEBSTREAM_SAMPLE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMDRM_IMPORT_INIT_STRUCT` (
    public var `dwVersion`: UInt,
    public var `cbEncryptedSessionKeyMessage`: UInt,
    public var `pbEncryptedSessionKeyMessage`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbEncryptedKeyMessage`: UInt,
    public var `pbEncryptedKeyMessage`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMDRM_IMPORT_INIT_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WMDRM_IMPORT_INIT_STRUCT_DEFINED`: UInt = 1u;
// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMFORMAT_MPEG2Video: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d80e3_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMFORMAT_Script: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c8510f2_debe_4ca7_bba5_f07a104f8dff);

// UNSUPPORTED Rust 119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMFORMAT_VideoInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05589f80_c356_11ce_bf01_00aa0055595a);

// UNSUPPORTED Rust 120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMFORMAT_WaveFormatEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05589f81_c356_11ce_bf01_00aa0055595a);

// UNSUPPORTED Rust 121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMFORMAT_WebStream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda1e6b13_8359_4050_b398_388e965bf00c);

// UNSUPPORTED Rust 122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_ACELPnet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000130_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_Base: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_DRM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000009_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_I420: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30323449_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_IYUV: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x56555949_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_M4S2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3253344d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MP3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000055_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MP43: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3334504d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MP4S: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5334504d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MPEG2_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8026_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MSS1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3153534d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_MSS2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3253534d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_P422: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32323450_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_PCM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000001_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb78_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB24: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7d_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB32: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7e_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb79_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB555: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7c_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB565: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7b_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 142:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_RGB8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7a_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 143:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_UYVY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59565955_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_VIDEOIMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d4a45f2_e5f6_4b44_8388_f0ae5c0e0c37);

// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMAudioV2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000161_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMAudioV7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000161_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMAudioV8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000161_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMAudioV9: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000162_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 149:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMAudio_Lossless: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000163_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMSP1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000a_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMSP2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000b_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMV1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31564d57_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMV2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32564d57_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMV3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33564d57_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMVA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41564d57_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WMVP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50564d57_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WVC1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31435657_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WVP2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32505657_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_WebStream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x776257d4_c627_41cb_8f81_7ac7ff1c40cc);

// UNSUPPORTED Rust 160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_YUY2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32595559_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_YV12: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32315659_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_YVU9: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39555659_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIASUBTYPE_YVYU: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55595659_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_Audio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73647561_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_FileTransfer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9e47579_930e_4427_adfc_ad80f290e470);

// UNSUPPORTED Rust 166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_Image: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34a50fd8_8aa5_4386_81fe_a0efe0488e31);

// UNSUPPORTED Rust 167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_Script: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73636d64_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_Text: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bba1ea7_5ab2_4829_ba57_0940209bcf3e);

// UNSUPPORTED Rust 169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMMEDIATYPE_Video: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73646976_0000_0010_8000_00aa00389b71);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMMPEG2VIDEOINFO` (
    public var `hdr`: `WMVIDEOINFOHEADER2`,
    public var `dwStartTimeCode`: UInt,
    public var `cbSequenceHeader`: UInt,
    public var `dwProfile`: UInt,
    public var `dwLevel`: UInt,
    public var `dwFlags`: UInt,
    public var `dwSequenceHeader`: UIntArray,
)
// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for WMMPEG2VIDEOINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMSCRIPTFORMAT` (
    public var `scriptType`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 193:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMSCRIPTTYPE_TwoStrings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82f38a70_c29f_11d1_97ad_00a0c95ea850);

public const val `WMT_ACQUIRE_LICENSE`: `WMT_STATUS` = 23;
public typealias `WMT_ATTR_DATATYPE` = Int;
public typealias `WMT_ATTR_IMAGETYPE` = Int;
public const val `WMT_BACKUPRESTORE_BEGIN`: `WMT_STATUS` = 21;
public const val `WMT_BACKUPRESTORE_CONNECTING`: `WMT_STATUS` = 28;
public const val `WMT_BACKUPRESTORE_DISCONNECTING`: `WMT_STATUS` = 29;
public const val `WMT_BACKUPRESTORE_END`: `WMT_STATUS` = 27;
public const val `WMT_BUFFERING_START`: `WMT_STATUS` = 2;
public const val `WMT_BUFFERING_STOP`: `WMT_STATUS` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMT_BUFFER_SEGMENT` (
    public var `pBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbOffset`: UInt,
    public var `cbLength`: UInt,
)
// UNSUPPORTED Rust 210:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMT_BUFFER_SEGMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WMT_CLEANPOINT_ONLY`: `WMT_STREAM_SELECTION` = 1;
public const val `WMT_CLIENT_CONNECT`: `WMT_STATUS` = 32;
public const val `WMT_CLIENT_CONNECT_EX`: `WMT_STATUS` = 37;
public const val `WMT_CLIENT_DISCONNECT`: `WMT_STATUS` = 33;
public const val `WMT_CLIENT_DISCONNECT_EX`: `WMT_STATUS` = 38;
public const val `WMT_CLIENT_PROPERTIES`: `WMT_STATUS` = 42;
public const val `WMT_CLOSED`: `WMT_STATUS` = 13;
public const val `WMT_CODECINFO_AUDIO`: `WMT_CODEC_INFO_TYPE` = 0;
public const val `WMT_CODECINFO_UNKNOWN`: `WMT_CODEC_INFO_TYPE` = -1;
public const val `WMT_CODECINFO_VIDEO`: `WMT_CODEC_INFO_TYPE` = 1;
public typealias `WMT_CODEC_INFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_COLORSPACEINFO_EXTENSION_DATA` (
    public var `ucColorPrimaries`: UByte,
    public var `ucColorTransferChar`: UByte,
    public var `ucColorMatrixCoef`: UByte,
)
public const val `WMT_CONNECTING`: `WMT_STATUS` = 8;
public const val `WMT_CONTENT_ENABLER`: `WMT_STATUS` = 51;
public const val `WMT_CREDENTIAL_CLEAR_TEXT`: `WMT_CREDENTIAL_FLAGS` = 4;
public const val `WMT_CREDENTIAL_DONT_CACHE`: `WMT_CREDENTIAL_FLAGS` = 2;
public const val `WMT_CREDENTIAL_ENCRYPT`: `WMT_CREDENTIAL_FLAGS` = 16;
public typealias `WMT_CREDENTIAL_FLAGS` = Int;
public const val `WMT_CREDENTIAL_PROXY`: `WMT_CREDENTIAL_FLAGS` = 8;
public const val `WMT_CREDENTIAL_SAVE`: `WMT_CREDENTIAL_FLAGS` = 1;
// UNSUPPORTED Rust 241:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMT_DMOCATEGORY_AUDIO_WATERMARK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65221c5a_fa75_4b39_b50c_06c336b6a3ef);

// UNSUPPORTED Rust 242:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMT_DMOCATEGORY_VIDEO_WATERMARK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x187cc922_8efc_4404_9daf_63f4830df1bc);

public const val `WMT_DRMLA_TAMPERED`: `WMT_DRMLA_TRUST` = 2;
public typealias `WMT_DRMLA_TRUST` = Int;
public const val `WMT_DRMLA_TRUSTED`: `WMT_DRMLA_TRUST` = 1;
public const val `WMT_DRMLA_UNTRUSTED`: `WMT_DRMLA_TRUST` = 0;
public const val `WMT_END_OF_FILE`: `WMT_STATUS` = 4;
public const val `WMT_END_OF_SEGMENT`: `WMT_STATUS` = 5;
public const val `WMT_END_OF_STREAMING`: `WMT_STATUS` = 6;
public const val `WMT_EOF`: `WMT_STATUS` = 4;
public const val `WMT_ERROR`: `WMT_STATUS` = 0;
public const val `WMT_ERROR_WITHURL`: `WMT_STATUS` = 30;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMT_FILESINK_DATA_UNIT` (
    public var `packetHeaderBuffer`: `WMT_BUFFER_SEGMENT`,
    public var `cPayloads`: UInt,
    public var `pPayloadHeaderBuffers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WMT_BUFFER_SEGMENT`>?,
    public var `cPayloadDataFragments`: UInt,
    public var `pPayloadDataFragments`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WMT_PAYLOAD_FRAGMENT`>?,
)
// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMT_FILESINK_DATA_UNIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WMT_FILESINK_MODE` = Int;
public const val `WMT_FM_FILESINK_DATA_UNITS`: `WMT_FILESINK_MODE` = 2;
public const val `WMT_FM_FILESINK_UNBUFFERED`: `WMT_FILESINK_MODE` = 4;
public const val `WMT_FM_SINGLE_BUFFERS`: `WMT_FILESINK_MODE` = 1;
public const val `WMT_IMAGETYPE_BITMAP`: `WMT_ATTR_IMAGETYPE` = 1;
public const val `WMT_IMAGETYPE_GIF`: `WMT_ATTR_IMAGETYPE` = 3;
public const val `WMT_IMAGETYPE_JPEG`: `WMT_ATTR_IMAGETYPE` = 2;
public typealias `WMT_IMAGE_TYPE` = Int;
public typealias `WMT_INDEXER_TYPE` = Int;
public const val `WMT_INDEX_PROGRESS`: `WMT_STATUS` = 16;
public typealias `WMT_INDEX_TYPE` = Int;
public const val `WMT_INDIVIDUALIZE`: `WMT_STATUS` = 24;
public const val `WMT_INIT_PLAYLIST_BURN`: `WMT_STATUS` = 44;
public const val `WMT_IT_BITMAP`: `WMT_IMAGE_TYPE` = 1;
public const val `WMT_IT_FRAME_NUMBERS`: `WMT_INDEXER_TYPE` = 1;
public const val `WMT_IT_GIF`: `WMT_IMAGE_TYPE` = 3;
public const val `WMT_IT_JPEG`: `WMT_IMAGE_TYPE` = 2;
public const val `WMT_IT_NEAREST_CLEAN_POINT`: `WMT_INDEX_TYPE` = 3;
public const val `WMT_IT_NEAREST_DATA_UNIT`: `WMT_INDEX_TYPE` = 1;
public const val `WMT_IT_NEAREST_OBJECT`: `WMT_INDEX_TYPE` = 2;
public const val `WMT_IT_NONE`: `WMT_IMAGE_TYPE` = 0;
public const val `WMT_IT_PRESENTATION_TIME`: `WMT_INDEXER_TYPE` = 0;
public const val `WMT_IT_TIMECODE`: `WMT_INDEXER_TYPE` = 2;
public const val `WMT_LICENSEURL_SIGNATURE_STATE`: `WMT_STATUS` = 43;
public const val `WMT_LOCATING`: `WMT_STATUS` = 7;
public const val `WMT_MISSING_CODEC`: `WMT_STATUS` = 10;
public const val `WMT_MS_CLASS_MIXED`: `WMT_MUSICSPEECH_CLASS_MODE` = 2;
public const val `WMT_MS_CLASS_MUSIC`: `WMT_MUSICSPEECH_CLASS_MODE` = 0;
public const val `WMT_MS_CLASS_SPEECH`: `WMT_MUSICSPEECH_CLASS_MODE` = 1;
public typealias `WMT_MUSICSPEECH_CLASS_MODE` = Int;
public const val `WMT_NATIVE_OUTPUT_PROPS_CHANGED`: `WMT_STATUS` = 34;
public const val `WMT_NEEDS_INDIVIDUALIZATION`: `WMT_STATUS` = 25;
public typealias `WMT_NET_PROTOCOL` = Int;
public const val `WMT_NEW_METADATA`: `WMT_STATUS` = 20;
public const val `WMT_NEW_SOURCEFLAGS`: `WMT_STATUS` = 19;
public const val `WMT_NO_RIGHTS`: `WMT_STATUS` = 9;
public const val `WMT_NO_RIGHTS_EX`: `WMT_STATUS` = 26;
public const val `WMT_OFF`: `WMT_STREAM_SELECTION` = 0;
public typealias `WMT_OFFSET_FORMAT` = Int;
public const val `WMT_OFFSET_FORMAT_100NS`: `WMT_OFFSET_FORMAT` = 0;
public const val `WMT_OFFSET_FORMAT_100NS_APPROXIMATE`: `WMT_OFFSET_FORMAT` = 4;
public const val `WMT_OFFSET_FORMAT_FRAME_NUMBERS`: `WMT_OFFSET_FORMAT` = 1;
public const val `WMT_OFFSET_FORMAT_PLAYLIST_OFFSET`: `WMT_OFFSET_FORMAT` = 2;
public const val `WMT_OFFSET_FORMAT_TIMECODE`: `WMT_OFFSET_FORMAT` = 3;
public const val `WMT_ON`: `WMT_STREAM_SELECTION` = 2;
public const val `WMT_OPENED`: `WMT_STATUS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_PAYLOAD_FRAGMENT` (
    public var `dwPayloadIndex`: UInt,
    public var `segmentData`: `WMT_BUFFER_SEGMENT`,
)
public typealias `WMT_PLAY_MODE` = Int;
public const val `WMT_PLAY_MODE_AUTOSELECT`: `WMT_PLAY_MODE` = 0;
public const val `WMT_PLAY_MODE_DOWNLOAD`: `WMT_PLAY_MODE` = 2;
public const val `WMT_PLAY_MODE_LOCAL`: `WMT_PLAY_MODE` = 1;
public const val `WMT_PLAY_MODE_STREAMING`: `WMT_PLAY_MODE` = 3;
public const val `WMT_PREROLL_COMPLETE`: `WMT_STATUS` = 41;
public const val `WMT_PREROLL_READY`: `WMT_STATUS` = 40;
public const val `WMT_PROTOCOL_HTTP`: `WMT_NET_PROTOCOL` = 0;
public const val `WMT_PROXIMITY_COMPLETED`: `WMT_STATUS` = 50;
public const val `WMT_PROXIMITY_RESULT`: `WMT_STATUS` = 49;
public typealias `WMT_PROXY_SETTINGS` = Int;
public const val `WMT_PROXY_SETTING_AUTO`: `WMT_PROXY_SETTINGS` = 2;
public const val `WMT_PROXY_SETTING_BROWSER`: `WMT_PROXY_SETTINGS` = 3;
public const val `WMT_PROXY_SETTING_MANUAL`: `WMT_PROXY_SETTINGS` = 1;
public const val `WMT_PROXY_SETTING_MAX`: `WMT_PROXY_SETTINGS` = 4;
public const val `WMT_PROXY_SETTING_NONE`: `WMT_PROXY_SETTINGS` = 0;
public const val `WMT_RECONNECT_END`: `WMT_STATUS` = 36;
public const val `WMT_RECONNECT_START`: `WMT_STATUS` = 35;
public const val `WMT_RESTRICTED_LICENSE`: `WMT_STATUS` = 31;
public typealias `WMT_RIGHTS` = Int;
public const val `WMT_RIGHT_COLLABORATIVE_PLAY`: `WMT_RIGHTS` = 256;
public const val `WMT_RIGHT_COPY`: `WMT_RIGHTS` = 128;
public const val `WMT_RIGHT_COPY_TO_CD`: `WMT_RIGHTS` = 8;
public const val `WMT_RIGHT_COPY_TO_NON_SDMI_DEVICE`: `WMT_RIGHTS` = 2;
public const val `WMT_RIGHT_COPY_TO_SDMI_DEVICE`: `WMT_RIGHTS` = 16;
public const val `WMT_RIGHT_ONE_TIME`: `WMT_RIGHTS` = 32;
public const val `WMT_RIGHT_PLAYBACK`: `WMT_RIGHTS` = 1;
public const val `WMT_RIGHT_SAVE_STREAM_PROTECTED`: `WMT_RIGHTS` = 64;
public const val `WMT_RIGHT_SDMI_NOMORECOPIES`: `WMT_RIGHTS` = 131072;
public const val `WMT_RIGHT_SDMI_TRIGGER`: `WMT_RIGHTS` = 65536;
public const val `WMT_SAVEAS_START`: `WMT_STATUS` = 17;
public const val `WMT_SAVEAS_STOP`: `WMT_STATUS` = 18;
public const val `WMT_SET_FEC_SPAN`: `WMT_STATUS` = 39;
public const val `WMT_SOURCE_SWITCH`: `WMT_STATUS` = 22;
public const val `WMT_STARTED`: `WMT_STATUS` = 11;
public typealias `WMT_STATUS` = Int;
public const val `WMT_STOPPED`: `WMT_STATUS` = 12;
public typealias `WMT_STORAGE_FORMAT` = Int;
public typealias `WMT_STREAM_SELECTION` = Int;
public const val `WMT_STRIDING`: `WMT_STATUS` = 14;
public const val `WMT_Storage_Format_MP3`: `WMT_STORAGE_FORMAT` = 0;
public const val `WMT_Storage_Format_V1`: `WMT_STORAGE_FORMAT` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_TIMECODE_EXTENSION_DATA` (
    public var `wRange`: UShort,
    public var `dwTimecode`: UInt,
    public var `dwUserbits`: UInt,
    public var `dwAmFlags`: UInt,
)
public typealias `WMT_TIMECODE_FRAMERATE` = Int;
public const val `WMT_TIMECODE_FRAMERATE_24`: `WMT_TIMECODE_FRAMERATE` = 3;
public const val `WMT_TIMECODE_FRAMERATE_25`: `WMT_TIMECODE_FRAMERATE` = 2;
public const val `WMT_TIMECODE_FRAMERATE_30`: `WMT_TIMECODE_FRAMERATE` = 0;
public const val `WMT_TIMECODE_FRAMERATE_30DROP`: `WMT_TIMECODE_FRAMERATE` = 1;
public const val `WMT_TIMER`: `WMT_STATUS` = 15;
public const val `WMT_TRANSCRYPTOR_CLOSED`: `WMT_STATUS` = 48;
public const val `WMT_TRANSCRYPTOR_INIT`: `WMT_STATUS` = 45;
public const val `WMT_TRANSCRYPTOR_READ`: `WMT_STATUS` = 47;
public const val `WMT_TRANSCRYPTOR_SEEKED`: `WMT_STATUS` = 46;
public typealias `WMT_TRANSPORT_TYPE` = Int;
public const val `WMT_TYPE_BINARY`: `WMT_ATTR_DATATYPE` = 2;
public const val `WMT_TYPE_BOOL`: `WMT_ATTR_DATATYPE` = 3;
public const val `WMT_TYPE_DWORD`: `WMT_ATTR_DATATYPE` = 0;
public const val `WMT_TYPE_GUID`: `WMT_ATTR_DATATYPE` = 6;
public const val `WMT_TYPE_QWORD`: `WMT_ATTR_DATATYPE` = 4;
public const val `WMT_TYPE_STRING`: `WMT_ATTR_DATATYPE` = 1;
public const val `WMT_TYPE_WORD`: `WMT_ATTR_DATATYPE` = 5;
public const val `WMT_Transport_Type_Reliable`: `WMT_TRANSPORT_TYPE` = 1;
public const val `WMT_Transport_Type_Unreliable`: `WMT_TRANSPORT_TYPE` = 0;
public typealias `WMT_VERSION` = Int;
public const val `WMT_VER_4_0`: `WMT_VERSION` = 262144;
public const val `WMT_VER_7_0`: `WMT_VERSION` = 458752;
public const val `WMT_VER_8_0`: `WMT_VERSION` = 524288;
public const val `WMT_VER_9_0`: `WMT_VERSION` = 589824;
public const val `WMT_VIDEOIMAGE_INTEGER_DENOMINATOR`: Int = 65536;
public const val `WMT_VIDEOIMAGE_MAGIC_NUMBER`: UInt = 491406834u;
public const val `WMT_VIDEOIMAGE_MAGIC_NUMBER_2`: UInt = 491406835u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_VIDEOIMAGE_SAMPLE` (
    public var `dwMagic`: UInt,
    public var `cbStruct`: UInt,
    public var `dwControlFlags`: UInt,
    public var `dwInputFlagsCur`: UInt,
    public var `lCurMotionXtoX`: Int,
    public var `lCurMotionYtoX`: Int,
    public var `lCurMotionXoffset`: Int,
    public var `lCurMotionXtoY`: Int,
    public var `lCurMotionYtoY`: Int,
    public var `lCurMotionYoffset`: Int,
    public var `lCurBlendCoef1`: Int,
    public var `lCurBlendCoef2`: Int,
    public var `dwInputFlagsPrev`: UInt,
    public var `lPrevMotionXtoX`: Int,
    public var `lPrevMotionYtoX`: Int,
    public var `lPrevMotionXoffset`: Int,
    public var `lPrevMotionXtoY`: Int,
    public var `lPrevMotionYtoY`: Int,
    public var `lPrevMotionYoffset`: Int,
    public var `lPrevBlendCoef1`: Int,
    public var `lPrevBlendCoef2`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_VIDEOIMAGE_SAMPLE2` (
    public var `dwMagic`: UInt,
    public var `dwStructSize`: UInt,
    public var `dwControlFlags`: UInt,
    public var `dwViewportWidth`: UInt,
    public var `dwViewportHeight`: UInt,
    public var `dwCurrImageWidth`: UInt,
    public var `dwCurrImageHeight`: UInt,
    public var `fCurrRegionX0`: Float,
    public var `fCurrRegionY0`: Float,
    public var `fCurrRegionWidth`: Float,
    public var `fCurrRegionHeight`: Float,
    public var `fCurrBlendCoef`: Float,
    public var `dwPrevImageWidth`: UInt,
    public var `dwPrevImageHeight`: UInt,
    public var `fPrevRegionX0`: Float,
    public var `fPrevRegionY0`: Float,
    public var `fPrevRegionWidth`: Float,
    public var `fPrevRegionHeight`: Float,
    public var `fPrevBlendCoef`: Float,
    public var `dwEffectType`: UInt,
    public var `dwNumEffectParas`: UInt,
    public var `fEffectPara0`: Float,
    public var `fEffectPara1`: Float,
    public var `fEffectPara2`: Float,
    public var `fEffectPara3`: Float,
    public var `fEffectPara4`: Float,
    public var `bKeepPrevImage`: `windows_sys`.`core`.`BOOL`,
)
public const val `WMT_VIDEOIMAGE_SAMPLE_ADV_BLENDING`: UInt = 8u;
public const val `WMT_VIDEOIMAGE_SAMPLE_BLENDING`: UInt = 4u;
public const val `WMT_VIDEOIMAGE_SAMPLE_INPUT_FRAME`: UInt = 1u;
public const val `WMT_VIDEOIMAGE_SAMPLE_MOTION`: UInt = 1u;
public const val `WMT_VIDEOIMAGE_SAMPLE_OUTPUT_FRAME`: UInt = 2u;
public const val `WMT_VIDEOIMAGE_SAMPLE_ROTATION`: UInt = 2u;
public const val `WMT_VIDEOIMAGE_SAMPLE_USES_CURRENT_INPUT_FRAME`: UInt = 4u;
public const val `WMT_VIDEOIMAGE_SAMPLE_USES_PREVIOUS_INPUT_FRAME`: UInt = 8u;
public const val `WMT_VIDEOIMAGE_TRANSITION_BOW_TIE`: UInt = 11u;
public const val `WMT_VIDEOIMAGE_TRANSITION_CIRCLE`: UInt = 12u;
public const val `WMT_VIDEOIMAGE_TRANSITION_CROSS_FADE`: UInt = 13u;
public const val `WMT_VIDEOIMAGE_TRANSITION_DIAGONAL`: UInt = 14u;
public const val `WMT_VIDEOIMAGE_TRANSITION_DIAMOND`: UInt = 15u;
public const val `WMT_VIDEOIMAGE_TRANSITION_FADE_TO_COLOR`: UInt = 16u;
public const val `WMT_VIDEOIMAGE_TRANSITION_FILLED_V`: UInt = 17u;
public const val `WMT_VIDEOIMAGE_TRANSITION_FLIP`: UInt = 18u;
public const val `WMT_VIDEOIMAGE_TRANSITION_INSET`: UInt = 19u;
public const val `WMT_VIDEOIMAGE_TRANSITION_IRIS`: UInt = 20u;
public const val `WMT_VIDEOIMAGE_TRANSITION_PAGE_ROLL`: UInt = 21u;
public const val `WMT_VIDEOIMAGE_TRANSITION_RECTANGLE`: UInt = 23u;
public const val `WMT_VIDEOIMAGE_TRANSITION_REVEAL`: UInt = 24u;
public const val `WMT_VIDEOIMAGE_TRANSITION_SLIDE`: UInt = 27u;
public const val `WMT_VIDEOIMAGE_TRANSITION_SPLIT`: UInt = 29u;
public const val `WMT_VIDEOIMAGE_TRANSITION_STAR`: UInt = 30u;
public const val `WMT_VIDEOIMAGE_TRANSITION_WHEEL`: UInt = 31u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMT_WATERMARK_ENTRY` (
    public var `wmetType`: `WMT_WATERMARK_ENTRY_TYPE`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `cbDisplayName`: UInt,
    public var `pwszDisplayName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMT_WATERMARK_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WMT_WATERMARK_ENTRY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMT_WEBSTREAM_FORMAT` (
    public var `cbSize`: UShort,
    public var `cbSampleHeaderFixedData`: UShort,
    public var `wVersion`: UShort,
    public var `wReserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMT_WEBSTREAM_SAMPLE_HEADER` (
    public var `cbLength`: UShort,
    public var `wPart`: UShort,
    public var `cTotalParts`: UShort,
    public var `wSampleType`: UShort,
    public var `wszURL`: UShortArray,
)
// UNSUPPORTED Rust 509:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMT_WEBSTREAM_SAMPLE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WMT_WMETYPE_AUDIO`: `WMT_WATERMARK_ENTRY_TYPE` = 1;
public const val `WMT_WMETYPE_VIDEO`: `WMT_WATERMARK_ENTRY_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMVIDEOINFOHEADER` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwBitRate`: UInt,
    public var `dwBitErrorRate`: UInt,
    public var `AvgTimePerFrame`: Long,
    public var `bmiHeader`: `super`.`super`.`Graphics`.`Gdi`.`BITMAPINFOHEADER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WMVIDEOINFOHEADER2` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwBitRate`: UInt,
    public var `dwBitErrorRate`: UInt,
    public var `AvgTimePerFrame`: Long,
    public var `dwInterlaceFlags`: UInt,
    public var `dwCopyProtectFlags`: UInt,
    public var `dwPictAspectRatioX`: UInt,
    public var `dwPictAspectRatioY`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `bmiHeader`: `super`.`super`.`Graphics`.`Gdi`.`BITMAPINFOHEADER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_ADDRESS_ACCESSENTRY` (
    public var `dwIPAddress`: UInt,
    public var `dwMask`: UInt,
)
public typealias `WM_AETYPE` = Int;
public const val `WM_AETYPE_EXCLUDE`: `WM_AETYPE` = 101;
public const val `WM_AETYPE_INCLUDE`: `WM_AETYPE` = 105;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_CLIENT_PROPERTIES` (
    public var `dwIPAddress`: UInt,
    public var `dwPort`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_CLIENT_PROPERTIES_EX` (
    public var `cbSize`: UInt,
    public var `pwszIPAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszPort`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszDNSName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_CLIENT_PROPERTIES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WM_CL_INTERLACED420`: UInt = 0u;
public const val `WM_CL_PROGRESSIVE420`: UInt = 1u;
public const val `WM_CT_BOTTOM_FIELD_FIRST`: UInt = 32u;
public const val `WM_CT_INTERLACED`: UInt = 128u;
public const val `WM_CT_REPEAT_FIRST_FIELD`: UInt = 16u;
public const val `WM_CT_TOP_FIELD_FIRST`: UInt = 64u;
public const val `WM_DM_DEINTERLACE_HALFSIZE`: `WM_DM_INTERLACED_TYPE` = 2;
public const val `WM_DM_DEINTERLACE_HALFSIZEDOUBLERATE`: `WM_DM_INTERLACED_TYPE` = 3;
public const val `WM_DM_DEINTERLACE_INVERSETELECINE`: `WM_DM_INTERLACED_TYPE` = 4;
public const val `WM_DM_DEINTERLACE_NORMAL`: `WM_DM_INTERLACED_TYPE` = 1;
public const val `WM_DM_DEINTERLACE_VERTICALHALFSIZEDOUBLERATE`: `WM_DM_INTERLACED_TYPE` = 5;
public typealias `WM_DM_INTERLACED_TYPE` = Int;
public const val `WM_DM_IT_DISABLE_COHERENT_MODE`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 0;
public typealias `WM_DM_IT_FIRST_FRAME_COHERENCY` = Int;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_BOTTOM`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 6;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_TOP`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 1;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_BOTTOM`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 7;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_TOP`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 2;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_BOTTOM`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 8;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_TOP`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 3;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_BOTTOM`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 9;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_TOP`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 4;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_BOTTOM`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 10;
public const val `WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_TOP`: `WM_DM_IT_FIRST_FRAME_COHERENCY` = 5;
public const val `WM_DM_NOTINTERLACED`: `WM_DM_INTERLACED_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_LEAKY_BUCKET_PAIR` (
    public var `dwBitrate`: UInt,
    public var `msBufferWindow`: UInt,
)
public const val `WM_MAX_STREAMS`: UInt = 63u;
public const val `WM_MAX_VIDEO_STREAMS`: UInt = 63u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_MEDIA_TYPE` (
    public var `majortype`: `windows_sys`.`core`.`GUID`,
    public var `subtype`: `windows_sys`.`core`.`GUID`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `lSampleSize`: UInt,
    public var `formattype`: `windows_sys`.`core`.`GUID`,
    public var `pUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbFormat`: UInt,
    public var `pbFormat`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_MEDIA_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_PICTURE` (
    public var `pwszMIMEType`: `windows_sys`.`core`.`PWSTR`,
    public var `bPictureType`: UByte,
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `dwDataLen`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_PICTURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WM_PLAYBACK_DRC_HIGH`: `WM_PLAYBACK_DRC_LEVEL` = 0;
public typealias `WM_PLAYBACK_DRC_LEVEL` = Int;
public const val `WM_PLAYBACK_DRC_LOW`: `WM_PLAYBACK_DRC_LEVEL` = 2;
public const val `WM_PLAYBACK_DRC_MEDIUM`: `WM_PLAYBACK_DRC_LEVEL` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_PORT_NUMBER_RANGE` (
    public var `wPortBegin`: UShort,
    public var `wPortEnd`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_READER_CLIENTINFO` (
    public var `cbSize`: UInt,
    public var `wszLang`: `windows_sys`.`core`.`PWSTR`,
    public var `wszBrowserUserAgent`: `windows_sys`.`core`.`PWSTR`,
    public var `wszBrowserWebPage`: `windows_sys`.`core`.`PWSTR`,
    public var `qwReserved`: ULong,
    public var `pReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LPARAM`>?,
    public var `wszHostExe`: `windows_sys`.`core`.`PWSTR`,
    public var `qwHostVersion`: ULong,
    public var `wszPlayerUserAgent`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 660:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_READER_CLIENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_READER_STATISTICS` (
    public var `cbSize`: UInt,
    public var `dwBandwidth`: UInt,
    public var `cPacketsReceived`: UInt,
    public var `cPacketsRecovered`: UInt,
    public var `cPacketsLost`: UInt,
    public var `wQuality`: UShort,
)
public const val `WM_SFEX_DATALOSS`: `WM_SFEX_TYPE` = 4;
public const val `WM_SFEX_NOTASYNCPOINT`: `WM_SFEX_TYPE` = 2;
public typealias `WM_SFEX_TYPE` = Int;
public const val `WM_SF_CLEANPOINT`: `WM_SF_TYPE` = 1;
public const val `WM_SF_DATALOSS`: `WM_SF_TYPE` = 4;
public const val `WM_SF_DISCONTINUITY`: `WM_SF_TYPE` = 2;
public typealias `WM_SF_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_STREAM_PRIORITY_RECORD` (
    public var `wStreamNumber`: UShort,
    public var `fMandatory`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_STREAM_TYPE_INFO` (
    public var `guidMajorType`: `windows_sys`.`core`.`GUID`,
    public var `cbFormat`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_SYNCHRONISED_LYRICS` (
    public var `bTimeStampFormat`: UByte,
    public var `bContentType`: UByte,
    public var `pwszContentDescriptor`: `windows_sys`.`core`.`PWSTR`,
    public var `dwLyricsLen`: UInt,
    public var `pbLyrics`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_SYNCHRONISED_LYRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_ChromaLocation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4c5acca0_9276_4b2c_9e4c_a0edefdd217e);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_ColorSpaceInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf79ada56_30eb_4f2b_9f7a_f24b139a1157);

// UNSUPPORTED Rust 710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_ContentType: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd590dc20_07bc_436c_9cf7_f3bbfbf1a4dc);

// UNSUPPORTED Rust 711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_FileName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe165ec0e_19ed_45d7_b4a7_25cbd1e28e9b);

// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_OutputCleanPoint: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a3c6f_6eb4_4ebc_b192_09ad9759e828);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_PixelAspectRatio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b1ee554_f9ea_4bc8_821a_376b74e4c4b8);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_SampleDuration: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6bd9450_867f_4907_83a3_c77921b733ad);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_SampleProtectionSalt: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5403deee_b9ee_438f_aa83_3804997e569d);

// UNSUPPORTED Rust 716:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_Timecode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x399595ec_8667_4e2d_8fdb_98814ce76c1e);

// UNSUPPORTED Rust 717:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WM_SampleExtensionGUID_UserDataInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x732bb4fa_78be_4549_99bd_02db1a55b7a8);

public const val `WM_SampleExtension_ChromaLocation_Size`: UInt = 1u;
public const val `WM_SampleExtension_ColorSpaceInfo_Size`: UInt = 3u;
public const val `WM_SampleExtension_ContentType_Size`: UInt = 1u;
public const val `WM_SampleExtension_PixelAspectRatio_Size`: UInt = 2u;
public const val `WM_SampleExtension_SampleDuration_Size`: UInt = 2u;
public const val `WM_SampleExtension_Timecode_Size`: UInt = 14u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_USER_TEXT` (
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszText`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_USER_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WM_USER_WEB_URL` (
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszURL`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 741:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WM_USER_WEB_URL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_WRITER_STATISTICS` (
    public var `qwSampleCount`: ULong,
    public var `qwByteCount`: ULong,
    public var `qwDroppedSampleCount`: ULong,
    public var `qwDroppedByteCount`: ULong,
    public var `dwCurrentBitrate`: UInt,
    public var `dwAverageBitrate`: UInt,
    public var `dwExpectedBitrate`: UInt,
    public var `dwCurrentSampleRate`: UInt,
    public var `dwAverageSampleRate`: UInt,
    public var `dwExpectedSampleRate`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WM_WRITER_STATISTICS_EX` (
    public var `dwBitratePlusOverhead`: UInt,
    public var `dwCurrentSampleDropRateInQueue`: UInt,
    public var `dwCurrentSampleDropRateInCodec`: UInt,
    public var `dwCurrentSampleDropRateInMultiplexer`: UInt,
    public var `dwTotalSampleDropsInQueue`: UInt,
    public var `dwTotalSampleDropsInCodec`: UInt,
    public var `dwTotalSampleDropsInMultiplexer`: UInt,
)
public typealias `_AM_ASFWRITERCONFIG_PARAM` = Int;
public const val `g_dwWMContentAttributes`: UInt = 5u;
public const val `g_dwWMNSCAttributes`: UInt = 5u;
public const val `g_dwWMSpecialAttributes`: UInt = 20u;
// UNSUPPORTED Rust 775:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszASFLeakyBucketPairs: windows_sys::core::PCWSTR = windows_sys::core::w!("ASFLeakyBucketPairs");

// UNSUPPORTED Rust 776:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszAllowInterlacedOutput: windows_sys::core::PCWSTR = windows_sys::core::w!("AllowInterlacedOutput");

// UNSUPPORTED Rust 777:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszAverageLevel: windows_sys::core::PCWSTR = windows_sys::core::w!("AverageLevel");

// UNSUPPORTED Rust 778:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszBufferAverage: windows_sys::core::PCWSTR = windows_sys::core::w!("Buffer Average");

// UNSUPPORTED Rust 779:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszComplexity: windows_sys::core::PCWSTR = windows_sys::core::w!("_COMPLEXITYEX");

// UNSUPPORTED Rust 780:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszComplexityLive: windows_sys::core::PCWSTR = windows_sys::core::w!("_COMPLEXITYEXLIVE");

// UNSUPPORTED Rust 781:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszComplexityMax: windows_sys::core::PCWSTR = windows_sys::core::w!("_COMPLEXITYEXMAX");

// UNSUPPORTED Rust 782:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszComplexityOffline: windows_sys::core::PCWSTR = windows_sys::core::w!("_COMPLEXITYEXOFFLINE");

// UNSUPPORTED Rust 783:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDecoderComplexityRequested: windows_sys::core::PCWSTR = windows_sys::core::w!("_DECODERCOMPLEXITYPROFILE");

// UNSUPPORTED Rust 784:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDedicatedDeliveryThread: windows_sys::core::PCWSTR = windows_sys::core::w!("DedicatedDeliveryThread");

// UNSUPPORTED Rust 785:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDeinterlaceMode: windows_sys::core::PCWSTR = windows_sys::core::w!("DeinterlaceMode");

// UNSUPPORTED Rust 786:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDeliverOnReceive: windows_sys::core::PCWSTR = windows_sys::core::w!("DeliverOnReceive");

// UNSUPPORTED Rust 787:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDeviceConformanceTemplate: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceConformanceTemplate");

// UNSUPPORTED Rust 788:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszDynamicRangeControl: windows_sys::core::PCWSTR = windows_sys::core::w!("DynamicRangeControl");

// UNSUPPORTED Rust 789:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszEDL: windows_sys::core::PCWSTR = windows_sys::core::w!("_EDL");

// UNSUPPORTED Rust 790:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszEarlyDataDelivery: windows_sys::core::PCWSTR = windows_sys::core::w!("EarlyDataDelivery");

// UNSUPPORTED Rust 791:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszEnableDiscreteOutput: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableDiscreteOutput");

// UNSUPPORTED Rust 792:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszEnableFrameInterpolation: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableFrameInterpolation");

// UNSUPPORTED Rust 793:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszEnableWMAProSPDIFOutput: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableWMAProSPDIFOutput");

// UNSUPPORTED Rust 794:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszFailSeekOnError: windows_sys::core::PCWSTR = windows_sys::core::w!("FailSeekOnError");

// UNSUPPORTED Rust 795:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszFixedFrameRate: windows_sys::core::PCWSTR = windows_sys::core::w!("FixedFrameRate");

// UNSUPPORTED Rust 796:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszFold6To2Channels3: windows_sys::core::PCWSTR = windows_sys::core::w!("Fold6To2Channels3");

// UNSUPPORTED Rust 797:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszFoldToChannelsTemplate: windows_sys::core::PCWSTR = windows_sys::core::w!("Fold%luTo%luChannels%lu");

// UNSUPPORTED Rust 798:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszInitialPatternForInverseTelecine: windows_sys::core::PCWSTR = windows_sys::core::w!("InitialPatternForInverseTelecine");

// UNSUPPORTED Rust 799:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszInterlacedCoding: windows_sys::core::PCWSTR = windows_sys::core::w!("InterlacedCoding");

// UNSUPPORTED Rust 800:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszIsVBRSupported: windows_sys::core::PCWSTR = windows_sys::core::w!("_ISVBRSUPPORTED");

// UNSUPPORTED Rust 801:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszJPEGCompressionQuality: windows_sys::core::PCWSTR = windows_sys::core::w!("JPEGCompressionQuality");

// UNSUPPORTED Rust 802:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszJustInTimeDecode: windows_sys::core::PCWSTR = windows_sys::core::w!("JustInTimeDecode");

// UNSUPPORTED Rust 803:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszMixedClassMode: windows_sys::core::PCWSTR = windows_sys::core::w!("MixedClassMode");

// UNSUPPORTED Rust 804:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszMusicClassMode: windows_sys::core::PCWSTR = windows_sys::core::w!("MusicClassMode");

// UNSUPPORTED Rust 805:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszMusicSpeechClassMode: windows_sys::core::PCWSTR = windows_sys::core::w!("MusicSpeechClassMode");

// UNSUPPORTED Rust 806:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszNeedsPreviousSample: windows_sys::core::PCWSTR = windows_sys::core::w!("NeedsPreviousSample");

// UNSUPPORTED Rust 807:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszNumPasses: windows_sys::core::PCWSTR = windows_sys::core::w!("_PASSESUSED");

// UNSUPPORTED Rust 808:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszOriginalSourceFormatTag: windows_sys::core::PCWSTR = windows_sys::core::w!("_SOURCEFORMATTAG");

// UNSUPPORTED Rust 809:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszOriginalWaveFormat: windows_sys::core::PCWSTR = windows_sys::core::w!("_ORIGINALWAVEFORMAT");

// UNSUPPORTED Rust 810:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszPeakValue: windows_sys::core::PCWSTR = windows_sys::core::w!("PeakValue");

// UNSUPPORTED Rust 811:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszPermitSeeksBeyondEndOfStream: windows_sys::core::PCWSTR = windows_sys::core::w!("PermitSeeksBeyondEndOfStream");

// UNSUPPORTED Rust 812:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszReloadIndexOnSeek: windows_sys::core::PCWSTR = windows_sys::core::w!("ReloadIndexOnSeek");

// UNSUPPORTED Rust 813:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszScrambledAudio: windows_sys::core::PCWSTR = windows_sys::core::w!("ScrambledAudio");

// UNSUPPORTED Rust 814:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSingleOutputBuffer: windows_sys::core::PCWSTR = windows_sys::core::w!("SingleOutputBuffer");

// UNSUPPORTED Rust 815:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSoftwareScaling: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftwareScaling");

// UNSUPPORTED Rust 816:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSourceBufferTime: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceBufferTime");

// UNSUPPORTED Rust 817:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSourceMaxBytesAtOnce: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceMaxBytesAtOnce");

// UNSUPPORTED Rust 818:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSpeakerConfig: windows_sys::core::PCWSTR = windows_sys::core::w!("SpeakerConfig");

// UNSUPPORTED Rust 819:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSpeechCaps: windows_sys::core::PCWSTR = windows_sys::core::w!("SpeechFormatCap");

// UNSUPPORTED Rust 820:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszSpeechClassMode: windows_sys::core::PCWSTR = windows_sys::core::w!("SpeechClassMode");

// UNSUPPORTED Rust 821:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszStreamLanguage: windows_sys::core::PCWSTR = windows_sys::core::w!("StreamLanguage");

// UNSUPPORTED Rust 822:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszStreamNumIndexObjects: windows_sys::core::PCWSTR = windows_sys::core::w!("StreamNumIndexObjects");

// UNSUPPORTED Rust 823:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszUsePacketAtSeekPoint: windows_sys::core::PCWSTR = windows_sys::core::w!("UsePacketAtSeekPoint");

// UNSUPPORTED Rust 824:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVBRBitrateMax: windows_sys::core::PCWSTR = windows_sys::core::w!("_RMAX");

// UNSUPPORTED Rust 825:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVBRBufferWindowMax: windows_sys::core::PCWSTR = windows_sys::core::w!("_BMAX");

// UNSUPPORTED Rust 826:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVBREnabled: windows_sys::core::PCWSTR = windows_sys::core::w!("_VBRENABLED");

// UNSUPPORTED Rust 827:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVBRPeak: windows_sys::core::PCWSTR = windows_sys::core::w!("VBR Peak");

// UNSUPPORTED Rust 828:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVBRQuality: windows_sys::core::PCWSTR = windows_sys::core::w!("_VBRQUALITY");

// UNSUPPORTED Rust 829:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszVideoSampleDurations: windows_sys::core::PCWSTR = windows_sys::core::w!("VideoSampleDurations");

// UNSUPPORTED Rust 830:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMADID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ADID");

// UNSUPPORTED Rust 831:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMASFPacketCount: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ASFPacketCount");

// UNSUPPORTED Rust 832:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMASFSecurityObjectsSize: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ASFSecurityObjectsSize");

// UNSUPPORTED Rust 833:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAlbumArtist: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AlbumArtist");

// UNSUPPORTED Rust 834:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAlbumArtistSort: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AlbumArtistSort");

// UNSUPPORTED Rust 835:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAlbumCoverURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AlbumCoverURL");

// UNSUPPORTED Rust 836:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAlbumTitle: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AlbumTitle");

// UNSUPPORTED Rust 837:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAlbumTitleSort: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AlbumTitleSort");

// UNSUPPORTED Rust 838:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAspectRatioX: windows_sys::core::PCWSTR = windows_sys::core::w!("AspectRatioX");

// UNSUPPORTED Rust 839:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAspectRatioY: windows_sys::core::PCWSTR = windows_sys::core::w!("AspectRatioY");

// UNSUPPORTED Rust 840:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAudioFileURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AudioFileURL");

// UNSUPPORTED Rust 841:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAudioSourceURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AudioSourceURL");

// UNSUPPORTED Rust 842:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAuthor: windows_sys::core::PCWSTR = windows_sys::core::w!("Author");

// UNSUPPORTED Rust 843:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAuthorSort: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthorSort");

// UNSUPPORTED Rust 844:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMAuthorURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/AuthorURL");

// UNSUPPORTED Rust 845:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBannerImageData: windows_sys::core::PCWSTR = windows_sys::core::w!("BannerImageData");

// UNSUPPORTED Rust 846:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBannerImageType: windows_sys::core::PCWSTR = windows_sys::core::w!("BannerImageType");

// UNSUPPORTED Rust 847:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBannerImageURL: windows_sys::core::PCWSTR = windows_sys::core::w!("BannerImageURL");

// UNSUPPORTED Rust 848:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBeatsPerMinute: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/BeatsPerMinute");

// UNSUPPORTED Rust 849:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBitrate: windows_sys::core::PCWSTR = windows_sys::core::w!("Bitrate");

// UNSUPPORTED Rust 850:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMBroadcast: windows_sys::core::PCWSTR = windows_sys::core::w!("Broadcast");

// UNSUPPORTED Rust 851:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMCategory: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Category");

// UNSUPPORTED Rust 852:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMCodec: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Codec");

// UNSUPPORTED Rust 853:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMComposer: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Composer");

// UNSUPPORTED Rust 854:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMComposerSort: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ComposerSort");

// UNSUPPORTED Rust 855:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMConductor: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Conductor");

// UNSUPPORTED Rust 856:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMContainerFormat: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ContainerFormat");

// UNSUPPORTED Rust 857:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMContentDistributor: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ContentDistributor");

// UNSUPPORTED Rust 858:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMContentGroupDescription: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ContentGroupDescription");

// UNSUPPORTED Rust 859:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMCopyright: windows_sys::core::PCWSTR = windows_sys::core::w!("Copyright");

// UNSUPPORTED Rust 860:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMCopyrightURL: windows_sys::core::PCWSTR = windows_sys::core::w!("CopyrightURL");

// UNSUPPORTED Rust 861:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMCurrentBitrate: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentBitrate");

// UNSUPPORTED Rust 862:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/DRM");

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_ContentID: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_ContentID");

// UNSUPPORTED Rust 864:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_Flags: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_Flags");

// UNSUPPORTED Rust 865:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_HeaderSignPrivKey: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_HeaderSignPrivKey");

// UNSUPPORTED Rust 866:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_IndividualizedVersion: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_IndividualizedVersion");

// UNSUPPORTED Rust 867:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_KeyID: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_KeyID");

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_KeySeed: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_KeySeed");

// UNSUPPORTED Rust 869:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_LASignatureCert: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_LASignatureCert");

// UNSUPPORTED Rust 870:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_LASignatureLicSrvCert: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_LASignatureLicSrvCert");

// UNSUPPORTED Rust 871:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_LASignaturePrivKey: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_LASignaturePrivKey");

// UNSUPPORTED Rust 872:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_LASignatureRootCert: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_LASignatureRootCert");

// UNSUPPORTED Rust 873:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_Level: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_Level");

// UNSUPPORTED Rust 874:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_LicenseAcqURL: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_LicenseAcqURL");

// UNSUPPORTED Rust 875:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_SourceID: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_SourceID");

// UNSUPPORTED Rust 876:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDRM_V1LicenseAcqURL: windows_sys::core::PCWSTR = windows_sys::core::w!("DRM_V1LicenseAcqURL");

// UNSUPPORTED Rust 877:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDVDID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/DVDID");

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDescription: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDirector: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Director");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMDuration: windows_sys::core::PCWSTR = windows_sys::core::w!("Duration");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMEncodedBy: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/EncodedBy");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMEncodingSettings: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/EncodingSettings");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMEncodingTime: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/EncodingTime");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMEpisodeNumber: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/EpisodeNumber");

// UNSUPPORTED Rust 885:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMFileSize: windows_sys::core::PCWSTR = windows_sys::core::w!("FileSize");

// UNSUPPORTED Rust 886:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMGenre: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Genre");

// UNSUPPORTED Rust 887:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMGenreID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/GenreID");

// UNSUPPORTED Rust 888:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasArbitraryDataStream: windows_sys::core::PCWSTR = windows_sys::core::w!("HasArbitraryDataStream");

// UNSUPPORTED Rust 889:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasAttachedImages: windows_sys::core::PCWSTR = windows_sys::core::w!("HasAttachedImages");

// UNSUPPORTED Rust 890:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasAudio: windows_sys::core::PCWSTR = windows_sys::core::w!("HasAudio");

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasFileTransferStream: windows_sys::core::PCWSTR = windows_sys::core::w!("HasFileTransferStream");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasImage: windows_sys::core::PCWSTR = windows_sys::core::w!("HasImage");

// UNSUPPORTED Rust 893:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasScript: windows_sys::core::PCWSTR = windows_sys::core::w!("HasScript");

// UNSUPPORTED Rust 894:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMHasVideo: windows_sys::core::PCWSTR = windows_sys::core::w!("HasVideo");

// UNSUPPORTED Rust 895:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMISAN: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ISAN");

// UNSUPPORTED Rust 896:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMISRC: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ISRC");

// UNSUPPORTED Rust 897:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMInitialKey: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/InitialKey");

// UNSUPPORTED Rust 898:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMIsCompilation: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/IsCompilation");

// UNSUPPORTED Rust 899:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMIsVBR: windows_sys::core::PCWSTR = windows_sys::core::w!("IsVBR");

// UNSUPPORTED Rust 900:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMLanguage: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Language");

// UNSUPPORTED Rust 901:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMLyrics: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Lyrics");

// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMLyrics_Synchronised: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Lyrics_Synchronised");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMCDI: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MCDI");

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaClassPrimaryID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaClassPrimaryID");

// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaClassSecondaryID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaClassSecondaryID");

// UNSUPPORTED Rust 906:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaCredits: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaCredits");

// UNSUPPORTED Rust 907:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsDelay: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsDelay");

// UNSUPPORTED Rust 908:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsFinale: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsFinale");

// UNSUPPORTED Rust 909:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsLive: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsLive");

// UNSUPPORTED Rust 910:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsPremiere: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsPremiere");

// UNSUPPORTED Rust 911:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsRepeat: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsRepeat");

// UNSUPPORTED Rust 912:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsSAP: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsSAP");

// UNSUPPORTED Rust 913:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsStereo: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsStereo");

// UNSUPPORTED Rust 914:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsSubtitled: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsSubtitled");

// UNSUPPORTED Rust 915:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaIsTape: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaIsTape");

// UNSUPPORTED Rust 916:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaNetworkAffiliation: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaNetworkAffiliation");

// UNSUPPORTED Rust 917:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaOriginalBroadcastDateTime: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaOriginalBroadcastDateTime");

// UNSUPPORTED Rust 918:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaOriginalChannel: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaOriginalChannel");

// UNSUPPORTED Rust 919:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaStationCallSign: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaStationCallSign");

// UNSUPPORTED Rust 920:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMediaStationName: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/MediaStationName");

// UNSUPPORTED Rust 921:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMModifiedBy: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ModifiedBy");

// UNSUPPORTED Rust 922:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMMood: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Mood");

// UNSUPPORTED Rust 923:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNSCAddress: windows_sys::core::PCWSTR = windows_sys::core::w!("NSC_Address");

// UNSUPPORTED Rust 924:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNSCDescription: windows_sys::core::PCWSTR = windows_sys::core::w!("NSC_Description");

// UNSUPPORTED Rust 925:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNSCEmail: windows_sys::core::PCWSTR = windows_sys::core::w!("NSC_Email");

// UNSUPPORTED Rust 926:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNSCName: windows_sys::core::PCWSTR = windows_sys::core::w!("NSC_Name");

// UNSUPPORTED Rust 927:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNSCPhone: windows_sys::core::PCWSTR = windows_sys::core::w!("NSC_Phone");

// UNSUPPORTED Rust 928:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMNumberOfFrames: windows_sys::core::PCWSTR = windows_sys::core::w!("NumberOfFrames");

// UNSUPPORTED Rust 929:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOptimalBitrate: windows_sys::core::PCWSTR = windows_sys::core::w!("OptimalBitrate");

// UNSUPPORTED Rust 930:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalAlbumTitle: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalAlbumTitle");

// UNSUPPORTED Rust 931:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalArtist: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalArtist");

// UNSUPPORTED Rust 932:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalFilename: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalFilename");

// UNSUPPORTED Rust 933:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalLyricist: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalLyricist");

// UNSUPPORTED Rust 934:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalReleaseTime: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalReleaseTime");

// UNSUPPORTED Rust 935:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMOriginalReleaseYear: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/OriginalReleaseYear");

// UNSUPPORTED Rust 936:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMParentalRating: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ParentalRating");

// UNSUPPORTED Rust 937:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMParentalRatingReason: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ParentalRatingReason");

// UNSUPPORTED Rust 938:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPartOfSet: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/PartOfSet");

// UNSUPPORTED Rust 939:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPeakBitrate: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/PeakBitrate");

// UNSUPPORTED Rust 940:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPeriod: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Period");

// UNSUPPORTED Rust 941:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPicture: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Picture");

// UNSUPPORTED Rust 942:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPlaylistDelay: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/PlaylistDelay");

// UNSUPPORTED Rust 943:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProducer: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Producer");

// UNSUPPORTED Rust 944:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPromotionURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/PromotionURL");

// UNSUPPORTED Rust 945:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProtected: windows_sys::core::PCWSTR = windows_sys::core::w!("Is_Protected");

// UNSUPPORTED Rust 946:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProtectionType: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ProtectionType");

// UNSUPPORTED Rust 947:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProvider: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Provider");

// UNSUPPORTED Rust 948:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProviderCopyright: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ProviderCopyright");

// UNSUPPORTED Rust 949:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProviderRating: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ProviderRating");

// UNSUPPORTED Rust 950:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMProviderStyle: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ProviderStyle");

// UNSUPPORTED Rust 951:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMPublisher: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Publisher");

// UNSUPPORTED Rust 952:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMRadioStationName: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/RadioStationName");

// UNSUPPORTED Rust 953:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMRadioStationOwner: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/RadioStationOwner");

// UNSUPPORTED Rust 954:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMRating: windows_sys::core::PCWSTR = windows_sys::core::w!("Rating");

// UNSUPPORTED Rust 955:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSeasonNumber: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/SeasonNumber");

// UNSUPPORTED Rust 956:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSeekable: windows_sys::core::PCWSTR = windows_sys::core::w!("Seekable");

// UNSUPPORTED Rust 957:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSharedUserRating: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/SharedUserRating");

// UNSUPPORTED Rust 958:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSignature_Name: windows_sys::core::PCWSTR = windows_sys::core::w!("Signature_Name");

// UNSUPPORTED Rust 959:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSkipBackward: windows_sys::core::PCWSTR = windows_sys::core::w!("Can_Skip_Backward");

// UNSUPPORTED Rust 960:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSkipForward: windows_sys::core::PCWSTR = windows_sys::core::w!("Can_Skip_Forward");

// UNSUPPORTED Rust 961:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMStreamTypeInfo: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/StreamTypeInfo");

// UNSUPPORTED Rust 962:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMStridable: windows_sys::core::PCWSTR = windows_sys::core::w!("Stridable");

// UNSUPPORTED Rust 963:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSubTitle: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/SubTitle");

// UNSUPPORTED Rust 964:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSubTitleDescription: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/SubTitleDescription");

// UNSUPPORTED Rust 965:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMSubscriptionContentID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/SubscriptionContentID");

// UNSUPPORTED Rust 966:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMText: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Text");

// UNSUPPORTED Rust 967:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMTitle: windows_sys::core::PCWSTR = windows_sys::core::w!("Title");

// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMTitleSort: windows_sys::core::PCWSTR = windows_sys::core::w!("TitleSort");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMToolName: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ToolName");

// UNSUPPORTED Rust 970:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMToolVersion: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/ToolVersion");

// UNSUPPORTED Rust 971:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMTrack: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Track");

// UNSUPPORTED Rust 972:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMTrackNumber: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/TrackNumber");

// UNSUPPORTED Rust 973:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMTrusted: windows_sys::core::PCWSTR = windows_sys::core::w!("Is_Trusted");

// UNSUPPORTED Rust 974:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMUniqueFileIdentifier: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/UniqueFileIdentifier");

// UNSUPPORTED Rust 975:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMUse_Advanced_DRM: windows_sys::core::PCWSTR = windows_sys::core::w!("Use_Advanced_DRM");

// UNSUPPORTED Rust 976:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMUse_DRM: windows_sys::core::PCWSTR = windows_sys::core::w!("Use_DRM");

// UNSUPPORTED Rust 977:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMUserWebURL: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/UserWebURL");

// UNSUPPORTED Rust 978:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMVideoClosedCaptioning: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/VideoClosedCaptioning");

// UNSUPPORTED Rust 979:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMVideoFrameRate: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/VideoFrameRate");

// UNSUPPORTED Rust 980:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMVideoHeight: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/VideoHeight");

// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMVideoWidth: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/VideoWidth");

// UNSUPPORTED Rust 982:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMADRCAverageReference: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMADRCAverageReference");

// UNSUPPORTED Rust 983:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMADRCAverageTarget: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMADRCAverageTarget");

// UNSUPPORTED Rust 984:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMADRCPeakReference: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMADRCPeakReference");

// UNSUPPORTED Rust 985:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMADRCPeakTarget: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMADRCPeakTarget");

// UNSUPPORTED Rust 986:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMCPDistributor: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMCPDistributor");

// UNSUPPORTED Rust 987:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMCPDistributorID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMCPDistributorID");

// UNSUPPORTED Rust 988:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMCollectionGroupID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMCollectionGroupID");

// UNSUPPORTED Rust 989:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMCollectionID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMCollectionID");

// UNSUPPORTED Rust 990:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMContentID: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMContentID");

// UNSUPPORTED Rust 991:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMShadowFileSourceDRMType: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMShadowFileSourceDRMType");

// UNSUPPORTED Rust 992:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWMShadowFileSourceFileType: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/WMShadowFileSourceFileType");

// UNSUPPORTED Rust 993:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMWriter: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Writer");

// UNSUPPORTED Rust 994:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWMYear: windows_sys::core::PCWSTR = windows_sys::core::w!("WM/Year");

// UNSUPPORTED Rust 995:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWatermarkCLSID: windows_sys::core::PCWSTR = windows_sys::core::w!("WatermarkCLSID");

// UNSUPPORTED Rust 996:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const g_wszWatermarkConfig: windows_sys::core::PCWSTR = windows_sys::core::w!("WatermarkConfig");

