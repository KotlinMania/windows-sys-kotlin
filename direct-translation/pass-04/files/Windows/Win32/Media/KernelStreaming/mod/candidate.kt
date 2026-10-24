// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateAllocator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateAllocator`(`connectionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `allocatorframing` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSALLOCATOR_FRAMING`>?, `allocatorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateAllocator2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateAllocator2`(`connectionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `allocatorframing` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSALLOCATOR_FRAMING`>?, `allocatorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateClock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateClock`(`connectionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `clockcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSCLOCK_CREATE`>?, `clockhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateClock2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateClock2`(`connectionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `clockcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSCLOCK_CREATE`>?, `clockhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreatePin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreatePin`(`filterhandle` : `super`.`super`.`Foundation`.`HANDLE`, `connect` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSPIN_CONNECT`>?, `desiredaccess` : UInt, `connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreatePin2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreatePin2`(`filterhandle` : `super`.`super`.`Foundation`.`HANDLE`, `connect` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSPIN_CONNECT`>?, `desiredaccess` : UInt, `connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateTopologyNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateTopologyNode`(`parenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `nodecreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSNODE_CREATE`>?, `desiredaccess` : UInt, `nodehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksuser.dll, ABI=system, export=KsCreateTopologyNode2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsCreateTopologyNode2`(`parenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `nodecreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSNODE_CREATE`>?, `desiredaccess` : UInt, `nodehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksproxy.ax, ABI=system, export=KsGetMediaTypeCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsGetMediaTypeCount`(`filterhandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinfactoryid` : UInt, `mediatypecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksproxy.ax, ABI=system, export=KsGetMultiplePinFactoryItems; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsGetMultiplePinFactoryItems`(`filterhandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinfactoryid` : UInt, `propertyid` : UInt, `items` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksproxy.ax, ABI=system, export=KsOpenDefaultDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsOpenDefaultDevice`(`category` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `access` : UInt, `devicehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksproxy.ax, ABI=system, export=KsResolveRequiredAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsResolveRequiredAttributes`(`datarange` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSDATAFORMAT`>?, `attributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`KSMULTIPLE_ITEM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ksproxy.ax, ABI=system, export=KsSynchronousDeviceControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KsSynchronousDeviceControl`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `iocontrol` : UInt, `inbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inlength` : UInt, `outbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outlength` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
public const val `AEC_MODE_FULL_DUPLEX`: UInt = 2u;
public const val `AEC_MODE_HALF_DUPLEX`: UInt = 1u;
public const val `AEC_MODE_PASS_THROUGH`: UInt = 0u;
public const val `AEC_STATUS_FD_CURRENTLY_CONVERGED`: UInt = 8u;
public const val `AEC_STATUS_FD_HISTORY_CONTINUOUSLY_CONVERGED`: UInt = 1u;
public const val `AEC_STATUS_FD_HISTORY_PREVIOUSLY_DIVERGED`: UInt = 2u;
public const val `AEC_STATUS_FD_HISTORY_UNINITIALIZED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ALLOCATOR_PROPERTIES_EX` (
    public var `cBuffers`: Int,
    public var `cbBuffer`: Int,
    public var `cbAlign`: Int,
    public var `cbPrefix`: Int,
    public var `MemoryType`: `windows_sys`.`core`.`GUID`,
    public var `BusType`: `windows_sys`.`core`.`GUID`,
    public var `State`: `PIPE_STATE`,
    public var `Input`: `PIPE_TERMINATION`,
    public var `Output`: `PIPE_TERMINATION`,
    public var `Strategy`: UInt,
    public var `Flags`: UInt,
    public var `Weight`: UInt,
    public var `LogicalMemoryType`: `KS_LogicalMemoryType`,
    public var `AllocatorPlace`: `PIPE_ALLOCATOR_PLACE`,
    public var `Dimensions`: `PIPE_DIMENSIONS`,
    public var `PhysicalRange`: `KS_FRAMING_RANGE`,
    public var `PrevSegment`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CountNextSegments`: UInt,
    public var `NextSegments`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `InsideFactors`: UInt,
    public var `NumberPins`: UInt,
)
// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ALLOCATOR_PROPERTIES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const APO_CLASS_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5989fce8_9cd0_467d_8a6a_5419e31529d4);

// UNSUPPORTED Rust 52:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIOENDPOINT_CLASS_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc166523c_fe0c_4a94_a586_f1a80cfbbf3e);

public const val `AUDIOMODULE_MAX_DATA_SIZE`: UInt = 64000u;
public const val `AUDIOMODULE_MAX_NAME_CCH_SIZE`: UInt = 128u;
public typealias `AUDIOPOSTURE_ORIENTATION` = Int;
public const val `AUDIOPOSTURE_ORIENTATION_NOTROTATED`: `AUDIOPOSTURE_ORIENTATION` = 0;
public const val `AUDIOPOSTURE_ORIENTATION_ROTATED180DEGREESCOUNTERCLOCKWISE`: `AUDIOPOSTURE_ORIENTATION` = 2;
public const val `AUDIOPOSTURE_ORIENTATION_ROTATED270DEGREESCOUNTERCLOCKWISE`: `AUDIOPOSTURE_ORIENTATION` = 3;
public const val `AUDIOPOSTURE_ORIENTATION_ROTATED90DEGREESCOUNTERCLOCKWISE`: `AUDIOPOSTURE_ORIENTATION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIORESOURCEMANAGEMENT_RESOURCEGROUP` (
    public var `ResourceGroupAcquired`: `windows_sys`.`core`.`BOOL`,
    public var `ResourceGroupName`: UShortArray,
)
// UNSUPPORTED Rust 66:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIORESOURCEMANAGEMENT_RESOURCEGROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AUDIO_CURVE_TYPE` = Int;
public const val `AUDIO_CURVE_TYPE_NONE`: `AUDIO_CURVE_TYPE` = 0;
public const val `AUDIO_CURVE_TYPE_WINDOWS_FADE`: `AUDIO_CURVE_TYPE` = 1;
// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_ACOUSTIC_ECHO_CANCELLATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adbe_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_AUTOMATIC_GAIN_CONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc0_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_BASS_BOOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc5_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 77:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_BASS_MANAGEMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adca_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_BEAMFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc1_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_CONSTANT_TONE_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc2_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_DEEP_NOISE_SUPPRESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64add0_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_DYNAMIC_RANGE_COMPRESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adce_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_ENVIRONMENTAL_EFFECTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adcb_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 83:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_EQUALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc3_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_FAR_FIELD_BEAMFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adcf_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_LOUDNESS_EQUALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc4_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_NOISE_SUPPRESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adbf_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_ROOM_CORRECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc9_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_SPEAKER_COMPENSATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adcd_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_SPEAKER_FILL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc8_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_SPEAKER_PROTECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adcc_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_VIRTUAL_HEADPHONES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc7_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_EFFECT_TYPE_VIRTUAL_SURROUND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f64adc6_8211_11e2_8c70_2c27d7f001fa);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_COMMUNICATIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98951333_b9cd_48b1_a0a3_ff40682d73f7);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_DEFAULT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc18e2f7e_933d_4965_b7d1_1eef228d2af3);

// UNSUPPORTED Rust 95:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_FAR_FIELD_SPEECH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28941cba_3be6_4a78_9a76_30fd91559b64);

// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_MEDIA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4780004e_7133_41d8_8c74_660dadd2c0ee);

// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_MOVIE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb26feb0d_ec94_477c_9494_d1ab8e753f6e);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9cf2a70b_f377_403b_bd6b_360863e0355c);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_RAW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e90ea20_b493_4fd1_a1a8_7e1361a956cf);

// UNSUPPORTED Rust 100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AUDIO_SIGNALPROCESSINGMODE_SPEECH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc1cfc9b_b9d6_4cfa_b5e0_4bb2166878b2);

public const val `AllocatorStrategy_DontCare`: UInt = 0u;
public const val `AllocatorStrategy_MaximizeSpeed`: UInt = 8u;
public const val `AllocatorStrategy_MinimizeFrameSize`: UInt = 2u;
public const val `AllocatorStrategy_MinimizeNumberOfAllocators`: UInt = 4u;
public const val `AllocatorStrategy_MinimizeNumberOfFrames`: UInt = 1u;
// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BLUETOOTHLE_MIDI_SERVICE_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03b80e5a_ede8_4b33_a751_6ce34ec4c700);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BLUETOOTH_MIDI_DATAIO_CHARACTERISTIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7772e5db_3868_4112_a1a9_f2669d106bf3);

public const val `BUS_INTERFACE_REFERENCE_VERSION`: UInt = 256u;
public typealias `CAPTURE_MEMORY_ALLOCATION_FLAGS` = Int;
public const val `CASCADE_FORM`: `KSDS3D_HRTF_FILTER_METHOD` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CC_BYTE_PAIR` (
    public var `Decoded`: UByteArray,
    public var `Reserved`: UShort,
)
// UNSUPPORTED Rust 117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CC_BYTE_PAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CC_HW_FIELD` (
    public var `ScanlinesRequested`: `VBICODECFILTERING_SCANLINES`,
    public var `fieldFlags`: UInt,
    public var `PictureNumber`: Long,
    public var `Lines`: Array<`CC_BYTE_PAIR`>,
)
// UNSUPPORTED Rust 130:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CC_HW_FIELD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CC_MAX_HW_DECODE_LINES`: UInt = 12u;
// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_KsIBasicAudioInterfaceHandler: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9f8ac3e_0f71_11d2_b72c_00c04fb6bd3d);

// UNSUPPORTED Rust 137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_Proxy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17cca71b_ecd7_11d0_b908_00a0c9223196);

public typealias `CONSTRICTOR_OPTION` = Int;
public const val `CONSTRICTOR_OPTION_DISABLE`: `CONSTRICTOR_OPTION` = 0;
public const val `CONSTRICTOR_OPTION_MUTE`: `CONSTRICTOR_OPTION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVCAPS` (
    public var `CanRecord`: Int,
    public var `CanRecordStrobe`: Int,
    public var `HasAudio`: Int,
    public var `HasVideo`: Int,
    public var `UsesFiles`: Int,
    public var `CanSave`: Int,
    public var `DeviceType`: Int,
    public var `TCRead`: Int,
    public var `TCWrite`: Int,
    public var `CTLRead`: Int,
    public var `IndexRead`: Int,
    public var `Preroll`: Int,
    public var `Postroll`: Int,
    public var `SyncAcc`: Int,
    public var `NormRate`: Int,
    public var `CanPreview`: Int,
    public var `CanMonitorSrc`: Int,
    public var `CanTest`: Int,
    public var `VideoIn`: Int,
    public var `AudioIn`: Int,
    public var `Calibrate`: Int,
    public var `SeekType`: Int,
    public var `SimulatedHardware`: Int,
)
// UNSUPPORTED Rust 168:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_KsAudio_Controller_DeviceInterface_Path: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x13e004d6_b066_43bd_913b_a415cd13da87), pid: 3 };

// UNSUPPORTED Rust 169:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_KsAudio_PacketSize_Constraints: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x13e004d6_b066_43bd_913b_a415cd13da87), pid: 2 };

// UNSUPPORTED Rust 170:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_KsAudio_PacketSize_Constraints2: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x9404f781_7191_409b_8b0b_80bf6ec229ae), pid: 2 };

public const val `DIRECT_FORM`: `KSDS3D_HRTF_FILTER_METHOD` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS3DVECTOR` (
    public var `Anonymous1`: `DS3DVECTOR_0`,
    public var `Anonymous2`: `DS3DVECTOR_1`,
    public var `Anonymous3`: `DS3DVECTOR_2`,
)
// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS3DVECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 184:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DS3DVECTOR_0 {
//     pub x: f32,
//     pub dvX: f32,
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS3DVECTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 195:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DS3DVECTOR_1 {
//     pub y: f32,
//     pub dvY: f32,
// }

// UNSUPPORTED Rust 201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS3DVECTOR_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 206:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DS3DVECTOR_2 {
//     pub z: f32,
//     pub dvZ: f32,
// }

// UNSUPPORTED Rust 212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS3DVECTOR_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS3D_HRTF_VERSION_1`: `KSDS3D_HRTF_FILTER_VERSION` = 0;
public typealias `EDeviceControlUseType` = Int;
public typealias `EPcxConnectionType` = Int;
public typealias `EPcxGenLocation` = Int;
public const val `EPcxGenLocation_enum_count`: `EPcxGenLocation` = 4;
public typealias `EPcxGeoLocation` = Int;
public const val `EPcxGeoLocation_enum_count`: `EPcxGeoLocation` = 16;
public typealias `EPxcPortConnection` = Int;
// UNSUPPORTED Rust 225:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EVENTSETID_CROSSBAR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0641_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 226:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EVENTSETID_TUNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0606_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 227:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EVENTSETID_VIDCAP_CAMERACONTROL_REGION_OF_INTEREST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2fdffc5d_c732_4ba6_b5df_6b4d7fc88b8b);

// UNSUPPORTED Rust 228:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EVENTSETID_VIDEODECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0621_28e4_11d0_a18c_00a0c9118956);

public const val `FLOAT_COEFF`: `KSDS3D_HRTF_COEFF_FORMAT` = 0;
public typealias `FRAMING_CACHE_OPS` = Int;
public typealias `FRAMING_PROP` = Int;
public const val `FULL_FILTER`: `KSDS3D_HRTF_FILTER_QUALITY` = 0;
public const val `FramingProp_Ex`: `FRAMING_PROP` = 3;
public const val `FramingProp_None`: `FRAMING_PROP` = 1;
public const val `FramingProp_Old`: `FRAMING_PROP` = 2;
public const val `FramingProp_Uninitialized`: `FRAMING_PROP` = 0;
public const val `Framing_Cache_ReadLast`: `FRAMING_CACHE_OPS` = 1;
public const val `Framing_Cache_ReadOrig`: `FRAMING_CACHE_OPS` = 2;
public const val `Framing_Cache_Update`: `FRAMING_CACHE_OPS` = 0;
public const val `Framing_Cache_Write`: `FRAMING_CACHE_OPS` = 3;
// UNSUPPORTED Rust 241:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_NULL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERLEAVED_AUDIO_FORMAT_INFORMATION` (
    public var `Size`: UInt,
    public var `PrimaryChannelCount`: UInt,
    public var `PrimaryChannelStartPosition`: UInt,
    public var `PrimaryChannelMask`: UInt,
    public var `InterleavedChannelCount`: UInt,
    public var `InterleavedChannelStartPosition`: UInt,
    public var `InterleavedChannelMask`: UInt,
)
public const val `IOCTL_KS_DISABLE_EVENT`: UInt = 3080203u;
public const val `IOCTL_KS_ENABLE_EVENT`: UInt = 3080199u;
public const val `IOCTL_KS_HANDSHAKE`: UInt = 3080223u;
public const val `IOCTL_KS_METHOD`: UInt = 3080207u;
public const val `IOCTL_KS_PROPERTY`: UInt = 3080195u;
public const val `IOCTL_KS_READ_STREAM`: UInt = 3096599u;
public const val `IOCTL_KS_RESET_STATE`: UInt = 3080219u;
public const val `IOCTL_KS_WRITE_STREAM`: UInt = 3112979u;
public const val `JACKDESC2_DYNAMIC_FORMAT_CHANGE_CAPABILITY`: UInt = 2u;
public const val `JACKDESC2_PRESENCE_DETECT_CAPABILITY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_ALTERNATE_AUDIO` (
    public var `fStereo`: `windows_sys`.`core`.`BOOL`,
    public var `DualMode`: UInt,
)
public const val `KSAC3_ALTERNATE_AUDIO_1`: UInt = 1u;
public const val `KSAC3_ALTERNATE_AUDIO_2`: UInt = 2u;
public const val `KSAC3_ALTERNATE_AUDIO_BOTH`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_BIT_STREAM_MODE` (
    public var `BitStreamMode`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_DIALOGUE_LEVEL` (
    public var `DialogueLevel`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_DOWNMIX` (
    public var `fDownMix`: `windows_sys`.`core`.`BOOL`,
    public var `fDolbySurround`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_ERROR_CONCEALMENT` (
    public var `fRepeatPreviousBlock`: `windows_sys`.`core`.`BOOL`,
    public var `fErrorInCurrentBlock`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAC3_ROOM_TYPE` (
    public var `fLargeRoom`: `windows_sys`.`core`.`BOOL`,
)
public const val `KSAC3_SERVICE_COMMENTARY`: UInt = 5u;
public const val `KSAC3_SERVICE_DIALOG_ONLY`: UInt = 4u;
public const val `KSAC3_SERVICE_EMERGENCY_FLASH`: UInt = 6u;
public const val `KSAC3_SERVICE_HEARING_IMPAIRED`: UInt = 3u;
public const val `KSAC3_SERVICE_MAIN_AUDIO`: UInt = 0u;
public const val `KSAC3_SERVICE_NO_DIALOG`: UInt = 1u;
public const val `KSAC3_SERVICE_VISUALLY_IMPAIRED`: UInt = 2u;
public const val `KSAC3_SERVICE_VOICE_OVER`: UInt = 7u;
// UNSUPPORTED Rust 307:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSALGORITHMINSTANCE_SYSTEM_ACOUSTIC_ECHO_CANCEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c22c56d_9879_4f5b_a389_27996ddc2810);

// UNSUPPORTED Rust 308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSALGORITHMINSTANCE_SYSTEM_AGC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x950e55b9_877c_4c67_be08_e47b5611130a);

// UNSUPPORTED Rust 309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSALGORITHMINSTANCE_SYSTEM_MICROPHONE_ARRAY_PROCESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb6f5a0a0_9e61_4f8c_91e3_76cf0f3c471f);

// UNSUPPORTED Rust 310:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSALGORITHMINSTANCE_SYSTEM_NOISE_SUPPRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ab0882e_7274_4516_877d_4eee99ba4fd0);

public typealias `KSALLOCATORMODE` = Int;
public const val `KSALLOCATOR_FLAG_2D_BUFFER_REQUIRED`: UInt = 32768u;
public const val `KSALLOCATOR_FLAG_ALLOCATOR_EXISTS`: UInt = 2048u;
public const val `KSALLOCATOR_FLAG_ATTENTION_STEPPING`: UInt = 8192u;
public const val `KSALLOCATOR_FLAG_CAN_ALLOCATE`: UInt = 64u;
public const val `KSALLOCATOR_FLAG_CYCLE`: UInt = 1024u;
public const val `KSALLOCATOR_FLAG_DEVICE_SPECIFIC`: UInt = 32u;
public const val `KSALLOCATOR_FLAG_ENABLE_CACHED_MDL`: UInt = 16384u;
public const val `KSALLOCATOR_FLAG_INDEPENDENT_RANGES`: UInt = 4096u;
public const val `KSALLOCATOR_FLAG_INSIST_ON_FRAMESIZE_RATIO`: UInt = 128u;
public const val `KSALLOCATOR_FLAG_MULTIPLE_OUTPUT`: UInt = 512u;
public const val `KSALLOCATOR_FLAG_NO_FRAME_INTEGRITY`: UInt = 256u;
public const val `KSALLOCATOR_FLAG_PARTIAL_READ_SUPPORT`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSALLOCATOR_FRAMING` (
    public var `Anonymous1`: `KSALLOCATOR_FRAMING_0`,
    public var `PoolType`: UInt,
    public var `Frames`: UInt,
    public var `FrameSize`: UInt,
    public var `Anonymous2`: `KSALLOCATOR_FRAMING_1`,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSALLOCATOR_FRAMING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 339:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSALLOCATOR_FRAMING_0 {
//     pub OptionsFlags: u32,
//     pub RequirementsFlags: u32,
// }

// UNSUPPORTED Rust 345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSALLOCATOR_FRAMING_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 350:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSALLOCATOR_FRAMING_1 {
//     pub FileAlignment: u32,
//     pub FramePitch: i32,
// }

// UNSUPPORTED Rust 356:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSALLOCATOR_FRAMING_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSALLOCATOR_FRAMING_EX` (
    public var `CountItems`: UInt,
    public var `PinFlags`: UInt,
    public var `OutputCompression`: `KS_COMPRESSION`,
    public var `PinWeight`: UInt,
    public var `FramingItem`: Array<`KS_FRAMING_ITEM`>,
)
// UNSUPPORTED Rust 370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSALLOCATOR_FRAMING_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSALLOCATOR_OPTIONF_COMPATIBLE`: UInt = 1u;
public const val `KSALLOCATOR_OPTIONF_SYSTEM_MEMORY`: UInt = 2u;
public const val `KSALLOCATOR_OPTIONF_VALID`: UInt = 3u;
public const val `KSALLOCATOR_REQUIREMENTF_FRAME_INTEGRITY`: UInt = 4u;
public const val `KSALLOCATOR_REQUIREMENTF_INPLACE_MODIFIER`: UInt = 1u;
public const val `KSALLOCATOR_REQUIREMENTF_MUST_ALLOCATE`: UInt = 8u;
public const val `KSALLOCATOR_REQUIREMENTF_PREFERENCES_ONLY`: UInt = 2147483648u;
public const val `KSALLOCATOR_REQUIREMENTF_SYSTEM_MEMORY`: UInt = 2u;
public const val `KSALLOCATOR_REQUIREMENTF_SYSTEM_MEMORY_CUSTOM_ALLOCATION`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSATTRIBUTE` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Attribute`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 391:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSATTRIBUTEID_AUDIOSIGNALPROCESSING_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1f89eb5_5f46_419b_967b_ff6770b98401);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSATTRIBUTE_AUDIOSIGNALPROCESSING_MODE` (
    public var `AttributeHeader`: `KSATTRIBUTE`,
    public var `SignalProcessingMode`: `windows_sys`.`core`.`GUID`,
)
public const val `KSATTRIBUTE_REQUIRED`: UInt = 1u;
public const val `KSAUDDECOUTMODE_PCM_51`: UInt = 2u;
public const val `KSAUDDECOUTMODE_SPDIFF`: UInt = 4u;
public const val `KSAUDDECOUTMODE_STEREO_ANALOG`: UInt = 1u;
// UNSUPPORTED Rust 402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_3D_CENTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f0670b4_991f_11d2_ac4d_00c04f8efb68);

// UNSUPPORTED Rust 403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_3D_DEPTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63ff5747_991f_11d2_ac4d_00c04f8efb68);

// UNSUPPORTED Rust 404:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_3D_STEREO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede2_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_ALTERNATE_MICROPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2bc31d6b_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_AUX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedfe_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_AUX_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedfd_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_AUX_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedfc_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_BASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede0_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_CD_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedfb_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_CD_IN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf3_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_CD_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedea_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_CD_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede9_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_LINE_IN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf9_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_LINE_IN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf4_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_LINE_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedec_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_LINE_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedeb_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MASTER_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede4_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MASTER_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede3_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 420:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MICROPHONE_BOOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2bc31d6a_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 421:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIC_IN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf5_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIC_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedee_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIC_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185feded_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIDI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf8_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIDI_IN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf2_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIDI_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede8_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIDI_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede7_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MIDRANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa2cbe478_ae84_49a1_8b72_4ad09b78ed34);

// UNSUPPORTED Rust 429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_MIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00dff078_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_MIX_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2bc31d69_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_MIX_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22b0eafe_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_OUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9b41dc3_96e2_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_OUT_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ad247ec_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_MONO_OUT_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ad247eb_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 435:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_PC_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedff_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 436:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_PC_SPEAKER_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf1_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_PC_SPEAKER_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf0_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_PEAKMETER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57e24340_fc5b_4612_a562_72b11a29dfae);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_RECORDING_CONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedfa_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 440:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_RECORDING_SOURCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedef_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 441:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_STEREO_MIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00dff077_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 442:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_STEREO_MIX_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22b0eafd_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 443:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_STEREO_MIX_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ad247ed_96e3_11d2_ac4c_00c04f8efb68);

// UNSUPPORTED Rust 444:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_TREBLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede1_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 445:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x915daec4_a434_11d2_ac52_00c04f8efb68);

// UNSUPPORTED Rust 446:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_VIDEO_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b46e709_992a_11d2_ac4d_00c04f8efb68);

// UNSUPPORTED Rust 447:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_VIDEO_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b46e708_992a_11d2_ac4d_00c04f8efb68);

// UNSUPPORTED Rust 448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_VOLUME_CONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf7_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_WAVE_IN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fedf6_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_WAVE_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede6_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_WAVE_OUT_MIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fee00_9905_11d1_95a9_00c04fb925d3);

// UNSUPPORTED Rust 452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSAUDFNAME_WAVE_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185fede5_9905_11d1_95a9_00c04fb925d3);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIOENGINE_BUFFER_SIZE_RANGE` (
    public var `MinBufferBytes`: UInt,
    public var `MaxBufferBytes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIOENGINE_DESCRIPTOR` (
    public var `nHostPinId`: UInt,
    public var `nOffloadPinId`: UInt,
    public var `nLoopbackPinId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIOENGINE_DEVICECONTROLS` (
    public var `Volume`: `EDeviceControlUseType`,
    public var `Mute`: `EDeviceControlUseType`,
    public var `PeakMeter`: `EDeviceControlUseType`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIOENGINE_VOLUMELEVEL` (
    public var `TargetVolume`: Int,
    public var `CurveType`: `AUDIO_CURVE_TYPE`,
    public var `CurveDuration`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIOMODULE_DESCRIPTOR` (
    public var `ClassId`: `windows_sys`.`core`.`GUID`,
    public var `InstanceId`: UInt,
    public var `VersionMajor`: UInt,
    public var `VersionMinor`: UInt,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIOMODULE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIOMODULE_NOTIFICATION` (
    public var `Anonymous`: `KSAUDIOMODULE_NOTIFICATION_0`,
)
// UNSUPPORTED Rust 499:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIOMODULE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 504:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSAUDIOMODULE_NOTIFICATION_0 {
//     pub ProviderId: KSAUDIOMODULE_NOTIFICATION_0_0,
//     pub Alignment: i64,
// }

// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIOMODULE_NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIOMODULE_NOTIFICATION_0_0` (
    public var `DeviceId`: `windows_sys`.`core`.`GUID`,
    public var `ClassId`: `windows_sys`.`core`.`GUID`,
    public var `InstanceId`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIOMODULE_PROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `ClassId`: `windows_sys`.`core`.`GUID`,
    public var `InstanceId`: UInt,
)
// UNSUPPORTED Rust 530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIOMODULE_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_CHANNEL_CONFIG` (
    public var `ActiveSpeakerPositions`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_COPY_PROTECTION` (
    public var `fCopyrighted`: `windows_sys`.`core`.`BOOL`,
    public var `fOriginal`: `windows_sys`.`core`.`BOOL`,
)
public const val `KSAUDIO_CPU_RESOURCES_HOST_CPU`: UInt = 2147483647u;
public const val `KSAUDIO_CPU_RESOURCES_NOT_HOST_CPU`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_DYNAMIC_RANGE` (
    public var `QuietCompression`: UInt,
    public var `LoudCompression`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_MICROPHONE_COORDINATES` (
    public var `usType`: UShort,
    public var `wXCoord`: Short,
    public var `wYCoord`: Short,
    public var `wZCoord`: Short,
    public var `wVerticalAngle`: Short,
    public var `wHorizontalAngle`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIO_MIC_ARRAY_GEOMETRY` (
    public var `usVersion`: UShort,
    public var `usMicArrayType`: UShort,
    public var `wVerticalAngleBegin`: Short,
    public var `wVerticalAngleEnd`: Short,
    public var `wHorizontalAngleBegin`: Short,
    public var `wHorizontalAngleEnd`: Short,
    public var `usFrequencyBandLo`: UShort,
    public var `usFrequencyBandHi`: UShort,
    public var `usNumberOfMicrophones`: UShort,
    public var `KsMicCoord`: Array<`KSAUDIO_MICROPHONE_COORDINATES`>,
)
// UNSUPPORTED Rust 578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_MIC_ARRAY_GEOMETRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIO_MIXCAP_TABLE` (
    public var `InputChannels`: UInt,
    public var `OutputChannels`: UInt,
    public var `Capabilities`: Array<`KSAUDIO_MIX_CAPS`>,
)
// UNSUPPORTED Rust 590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_MIXCAP_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_MIXLEVEL` (
    public var `Mute`: `windows_sys`.`core`.`BOOL`,
    public var `Level`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIO_MIX_CAPS` (
    public var `Mute`: `windows_sys`.`core`.`BOOL`,
    public var `Minimum`: Int,
    public var `Maximum`: Int,
    public var `Anonymous`: `KSAUDIO_MIX_CAPS_0`,
)
// UNSUPPORTED Rust 609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_MIX_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 614:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSAUDIO_MIX_CAPS_0 {
//     pub Reset: i32,
//     pub Resolution: i32,
// }

// UNSUPPORTED Rust 620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_MIX_CAPS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIO_PACKETSIZE_CONSTRAINTS` (
    public var `MinPacketPeriodInHns`: UInt,
    public var `PacketSizeFileAlignment`: UInt,
    public var `Reserved`: UInt,
    public var `NumProcessingModeConstraints`: UInt,
    public var `ProcessingModeConstraints`: Array<`KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT`>,
)
// UNSUPPORTED Rust 634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_PACKETSIZE_CONSTRAINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSAUDIO_PACKETSIZE_CONSTRAINTS2` (
    public var `MinPacketPeriodInHns`: UInt,
    public var `PacketSizeFileAlignment`: UInt,
    public var `MaxPacketSizeInBytes`: UInt,
    public var `NumProcessingModeConstraints`: UInt,
    public var `ProcessingModeConstraints`: Array<`KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT`>,
)
// UNSUPPORTED Rust 648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSAUDIO_PACKETSIZE_CONSTRAINTS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT` (
    public var `ProcessingMode`: `windows_sys`.`core`.`GUID`,
    public var `SamplesPerProcessingPacket`: UInt,
    public var `ProcessingPacketDurationInHns`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_POSITION` (
    public var `PlayOffset`: ULong,
    public var `WriteOffset`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_POSITIONEX` (
    public var `TimerFrequency`: Long,
    public var `TimeStamp1`: Long,
    public var `Position`: `KSAUDIO_POSITION`,
    public var `TimeStamp2`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSAUDIO_PRESENTATION_POSITION` (
    public var `u64PositionInBlocks`: ULong,
    public var `u64QPCPosition`: ULong,
)
public const val `KSAUDIO_QUALITY_ADVANCED`: UInt = 3u;
public const val `KSAUDIO_QUALITY_BASIC`: UInt = 2u;
public const val `KSAUDIO_QUALITY_PC`: UInt = 1u;
public const val `KSAUDIO_QUALITY_WORST`: UInt = 0u;
public const val `KSAUDIO_SPEAKER_DIRECTOUT`: UInt = 0u;
public const val `KSAUDIO_SPEAKER_GROUND_FRONT_CENTER`: UInt = 4u;
public const val `KSAUDIO_SPEAKER_GROUND_FRONT_LEFT`: UInt = 1u;
public const val `KSAUDIO_SPEAKER_GROUND_FRONT_RIGHT`: UInt = 2u;
public const val `KSAUDIO_SPEAKER_GROUND_REAR_LEFT`: UInt = 16u;
public const val `KSAUDIO_SPEAKER_GROUND_REAR_RIGHT`: UInt = 32u;
public const val `KSAUDIO_SPEAKER_MONO`: UInt = 4u;
public const val `KSAUDIO_SPEAKER_SUPER_WOOFER`: UInt = 8u;
public const val `KSAUDIO_SPEAKER_TOP_MIDDLE`: UInt = 2048u;
public const val `KSAUDIO_STEREO_SPEAKER_GEOMETRY_HEADPHONE`: Int = -1;
public const val `KSAUDIO_STEREO_SPEAKER_GEOMETRY_MAX`: UInt = 180u;
public const val `KSAUDIO_STEREO_SPEAKER_GEOMETRY_MIN`: UInt = 5u;
public const val `KSAUDIO_STEREO_SPEAKER_GEOMETRY_NARROW`: UInt = 10u;
public const val `KSAUDIO_STEREO_SPEAKER_GEOMETRY_WIDE`: UInt = 20u;
// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_BalancedVideoAndPhoto: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6b52b017_42c7_4a21_bfe3_23f009149887);

// UNSUPPORTED Rust 699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_CompressedCamera: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e34cdc1_27ad_437f_abde_02b629f37b44);

public const val `KSCAMERAPROFILE_FLAGS_FACEDETECTION`: ULong = 8uL;
public const val `KSCAMERAPROFILE_FLAGS_PHOTOHDR`: ULong = 4uL;
public const val `KSCAMERAPROFILE_FLAGS_PREVIEW_RES_MUSTMATCH`: ULong = 32uL;
public const val `KSCAMERAPROFILE_FLAGS_VARIABLEPHOTOSEQUENCE`: ULong = 16uL;
public const val `KSCAMERAPROFILE_FLAGS_VIDEOHDR`: ULong = 2uL;
public const val `KSCAMERAPROFILE_FLAGS_VIDEOSTABLIZATION`: ULong = 1uL;
// UNSUPPORTED Rust 706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_FaceAuth_Mode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81361b22_700b_4546_a2d4_c52e907bfc27);

// UNSUPPORTED Rust 707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_HDRWithWCGPhoto: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bf6f1ff_b555_4625_b326_a46def318fb7);

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_HDRWithWCGVideo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b27c336_4924_4989_b994_fdaf1dc7cd85);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_HighFrameRate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x566e6113_8c35_48e7_b89f_d23fdc1219dc);

// UNSUPPORTED Rust 710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_HighQualityPhoto: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32440725_961b_4ca3_b5b2_854e719d9e1b);

// UNSUPPORTED Rust 711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_Legacy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb4894d81_62b7_4eec_8740_80658c4a9d3e);

// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_PhotoSequence: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x02399d9d_4ee8_49ba_bc07_5ff156531413);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_VariablePhotoSequence: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ff2cb56_e75a_49b1_a928_9985d5946f87);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_VideoConferencing: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc5444a88_e1bf_4597_b2dd_9e1ead864bb8);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_VideoHDR8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4f3f4ec_bdff_4314_b1d4_008e281f74e7);

// UNSUPPORTED Rust 716:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCAMERAPROFILE_VideoRecording: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0e517e8_8f8c_4f6f_9a57_46fc2f647ec0);

public const val `KSCAMERA_EXTENDEDPROP_ADVANCEDPHOTO_AUTO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_ADVANCEDPHOTO_FNF`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_ADVANCEDPHOTO_HDR`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_ADVANCEDPHOTO_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_ADVANCEDPHOTO_ULTRALOWLIGHT`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_BLUR`: ULong = 1uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS` (
    public var `Resolution`: `super`.`super`.`Foundation`.`SIZE`,
    public var `MaxFrameRate`: `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS_0`,
    public var `MaskResolution`: `super`.`super`.`Foundation`.`SIZE`,
    public var `SubType`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS_0` (
    public var `Numerator`: Int,
    public var `Denominator`: Int,
)
public const val `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_MASK`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_SHALLOWFOCUS`: ULong = 4uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_CAMERAOFFSET` (
    public var `PitchAngle`: Int,
    public var `YawAngle`: Int,
    public var `Flag`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_CAPS_ASYNCCONTROL`: ULong = 9223372036854775808uL;
public const val `KSCAMERA_EXTENDEDPROP_CAPS_CANCELLABLE`: ULong = 4611686018427387904uL;
public const val `KSCAMERA_EXTENDEDPROP_CAPS_MASK`: ULong = 18374686479671623680uL;
public const val `KSCAMERA_EXTENDEDPROP_CAPS_RESERVED`: ULong = 18374686479671623680uL;
public const val `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_AUTOFACEFRAMING`: ULong = 1uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_CONFIGCAPS` (
    public var `ResolutionX`: Int,
    public var `ResolutionY`: Int,
    public var `PorchTop`: Int,
    public var `PorchLeft`: Int,
    public var `PorchBottom`: Int,
    public var `PorchRight`: Int,
    public var `NonUpscalingWindowSize`: Int,
    public var `MinWindowSize`: Int,
    public var `MaxWindowSize`: Int,
    public var `Reserved`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_CONFIGCAPSHEADER` (
    public var `Size`: UInt,
    public var `Count`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_MANUAL`: ULong = 0uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_SETTING` (
    public var `OriginX`: Int,
    public var `OriginY`: Int,
    public var `WindowSize`: Int,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_EVCOMPENSATION` (
    public var `Mode`: UInt,
    public var `Min`: Int,
    public var `Max`: Int,
    public var `Value`: Int,
    public var `Reserved`: ULong,
)
public const val `KSCAMERA_EXTENDEDPROP_EVCOMP_FULLSTEP`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_EVCOMP_HALFSTEP`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_EVCOMP_QUARTERSTEP`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_EVCOMP_SIXTHSTEP`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_EVCOMP_THIRDSTEP`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_EYEGAZECORRECTION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_EYEGAZECORRECTION_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_EYEGAZECORRECTION_STARE`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEAUTH_MODE_ALTERNATIVE_FRAME_ILLUMINATION`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEAUTH_MODE_BACKGROUND_SUBTRACTION`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEAUTH_MODE_DISABLED`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_BLINK`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_PHOTO`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_PREVIEW`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_SMILE`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_FACEDETECTION_VIDEO`: ULong = 2uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_FIELDOFVIEW` (
    public var `NormalizedFocalLengthX`: UInt,
    public var `NormalizedFocalLengthY`: UInt,
    public var `Flag`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_FILTERSCOPE`: UInt = 4294967295u;
public const val `KSCAMERA_EXTENDEDPROP_FLAG_CANCELOPERATION`: ULong = 9223372036854775808uL;
public const val `KSCAMERA_EXTENDEDPROP_FLAG_MASK`: ULong = 18374686479671623680uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_ASSISTANT_AUTO`: ULong = 256uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_ASSISTANT_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_ASSISTANT_ON`: ULong = 128uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_AUTO`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_AUTO_ADJUSTABLEPOWER`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_MULTIFLASHSUPPORTED`: ULong = 64uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_ON_ADJUSTABLEPOWER`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_REDEYEREDUCTION`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_FLASH_SINGLEFLASH`: ULong = 32uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSPRIORITY_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSPRIORITY_ON`: ULong = 1uL;
public typealias `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = Int;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSSTATE_FAILED`: `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = 4;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSSTATE_FOCUSED`: `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = 3;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSSTATE_LOST`: `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = 1;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSSTATE_SEARCHING`: `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = 2;
public const val `KSCAMERA_EXTENDEDPROP_FOCUSSTATE_UNINITIALIZED`: `KSCAMERA_EXTENDEDPROP_FOCUSSTATE` = 0;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_CONTINUOUS`: ULong = 256uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_CONTINUOUSLOCK`: ULong = 512uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_DISTANCE_HYPERFOCAL`: ULong = 33554432uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_DISTANCE_INFINITY`: ULong = 16777216uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_DISTANCE_NEAREST`: ULong = 67108864uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_DRIVERFALLBACK_OFF`: ULong = 2048uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_RANGE_FULLRANGE`: ULong = 262144uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_RANGE_HYPERFOCAL`: ULong = 1048576uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_RANGE_INFINITY`: ULong = 524288uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_RANGE_MACRO`: ULong = 65536uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_RANGE_NORMAL`: ULong = 131072uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_REGIONBASED`: ULong = 4096uL;
public const val `KSCAMERA_EXTENDEDPROP_FOCUS_UNLOCK`: ULong = 1024uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_HEADER` (
    public var `Version`: UInt,
    public var `PinId`: UInt,
    public var `Size`: UInt,
    public var `Result`: UInt,
    public var `Flags`: ULong,
    public var `Capability`: ULong,
)
public const val `KSCAMERA_EXTENDEDPROP_HISTOGRAM_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_HISTOGRAM_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_IRTORCHMODE_ALTERNATING_FRAME_ILLUMINATION`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_IRTORCHMODE_ALWAYS_ON`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_IRTORCHMODE_OFF`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_100`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_12800`: ULong = 1024uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_1600`: ULong = 128uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_200`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_25600`: ULong = 2048uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_3200`: ULong = 256uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_400`: ULong = 32uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_50`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_6400`: ULong = 512uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_80`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_800`: ULong = 64uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_AUTO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_ISO_MANUAL`: ULong = 36028797018963968uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_METADATAINFO` (
    public var `BufferAlignment`: Int,
    public var `MaxMetadataBufferSize`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_METADATA_ALIGNMENTREQUIRED`: ULong = 256uL;
public const val `KSCAMERA_EXTENDEDPROP_METADATA_MEMORYTYPE_MASK`: ULong = 255uL;
public const val `KSCAMERA_EXTENDEDPROP_METADATA_SYSTEMMEMORY`: ULong = 1uL;
public typealias `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = Int;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_1024`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 10;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_128`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 7;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_16`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 4;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_2048`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 11;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_256`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 8;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_32`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 5;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_4096`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 12;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_512`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 9;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_64`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 6;
public const val `KSCAMERA_EXTENDEDPROP_MetadataAlignment_8192`: `KSCAMERA_EXTENDEDPROP_MetadataAlignment` = 13;
public const val `KSCAMERA_EXTENDEDPROP_OIS_AUTO`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_OIS_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_OIS_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_DEFAULT`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_LATENCY`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_PHOTO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_POWER`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_QUALITY`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_OPTIMIZATION_VIDEO`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOCONFIRMATION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOCONFIRMATION_ON`: ULong = 1uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_PHOTOMODE` (
    public var `RequestedHistoryFrames`: UInt,
    public var `MaxHistoryFrames`: UInt,
    public var `SubMode`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_PHOTOMODE_NORMAL`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOMODE_SEQUENCE`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOMODE_SEQUENCE_SUB_NONE`: UInt = 0u;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOMODE_SEQUENCE_SUB_VARIABLE`: UInt = 1u;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOTHUMBNAIL_16X`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOTHUMBNAIL_2X`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOTHUMBNAIL_4X`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOTHUMBNAIL_8X`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_PHOTOTHUMBNAIL_DISABLE`: ULong = 0uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_PROFILE` (
    public var `ProfileId`: `windows_sys`.`core`.`GUID`,
    public var `Index`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_EXTENDEDPROP_RELATIVEPANELOPTIMIZATION_DYNAMIC`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_RELATIVEPANELOPTIMIZATION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_RELATIVEPANELOPTIMIZATION_ON`: ULong = 1uL;
public typealias `KSCAMERA_EXTENDEDPROP_ROITYPE` = Int;
public const val `KSCAMERA_EXTENDEDPROP_ROITYPE_FACE`: `KSCAMERA_EXTENDEDPROP_ROITYPE` = 1;
public const val `KSCAMERA_EXTENDEDPROP_ROITYPE_UNKNOWN`: `KSCAMERA_EXTENDEDPROP_ROITYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_CONFIGCAPS` (
    public var `ControlId`: UInt,
    public var `MaxNumberOfROIs`: UInt,
    public var `Capability`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_CONFIGCAPSHEADER` (
    public var `Size`: UInt,
    public var `ConfigCapCount`: UInt,
    public var `Reserved`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_EXPOSURE` (
    public var `ROIInfo`: `KSCAMERA_EXTENDEDPROP_ROI_INFO`,
    public var `Reserved`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_FOCUS` (
    public var `ROIInfo`: `KSCAMERA_EXTENDEDPROP_ROI_INFO`,
    public var `Reserved`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_INFO` (
    public var `Region`: `super`.`super`.`Foundation`.`RECT`,
    public var `Flags`: ULong,
    public var `Weight`: Int,
    public var `RegionOfInterestType`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_ISPCONTROL` (
    public var `ControlId`: UInt,
    public var `ROICount`: UInt,
    public var `Result`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_ISPCONTROLHEADER` (
    public var `Size`: UInt,
    public var `ControlCount`: UInt,
    public var `Reserved`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_EXTENDEDPROP_ROI_WHITEBALANCE` (
    public var `ROIInfo`: `KSCAMERA_EXTENDEDPROP_ROI_INFO`,
    public var `Reserved`: ULong,
)
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_AUTO`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_BACKLIT`: ULong = 1024uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_BEACH`: ULong = 32uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_CANDLELIGHT`: ULong = 128uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_LANDSCAPE`: ULong = 256uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_MACRO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_MANUAL`: ULong = 36028797018963968uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_NIGHT`: ULong = 16uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_NIGHTPORTRAIT`: ULong = 512uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_PORTRAIT`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_SNOW`: ULong = 8uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_SPORT`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_SCENEMODE_SUNSET`: ULong = 64uL;
public const val `KSCAMERA_EXTENDEDPROP_SECUREMODE_DISABLED`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_SECUREMODE_ENABLED`: ULong = 2uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_EXTENDEDPROP_VALUE` (
    public var `Value`: `KSCAMERA_EXTENDEDPROP_VALUE_0`,
)
// UNSUPPORTED Rust 1016:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_EXTENDEDPROP_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1021:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSCAMERA_EXTENDEDPROP_VALUE_0 {
//     pub dbl: f64,
//     pub ull: u64,
//     pub ul: u32,
//     pub ratio: u64,
//     pub l: i32,
//     pub ll: i64,
// }

// UNSUPPORTED Rust 1031:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_EXTENDEDPROP_VALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSCAMERA_EXTENDEDPROP_VFR_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_VFR_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOHDR_AUTO`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOHDR_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOHDR_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOPROCFLAG_AUTO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOPROCFLAG_LOCK`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOPROCFLAG_MANUAL`: ULong = 2uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_EXTENDEDPROP_VIDEOPROCSETTING` (
    public var `Mode`: UInt,
    public var `Min`: Int,
    public var `Max`: Int,
    public var `Step`: Int,
    public var `VideoProc`: `KSCAMERA_EXTENDEDPROP_VALUE`,
    public var `Reserved`: ULong,
)
// UNSUPPORTED Rust 1054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_EXTENDEDPROP_VIDEOPROCSETTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSCAMERA_EXTENDEDPROP_VIDEOSTABILIZATION_AUTO`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOSTABILIZATION_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOSTABILIZATION_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTEMPORALDENOISING_AUTO`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTEMPORALDENOISING_OFF`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTEMPORALDENOISING_ON`: ULong = 4uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTORCH_OFF`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTORCH_ON`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_VIDEOTORCH_ON_ADJUSTABLEPOWER`: ULong = 2uL;
public const val `KSCAMERA_EXTENDEDPROP_WARMSTART_MODE_DISABLED`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_WARMSTART_MODE_ENABLED`: ULong = 1uL;
public typealias `KSCAMERA_EXTENDEDPROP_WBPRESET` = Int;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_CANDLELIGHT`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 6;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_CLOUDY`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 1;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_DAYLIGHT`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 2;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_FLASH`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 3;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_FLUORESCENT`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 4;
public const val `KSCAMERA_EXTENDEDPROP_WBPRESET_TUNGSTEN`: `KSCAMERA_EXTENDEDPROP_WBPRESET` = 5;
public typealias `KSCAMERA_EXTENDEDPROP_WHITEBALANCE_MODE` = Int;
public const val `KSCAMERA_EXTENDEDPROP_WHITEBALANCE_PRESET`: `KSCAMERA_EXTENDEDPROP_WHITEBALANCE_MODE` = 2;
public const val `KSCAMERA_EXTENDEDPROP_WHITEBALANCE_TEMPERATURE`: `KSCAMERA_EXTENDEDPROP_WHITEBALANCE_MODE` = 1;
public const val `KSCAMERA_EXTENDEDPROP_ZOOM_DEFAULT`: ULong = 0uL;
public const val `KSCAMERA_EXTENDEDPROP_ZOOM_DIRECT`: ULong = 1uL;
public const val `KSCAMERA_EXTENDEDPROP_ZOOM_SMOOTH`: ULong = 2uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_MAXVIDEOFPS_FORPHOTORES` (
    public var `PhotoResWidth`: UInt,
    public var `PhotoResHeight`: UInt,
    public var `PreviewFPSNum`: UInt,
    public var `PreviewFPSDenom`: UInt,
    public var `CaptureFPSNum`: UInt,
    public var `CaptureFPSDenom`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_METADATA_BACKGROUNDSEGMENTATIONMASK` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `MaskCoverageBoundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `MaskResolution`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ForegroundBoundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `MaskData`: UByteArray,
)
// UNSUPPORTED Rust 1102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_METADATA_BACKGROUNDSEGMENTATIONMASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_METADATA_CAPTURESTATS` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `ExposureTime`: ULong,
    public var `ExposureCompensationFlags`: ULong,
    public var `ExposureCompensationValue`: Int,
    public var `IsoSpeed`: UInt,
    public var `FocusState`: UInt,
    public var `LensPosition`: UInt,
    public var `WhiteBalance`: UInt,
    public var `Flash`: UInt,
    public var `FlashPower`: UInt,
    public var `ZoomFactor`: UInt,
    public var `SceneMode`: ULong,
    public var `SensorFramerate`: ULong,
)
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_EXPOSURECOMPENSATION`: UInt = 2u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_EXPOSURETIME`: UInt = 1u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_FLASH`: UInt = 64u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_FLASHPOWER`: UInt = 128u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_FOCUSSTATE`: UInt = 8u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_ISOSPEED`: UInt = 4u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_LENSPOSITION`: UInt = 16u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_SCENEMODE`: UInt = 512u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_SENSORFRAMERATE`: UInt = 1024u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_WHITEBALANCE`: UInt = 32u;
public const val `KSCAMERA_METADATA_CAPTURESTATS_FLAG_ZOOMFACTOR`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_METADATA_DIGITALWINDOW` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `Window`: `KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_SETTING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_METADATA_FRAMEILLUMINATION` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_METADATA_FRAMEILLUMINATION_FLAG_ON`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_METADATA_ITEMHEADER` (
    public var `MetadataId`: UInt,
    public var `Size`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_METADATA_PHOTOCONFIRMATION` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `PhotoConfirmationIndex`: UInt,
    public var `Reserved`: UInt,
)
public typealias `KSCAMERA_MetadataId` = Int;
public const val `KSCAMERA_PERFRAMESETTING_AUTO`: ULong = 4294967296uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_CAP_HEADER` (
    public var `Size`: UInt,
    public var `ItemCount`: UInt,
    public var `Flags`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_CAP_ITEM_HEADER` (
    public var `Size`: UInt,
    public var `Type`: UInt,
    public var `Flags`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_CUSTOM_ITEM` (
    public var `Size`: UInt,
    public var `Reserved`: UInt,
    public var `Id`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_FRAME_HEADER` (
    public var `Size`: UInt,
    public var `Id`: UInt,
    public var `ItemCount`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_HEADER` (
    public var `Size`: UInt,
    public var `FrameCount`: UInt,
    public var `Id`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: ULong,
    public var `LoopCount`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSCAMERA_PERFRAMESETTING_ITEM_CUSTOM`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 7;
public const val `KSCAMERA_PERFRAMESETTING_ITEM_EXPOSURE_COMPENSATION`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 3;
public const val `KSCAMERA_PERFRAMESETTING_ITEM_EXPOSURE_TIME`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 1;
public const val `KSCAMERA_PERFRAMESETTING_ITEM_FLASH`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 2;
public const val `KSCAMERA_PERFRAMESETTING_ITEM_FOCUS`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PERFRAMESETTING_ITEM_HEADER` (
    public var `Size`: UInt,
    public var `Type`: UInt,
    public var `Flags`: ULong,
)
public const val `KSCAMERA_PERFRAMESETTING_ITEM_ISO`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 4;
public const val `KSCAMERA_PERFRAMESETTING_ITEM_PHOTOCONFIRMATION`: `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = 6;
public typealias `KSCAMERA_PERFRAMESETTING_ITEM_TYPE` = Int;
public const val `KSCAMERA_PERFRAMESETTING_MANUAL`: ULong = 8589934592uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_PROFILE_CONCURRENCYINFO` (
    public var `ReferenceGuid`: `windows_sys`.`core`.`GUID`,
    public var `Reserved`: UInt,
    public var `ProfileCount`: UInt,
    public var `Profiles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KSCAMERA_PROFILE_INFO`>?,
)
// UNSUPPORTED Rust 1229:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_PROFILE_CONCURRENCYINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_PROFILE_INFO` (
    public var `ProfileId`: `windows_sys`.`core`.`GUID`,
    public var `Index`: UInt,
    public var `PinCount`: UInt,
    public var `Pins`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KSCAMERA_PROFILE_PININFO`>?,
)
// UNSUPPORTED Rust 1242:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PROFILE_MEDIAINFO` (
    public var `Resolution`: `KSCAMERA_PROFILE_MEDIAINFO_0`,
    public var `MaxFrameRate`: `KSCAMERA_PROFILE_MEDIAINFO_1`,
    public var `Flags`: ULong,
    public var `Data0`: UInt,
    public var `Data1`: UInt,
    public var `Data2`: UInt,
    public var `Data3`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PROFILE_MEDIAINFO_1` (
    public var `Numerator`: UInt,
    public var `Denominator`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PROFILE_MEDIAINFO_0` (
    public var `X`: UInt,
    public var `Y`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSCAMERA_PROFILE_PININFO` (
    public var `PinCategory`: `windows_sys`.`core`.`GUID`,
    public var `Anonymous`: `KSCAMERA_PROFILE_PININFO_0`,
    public var `MediaInfoCount`: UInt,
    public var `MediaInfos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KSCAMERA_PROFILE_MEDIAINFO`>?,
)
// UNSUPPORTED Rust 1278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_PROFILE_PININFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1283:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSCAMERA_PROFILE_PININFO_0 {
//     pub Anonymous: KSCAMERA_PROFILE_PININFO_0_0,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSCAMERA_PROFILE_PININFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCAMERA_PROFILE_PININFO_0_0` (
    public var `PinIndex`: UShort,
    public var `ProfileSensorType`: UShort,
)
// UNSUPPORTED Rust 1300:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_ACOUSTIC_ECHO_CANCEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf963d80_c559_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 1301:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6994ad04_93ef_11d0_a3cc_00a0c9223196);

// UNSUPPORTED Rust 1302:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_BRIDGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x085aff00_62ce_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1303:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65e8773d_8f56_11d0_a3b9_00a0c9223196);

// UNSUPPORTED Rust 1304:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_CLOCK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53172480_4791_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1305:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_COMMUNICATIONSTRANSFORM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf1dda2c_9743_11d0_a3ee_00a0c9223196);

// UNSUPPORTED Rust 1306:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_CROSSBAR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa799a801_a46d_11d0_a18c_00a02401dcd4);

// UNSUPPORTED Rust 1307:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_DATACOMPRESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1e84c900_7e70_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_DATADECOMPRESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2721ae20_7e70_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_DATATRANSFORM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2eb07ea0_7e70_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1310:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19689bf6_c384_48fd_ad51_90e58c79f70b);

// UNSUPPORTED Rust 1311:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_ESCALANTE_PLATFORM_DRIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74f3aea8_9768_11d1_8e07_00a0c95ec22e);

// UNSUPPORTED Rust 1312:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_FILESYSTEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x760fed5e_9357_11d0_a3cc_00a0c9223196);

// UNSUPPORTED Rust 1313:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_INTERFACETRANSFORM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf1dda2d_9743_11d0_a3ee_00a0c9223196);

// UNSUPPORTED Rust 1314:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_MEDIUMTRANSFORM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf1dda2e_9743_11d0_a3ee_00a0c9223196);

// UNSUPPORTED Rust 1315:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_MICROPHONE_ARRAY_PROCESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x830a44f2_a32d_476b_be97_42845673b35a);

// UNSUPPORTED Rust 1316:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_MIXER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad809c00_7b88_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1317:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_MULTIPLEXER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a5de1d3_01a1_452c_b481_4fa2b96271e8);

// UNSUPPORTED Rust 1318:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_NETWORK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x67c9cc3c_69c4_11d2_8759_00a0c9223196);

// UNSUPPORTED Rust 1319:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_NETWORK_CAMERA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8238652_b500_41eb_b4f3_4234f7f5ae99);

// UNSUPPORTED Rust 1320:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_PROXY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97ebaaca_95bd_11d0_a3ea_00a0c9223196);

// UNSUPPORTED Rust 1321:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_QUALITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97ebaacb_95bd_11d0_a3ea_00a0c9223196);

// UNSUPPORTED Rust 1322:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_REALTIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb115ffc_10c8_4964_831d_6dcb02e6f23f);

// UNSUPPORTED Rust 1323:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_RENDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65e8773e_8f56_11d0_a3b9_00a0c9223196);

// UNSUPPORTED Rust 1324:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_SENSOR_CAMERA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24e552d7_6523_47f7_a647_d3465bf1f5ca);

// UNSUPPORTED Rust 1325:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_SENSOR_GROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x669c7214_0a88_4311_a7f3_4e79820e33bd);

// UNSUPPORTED Rust 1326:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_SPLITTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a4252a0_7e70_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 1327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_TEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6994ad06_93ef_11d0_a3cc_00a0c9223196);

// UNSUPPORTED Rust 1328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_TOPOLOGY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdda54a40_1e4c_11d1_a050_405705c10000);

// UNSUPPORTED Rust 1329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_TVAUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa799a802_a46d_11d0_a18c_00a02401dcd4);

// UNSUPPORTED Rust 1330:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_TVTUNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa799a800_a46d_11d0_a18c_00a02401dcd4);

// UNSUPPORTED Rust 1331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_VBICODEC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07dad660_22f1_11d1_a9f4_00c04fbbde8f);

// UNSUPPORTED Rust 1332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6994ad05_93ef_11d0_a3cc_00a0c9223196);

// UNSUPPORTED Rust 1333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_VIDEO_CAMERA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5323777_f976_4f5b_9b55_b94699c46e44);

// UNSUPPORTED Rust 1334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_VIRTUAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3503eac4_1f26_11d1_8ab0_00a0c9223196);

// UNSUPPORTED Rust 1335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_VPMUX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa799a803_a46d_11d0_a18c_00a02401dcd4);

// UNSUPPORTED Rust 1336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCATEGORY_WDMAUD_USE_PIN_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47a4fa20_a251_11d1_a050_0000f8004788);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCLOCK_CREATE` (
    public var `CreateFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCOMPONENTID` (
    public var `Manufacturer`: `windows_sys`.`core`.`GUID`,
    public var `Product`: `windows_sys`.`core`.`GUID`,
    public var `Component`: `windows_sys`.`core`.`GUID`,
    public var `Name`: `windows_sys`.`core`.`GUID`,
    public var `Version`: UInt,
    public var `Revision`: UInt,
)
// UNSUPPORTED Rust 1352:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSCOMPONENTID_USBAUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f1275f0_26e9_4264_ba4d_39fff01d94aa);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSCORRELATED_TIME` (
    public var `Time`: Long,
    public var `SystemTime`: Long,
)
public const val `KSCREATE_ITEM_FREEONSTOP`: UInt = 8u;
public const val `KSCREATE_ITEM_NOPARAMETERS`: UInt = 4u;
public const val `KSCREATE_ITEM_SECURITYCHANGED`: UInt = 1u;
public const val `KSCREATE_ITEM_WILDCARD`: UInt = 2u;
public const val `KSCameraProfileSensorType_Custom`: UInt = 128u;
public const val `KSCameraProfileSensorType_Depth`: UInt = 4u;
public const val `KSCameraProfileSensorType_ImageSegmentation`: UInt = 16u;
public const val `KSCameraProfileSensorType_Infrared`: UInt = 2u;
public const val `KSCameraProfileSensorType_PoseTracking`: UInt = 8u;
public const val `KSCameraProfileSensorType_RGB`: UInt = 1u;
// UNSUPPORTED Rust 1369:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSDATAFORMAT {
//     pub Anonymous: KSDATAFORMAT_0,
//     pub Alignment: i64,
// }

// UNSUPPORTED Rust 1375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDATAFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDATAFORMAT_0` (
    public var `FormatSize`: UInt,
    public var `Flags`: UInt,
    public var `SampleSize`: UInt,
    public var `Reserved`: UInt,
    public var `MajorFormat`: `windows_sys`.`core`.`GUID`,
    public var `SubFormat`: `windows_sys`.`core`.`GUID`,
    public var `Specifier`: `windows_sys`.`core`.`GUID`,
)
public const val `KSDATAFORMAT_BIT_ATTRIBUTES`: UInt = 1u;
public const val `KSDATAFORMAT_BIT_TEMPORAL_COMPRESSION`: UInt = 0u;
// UNSUPPORTED Rust 1393:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_AC3_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d80e4_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1394:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_ANALOGVIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0482dde0_7817_11cf_8a03_00aa006ecb65);

// UNSUPPORTED Rust 1395:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DIALECT_AC3_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b35_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1396:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DIALECT_MPEG1_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b32_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1397:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DIALECT_MPEG1_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b31_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1398:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DIALECT_MPEG2_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b34_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1399:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DIALECT_MPEG2_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b33_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_DSOUND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x518590a2_a184_11d0_8522_00c04fd9baf3);

// UNSUPPORTED Rust 1401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_FILEHANDLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65e8773c_8f56_11d0_a3b9_00a0c9223196);

// UNSUPPORTED Rust 1402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_FILENAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa797b40_e974_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_H264_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2017be05_6629_4248_aaed_7e1a47bc9b9c);

// UNSUPPORTED Rust 1404:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x692fa379_d3e8_4651_b5b4_0b94b013eeaf);

// UNSUPPORTED Rust 1405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_JPEG_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x692fa379_d3e8_4651_b5b4_0b94b013eeaf);

// UNSUPPORTED Rust 1406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_LPCM_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d80e6_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_MPEG1_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05589f82_c356_11ce_bf01_00aa0055595a);

// UNSUPPORTED Rust 1408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_MPEG2_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d80e5_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_MPEG2_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d80e3_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_NONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f6417d6_c318_11d0_a43f_00a0c9223196);

// UNSUPPORTED Rust 1411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_VBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a76e0_eb0a_11d0_ace4_0000c0cc16ba);

// UNSUPPORTED Rust 1412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_VC_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad98d184_aac3_11d0_a41c_00a0c9223196);

// UNSUPPORTED Rust 1413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_VIDEOINFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05589f80_c356_11ce_bf01_00aa0055595a);

// UNSUPPORTED Rust 1414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_VIDEOINFO2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a76a0_eb0a_11d0_ace4_0000c0cc16ba);

// UNSUPPORTED Rust 1415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SPECIFIER_WAVEFORMATEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05589f81_c356_11ce_bf01_00aa0055595a);

// UNSUPPORTED Rust 1416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_AC3_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d802c_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_ANALOG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6dba3190_67bd_11cf_a0f7_0020afd156e4);

// UNSUPPORTED Rust 1418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_CC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33214cc1_011f_11d2_b4b1_00a0d102cfbe);

// UNSUPPORTED Rust 1419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_D16: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000050_0004_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1420:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_DSS_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0af4f82_e163_11d0_bad9_00609744111a);

// UNSUPPORTED Rust 1421:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_DSS_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0af4f81_e163_11d0_bad9_00609744111a);

// UNSUPPORTED Rust 1422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_DTS_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8033_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_AAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000006_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_ATRAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000008_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_DIGITAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000092_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_DIGITAL_PLUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000a_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_DIGITAL_PLUS_ATMOS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000010a_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_MAT20: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000010c_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_MAT21: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000030c_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DOLBY_MLP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000c_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000d_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000008_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DTSX_E1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000010b_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DTSX_E2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000030b_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1435:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_DTS_HD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0000000b_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1436:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_MPEG1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000003_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_MPEG2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000004_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_MPEG3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000005_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_ONE_BIT_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000009_0cea_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1440:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IEC61937_WMA_PRO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000164_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1441:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_IMAGE_RGB32: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000016_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1442:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_JPEG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19e4a5aa_5662_4fc5_a0c0_1758028e1057);

// UNSUPPORTED Rust 1443:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L16: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000051_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1444:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L16_CUSTOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000051_8000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1445:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L16_IR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000051_0002_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1446:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000032_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1447:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L8_CUSTOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000032_8000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_L8_IR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000032_0002_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_LPCM_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8032_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_Line21_BytePair: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e8d4a22_310c_11d0_b79a_00aa003767a7);

// UNSUPPORTED Rust 1451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_Line21_GOPPacket: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e8d4a23_310c_11d0_b79a_00aa003767a7);

// UNSUPPORTED Rust 1452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MIDI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d262760_e957_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MIDI_BUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ca15fa0_6cfe_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MJPG_CUSTOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47504a4d_8000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MJPG_DEPTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47504a4d_0004_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MJPG_IR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47504a4d_0002_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG1Packet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb80_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG1Payload: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb81_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG1Video: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb86_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG2_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d802b_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG2_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8026_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEGLAYER3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000055_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_MPEG_HEAAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00001610_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_NABTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a76e2_eb0a_11d0_ace4_0000c0cc16ba);

// UNSUPPORTED Rust 1465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_NABTS_FEC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe757bca1_39ac_11d1_a9f5_00c04fbbde8f);

// UNSUPPORTED Rust 1466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_NONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb8e_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_OVERLAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb7f_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_PCM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000001_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_RAW8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca20d9a0_3e3e_11d1_9bf9_00c04fbbdebf);

// UNSUPPORTED Rust 1470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_RIFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4995daee_9ee6_11d0_a40e_00a0c9223196);

// UNSUPPORTED Rust 1471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_RIFFMIDI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4995daf0_9ee6_11d0_a40e_00a0c9223196);

// UNSUPPORTED Rust 1472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_RIFFWAVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb8b_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_SDDS_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8034_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_STANDARD_AC3_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b25_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_STANDARD_MPEG1_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b22_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_STANDARD_MPEG1_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b21_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_STANDARD_MPEG2_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b24_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_STANDARD_MPEG2_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b23_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_SUBPICTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d802d_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_TELETEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a76e3_eb0a_11d0_ace4_0000c0cc16ba);

// UNSUPPORTED Rust 1481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_VPVBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5a9b6a41_1a22_11d1_bad9_00609744111a);

// UNSUPPORTED Rust 1482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_VPVideo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5a9b6a40_1a22_11d1_bad9_00609744111a);

// UNSUPPORTED Rust 1483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_WAVEFORMATEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_WMAUDIO2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000161_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_WMAUDIO3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000162_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_SUBTYPE_WMAUDIO_LOSSLESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000163_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_ANALOGAUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0482dee1_7817_11cf_8a03_00aa006ecb65);

// UNSUPPORTED Rust 1488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_ANALOGVIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0482dde1_7817_11cf_8a03_00aa006ecb65);

// UNSUPPORTED Rust 1489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73647561_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_AUXLine21Data: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x670aea80_3a82_11d0_b79b_00aa003767a7);

// UNSUPPORTED Rust 1491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_DVD_ENCRYPTED_PACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed0b916a_044d_11d1_aa78_00c04fc31d60);

// UNSUPPORTED Rust 1492:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72178c23_e45b_11d5_bc2a_00b0d0f3f4ab);

// UNSUPPORTED Rust 1493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_MIDI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7364696d_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_MPEG2_PES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8020_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_MPEG2_PROGRAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8022_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_MPEG2_TRANSPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe06d8023_db46_11cf_b4d1_00805f6cbbea);

// UNSUPPORTED Rust 1497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_MUSIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe725d360_62cc_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_NABTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe757bca0_39ac_11d1_a9f5_00c04fbbde8f);

// UNSUPPORTED Rust 1499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_STANDARD_ELEMENTARY_STREAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b11_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_STANDARD_PACK_HEADER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b13_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_STANDARD_PES_PACKET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36523b12_8ee5_11d1_8ca3_0060b057664a);

// UNSUPPORTED Rust 1502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_STREAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe436eb83_524f_11ce_9f53_0020af0ba770);

// UNSUPPORTED Rust 1503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_TEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73747874_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_VBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72a76e1_eb0a_11d0_ace4_0000c0cc16ba);

// UNSUPPORTED Rust 1505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDATAFORMAT_TYPE_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73646976_0000_0010_8000_00aa00389b71);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDATARANGE_AUDIO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `MaximumChannels`: UInt,
    public var `MinimumBitsPerSample`: UInt,
    public var `MaximumBitsPerSample`: UInt,
    public var `MinimumSampleFrequency`: UInt,
    public var `MaximumSampleFrequency`: UInt,
)
// UNSUPPORTED Rust 1516:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDATARANGE_AUDIO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSDATARANGE_BIT_ATTRIBUTES`: UInt = 1u;
public const val `KSDATARANGE_BIT_REQUIRED_ATTRIBUTES`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDATARANGE_MUSIC` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `Technology`: `windows_sys`.`core`.`GUID`,
    public var `Channels`: UInt,
    public var `Notes`: UInt,
    public var `ChannelMask`: UInt,
)
// UNSUPPORTED Rust 1532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDATARANGE_MUSIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSDEGRADESETID_Standard: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f564180_704c_11d0_a5d6_28db04c10000);

public typealias `KSDEGRADE_STANDARD` = Int;
public const val `KSDEGRADE_STANDARD_COMPUTATION`: `KSDEGRADE_STANDARD` = 2;
public const val `KSDEGRADE_STANDARD_QUALITY`: `KSDEGRADE_STANDARD` = 1;
public const val `KSDEGRADE_STANDARD_SAMPLE`: `KSDEGRADE_STANDARD` = 0;
public const val `KSDEGRADE_STANDARD_SKIP`: `KSDEGRADE_STANDARD` = 3;
public const val `KSDEVICE_DESCRIPTOR_VERSION`: UInt = 256u;
public const val `KSDEVICE_DESCRIPTOR_VERSION_2`: UInt = 272u;
public const val `KSDEVICE_FLAG_ENABLE_QUERYINTERFACE`: UInt = 4u;
public const val `KSDEVICE_FLAG_ENABLE_REMOTE_WAKEUP`: UInt = 1u;
public const val `KSDEVICE_FLAG_LOWPOWER_PASSTHROUGH`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDEVICE_PROFILE_INFO` (
    public var `Type`: UInt,
    public var `Size`: UInt,
    public var `Anonymous`: `KSDEVICE_PROFILE_INFO_0`,
)
// UNSUPPORTED Rust 1555:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDEVICE_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1560:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSDEVICE_PROFILE_INFO_0 {
//     pub Camera: KSDEVICE_PROFILE_INFO_0_0,
// }

// UNSUPPORTED Rust 1565:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDEVICE_PROFILE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDEVICE_PROFILE_INFO_0_0` (
    public var `Info`: `KSCAMERA_PROFILE_INFO`,
    public var `Reserved`: UInt,
    public var `ConcurrencyCount`: UInt,
    public var `Concurrency`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KSCAMERA_PROFILE_CONCURRENCYINFO`>?,
)
// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDEVICE_PROFILE_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSDEVICE_PROFILE_TYPE_CAMERA`: UInt = 1u;
public const val `KSDEVICE_PROFILE_TYPE_UNKNOWN`: UInt = 0u;
public typealias `KSDEVICE_THERMAL_STATE` = Int;
public const val `KSDEVICE_THERMAL_STATE_HIGH`: `KSDEVICE_THERMAL_STATE` = 1;
public const val `KSDEVICE_THERMAL_STATE_LOW`: `KSDEVICE_THERMAL_STATE` = 0;
public const val `KSDISPATCH_FASTIO`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDISPLAYCHANGE` (
    public var `PelsWidth`: UInt,
    public var `PelsHeight`: UInt,
    public var `BitsPerPel`: UInt,
    public var `DeviceID`: UShortArray,
)
// UNSUPPORTED Rust 1597:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDISPLAYCHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDS3D_BUFFER_ALL` (
    public var `Position`: `DS3DVECTOR`,
    public var `Velocity`: `DS3DVECTOR`,
    public var `InsideConeAngle`: UInt,
    public var `OutsideConeAngle`: UInt,
    public var `ConeOrientation`: `DS3DVECTOR`,
    public var `ConeOutsideVolume`: Int,
    public var `MinDistance`: Float,
    public var `MaxDistance`: Float,
    public var `Mode`: UInt,
)
// UNSUPPORTED Rust 1615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDS3D_BUFFER_ALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_BUFFER_CONE_ANGLES` (
    public var `InsideConeAngle`: UInt,
    public var `OutsideConeAngle`: UInt,
)
public const val `KSDS3D_COEFF_COUNT`: `KSDS3D_HRTF_COEFF_FORMAT` = 2;
public const val `KSDS3D_FILTER_METHOD_COUNT`: `KSDS3D_HRTF_FILTER_METHOD` = 2;
public const val `KSDS3D_FILTER_QUALITY_COUNT`: `KSDS3D_HRTF_FILTER_QUALITY` = 2;
public typealias `KSDS3D_HRTF_COEFF_FORMAT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_HRTF_FILTER_FORMAT_MSG` (
    public var `FilterMethod`: `KSDS3D_HRTF_FILTER_METHOD`,
    public var `CoeffFormat`: `KSDS3D_HRTF_COEFF_FORMAT`,
    public var `Version`: `KSDS3D_HRTF_FILTER_VERSION`,
    public var `Reserved`: UInt,
)
public typealias `KSDS3D_HRTF_FILTER_METHOD` = Int;
public typealias `KSDS3D_HRTF_FILTER_QUALITY` = Int;
public typealias `KSDS3D_HRTF_FILTER_VERSION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_HRTF_INIT_MSG` (
    public var `Size`: UInt,
    public var `Quality`: `KSDS3D_HRTF_FILTER_QUALITY`,
    public var `SampleRate`: Float,
    public var `MaxFilterSize`: UInt,
    public var `FilterTransientMuteLength`: UInt,
    public var `FilterOverlapBufferLength`: UInt,
    public var `OutputOverlapBufferLength`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_HRTF_PARAMS_MSG` (
    public var `Size`: UInt,
    public var `Enabled`: UInt,
    public var `SwapChannels`: `windows_sys`.`core`.`BOOL`,
    public var `ZeroAzimuth`: `windows_sys`.`core`.`BOOL`,
    public var `CrossFadeOutput`: `windows_sys`.`core`.`BOOL`,
    public var `FilterSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_ITD_PARAMS` (
    public var `Channel`: Int,
    public var `VolSmoothScale`: Float,
    public var `TotalDryAttenuation`: Float,
    public var `TotalWetAttenuation`: Float,
    public var `SmoothFrequency`: Int,
    public var `Delay`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSDS3D_ITD_PARAMS_MSG` (
    public var `Enabled`: UInt,
    public var `LeftParams`: `KSDS3D_ITD_PARAMS`,
    public var `RightParams`: `KSDS3D_ITD_PARAMS`,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDS3D_LISTENER_ALL` (
    public var `Position`: `DS3DVECTOR`,
    public var `Velocity`: `DS3DVECTOR`,
    public var `OrientFront`: `DS3DVECTOR`,
    public var `OrientTop`: `DS3DVECTOR`,
    public var `DistanceFactor`: Float,
    public var `RolloffFactor`: Float,
    public var `DopplerFactor`: Float,
)
// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDS3D_LISTENER_ALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSDS3D_LISTENER_ORIENTATION` (
    public var `Front`: `DS3DVECTOR`,
    public var `Top`: `DS3DVECTOR`,
)
// UNSUPPORTED Rust 1703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSDS3D_LISTENER_ORIENTATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSDSOUND_3D_MODE_DISABLE`: UInt = 2u;
public const val `KSDSOUND_3D_MODE_HEADRELATIVE`: UInt = 1u;
public const val `KSDSOUND_3D_MODE_NORMAL`: UInt = 0u;
public const val `KSDSOUND_BUFFER_CTRL_3D`: UInt = 1u;
public const val `KSDSOUND_BUFFER_CTRL_FREQUENCY`: UInt = 2u;
public const val `KSDSOUND_BUFFER_CTRL_HRTF_3D`: UInt = 1073741824u;
public const val `KSDSOUND_BUFFER_CTRL_PAN`: UInt = 4u;
public const val `KSDSOUND_BUFFER_CTRL_POSITIONNOTIFY`: UInt = 16u;
public const val `KSDSOUND_BUFFER_CTRL_VOLUME`: UInt = 8u;
public const val `KSDSOUND_BUFFER_LOCHARDWARE`: UInt = 4u;
public const val `KSDSOUND_BUFFER_LOCSOFTWARE`: UInt = 8u;
public const val `KSDSOUND_BUFFER_PRIMARY`: UInt = 1u;
public const val `KSDSOUND_BUFFER_STATIC`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSERROR` (
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Status`: UInt,
)
// UNSUPPORTED Rust 1727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENTDATA` (
    public var `NotificationType`: UInt,
    public var `Anonymous`: `KSEVENTDATA_0`,
)
// UNSUPPORTED Rust 1738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENTDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1743:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSEVENTDATA_0 {
//     pub EventHandle: KSEVENTDATA_0_0,
//     pub SemaphoreHandle: KSEVENTDATA_0_1,
//     pub Alignment: KSEVENTDATA_0_2,
// }

// UNSUPPORTED Rust 1750:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENTDATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENTDATA_0_2` (
    public var `Unused`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Alignment`: LongArray,
)
// UNSUPPORTED Rust 1761:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENTDATA_0_2 {
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
public class `KSEVENTDATA_0_0` (
    public var `Event`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Reserved`: ULongArray,
)
// UNSUPPORTED Rust 1772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENTDATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENTDATA_0_1` (
    public var `Semaphore`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Reserved`: UInt,
    public var `Adjustment`: Int,
)
// UNSUPPORTED Rust 1784:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENTDATA_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSEVENTF_DPC`: UInt = 16u;
public const val `KSEVENTF_EVENT_HANDLE`: UInt = 1u;
public const val `KSEVENTF_EVENT_OBJECT`: UInt = 4u;
public const val `KSEVENTF_KSWORKITEM`: UInt = 128u;
public const val `KSEVENTF_SEMAPHORE_HANDLE`: UInt = 2u;
public const val `KSEVENTF_SEMAPHORE_OBJECT`: UInt = 8u;
public const val `KSEVENTF_WORKITEM`: UInt = 32u;
// UNSUPPORTED Rust 1796:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_AudioControlChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe85e9698_fa2f_11d1_95bd_00c04fb925d3);

// UNSUPPORTED Rust 1797:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_CameraAsyncControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22a11754_9701_4088_b33f_6b9cbc52df5e);

// UNSUPPORTED Rust 1798:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_CameraEvent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7899b2e0_6b43_4964_9d2a_a21f4061f576);

// UNSUPPORTED Rust 1799:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_Clock: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x364d8e20_62c7_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1800:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_Connection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f4bcbe0_9ea5_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 1801:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_Device: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x288296ec_9f94_41b4_a153_aa31aeecb33f);

// UNSUPPORTED Rust 1802:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_DynamicFormatChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x162ac456_83d7_4239_96df_c75ffa138bc6);

// UNSUPPORTED Rust 1803:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_EXTDEV_Command: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x109c7988_b3cb_11d2_b48e_006097b3391b);

// UNSUPPORTED Rust 1804:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_ExtendedCameraControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x571c92c9_13a2_47e3_a649_d2a778166384);

// UNSUPPORTED Rust 1805:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_LoopedStreaming: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4682b940_c6ef_11d0_96d8_00aa0051e51d);

// UNSUPPORTED Rust 1806:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_PinCapsChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd4f192e_3b78_49ad_a534_2c315b822000);

// UNSUPPORTED Rust 1807:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_SoundDetector: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69785c9b_fc2d_49d6_ac32_4799f87de9f6);

// UNSUPPORTED Rust 1808:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_StreamAllocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75d95571_073c_11d0_a161_0020afd156e4);

// UNSUPPORTED Rust 1809:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_Telephony: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb77f12b4_ceb4_4484_8d5e_52c1e7d8762d);

// UNSUPPORTED Rust 1810:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_VIDCAPTOSTI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdb47de20_f628_11d1_ba41_00a0c90d2b05);

// UNSUPPORTED Rust 1811:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_VIDCAP_TVAUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0651_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 1812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_VPNotify: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x20c5598e_d3c8_11d0_8dfc_00c04fd7c08b);

// UNSUPPORTED Rust 1813:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_VPVBINotify: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec529b01_1a1f_11d1_bad9_00609744111a);

// UNSUPPORTED Rust 1814:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSEVENTSETID_VolumeLimit: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda168465_3a7c_4858_9d4a_3e8e24701aef);

public typealias `KSEVENT_AUDIO_CONTROL_CHANGE` = Int;
public typealias `KSEVENT_CAMERACONTROL` = Int;
public const val `KSEVENT_CAMERACONTROL_FOCUS`: `KSEVENT_CAMERACONTROL` = 0;
public const val `KSEVENT_CAMERACONTROL_ZOOM`: `KSEVENT_CAMERACONTROL` = 1;
public typealias `KSEVENT_CAMERAEVENT` = Int;
public const val `KSEVENT_CLOCK_INTERVAL_MARK`: `KSEVENT_CLOCK_POSITION` = 0;
public typealias `KSEVENT_CLOCK_POSITION` = Int;
public const val `KSEVENT_CLOCK_POSITION_MARK`: `KSEVENT_CLOCK_POSITION` = 1;
public typealias `KSEVENT_CONNECTION` = Int;
public const val `KSEVENT_CONNECTION_DATADISCONTINUITY`: `KSEVENT_CONNECTION` = 1;
public const val `KSEVENT_CONNECTION_ENDOFSTREAM`: `KSEVENT_CONNECTION` = 4;
public const val `KSEVENT_CONNECTION_POSITIONUPDATE`: `KSEVENT_CONNECTION` = 0;
public const val `KSEVENT_CONNECTION_PRIORITY`: `KSEVENT_CONNECTION` = 3;
public const val `KSEVENT_CONNECTION_TIMEDISCONTINUITY`: `KSEVENT_CONNECTION` = 2;
public const val `KSEVENT_CONTROL_CHANGE`: `KSEVENT_AUDIO_CONTROL_CHANGE` = 0;
public typealias `KSEVENT_CROSSBAR` = Int;
public const val `KSEVENT_CROSSBAR_CHANGED`: `KSEVENT_CROSSBAR` = 0;
public typealias `KSEVENT_DEVCMD` = Int;
public typealias `KSEVENT_DEVICE` = Int;
public const val `KSEVENT_DEVICE_LOST`: `KSEVENT_DEVICE` = 0;
public const val `KSEVENT_DEVICE_PREEMPTED`: `KSEVENT_DEVICE` = 1;
public const val `KSEVENT_DEVICE_THERMAL_HIGH`: `KSEVENT_DEVICE` = 2;
public const val `KSEVENT_DEVICE_THERMAL_LOW`: `KSEVENT_DEVICE` = 3;
public typealias `KSEVENT_DYNAMICFORMATCHANGE` = Int;
public const val `KSEVENT_DYNAMIC_FORMAT_CHANGE`: `KSEVENT_DYNAMICFORMATCHANGE` = 0;
public const val `KSEVENT_ENTRY_BUFFERED`: UInt = 4u;
public const val `KSEVENT_ENTRY_DELETED`: UInt = 1u;
public const val `KSEVENT_ENTRY_ONESHOT`: UInt = 2u;
public const val `KSEVENT_EXTDEV_COMMAND_BUSRESET`: `KSEVENT_DEVCMD` = 2;
public const val `KSEVENT_EXTDEV_COMMAND_CONTROL_INTERIM_READY`: `KSEVENT_DEVCMD` = 1;
public const val `KSEVENT_EXTDEV_COMMAND_NOTIFY_INTERIM_READY`: `KSEVENT_DEVCMD` = 0;
public const val `KSEVENT_EXTDEV_NOTIFY_MEDIUM_CHANGE`: `KSEVENT_DEVCMD` = 7;
public const val `KSEVENT_EXTDEV_NOTIFY_REMOVAL`: `KSEVENT_DEVCMD` = 6;
public const val `KSEVENT_EXTDEV_OPERATION_MODE_UPDATE`: `KSEVENT_DEVCMD` = 4;
public const val `KSEVENT_EXTDEV_TIMECODE_UPDATE`: `KSEVENT_DEVCMD` = 3;
public const val `KSEVENT_EXTDEV_TRANSPORT_STATE_UPDATE`: `KSEVENT_DEVCMD` = 5;
public typealias `KSEVENT_LOOPEDSTREAMING` = Int;
public const val `KSEVENT_LOOPEDSTREAMING_POSITION`: `KSEVENT_LOOPEDSTREAMING` = 0;
public const val `KSEVENT_PHOTO_SAMPLE_SCANNED`: `KSEVENT_CAMERAEVENT` = 0;
public typealias `KSEVENT_PINCAPS_CHANGENOTIFICATIONS` = Int;
public const val `KSEVENT_PINCAPS_FORMATCHANGE`: `KSEVENT_PINCAPS_CHANGENOTIFICATIONS` = 0;
public const val `KSEVENT_PINCAPS_JACKINFOCHANGE`: `KSEVENT_PINCAPS_CHANGENOTIFICATIONS` = 1;
public typealias `KSEVENT_SOUNDDETECTOR` = Int;
public const val `KSEVENT_SOUNDDETECTOR_MATCHDETECTED`: `KSEVENT_SOUNDDETECTOR` = 1;
public typealias `KSEVENT_STREAMALLOCATOR` = Int;
public const val `KSEVENT_STREAMALLOCATOR_FREEFRAME`: `KSEVENT_STREAMALLOCATOR` = 1;
public const val `KSEVENT_STREAMALLOCATOR_INTERNAL_FREEFRAME`: `KSEVENT_STREAMALLOCATOR` = 0;
public typealias `KSEVENT_TELEPHONY` = Int;
public const val `KSEVENT_TELEPHONY_ENDPOINTPAIRS_CHANGED`: `KSEVENT_TELEPHONY` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENT_TIME_INTERVAL` (
    public var `EventData`: `KSEVENTDATA`,
    public var `TimeBase`: Long,
    public var `Interval`: Long,
)
// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENT_TIME_INTERVAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENT_TIME_MARK` (
    public var `EventData`: `KSEVENTDATA`,
    public var `MarkTime`: Long,
)
// UNSUPPORTED Rust 1882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENT_TIME_MARK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSEVENT_TUNER` = Int;
public const val `KSEVENT_TUNER_CHANGED`: `KSEVENT_TUNER` = 0;
public const val `KSEVENT_TUNER_INITIATE_SCAN`: `KSEVENT_TUNER` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEVENT_TUNER_INITIATE_SCAN_S` (
    public var `EventData`: `KSEVENTDATA`,
    public var `StartFrequency`: UInt,
    public var `EndFrequency`: UInt,
)
// UNSUPPORTED Rust 1897:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSEVENT_TUNER_INITIATE_SCAN_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSEVENT_TVAUDIO` = Int;
public const val `KSEVENT_TVAUDIO_CHANGED`: `KSEVENT_TVAUDIO` = 0;
public const val `KSEVENT_TYPE_BASICSUPPORT`: UInt = 512u;
public const val `KSEVENT_TYPE_ENABLE`: UInt = 1u;
public const val `KSEVENT_TYPE_ENABLEBUFFERED`: UInt = 4u;
public const val `KSEVENT_TYPE_ONESHOT`: UInt = 2u;
public const val `KSEVENT_TYPE_QUERYBUFFER`: UInt = 1024u;
public const val `KSEVENT_TYPE_SETSUPPORT`: UInt = 256u;
public const val `KSEVENT_TYPE_TOPOLOGY`: UInt = 268435456u;
public typealias `KSEVENT_VIDCAPTOSTI` = Int;
public const val `KSEVENT_VIDCAPTOSTI_EXT_TRIGGER`: `KSEVENT_VIDCAPTOSTI` = 0;
public const val `KSEVENT_VIDCAP_AUTO_UPDATE`: `KSEVENT_VIDCAPTOSTI` = 1;
public const val `KSEVENT_VIDCAP_SEARCH`: `KSEVENT_VIDCAPTOSTI` = 2;
public typealias `KSEVENT_VIDEODECODER` = Int;
public const val `KSEVENT_VIDEODECODER_CHANGED`: `KSEVENT_VIDEODECODER` = 0;
public typealias `KSEVENT_VOLUMELIMIT` = Int;
public const val `KSEVENT_VOLUMELIMIT_CHANGED`: `KSEVENT_VOLUMELIMIT` = 0;
public typealias `KSEVENT_VPNOTIFY` = Int;
public const val `KSEVENT_VPNOTIFY_FORMATCHANGE`: `KSEVENT_VPNOTIFY` = 0;
public typealias `KSEVENT_VPVBINOTIFY` = Int;
public const val `KSEVENT_VPVBINOTIFY_FORMATCHANGE`: `KSEVENT_VPVBINOTIFY` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSE_NODE` (
    public var `Event`: `KSIDENTIFIER`,
    public var `NodeId`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSE_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSE_PIN` (
    public var `Event`: `KSIDENTIFIER`,
    public var `PinId`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSE_PIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSFILTER_FLAG_CRITICAL_PROCESSING`: UInt = 2u;
public const val `KSFILTER_FLAG_DENY_USERMODE_ACCESS`: UInt = 2147483648u;
public const val `KSFILTER_FLAG_DISPATCH_LEVEL_PROCESSING`: UInt = 1u;
public const val `KSFILTER_FLAG_HYPERCRITICAL_PROCESSING`: UInt = 4u;
public const val `KSFILTER_FLAG_PRIORITIZE_REFERENCEGUID`: UInt = 16u;
public const val `KSFILTER_FLAG_RECEIVE_ZERO_LENGTH_SAMPLES`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSFRAMETIME` (
    public var `Duration`: Long,
    public var `FrameFlags`: UInt,
    public var `Reserved`: UInt,
)
public const val `KSFRAMETIME_VARIABLESIZE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSGOP_USERDATA` (
    public var `sc`: UInt,
    public var `reserved1`: UInt,
    public var `cFields`: UByte,
    public var `l21Data`: ByteArray,
)
// UNSUPPORTED Rust 1969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSGOP_USERDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSIDENTIFIER` (
    public var `Anonymous`: `KSIDENTIFIER_0`,
)
// UNSUPPORTED Rust 1979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSIDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1984:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSIDENTIFIER_0 {
//     pub Anonymous: KSIDENTIFIER_0_0,
//     pub Alignment: i64,
// }

// UNSUPPORTED Rust 1990:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSIDENTIFIER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSIDENTIFIER_0_0` (
    public var `Set`: `windows_sys`.`core`.`GUID`,
    public var `Id`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 2002:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSINTERFACESETID_FileIo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c6f932c_e771_11d0_b8ff_00a0c9223196);

// UNSUPPORTED Rust 2003:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSINTERFACESETID_Media: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a13eb40_30a7_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 2004:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSINTERFACESETID_Standard: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a8766a0_62ce_11cf_a5d6_28db04c10000);

public typealias `KSINTERFACE_FILEIO` = Int;
public const val `KSINTERFACE_FILEIO_STREAMING`: `KSINTERFACE_FILEIO` = 0;
public typealias `KSINTERFACE_MEDIA` = Int;
public const val `KSINTERFACE_MEDIA_MUSIC`: `KSINTERFACE_MEDIA` = 0;
public const val `KSINTERFACE_MEDIA_WAVE_BUFFERED`: `KSINTERFACE_MEDIA` = 1;
public const val `KSINTERFACE_MEDIA_WAVE_QUEUED`: `KSINTERFACE_MEDIA` = 2;
public typealias `KSINTERFACE_STANDARD` = Int;
public const val `KSINTERFACE_STANDARD_CONTROL`: `KSINTERFACE_STANDARD` = 2;
public const val `KSINTERFACE_STANDARD_LOOPED_STREAMING`: `KSINTERFACE_STANDARD` = 1;
public const val `KSINTERFACE_STANDARD_STREAMING`: `KSINTERFACE_STANDARD` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSINTERVAL` (
    public var `TimeBase`: Long,
    public var `Interval`: Long,
)
public typealias `KSIOOPERATION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSJACK_DESCRIPTION` (
    public var `ChannelMapping`: UInt,
    public var `Color`: UInt,
    public var `ConnectionType`: `EPcxConnectionType`,
    public var `GeoLocation`: `EPcxGeoLocation`,
    public var `GenLocation`: `EPcxGenLocation`,
    public var `PortConnection`: `EPxcPortConnection`,
    public var `IsConnected`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSJACK_DESCRIPTION2` (
    public var `DeviceStateInfo`: UInt,
    public var `JackCapabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSJACK_DESCRIPTION3` (
    public var `ConfigId`: UInt,
)
public typealias `KSJACK_SINK_CONNECTIONTYPE` = Int;
public const val `KSJACK_SINK_CONNECTIONTYPE_DISPLAYPORT`: `KSJACK_SINK_CONNECTIONTYPE` = 1;
public const val `KSJACK_SINK_CONNECTIONTYPE_HDMI`: `KSJACK_SINK_CONNECTIONTYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSJACK_SINK_INFORMATION` (
    public var `ConnType`: `KSJACK_SINK_CONNECTIONTYPE`,
    public var `ManufacturerId`: UShort,
    public var `ProductId`: UShort,
    public var `AudioLatency`: UShort,
    public var `HDCPCapable`: `windows_sys`.`core`.`BOOL`,
    public var `AICapable`: `windows_sys`.`core`.`BOOL`,
    public var `SinkDescriptionLength`: UByte,
    public var `SinkDescription`: UShortArray,
    public var `PortId`: `super`.`super`.`Foundation`.`LUID`,
)
// UNSUPPORTED Rust 2060:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSJACK_SINK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEDIUMSETID_MidiBus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05908040_3246_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 2066:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEDIUMSETID_Standard: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4747b320_62ce_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 2067:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEDIUMSETID_VPBus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa18c15ec_ce43_11d0_abe7_00a0c9223196);

public const val `KSMEDIUM_STANDARD_DEVIO`: UInt = 0u;
public const val `KSMEDIUM_TYPE_ANYINSTANCE`: UInt = 0u;
// UNSUPPORTED Rust 2070:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEMORY_TYPE_DEVICE_UNKNOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x091bb639_603f_11d1_b067_00a0c9062802);

// UNSUPPORTED Rust 2071:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEMORY_TYPE_KERNEL_NONPAGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a6d5fc4_7895_11d1_b069_00a0c9062802);

// UNSUPPORTED Rust 2072:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEMORY_TYPE_KERNEL_PAGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd833f8f8_7894_11d1_b069_00a0c9062802);

// UNSUPPORTED Rust 2073:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEMORY_TYPE_SYSTEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x091bb638_603f_11d1_b067_00a0c9062802);

// UNSUPPORTED Rust 2074:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMEMORY_TYPE_USER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8cb0fc28_7893_11d1_b069_00a0c9062802);

// UNSUPPORTED Rust 2075:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMETHODSETID_StreamAllocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf6e4341_ec87_11cf_a130_0020afd156e4);

// UNSUPPORTED Rust 2076:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMETHODSETID_StreamIo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65d003ca_1523_11d2_b27a_00a0c9223196);

// UNSUPPORTED Rust 2077:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMETHODSETID_Wavetable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdcef31eb_d907_11d0_9583_00c04fb925d3);

public typealias `KSMETHOD_STREAMALLOCATOR` = Int;
public const val `KSMETHOD_STREAMALLOCATOR_ALLOC`: `KSMETHOD_STREAMALLOCATOR` = 0;
public const val `KSMETHOD_STREAMALLOCATOR_FREE`: `KSMETHOD_STREAMALLOCATOR` = 1;
public typealias `KSMETHOD_STREAMIO` = Int;
public const val `KSMETHOD_STREAMIO_READ`: `KSMETHOD_STREAMIO` = 0;
public const val `KSMETHOD_STREAMIO_WRITE`: `KSMETHOD_STREAMIO` = 1;
public const val `KSMETHOD_TYPE_BASICSUPPORT`: UInt = 512u;
public const val `KSMETHOD_TYPE_MODIFY`: UInt = 3u;
public const val `KSMETHOD_TYPE_NONE`: UInt = 0u;
public const val `KSMETHOD_TYPE_READ`: UInt = 1u;
public const val `KSMETHOD_TYPE_SEND`: UInt = 1u;
public const val `KSMETHOD_TYPE_SETSUPPORT`: UInt = 256u;
public const val `KSMETHOD_TYPE_SOURCE`: UInt = 4u;
public const val `KSMETHOD_TYPE_TOPOLOGY`: UInt = 268435456u;
public const val `KSMETHOD_TYPE_WRITE`: UInt = 2u;
public typealias `KSMETHOD_WAVETABLE` = Int;
public const val `KSMETHOD_WAVETABLE_WAVE_ALLOC`: `KSMETHOD_WAVETABLE` = 0;
public const val `KSMETHOD_WAVETABLE_WAVE_FIND`: `KSMETHOD_WAVETABLE` = 2;
public const val `KSMETHOD_WAVETABLE_WAVE_FREE`: `KSMETHOD_WAVETABLE` = 1;
public const val `KSMETHOD_WAVETABLE_WAVE_WRITE`: `KSMETHOD_WAVETABLE` = 3;
public const val `KSMETHOD_WAVE_QUEUED_BREAKLOOP`: UInt = 1u;
// UNSUPPORTED Rust 2099:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_AUDIO_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ea73fb4_ef7a_4559_8d5d_719d8f0426c7);

// UNSUPPORTED Rust 2100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_AUDIO_EFFECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11064c48_3648_4ed0_932e_05ce8ac811b7);

// UNSUPPORTED Rust 2101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_AUDIO_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91c64bd0_f91e_4d8c_9276_db248279d975);

// UNSUPPORTED Rust 2102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_DEMULTIPLEXER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa8700a7a_939b_44c5_99d7_76226b23b3f1);

// UNSUPPORTED Rust 2103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_MULTIPLEXER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x059c561e_05ae_4b61_b69d_55b61ee54a7b);

// UNSUPPORTED Rust 2104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_OTHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90175d57_b7ea_4901_aeb3_933a8747756f);

// UNSUPPORTED Rust 2105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_VIDEO_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6c02d4b_6833_45b4_971a_05a4b04bab91);

// UNSUPPORTED Rust 2106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_VIDEO_EFFECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x12e17c21_532c_4a6e_8a1c_40825a736397);

// UNSUPPORTED Rust 2107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_VIDEO_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf79eac7d_e545_4387_bdee_d647d7bde42a);

// UNSUPPORTED Rust 2108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMFT_CATEGORY_VIDEO_PROCESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x302ea3fc_aa5f_47f9_9f7a_c2188bb16302);

public typealias `KSMICARRAY_MICARRAYTYPE` = Int;
public const val `KSMICARRAY_MICARRAYTYPE_3D`: `KSMICARRAY_MICARRAYTYPE` = 2;
public const val `KSMICARRAY_MICARRAYTYPE_LINEAR`: `KSMICARRAY_MICARRAYTYPE` = 0;
public const val `KSMICARRAY_MICARRAYTYPE_PLANAR`: `KSMICARRAY_MICARRAYTYPE` = 1;
public typealias `KSMICARRAY_MICTYPE` = Int;
public const val `KSMICARRAY_MICTYPE_8SHAPED`: `KSMICARRAY_MICTYPE` = 5;
public const val `KSMICARRAY_MICTYPE_CARDIOID`: `KSMICARRAY_MICTYPE` = 2;
public const val `KSMICARRAY_MICTYPE_HYPERCARDIOID`: `KSMICARRAY_MICTYPE` = 4;
public const val `KSMICARRAY_MICTYPE_OMNIDIRECTIONAL`: `KSMICARRAY_MICTYPE` = 0;
public const val `KSMICARRAY_MICTYPE_SUBCARDIOID`: `KSMICARRAY_MICTYPE` = 1;
public const val `KSMICARRAY_MICTYPE_SUPERCARDIOID`: `KSMICARRAY_MICTYPE` = 3;
public const val `KSMICARRAY_MICTYPE_VENDORDEFINED`: `KSMICARRAY_MICTYPE` = 15;
public const val `KSMPEGVIDMODE_LTRBOX`: UInt = 2u;
public const val `KSMPEGVIDMODE_PANSCAN`: UInt = 1u;
public const val `KSMPEGVIDMODE_SCALE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSMPEGVID_RECT` (
    public var `StartX`: UInt,
    public var `StartY`: UInt,
    public var `EndX`: UInt,
    public var `EndY`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSMULTIPLE_DATA_PROP` (
    public var `Property`: `KSIDENTIFIER`,
    public var `MultipleItem`: `KSMULTIPLE_ITEM`,
)
// UNSUPPORTED Rust 2138:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSMULTIPLE_DATA_PROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSMULTIPLE_ITEM` (
    public var `Size`: UInt,
    public var `Count`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSMUSICFORMAT` (
    public var `TimeDeltaMs`: UInt,
    public var `ByteCount`: UInt,
)
// UNSUPPORTED Rust 2155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMUSIC_TECHNOLOGY_FMSYNTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x252c5c80_62e9_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 2156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMUSIC_TECHNOLOGY_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86c92e60_62e8_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 2157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMUSIC_TECHNOLOGY_SQSYNTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0ecf4380_62e9_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 2158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMUSIC_TECHNOLOGY_SWSYNTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37407736_3620_11d1_85d3_0000f8754380);

// UNSUPPORTED Rust 2159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSMUSIC_TECHNOLOGY_WAVETABLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x394ec7c0_62e9_11cf_a5d6_28db04c10000);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSM_NODE` (
    public var `Method`: `KSIDENTIFIER`,
    public var `NodeId`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2167:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSM_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNAME_Allocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x642f5d00_4791_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 2173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNAME_Clock: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53172480_4791_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 2174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNAME_Filter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b365890_165f_11d0_a195_0020afd156e4);

// UNSUPPORTED Rust 2175:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNAME_Pin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x146f1a80_4791_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 2176:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNAME_TopologyNode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0621061a_ee75_11d0_b915_00a0c9223196);

public const val `KSNODEPIN_AEC_CAPTURE_IN`: UInt = 2u;
public const val `KSNODEPIN_AEC_CAPTURE_OUT`: UInt = 3u;
public const val `KSNODEPIN_AEC_RENDER_IN`: UInt = 1u;
public const val `KSNODEPIN_AEC_RENDER_OUT`: UInt = 0u;
public const val `KSNODEPIN_DEMUX_IN`: UInt = 0u;
public const val `KSNODEPIN_DEMUX_OUT`: UInt = 1u;
public const val `KSNODEPIN_STANDARD_IN`: UInt = 1u;
public const val `KSNODEPIN_STANDARD_OUT`: UInt = 0u;
public const val `KSNODEPIN_SUM_MUX_IN`: UInt = 1u;
public const val `KSNODEPIN_SUM_MUX_OUT`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NodeId`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2194:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSNODEPROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_3D_LISTENER` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `ListenerId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for KSNODEPROPERTY_AUDIO_3D_LISTENER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_3D_LISTENER` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `ListenerId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KSNODEPROPERTY_AUDIO_3D_LISTENER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_CHANNEL` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `Channel`: Int,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSNODEPROPERTY_AUDIO_CHANNEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_DEV_SPECIFIC` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `DevSpecificId`: UInt,
    public var `DeviceInfo`: UInt,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 2246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSNODEPROPERTY_AUDIO_DEV_SPECIFIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_PROPERTY` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `AppContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2260:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for KSNODEPROPERTY_AUDIO_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSNODEPROPERTY_AUDIO_PROPERTY` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `AppContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 2274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KSNODEPROPERTY_AUDIO_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2280:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_1394_DA_STREAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe6_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2281:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_1394_DV_STREAM_SOUNDTRACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe7_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2282:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_3D_EFFECTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55515860_c559_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2283:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ADC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d837fe0_c555_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2284:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_AGC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe88c9ba0_c557_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2285:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ANALOG_CONNECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2286:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ANALOG_TAPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e7_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2287:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_AUDIO_ENGINE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35caf6e4_f3b3_4168_bb4b_55e77a461c7e);

// UNSUPPORTED Rust 2288:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_AUDIO_KEYWORDDETECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3817e0b8_df58_4375_b669_c49634331f9d);

// UNSUPPORTED Rust 2289:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_AUDIO_LOOPBACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f42c0b2_91ce_4bcf_9ccd_0e599037ab35);

// UNSUPPORTED Rust 2290:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_AUDIO_MODULE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45aab42e_caeb_4052_8aa9_b38cb5109619);

// UNSUPPORTED Rust 2291:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_BIDIRECTIONAL_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2292:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_CABLE_TUNER_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220ee_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2293:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_CD_PLAYER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2294:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_CHORUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x20173f20_c559_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2295:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_COMMUNICATION_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce6_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2296:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x507ae360_c554_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2297:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DAT_IO_DIGITAL_AUDIO_TAPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2298:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DCC_IO_DIGITAL_COMPACT_CASSETTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2299:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DELAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x144981e0_c558_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2300:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DEMUX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc0eb67d4_e807_11d0_958a_00c04fb925d3);

// UNSUPPORTED Rust 2301:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DESKTOP_MICROPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2302:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DESKTOP_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2303:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DEV_SPECIFIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x941c7ac0_c559_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2304:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DIGITAL_AUDIO_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2305:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DISPLAYPORT_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe47e4031_3ea6_418d_8f9b_b73843ccba97);

// UNSUPPORTED Rust 2306:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DOWN_LINE_PHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ee3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2307:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DRM_DESCRAMBLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xffbb6e3f_ccfe_4d84_90d9_421418b03a8e);

// UNSUPPORTED Rust 2308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DSS_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220ef_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DVD_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220eb_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2310:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_DYN_RANGE_COMPRESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08c8a6a8_601f_4af8_8793_d905ff4ca97d);

// UNSUPPORTED Rust 2311:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ECHO_CANCELING_SPEAKERPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2312:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ECHO_SUPPRESSING_SPEAKERPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2313:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_EMBEDDED_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2314:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_EQUALIZATION_NOISE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2315:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_EQUALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d41b4a0_c557_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2316:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_EXTERNAL_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2317:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_FM_RX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x834a733c_f485_41c0_a62b_513025014e40);

// UNSUPPORTED Rust 2318:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_HANDSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2319:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_HDMI_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd1b9cc2a_f519_417f_91c9_55fa65481001);

// UNSUPPORTED Rust 2320:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_HEADPHONES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2321:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_HEADSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2322:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_HEAD_MOUNTED_DISPLAY_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2323:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_INPUT_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2324:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_LEGACY_AUDIO_CONNECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2325:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_LEVEL_CALIBRATION_NOISE_SOURCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2326:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_LINE_CONNECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_LOUDNESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41887440_c558_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_LOW_FREQUENCY_EFFECTS_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce7_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MICROPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2330:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MICROPHONE_ARRAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MIDI_ELEMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01c6fe66_6e48_4c65_ac9b_52db5d656c7e);

// UNSUPPORTED Rust 2332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MIDI_JACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x265e0c3f_fa39_4df3_ab04_be01b91e299a);

// UNSUPPORTED Rust 2333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MINIDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e6_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MULTITRACK_RECORDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220f2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x02b223c0_c557_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_MUX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ceaf780_c556_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2337:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_NOISE_SUPPRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe07f903f_62fd_4e60_8cdd_dea7236665b5);

// UNSUPPORTED Rust 2338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_OMNI_DIRECTIONAL_MICROPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2339:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_OUTPUT_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2340:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PARAMETRIC_EQUALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19bb3a6a_ce2b_4442_87ec_6727c3cab477);

// UNSUPPORTED Rust 2341:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PEAKMETER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa085651e_5f0d_4b36_a869_d195d6ab4b9e);

// UNSUPPORTED Rust 2342:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PERSONAL_MICROPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2343:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PHONE_LINE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ee1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2344:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PHONOGRAPH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e8_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2345:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PROCESSING_MICROPHONE_ARRAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21be6_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2346:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PROLOGIC_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x831c2c80_c558_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2347:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_PROLOGIC_ENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8074c5b2_3c66_11d2_b45a_3078302c2030);

// UNSUPPORTED Rust 2348:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_RADIO_RECEIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220f0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2349:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_RADIO_TRANSMITTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220f1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2350:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_REVERB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef0328e0_c558_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2351:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_ROOM_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2352:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SATELLITE_RECEIVER_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220ed_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2353:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SPDIF_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21fe5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2354:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SPEAKER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ce1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2355:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SPEAKERPHONE_NO_ECHO_REDUCTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21de3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2356:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SPEAKERS_STATIC_JACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28e04f87_4dbe_4f8d_8589_025d209dfb4a);

// UNSUPPORTED Rust 2357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SRC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9db7b9e0_c555_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_STEREO_WIDE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9e69800_c558_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda441a60_c556_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SUPERMIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe573adc0_c555_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_SYNTHESIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220f3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_TELEPHONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ee2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_TELEPHONY_BIDI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x686d7cc0_d903_4258_b443_3a3d3580741c);

// UNSUPPORTED Rust 2364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_TELEPHONY_UNDEFINED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff21ee0_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_TONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7607e580_c557_11d0_8a2b_00a0c9255ac1);

// UNSUPPORTED Rust 2366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_TV_TUNER_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220ec_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_UPDOWN_MIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7edc5cf_7b63_4ee2_a100_29ee2cb6b2de);

// UNSUPPORTED Rust 2368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VCR_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220e9_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_CAMERA_TERMINAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e6_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_DISC_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff220ea_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_INPUT_MTT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e7_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_INPUT_TERMINAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e2_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_OUTPUT_MTT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e8_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_OUTPUT_TERMINAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e3_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_PROCESSING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e5_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_SELECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e4_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VIDEO_STREAMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdff229e1_f70f_11d0_b917_00a0c9223196);

// UNSUPPORTED Rust 2378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNODETYPE_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a5acc00_c557_11d0_8a2b_00a0c9255ac1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSNODE_CREATE` (
    public var `CreateFlags`: UInt,
    public var `Node`: UInt,
)
// UNSUPPORTED Rust 2385:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNOTIFICATIONID_AudioModule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c2220f0_d9a6_4d5c_a036_573857fd50d2);

// UNSUPPORTED Rust 2386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSNOTIFICATIONID_SoundDetector: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6389d844_bb32_4c4c_a802_f4b4b77afead);

public typealias `KSPEEKOPERATION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPIN_CINSTANCES` (
    public var `PossibleCount`: UInt,
    public var `CurrentCount`: UInt,
)
public typealias `KSPIN_COMMUNICATION` = Int;
public const val `KSPIN_COMMUNICATION_BOTH`: `KSPIN_COMMUNICATION` = 3;
public const val `KSPIN_COMMUNICATION_BRIDGE`: `KSPIN_COMMUNICATION` = 4;
public const val `KSPIN_COMMUNICATION_NONE`: `KSPIN_COMMUNICATION` = 0;
public const val `KSPIN_COMMUNICATION_SINK`: `KSPIN_COMMUNICATION` = 1;
public const val `KSPIN_COMMUNICATION_SOURCE`: `KSPIN_COMMUNICATION` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPIN_CONNECT` (
    public var `Interface`: `KSIDENTIFIER`,
    public var `Medium`: `KSIDENTIFIER`,
    public var `PinId`: UInt,
    public var `PinToHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Priority`: `KSPRIORITY`,
)
// UNSUPPORTED Rust 2409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPIN_CONNECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSPIN_DATAFLOW` = Int;
public const val `KSPIN_DATAFLOW_IN`: `KSPIN_DATAFLOW` = 1;
public const val `KSPIN_DATAFLOW_OUT`: `KSPIN_DATAFLOW` = 2;
public const val `KSPIN_FLAG_ASYNCHRONOUS_PROCESSING`: UInt = 8u;
public const val `KSPIN_FLAG_CRITICAL_PROCESSING`: UInt = 2u;
public const val `KSPIN_FLAG_DENY_USERMODE_ACCESS`: UInt = 2147483648u;
public const val `KSPIN_FLAG_DISPATCH_LEVEL_PROCESSING`: UInt = 1u;
public const val `KSPIN_FLAG_DISTINCT_TRAILING_EDGE`: UInt = 512u;
public const val `KSPIN_FLAG_DO_NOT_INITIATE_PROCESSING`: UInt = 16u;
public const val `KSPIN_FLAG_DO_NOT_USE_STANDARD_TRANSPORT`: UInt = 524288u;
public const val `KSPIN_FLAG_ENFORCE_FIFO`: UInt = 128u;
public const val `KSPIN_FLAG_FIXED_FORMAT`: UInt = 1048576u;
public const val `KSPIN_FLAG_FRAMES_NOT_REQUIRED_FOR_PROCESSING`: UInt = 64u;
public const val `KSPIN_FLAG_GENERATE_EOS_EVENTS`: UInt = 2097152u;
public const val `KSPIN_FLAG_GENERATE_MAPPINGS`: UInt = 256u;
public const val `KSPIN_FLAG_HYPERCRITICAL_PROCESSING`: UInt = 4u;
public const val `KSPIN_FLAG_IMPLEMENT_CLOCK`: UInt = 4194304u;
public const val `KSPIN_FLAG_INITIATE_PROCESSING_ON_EVERY_ARRIVAL`: UInt = 32u;
public const val `KSPIN_FLAG_PROCESS_IF_ANY_IN_RUN_STATE`: UInt = 16777216u;
public const val `KSPIN_FLAG_PROCESS_IN_RUN_STATE_ONLY`: UInt = 65536u;
public const val `KSPIN_FLAG_SOME_FRAMES_REQUIRED_FOR_PROCESSING`: UInt = 8388608u;
public const val `KSPIN_FLAG_SPLITTER`: UInt = 131072u;
public const val `KSPIN_FLAG_USE_STANDARD_TRANSPORT`: UInt = 262144u;
public typealias `KSPIN_MDL_CACHING_EVENT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPIN_MDL_CACHING_NOTIFICATION` (
    public var `Event`: `KSPIN_MDL_CACHING_EVENT`,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2444:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPIN_MDL_CACHING_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPIN_MDL_CACHING_NOTIFICATION32` (
    public var `Event`: `KSPIN_MDL_CACHING_EVENT`,
    public var `Buffer`: UInt,
)
public const val `KSPIN_MDL_CACHING_NOTIFY_ADDSAMPLE`: `KSPIN_MDL_CACHING_EVENT` = 3;
public const val `KSPIN_MDL_CACHING_NOTIFY_CLEANALL_NOWAIT`: `KSPIN_MDL_CACHING_EVENT` = 2;
public const val `KSPIN_MDL_CACHING_NOTIFY_CLEANALL_WAIT`: `KSPIN_MDL_CACHING_EVENT` = 1;
public const val `KSPIN_MDL_CACHING_NOTIFY_CLEANUP`: `KSPIN_MDL_CACHING_EVENT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPIN_PHYSICALCONNECTION` (
    public var `Size`: UInt,
    public var `Pin`: UInt,
    public var `SymbolicLinkName`: UShortArray,
)
// UNSUPPORTED Rust 2466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPIN_PHYSICALCONNECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSPPROPERTY_ALLOCATOR_MDLCACHING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPRIORITY` (
    public var `PriorityClass`: UInt,
    public var `PrioritySubClass`: UInt,
)
public const val `KSPRIORITY_EXCLUSIVE`: UInt = 4294967295u;
public const val `KSPRIORITY_HIGH`: UInt = 2147483648u;
public const val `KSPRIORITY_LOW`: UInt = 1u;
public const val `KSPRIORITY_NORMAL`: UInt = 1073741824u;
public const val `KSPROBE_ALLOCATEMDL`: UInt = 16u;
public const val `KSPROBE_ALLOWFORMATCHANGE`: UInt = 128u;
public const val `KSPROBE_MODIFY`: UInt = 512u;
public const val `KSPROBE_PROBEANDLOCK`: UInt = 32u;
public const val `KSPROBE_STREAMREAD`: UInt = 0u;
public const val `KSPROBE_STREAMWRITE`: UInt = 1u;
public const val `KSPROBE_SYSTEMADDRESS`: UInt = 64u;
// UNSUPPORTED Rust 2489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPERTYSETID_ExtendedCameraControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1cb79112_c0d2_4213_9ca6_cd4fdb927972);

// UNSUPPORTED Rust 2490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPERTYSETID_NetworkCameraControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e780f09_5745_4e3a_bc9f_f226ea43a6ec);

// UNSUPPORTED Rust 2491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPERTYSETID_PerFrameSettingControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1f3e261_dee6_4537_bff5_ee206db54aac);

public typealias `KSPROPERTY_AC3` = Int;
public const val `KSPROPERTY_AC3_ALTERNATE_AUDIO`: `KSPROPERTY_AC3` = 2;
public const val `KSPROPERTY_AC3_BIT_STREAM_MODE`: `KSPROPERTY_AC3` = 4;
public const val `KSPROPERTY_AC3_DIALOGUE_LEVEL`: `KSPROPERTY_AC3` = 5;
public const val `KSPROPERTY_AC3_DOWNMIX`: `KSPROPERTY_AC3` = 3;
public const val `KSPROPERTY_AC3_ERROR_CONCEALMENT`: `KSPROPERTY_AC3` = 1;
public const val `KSPROPERTY_AC3_LANGUAGE_CODE`: `KSPROPERTY_AC3` = 6;
public const val `KSPROPERTY_AC3_ROOM_TYPE`: `KSPROPERTY_AC3` = 7;
public const val `KSPROPERTY_ALLOCATOR_CLEANUP_CACHEDMDLPAGES`: `KSPPROPERTY_ALLOCATOR_MDLCACHING` = 1;
public typealias `KSPROPERTY_ALLOCATOR_CONTROL` = Int;
public const val `KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_CAPS`: `KSPROPERTY_ALLOCATOR_CONTROL` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_CAPS_S` (
    public var `InterleavedCapSupported`: UInt,
)
public const val `KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_INTERLEAVE`: `KSPROPERTY_ALLOCATOR_CONTROL` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_INTERLEAVE_S` (
    public var `InterleavedCapPossible`: UInt,
)
public const val `KSPROPERTY_ALLOCATOR_CONTROL_HONOR_COUNT`: `KSPROPERTY_ALLOCATOR_CONTROL` = 0;
public const val `KSPROPERTY_ALLOCATOR_CONTROL_SURFACE_SIZE`: `KSPROPERTY_ALLOCATOR_CONTROL` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_ALLOCATOR_CONTROL_SURFACE_SIZE_S` (
    public var `CX`: UInt,
    public var `CY`: UInt,
)
public const val `KSPROPERTY_ATN_READER`: `KSPROPERTY_TIMECODE` = 1;
public typealias `KSPROPERTY_AUDDECOUT` = Int;
public const val `KSPROPERTY_AUDDECOUT_CUR_MODE`: `KSPROPERTY_AUDDECOUT` = 1;
public const val `KSPROPERTY_AUDDECOUT_MODES`: `KSPROPERTY_AUDDECOUT` = 0;
public typealias `KSPROPERTY_AUDIO` = Int;
public typealias `KSPROPERTY_AUDIOENGINE` = Int;
public const val `KSPROPERTY_AUDIOENGINE_BUFFER_SIZE_RANGE`: `KSPROPERTY_AUDIOENGINE` = 7;
public const val `KSPROPERTY_AUDIOENGINE_DESCRIPTOR`: `KSPROPERTY_AUDIOENGINE` = 6;
public const val `KSPROPERTY_AUDIOENGINE_DEVICECONTROLS`: `KSPROPERTY_AUDIOENGINE` = 10;
public const val `KSPROPERTY_AUDIOENGINE_DEVICEFORMAT`: `KSPROPERTY_AUDIOENGINE` = 4;
public const val `KSPROPERTY_AUDIOENGINE_GFXENABLE`: `KSPROPERTY_AUDIOENGINE` = 1;
public const val `KSPROPERTY_AUDIOENGINE_LFXENABLE`: `KSPROPERTY_AUDIOENGINE` = 0;
public const val `KSPROPERTY_AUDIOENGINE_LOOPBACK_PROTECTION`: `KSPROPERTY_AUDIOENGINE` = 8;
public const val `KSPROPERTY_AUDIOENGINE_MIXFORMAT`: `KSPROPERTY_AUDIOENGINE` = 2;
public const val `KSPROPERTY_AUDIOENGINE_SUPPORTEDDEVICEFORMATS`: `KSPROPERTY_AUDIOENGINE` = 5;
public const val `KSPROPERTY_AUDIOENGINE_VOLUMELEVEL`: `KSPROPERTY_AUDIOENGINE` = 9;
public typealias `KSPROPERTY_AUDIOMODULE` = Int;
public const val `KSPROPERTY_AUDIOMODULE_COMMAND`: `KSPROPERTY_AUDIOMODULE` = 2;
public const val `KSPROPERTY_AUDIOMODULE_DESCRIPTORS`: `KSPROPERTY_AUDIOMODULE` = 1;
public const val `KSPROPERTY_AUDIOMODULE_NOTIFICATION_DEVICE_ID`: `KSPROPERTY_AUDIOMODULE` = 3;
public typealias `KSPROPERTY_AUDIOPOSTURE` = Int;
public const val `KSPROPERTY_AUDIOPOSTURE_ORIENTATION`: `KSPROPERTY_AUDIOPOSTURE` = 1;
public typealias `KSPROPERTY_AUDIORESOURCEMANAGEMENT` = Int;
public const val `KSPROPERTY_AUDIORESOURCEMANAGEMENT_RESOURCEGROUP`: `KSPROPERTY_AUDIORESOURCEMANAGEMENT` = 0;
public typealias `KSPROPERTY_AUDIOSIGNALPROCESSING` = Int;
public const val `KSPROPERTY_AUDIOSIGNALPROCESSING_MODES`: `KSPROPERTY_AUDIOSIGNALPROCESSING` = 0;
public const val `KSPROPERTY_AUDIO_3D_INTERFACE`: `KSPROPERTY_AUDIO` = 36;
public const val `KSPROPERTY_AUDIO_AGC`: `KSPROPERTY_AUDIO` = 21;
public const val `KSPROPERTY_AUDIO_ALGORITHM_INSTANCE`: `KSPROPERTY_AUDIO` = 38;
public const val `KSPROPERTY_AUDIO_BASS`: `KSPROPERTY_AUDIO` = 14;
public const val `KSPROPERTY_AUDIO_BASS_BOOST`: `KSPROPERTY_AUDIO` = 17;
public const val `KSPROPERTY_AUDIO_BUFFER_DURATION`: UInt = 1u;
public const val `KSPROPERTY_AUDIO_CHANNEL_CONFIG`: `KSPROPERTY_AUDIO` = 3;
public const val `KSPROPERTY_AUDIO_CHORUS_LEVEL`: `KSPROPERTY_AUDIO` = 27;
public const val `KSPROPERTY_AUDIO_CHORUS_MODULATION_DEPTH`: `KSPROPERTY_AUDIO` = 47;
public const val `KSPROPERTY_AUDIO_CHORUS_MODULATION_RATE`: `KSPROPERTY_AUDIO` = 46;
public const val `KSPROPERTY_AUDIO_COPY_PROTECTION`: `KSPROPERTY_AUDIO` = 2;
public const val `KSPROPERTY_AUDIO_CPU_RESOURCES`: `KSPROPERTY_AUDIO` = 33;
public const val `KSPROPERTY_AUDIO_DELAY`: `KSPROPERTY_AUDIO` = 22;
public const val `KSPROPERTY_AUDIO_DEMUX_DEST`: `KSPROPERTY_AUDIO` = 29;
public const val `KSPROPERTY_AUDIO_DEV_SPECIFIC`: `KSPROPERTY_AUDIO` = 28;
public const val `KSPROPERTY_AUDIO_DYNAMIC_RANGE`: `KSPROPERTY_AUDIO` = 6;
public const val `KSPROPERTY_AUDIO_DYNAMIC_SAMPLING_RATE`: `KSPROPERTY_AUDIO` = 9;
public const val `KSPROPERTY_AUDIO_EQ_BANDS`: `KSPROPERTY_AUDIO` = 20;
public const val `KSPROPERTY_AUDIO_EQ_LEVEL`: `KSPROPERTY_AUDIO` = 18;
public const val `KSPROPERTY_AUDIO_FILTER_STATE`: `KSPROPERTY_AUDIO` = 39;
public const val `KSPROPERTY_AUDIO_LATENCY`: `KSPROPERTY_AUDIO` = 1;
public const val `KSPROPERTY_AUDIO_LINEAR_BUFFER_POSITION`: `KSPROPERTY_AUDIO` = 54;
public const val `KSPROPERTY_AUDIO_LOUDNESS`: `KSPROPERTY_AUDIO` = 23;
public const val `KSPROPERTY_AUDIO_MANUFACTURE_GUID`: `KSPROPERTY_AUDIO` = 31;
public const val `KSPROPERTY_AUDIO_MIC_ARRAY_GEOMETRY`: `KSPROPERTY_AUDIO` = 51;
public const val `KSPROPERTY_AUDIO_MIC_SENSITIVITY`: `KSPROPERTY_AUDIO` = 58;
public const val `KSPROPERTY_AUDIO_MIC_SENSITIVITY2`: `KSPROPERTY_AUDIO` = 60;
public const val `KSPROPERTY_AUDIO_MIC_SNR`: `KSPROPERTY_AUDIO` = 59;
public const val `KSPROPERTY_AUDIO_MID`: `KSPROPERTY_AUDIO` = 15;
public const val `KSPROPERTY_AUDIO_MIX_LEVEL_CAPS`: `KSPROPERTY_AUDIO` = 11;
public const val `KSPROPERTY_AUDIO_MIX_LEVEL_TABLE`: `KSPROPERTY_AUDIO` = 10;
public const val `KSPROPERTY_AUDIO_MUTE`: `KSPROPERTY_AUDIO` = 13;
public const val `KSPROPERTY_AUDIO_MUX_SOURCE`: `KSPROPERTY_AUDIO` = 12;
public const val `KSPROPERTY_AUDIO_NUM_EQ_BANDS`: `KSPROPERTY_AUDIO` = 19;
public const val `KSPROPERTY_AUDIO_PEAKMETER`: `KSPROPERTY_AUDIO` = 37;
public const val `KSPROPERTY_AUDIO_PEAKMETER2`: `KSPROPERTY_AUDIO` = 55;
public const val `KSPROPERTY_AUDIO_PEQ_BAND_CENTER_FREQ`: `KSPROPERTY_AUDIO` = 43;
public const val `KSPROPERTY_AUDIO_PEQ_BAND_LEVEL`: `KSPROPERTY_AUDIO` = 45;
public const val `KSPROPERTY_AUDIO_PEQ_BAND_Q_FACTOR`: `KSPROPERTY_AUDIO` = 44;
public const val `KSPROPERTY_AUDIO_PEQ_MAX_BANDS`: `KSPROPERTY_AUDIO` = 41;
public const val `KSPROPERTY_AUDIO_PEQ_NUM_BANDS`: `KSPROPERTY_AUDIO` = 42;
public const val `KSPROPERTY_AUDIO_POSITION`: `KSPROPERTY_AUDIO` = 5;
public const val `KSPROPERTY_AUDIO_POSITIONEX`: `KSPROPERTY_AUDIO` = 50;
public const val `KSPROPERTY_AUDIO_PREFERRED_STATUS`: `KSPROPERTY_AUDIO` = 40;
public const val `KSPROPERTY_AUDIO_PRESENTATION_POSITION`: `KSPROPERTY_AUDIO` = 52;
public const val `KSPROPERTY_AUDIO_PRODUCT_GUID`: `KSPROPERTY_AUDIO` = 32;
public const val `KSPROPERTY_AUDIO_QUALITY`: `KSPROPERTY_AUDIO` = 7;
public const val `KSPROPERTY_AUDIO_REVERB_DELAY_FEEDBACK`: `KSPROPERTY_AUDIO` = 49;
public const val `KSPROPERTY_AUDIO_REVERB_LEVEL`: `KSPROPERTY_AUDIO` = 26;
public const val `KSPROPERTY_AUDIO_REVERB_TIME`: `KSPROPERTY_AUDIO` = 48;
public const val `KSPROPERTY_AUDIO_SAMPLING_RATE`: `KSPROPERTY_AUDIO` = 8;
public const val `KSPROPERTY_AUDIO_STEREO_ENHANCE`: `KSPROPERTY_AUDIO` = 30;
public const val `KSPROPERTY_AUDIO_STEREO_SPEAKER_GEOMETRY`: `KSPROPERTY_AUDIO` = 34;
public const val `KSPROPERTY_AUDIO_SURROUND_ENCODE`: `KSPROPERTY_AUDIO` = 35;
public const val `KSPROPERTY_AUDIO_TREBLE`: `KSPROPERTY_AUDIO` = 16;
public const val `KSPROPERTY_AUDIO_VOLUMELEVEL`: `KSPROPERTY_AUDIO` = 4;
public const val `KSPROPERTY_AUDIO_VOLUMELIMIT_ENGAGED`: `KSPROPERTY_AUDIO` = 57;
public const val `KSPROPERTY_AUDIO_WAVERT_CURRENT_WRITE_LASTBUFFER_POSITION`: `KSPROPERTY_AUDIO` = 56;
public const val `KSPROPERTY_AUDIO_WAVERT_CURRENT_WRITE_POSITION`: `KSPROPERTY_AUDIO` = 53;
public const val `KSPROPERTY_AUDIO_WIDENESS`: `KSPROPERTY_AUDIO` = 25;
public const val `KSPROPERTY_AUDIO_WIDE_MODE`: `KSPROPERTY_AUDIO` = 24;
public typealias `KSPROPERTY_BIBLIOGRAPHIC` = Int;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYGEOGRAPHIC`: `KSPROPERTY_BIBLIOGRAPHIC` = 825570848;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYPERSONALNAME`: `KSPROPERTY_BIBLIOGRAPHIC` = 808465952;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYRELATED`: `KSPROPERTY_BIBLIOGRAPHIC` = 808728352;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808727584;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYTOPICALTERM`: `KSPROPERTY_BIBLIOGRAPHIC` = 808793632;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDENTRYUNIFORMTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808662816;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ADDEDFORMAVAILABLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808662304;
public const val `KSPROPERTY_BIBLIOGRAPHIC_AWARDS`: `KSPROPERTY_BIBLIOGRAPHIC` = 909653280;
public const val `KSPROPERTY_BIBLIOGRAPHIC_BIBLIOGRAPHYNOTE`: `KSPROPERTY_BIBLIOGRAPHIC` = 875574560;
public const val `KSPROPERTY_BIBLIOGRAPHIC_CATALOGINGSOURCE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808726560;
public const val `KSPROPERTY_BIBLIOGRAPHIC_CITATION`: `KSPROPERTY_BIBLIOGRAPHIC` = 808531232;
public const val `KSPROPERTY_BIBLIOGRAPHIC_CONTENTSNOTE`: `KSPROPERTY_BIBLIOGRAPHIC` = 892351776;
public const val `KSPROPERTY_BIBLIOGRAPHIC_CREATIONCREDIT`: `KSPROPERTY_BIBLIOGRAPHIC` = 942683424;
public const val `KSPROPERTY_BIBLIOGRAPHIC_GENERALNOTE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808465696;
public const val `KSPROPERTY_BIBLIOGRAPHIC_INDEXTERMCURRICULUM`: `KSPROPERTY_BIBLIOGRAPHIC` = 943011360;
public const val `KSPROPERTY_BIBLIOGRAPHIC_INDEXTERMGENRE`: `KSPROPERTY_BIBLIOGRAPHIC` = 892679712;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ISBN`: `KSPROPERTY_BIBLIOGRAPHIC` = 808595488;
public const val `KSPROPERTY_BIBLIOGRAPHIC_ISSN`: `KSPROPERTY_BIBLIOGRAPHIC` = 842149920;
public const val `KSPROPERTY_BIBLIOGRAPHIC_LCCN`: `KSPROPERTY_BIBLIOGRAPHIC` = 808529952;
public const val `KSPROPERTY_BIBLIOGRAPHIC_LEADER`: `KSPROPERTY_BIBLIOGRAPHIC` = 1380207648;
public const val `KSPROPERTY_BIBLIOGRAPHIC_MAINCORPORATEBODY`: `KSPROPERTY_BIBLIOGRAPHIC` = 808530208;
public const val `KSPROPERTY_BIBLIOGRAPHIC_MAINMEETINGNAME`: `KSPROPERTY_BIBLIOGRAPHIC` = 825307424;
public const val `KSPROPERTY_BIBLIOGRAPHIC_MAINPERSONALNAME`: `KSPROPERTY_BIBLIOGRAPHIC` = 808464672;
public const val `KSPROPERTY_BIBLIOGRAPHIC_MAINUNIFORMTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808661280;
public const val `KSPROPERTY_BIBLIOGRAPHIC_PARTICIPANT`: `KSPROPERTY_BIBLIOGRAPHIC` = 825308448;
public const val `KSPROPERTY_BIBLIOGRAPHIC_PHYSICALDESCRIPTION`: `KSPROPERTY_BIBLIOGRAPHIC` = 808465184;
public const val `KSPROPERTY_BIBLIOGRAPHIC_PUBLICATION`: `KSPROPERTY_BIBLIOGRAPHIC` = 808858144;
public const val `KSPROPERTY_BIBLIOGRAPHIC_SERIESSTATEMENT`: `KSPROPERTY_BIBLIOGRAPHIC` = 809055264;
public const val `KSPROPERTY_BIBLIOGRAPHIC_SERIESSTATEMENTPERSONALNAME`: `KSPROPERTY_BIBLIOGRAPHIC` = 808466464;
public const val `KSPROPERTY_BIBLIOGRAPHIC_SERIESSTATEMENTUNIFORMTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808663072;
public const val `KSPROPERTY_BIBLIOGRAPHIC_SUMMARY`: `KSPROPERTY_BIBLIOGRAPHIC` = 808596768;
public const val `KSPROPERTY_BIBLIOGRAPHIC_SYSTEMDETAILS`: `KSPROPERTY_BIBLIOGRAPHIC` = 942880032;
public const val `KSPROPERTY_BIBLIOGRAPHIC_TARGETAUDIENCE`: `KSPROPERTY_BIBLIOGRAPHIC` = 825373984;
public const val `KSPROPERTY_BIBLIOGRAPHIC_TITLESTATEMENT`: `KSPROPERTY_BIBLIOGRAPHIC` = 892613152;
public const val `KSPROPERTY_BIBLIOGRAPHIC_UNIFORMTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 808727072;
public const val `KSPROPERTY_BIBLIOGRAPHIC_VARYINGFORMTITLE`: `KSPROPERTY_BIBLIOGRAPHIC` = 909390368;
// UNSUPPORTED Rust 2646:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_BOUNDS_LONG {
//     pub Anonymous1: KSPROPERTY_BOUNDS_LONG_0,
//     pub Anonymous2: KSPROPERTY_BOUNDS_LONG_1,
// }

// UNSUPPORTED Rust 2652:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_BOUNDS_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_BOUNDS_LONG_0` (
    public var `SignedMinimum`: Int,
    public var `SignedMaximum`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_BOUNDS_LONG_1` (
    public var `UnsignedMinimum`: UInt,
    public var `UnsignedMaximum`: UInt,
)
// UNSUPPORTED Rust 2669:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_BOUNDS_LONGLONG {
//     pub Anonymous1: KSPROPERTY_BOUNDS_LONGLONG_0,
//     pub Anonymous2: KSPROPERTY_BOUNDS_LONGLONG_1,
// }

// UNSUPPORTED Rust 2675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_BOUNDS_LONGLONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_BOUNDS_LONGLONG_0` (
    public var `SignedMinimum`: Long,
    public var `SignedMaximum`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_BOUNDS_LONGLONG_1` (
    public var `UnsignedMinimum`: ULong,
    public var `UnsignedMaximum`: ULong,
)
public typealias `KSPROPERTY_BTAUDIO` = Int;
public const val `KSPROPERTY_CAMERACONTROL_AUTO_EXPOSURE_PRIORITY`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 19;
public const val `KSPROPERTY_CAMERACONTROL_EXPOSURE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 4;
public const val `KSPROPERTY_CAMERACONTROL_EXPOSURE_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 14;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ADVANCEDPHOTO`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 33;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_BACKGROUNDSEGMENTATION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 41;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_CAMERAANGLEOFFSET`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 17;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_DIGITALWINDOW`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 43;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_DIGITALWINDOW_CONFIGCAPS`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 42;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_END`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 44;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_END2`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 44;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_EVCOMPENSATION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 16;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_EXPOSUREMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 12;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_EYEGAZECORRECTION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 40;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FACEAUTH_MODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 35;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FACEDETECTION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 29;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FIELDOFVIEW`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 15;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FLASHMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 9;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FOCUSMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 13;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FOCUSPRIORITY`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 19;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_FOCUSSTATE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 20;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_HISTOGRAM`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 31;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_IRTORCHMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 38;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ISO`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 14;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ISO_ADVANCED`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 26;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_MAXVIDFPS_PHOTORES`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 5;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_MCC`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 25;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_METADATA`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 18;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_OIS`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 32;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_OPTIMIZATIONHINT`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 10;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOCONFIRMATION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 23;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOFRAMERATE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 1;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOMAXFRAMERATE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 2;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 0;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOTHUMBNAIL`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 6;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PHOTOTRIGGERTIME`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 3;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_PROFILE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 34;
public typealias `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = Int;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_RELATIVEPANELOPTIMIZATION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 39;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ROI_CONFIGCAPS`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 21;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ROI_ISPCONTROL`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 22;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_SCENEMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 7;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_SECURE_MODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 36;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_TORCHMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 8;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_VFR`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 28;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_VIDEOHDR`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 30;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_VIDEOSTABILIZATION`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 27;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_VIDEOTEMPORALDENOISING`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 37;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_WARMSTART`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 4;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_WHITEBALANCEMODE`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 11;
public const val `KSPROPERTY_CAMERACONTROL_EXTENDED_ZOOM`: `KSPROPERTY_CAMERACONTROL_EXTENDED_PROPERTY` = 24;
public const val `KSPROPERTY_CAMERACONTROL_FLAGS_ABSOLUTE`: Int = 0;
public const val `KSPROPERTY_CAMERACONTROL_FLAGS_ASYNCHRONOUS`: Int = 4;
public const val `KSPROPERTY_CAMERACONTROL_FLAGS_AUTO`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_FLAGS_MANUAL`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_FLAGS_RELATIVE`: Int = 16;
public typealias `KSPROPERTY_CAMERACONTROL_FLASH` = Int;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_AUTO`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_FLAGS_AUTO`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_FLAGS_MANUAL`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_OFF`: Int = 0;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_ON`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_FLASH_PROPERTY_ID`: `KSPROPERTY_CAMERACONTROL_FLASH` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_CAMERACONTROL_FLASH_S` (
    public var `Flash`: UInt,
    public var `Capabilities`: UInt,
)
public const val `KSPROPERTY_CAMERACONTROL_FOCAL_LENGTH`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 18;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_FOCAL_LENGTH_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `lOcularFocalLength`: Int,
    public var `lObjectiveFocalLengthMin`: Int,
    public var `lObjectiveFocalLengthMax`: Int,
)
// UNSUPPORTED Rust 2770:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_FOCAL_LENGTH_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CAMERACONTROL_FOCUS`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 6;
public const val `KSPROPERTY_CAMERACONTROL_FOCUS_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 16;
public typealias `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY` = Int;
public const val `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY_EXCLUSIVE_WITH_RECORD`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY_PROPERTY_ID`: `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY_S` (
    public var `Capabilities`: UInt,
    public var `Reserved0`: UInt,
)
public const val `KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY_SEQUENCE_EXCLUSIVE_WITH_RECORD`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_IRIS`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 5;
public const val `KSPROPERTY_CAMERACONTROL_IRIS_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 15;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_NODE_FOCAL_LENGTH_S` (
    public var `NodeProperty`: `KSNODEPROPERTY`,
    public var `lOcularFocalLength`: Int,
    public var `lObjectiveFocalLengthMin`: Int,
    public var `lObjectiveFocalLengthMax`: Int,
)
// UNSUPPORTED Rust 2797:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_NODE_FOCAL_LENGTH_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_NODE_S` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 2810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_NODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_NODE_S2` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `Value1`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
    public var `Value2`: Int,
)
// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_NODE_S2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CAMERACONTROL_PAN`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 0;
public const val `KSPROPERTY_CAMERACONTROL_PANTILT`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 9;
public const val `KSPROPERTY_CAMERACONTROL_PANTILT_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 17;
public const val `KSPROPERTY_CAMERACONTROL_PAN_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 10;
public const val `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_CAPABILITY`: `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_PROPERTY` = 0;
public const val `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_CLEAR`: `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_PROPERTY` = 2;
public typealias `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_PROPERTY` = Int;
public const val `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_SET`: `KSPROPERTY_CAMERACONTROL_PERFRAMESETTING_PROPERTY` = 1;
public const val `KSPROPERTY_CAMERACONTROL_PRIVACY`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 8;
public typealias `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST` = Int;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_CONFIG_EXPOSURE`: Int = 512;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_CONFIG_FOCUS`: Int = 256;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_CONFIG_WB`: Int = 1024;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_CONVERGEMODE`: Int = 1073741824;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_FLAGS_ASYNC`: Int = -2147483648;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_FLAGS_AUTO`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_FLAGS_MANUAL`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_PROPERTY_ID`: `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S` (
    public var `FocusRect`: `super`.`super`.`Foundation`.`RECT`,
    public var `AutoFocusLock`: `windows_sys`.`core`.`BOOL`,
    public var `AutoExposureLock`: `windows_sys`.`core`.`BOOL`,
    public var `AutoWhitebalanceLock`: `windows_sys`.`core`.`BOOL`,
    public var `Anonymous`: `KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0`,
)
// UNSUPPORTED Rust 2856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2861:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0 {
//     pub Capabilities: u32,
//     pub Configuration: u32,
// }

// UNSUPPORTED Rust 2867:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CAMERACONTROL_ROLL`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 2;
public const val `KSPROPERTY_CAMERACONTROL_ROLL_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 12;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 2882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_S2` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value1`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
    public var `Value2`: Int,
)
// UNSUPPORTED Rust 2896:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_S2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CAMERACONTROL_SCANMODE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CAMERACONTROL_S_EX` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
    public var `FocusRect`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 2911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CAMERACONTROL_S_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CAMERACONTROL_TILT`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 1;
public const val `KSPROPERTY_CAMERACONTROL_TILT_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 11;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_AUTO`: Int = 4;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_FLAGS_AUTO`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_FLAGS_MANUAL`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_HIGH`: Int = 1;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_LOW`: Int = 3;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_MEDIUM`: Int = 2;
public const val `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_OFF`: Int = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_S` (
    public var `VideoStabilizationMode`: UInt,
    public var `Capabilities`: UInt,
)
public typealias `KSPROPERTY_CAMERACONTROL_VIDEO_STABILIZATION_MODE` = Int;
public const val `KSPROPERTY_CAMERACONTROL_VIDEO_STABILIZATION_MODE_PROPERTY_ID`: `KSPROPERTY_CAMERACONTROL_VIDEO_STABILIZATION_MODE` = 0;
public const val `KSPROPERTY_CAMERACONTROL_ZOOM`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 3;
public const val `KSPROPERTY_CAMERACONTROL_ZOOM_RELATIVE`: `KSPROPERTY_VIDCAP_CAMERACONTROL` = 13;
public const val `KSPROPERTY_CAMERA_PHOTOTRIGGERTIME_CLEAR`: `KSPROPERTY_CAMERA_PHOTOTRIGGERTIME_FLAGS` = 0;
public typealias `KSPROPERTY_CAMERA_PHOTOTRIGGERTIME_FLAGS` = Int;
public const val `KSPROPERTY_CAMERA_PHOTOTRIGGERTIME_SET`: `KSPROPERTY_CAMERA_PHOTOTRIGGERTIME_FLAGS` = 1;
public typealias `KSPROPERTY_CLOCK` = Int;
public const val `KSPROPERTY_CLOCK_CORRELATEDPHYSICALTIME`: `KSPROPERTY_CLOCK` = 3;
public const val `KSPROPERTY_CLOCK_CORRELATEDTIME`: `KSPROPERTY_CLOCK` = 2;
public const val `KSPROPERTY_CLOCK_PHYSICALTIME`: `KSPROPERTY_CLOCK` = 1;
public const val `KSPROPERTY_CLOCK_RESOLUTION`: `KSPROPERTY_CLOCK` = 4;
public const val `KSPROPERTY_CLOCK_STATE`: `KSPROPERTY_CLOCK` = 5;
public const val `KSPROPERTY_CLOCK_TIME`: `KSPROPERTY_CLOCK` = 0;
public typealias `KSPROPERTY_CONNECTION` = Int;
public const val `KSPROPERTY_CONNECTION_ACQUIREORDERING`: `KSPROPERTY_CONNECTION` = 5;
public const val `KSPROPERTY_CONNECTION_ALLOCATORFRAMING`: `KSPROPERTY_CONNECTION` = 3;
public const val `KSPROPERTY_CONNECTION_ALLOCATORFRAMING_EX`: `KSPROPERTY_CONNECTION` = 6;
public const val `KSPROPERTY_CONNECTION_DATAFORMAT`: `KSPROPERTY_CONNECTION` = 2;
public const val `KSPROPERTY_CONNECTION_PRIORITY`: `KSPROPERTY_CONNECTION` = 1;
public const val `KSPROPERTY_CONNECTION_PROPOSEDATAFORMAT`: `KSPROPERTY_CONNECTION` = 4;
public const val `KSPROPERTY_CONNECTION_STARTAT`: `KSPROPERTY_CONNECTION` = 7;
public const val `KSPROPERTY_CONNECTION_STATE`: `KSPROPERTY_CONNECTION` = 0;
public typealias `KSPROPERTY_COPYPROT` = Int;
public const val `KSPROPERTY_COPY_MACROVISION`: `KSPROPERTY_COPYPROT` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CROSSBAR_ACTIVE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `IndexInputPin`: UInt,
    public var `Active`: UInt,
)
// UNSUPPORTED Rust 2963:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CROSSBAR_ACTIVE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CROSSBAR_CAN_ROUTE`: `KSPROPERTY_VIDCAP_CROSSBAR` = 2;
public const val `KSPROPERTY_CROSSBAR_CAPS`: `KSPROPERTY_VIDCAP_CROSSBAR` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CROSSBAR_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NumberOfInputs`: UInt,
    public var `NumberOfOutputs`: UInt,
)
// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CROSSBAR_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CROSSBAR_INPUT_ACTIVE`: `KSPROPERTY_VIDCAP_CROSSBAR` = 4;
public const val `KSPROPERTY_CROSSBAR_PININFO`: `KSPROPERTY_VIDCAP_CROSSBAR` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CROSSBAR_PININFO_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Direction`: `KSPIN_DATAFLOW`,
    public var `Index`: UInt,
    public var `PinType`: UInt,
    public var `RelatedPinIndex`: UInt,
    public var `Medium`: `KSIDENTIFIER`,
)
// UNSUPPORTED Rust 2994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CROSSBAR_PININFO_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CROSSBAR_ROUTE`: `KSPROPERTY_VIDCAP_CROSSBAR` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_CROSSBAR_ROUTE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `IndexInputPin`: UInt,
    public var `IndexOutputPin`: UInt,
    public var `CanRoute`: UInt,
)
// UNSUPPORTED Rust 3008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_CROSSBAR_ROUTE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_CURRENT_CAPTURE_SURFACE`: `KSPROPERTY_VIDMEM_TRANSPORT` = 3;
public typealias `KSPROPERTY_CYCLIC` = Int;
public const val `KSPROPERTY_CYCLIC_POSITION`: `KSPROPERTY_CYCLIC` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_DESCRIPTION` (
    public var `AccessFlags`: UInt,
    public var `DescriptionSize`: UInt,
    public var `PropTypeSet`: `KSIDENTIFIER`,
    public var `MembersListCount`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 3025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSPROPERTY_DIRECTSOUND3DBUFFER` = Int;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_ALL`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 0;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_CONEANGLES`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 3;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_CONEORIENTATION`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 4;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_CONEOUTSIDEVOLUME`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 5;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_MAXDISTANCE`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 7;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_MINDISTANCE`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 6;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_MODE`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 8;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_POSITION`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 1;
public const val `KSPROPERTY_DIRECTSOUND3DBUFFER_VELOCITY`: `KSPROPERTY_DIRECTSOUND3DBUFFER` = 2;
public typealias `KSPROPERTY_DIRECTSOUND3DLISTENER` = Int;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_ALL`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 0;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_ALLOCATION`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 8;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_BATCH`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 7;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_DISTANCEFACTOR`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 4;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_DOPPLERFACTOR`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 6;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_ORIENTATION`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 3;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_POSITION`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 1;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_ROLLOFFFACTOR`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 5;
public const val `KSPROPERTY_DIRECTSOUND3DLISTENER_VELOCITY`: `KSPROPERTY_DIRECTSOUND3DLISTENER` = 2;
public const val `KSPROPERTY_DISPLAY_ADAPTER_GUID`: `KSPROPERTY_VIDMEM_TRANSPORT` = 1;
public typealias `KSPROPERTY_DRMAUDIOSTREAM` = Int;
public const val `KSPROPERTY_DRMAUDIOSTREAM_CONTENTID`: `KSPROPERTY_DRMAUDIOSTREAM` = 0;
public const val `KSPROPERTY_DROPPEDFRAMES_CURRENT`: `KSPROPERTY_VIDCAP_DROPPEDFRAMES` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_DROPPEDFRAMES_CURRENT_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `PictureNumber`: Long,
    public var `DropCount`: Long,
    public var `AverageFrameSize`: UInt,
)
// UNSUPPORTED Rust 3062:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_DROPPEDFRAMES_CURRENT_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_DVDCOPY_CHLG_KEY`: `KSPROPERTY_COPYPROT` = 1;
public const val `KSPROPERTY_DVDCOPY_DEC_KEY2`: `KSPROPERTY_COPYPROT` = 3;
public const val `KSPROPERTY_DVDCOPY_DISC_KEY`: `KSPROPERTY_COPYPROT` = 128;
public const val `KSPROPERTY_DVDCOPY_DVD_KEY1`: `KSPROPERTY_COPYPROT` = 2;
public const val `KSPROPERTY_DVDCOPY_REGION`: `KSPROPERTY_COPYPROT` = 6;
public const val `KSPROPERTY_DVDCOPY_SET_COPY_STATE`: `KSPROPERTY_COPYPROT` = 7;
public const val `KSPROPERTY_DVDCOPY_TITLE_KEY`: `KSPROPERTY_COPYPROT` = 4;
public typealias `KSPROPERTY_DVDSUBPIC` = Int;
public const val `KSPROPERTY_DVDSUBPIC_COMPOSIT_ON`: `KSPROPERTY_DVDSUBPIC` = 2;
public const val `KSPROPERTY_DVDSUBPIC_HLI`: `KSPROPERTY_DVDSUBPIC` = 1;
public const val `KSPROPERTY_DVDSUBPIC_PALETTE`: `KSPROPERTY_DVDSUBPIC` = 0;
public typealias `KSPROPERTY_EXTDEVICE` = Int;
public const val `KSPROPERTY_EXTDEVICE_CAPABILITIES`: `KSPROPERTY_EXTDEVICE` = 4;
public const val `KSPROPERTY_EXTDEVICE_ID`: `KSPROPERTY_EXTDEVICE` = 0;
public const val `KSPROPERTY_EXTDEVICE_PORT`: `KSPROPERTY_EXTDEVICE` = 3;
public const val `KSPROPERTY_EXTDEVICE_POWER_STATE`: `KSPROPERTY_EXTDEVICE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_EXTDEVICE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `u`: `KSPROPERTY_EXTDEVICE_S_0`,
)
// UNSUPPORTED Rust 3089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTDEVICE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3094:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_EXTDEVICE_S_0 {
//     pub Capabilities: DEVCAPS,
//     pub DevPort: u32,
//     pub PowerState: u32,
//     pub pawchString: [u16; 260],
//     pub NodeUniqueID: [u32; 2],
// }

// UNSUPPORTED Rust 3103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTDEVICE_S_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_EXTDEVICE_VERSION`: `KSPROPERTY_EXTDEVICE` = 1;
public typealias `KSPROPERTY_EXTENSION_UNIT` = Int;
public const val `KSPROPERTY_EXTENSION_UNIT_CONTROL`: `KSPROPERTY_EXTENSION_UNIT` = 1;
public const val `KSPROPERTY_EXTENSION_UNIT_INFO`: `KSPROPERTY_EXTENSION_UNIT` = 0;
public const val `KSPROPERTY_EXTENSION_UNIT_PASS_THROUGH`: `KSPROPERTY_EXTENSION_UNIT` = 65535;
public typealias `KSPROPERTY_EXTXPORT` = Int;
public const val `KSPROPERTY_EXTXPORT_ATN_SEARCH`: `KSPROPERTY_EXTXPORT` = 8;
public const val `KSPROPERTY_EXTXPORT_CAPABILITIES`: `KSPROPERTY_EXTXPORT` = 0;
public const val `KSPROPERTY_EXTXPORT_INPUT_SIGNAL_MODE`: `KSPROPERTY_EXTXPORT` = 1;
public const val `KSPROPERTY_EXTXPORT_LOAD_MEDIUM`: `KSPROPERTY_EXTXPORT` = 3;
public const val `KSPROPERTY_EXTXPORT_MEDIUM_INFO`: `KSPROPERTY_EXTXPORT` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_EXTXPORT_NODE_S` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `u`: `KSPROPERTY_EXTXPORT_NODE_S_0`,
)
// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_NODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3130:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_EXTXPORT_NODE_S_0 {
//     pub Capabilities: u32,
//     pub SignalMode: u32,
//     pub LoadMedium: u32,
//     pub MediumInfo: MEDIUM_INFO,
//     pub XPrtState: TRANSPORT_STATE,
//     pub Timecode: KSPROPERTY_EXTXPORT_NODE_S_0_0,
//     pub dwTimecode: u32,
//     pub dwAbsTrackNumber: u32,
//     pub RawAVC: KSPROPERTY_EXTXPORT_NODE_S_0_1,
// }

// UNSUPPORTED Rust 3143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_NODE_S_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_EXTXPORT_NODE_S_0_1` (
    public var `PayloadSize`: UInt,
    public var `Payload`: UByteArray,
)
// UNSUPPORTED Rust 3154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_NODE_S_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_EXTXPORT_NODE_S_0_0` (
    public var `frame`: UByte,
    public var `second`: UByte,
    public var `minute`: UByte,
    public var `hour`: UByte,
)
public const val `KSPROPERTY_EXTXPORT_OUTPUT_SIGNAL_MODE`: `KSPROPERTY_EXTXPORT` = 2;
public const val `KSPROPERTY_EXTXPORT_RTC_SEARCH`: `KSPROPERTY_EXTXPORT` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_EXTXPORT_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `u`: `KSPROPERTY_EXTXPORT_S_0`,
)
// UNSUPPORTED Rust 3175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3180:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSPROPERTY_EXTXPORT_S_0 {
//     pub Capabilities: u32,
//     pub SignalMode: u32,
//     pub LoadMedium: u32,
//     pub MediumInfo: MEDIUM_INFO,
//     pub XPrtState: TRANSPORT_STATE,
//     pub Timecode: KSPROPERTY_EXTXPORT_S_0_0,
//     pub dwTimecode: u32,
//     pub dwAbsTrackNumber: u32,
//     pub RawAVC: KSPROPERTY_EXTXPORT_S_0_1,
// }

// UNSUPPORTED Rust 3193:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_S_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_EXTXPORT_S_0_1` (
    public var `PayloadSize`: UInt,
    public var `Payload`: UByteArray,
)
// UNSUPPORTED Rust 3204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_EXTXPORT_S_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_EXTXPORT_S_0_0` (
    public var `frame`: UByte,
    public var `second`: UByte,
    public var `minute`: UByte,
    public var `hour`: UByte,
)
public const val `KSPROPERTY_EXTXPORT_STATE`: `KSPROPERTY_EXTXPORT` = 5;
public const val `KSPROPERTY_EXTXPORT_STATE_NOTIFY`: `KSPROPERTY_EXTXPORT` = 6;
public const val `KSPROPERTY_EXTXPORT_TIMECODE_SEARCH`: `KSPROPERTY_EXTXPORT` = 7;
public const val `KSPROPERTY_FMRX_ANTENNAENDPOINTID`: `KSPROPERTY_FMRX_TOPOLOGY` = 2;
public typealias `KSPROPERTY_FMRX_CONTROL` = Int;
public const val `KSPROPERTY_FMRX_ENDPOINTID`: `KSPROPERTY_FMRX_TOPOLOGY` = 0;
public const val `KSPROPERTY_FMRX_STATE`: `KSPROPERTY_FMRX_CONTROL` = 0;
public typealias `KSPROPERTY_FMRX_TOPOLOGY` = Int;
public const val `KSPROPERTY_FMRX_VOLUME`: `KSPROPERTY_FMRX_TOPOLOGY` = 1;
public typealias `KSPROPERTY_GENERAL` = Int;
public const val `KSPROPERTY_GENERAL_COMPONENTID`: `KSPROPERTY_GENERAL` = 0;
public typealias `KSPROPERTY_HRTF3D` = Int;
public const val `KSPROPERTY_HRTF3D_FILTER_FORMAT`: `KSPROPERTY_HRTF3D` = 2;
public const val `KSPROPERTY_HRTF3D_INITIALIZE`: `KSPROPERTY_HRTF3D` = 1;
public const val `KSPROPERTY_HRTF3D_PARAMS`: `KSPROPERTY_HRTF3D` = 0;
public typealias `KSPROPERTY_INTERLEAVEDAUDIO` = Int;
public const val `KSPROPERTY_INTERLEAVEDAUDIO_FORMATINFORMATION`: `KSPROPERTY_INTERLEAVEDAUDIO` = 1;
public typealias `KSPROPERTY_ITD3D` = Int;
public const val `KSPROPERTY_ITD3D_PARAMS`: `KSPROPERTY_ITD3D` = 0;
public typealias `KSPROPERTY_JACK` = Int;
public const val `KSPROPERTY_JACK_CONTAINERID`: `KSPROPERTY_JACK` = 4;
public const val `KSPROPERTY_JACK_DESCRIPTION`: `KSPROPERTY_JACK` = 1;
public const val `KSPROPERTY_JACK_DESCRIPTION2`: `KSPROPERTY_JACK` = 2;
public const val `KSPROPERTY_JACK_DESCRIPTION3`: `KSPROPERTY_JACK` = 5;
public const val `KSPROPERTY_JACK_SINK_INFO`: `KSPROPERTY_JACK` = 3;
public const val `KSPROPERTY_MAP_CAPTURE_HANDLE_TO_VRAM_ADDRESS`: `KSPROPERTY_VIDMEM_TRANSPORT` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_MEDIAAVAILABLE` (
    public var `Earliest`: Long,
    public var `Latest`: Long,
)
public typealias `KSPROPERTY_MEDIASEEKING` = Int;
public const val `KSPROPERTY_MEDIASEEKING_AVAILABLE`: `KSPROPERTY_MEDIASEEKING` = 7;
public const val `KSPROPERTY_MEDIASEEKING_CAPABILITIES`: `KSPROPERTY_MEDIASEEKING` = 0;
public const val `KSPROPERTY_MEDIASEEKING_CONVERTTIMEFORMAT`: `KSPROPERTY_MEDIASEEKING` = 9;
public const val `KSPROPERTY_MEDIASEEKING_DURATION`: `KSPROPERTY_MEDIASEEKING` = 6;
public const val `KSPROPERTY_MEDIASEEKING_FORMATS`: `KSPROPERTY_MEDIASEEKING` = 1;
public const val `KSPROPERTY_MEDIASEEKING_POSITION`: `KSPROPERTY_MEDIASEEKING` = 3;
public const val `KSPROPERTY_MEDIASEEKING_POSITIONS`: `KSPROPERTY_MEDIASEEKING` = 5;
public const val `KSPROPERTY_MEDIASEEKING_PREROLL`: `KSPROPERTY_MEDIASEEKING` = 8;
public const val `KSPROPERTY_MEDIASEEKING_STOPPOSITION`: `KSPROPERTY_MEDIASEEKING` = 4;
public const val `KSPROPERTY_MEDIASEEKING_TIMEFORMAT`: `KSPROPERTY_MEDIASEEKING` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_MEMBERSHEADER` (
    public var `MembersFlags`: UInt,
    public var `MembersSize`: UInt,
    public var `MembersCount`: UInt,
    public var `Flags`: UInt,
)
public const val `KSPROPERTY_MEMBER_FLAG_BASICSUPPORT_MULTICHANNEL`: UInt = 2u;
public const val `KSPROPERTY_MEMBER_FLAG_BASICSUPPORT_UNIFORM`: UInt = 4u;
public const val `KSPROPERTY_MEMBER_FLAG_DEFAULT`: UInt = 1u;
public const val `KSPROPERTY_MEMBER_RANGES`: UInt = 1u;
public const val `KSPROPERTY_MEMBER_STEPPEDRANGES`: UInt = 2u;
public const val `KSPROPERTY_MEMBER_VALUES`: UInt = 3u;
public const val `KSPROPERTY_MEMORY_TRANSPORT`: Int = 1;
public typealias `KSPROPERTY_MPEG2VID` = Int;
public const val `KSPROPERTY_MPEG2VID_16_9_PANSCAN`: `KSPROPERTY_MPEG2VID` = 4;
public const val `KSPROPERTY_MPEG2VID_16_9_RECT`: `KSPROPERTY_MPEG2VID` = 3;
public const val `KSPROPERTY_MPEG2VID_4_3_RECT`: `KSPROPERTY_MPEG2VID` = 2;
public const val `KSPROPERTY_MPEG2VID_CUR_MODE`: `KSPROPERTY_MPEG2VID` = 1;
public const val `KSPROPERTY_MPEG2VID_MODES`: `KSPROPERTY_MPEG2VID` = 0;
public typealias `KSPROPERTY_MPEG4_MEDIATYPE_ATTRIBUTES` = Int;
public const val `KSPROPERTY_MPEG4_MEDIATYPE_SD_BOX`: `KSPROPERTY_MPEG4_MEDIATYPE_ATTRIBUTES` = 1;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_EVENTTOPICS_XML`: `KSPROPERTY_NETWORKCAMERACONTROL_PROPERTY` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_NETWORKCAMERACONTROL_EVENT_INFO` (
    public var `Header`: `KSCAMERA_METADATA_ITEMHEADER`,
    public var `EventFilter`: UShortArray,
)
// UNSUPPORTED Rust 3290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_NETWORKCAMERACONTROL_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_NETWORKCAMERACONTROL_METADATA`: `KSPROPERTY_NETWORKCAMERACONTROL_PROPERTY` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_NETWORKCAMERACONTROL_METADATA_INFO` (
    public var `MetadataItems`: UInt,
    public var `Size`: UInt,
    public var `PTZStatus`: `windows_sys`.`core`.`BOOL`,
    public var `Events`: `windows_sys`.`core`.`BOOL`,
    public var `Analytics`: `windows_sys`.`core`.`BOOL`,
    public var `Reserved`: `windows_sys`.`core`.`BOOL`,
)
public typealias `KSPROPERTY_NETWORKCAMERACONTROL_METADATA_TYPE` = Int;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_METADATA_TYPE_EVENTSINFO`: `KSPROPERTY_NETWORKCAMERACONTROL_METADATA_TYPE` = 0;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_NTP`: `KSPROPERTY_NETWORKCAMERACONTROL_PROPERTY` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_HEADER` (
    public var `Size`: UInt,
    public var `Type`: `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE`,
)
public typealias `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE` = Int;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE_CUSTOM`: `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE` = 2;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE_DISABLE`: `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE` = 0;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE_HOSTNTP`: `KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE` = 1;
public typealias `KSPROPERTY_NETWORKCAMERACONTROL_PROPERTY` = Int;
public const val `KSPROPERTY_NETWORKCAMERACONTROL_URI`: `KSPROPERTY_NETWORKCAMERACONTROL_PROPERTY` = 1;
public const val `KSPROPERTY_ONESHOT_DISCONNECT`: `KSPROPERTY_BTAUDIO` = 1;
public const val `KSPROPERTY_ONESHOT_RECONNECT`: `KSPROPERTY_BTAUDIO` = 0;
public typealias `KSPROPERTY_OVERLAYUPDATE` = Int;
public const val `KSPROPERTY_OVERLAYUPDATE_CLIPLIST`: `KSPROPERTY_OVERLAYUPDATE` = 1;
public const val `KSPROPERTY_OVERLAYUPDATE_COLORKEY`: `KSPROPERTY_OVERLAYUPDATE` = 4;
public const val `KSPROPERTY_OVERLAYUPDATE_COLORREF`: `KSPROPERTY_OVERLAYUPDATE` = 268435456;
public const val `KSPROPERTY_OVERLAYUPDATE_DISPLAYCHANGE`: `KSPROPERTY_OVERLAYUPDATE` = 16;
public const val `KSPROPERTY_OVERLAYUPDATE_INTERESTS`: `KSPROPERTY_OVERLAYUPDATE` = 0;
public const val `KSPROPERTY_OVERLAYUPDATE_PALETTE`: `KSPROPERTY_OVERLAYUPDATE` = 2;
public const val `KSPROPERTY_OVERLAYUPDATE_VIDEOPOSITION`: `KSPROPERTY_OVERLAYUPDATE` = 8;
public typealias `KSPROPERTY_PIN` = Int;
public const val `KSPROPERTY_PIN_CATEGORY`: `KSPROPERTY_PIN` = 11;
public const val `KSPROPERTY_PIN_CINSTANCES`: `KSPROPERTY_PIN` = 0;
public const val `KSPROPERTY_PIN_COMMUNICATION`: `KSPROPERTY_PIN` = 7;
public const val `KSPROPERTY_PIN_CONSTRAINEDDATARANGES`: `KSPROPERTY_PIN` = 13;
public const val `KSPROPERTY_PIN_CTYPES`: `KSPROPERTY_PIN` = 1;
public const val `KSPROPERTY_PIN_DATAFLOW`: `KSPROPERTY_PIN` = 2;
public const val `KSPROPERTY_PIN_DATAINTERSECTION`: `KSPROPERTY_PIN` = 4;
public const val `KSPROPERTY_PIN_DATARANGES`: `KSPROPERTY_PIN` = 3;
public const val `KSPROPERTY_PIN_FLAGS_ATTRIBUTE_RANGE_AWARE`: UInt = 1u;
public const val `KSPROPERTY_PIN_FLAGS_MASK`: UInt = 1u;
public const val `KSPROPERTY_PIN_GLOBALCINSTANCES`: `KSPROPERTY_PIN` = 8;
public const val `KSPROPERTY_PIN_INTERFACES`: `KSPROPERTY_PIN` = 5;
public const val `KSPROPERTY_PIN_MEDIUMS`: `KSPROPERTY_PIN` = 6;
public const val `KSPROPERTY_PIN_MODEDATAFORMATS`: `KSPROPERTY_PIN` = 16;
public const val `KSPROPERTY_PIN_NAME`: `KSPROPERTY_PIN` = 12;
public const val `KSPROPERTY_PIN_NECESSARYINSTANCES`: `KSPROPERTY_PIN` = 9;
public const val `KSPROPERTY_PIN_PHYSICALCONNECTION`: `KSPROPERTY_PIN` = 10;
public const val `KSPROPERTY_PIN_PROPOSEDATAFORMAT`: `KSPROPERTY_PIN` = 14;
public const val `KSPROPERTY_PIN_PROPOSEDATAFORMAT2`: `KSPROPERTY_PIN` = 15;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_POSITIONS` (
    public var `Current`: Long,
    public var `Stop`: Long,
    public var `CurrentFlags`: `KS_SEEKING_FLAGS`,
    public var `StopFlags`: `KS_SEEKING_FLAGS`,
)
public const val `KSPROPERTY_PREFERRED_CAPTURE_SURFACE`: `KSPROPERTY_VIDMEM_TRANSPORT` = 2;
public typealias `KSPROPERTY_QUALITY` = Int;
public const val `KSPROPERTY_QUALITY_ERROR`: `KSPROPERTY_QUALITY` = 1;
public const val `KSPROPERTY_QUALITY_REPORT`: `KSPROPERTY_QUALITY` = 0;
public const val `KSPROPERTY_RAW_AVC_CMD`: `KSPROPERTY_EXTXPORT` = 10;
public typealias `KSPROPERTY_RTAUDIO` = Int;
public const val `KSPROPERTY_RTAUDIO_BUFFER`: `KSPROPERTY_RTAUDIO` = 1;
public const val `KSPROPERTY_RTAUDIO_BUFFER_WITH_NOTIFICATION`: `KSPROPERTY_RTAUDIO` = 5;
public const val `KSPROPERTY_RTAUDIO_CLOCKREGISTER`: `KSPROPERTY_RTAUDIO` = 4;
public const val `KSPROPERTY_RTAUDIO_GETPOSITIONFUNCTION`: `KSPROPERTY_RTAUDIO` = 0;
public const val `KSPROPERTY_RTAUDIO_GETREADPACKET`: `KSPROPERTY_RTAUDIO` = 11;
public const val `KSPROPERTY_RTAUDIO_HWLATENCY`: `KSPROPERTY_RTAUDIO` = 2;
public const val `KSPROPERTY_RTAUDIO_PACKETCOUNT`: `KSPROPERTY_RTAUDIO` = 9;
public const val `KSPROPERTY_RTAUDIO_PACKETVREGISTER`: `KSPROPERTY_RTAUDIO` = 13;
public const val `KSPROPERTY_RTAUDIO_POSITIONREGISTER`: `KSPROPERTY_RTAUDIO` = 3;
public const val `KSPROPERTY_RTAUDIO_PRESENTATION_POSITION`: `KSPROPERTY_RTAUDIO` = 10;
public const val `KSPROPERTY_RTAUDIO_QUERY_NOTIFICATION_SUPPORT`: `KSPROPERTY_RTAUDIO` = 8;
public const val `KSPROPERTY_RTAUDIO_REGISTER_NOTIFICATION_EVENT`: `KSPROPERTY_RTAUDIO` = 6;
public const val `KSPROPERTY_RTAUDIO_SETWRITEPACKET`: `KSPROPERTY_RTAUDIO` = 12;
public const val `KSPROPERTY_RTAUDIO_UNREGISTER_NOTIFICATION_EVENT`: `KSPROPERTY_RTAUDIO` = 7;
public const val `KSPROPERTY_RTC_READER`: `KSPROPERTY_TIMECODE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_SELECTOR_NODE_S` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 3388:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_SELECTOR_NODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_SELECTOR_NUM_SOURCES`: `KSPROPERTY_VIDCAP_SELECTOR` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_SELECTOR_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 3402:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_SELECTOR_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_SELECTOR_SOURCE_NODE_ID`: `KSPROPERTY_VIDCAP_SELECTOR` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_SERIAL` (
    public var `PropTypeSet`: `KSIDENTIFIER`,
    public var `Id`: UInt,
    public var `PropertyLength`: UInt,
)
// UNSUPPORTED Rust 3415:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_SERIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_SERIALHDR` (
    public var `PropertySet`: `windows_sys`.`core`.`GUID`,
    public var `Count`: UInt,
)
public typealias `KSPROPERTY_SOUNDDETECTOR` = Int;
public const val `KSPROPERTY_SOUNDDETECTOR_ARMED`: `KSPROPERTY_SOUNDDETECTOR` = 3;
public const val `KSPROPERTY_SOUNDDETECTOR_MATCHRESULT`: `KSPROPERTY_SOUNDDETECTOR` = 4;
public const val `KSPROPERTY_SOUNDDETECTOR_PATTERNS`: `KSPROPERTY_SOUNDDETECTOR` = 2;
public const val `KSPROPERTY_SOUNDDETECTOR_RESET`: `KSPROPERTY_SOUNDDETECTOR` = 5;
public const val `KSPROPERTY_SOUNDDETECTOR_STREAMINGSUPPORT`: `KSPROPERTY_SOUNDDETECTOR` = 6;
public const val `KSPROPERTY_SOUNDDETECTOR_SUPPORTEDPATTERNS`: `KSPROPERTY_SOUNDDETECTOR` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSPROPERTY_SPHLI` (
    public var `HLISS`: UShort,
    public var `Reserved`: UShort,
    public var `StartPTM`: UInt,
    public var `EndPTM`: UInt,
    public var `StartX`: UShort,
    public var `StartY`: UShort,
    public var `StopX`: UShort,
    public var `StopY`: UShort,
    public var `ColCon`: `KS_COLCON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_SPPAL` (
    public var `sppal`: Array<`KS_DVD_YUV`>,
)
// UNSUPPORTED Rust 3451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_SPPAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_STEPPING_LONG` (
    public var `SteppingDelta`: UInt,
    public var `Reserved`: UInt,
    public var `Bounds`: `KSPROPERTY_BOUNDS_LONG`,
)
// UNSUPPORTED Rust 3463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_STEPPING_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_STEPPING_LONGLONG` (
    public var `SteppingDelta`: ULong,
    public var `Bounds`: `KSPROPERTY_BOUNDS_LONGLONG`,
)
// UNSUPPORTED Rust 3474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_STEPPING_LONGLONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSPROPERTY_STREAM` = Int;
public typealias `KSPROPERTY_STREAMINTERFACE` = Int;
public const val `KSPROPERTY_STREAMINTERFACE_HEADERSIZE`: `KSPROPERTY_STREAMINTERFACE` = 0;
public const val `KSPROPERTY_STREAM_ALLOCATOR`: `KSPROPERTY_STREAM` = 0;
public const val `KSPROPERTY_STREAM_DEGRADATION`: `KSPROPERTY_STREAM` = 2;
public const val `KSPROPERTY_STREAM_FRAMETIME`: `KSPROPERTY_STREAM` = 7;
public const val `KSPROPERTY_STREAM_MASTERCLOCK`: `KSPROPERTY_STREAM` = 3;
public const val `KSPROPERTY_STREAM_PIPE_ID`: `KSPROPERTY_STREAM` = 10;
public const val `KSPROPERTY_STREAM_PRESENTATIONEXTENT`: `KSPROPERTY_STREAM` = 6;
public const val `KSPROPERTY_STREAM_PRESENTATIONTIME`: `KSPROPERTY_STREAM` = 5;
public const val `KSPROPERTY_STREAM_QUALITY`: `KSPROPERTY_STREAM` = 1;
public const val `KSPROPERTY_STREAM_RATE`: `KSPROPERTY_STREAM` = 9;
public const val `KSPROPERTY_STREAM_RATECAPABILITY`: `KSPROPERTY_STREAM` = 8;
public const val `KSPROPERTY_STREAM_TIMEFORMAT`: `KSPROPERTY_STREAM` = 4;
public const val `KSPROPERTY_TELEPHONY_CALLCONTROL`: `KSPROPERTY_TELEPHONY_CONTROL` = 2;
public const val `KSPROPERTY_TELEPHONY_CALLHOLD`: `KSPROPERTY_TELEPHONY_CONTROL` = 4;
public const val `KSPROPERTY_TELEPHONY_CALLINFO`: `KSPROPERTY_TELEPHONY_CONTROL` = 1;
public typealias `KSPROPERTY_TELEPHONY_CONTROL` = Int;
public const val `KSPROPERTY_TELEPHONY_ENDPOINTIDPAIR`: `KSPROPERTY_TELEPHONY_TOPOLOGY` = 0;
public const val `KSPROPERTY_TELEPHONY_MUTE_TX`: `KSPROPERTY_TELEPHONY_CONTROL` = 5;
public const val `KSPROPERTY_TELEPHONY_PROVIDERCHANGE`: `KSPROPERTY_TELEPHONY_CONTROL` = 3;
public const val `KSPROPERTY_TELEPHONY_PROVIDERID`: `KSPROPERTY_TELEPHONY_CONTROL` = 0;
public typealias `KSPROPERTY_TELEPHONY_TOPOLOGY` = Int;
public const val `KSPROPERTY_TELEPHONY_VOLUME`: `KSPROPERTY_TELEPHONY_TOPOLOGY` = 1;
public typealias `KSPROPERTY_TIMECODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TIMECODE_NODE_S` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `TimecodeSamp`: `super`.`TIMECODE_SAMPLE`,
)
// UNSUPPORTED Rust 3510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TIMECODE_NODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TIMECODE_READER`: `KSPROPERTY_TIMECODE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TIMECODE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `TimecodeSamp`: `super`.`TIMECODE_SAMPLE`,
)
// UNSUPPORTED Rust 3522:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TIMECODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSPROPERTY_TOPOLOGY` = Int;
public typealias `KSPROPERTY_TOPOLOGYNODE` = Int;
public const val `KSPROPERTY_TOPOLOGYNODE_ENABLE`: `KSPROPERTY_TOPOLOGYNODE` = 1;
public const val `KSPROPERTY_TOPOLOGYNODE_RESET`: `KSPROPERTY_TOPOLOGYNODE` = 2;
public const val `KSPROPERTY_TOPOLOGY_CATEGORIES`: `KSPROPERTY_TOPOLOGY` = 0;
public const val `KSPROPERTY_TOPOLOGY_CONNECTIONS`: `KSPROPERTY_TOPOLOGY` = 2;
public const val `KSPROPERTY_TOPOLOGY_NAME`: `KSPROPERTY_TOPOLOGY` = 3;
public const val `KSPROPERTY_TOPOLOGY_NODES`: `KSPROPERTY_TOPOLOGY` = 1;
public typealias `KSPROPERTY_TUNER` = Int;
public const val `KSPROPERTY_TUNER_CAPS`: `KSPROPERTY_TUNER` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `ModesSupported`: UInt,
    public var `VideoMedium`: `KSIDENTIFIER`,
    public var `TVAudioMedium`: `KSIDENTIFIER`,
    public var `RadioAudioMedium`: `KSIDENTIFIER`,
)
// UNSUPPORTED Rust 3546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_FREQUENCY`: `KSPROPERTY_TUNER` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_FREQUENCY_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Frequency`: UInt,
    public var `LastFrequency`: UInt,
    public var `TuningFlags`: UInt,
    public var `VideoSubChannel`: UInt,
    public var `AudioSubChannel`: UInt,
    public var `Channel`: UInt,
    public var `Country`: UInt,
)
// UNSUPPORTED Rust 3564:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_FREQUENCY_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_IF_MEDIUM`: `KSPROPERTY_TUNER` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_IF_MEDIUM_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `IFMedium`: `KSIDENTIFIER`,
)
// UNSUPPORTED Rust 3576:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_IF_MEDIUM_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_INPUT`: `KSPROPERTY_TUNER` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_INPUT_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `InputIndex`: UInt,
)
// UNSUPPORTED Rust 3588:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_INPUT_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_MODE`: `KSPROPERTY_TUNER` = 2;
public typealias `KSPROPERTY_TUNER_MODES` = Int;
public const val `KSPROPERTY_TUNER_MODE_AM_RADIO`: `KSPROPERTY_TUNER_MODES` = 4;
public const val `KSPROPERTY_TUNER_MODE_ATSC`: `KSPROPERTY_TUNER_MODES` = 16;
public const val `KSPROPERTY_TUNER_MODE_CAPS`: `KSPROPERTY_TUNER` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_MODE_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Mode`: UInt,
    public var `StandardsSupported`: UInt,
    public var `MinFrequency`: UInt,
    public var `MaxFrequency`: UInt,
    public var `TuningGranularity`: UInt,
    public var `NumberOfInputs`: UInt,
    public var `SettlingTime`: UInt,
    public var `Strategy`: UInt,
)
// UNSUPPORTED Rust 3611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_MODE_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_MODE_DSS`: `KSPROPERTY_TUNER_MODES` = 8;
public const val `KSPROPERTY_TUNER_MODE_FM_RADIO`: `KSPROPERTY_TUNER_MODES` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_MODE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Mode`: UInt,
)
// UNSUPPORTED Rust 3624:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_MODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_MODE_TV`: `KSPROPERTY_TUNER_MODES` = 1;
public const val `KSPROPERTY_TUNER_NETWORKTYPE_SCAN_CAPS`: `KSPROPERTY_TUNER` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_NETWORKTYPE_SCAN_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NetworkType`: `windows_sys`.`core`.`GUID`,
    public var `BufferSize`: UInt,
    public var `NetworkTunerCapabilities`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_NETWORKTYPE_SCAN_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_SCAN_CAPS`: `KSPROPERTY_TUNER` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_SCAN_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `fSupportsHardwareAssistedScanning`: `windows_sys`.`core`.`BOOL`,
    public var `SupportedBroadcastStandards`: UInt,
    public var `GUIDBucket`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lengthofBucket`: UInt,
)
// UNSUPPORTED Rust 3654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_SCAN_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_SCAN_STATUS`: `KSPROPERTY_TUNER` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_SCAN_STATUS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `LockStatus`: `TunerLockType`,
    public var `CurrentFrequency`: UInt,
)
// UNSUPPORTED Rust 3667:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_SCAN_STATUS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_STANDARD`: `KSPROPERTY_TUNER` = 3;
public const val `KSPROPERTY_TUNER_STANDARD_MODE`: `KSPROPERTY_TUNER` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_STANDARD_MODE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `AutoDetect`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3680:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_STANDARD_MODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_STANDARD_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Standard`: UInt,
)
// UNSUPPORTED Rust 3691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_STANDARD_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TUNER_STATUS`: `KSPROPERTY_TUNER` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TUNER_STATUS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `CurrentFrequency`: UInt,
    public var `PLLOffset`: UInt,
    public var `SignalStrength`: UInt,
    public var `Busy`: UInt,
)
// UNSUPPORTED Rust 3706:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TUNER_STATUS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TVAUDIO_CAPS`: `KSPROPERTY_VIDCAP_TVAUDIO` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TVAUDIO_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Capabilities`: UInt,
    public var `InputMedium`: `KSIDENTIFIER`,
    public var `OutputMedium`: `KSIDENTIFIER`,
)
// UNSUPPORTED Rust 3720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TVAUDIO_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TVAUDIO_CURRENTLY_AVAILABLE_MODES`: `KSPROPERTY_VIDCAP_TVAUDIO` = 2;
public const val `KSPROPERTY_TVAUDIO_MODE`: `KSPROPERTY_VIDCAP_TVAUDIO` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_TVAUDIO_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Mode`: UInt,
)
// UNSUPPORTED Rust 3733:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_TVAUDIO_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_TYPE_BASICSUPPORT`: UInt = 512u;
public const val `KSPROPERTY_TYPE_COPYPAYLOAD`: UInt = 2147483648u;
public const val `KSPROPERTY_TYPE_DEFAULTVALUES`: UInt = 65536u;
public const val `KSPROPERTY_TYPE_FSFILTERSCOPE`: UInt = 1073741824u;
public const val `KSPROPERTY_TYPE_GET`: UInt = 1u;
public const val `KSPROPERTY_TYPE_GETPAYLOADSIZE`: UInt = 4u;
public const val `KSPROPERTY_TYPE_HIGHPRIORITY`: UInt = 134217728u;
public const val `KSPROPERTY_TYPE_RELATIONS`: UInt = 1024u;
public const val `KSPROPERTY_TYPE_SERIALIZERAW`: UInt = 8192u;
public const val `KSPROPERTY_TYPE_SERIALIZESET`: UInt = 2048u;
public const val `KSPROPERTY_TYPE_SERIALIZESIZE`: UInt = 32768u;
public const val `KSPROPERTY_TYPE_SET`: UInt = 2u;
public const val `KSPROPERTY_TYPE_SETSUPPORT`: UInt = 256u;
public const val `KSPROPERTY_TYPE_TOPOLOGY`: UInt = 268435456u;
public const val `KSPROPERTY_TYPE_UNSERIALIZERAW`: UInt = 16384u;
public const val `KSPROPERTY_TYPE_UNSERIALIZESET`: UInt = 4096u;
public typealias `KSPROPERTY_VBICAP` = Int;
public const val `KSPROPERTY_VBICAP_PROPERTIES_PROTECTION`: `KSPROPERTY_VBICAP` = 1;
public typealias `KSPROPERTY_VBICODECFILTERING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_CC_SUBSTREAMS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Substreams`: `VBICODECFILTERING_CC_SUBSTREAMS`,
)
// UNSUPPORTED Rust 3763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_CC_SUBSTREAMS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_NABTS_SUBSTREAMS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Substreams`: `VBICODECFILTERING_NABTS_SUBSTREAMS`,
)
// UNSUPPORTED Rust 3774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_NABTS_SUBSTREAMS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VBICODECFILTERING_SCANLINES_DISCOVERED_BIT_ARRAY`: `KSPROPERTY_VBICODECFILTERING` = 2;
public const val `KSPROPERTY_VBICODECFILTERING_SCANLINES_REQUESTED_BIT_ARRAY`: `KSPROPERTY_VBICODECFILTERING` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_SCANLINES_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Scanlines`: `VBICODECFILTERING_SCANLINES`,
)
// UNSUPPORTED Rust 3787:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_SCANLINES_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VBICODECFILTERING_STATISTICS`: `KSPROPERTY_VBICODECFILTERING` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_PIN_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_CC_PIN`,
)
// UNSUPPORTED Rust 3799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_PIN_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_CC`,
)
// UNSUPPORTED Rust 3810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_PIN_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_COMMON_PIN`,
)
// UNSUPPORTED Rust 3821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_PIN_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_COMMON`,
)
// UNSUPPORTED Rust 3832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_PIN_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_NABTS_PIN`,
)
// UNSUPPORTED Rust 3843:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_PIN_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Statistics`: `VBICODECFILTERING_STATISTICS_NABTS`,
)
// UNSUPPORTED Rust 3854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VBICODECFILTERING_SUBSTREAMS_DISCOVERED_BIT_ARRAY`: `KSPROPERTY_VBICODECFILTERING` = 4;
public const val `KSPROPERTY_VBICODECFILTERING_SUBSTREAMS_REQUESTED_BIT_ARRAY`: `KSPROPERTY_VBICODECFILTERING` = 3;
public typealias `KSPROPERTY_VIDCAP_CAMERACONTROL` = Int;
public typealias `KSPROPERTY_VIDCAP_CROSSBAR` = Int;
public typealias `KSPROPERTY_VIDCAP_DROPPEDFRAMES` = Int;
public typealias `KSPROPERTY_VIDCAP_SELECTOR` = Int;
public typealias `KSPROPERTY_VIDCAP_TVAUDIO` = Int;
public typealias `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = Int;
public typealias `KSPROPERTY_VIDCAP_VIDEOCONTROL` = Int;
public typealias `KSPROPERTY_VIDCAP_VIDEODECODER` = Int;
public typealias `KSPROPERTY_VIDCAP_VIDEOENCODER` = Int;
public typealias `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = Int;
public const val `KSPROPERTY_VIDEOCOMPRESSION_GETINFO`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCOMPRESSION_GETINFO_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `DefaultKeyFrameRate`: Int,
    public var `DefaultPFrameRate`: Int,
    public var `DefaultQuality`: Int,
    public var `NumberOfQualitySettings`: Int,
    public var `Capabilities`: Int,
)
// UNSUPPORTED Rust 3883:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCOMPRESSION_GETINFO_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOCOMPRESSION_KEYFRAME_RATE`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 1;
public const val `KSPROPERTY_VIDEOCOMPRESSION_OVERRIDE_FRAME_SIZE`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 5;
public const val `KSPROPERTY_VIDEOCOMPRESSION_OVERRIDE_KEYFRAME`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 4;
public const val `KSPROPERTY_VIDEOCOMPRESSION_PFRAMES_PER_KEYFRAME`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 2;
public const val `KSPROPERTY_VIDEOCOMPRESSION_QUALITY`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCOMPRESSION_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `Value`: Int,
)
// UNSUPPORTED Rust 3900:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCOMPRESSION_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCOMPRESSION_S1` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `Value`: Int,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 3913:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCOMPRESSION_S1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOCOMPRESSION_WINDOWSIZE`: `KSPROPERTY_VIDCAP_VIDEOCOMPRESSION` = 6;
public const val `KSPROPERTY_VIDEOCONTROL_ACTUAL_FRAME_RATE`: `KSPROPERTY_VIDCAP_VIDEOCONTROL` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCONTROL_ACTUAL_FRAME_RATE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `RangeIndex`: UInt,
    public var `Dimensions`: `super`.`super`.`Foundation`.`SIZE`,
    public var `CurrentActualFrameRate`: Long,
    public var `CurrentMaxAvailableFrameRate`: Long,
)
// UNSUPPORTED Rust 3930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCONTROL_ACTUAL_FRAME_RATE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOCONTROL_CAPS`: `KSPROPERTY_VIDCAP_VIDEOCONTROL` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCONTROL_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `VideoControlCaps`: UInt,
)
// UNSUPPORTED Rust 3943:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCONTROL_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOCONTROL_FRAME_RATES`: `KSPROPERTY_VIDCAP_VIDEOCONTROL` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCONTROL_FRAME_RATES_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `RangeIndex`: UInt,
    public var `Dimensions`: `super`.`super`.`Foundation`.`SIZE`,
)
// UNSUPPORTED Rust 3957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCONTROL_FRAME_RATES_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOCONTROL_MODE`: `KSPROPERTY_VIDCAP_VIDEOCONTROL` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOCONTROL_MODE_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `Mode`: Int,
)
// UNSUPPORTED Rust 3970:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOCONTROL_MODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEODECODER_CAPS`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEODECODER_CAPS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StandardsSupported`: UInt,
    public var `Capabilities`: UInt,
    public var `SettlingTime`: UInt,
    public var `HSyncPerVSync`: UInt,
)
// UNSUPPORTED Rust 3985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEODECODER_CAPS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEODECODER_OUTPUT_ENABLE`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEODECODER_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: UInt,
)
// UNSUPPORTED Rust 3997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEODECODER_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEODECODER_STANDARD`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 1;
public const val `KSPROPERTY_VIDEODECODER_STATUS`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 2;
public const val `KSPROPERTY_VIDEODECODER_STATUS2`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEODECODER_STATUS2_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NumberOfLines`: UInt,
    public var `SignalLocked`: UInt,
    public var `ChromaLock`: UInt,
)
// UNSUPPORTED Rust 4013:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEODECODER_STATUS2_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEODECODER_STATUS_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NumberOfLines`: UInt,
    public var `SignalLocked`: UInt,
)
// UNSUPPORTED Rust 4025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEODECODER_STATUS_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEODECODER_VCR_TIMING`: `KSPROPERTY_VIDCAP_VIDEODECODER` = 4;
public const val `KSPROPERTY_VIDEOENCODER_CAPS`: `KSPROPERTY_VIDCAP_VIDEOENCODER` = 0;
public const val `KSPROPERTY_VIDEOENCODER_CC_ENABLE`: `KSPROPERTY_VIDCAP_VIDEOENCODER` = 3;
public const val `KSPROPERTY_VIDEOENCODER_COPYPROTECTION`: `KSPROPERTY_VIDCAP_VIDEOENCODER` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOENCODER_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 4042:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOENCODER_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOENCODER_STANDARD`: `KSPROPERTY_VIDCAP_VIDEOENCODER` = 1;
public const val `KSPROPERTY_VIDEOPROCAMP_BACKLIGHT_COMPENSATION`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 8;
public const val `KSPROPERTY_VIDEOPROCAMP_BRIGHTNESS`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 0;
public const val `KSPROPERTY_VIDEOPROCAMP_COLORENABLE`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 6;
public const val `KSPROPERTY_VIDEOPROCAMP_CONTRAST`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 1;
public const val `KSPROPERTY_VIDEOPROCAMP_DIGITAL_MULTIPLIER`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 10;
public const val `KSPROPERTY_VIDEOPROCAMP_DIGITAL_MULTIPLIER_LIMIT`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 11;
public const val `KSPROPERTY_VIDEOPROCAMP_FLAGS_AUTO`: Int = 1;
public const val `KSPROPERTY_VIDEOPROCAMP_FLAGS_MANUAL`: Int = 2;
public const val `KSPROPERTY_VIDEOPROCAMP_GAIN`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 9;
public const val `KSPROPERTY_VIDEOPROCAMP_GAMMA`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 5;
public const val `KSPROPERTY_VIDEOPROCAMP_HUE`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOPROCAMP_NODE_S` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 4067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOPROCAMP_NODE_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOPROCAMP_NODE_S2` (
    public var `NodeProperty`: `KSP_NODE`,
    public var `Value1`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
    public var `Value2`: Int,
)
// UNSUPPORTED Rust 4081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOPROCAMP_NODE_S2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOPROCAMP_POWERLINE_FREQUENCY`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOPROCAMP_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
)
// UNSUPPORTED Rust 4095:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOPROCAMP_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSPROPERTY_VIDEOPROCAMP_S2` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Value1`: Int,
    public var `Flags`: UInt,
    public var `Capabilities`: UInt,
    public var `Value2`: Int,
)
// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSPROPERTY_VIDEOPROCAMP_S2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSPROPERTY_VIDEOPROCAMP_SATURATION`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 3;
public const val `KSPROPERTY_VIDEOPROCAMP_SHARPNESS`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 4;
public const val `KSPROPERTY_VIDEOPROCAMP_WHITEBALANCE`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 7;
public const val `KSPROPERTY_VIDEOPROCAMP_WHITEBALANCE_COMPONENT`: `KSPROPERTY_VIDCAP_VIDEOPROCAMP` = 12;
public typealias `KSPROPERTY_VIDMEM_TRANSPORT` = Int;
public typealias `KSPROPERTY_VPCONFIG` = Int;
public const val `KSPROPERTY_VPCONFIG_DDRAWHANDLE`: `KSPROPERTY_VPCONFIG` = 12;
public const val `KSPROPERTY_VPCONFIG_DDRAWSURFACEHANDLE`: `KSPROPERTY_VPCONFIG` = 14;
public const val `KSPROPERTY_VPCONFIG_DECIMATIONCAPABILITY`: `KSPROPERTY_VPCONFIG` = 10;
public const val `KSPROPERTY_VPCONFIG_GETCONNECTINFO`: `KSPROPERTY_VPCONFIG` = 1;
public const val `KSPROPERTY_VPCONFIG_GETVIDEOFORMAT`: `KSPROPERTY_VPCONFIG` = 7;
public const val `KSPROPERTY_VPCONFIG_INFORMVPINPUT`: `KSPROPERTY_VPCONFIG` = 5;
public const val `KSPROPERTY_VPCONFIG_INVERTPOLARITY`: `KSPROPERTY_VPCONFIG` = 9;
public const val `KSPROPERTY_VPCONFIG_MAXPIXELRATE`: `KSPROPERTY_VPCONFIG` = 4;
public const val `KSPROPERTY_VPCONFIG_NUMCONNECTINFO`: `KSPROPERTY_VPCONFIG` = 0;
public const val `KSPROPERTY_VPCONFIG_NUMVIDEOFORMAT`: `KSPROPERTY_VPCONFIG` = 6;
public const val `KSPROPERTY_VPCONFIG_SCALEFACTOR`: `KSPROPERTY_VPCONFIG` = 11;
public const val `KSPROPERTY_VPCONFIG_SETCONNECTINFO`: `KSPROPERTY_VPCONFIG` = 2;
public const val `KSPROPERTY_VPCONFIG_SETVIDEOFORMAT`: `KSPROPERTY_VPCONFIG` = 8;
public const val `KSPROPERTY_VPCONFIG_SURFACEPARAMS`: `KSPROPERTY_VPCONFIG` = 15;
public const val `KSPROPERTY_VPCONFIG_VIDEOPORTID`: `KSPROPERTY_VPCONFIG` = 13;
public const val `KSPROPERTY_VPCONFIG_VPDATAINFO`: `KSPROPERTY_VPCONFIG` = 3;
public typealias `KSPROPERTY_WAVE` = Int;
public const val `KSPROPERTY_WAVE_BUFFER`: `KSPROPERTY_WAVE` = 3;
public const val `KSPROPERTY_WAVE_COMPATIBLE_CAPABILITIES`: `KSPROPERTY_WAVE` = 0;
public const val `KSPROPERTY_WAVE_FREQUENCY`: `KSPROPERTY_WAVE` = 4;
public const val `KSPROPERTY_WAVE_INPUT_CAPABILITIES`: `KSPROPERTY_WAVE` = 1;
public const val `KSPROPERTY_WAVE_OUTPUT_CAPABILITIES`: `KSPROPERTY_WAVE` = 2;
public const val `KSPROPERTY_WAVE_PAN`: `KSPROPERTY_WAVE` = 6;
public const val `KSPROPERTY_WAVE_QUEUED_POSITION`: UInt = 1u;
public const val `KSPROPERTY_WAVE_VOLUME`: `KSPROPERTY_WAVE` = 5;
// UNSUPPORTED Rust 4145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AC3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfabe720_6e1f_11d0_bcf2_444553540000);

