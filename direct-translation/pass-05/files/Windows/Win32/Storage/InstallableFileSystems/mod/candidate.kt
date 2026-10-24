// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterAttach; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterAttach`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpinstancename` : `windows_sys`.`core`.`PCWSTR`, `dwcreatedinstancenamelength` : UInt, `lpcreatedinstancename` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterAttachAtAltitude; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterAttachAtAltitude`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpaltitude` : `windows_sys`.`core`.`PCWSTR`, `lpinstancename` : `windows_sys`.`core`.`PCWSTR`, `dwcreatedinstancenamelength` : UInt, `lpcreatedinstancename` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterClose`(`hfilter` : `HFILTER`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterConnectCommunicationPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FilterConnectCommunicationPort`(`lpportname` : `windows_sys`.`core`.`PCWSTR`, `dwoptions` : UInt, `lpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wsizeofcontext` : UShort, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `hport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterCreate`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `hfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HFILTER`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterDetach; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterDetach`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpinstancename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterFindClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterFindClose`(`hfilterfind` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterFindFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterFindFirst`(`dwinformationclass` : `FILTER_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilterfind` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterFindNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterFindNext`(`hfilterfind` : `super`.`super`.`Foundation`.`HANDLE`, `dwinformationclass` : `FILTER_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterGetDosName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterGetDosName`(`lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpdosname` : `windows_sys`.`core`.`PWSTR`, `dwdosnamebuffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterGetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterGetInformation`(`hfilter` : `HFILTER`, `dwinformationclass` : `FILTER_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterGetMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `FilterGetMessage`(`hport` : `super`.`super`.`Foundation`.`HANDLE`, `lpmessagebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FILTER_MESSAGE_HEADER`>?, `dwmessagebuffersize` : UInt, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceClose`(`hinstance` : `HFILTER_INSTANCE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceCreate`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpinstancename` : `windows_sys`.`core`.`PCWSTR`, `hinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HFILTER_INSTANCE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceFindClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceFindClose`(`hfilterinstancefind` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceFindFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceFindFirst`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`, `dwinformationclass` : `INSTANCE_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilterinstancefind` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceFindNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceFindNext`(`hfilterinstancefind` : `super`.`super`.`Foundation`.`HANDLE`, `dwinformationclass` : `INSTANCE_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterInstanceGetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterInstanceGetInformation`(`hinstance` : `HFILTER_INSTANCE`, `dwinformationclass` : `INSTANCE_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterLoad`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterReplyMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterReplyMessage`(`hport` : `super`.`super`.`Foundation`.`HANDLE`, `lpreplybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`FILTER_REPLY_HEADER`>?, `dwreplybuffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterSendMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterSendMessage`(`hport` : `super`.`super`.`Foundation`.`HANDLE`, `lpinbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinbuffersize` : UInt, `lpoutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoutbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterUnload; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterUnload`(`lpfiltername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeFindClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeFindClose`(`hvolumefind` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeFindFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeFindFirst`(`dwinformationclass` : `FILTER_VOLUME_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpvolumefind` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeFindNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeFindNext`(`hvolumefind` : `super`.`super`.`Foundation`.`HANDLE`, `dwinformationclass` : `FILTER_VOLUME_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeInstanceFindClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeInstanceFindClose`(`hvolumeinstancefind` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeInstanceFindFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeInstanceFindFirst`(`lpvolumename` : `windows_sys`.`core`.`PCWSTR`, `dwinformationclass` : `INSTANCE_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpvolumeinstancefind` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltlib.dll, ABI=system, export=FilterVolumeInstanceFindNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FilterVolumeInstanceFindNext`(`hvolumeinstancefind` : `super`.`super`.`Foundation`.`HANDLE`, `dwinformationclass` : `INSTANCE_INFORMATION_CLASS`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_AGGREGATE_BASIC_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `Flags`: UInt,
    public var `Type`: `FILTER_AGGREGATE_BASIC_INFORMATION_0`,
)
// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_AGGREGATE_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 43:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILTER_AGGREGATE_BASIC_INFORMATION_0 {
//     pub MiniFilter: FILTER_AGGREGATE_BASIC_INFORMATION_0_0,
//     pub LegacyFilter: FILTER_AGGREGATE_BASIC_INFORMATION_0_1,
// }

