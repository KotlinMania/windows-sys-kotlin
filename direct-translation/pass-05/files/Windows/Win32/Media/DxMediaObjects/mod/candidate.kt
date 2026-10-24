// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=DMOEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMOEnum`(`guidcategory` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `cintypes` : UInt, `pintypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?, `couttypes` : UInt, `pouttypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?, `ppenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=DMOGetName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMOGetName`(`clsiddmo` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `szname` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=DMOGetTypes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMOGetTypes`(`clsiddmo` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ulinputtypesrequested` : UInt, `pulinputtypessupplied` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pinputtypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?, `uloutputtypesrequested` : UInt, `puloutputtypessupplied` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `poutputtypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=DMORegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMORegister`(`szname` : `windows_sys`.`core`.`PCWSTR`, `clsiddmo` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `guidcategory` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `cintypes` : UInt, `pintypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?, `couttypes` : UInt, `pouttypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_PARTIAL_MEDIATYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=DMOUnregister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMOUnregister`(`clsiddmo` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `guidcategory` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoCopyMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoCopyMediaType`(`pmtdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?, `pmtsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoCreateMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoCreateMediaType`(`ppmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DMO_MEDIA_TYPE`>>?, `cbformat` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoDeleteMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoDeleteMediaType`(`pmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoDuplicateMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoDuplicateMediaType`(`ppmtdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DMO_MEDIA_TYPE`>>?, `pmtsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoFreeMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoFreeMediaType`(`pmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdmo.dll, ABI=system, export=MoInitMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoInitMediaType`(`pmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DMO_MEDIA_TYPE`>?, `cbformat` : UInt) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 12:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_ACOUSTIC_ECHO_CANCEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf963d80_c559_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AGC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe88c9ba0_c557_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 14:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AUDIO_CAPTURE_EFFECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf665aaba_3e09_4920_aa5f_219811148f09);

// UNSUPPORTED Rust 15:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AUDIO_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57f2db8b_e6bb_4513_9d43_dcd2a6593125);

// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AUDIO_EFFECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3602b3f_0592_48df_a4cd_674721e7ebeb);

// UNSUPPORTED Rust 17:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AUDIO_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33d9a761_90c8_11d0_bd43_00a0c911ce86);

// UNSUPPORTED Rust 18:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_AUDIO_NOISE_SUPPRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe07f903f_62fd_4e60_8cdd_dea7236665b5);

// UNSUPPORTED Rust 19:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_VIDEO_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a69b442_28be_4991_969c_b500adf5d8a8);

// UNSUPPORTED Rust 20:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_VIDEO_EFFECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd990ee14_776c_4723_be46_3da2f56f10b9);

// UNSUPPORTED Rust 21:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DMOCATEGORY_VIDEO_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33d9a760_90c8_11d0_bd43_00a0c911ce86);