// UNSUPPORTED Rust 4146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Audio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45ffaaa0_6e1b_11d0_bcf2_444553540000);

// UNSUPPORTED Rust 4147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioBufferDuration: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e73c07f_23cc_4955_a7ea_3da502496290);

// UNSUPPORTED Rust 4148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioDecoderOut: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ca6e020_43bd_11d0_bd6a_003505c103a9);

// UNSUPPORTED Rust 4149:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioEngine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a2f82dc_886f_4baa_9eb4_082b9025c536);

// UNSUPPORTED Rust 4150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioModule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc034fdb0_ff75_47c8_aa3c_ee46716b50c6);

// UNSUPPORTED Rust 4151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioPosture: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3fb7b0d_474e_4f51_a379_51282dd4fa8f);

// UNSUPPORTED Rust 4152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioResourceManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd0b305e1_b2cc_484c_8f23_e5d28ad9cf88);

// UNSUPPORTED Rust 4153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_AudioSignalProcessing: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f67b528_30c9_40de_b2fb_859ddd1f3470);

// UNSUPPORTED Rust 4154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Bibliographic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07ba150e_e2b1_11d0_ac17_00a0c9223196);

// UNSUPPORTED Rust 4155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_BtAudio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fa06c40_b8f6_4c7e_8556_e8c33a12e54d);