// UNSUPPORTED Rust 49:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_AGGREGATE_BASIC_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_AGGREGATE_BASIC_INFORMATION_0_1` (
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_AGGREGATE_BASIC_INFORMATION_0_0` (
    public var `FrameID`: UInt,
    public var `NumberOfInstances`: UInt,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
    public var `FilterAltitudeLength`: UShort,
    public var `FilterAltitudeBufferOffset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_AGGREGATE_STANDARD_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `Flags`: UInt,
    public var `Type`: `FILTER_AGGREGATE_STANDARD_INFORMATION_0`,
)
// UNSUPPORTED Rust 77:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_AGGREGATE_STANDARD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 82:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILTER_AGGREGATE_STANDARD_INFORMATION_0 {
//     pub MiniFilter: FILTER_AGGREGATE_STANDARD_INFORMATION_0_0,
//     pub LegacyFilter: FILTER_AGGREGATE_STANDARD_INFORMATION_0_1,
// }

// UNSUPPORTED Rust 88:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_AGGREGATE_STANDARD_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_AGGREGATE_STANDARD_INFORMATION_0_1` (
    public var `Flags`: UInt,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
    public var `FilterAltitudeLength`: UShort,
    public var `FilterAltitudeBufferOffset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_AGGREGATE_STANDARD_INFORMATION_0_0` (
    public var `Flags`: UInt,
    public var `FrameID`: UInt,
    public var `NumberOfInstances`: UInt,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
    public var `FilterAltitudeLength`: UShort,
    public var `FilterAltitudeBufferOffset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_FULL_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `FrameID`: UInt,
    public var `NumberOfInstances`: UInt,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBuffer`: UShortArray,
)
// UNSUPPORTED Rust 122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_FULL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FILTER_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_MESSAGE_HEADER` (
    public var `ReplyLength`: UInt,
    public var `MessageId`: ULong,
)
public const val `FILTER_NAME_MAX_CHARS`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTER_REPLY_HEADER` (
    public var `Status`: `super`.`super`.`Foundation`.`NTSTATUS`,
    public var `MessageId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_VOLUME_BASIC_INFORMATION` (
    public var `FilterVolumeNameLength`: UShort,
    public var `FilterVolumeName`: UShortArray,
)
// UNSUPPORTED Rust 147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_VOLUME_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FILTER_VOLUME_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_VOLUME_STANDARD_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `Flags`: UInt,
    public var `FrameID`: UInt,
    public var `FileSystemType`: `FLT_FILESYSTEM_TYPE`,
    public var `FilterVolumeNameLength`: UShort,
    public var `FilterVolumeName`: UShortArray,
)
// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTER_VOLUME_STANDARD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLTFL_AGGREGATE_INFO_IS_LEGACYFILTER`: UInt = 2u;
public const val `FLTFL_AGGREGATE_INFO_IS_MINIFILTER`: UInt = 1u;
public const val `FLTFL_ASI_IS_LEGACYFILTER`: UInt = 2u;
public const val `FLTFL_ASI_IS_MINIFILTER`: UInt = 1u;
public const val `FLTFL_IASIL_DETACHED_VOLUME`: UInt = 1u;
public const val `FLTFL_IASIM_DETACHED_VOLUME`: UInt = 1u;
public const val `FLTFL_IASI_IS_LEGACYFILTER`: UInt = 2u;
public const val `FLTFL_IASI_IS_MINIFILTER`: UInt = 1u;
public const val `FLTFL_VSI_DETACHED_VOLUME`: UInt = 1u;
public typealias `FLT_FILESYSTEM_TYPE` = Int;
public const val `FLT_FSTYPE_BSUDF`: `FLT_FILESYSTEM_TYPE` = 12;
public const val `FLT_FSTYPE_CDFS`: `FLT_FILESYSTEM_TYPE` = 4;
public const val `FLT_FSTYPE_CIMFS`: `FLT_FILESYSTEM_TYPE` = 30;
public const val `FLT_FSTYPE_CSVFS`: `FLT_FILESYSTEM_TYPE` = 27;
public const val `FLT_FSTYPE_EXFAT`: `FLT_FILESYSTEM_TYPE` = 22;
public const val `FLT_FSTYPE_FAT`: `FLT_FILESYSTEM_TYPE` = 3;
public const val `FLT_FSTYPE_FS_REC`: `FLT_FILESYSTEM_TYPE` = 19;
public const val `FLT_FSTYPE_GPFS`: `FLT_FILESYSTEM_TYPE` = 24;
public const val `FLT_FSTYPE_INCD`: `FLT_FILESYSTEM_TYPE` = 20;
public const val `FLT_FSTYPE_INCD_FAT`: `FLT_FILESYSTEM_TYPE` = 21;
public const val `FLT_FSTYPE_LANMAN`: `FLT_FILESYSTEM_TYPE` = 6;
public const val `FLT_FSTYPE_MSFS`: `FLT_FILESYSTEM_TYPE` = 26;
public const val `FLT_FSTYPE_MS_NETWARE`: `FLT_FILESYSTEM_TYPE` = 10;
public const val `FLT_FSTYPE_MUP`: `FLT_FILESYSTEM_TYPE` = 13;
public const val `FLT_FSTYPE_NETWARE`: `FLT_FILESYSTEM_TYPE` = 11;
public const val `FLT_FSTYPE_NFS`: `FLT_FILESYSTEM_TYPE` = 9;
public const val `FLT_FSTYPE_NPFS`: `FLT_FILESYSTEM_TYPE` = 25;
public const val `FLT_FSTYPE_NTFS`: `FLT_FILESYSTEM_TYPE` = 2;
public const val `FLT_FSTYPE_OPENAFS`: `FLT_FILESYSTEM_TYPE` = 29;
public const val `FLT_FSTYPE_PSFS`: `FLT_FILESYSTEM_TYPE` = 23;
public const val `FLT_FSTYPE_RAW`: `FLT_FILESYSTEM_TYPE` = 1;
public const val `FLT_FSTYPE_RDPDR`: `FLT_FILESYSTEM_TYPE` = 8;
public const val `FLT_FSTYPE_REFS`: `FLT_FILESYSTEM_TYPE` = 28;
public const val `FLT_FSTYPE_ROXIO_UDF1`: `FLT_FILESYSTEM_TYPE` = 15;
public const val `FLT_FSTYPE_ROXIO_UDF2`: `FLT_FILESYSTEM_TYPE` = 16;
public const val `FLT_FSTYPE_ROXIO_UDF3`: `FLT_FILESYSTEM_TYPE` = 17;
public const val `FLT_FSTYPE_RSFX`: `FLT_FILESYSTEM_TYPE` = 14;
public const val `FLT_FSTYPE_TACIT`: `FLT_FILESYSTEM_TYPE` = 18;
public const val `FLT_FSTYPE_UDFS`: `FLT_FILESYSTEM_TYPE` = 5;
public const val `FLT_FSTYPE_UNKNOWN`: `FLT_FILESYSTEM_TYPE` = 0;
public const val `FLT_FSTYPE_WEBDAV`: `FLT_FILESYSTEM_TYPE` = 7;
public const val `FLT_PORT_FLAG_SYNC_HANDLE`: UInt = 1u;
public const val `FilterAggregateBasicInformation`: `FILTER_INFORMATION_CLASS` = 1;
public const val `FilterAggregateStandardInformation`: `FILTER_INFORMATION_CLASS` = 2;
public const val `FilterFullInformation`: `FILTER_INFORMATION_CLASS` = 0;
public const val `FilterVolumeBasicInformation`: `FILTER_VOLUME_INFORMATION_CLASS` = 0;
public const val `FilterVolumeStandardInformation`: `FILTER_VOLUME_INFORMATION_CLASS` = 1;
public typealias `HFILTER` = Long;
public typealias `HFILTER_INSTANCE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INSTANCE_AGGREGATE_STANDARD_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `Flags`: UInt,
    public var `Type`: `INSTANCE_AGGREGATE_STANDARD_INFORMATION_0`,
)
// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INSTANCE_AGGREGATE_STANDARD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 229:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INSTANCE_AGGREGATE_STANDARD_INFORMATION_0 {
//     pub MiniFilter: INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_0,
//     pub LegacyFilter: INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_1,
// }

// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INSTANCE_AGGREGATE_STANDARD_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_1` (
    public var `Flags`: UInt,
    public var `AltitudeLength`: UShort,
    public var `AltitudeBufferOffset`: UShort,
    public var `VolumeNameLength`: UShort,
    public var `VolumeNameBufferOffset`: UShort,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
    public var `SupportedFeatures`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_0` (
    public var `Flags`: UInt,
    public var `FrameID`: UInt,
    public var `VolumeFileSystemType`: `FLT_FILESYSTEM_TYPE`,
    public var `InstanceNameLength`: UShort,
    public var `InstanceNameBufferOffset`: UShort,
    public var `AltitudeLength`: UShort,
    public var `AltitudeBufferOffset`: UShort,
    public var `VolumeNameLength`: UShort,
    public var `VolumeNameBufferOffset`: UShort,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
    public var `SupportedFeatures`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTANCE_BASIC_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `InstanceNameLength`: UShort,
    public var `InstanceNameBufferOffset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTANCE_FULL_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `InstanceNameLength`: UShort,
    public var `InstanceNameBufferOffset`: UShort,
    public var `AltitudeLength`: UShort,
    public var `AltitudeBufferOffset`: UShort,
    public var `VolumeNameLength`: UShort,
    public var `VolumeNameBufferOffset`: UShort,
    public var `FilterNameLength`: UShort,
    public var `FilterNameBufferOffset`: UShort,
)
public typealias `INSTANCE_INFORMATION_CLASS` = Int;
public const val `INSTANCE_NAME_MAX_CHARS`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTANCE_PARTIAL_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `InstanceNameLength`: UShort,
    public var `InstanceNameBufferOffset`: UShort,
    public var `AltitudeLength`: UShort,
    public var `AltitudeBufferOffset`: UShort,
)
public const val `InstanceAggregateStandardInformation`: `INSTANCE_INFORMATION_CLASS` = 3;
public const val `InstanceBasicInformation`: `INSTANCE_INFORMATION_CLASS` = 0;
public const val `InstanceFullInformation`: `INSTANCE_INFORMATION_CLASS` = 2;
public const val `InstancePartialInformation`: `INSTANCE_INFORMATION_CLASS` = 1;
public const val `VOLUME_NAME_MAX_CHARS`: UInt = 1024u;
public const val `WNNC_CRED_MANAGER`: UInt = 4294901760u;
public const val `WNNC_NET_10NET`: UInt = 327680u;
public const val `WNNC_NET_3IN1`: UInt = 2555904u;
public const val `WNNC_NET_9P`: UInt = 4718592u;
public const val `WNNC_NET_9TILES`: UInt = 589824u;
public const val `WNNC_NET_APPLETALK`: UInt = 1245184u;
public const val `WNNC_NET_AS400`: UInt = 720896u;
public const val `WNNC_NET_AURISTOR_FS`: UInt = 4587520u;
public const val `WNNC_NET_AVID`: UInt = 1703936u;
public const val `WNNC_NET_AVID1`: UInt = 3801088u;
public const val `WNNC_NET_BMC`: UInt = 1572864u;
public const val `WNNC_NET_BWNFS`: UInt = 1048576u;
public const val `WNNC_NET_CLEARCASE`: UInt = 1441792u;
public const val `WNNC_NET_COGENT`: UInt = 1114112u;
public const val `WNNC_NET_CSC`: UInt = 2490368u;
public const val `WNNC_NET_DAV`: UInt = 3014656u;
public const val `WNNC_NET_DCE`: UInt = 1638400u;
public const val `WNNC_NET_DECORB`: UInt = 2097152u;
public const val `WNNC_NET_DFS`: UInt = 3866624u;
public const val `WNNC_NET_DISTINCT`: UInt = 2293760u;
public const val `WNNC_NET_DOCUSHARE`: UInt = 4521984u;
public const val `WNNC_NET_DOCUSPACE`: UInt = 1769472u;
public const val `WNNC_NET_DRIVEONWEB`: UInt = 4063232u;
public const val `WNNC_NET_EXIFS`: UInt = 2949120u;
public const val `WNNC_NET_EXTENDNET`: UInt = 2686976u;
public const val `WNNC_NET_FARALLON`: UInt = 1179648u;
public const val `WNNC_NET_FJ_REDIR`: UInt = 2228224u;
public const val `WNNC_NET_FOXBAT`: UInt = 2818048u;
public const val `WNNC_NET_FRONTIER`: UInt = 1507328u;
public const val `WNNC_NET_FTP_NFS`: UInt = 786432u;
public const val `WNNC_NET_GOOGLE`: UInt = 4390912u;
public const val `WNNC_NET_HOB_NFS`: UInt = 3276800u;
public const val `WNNC_NET_IBMAL`: UInt = 3407872u;
public const val `WNNC_NET_INTERGRAPH`: UInt = 1310720u;
public const val `WNNC_NET_KNOWARE`: UInt = 3080192u;
public const val `WNNC_NET_KWNP`: UInt = 3932160u;
public const val `WNNC_NET_LANMAN`: UInt = 131072u;
public const val `WNNC_NET_LANSTEP`: UInt = 524288u;
public const val `WNNC_NET_LANTASTIC`: UInt = 655360u;
public const val `WNNC_NET_LIFENET`: UInt = 917504u;
public const val `WNNC_NET_LOCK`: UInt = 3473408u;
public const val `WNNC_NET_LOCUS`: UInt = 393216u;
public const val `WNNC_NET_MANGOSOFT`: UInt = 1835008u;
public const val `WNNC_NET_MASFAX`: UInt = 3211264u;
public const val `WNNC_NET_MFILES`: UInt = 4259840u;
public const val `WNNC_NET_MSNET`: UInt = 65536u;
public const val `WNNC_NET_MS_NFS`: UInt = 4325376u;
public const val `WNNC_NET_NDFS`: UInt = 4456448u;
public const val `WNNC_NET_NETWARE`: UInt = 196608u;
public const val `WNNC_NET_OBJECT_DIRE`: UInt = 3145728u;
public const val `WNNC_NET_OPENAFS`: UInt = 3735552u;
public const val `WNNC_NET_PATHWORKS`: UInt = 851968u;
public const val `WNNC_NET_POWERLAN`: UInt = 983040u;
public const val `WNNC_NET_PROTSTOR`: UInt = 2162688u;
public const val `WNNC_NET_QUINCY`: UInt = 3670016u;
public const val `WNNC_NET_RDR2SAMPLE`: UInt = 2424832u;
public const val `WNNC_NET_RIVERFRONT1`: UInt = 1966080u;
public const val `WNNC_NET_RIVERFRONT2`: UInt = 2031616u;
public const val `WNNC_NET_RSFX`: UInt = 4194304u;
public const val `WNNC_NET_SECUREAGENT`: UInt = 4653056u;
public const val `WNNC_NET_SERNET`: UInt = 1900544u;
public const val `WNNC_NET_SHIVA`: UInt = 3342336u;
public const val `WNNC_NET_SMB`: UInt = 131072u;
public const val `WNNC_NET_SRT`: UInt = 3604480u;
public const val `WNNC_NET_STAC`: UInt = 2752512u;
public const val `WNNC_NET_SUN_PC_NFS`: UInt = 458752u;
public const val `WNNC_NET_SYMFONET`: UInt = 1376256u;
public const val `WNNC_NET_TERMSRV`: UInt = 3538944u;
public const val `WNNC_NET_TWINS`: UInt = 2359296u;
public const val `WNNC_NET_VINES`: UInt = 262144u;
public const val `WNNC_NET_VMWARE`: UInt = 4128768u;
public const val `WNNC_NET_YAHOO`: UInt = 2883584u;
public const val `WNNC_NET_ZENWORKS`: UInt = 3997696u;