public const val `DMO_ENUMF_INCLUDE_KEYED`: `DMO_ENUM_FLAGS` = 1;
public typealias `DMO_ENUM_FLAGS` = Int;
public const val `DMO_E_INVALIDSTREAMINDEX`: Int = -2147220991;
public const val `DMO_E_INVALIDTYPE`: Int = -2147220990;
public const val `DMO_E_NOTACCEPTING`: Int = -2147220988;
public const val `DMO_E_NO_MORE_ITEMS`: Int = -2147220986;
public const val `DMO_E_TYPE_NOT_ACCEPTED`: Int = -2147220987;
public const val `DMO_E_TYPE_NOT_SET`: Int = -2147220989;
public const val `DMO_INPLACE_NORMAL`: `_DMO_INPLACE_PROCESS_FLAGS` = 0;
public const val `DMO_INPLACE_ZERO`: `_DMO_INPLACE_PROCESS_FLAGS` = 1;
public const val `DMO_INPUT_DATA_BUFFERF_DISCONTINUITY`: `_DMO_INPUT_DATA_BUFFER_FLAGS` = 8;
public const val `DMO_INPUT_DATA_BUFFERF_SYNCPOINT`: `_DMO_INPUT_DATA_BUFFER_FLAGS` = 1;
public const val `DMO_INPUT_DATA_BUFFERF_TIME`: `_DMO_INPUT_DATA_BUFFER_FLAGS` = 2;
public const val `DMO_INPUT_DATA_BUFFERF_TIMELENGTH`: `_DMO_INPUT_DATA_BUFFER_FLAGS` = 4;
public const val `DMO_INPUT_STATUSF_ACCEPT_DATA`: `_DMO_INPUT_STATUS_FLAGS` = 1;
public const val `DMO_INPUT_STREAMF_FIXED_SAMPLE_SIZE`: `_DMO_INPUT_STREAM_INFO_FLAGS` = 4;
public const val `DMO_INPUT_STREAMF_HOLDS_BUFFERS`: `_DMO_INPUT_STREAM_INFO_FLAGS` = 8;
public const val `DMO_INPUT_STREAMF_SINGLE_SAMPLE_PER_BUFFER`: `_DMO_INPUT_STREAM_INFO_FLAGS` = 2;
public const val `DMO_INPUT_STREAMF_WHOLE_SAMPLES`: `_DMO_INPUT_STREAM_INFO_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DMO_MEDIA_TYPE` (
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
// UNSUPPORTED Rust 54:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DMO_MEDIA_TYPE {
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
public class `DMO_OUTPUT_DATA_BUFFER` (
    public var `pBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwStatus`: UInt,
    public var `rtTimestamp`: Long,
    public var `rtTimelength`: Long,
)
// UNSUPPORTED Rust 67:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DMO_OUTPUT_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DMO_OUTPUT_DATA_BUFFERF_DISCONTINUITY`: `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = 8;
public const val `DMO_OUTPUT_DATA_BUFFERF_INCOMPLETE`: `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = 16777216;
public const val `DMO_OUTPUT_DATA_BUFFERF_SYNCPOINT`: `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = 1;
public const val `DMO_OUTPUT_DATA_BUFFERF_TIME`: `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = 2;
public const val `DMO_OUTPUT_DATA_BUFFERF_TIMELENGTH`: `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = 4;
public const val `DMO_OUTPUT_STREAMF_DISCARDABLE`: `_DMO_OUTPUT_STREAM_INFO_FLAGS` = 8;
public const val `DMO_OUTPUT_STREAMF_FIXED_SAMPLE_SIZE`: `_DMO_OUTPUT_STREAM_INFO_FLAGS` = 4;
public const val `DMO_OUTPUT_STREAMF_OPTIONAL`: `_DMO_OUTPUT_STREAM_INFO_FLAGS` = 16;
public const val `DMO_OUTPUT_STREAMF_SINGLE_SAMPLE_PER_BUFFER`: `_DMO_OUTPUT_STREAM_INFO_FLAGS` = 2;
public const val `DMO_OUTPUT_STREAMF_WHOLE_SAMPLES`: `_DMO_OUTPUT_STREAM_INFO_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DMO_PARTIAL_MEDIATYPE` (
    public var `type`: `windows_sys`.`core`.`GUID`,
    public var `subtype`: `windows_sys`.`core`.`GUID`,
)
public const val `DMO_PROCESS_OUTPUT_DISCARD_WHEN_NO_BUFFER`: `_DMO_PROCESS_OUTPUT_FLAGS` = 1;
public const val `DMO_QUALITY_STATUS_ENABLED`: `_DMO_QUALITY_STATUS_FLAGS` = 1;
public const val `DMO_REGISTERF_IS_KEYED`: `DMO_REGISTER_FLAGS` = 1;
public typealias `DMO_REGISTER_FLAGS` = Int;
public const val `DMO_SET_TYPEF_CLEAR`: `_DMO_SET_TYPE_FLAGS` = 2;
public const val `DMO_SET_TYPEF_TEST_ONLY`: `_DMO_SET_TYPE_FLAGS` = 1;
public const val `DMO_VOSF_NEEDS_PREVIOUS_SAMPLE`: `_DMO_VIDEO_OUTPUT_STREAM_FLAGS` = 1;
public typealias `_DMO_INPLACE_PROCESS_FLAGS` = Int;
public typealias `_DMO_INPUT_DATA_BUFFER_FLAGS` = Int;
public typealias `_DMO_INPUT_STATUS_FLAGS` = Int;
public typealias `_DMO_INPUT_STREAM_INFO_FLAGS` = Int;
public typealias `_DMO_OUTPUT_DATA_BUFFER_FLAGS` = Int;
public typealias `_DMO_OUTPUT_STREAM_INFO_FLAGS` = Int;
public typealias `_DMO_PROCESS_OUTPUT_FLAGS` = Int;
public typealias `_DMO_QUALITY_STATUS_FLAGS` = Int;
public typealias `_DMO_SET_TYPE_FLAGS` = Int;
public typealias `_DMO_VIDEO_OUTPUT_STREAM_FLAGS` = Int;