// UNSUPPORTED Rust 4156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Clock: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf12a4c0_ac17_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 4157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Connection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d58c920_ac9b_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 4158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_CopyProt: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e8a0a40_6aef_11d0_9ed0_00a024ca19b3);

// UNSUPPORTED Rust 4159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Cyclic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ffeaea0_2bee_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 4160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_DirectSound3DBuffer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x437b3411_d060_11d0_8583_00c04fd9baf3);

// UNSUPPORTED Rust 4161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_DirectSound3DListener: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x437b3414_d060_11d0_8583_00c04fd9baf3);

// UNSUPPORTED Rust 4162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_DrmAudioStream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2f2c8ddd_4198_4fac_ba29_61bb05b7de06);

// UNSUPPORTED Rust 4163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_DvdSubPic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xac390460_43af_11d0_bd6a_003505c103a9);

// UNSUPPORTED Rust 4164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_FMRXControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x947bba3a_e8ee_4786_90c4_8428185f05be);

// UNSUPPORTED Rust 4165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_FMRXTopology: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c46ce8f_dc2d_4204_9dc9_f58963366563);

// UNSUPPORTED Rust 4166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_General: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1464eda5_6a8f_11d1_9aa7_00a0c9223196);

// UNSUPPORTED Rust 4167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Hrtf3d: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb66decb0_a083_11d0_851e_00c04fd9baf3);

// UNSUPPORTED Rust 4168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_InterleavedAudio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe9ebe550_d619_4c0a_976b_7062322b3006);

// UNSUPPORTED Rust 4169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Itd3d: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6429f090_9fd9_11d0_a75b_00a0c90365e3);

// UNSUPPORTED Rust 4170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Jack: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4509f757_2d46_4637_8e62_ce7db944f57b);

// UNSUPPORTED Rust 4171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_MPEG4_MediaType_Attributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff6c4bfa_07a9_4c7b_a237_672f9d68065f);

// UNSUPPORTED Rust 4172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_MediaSeeking: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xee904f0c_d09b_11d0_abe9_00a0c9223196);

// UNSUPPORTED Rust 4173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_MemoryTransport: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a3d1c5d_5243_4819_9ed0_aee8044cee2b);

// UNSUPPORTED Rust 4174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Mpeg2Vid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8e11b60_0cc9_11d0_bd69_003505c103a9);

// UNSUPPORTED Rust 4175:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_OverlayUpdate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x490ea5cf_7681_11d1_a21c_00a0c9223196);

// UNSUPPORTED Rust 4176:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Pin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c134960_51ad_11cf_878a_94f801c10000);

// UNSUPPORTED Rust 4177:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_PinMDLCacheClearProp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd718a7b_97fc_40c7_88ce_d3ff06f55b16);

// UNSUPPORTED Rust 4178:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Quality: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd16ad380_ac1a_11cf_a5d6_28db04c10000);

// UNSUPPORTED Rust 4179:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_RtAudio: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa855a48c_2f78_4729_9051_1968746b9eef);

// UNSUPPORTED Rust 4180:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_SoundDetector: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x113c425e_fd17_4057_b422_ed4074f1afdf);

// UNSUPPORTED Rust 4181:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_SoundDetector2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfe07e322_450c_4bd5_84ca_a948500ea6aa);

// UNSUPPORTED Rust 4182:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Stream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65aaba60_98ae_11cf_a10d_0020afd156e4);

// UNSUPPORTED Rust 4183:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_StreamAllocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf6e4342_ec87_11cf_a130_0020afd156e4);

// UNSUPPORTED Rust 4184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_StreamInterface: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1fdd8ee1_9cd3_11d0_82aa_0000f822fe8a);

// UNSUPPORTED Rust 4185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_TSRateChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa503c5c0_1d1d_11d1_ad80_444553540000);

// UNSUPPORTED Rust 4186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_TelephonyControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb6df7eb1_d099_489f_a6a0_c0106f0887a7);

// UNSUPPORTED Rust 4187:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_TelephonyTopology: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabf25c7e_0e64_4e32_b190_d0f6d7c53e97);

// UNSUPPORTED Rust 4188:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Topology: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x720d4ac0_7533_11d0_a5d6_28db04c10000);

// UNSUPPORTED Rust 4189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_TopologyNode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45ffaaa1_6e1b_11d0_bcf2_444553540000);

// UNSUPPORTED Rust 4190:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_VBICAP_PROPERTIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf162c607_7b35_496f_ad7f_2dca3b46b718);

// UNSUPPORTED Rust 4191:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_VBICodecFiltering: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcafeb0ca_8715_11d0_bd6a_0035c0edbabe);

// UNSUPPORTED Rust 4192:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_VPConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc29a660_30e3_11d0_9e69_00c04fd7c15b);

// UNSUPPORTED Rust 4193:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_VPVBIConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec529b00_1a1f_11d1_bad9_00609744111a);

// UNSUPPORTED Rust 4194:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_VramCapture: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe73face3_2880_4902_b799_88d0cd634e0f);

// UNSUPPORTED Rust 4195:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPSETID_Wave: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x924e54b0_630f_11cf_ada7_08003e30494a);

// UNSUPPORTED Rust 4196:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSPROPTYPESETID_General: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97e99ba0_bdea_11cf_a5d6_28db04c10000);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSP_NODE` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NodeId`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSP_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSP_PIN` (
    public var `Property`: `KSIDENTIFIER`,
    public var `PinId`: UInt,
    public var `Anonymous`: `KSP_PIN_0`,
)
// UNSUPPORTED Rust 4216:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSP_PIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4221:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSP_PIN_0 {
//     pub Reserved: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 4227:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSP_PIN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSP_TIMEFORMAT` (
    public var `Property`: `KSIDENTIFIER`,
    public var `SourceFormat`: `windows_sys`.`core`.`GUID`,
    public var `TargetFormat`: `windows_sys`.`core`.`GUID`,
    public var `Time`: Long,
)
// UNSUPPORTED Rust 4240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSP_TIMEFORMAT {
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
public class `KSQUALITY` (
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Proportion`: UInt,
    public var `DeltaTime`: Long,
)
// UNSUPPORTED Rust 4252:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSQUALITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSQUALITY_MANAGER` (
    public var `QualityManager`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSQUALITY_MANAGER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSQUERYBUFFER` (
    public var `Event`: `KSIDENTIFIER`,
    public var `EventData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KSEVENTDATA`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4275:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSQUERYBUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRATE` (
    public var `PresentationStart`: Long,
    public var `Duration`: Long,
    public var `Interface`: `KSIDENTIFIER`,
    public var `Rate`: Int,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 4289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRATE_CAPABILITY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Rate`: `KSRATE`,
)
// UNSUPPORTED Rust 4300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRATE_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSRATE_NOPRESENTATIONDURATION`: UInt = 2u;
public const val `KSRATE_NOPRESENTATIONSTART`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRELATIVEEVENT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Anonymous`: `KSRELATIVEEVENT_0`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Event`: `KSIDENTIFIER`,
    public var `EventData`: `KSEVENTDATA`,
)
// UNSUPPORTED Rust 4317:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRELATIVEEVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4322:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSRELATIVEEVENT_0 {
//     pub ObjectHandle: super::super::Foundation::HANDLE,
//     pub ObjectPointer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRELATIVEEVENT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSRELATIVEEVENT_FLAG_HANDLE`: UInt = 1u;
public const val `KSRELATIVEEVENT_FLAG_POINTER`: UInt = 2u;
public typealias `KSRESET` = Int;
public const val `KSRESET_BEGIN`: `KSRESET` = 0;
public const val `KSRESET_END`: `KSRESET` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRESOLUTION` (
    public var `Granularity`: Long,
    public var `Error`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_BUFFER` (
    public var `BufferAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ActualBufferSize`: UInt,
    public var `CallMemoryBarrier`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 4351:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRTAUDIO_BUFFER32` (
    public var `BufferAddress`: UInt,
    public var `ActualBufferSize`: UInt,
    public var `CallMemoryBarrier`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_BUFFER_PROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `RequestedBufferSize`: UInt,
)
// UNSUPPORTED Rust 4370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_BUFFER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_BUFFER_PROPERTY32` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: UInt,
    public var `RequestedBufferSize`: UInt,
)
// UNSUPPORTED Rust 4382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_BUFFER_PROPERTY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `RequestedBufferSize`: UInt,
    public var `NotificationCount`: UInt,
)
// UNSUPPORTED Rust 4395:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION32` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: UInt,
    public var `RequestedBufferSize`: UInt,
    public var `NotificationCount`: UInt,
)
// UNSUPPORTED Rust 4408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRTAUDIO_GETREADPACKET_INFO` (
    public var `PacketNumber`: UInt,
    public var `Flags`: UInt,
    public var `PerformanceCounterValue`: ULong,
    public var `MoreData`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRTAUDIO_HWLATENCY` (
    public var `FifoSize`: UInt,
    public var `ChipsetDelay`: UInt,
    public var `CodecDelay`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_HWREGISTER` (
    public var `Register`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Width`: UInt,
    public var `Numerator`: ULong,
    public var `Denominator`: ULong,
    public var `Accuracy`: UInt,
)
// UNSUPPORTED Rust 4437:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_HWREGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRTAUDIO_HWREGISTER32` (
    public var `Register`: UInt,
    public var `Width`: UInt,
    public var `Numerator`: ULong,
    public var `Denominator`: ULong,
    public var `Accuracy`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_HWREGISTER_PROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_HWREGISTER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_HWREGISTER_PROPERTY32` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: UInt,
)
// UNSUPPORTED Rust 4468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_HWREGISTER_PROPERTY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NotificationEvent`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 4479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY32` (
    public var `Property`: `KSIDENTIFIER`,
    public var `NotificationEvent`: UInt,
)
// UNSUPPORTED Rust 4490:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_PACKETVREGISTER` (
    public var `CompletedPacketCount`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `CompletedPacketQPC`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `CompletedPacketHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
)
// UNSUPPORTED Rust 4502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_PACKETVREGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSRTAUDIO_PACKETVREGISTER_PROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSRTAUDIO_PACKETVREGISTER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSRTAUDIO_SETWRITEPACKET_INFO` (
    public var `PacketNumber`: UInt,
    public var `Flags`: UInt,
    public var `EosPacketLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSOUNDDETECTORPROPERTY` (
    public var `Property`: `KSIDENTIFIER`,
    public var `EventId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 4531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSOUNDDETECTORPROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KSSTATE` = Int;
public const val `KSSTATE_ACQUIRE`: `KSSTATE` = 1;
public const val `KSSTATE_PAUSE`: `KSSTATE` = 2;
public const val `KSSTATE_RUN`: `KSSTATE` = 3;
public const val `KSSTATE_STOP`: `KSSTATE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAMALLOCATOR_STATUS` (
    public var `Framing`: `KSALLOCATOR_FRAMING`,
    public var `AllocatedFrames`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAMALLOCATOR_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAMALLOCATOR_STATUS_EX` (
    public var `Framing`: `KSALLOCATOR_FRAMING_EX`,
    public var `AllocatedFrames`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4560:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAMALLOCATOR_STATUS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSSTREAM_FAILUREEXCEPTION`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_HEADER` (
    public var `Size`: UInt,
    public var `TypeSpecificFlags`: UInt,
    public var `PresentationTime`: `KSTIME`,
    public var `Duration`: Long,
    public var `FrameExtent`: UInt,
    public var `DataUsed`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OptionsFlags`: UInt,
)
// UNSUPPORTED Rust 4579:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for KSSTREAM_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_HEADER` (
    public var `Size`: UInt,
    public var `TypeSpecificFlags`: UInt,
    public var `PresentationTime`: `KSTIME`,
    public var `Duration`: Long,
    public var `FrameExtent`: UInt,
    public var `DataUsed`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OptionsFlags`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4599:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KSSTREAM_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSSTREAM_HEADER_OPTIONSF_BUFFEREDTRANSFER`: UInt = 1024u;
public const val `KSSTREAM_HEADER_OPTIONSF_DATADISCONTINUITY`: UInt = 4u;
public const val `KSSTREAM_HEADER_OPTIONSF_DURATIONVALID`: UInt = 256u;
public const val `KSSTREAM_HEADER_OPTIONSF_ENDOFPHOTOSEQUENCE`: UInt = 8192u;
public const val `KSSTREAM_HEADER_OPTIONSF_ENDOFSTREAM`: UInt = 512u;
public const val `KSSTREAM_HEADER_OPTIONSF_FLUSHONPAUSE`: UInt = 128u;
public const val `KSSTREAM_HEADER_OPTIONSF_FRAMEINFO`: UInt = 16384u;
public const val `KSSTREAM_HEADER_OPTIONSF_LOOPEDDATA`: UInt = 2147483648u;
public const val `KSSTREAM_HEADER_OPTIONSF_METADATA`: UInt = 4096u;
public const val `KSSTREAM_HEADER_OPTIONSF_PERSIST_SAMPLE`: UInt = 32768u;
public const val `KSSTREAM_HEADER_OPTIONSF_PREROLL`: UInt = 2u;
public const val `KSSTREAM_HEADER_OPTIONSF_SAMPLE_PERSISTED`: UInt = 65536u;
public const val `KSSTREAM_HEADER_OPTIONSF_SECUREBUFFERTRANSFER`: UInt = 262144u;
public const val `KSSTREAM_HEADER_OPTIONSF_SPLICEPOINT`: UInt = 1u;
public const val `KSSTREAM_HEADER_OPTIONSF_TIMEDISCONTINUITY`: UInt = 64u;
public const val `KSSTREAM_HEADER_OPTIONSF_TIMEVALID`: UInt = 16u;
public const val `KSSTREAM_HEADER_OPTIONSF_TYPECHANGED`: UInt = 8u;
public const val `KSSTREAM_HEADER_OPTIONSF_VRAM_DATA_TRANSFER`: UInt = 2048u;
public const val `KSSTREAM_HEADER_TRACK_COMPLETION_NUMBERS`: UInt = 131072u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_METADATA_INFO` (
    public var `BufferSize`: UInt,
    public var `UsedSize`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SystemVa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAM_METADATA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSSTREAM_NONPAGED_DATA`: UInt = 256u;
public const val `KSSTREAM_PAGED_DATA`: UInt = 0u;
public const val `KSSTREAM_READ`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_SEGMENT` (
    public var `KsInterfaceHandler`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `KsDataTypeHandler`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `IoOperation`: `KSIOOPERATION`,
    public var `CompletionEvent`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 4650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAM_SEGMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSSTREAM_SYNCHRONOUS`: UInt = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_UVC_METADATA` (
    public var `StartOfFrameTimestamp`: `KSSTREAM_UVC_METADATATYPE_TIMESTAMP`,
    public var `EndOfFrameTimestamp`: `KSSTREAM_UVC_METADATATYPE_TIMESTAMP`,
)
// UNSUPPORTED Rust 4662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAM_UVC_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSSTREAM_UVC_METADATATYPE_TIMESTAMP` (
    public var `PresentationTimeStamp`: UInt,
    public var `SourceClockReference`: UInt,
    public var `Anonymous`: `KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0`,
    public var `Reserved0`: UShort,
    public var `Reserved1`: UInt,
)
// UNSUPPORTED Rust 4676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAM_UVC_METADATATYPE_TIMESTAMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4681:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0 {
//     pub Anonymous: KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0_0,
//     pub SCRToken: u16,
// }

// UNSUPPORTED Rust 4687:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0_0` (
    public var `_bitfield`: UShort,
)
public const val `KSSTREAM_UVC_SECURE_ATTRIBUTE_SIZE`: UInt = 8192u;
public const val `KSSTREAM_WRITE`: UInt = 1u;
// UNSUPPORTED Rust 4699:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_Allocator: windows_sys::core::PCWSTR = windows_sys::core::w!("{642F5D00-4791-11D0-A5D6-28DB04C10000}");

// UNSUPPORTED Rust 4700:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_AllocatorEx: windows_sys::core::PCWSTR = windows_sys::core::w!("{091BB63B-603F-11D1-B067-00A0C9062802}");

// UNSUPPORTED Rust 4701:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_Clock: windows_sys::core::PCWSTR = windows_sys::core::w!("{53172480-4791-11D0-A5D6-28DB04C10000}");

// UNSUPPORTED Rust 4702:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_Filter: windows_sys::core::PCWSTR = windows_sys::core::w!("{9B365890-165F-11D0-A195-0020AFD156E4}");

// UNSUPPORTED Rust 4703:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_Pin: windows_sys::core::PCWSTR = windows_sys::core::w!("{146F1A80-4791-11D0-A5D6-28DB04C10000}");

// UNSUPPORTED Rust 4704:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const KSSTRING_TopologyNode: windows_sys::core::PCWSTR = windows_sys::core::w!("{0621061A-EE75-11D0-B915-00A0C9223196}");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTELEPHONY_CALLCONTROL` (
    public var `CallType`: `TELEPHONY_CALLTYPE`,
    public var `CallControlOp`: `TELEPHONY_CALLCONTROLOP`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTELEPHONY_CALLINFO` (
    public var `CallType`: `TELEPHONY_CALLTYPE`,
    public var `CallState`: `TELEPHONY_CALLSTATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTELEPHONY_PROVIDERCHANGE` (
    public var `CallType`: `TELEPHONY_CALLTYPE`,
    public var `ProviderChangeOp`: `TELEPHONY_PROVIDERCHANGEOP`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTIME` (
    public var `Time`: Long,
    public var `Numerator`: UInt,
    public var `Denominator`: UInt,
)
// UNSUPPORTED Rust 4730:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSTIME_FORMAT_BYTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b785571_8c82_11cf_bc0c_00aa00ac74f6);

// UNSUPPORTED Rust 4731:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSTIME_FORMAT_FIELD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b785573_8c82_11cf_bc0c_00aa00ac74f6);

// UNSUPPORTED Rust 4732:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSTIME_FORMAT_FRAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b785570_8c82_11cf_bc0c_00aa00ac74f6);

// UNSUPPORTED Rust 4733:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSTIME_FORMAT_MEDIA_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b785574_8c82_11cf_bc0c_00aa00ac74f6);

// UNSUPPORTED Rust 4734:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KSTIME_FORMAT_SAMPLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b785572_8c82_11cf_bc0c_00aa00ac74f6);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSTOPOLOGY` (
    public var `CategoriesCount`: UInt,
    public var `Categories`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `TopologyNodesCount`: UInt,
    public var `TopologyNodes`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `TopologyConnectionsCount`: UInt,
    public var `TopologyConnections`: /* Rust *const */ kotlinx.cinterop.CPointer<`KSTOPOLOGY_CONNECTION`>?,
    public var `TopologyNodesNames`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 4747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSTOPOLOGY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTOPOLOGY_CONNECTION` (
    public var `FromNode`: UInt,
    public var `FromNodePin`: UInt,
    public var `ToNode`: UInt,
    public var `ToNodePin`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSTOPOLOGY_ENDPOINTID` (
    public var `TopologyName`: UShortArray,
    public var `PinId`: UInt,
)
// UNSUPPORTED Rust 4766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSTOPOLOGY_ENDPOINTID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSTOPOLOGY_ENDPOINTIDPAIR` (
    public var `RenderEndpoint`: `KSTOPOLOGY_ENDPOINTID`,
    public var `CaptureEndpoint`: `KSTOPOLOGY_ENDPOINTID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSVPMAXPIXELRATE` (
    public var `Size`: `KS_AMVPSIZE`,
    public var `MaxPixelsPerSecond`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSVPSIZE_PROP` (
    public var `Property`: `KSIDENTIFIER`,
    public var `Size`: `KS_AMVPSIZE`,
)
// UNSUPPORTED Rust 4790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSVPSIZE_PROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSVPSURFACEPARAMS` (
    public var `dwPitch`: UInt,
    public var `dwXOrigin`: UInt,
    public var `dwYOrigin`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSWAVETABLE_WAVE_DESC` (
    public var `Identifier`: `KSIDENTIFIER`,
    public var `Size`: UInt,
    public var `Looped`: `windows_sys`.`core`.`BOOL`,
    public var `LoopPoint`: UInt,
    public var `InROM`: `windows_sys`.`core`.`BOOL`,
    public var `Format`: `KSDATAFORMAT`,
)
// UNSUPPORTED Rust 4812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSWAVETABLE_WAVE_DESC {
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
public class `KSWAVE_BUFFER` (
    public var `Attributes`: UInt,
    public var `BufferSize`: UInt,
    public var `BufferAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KSWAVE_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSWAVE_BUFFER_ATTRIBUTEF_LOOPING`: UInt = 1u;
public const val `KSWAVE_BUFFER_ATTRIBUTEF_STATIC`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSWAVE_COMPATCAPS` (
    public var `ulDeviceType`: UInt,
)
public const val `KSWAVE_COMPATCAPS_INPUT`: UInt = 0u;
public const val `KSWAVE_COMPATCAPS_OUTPUT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSWAVE_INPUT_CAPABILITIES` (
    public var `MaximumChannelsPerConnection`: UInt,
    public var `MinimumBitsPerSample`: UInt,
    public var `MaximumBitsPerSample`: UInt,
    public var `MinimumSampleFrequency`: UInt,
    public var `MaximumSampleFrequency`: UInt,
    public var `TotalConnections`: UInt,
    public var `ActiveConnections`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSWAVE_OUTPUT_CAPABILITIES` (
    public var `MaximumChannelsPerConnection`: UInt,
    public var `MinimumBitsPerSample`: UInt,
    public var `MaximumBitsPerSample`: UInt,
    public var `MinimumSampleFrequency`: UInt,
    public var `MaximumSampleFrequency`: UInt,
    public var `TotalConnections`: UInt,
    public var `StaticConnections`: UInt,
    public var `StreamingConnections`: UInt,
    public var `ActiveConnections`: UInt,
    public var `ActiveStaticConnections`: UInt,
    public var `ActiveStreamingConnections`: UInt,
    public var `Total3DConnections`: UInt,
    public var `Static3DConnections`: UInt,
    public var `Streaming3DConnections`: UInt,
    public var `Active3DConnections`: UInt,
    public var `ActiveStatic3DConnections`: UInt,
    public var `ActiveStreaming3DConnections`: UInt,
    public var `TotalSampleMemory`: UInt,
    public var `FreeSampleMemory`: UInt,
    public var `LargestFreeContiguousSampleMemory`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KSWAVE_VOLUME` (
    public var `LeftAttenuation`: Int,
    public var `RightAttenuation`: Int,
)
public const val `KS_AMCONTROL_COLORINFO_PRESENT`: UInt = 128u;
public const val `KS_AMCONTROL_PAD_TO_16x9`: UInt = 4u;
public const val `KS_AMCONTROL_PAD_TO_4x3`: UInt = 2u;
public const val `KS_AMCONTROL_USED`: UInt = 1u;
public typealias `KS_AMPixAspectRatio` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_AMVPDATAINFO` (
    public var `dwSize`: UInt,
    public var `dwMicrosecondsPerField`: UInt,
    public var `amvpDimInfo`: `KS_AMVPDIMINFO`,
    public var `dwPictAspectRatioX`: UInt,
    public var `dwPictAspectRatioY`: UInt,
    public var `bEnableDoubleClock`: `windows_sys`.`core`.`BOOL`,
    public var `bEnableVACT`: `windows_sys`.`core`.`BOOL`,
    public var `bDataIsInterlaced`: `windows_sys`.`core`.`BOOL`,
    public var `lHalfLinesOdd`: Int,
    public var `bFieldPolarityInverted`: `windows_sys`.`core`.`BOOL`,
    public var `dwNumLinesInVREF`: UInt,
    public var `lHalfLinesEven`: Int,
    public var `dwReserved1`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_AMVPDIMINFO` (
    public var `dwFieldWidth`: UInt,
    public var `dwFieldHeight`: UInt,
    public var `dwVBIWidth`: UInt,
    public var `dwVBIHeight`: UInt,
    public var `rcValidRegion`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_AMVPSIZE` (
    public var `dwWidth`: UInt,
    public var `dwHeight`: UInt,
)
public const val `KS_AMVP_BEST_BANDWIDTH`: `KS_AMVP_SELECTFORMATBY` = 1;
public const val `KS_AMVP_DO_NOT_CARE`: `KS_AMVP_SELECTFORMATBY` = 0;
public const val `KS_AMVP_INPUT_SAME_AS_OUTPUT`: `KS_AMVP_SELECTFORMATBY` = 2;
public typealias `KS_AMVP_MODE` = Int;
public const val `KS_AMVP_MODE_BOBINTERLEAVED`: `KS_AMVP_MODE` = 1;
public const val `KS_AMVP_MODE_BOBNONINTERLEAVED`: `KS_AMVP_MODE` = 2;
public const val `KS_AMVP_MODE_SKIPEVEN`: `KS_AMVP_MODE` = 3;
public const val `KS_AMVP_MODE_SKIPODD`: `KS_AMVP_MODE` = 4;
public const val `KS_AMVP_MODE_WEAVE`: `KS_AMVP_MODE` = 0;
public typealias `KS_AMVP_SELECTFORMATBY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_AM_ExactRateChange` (
    public var `OutputZeroTime`: Long,
    public var `Rate`: Int,
)
public typealias `KS_AM_PROPERTY_TS_RATE_CHANGE` = Int;
public const val `KS_AM_RATE_ExactRateChange`: `KS_AM_PROPERTY_TS_RATE_CHANGE` = 2;
public const val `KS_AM_RATE_MaxFullDataRate`: `KS_AM_PROPERTY_TS_RATE_CHANGE` = 3;
public const val `KS_AM_RATE_SimpleRateChange`: `KS_AM_PROPERTY_TS_RATE_CHANGE` = 1;
public const val `KS_AM_RATE_Step`: `KS_AM_PROPERTY_TS_RATE_CHANGE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_AM_SimpleRateChange` (
    public var `StartTime`: Long,
    public var `Rate`: Int,
)
public const val `KS_AM_UseNewCSSKey`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_ANALOGVIDEOINFO` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwActiveWidth`: UInt,
    public var `dwActiveHeight`: UInt,
    public var `AvgTimePerFrame`: Long,
)
public typealias `KS_AnalogVideoStandard` = Int;
public const val `KS_AnalogVideo_NTSC_433`: `KS_AnalogVideoStandard` = 4;
public const val `KS_AnalogVideo_NTSC_M`: `KS_AnalogVideoStandard` = 1;
public const val `KS_AnalogVideo_NTSC_M_J`: `KS_AnalogVideoStandard` = 2;
public const val `KS_AnalogVideo_NTSC_Mask`: UInt = 7u;
public const val `KS_AnalogVideo_None`: `KS_AnalogVideoStandard` = 0;
public const val `KS_AnalogVideo_PAL_60`: `KS_AnalogVideoStandard` = 2048;
public const val `KS_AnalogVideo_PAL_B`: `KS_AnalogVideoStandard` = 16;
public const val `KS_AnalogVideo_PAL_D`: `KS_AnalogVideoStandard` = 32;
public const val `KS_AnalogVideo_PAL_G`: `KS_AnalogVideoStandard` = 64;
public const val `KS_AnalogVideo_PAL_H`: `KS_AnalogVideoStandard` = 128;
public const val `KS_AnalogVideo_PAL_I`: `KS_AnalogVideoStandard` = 256;
public const val `KS_AnalogVideo_PAL_M`: `KS_AnalogVideoStandard` = 512;
public const val `KS_AnalogVideo_PAL_Mask`: UInt = 1052656u;
public const val `KS_AnalogVideo_PAL_N`: `KS_AnalogVideoStandard` = 1024;
public const val `KS_AnalogVideo_PAL_N_COMBO`: `KS_AnalogVideoStandard` = 1048576;
public const val `KS_AnalogVideo_SECAM_B`: `KS_AnalogVideoStandard` = 4096;
public const val `KS_AnalogVideo_SECAM_D`: `KS_AnalogVideoStandard` = 8192;
public const val `KS_AnalogVideo_SECAM_G`: `KS_AnalogVideoStandard` = 16384;
public const val `KS_AnalogVideo_SECAM_H`: `KS_AnalogVideoStandard` = 32768;
public const val `KS_AnalogVideo_SECAM_K`: `KS_AnalogVideoStandard` = 65536;
public const val `KS_AnalogVideo_SECAM_K1`: `KS_AnalogVideoStandard` = 131072;
public const val `KS_AnalogVideo_SECAM_L`: `KS_AnalogVideoStandard` = 262144;
public const val `KS_AnalogVideo_SECAM_L1`: `KS_AnalogVideoStandard` = 524288;
public const val `KS_AnalogVideo_SECAM_Mask`: UInt = 1044480u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_BITMAPINFOHEADER` (
    public var `biSize`: UInt,
    public var `biWidth`: Int,
    public var `biHeight`: Int,
    public var `biPlanes`: UShort,
    public var `biBitCount`: UShort,
    public var `biCompression`: UInt,
    public var `biSizeImage`: UInt,
    public var `biXPelsPerMeter`: Int,
    public var `biYPelsPerMeter`: Int,
    public var `biClrUsed`: UInt,
    public var `biClrImportant`: UInt,
)
public const val `KS_BI_BITFIELDS`: Int = 3;
public const val `KS_BI_JPEG`: Int = 4;
public const val `KS_BI_RGB`: Int = 0;
public const val `KS_BI_RLE4`: Int = 2;
public const val `KS_BI_RLE8`: Int = 1;
public const val `KS_CAMERACONTROL_ASYNC_RESET`: `KS_CameraControlAsyncOperation` = 3;
public const val `KS_CAMERACONTROL_ASYNC_START`: `KS_CameraControlAsyncOperation` = 1;
public const val `KS_CAMERACONTROL_ASYNC_STOP`: `KS_CameraControlAsyncOperation` = 2;
public const val `KS_CAPTURE_ALLOC_INVALID`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 0;
public const val `KS_CAPTURE_ALLOC_SECURE_BUFFER`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 16;
public const val `KS_CAPTURE_ALLOC_SYSTEM`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 1;
public const val `KS_CAPTURE_ALLOC_SYSTEM_AGP`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 4;
public const val `KS_CAPTURE_ALLOC_VRAM`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 2;
public const val `KS_CAPTURE_ALLOC_VRAM_MAPPED`: `CAPTURE_MEMORY_ALLOCATION_FLAGS` = 8;
public const val `KS_CC_SUBSTREAM_EVEN`: Int = 2;
public const val `KS_CC_SUBSTREAM_FIELD1_MASK`: Int = 240;
public const val `KS_CC_SUBSTREAM_FIELD2_MASK`: Int = 7936;
public const val `KS_CC_SUBSTREAM_ODD`: Int = 1;
public const val `KS_CC_SUBSTREAM_SERVICE_CC1`: Int = 16;
public const val `KS_CC_SUBSTREAM_SERVICE_CC2`: Int = 32;
public const val `KS_CC_SUBSTREAM_SERVICE_CC3`: Int = 256;
public const val `KS_CC_SUBSTREAM_SERVICE_CC4`: Int = 512;
public const val `KS_CC_SUBSTREAM_SERVICE_T1`: Int = 64;
public const val `KS_CC_SUBSTREAM_SERVICE_T2`: Int = 128;
public const val `KS_CC_SUBSTREAM_SERVICE_T3`: Int = 1024;
public const val `KS_CC_SUBSTREAM_SERVICE_T4`: Int = 2048;
public const val `KS_CC_SUBSTREAM_SERVICE_XDS`: Int = 4096;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_COLCON` (
    public var `_bitfield1`: UByte,
    public var `_bitfield2`: UByte,
    public var `_bitfield3`: UByte,
    public var `_bitfield4`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_COMPRESSION` (
    public var `RatioNumerator`: UInt,
    public var `RatioDenominator`: UInt,
    public var `RatioConstantMargin`: UInt,
)
public const val `KS_COPYPROTECT_RestrictDuplication`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_COPY_MACROVISION` (
    public var `MACROVISIONLevel`: UInt,
)
public typealias `KS_COPY_MACROVISION_LEVEL` = Int;
public typealias `KS_CameraControlAsyncOperation` = Int;
public typealias `KS_CompressionCaps` = Int;
public const val `KS_CompressionCaps_CanBFrame`: `KS_CompressionCaps` = 8;
public const val `KS_CompressionCaps_CanCrunch`: `KS_CompressionCaps` = 2;
public const val `KS_CompressionCaps_CanKeyFrame`: `KS_CompressionCaps` = 4;
public const val `KS_CompressionCaps_CanQuality`: `KS_CompressionCaps` = 1;
public const val `KS_CompressionCaps_CanWindow`: `KS_CompressionCaps` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_H264VIDEOINFO` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `H264VideoInfoHeader`: `KS_H264VIDEOINFO`,
)
// UNSUPPORTED Rust 5055:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_H264VIDEOINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_IMAGEINFO` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `ImageInfoHeader`: `KS_BITMAPINFOHEADER`,
)
// UNSUPPORTED Rust 5066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_IMAGEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_MPEGVIDEOINFO2` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `MpegVideoInfoHeader2`: `KS_MPEGVIDEOINFO2`,
)
// UNSUPPORTED Rust 5077:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_MPEGVIDEOINFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_VBIINFOHEADER` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `VBIInfoHeader`: `KS_VBIINFOHEADER`,
)
// UNSUPPORTED Rust 5088:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_VBIINFOHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_VIDEOINFOHEADER` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `VideoInfoHeader`: `KS_VIDEOINFOHEADER`,
)
// UNSUPPORTED Rust 5099:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_VIDEOINFOHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_VIDEOINFOHEADER2` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `VideoInfoHeader2`: `KS_VIDEOINFOHEADER2`,
)
// UNSUPPORTED Rust 5110:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_VIDEOINFOHEADER2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATAFORMAT_VIDEOINFO_PALETTE` (
    public var `DataFormat`: `KSDATAFORMAT`,
    public var `VideoInfo`: `KS_VIDEOINFO`,
)
// UNSUPPORTED Rust 5121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATAFORMAT_VIDEOINFO_PALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_ANALOGVIDEO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `AnalogVideoInfo`: `KS_ANALOGVIDEOINFO`,
)
// UNSUPPORTED Rust 5132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_ANALOGVIDEO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_H264_VIDEO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfoHeader`: `KS_H264VIDEOINFO`,
)
// UNSUPPORTED Rust 5148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_H264_VIDEO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_IMAGE` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `ImageInfoHeader`: `KS_BITMAPINFOHEADER`,
)
// UNSUPPORTED Rust 5160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_MPEG1_VIDEO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfoHeader`: `KS_MPEG1VIDEOINFO`,
)
// UNSUPPORTED Rust 5176:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_MPEG1_VIDEO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_MPEG2_VIDEO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfoHeader`: `KS_MPEGVIDEOINFO2`,
)
// UNSUPPORTED Rust 5192:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_MPEG2_VIDEO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_VIDEO` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfoHeader`: `KS_VIDEOINFOHEADER`,
)
// UNSUPPORTED Rust 5208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_VIDEO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_VIDEO2` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfoHeader`: `KS_VIDEOINFOHEADER2`,
)
// UNSUPPORTED Rust 5224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_VIDEO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_VIDEO_PALETTE` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VideoInfo`: `KS_VIDEOINFO`,
)
// UNSUPPORTED Rust 5240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_VIDEO_PALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DATARANGE_VIDEO_VBI` (
    public var `DataRange`: `KSDATAFORMAT`,
    public var `bFixedSizeSamples`: `windows_sys`.`core`.`BOOL`,
    public var `bTemporalCompression`: `windows_sys`.`core`.`BOOL`,
    public var `StreamDescriptionFlags`: UInt,
    public var `MemoryAllocationFlags`: UInt,
    public var `ConfigCaps`: `KS_VIDEO_STREAM_CONFIG_CAPS`,
    public var `VBIInfoHeader`: `KS_VBIINFOHEADER`,
)
// UNSUPPORTED Rust 5256:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DATARANGE_VIDEO_VBI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KS_DVDCOPYSTATE` = Int;
public const val `KS_DVDCOPYSTATE_AUTHENTICATION_NOT_REQUIRED`: `KS_DVDCOPYSTATE` = 2;
public const val `KS_DVDCOPYSTATE_AUTHENTICATION_REQUIRED`: `KS_DVDCOPYSTATE` = 3;
public const val `KS_DVDCOPYSTATE_DONE`: `KS_DVDCOPYSTATE` = 4;
public const val `KS_DVDCOPYSTATE_INITIALIZE`: `KS_DVDCOPYSTATE` = 0;
public const val `KS_DVDCOPYSTATE_INITIALIZE_TITLE`: `KS_DVDCOPYSTATE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DVDCOPY_BUSKEY` (
    public var `BusKey`: UByteArray,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 5273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DVDCOPY_BUSKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DVDCOPY_CHLGKEY` (
    public var `ChlgKey`: UByteArray,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 5284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DVDCOPY_CHLGKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2048 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DVDCOPY_DISCKEY` (
    public var `DiscKey`: UByteArray,
)
// UNSUPPORTED Rust 5294:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DVDCOPY_DISCKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DVDCOPY_REGION` (
    public var `Reserved`: UByte,
    public var `RegionData`: UByte,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 5306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DVDCOPY_REGION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_DVDCOPY_SET_COPY_STATE` (
    public var `DVDCopyState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_DVDCOPY_TITLEKEY` (
    public var `KeyFlags`: UInt,
    public var `ReservedNT`: UIntArray,
    public var `TitleKey`: UByteArray,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 5324:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_DVDCOPY_TITLEKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KS_DVD_CGMS_COPY_ONCE`: UInt = 16u;
public const val `KS_DVD_CGMS_COPY_PERMITTED`: UInt = 0u;
public const val `KS_DVD_CGMS_COPY_PROTECT_MASK`: UInt = 24u;
public const val `KS_DVD_CGMS_NO_COPY`: UInt = 24u;
public const val `KS_DVD_CGMS_RESERVED_MASK`: UInt = 120u;
public const val `KS_DVD_COPYRIGHTED`: UInt = 64u;
public const val `KS_DVD_COPYRIGHT_MASK`: UInt = 64u;
public const val `KS_DVD_NOT_COPYRIGHTED`: UInt = 0u;
public const val `KS_DVD_SECTOR_NOT_PROTECTED`: UInt = 0u;
public const val `KS_DVD_SECTOR_PROTECTED`: UInt = 32u;
public const val `KS_DVD_SECTOR_PROTECT_MASK`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_DVD_YCrCb` (
    public var `Reserved`: UByte,
    public var `Y`: UByte,
    public var `Cr`: UByte,
    public var `Cb`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_DVD_YUV` (
    public var `Reserved`: UByte,
    public var `Y`: UByte,
    public var `V`: UByte,
    public var `U`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_FRAME_INFO` (
    public var `ExtendedHeaderSize`: UInt,
    public var `dwFrameFlags`: UInt,
    public var `PictureNumber`: Long,
    public var `DropCount`: Long,
    public var `hDirectDraw`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hSurfaceHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `DirectDrawRect`: `super`.`super`.`Foundation`.`RECT`,
    public var `Anonymous1`: `KS_FRAME_INFO_0`,
    public var `Reserved2`: UInt,
    public var `Anonymous2`: `KS_FRAME_INFO_1`,
)
// UNSUPPORTED Rust 5370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_FRAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5375:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KS_FRAME_INFO_0 {
//     pub lSurfacePitch: i32,
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 5381:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_FRAME_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5386:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KS_FRAME_INFO_1 {
//     pub Anonymous: KS_FRAME_INFO_1_0,
//     pub FrameCompletionNumber: u64,
// }

// UNSUPPORTED Rust 5392:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_FRAME_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_FRAME_INFO_1_0` (
    public var `Reserved3`: UInt,
    public var `Reserved4`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_FRAMING_ITEM` (
    public var `MemoryType`: `windows_sys`.`core`.`GUID`,
    public var `BusType`: `windows_sys`.`core`.`GUID`,
    public var `MemoryFlags`: UInt,
    public var `BusFlags`: UInt,
    public var `Flags`: UInt,
    public var `Frames`: UInt,
    public var `Anonymous`: `KS_FRAMING_ITEM_0`,
    public var `MemoryTypeWeight`: UInt,
    public var `PhysicalRange`: `KS_FRAMING_RANGE`,
    public var `FramingRange`: `KS_FRAMING_RANGE_WEIGHTED`,
)
// UNSUPPORTED Rust 5417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_FRAMING_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5422:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KS_FRAMING_ITEM_0 {
//     pub FileAlignment: u32,
//     pub FramePitch: i32,
// }

// UNSUPPORTED Rust 5428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_FRAMING_ITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_FRAMING_RANGE` (
    public var `MinFrameSize`: UInt,
    public var `MaxFrameSize`: UInt,
    public var `Stepping`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_FRAMING_RANGE_WEIGHTED` (
    public var `Range`: `KS_FRAMING_RANGE`,
    public var `InPlaceWeight`: UInt,
    public var `NotInPlaceWeight`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_H264VIDEOINFO` (
    public var `wWidth`: UShort,
    public var `wHeight`: UShort,
    public var `wSARwidth`: UShort,
    public var `wSARheight`: UShort,
    public var `wProfile`: UShort,
    public var `bLevelIDC`: UByte,
    public var `wConstrainedToolset`: UShort,
    public var `bmSupportedUsages`: UInt,
    public var `bmCapabilities`: UShort,
    public var `bmSVCCapabilities`: UInt,
    public var `bmMVCCapabilities`: UInt,
    public var `dwFrameInterval`: UInt,
    public var `bMaxCodecConfigDelay`: UByte,
    public var `bmSupportedSliceModes`: UByte,
    public var `bmSupportedSyncFrameTypes`: UByte,
    public var `bResolutionScaling`: UByte,
    public var `bSimulcastSupport`: UByte,
    public var `bmSupportedRateControlModes`: UByte,
    public var `wMaxMBperSecOneResolutionNoScalability`: UShort,
    public var `wMaxMBperSecTwoResolutionsNoScalability`: UShort,
    public var `wMaxMBperSecThreeResolutionsNoScalability`: UShort,
    public var `wMaxMBperSecFourResolutionsNoScalability`: UShort,
    public var `wMaxMBperSecOneResolutionTemporalScalability`: UShort,
    public var `wMaxMBperSecTwoResolutionsTemporalScalablility`: UShort,
    public var `wMaxMBperSecThreeResolutionsTemporalScalability`: UShort,
    public var `wMaxMBperSecFourResolutionsTemporalScalability`: UShort,
    public var `wMaxMBperSecOneResolutionTemporalQualityScalability`: UShort,
    public var `wMaxMBperSecTwoResolutionsTemporalQualityScalability`: UShort,
    public var `wMaxMBperSecThreeResolutionsTemporalQualityScalablity`: UShort,
    public var `wMaxMBperSecFourResolutionsTemporalQualityScalability`: UShort,
    public var `wMaxMBperSecOneResolutionTemporalSpatialScalability`: UShort,
    public var `wMaxMBperSecTwoResolutionsTemporalSpatialScalability`: UShort,
    public var `wMaxMBperSecThreeResolutionsTemporalSpatialScalablity`: UShort,
    public var `wMaxMBperSecFourResolutionsTemporalSpatialScalability`: UShort,
    public var `wMaxMBperSecOneResolutionFullScalability`: UShort,
    public var `wMaxMBperSecTwoResolutionsFullScalability`: UShort,
    public var `wMaxMBperSecThreeResolutionsFullScalability`: UShort,
    public var `wMaxMBperSecFourResolutionsFullScalability`: UShort,
)
public const val `KS_INTERLACE_1FieldPerSample`: UInt = 2u;
public const val `KS_INTERLACE_DisplayModeBobOnly`: UInt = 0u;
public const val `KS_INTERLACE_DisplayModeBobOrWeave`: UInt = 128u;
public const val `KS_INTERLACE_DisplayModeMask`: UInt = 192u;
public const val `KS_INTERLACE_DisplayModeWeaveOnly`: UInt = 64u;
public const val `KS_INTERLACE_Field1First`: UInt = 4u;
public const val `KS_INTERLACE_FieldPatBothIrregular`: UInt = 48u;
public const val `KS_INTERLACE_FieldPatBothRegular`: UInt = 32u;
public const val `KS_INTERLACE_FieldPatField1Only`: UInt = 0u;
public const val `KS_INTERLACE_FieldPatField2Only`: UInt = 16u;
public const val `KS_INTERLACE_FieldPatternMask`: UInt = 48u;
public const val `KS_INTERLACE_IsInterlaced`: UInt = 1u;
public const val `KS_INTERLACE_UNUSED`: UInt = 8u;
public typealias `KS_LogicalMemoryType` = Int;
public const val `KS_MACROVISION_DISABLED`: `KS_COPY_MACROVISION_LEVEL` = 0;
public const val `KS_MACROVISION_LEVEL1`: `KS_COPY_MACROVISION_LEVEL` = 1;
public const val `KS_MACROVISION_LEVEL2`: `KS_COPY_MACROVISION_LEVEL` = 2;
public const val `KS_MACROVISION_LEVEL3`: `KS_COPY_MACROVISION_LEVEL` = 3;
public const val `KS_MAX_SIZE_MPEG1_SEQUENCE_INFO`: UInt = 140u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_MPEG1VIDEOINFO` (
    public var `hdr`: `KS_VIDEOINFOHEADER`,
    public var `dwStartTimeCode`: UInt,
    public var `cbSequenceHeader`: UInt,
    public var `bSequenceHeader`: UByteArray,
)
// UNSUPPORTED Rust 5516:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_MPEG1VIDEOINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KS_MPEG2Level` = Int;
public const val `KS_MPEG2Level_High`: `KS_MPEG2Level` = 3;
public const val `KS_MPEG2Level_High1440`: `KS_MPEG2Level` = 2;
public const val `KS_MPEG2Level_Low`: `KS_MPEG2Level` = 0;
public const val `KS_MPEG2Level_Main`: `KS_MPEG2Level` = 1;
public typealias `KS_MPEG2Profile` = Int;
public const val `KS_MPEG2Profile_High`: `KS_MPEG2Profile` = 4;
public const val `KS_MPEG2Profile_Main`: `KS_MPEG2Profile` = 1;
public const val `KS_MPEG2Profile_SNRScalable`: `KS_MPEG2Profile` = 2;
public const val `KS_MPEG2Profile_Simple`: `KS_MPEG2Profile` = 0;
public const val `KS_MPEG2Profile_SpatiallyScalable`: `KS_MPEG2Profile` = 3;
public const val `KS_MPEG2_27MhzTimebase`: UInt = 256u;
public const val `KS_MPEG2_DSS_UserData`: UInt = 64u;
public const val `KS_MPEG2_DVB_UserData`: UInt = 128u;
public const val `KS_MPEG2_DVDLine21Field1`: UInt = 2u;
public const val `KS_MPEG2_DVDLine21Field2`: UInt = 4u;
public const val `KS_MPEG2_DoPanScan`: UInt = 1u;
public const val `KS_MPEG2_FilmCameraMode`: UInt = 16u;
public const val `KS_MPEG2_LetterboxAnalogOut`: UInt = 32u;
public const val `KS_MPEG2_SourceIsLetterboxed`: UInt = 8u;
public const val `KS_MPEG2_WidescreenAnalogOut`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_MPEGAUDIOINFO` (
    public var `dwFlags`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `dwReserved3`: UInt,
)
public const val `KS_MPEGAUDIOINFO_27MhzTimebase`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_MPEGVIDEOINFO2` (
    public var `hdr`: `KS_VIDEOINFOHEADER2`,
    public var `dwStartTimeCode`: UInt,
    public var `cbSequenceHeader`: UInt,
    public var `dwProfile`: UInt,
    public var `dwLevel`: UInt,
    public var `dwFlags`: UInt,
    public var `bSequenceHeader`: UIntArray,
)
// UNSUPPORTED Rust 5562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_MPEGVIDEOINFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KS_MemoryTypeAnyHost`: `KS_LogicalMemoryType` = 6;
public const val `KS_MemoryTypeDeviceHostMapped`: `KS_LogicalMemoryType` = 3;
public const val `KS_MemoryTypeDeviceSpecific`: `KS_LogicalMemoryType` = 4;
public const val `KS_MemoryTypeDontCare`: `KS_LogicalMemoryType` = 0;
public const val `KS_MemoryTypeKernelNonPaged`: `KS_LogicalMemoryType` = 2;
public const val `KS_MemoryTypeKernelPaged`: `KS_LogicalMemoryType` = 1;
public const val `KS_MemoryTypeUser`: `KS_LogicalMemoryType` = 5;
public const val `KS_NABTS_GROUPID_LOCAL_CABLE_SYSTEM_ADVERTISER_BASE`: UInt = 2224u;
public const val `KS_NABTS_GROUPID_LOCAL_CABLE_SYSTEM_CONTENT_BASE`: UInt = 2208u;
public const val `KS_NABTS_GROUPID_MICROSOFT_RESERVED_TEST_DATA_BASE`: UInt = 2288u;
public const val `KS_NABTS_GROUPID_NETWORK_WIDE_ADVERTISER_BASE`: UInt = 2160u;
public const val `KS_NABTS_GROUPID_NETWORK_WIDE_CONTENT_BASE`: UInt = 2144u;
public const val `KS_NABTS_GROUPID_ORIGINAL_CONTENT_ADVERTISER_BASE`: UInt = 2064u;
public const val `KS_NABTS_GROUPID_ORIGINAL_CONTENT_BASE`: UInt = 2048u;
public const val `KS_NABTS_GROUPID_PRODUCTION_COMPANY_ADVERTISER_BASE`: UInt = 2096u;
public const val `KS_NABTS_GROUPID_PRODUCTION_COMPANY_CONTENT_BASE`: UInt = 2080u;
public const val `KS_NABTS_GROUPID_SYNDICATED_SHOW_ADVERTISER_BASE`: UInt = 2128u;
public const val `KS_NABTS_GROUPID_SYNDICATED_SHOW_CONTENT_BASE`: UInt = 2112u;
public const val `KS_NABTS_GROUPID_TELEVISION_STATION_ADVERTISER_BASE`: UInt = 2192u;
public const val `KS_NABTS_GROUPID_TELEVISION_STATION_CONTENT_BASE`: UInt = 2176u;
public const val `KS_Obsolete_VideoControlFlag_ExternalTriggerEnable`: `KS_VideoControlFlags` = 16;
public const val `KS_Obsolete_VideoControlFlag_Trigger`: `KS_VideoControlFlags` = 32;
public const val `KS_PhysConn_Audio_1394`: `KS_PhysicalConnectorType` = 4103;
public const val `KS_PhysConn_Audio_AESDigital`: `KS_PhysicalConnectorType` = 4099;
public const val `KS_PhysConn_Audio_AUX`: `KS_PhysicalConnectorType` = 4102;
public const val `KS_PhysConn_Audio_AudioDecoder`: `KS_PhysicalConnectorType` = 4105;
public const val `KS_PhysConn_Audio_Line`: `KS_PhysicalConnectorType` = 4097;
public const val `KS_PhysConn_Audio_Mic`: `KS_PhysicalConnectorType` = 4098;
public const val `KS_PhysConn_Audio_SCSI`: `KS_PhysicalConnectorType` = 4101;
public const val `KS_PhysConn_Audio_SPDIFDigital`: `KS_PhysicalConnectorType` = 4100;
public const val `KS_PhysConn_Audio_Tuner`: `KS_PhysicalConnectorType` = 4096;
public const val `KS_PhysConn_Audio_USB`: `KS_PhysicalConnectorType` = 4104;
public const val `KS_PhysConn_Video_1394`: `KS_PhysicalConnectorType` = 10;
public const val `KS_PhysConn_Video_AUX`: `KS_PhysicalConnectorType` = 9;
public const val `KS_PhysConn_Video_Composite`: `KS_PhysicalConnectorType` = 2;
public const val `KS_PhysConn_Video_ParallelDigital`: `KS_PhysicalConnectorType` = 7;
public const val `KS_PhysConn_Video_RGB`: `KS_PhysicalConnectorType` = 4;
public const val `KS_PhysConn_Video_SCART`: `KS_PhysicalConnectorType` = 14;
public const val `KS_PhysConn_Video_SCSI`: `KS_PhysicalConnectorType` = 8;
public const val `KS_PhysConn_Video_SVideo`: `KS_PhysicalConnectorType` = 3;
public const val `KS_PhysConn_Video_SerialDigital`: `KS_PhysicalConnectorType` = 6;
public const val `KS_PhysConn_Video_Tuner`: `KS_PhysicalConnectorType` = 1;
public const val `KS_PhysConn_Video_USB`: `KS_PhysicalConnectorType` = 11;
public const val `KS_PhysConn_Video_VideoDecoder`: `KS_PhysicalConnectorType` = 12;
public const val `KS_PhysConn_Video_VideoEncoder`: `KS_PhysicalConnectorType` = 13;
public const val `KS_PhysConn_Video_YRYBY`: `KS_PhysicalConnectorType` = 5;
public typealias `KS_PhysicalConnectorType` = Int;
public const val `KS_PixAspectRatio_NTSC16x9`: `KS_AMPixAspectRatio` = 1;
public const val `KS_PixAspectRatio_NTSC4x3`: `KS_AMPixAspectRatio` = 0;
public const val `KS_PixAspectRatio_PAL16x9`: `KS_AMPixAspectRatio` = 3;
public const val `KS_PixAspectRatio_PAL4x3`: `KS_AMPixAspectRatio` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_RGBQUAD` (
    public var `rgbBlue`: UByte,
    public var `rgbGreen`: UByte,
    public var `rgbRed`: UByte,
    public var `rgbReserved`: UByte,
)
// UNSUPPORTED Rust 5626:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const KS_SECURE_CAMERA_SCENARIO_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae53fc6e_8d89_4488_9d2e_4d008731c5fd);

public const val `KS_SEEKING_AbsolutePositioning`: `KS_SEEKING_FLAGS` = 1;
public typealias `KS_SEEKING_CAPABILITIES` = Int;
public const val `KS_SEEKING_CanGetCurrentPos`: `KS_SEEKING_CAPABILITIES` = 8;
public const val `KS_SEEKING_CanGetDuration`: `KS_SEEKING_CAPABILITIES` = 32;
public const val `KS_SEEKING_CanGetStopPos`: `KS_SEEKING_CAPABILITIES` = 16;
public const val `KS_SEEKING_CanPlayBackwards`: `KS_SEEKING_CAPABILITIES` = 64;
public const val `KS_SEEKING_CanSeekAbsolute`: `KS_SEEKING_CAPABILITIES` = 1;
public const val `KS_SEEKING_CanSeekBackwards`: `KS_SEEKING_CAPABILITIES` = 4;
public const val `KS_SEEKING_CanSeekForwards`: `KS_SEEKING_CAPABILITIES` = 2;
public typealias `KS_SEEKING_FLAGS` = Int;
public const val `KS_SEEKING_IncrementalPositioning`: `KS_SEEKING_FLAGS` = 3;
public const val `KS_SEEKING_NoPositioning`: `KS_SEEKING_FLAGS` = 0;
public const val `KS_SEEKING_PositioningBitsMask`: `KS_SEEKING_FLAGS` = 3;
public const val `KS_SEEKING_RelativePositioning`: `KS_SEEKING_FLAGS` = 2;
public const val `KS_SEEKING_ReturnTime`: `KS_SEEKING_FLAGS` = 8;
public const val `KS_SEEKING_SeekToKeyFrame`: `KS_SEEKING_FLAGS` = 4;
public const val `KS_StreamingHint_CompQuality`: `KS_VideoStreamingHints` = 2048;
public const val `KS_StreamingHint_CompWindowSize`: `KS_VideoStreamingHints` = 4096;
public const val `KS_StreamingHint_FrameInterval`: `KS_VideoStreamingHints` = 256;
public const val `KS_StreamingHint_KeyFrameRate`: `KS_VideoStreamingHints` = 512;
public const val `KS_StreamingHint_PFrameRate`: `KS_VideoStreamingHints` = 1024;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_TRUECOLORINFO` (
    public var `dwBitMasks`: UIntArray,
    public var `bmiColors`: Array<`KS_RGBQUAD`>,
)
// UNSUPPORTED Rust 5654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_TRUECOLORINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KS_TUNER_STRATEGY` = Int;
public const val `KS_TUNER_STRATEGY_DRIVER_TUNES`: `KS_TUNER_STRATEGY` = 4;
public const val `KS_TUNER_STRATEGY_PLL`: `KS_TUNER_STRATEGY` = 1;
public const val `KS_TUNER_STRATEGY_SIGNAL_STRENGTH`: `KS_TUNER_STRATEGY` = 2;
public const val `KS_TUNER_TUNING_COARSE`: `KS_TUNER_TUNING_FLAGS` = 3;
public const val `KS_TUNER_TUNING_EXACT`: `KS_TUNER_TUNING_FLAGS` = 1;
public const val `KS_TUNER_TUNING_FINE`: `KS_TUNER_TUNING_FLAGS` = 2;
public typealias `KS_TUNER_TUNING_FLAGS` = Int;
public const val `KS_TVAUDIO_MODE_LANG_A`: UInt = 16u;
public const val `KS_TVAUDIO_MODE_LANG_B`: UInt = 32u;
public const val `KS_TVAUDIO_MODE_LANG_C`: UInt = 64u;
public const val `KS_TVAUDIO_MODE_MONO`: UInt = 1u;
public const val `KS_TVAUDIO_MODE_STEREO`: UInt = 2u;
public const val `KS_TVAUDIO_PRESET_LANG_A`: UInt = 4096u;
public const val `KS_TVAUDIO_PRESET_LANG_B`: UInt = 8192u;
public const val `KS_TVAUDIO_PRESET_LANG_C`: UInt = 16384u;
public const val `KS_TVAUDIO_PRESET_STEREO`: UInt = 512u;
public const val `KS_TVTUNER_CHANGE_BEGIN_TUNE`: Int = 1;
public const val `KS_TVTUNER_CHANGE_END_TUNE`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_TVTUNER_CHANGE_INFO` (
    public var `dwFlags`: UInt,
    public var `dwCountryCode`: UInt,
    public var `dwAnalogVideoStandard`: UInt,
    public var `dwChannel`: UInt,
)
public const val `KS_VBICAP_PROTECTION_MV_DETECTED`: Int = 4;
public const val `KS_VBICAP_PROTECTION_MV_HARDWARE`: Int = 2;
public const val `KS_VBICAP_PROTECTION_MV_PRESENT`: Int = 1;
public const val `KS_VBIDATARATE_CC`: Int = 503493;
public const val `KS_VBIDATARATE_NABTS`: Int = 5727272;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_VBIINFOHEADER` (
    public var `StartLine`: UInt,
    public var `EndLine`: UInt,
    public var `SamplingFrequency`: UInt,
    public var `MinLineStartTime`: UInt,
    public var `MaxLineStartTime`: UInt,
    public var `ActualLineStartTime`: UInt,
    public var `ActualLineEndTime`: UInt,
    public var `VideoStandard`: UInt,
    public var `SamplesPerLine`: UInt,
    public var `StrideInBytes`: UInt,
    public var `BufferSize`: UInt,
)
public const val `KS_VBI_FLAG_FIELD1`: Int = 1;
public const val `KS_VBI_FLAG_FIELD2`: Int = 2;
public const val `KS_VBI_FLAG_FRAME`: Int = 0;
public const val `KS_VBI_FLAG_MV_DETECTED`: Int = 1024;
public const val `KS_VBI_FLAG_MV_HARDWARE`: Int = 512;
public const val `KS_VBI_FLAG_MV_PRESENT`: Int = 256;
public const val `KS_VBI_FLAG_TVTUNER_CHANGE`: Int = 16;
public const val `KS_VBI_FLAG_VBIINFOHEADER_CHANGE`: Int = 32;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_VBI_FRAME_INFO` (
    public var `ExtendedHeaderSize`: UInt,
    public var `dwFrameFlags`: UInt,
    public var `PictureNumber`: Long,
    public var `DropCount`: Long,
    public var `dwSamplingFrequency`: UInt,
    public var `TvTunerChangeInfo`: `KS_TVTUNER_CHANGE_INFO`,
    public var `VBIInfoHeader`: `KS_VBIINFOHEADER`,
)
public typealias `KS_VIDEODECODER_FLAGS` = Int;
public const val `KS_VIDEODECODER_FLAGS_CAN_DISABLE_OUTPUT`: `KS_VIDEODECODER_FLAGS` = 1;
public const val `KS_VIDEODECODER_FLAGS_CAN_INDICATE_LOCKED`: `KS_VIDEODECODER_FLAGS` = 4;
public const val `KS_VIDEODECODER_FLAGS_CAN_USE_VCR_LOCKING`: `KS_VIDEODECODER_FLAGS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_VIDEOINFO` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwBitRate`: UInt,
    public var `dwBitErrorRate`: UInt,
    public var `AvgTimePerFrame`: Long,
    public var `bmiHeader`: `KS_BITMAPINFOHEADER`,
    public var `Anonymous`: `KS_VIDEOINFO_0`,
)
// UNSUPPORTED Rust 5740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_VIDEOINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5745:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KS_VIDEOINFO_0 {
//     pub bmiColors: [KS_RGBQUAD; 256],
//     pub dwBitMasks: [u32; 3],
//     pub TrueColorInfo: KS_TRUECOLORINFO,
// }

// UNSUPPORTED Rust 5752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_VIDEOINFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_VIDEOINFOHEADER` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwBitRate`: UInt,
    public var `dwBitErrorRate`: UInt,
    public var `AvgTimePerFrame`: Long,
    public var `bmiHeader`: `KS_BITMAPINFOHEADER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KS_VIDEOINFOHEADER2` (
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwBitRate`: UInt,
    public var `dwBitErrorRate`: UInt,
    public var `AvgTimePerFrame`: Long,
    public var `dwInterlaceFlags`: UInt,
    public var `dwCopyProtectFlags`: UInt,
    public var `dwPictAspectRatioX`: UInt,
    public var `dwPictAspectRatioY`: UInt,
    public var `Anonymous`: `KS_VIDEOINFOHEADER2_0`,
    public var `dwReserved2`: UInt,
    public var `bmiHeader`: `KS_BITMAPINFOHEADER`,
)
// UNSUPPORTED Rust 5783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_VIDEOINFOHEADER2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5788:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union KS_VIDEOINFOHEADER2_0 {
//     pub dwControlFlags: u32,
//     pub dwReserved1: u32,
// }

// UNSUPPORTED Rust 5794:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KS_VIDEOINFOHEADER2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KS_VIDEOSTREAM_CAPTURE`: UInt = 2u;
public const val `KS_VIDEOSTREAM_CC`: UInt = 256u;
public const val `KS_VIDEOSTREAM_EDS`: UInt = 512u;
public const val `KS_VIDEOSTREAM_IS_VPE`: UInt = 32768u;
public const val `KS_VIDEOSTREAM_NABTS`: UInt = 32u;
public const val `KS_VIDEOSTREAM_PREVIEW`: UInt = 1u;
public const val `KS_VIDEOSTREAM_STILL`: UInt = 4096u;
public const val `KS_VIDEOSTREAM_TELETEXT`: UInt = 1024u;
public const val `KS_VIDEOSTREAM_VBI`: UInt = 16u;
public const val `KS_VIDEO_ALLOC_VPE_AGP`: UInt = 4u;
public const val `KS_VIDEO_ALLOC_VPE_DISPLAY`: UInt = 2u;
public const val `KS_VIDEO_ALLOC_VPE_SYSTEM`: UInt = 1u;
public const val `KS_VIDEO_FLAG_B_FRAME`: Int = 32;
public const val `KS_VIDEO_FLAG_FIELD1`: Int = 1;
public const val `KS_VIDEO_FLAG_FIELD1FIRST`: Int = 4;
public const val `KS_VIDEO_FLAG_FIELD2`: Int = 2;
public const val `KS_VIDEO_FLAG_FIELD_MASK`: Int = 3;
public const val `KS_VIDEO_FLAG_FRAME`: Int = 0;
public const val `KS_VIDEO_FLAG_IPB_MASK`: Int = 48;
public const val `KS_VIDEO_FLAG_I_FRAME`: Int = 0;
public const val `KS_VIDEO_FLAG_P_FRAME`: Int = 16;
public const val `KS_VIDEO_FLAG_REPEAT_FIELD`: Int = 64;
public const val `KS_VIDEO_FLAG_WEAVE`: Int = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KS_VIDEO_STREAM_CONFIG_CAPS` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `VideoStandard`: UInt,
    public var `InputSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `MinCroppingSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `MaxCroppingSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `CropGranularityX`: Int,
    public var `CropGranularityY`: Int,
    public var `CropAlignX`: Int,
    public var `CropAlignY`: Int,
    public var `MinOutputSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `MaxOutputSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `OutputGranularityX`: Int,
    public var `OutputGranularityY`: Int,
    public var `StretchTapsX`: Int,
    public var `StretchTapsY`: Int,
    public var `ShrinkTapsX`: Int,
    public var `ShrinkTapsY`: Int,
    public var `MinFrameInterval`: Long,
    public var `MaxFrameInterval`: Long,
    public var `MinBitsPerSecond`: Int,
    public var `MaxBitsPerSecond`: Int,
)
public const val `KS_VideoControlFlag_ExternalTriggerEnable`: `KS_VideoControlFlags` = 4;
public const val `KS_VideoControlFlag_FlipHorizontal`: `KS_VideoControlFlags` = 1;
public const val `KS_VideoControlFlag_FlipVertical`: `KS_VideoControlFlags` = 2;
public const val `KS_VideoControlFlag_IndependentImagePin`: `KS_VideoControlFlags` = 64;
public const val `KS_VideoControlFlag_StartPhotoSequenceCapture`: `KS_VideoControlFlags` = 256;
public const val `KS_VideoControlFlag_StillCapturePreviewFrame`: `KS_VideoControlFlags` = 128;
public const val `KS_VideoControlFlag_StopPhotoSequenceCapture`: `KS_VideoControlFlags` = 512;
public const val `KS_VideoControlFlag_Trigger`: `KS_VideoControlFlags` = 8;
public typealias `KS_VideoControlFlags` = Int;
public typealias `KS_VideoStreamingHints` = Int;
public const val `KS_iBLUE`: UInt = 2u;
public const val `KS_iEGA_COLORS`: UInt = 16u;
public const val `KS_iGREEN`: UInt = 1u;
public const val `KS_iMASK_COLORS`: UInt = 3u;
public const val `KS_iMAXBITS`: UInt = 8u;
public const val `KS_iPALETTE`: UInt = 8u;
public const val `KS_iPALETTE_COLORS`: UInt = 256u;
public const val `KS_iRED`: UInt = 0u;
public const val `KS_iTRUECOLOR`: UInt = 16u;
public const val `KsAllocatorMode_Kernel`: `KSALLOCATORMODE` = 1;
public const val `KsAllocatorMode_User`: `KSALLOCATORMODE` = 0;
public const val `KsIoOperation_Read`: `KSIOOPERATION` = 1;
public const val `KsIoOperation_Write`: `KSIOOPERATION` = 0;
public const val `KsPeekOperation_AddRef`: `KSPEEKOPERATION` = 1;
public const val `KsPeekOperation_PeekOnly`: `KSPEEKOPERATION` = 0;
public const val `LIGHT_FILTER`: `KSDS3D_HRTF_FILTER_QUALITY` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOOPEDSTREAMING_POSITION_EVENT_DATA` (
    public var `KsEventData`: `KSEVENTDATA`,
    public var `Position`: ULong,
)
// UNSUPPORTED Rust 5879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOOPEDSTREAMING_POSITION_EVENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAX_NABTS_VBI_LINES_PER_FIELD`: UInt = 11u;
public const val `MAX_RESOURCEGROUPID_LENGTH`: UInt = 256u;
public const val `MAX_SINK_DESCRIPTION_NAME_LENGTH`: UInt = 32u;
public const val `MAX_WST_VBI_LINES_PER_FIELD`: UInt = 17u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEDIUM_INFO` (
    public var `MediaPresent`: `windows_sys`.`core`.`BOOL`,
    public var `MediaType`: UInt,
    public var `RecordInhibit`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 5895:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MF_MDL_SHARED_PAYLOAD_KEY {
//     pub combined: MF_MDL_SHARED_PAYLOAD_KEY_0,
//     pub GMDLHandle: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 5901:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MF_MDL_SHARED_PAYLOAD_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MF_MDL_SHARED_PAYLOAD_KEY_0` (
    public var `pHandle`: UInt,
    public var `fHandle`: UInt,
    public var `uPayload`: ULong,
)
public const val `MIN_DEV_VER_FOR_FLAGS`: UInt = 272u;
public const val `MIN_DEV_VER_FOR_QI`: UInt = 256u;
public const val `MetadataId_BackgroundSegmentationMask`: `KSCAMERA_MetadataId` = 8;
public const val `MetadataId_CameraExtrinsics`: `KSCAMERA_MetadataId` = 4;
public const val `MetadataId_CameraIntrinsics`: `KSCAMERA_MetadataId` = 5;
public const val `MetadataId_CaptureStats`: `KSCAMERA_MetadataId` = 3;
public const val `MetadataId_Custom_Start`: `KSCAMERA_MetadataId` = -2147483648;
public const val `MetadataId_DigitalWindow`: `KSCAMERA_MetadataId` = 7;
public const val `MetadataId_FrameIllumination`: `KSCAMERA_MetadataId` = 6;
public const val `MetadataId_PhotoConfirmation`: `KSCAMERA_MetadataId` = 1;
public const val `MetadataId_Standard_End`: `KSCAMERA_MetadataId` = 8;
public const val `MetadataId_Standard_Start`: `KSCAMERA_MetadataId` = 1;
public const val `MetadataId_UsbVideoHeader`: `KSCAMERA_MetadataId` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 448 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NABTSFEC_BUFFER` (
    public var `dataSize`: UInt,
    public var `groupID`: UShort,
    public var `Reserved`: UShort,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 5934:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NABTSFEC_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NABTS_BUFFER` (
    public var `ScanlinesRequested`: `VBICODECFILTERING_SCANLINES`,
    public var `PictureNumber`: Long,
    public var `NabtsLines`: Array<`NABTS_BUFFER_LINE`>,
)
// UNSUPPORTED Rust 5946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NABTS_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NABTS_BUFFER_LINE` (
    public var `Confidence`: UByte,
    public var `Bytes`: UByteArray,
)
// UNSUPPORTED Rust 5957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NABTS_BUFFER_LINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NABTS_BUFFER_PICTURENUMBER_SUPPORT`: UInt = 1u;
public const val `NABTS_BYTES_PER_LINE`: UInt = 36u;
public const val `NABTS_LINES_PER_BUNDLE`: UInt = 16u;
public const val `NABTS_PAYLOAD_PER_LINE`: UInt = 28u;
public const val `NANOSECONDS`: UInt = 10000000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPTIMAL_WEIGHT_TOTALS` (
    public var `MinTotalNominator`: Long,
    public var `MaxTotalNominator`: Long,
    public var `TotalDenominator`: Long,
)
// UNSUPPORTED Rust 5974:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_DISPLAYPORT_OUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x21fbb329_1a4a_48da_a076_2318a3c59b26);

// UNSUPPORTED Rust 5975:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_HDMI_OUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x387bfc03_e7ef_4901_86e0_35b7c32b00ef);

// UNSUPPORTED Rust 5976:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38a0cd98_d49b_4ce8_b48a_344667a17830);

// UNSUPPORTED Rust 5977:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_SPDIF_IN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15dc9025_22ad_41b3_8875_f4ceb0299e20);

// UNSUPPORTED Rust 5978:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_SPDIF_OUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a264481_e52c_4b82_8e7a_c8e2f91dc380);

// UNSUPPORTED Rust 5979:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_ANALOGVIDEOIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4283_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5980:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4281_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5981:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_CC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4289_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5982:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_CC_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1aad8061_012d_11d2_b4b1_00a0d102cfbe);

// UNSUPPORTED Rust 5983:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_EDS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4287_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5984:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_NABTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4286_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5985:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_NABTS_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x29703660_498a_11d2_b4b1_00a0d102cfbe);

// UNSUPPORTED Rust 5986:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_PREVIEW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4282_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5987:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_STILL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c428a_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5988:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_TELETEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4288_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5989:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_TIMECODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c428b_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5990:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_VBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4284_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5991:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_VIDEOPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c4285_0353_11d1_905f_0000c0cc16ba);

// UNSUPPORTED Rust 5992:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PINNAME_VIDEO_VIDEOPORT_VBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c428c_0353_11d1_905f_0000c0cc16ba);

public typealias `PIPE_ALLOCATOR_PLACE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PIPE_DIMENSIONS` (
    public var `AllocatorPin`: `KS_COMPRESSION`,
    public var `MaxExpansionPin`: `KS_COMPRESSION`,
    public var `EndPin`: `KS_COMPRESSION`,
)
public typealias `PIPE_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PIPE_TERMINATION` (
    public var `Flags`: UInt,
    public var `OutsideFactors`: UInt,
    public var `Weigth`: UInt,
    public var `PhysicalRange`: `KS_FRAMING_RANGE`,
    public var `OptimalRange`: `KS_FRAMING_RANGE_WEIGHTED`,
    public var `Compression`: `KS_COMPRESSION`,
)
// UNSUPPORTED Rust 6012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_ALLOCATOR_CONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53171960_148e_11d2_9979_0000c0cc16ba);

// UNSUPPORTED Rust 6013:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_EXT_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5730a90_1a2c_11cf_8c23_00aa006b6814);

// UNSUPPORTED Rust 6014:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_EXT_TRANSPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa03cd5f0_3045_11cf_8c44_00aa006b6814);

// UNSUPPORTED Rust 6015:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_TIMECODE_READER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b496ce1_811b_11cf_8c77_00aa006b6814);

// UNSUPPORTED Rust 6016:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_TUNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0605_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6017:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CAMERACONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e13370_30ac_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6018:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CAMERACONTROL_FLASH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x785e8f49_63a2_4144_ab70_ffb278fa26ce);

// UNSUPPORTED Rust 6019:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CAMERACONTROL_IMAGE_PIN_CAPABILITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d3d7bbf_5c6d_4138_bb00_584edd20f7c5);

// UNSUPPORTED Rust 6020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CAMERACONTROL_REGION_OF_INTEREST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d12d198_f86c_4fed_b023_5d87653da793);

// UNSUPPORTED Rust 6021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CAMERACONTROL_VIDEO_STABILIZATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43964bd3_7716_404e_8be1_d299b20e50fd);

// UNSUPPORTED Rust 6022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_CROSSBAR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0640_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_DROPPEDFRAMES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e13344_30ac_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_SELECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1abdaeca_68b6_4f83_9371_b413907c7b9f);

// UNSUPPORTED Rust 6025:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_TVAUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0650_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_VIDEOCOMPRESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e13343_30ac_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_VIDEOCONTROL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0670_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_VIDEODECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e13350_30ac_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6029:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_VIDEOENCODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a2e0610_28e4_11d0_a18c_00a0c9118956);

// UNSUPPORTED Rust 6030:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPSETID_VIDCAP_VIDEOPROCAMP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e13360_30ac_11d0_a18c_00a0c9118956);

public const val `PipeFactor_Align`: UInt = 512u;
public const val `PipeFactor_Buffers`: UInt = 256u;
public const val `PipeFactor_FixedCompression`: UInt = 64u;
public const val `PipeFactor_Flags`: UInt = 8u;
public const val `PipeFactor_LogicalEnd`: UInt = 2048u;
public const val `PipeFactor_MemoryTypes`: UInt = 4u;
public const val `PipeFactor_None`: UInt = 0u;
public const val `PipeFactor_OptimalRanges`: UInt = 32u;
public const val `PipeFactor_PhysicalEnd`: UInt = 1024u;
public const val `PipeFactor_PhysicalRanges`: UInt = 16u;
public const val `PipeFactor_UnknownCompression`: UInt = 128u;
public const val `PipeFactor_UserModeDownstream`: UInt = 2u;
public const val `PipeFactor_UserModeUpstream`: UInt = 1u;
public const val `PipeState_CompressionUnknown`: `PIPE_STATE` = 3;
public const val `PipeState_DontCare`: `PIPE_STATE` = 0;
public const val `PipeState_Finalized`: `PIPE_STATE` = 4;
public const val `PipeState_RangeFixed`: `PIPE_STATE` = 2;
public const val `PipeState_RangeNotFixed`: `PIPE_STATE` = 1;
public const val `Pipe_Allocator_FirstPin`: `PIPE_ALLOCATOR_PLACE` = 1;
public const val `Pipe_Allocator_LastPin`: `PIPE_ALLOCATOR_PLACE` = 2;
public const val `Pipe_Allocator_MiddlePin`: `PIPE_ALLOCATOR_PLACE` = 3;
public const val `Pipe_Allocator_None`: `PIPE_ALLOCATOR_PLACE` = 0;
// UNSUPPORTED Rust 6053:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RT_RCDATA: windows_sys::core::PCWSTR = 10u16 as _;

// UNSUPPORTED Rust 6054:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RT_STRING: windows_sys::core::PCWSTR = 6u16 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURE_BUFFER_INFO` (
    public var `guidBufferIdentifier`: `windows_sys`.`core`.`GUID`,
    public var `cbBufferSize`: UInt,
    public var `cbCaptured`: UInt,
    public var `ullReserved`: ULongArray,
)
// UNSUPPORTED Rust 6063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECURE_BUFFER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SHORT_COEFF`: `KSDS3D_HRTF_COEFF_FORMAT` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SOUNDDETECTOR_PATTERNHEADER` (
    public var `Size`: UInt,
    public var `PatternType`: `windows_sys`.`core`.`GUID`,
)
public const val `SPEAKER_ALL`: UInt = 2147483648u;
public const val `SPEAKER_BACK_CENTER`: UInt = 256u;
public const val `SPEAKER_BACK_LEFT`: UInt = 16u;
public const val `SPEAKER_BACK_RIGHT`: UInt = 32u;
public const val `SPEAKER_FRONT_CENTER`: UInt = 4u;
public const val `SPEAKER_FRONT_LEFT`: UInt = 1u;
public const val `SPEAKER_FRONT_LEFT_OF_CENTER`: UInt = 64u;
public const val `SPEAKER_FRONT_RIGHT`: UInt = 2u;
public const val `SPEAKER_FRONT_RIGHT_OF_CENTER`: UInt = 128u;
public const val `SPEAKER_LOW_FREQUENCY`: UInt = 8u;
public const val `SPEAKER_RESERVED`: UInt = 2147221504u;
public const val `SPEAKER_SIDE_LEFT`: UInt = 512u;
public const val `SPEAKER_SIDE_RIGHT`: UInt = 1024u;
public const val `SPEAKER_TOP_BACK_CENTER`: UInt = 65536u;
public const val `SPEAKER_TOP_BACK_LEFT`: UInt = 32768u;
public const val `SPEAKER_TOP_BACK_RIGHT`: UInt = 131072u;
public const val `SPEAKER_TOP_CENTER`: UInt = 2048u;
public const val `SPEAKER_TOP_FRONT_CENTER`: UInt = 8192u;
public const val `SPEAKER_TOP_FRONT_LEFT`: UInt = 4096u;
public const val `SPEAKER_TOP_FRONT_RIGHT`: UInt = 16384u;
public const val `SYSAUDIO_FLAGS_CLEAR_PREFERRED`: UInt = 2u;
public const val `SYSAUDIO_FLAGS_DONT_COMBINE_PINS`: UInt = 1u;
public typealias `TELEPHONY_CALLCONTROLOP` = Int;
public const val `TELEPHONY_CALLCONTROLOP_DISABLE`: `TELEPHONY_CALLCONTROLOP` = 0;
public const val `TELEPHONY_CALLCONTROLOP_ENABLE`: `TELEPHONY_CALLCONTROLOP` = 1;
public typealias `TELEPHONY_CALLSTATE` = Int;
public const val `TELEPHONY_CALLSTATE_DISABLED`: `TELEPHONY_CALLSTATE` = 0;
public const val `TELEPHONY_CALLSTATE_ENABLED`: `TELEPHONY_CALLSTATE` = 1;
public const val `TELEPHONY_CALLSTATE_HOLD`: `TELEPHONY_CALLSTATE` = 2;
public const val `TELEPHONY_CALLSTATE_PROVIDERTRANSITION`: `TELEPHONY_CALLSTATE` = 3;
public typealias `TELEPHONY_CALLTYPE` = Int;
public const val `TELEPHONY_CALLTYPE_CIRCUITSWITCHED`: `TELEPHONY_CALLTYPE` = 0;
public const val `TELEPHONY_CALLTYPE_PACKETSWITCHED_LTE`: `TELEPHONY_CALLTYPE` = 1;
public const val `TELEPHONY_CALLTYPE_PACKETSWITCHED_WLAN`: `TELEPHONY_CALLTYPE` = 2;
public typealias `TELEPHONY_PROVIDERCHANGEOP` = Int;
public const val `TELEPHONY_PROVIDERCHANGEOP_BEGIN`: `TELEPHONY_PROVIDERCHANGEOP` = 1;
public const val `TELEPHONY_PROVIDERCHANGEOP_CANCEL`: `TELEPHONY_PROVIDERCHANGEOP` = 2;
public const val `TELEPHONY_PROVIDERCHANGEOP_END`: `TELEPHONY_PROVIDERCHANGEOP` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORTAUDIOPARMS` (
    public var `EnableOutput`: Int,
    public var `EnableRecord`: Int,
    public var `EnableSelsync`: Int,
    public var `Input`: Int,
    public var `MonitorSource`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSPORTBASICPARMS` (
    public var `TimeFormat`: Int,
    public var `TimeReference`: Int,
    public var `Superimpose`: Int,
    public var `EndStopAction`: Int,
    public var `RecordFormat`: Int,
    public var `StepFrames`: Int,
    public var `SetpField`: Int,
    public var `Preroll`: Int,
    public var `RecPreroll`: Int,
    public var `Postroll`: Int,
    public var `EditDelay`: Int,
    public var `PlayTCDelay`: Int,
    public var `RecTCDelay`: Int,
    public var `EditField`: Int,
    public var `FrameServo`: Int,
    public var `ColorFrameServo`: Int,
    public var `ServoRef`: Int,
    public var `WarnGenlock`: Int,
    public var `SetTracking`: Int,
    public var `VolumeName`: ByteArray,
    public var `Ballistic`: IntArray,
    public var `Speed`: Int,
    public var `CounterFormat`: Int,
    public var `TunerChannel`: Int,
    public var `TunerNumber`: Int,
    public var `TimerEvent`: Int,
    public var `TimerStartDay`: Int,
    public var `TimerStartTime`: Int,
    public var `TimerStopDay`: Int,
    public var `TimerStopTime`: Int,
)
// UNSUPPORTED Rust 6156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSPORTBASICPARMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORTSTATUS` (
    public var `Mode`: Int,
    public var `LastError`: Int,
    public var `RecordInhibit`: Int,
    public var `ServoLock`: Int,
    public var `MediaPresent`: Int,
    public var `MediaLength`: Int,
    public var `MediaSize`: Int,
    public var `MediaTrackCount`: Int,
    public var `MediaTrackLength`: Int,
    public var `MediaTrackSide`: Int,
    public var `MediaType`: Int,
    public var `LinkMode`: Int,
    public var `NotifyOn`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORTVIDEOPARMS` (
    public var `OutputMode`: Int,
    public var `Input`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORT_STATE` (
    public var `Mode`: UInt,
    public var `State`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TUNER_ANALOG_CAPS_S` (
    public var `Mode`: UInt,
    public var `StandardsSupported`: UInt,
    public var `MinFrequency`: UInt,
    public var `MaxFrequency`: UInt,
    public var `TuningGranularity`: UInt,
    public var `SettlingTime`: UInt,
    public var `ScanSensingRange`: UInt,
    public var `FineTuneSensingRange`: UInt,
)
public typealias `TunerLockType` = Int;
public const val `Tuner_LockType_Locked`: `TunerLockType` = 2;
public const val `Tuner_LockType_None`: `TunerLockType` = 0;
public const val `Tuner_LockType_Within_Scan_Sensing_Range`: `TunerLockType` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VBICAP_PROPERTIES_PROTECTION_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `StreamIndex`: UInt,
    public var `Status`: UInt,
)
// UNSUPPORTED Rust 6213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VBICAP_PROPERTIES_PROTECTION_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_CC_SUBSTREAMS` (
    public var `SubstreamMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VBICODECFILTERING_NABTS_SUBSTREAMS` (
    public var `SubstreamMask`: UIntArray,
)
// UNSUPPORTED Rust 6228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VBICODECFILTERING_NABTS_SUBSTREAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VBICODECFILTERING_SCANLINES` (
    public var `DwordBitArray`: UIntArray,
)
// UNSUPPORTED Rust 6238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VBICODECFILTERING_SCANLINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_CC` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_CC_PIN` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON_PIN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_COMMON` (
    public var `InputSRBsProcessed`: UInt,
    public var `OutputSRBsProcessed`: UInt,
    public var `SRBsIgnored`: UInt,
    public var `InputSRBsMissing`: UInt,
    public var `OutputSRBsMissing`: UInt,
    public var `OutputFailures`: UInt,
    public var `InternalErrors`: UInt,
    public var `ExternalErrors`: UInt,
    public var `InputDiscontinuities`: UInt,
    public var `DSPFailures`: UInt,
    public var `TvTunerChanges`: UInt,
    public var `VBIHeaderChanges`: UInt,
    public var `LineConfidenceAvg`: UInt,
    public var `BytesOutput`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_COMMON_PIN` (
    public var `SRBsProcessed`: UInt,
    public var `SRBsIgnored`: UInt,
    public var `SRBsMissing`: UInt,
    public var `InternalErrors`: UInt,
    public var `ExternalErrors`: UInt,
    public var `Discontinuities`: UInt,
    public var `LineConfidenceAvg`: UInt,
    public var `BytesOutput`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_NABTS` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON`,
    public var `FECBundleBadLines`: UInt,
    public var `FECQueueOverflows`: UInt,
    public var `FECCorrectedLines`: UInt,
    public var `FECUncorrectableLines`: UInt,
    public var `BundlesProcessed`: UInt,
    public var `BundlesSent2IP`: UInt,
    public var `FilteredLines`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_NABTS_PIN` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON_PIN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_TELETEXT` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VBICODECFILTERING_STATISTICS_TELETEXT_PIN` (
    public var `Common`: `VBICODECFILTERING_STATISTICS_COMMON_PIN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VRAM_SURFACE_INFO` (
    public var `hSurface`: ULong,
    public var `VramPhysicalAddress`: Long,
    public var `cbCaptured`: UInt,
    public var `dwWidth`: UInt,
    public var `dwHeight`: UInt,
    public var `dwLinearSize`: UInt,
    public var `lPitch`: Int,
    public var `ullReserved`: ULongArray,
)
// UNSUPPORTED Rust 6322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VRAM_SURFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VRAM_SURFACE_INFO_PROPERTY_S` (
    public var `Property`: `KSIDENTIFIER`,
    public var `pVramSurfaceInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VRAM_SURFACE_INFO`>?,
)
// UNSUPPORTED Rust 6333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VRAM_SURFACE_INFO_PROPERTY_S {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WAVE_FORMAT_EXTENSIBLE`: UInt = 65534u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WNF_KSCAMERA_STREAMSTATE_INFO` (
    public var `ProcessId`: UInt,
    public var `SessionId`: UInt,
    public var `StreamState`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WST_BUFFER` (
    public var `ScanlinesRequested`: `VBICODECFILTERING_SCANLINES`,
    public var `WstLines`: Array<`WST_BUFFER_LINE`>,
)
// UNSUPPORTED Rust 6353:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WST_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 42 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WST_BUFFER_LINE` (
    public var `Confidence`: UByte,
    public var `Bytes`: UByteArray,
)
// UNSUPPORTED Rust 6364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WST_BUFFER_LINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WST_BYTES_PER_LINE`: UInt = 42u;
public const val `WST_TVTUNER_CHANGE_BEGIN_TUNE`: Int = 4096;
public const val `WST_TVTUNER_CHANGE_END_TUNE`: Int = 8192;
public const val `eConnType3Point5mm`: `EPcxConnectionType` = 1;
public const val `eConnTypeAtapiInternal`: `EPcxConnectionType` = 3;
public const val `eConnTypeCombination`: `EPcxConnectionType` = 11;
public const val `eConnTypeMultichannelAnalogDIN`: `EPcxConnectionType` = 8;
public const val `eConnTypeOptical`: `EPcxConnectionType` = 5;
public const val `eConnTypeOtherAnalog`: `EPcxConnectionType` = 7;
public const val `eConnTypeOtherDigital`: `EPcxConnectionType` = 6;
public const val `eConnTypeQuarter`: `EPcxConnectionType` = 2;
public const val `eConnTypeRCA`: `EPcxConnectionType` = 4;
public const val `eConnTypeRJ11Modem`: `EPcxConnectionType` = 10;
public const val `eConnTypeUnknown`: `EPcxConnectionType` = 0;
public const val `eConnTypeXlrProfessional`: `EPcxConnectionType` = 9;
public const val `eDeviceControlUseMissing`: `EDeviceControlUseType` = 0;
public const val `eDeviceControlUsePrimary`: `EDeviceControlUseType` = 1;
public const val `eDeviceControlUseSecondary`: `EDeviceControlUseType` = 2;
public const val `eGenLocInternal`: `EPcxGenLocation` = 1;
public const val `eGenLocOther`: `EPcxGenLocation` = 3;
public const val `eGenLocPrimaryBox`: `EPcxGenLocation` = 0;
public const val `eGenLocSeparate`: `EPcxGenLocation` = 2;
public const val `eGeoLocATAPI`: `EPcxGeoLocation` = 13;
public const val `eGeoLocBottom`: `EPcxGeoLocation` = 6;
public const val `eGeoLocDrivebay`: `EPcxGeoLocation` = 10;
public const val `eGeoLocFront`: `EPcxGeoLocation` = 2;
public const val `eGeoLocHDMI`: `EPcxGeoLocation` = 11;
public const val `eGeoLocInsideMobileLid`: `EPcxGeoLocation` = 9;
public const val `eGeoLocLeft`: `EPcxGeoLocation` = 3;
public const val `eGeoLocNotApplicable`: `EPcxGeoLocation` = 14;
public const val `eGeoLocOutsideMobileLid`: `EPcxGeoLocation` = 12;
public const val `eGeoLocRear`: `EPcxGeoLocation` = 1;
public const val `eGeoLocRearPanel`: `EPcxGeoLocation` = 7;
public const val `eGeoLocReserved6`: `EPcxGeoLocation` = 15;
public const val `eGeoLocRight`: `EPcxGeoLocation` = 4;
public const val `eGeoLocRiser`: `EPcxGeoLocation` = 8;
public const val `eGeoLocTop`: `EPcxGeoLocation` = 5;
public const val `ePortConnBothIntegratedAndJack`: `EPxcPortConnection` = 2;
public const val `ePortConnIntegratedDevice`: `EPxcPortConnection` = 1;
public const val `ePortConnJack`: `EPxcPortConnection` = 0;
public const val `ePortConnUnknown`: `EPxcPortConnection` = 3;
