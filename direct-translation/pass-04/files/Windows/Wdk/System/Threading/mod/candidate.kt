// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCancelTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtCancelTimer`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `currentstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCreateTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Kernel"))]
public external fun `NtCreateTimer`(`timerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `timertype` : `super`.`super`.`super`.`Win32`.`System`.`Kernel`.`TIMER_TYPE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenEvent`(`eventhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_WindowsProgramming"))]
public external fun `NtOpenProcess`(`processhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `clientid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`System`.`WindowsProgramming`.`CLIENT_ID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenTimer`(`timerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryInformationProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryInformationProcess`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `processinformationclass` : `PROCESSINFOCLASS`, `processinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `processinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryInformationThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryInformationThread`(`threadhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `threadinformationclass` : `THREADINFOCLASS`, `threadinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `threadinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSetInformationThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSetInformationThread`(`threadhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `threadinformationclass` : `THREADINFOCLASS`, `threadinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `threadinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSetTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_System_SystemServices")]
public external fun `NtSetTimer`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `duetime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `timerapcroutine` : `super`.`SystemServices`.`PTIMER_APC_ROUTINE`, `timercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `resumetimer` : Boolean, `period` : Int, `previousstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSetTimerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSetTimerEx`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `timersetinformationclass` : `TIMER_SET_INFORMATION_CLASS`, `timersetinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timersetinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtTerminateProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtTerminateProcess`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `exitstatus` : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtWaitForSingleObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtWaitForSingleObject`(`handle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `alertable` : Boolean, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCancelTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwCancelTimer`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `currentstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCreateTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Kernel"))]
public external fun `ZwCreateTimer`(`timerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `timertype` : `super`.`super`.`super`.`Win32`.`System`.`Kernel`.`TIMER_TYPE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenEvent`(`eventhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_WindowsProgramming"))]
public external fun `ZwOpenProcess`(`processhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `clientid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`System`.`WindowsProgramming`.`CLIENT_ID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenTimer`(`timerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryInformationProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryInformationProcess`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `processinformationclass` : `PROCESSINFOCLASS`, `processinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `processinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryInformationThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryInformationThread`(`threadhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `threadinformationclass` : `THREADINFOCLASS`, `threadinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `threadinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSetInformationThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSetInformationThread`(`threadhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `threadinformationclass` : `THREADINFOCLASS`, `threadinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `threadinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSetTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_System_SystemServices")]
public external fun `ZwSetTimer`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `duetime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `timerapcroutine` : `super`.`SystemServices`.`PTIMER_APC_ROUTINE`, `timercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `resumetimer` : Boolean, `period` : Int, `previousstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSetTimerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSetTimerEx`(`timerhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `timersetinformationclass` : `TIMER_SET_INFORMATION_CLASS`, `timersetinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timersetinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwTerminateProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwTerminateProcess`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `exitstatus` : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwWaitForSingleObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwWaitForSingleObject`(`handle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `alertable` : Boolean, `timeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
public const val `MaxProcessInfoClass`: `PROCESSINFOCLASS` = 83;
public const val `MaxThreadInfoClass`: `THREADINFOCLASS` = 56;
public const val `MaxTimerInfoClass`: `TIMER_SET_INFORMATION_CLASS` = 1;
public typealias `PROCESSINFOCLASS` = Int;
public const val `ProcessAccessToken`: `PROCESSINFOCLASS` = 9;
public const val `ProcessAffinityMask`: `PROCESSINFOCLASS` = 21;
public const val `ProcessAffinityUpdateMode`: `PROCESSINFOCLASS` = 45;
public const val `ProcessBasePriority`: `PROCESSINFOCLASS` = 5;
public const val `ProcessBasicInformation`: `PROCESSINFOCLASS` = 0;
public const val `ProcessBreakOnTermination`: `PROCESSINFOCLASS` = 29;
public const val `ProcessCheckStackExtentsMode`: `PROCESSINFOCLASS` = 59;
public const val `ProcessCommandLineInformation`: `PROCESSINFOCLASS` = 60;
public const val `ProcessCommitReleaseInformation`: `PROCESSINFOCLASS` = 65;
public const val `ProcessCookie`: `PROCESSINFOCLASS` = 36;
public const val `ProcessCycleTime`: `PROCESSINFOCLASS` = 38;
public const val `ProcessDebugFlags`: `PROCESSINFOCLASS` = 31;
public const val `ProcessDebugObjectHandle`: `PROCESSINFOCLASS` = 30;
public const val `ProcessDebugPort`: `PROCESSINFOCLASS` = 7;
public const val `ProcessDefaultHardErrorMode`: `PROCESSINFOCLASS` = 12;
public const val `ProcessDeviceMap`: `PROCESSINFOCLASS` = 23;
public const val `ProcessDynamicFunctionTableInformation`: `PROCESSINFOCLASS` = 53;
public const val `ProcessEnableAlignmentFaultFixup`: `PROCESSINFOCLASS` = 17;
public const val `ProcessEnergyTrackingState`: `PROCESSINFOCLASS` = 82;
public const val `ProcessExceptionPort`: `PROCESSINFOCLASS` = 8;
public const val `ProcessExecuteFlags`: `PROCESSINFOCLASS` = 34;
public const val `ProcessFaultInformation`: `PROCESSINFOCLASS` = 63;
public const val `ProcessForegroundInformation`: `PROCESSINFOCLASS` = 25;
public const val `ProcessGroupInformation`: `PROCESSINFOCLASS` = 47;
public const val `ProcessHandleCheckingMode`: `PROCESSINFOCLASS` = 54;
public const val `ProcessHandleCount`: `PROCESSINFOCLASS` = 20;
public const val `ProcessHandleInformation`: `PROCESSINFOCLASS` = 51;
public const val `ProcessHandleTable`: `PROCESSINFOCLASS` = 58;
public const val `ProcessHandleTracing`: `PROCESSINFOCLASS` = 32;
public const val `ProcessImageFileMapping`: `PROCESSINFOCLASS` = 44;
public const val `ProcessImageFileName`: `PROCESSINFOCLASS` = 27;
public const val `ProcessImageFileNameWin32`: `PROCESSINFOCLASS` = 43;
public const val `ProcessImageInformation`: `PROCESSINFOCLASS` = 37;
public const val `ProcessInPrivate`: `PROCESSINFOCLASS` = 70;
public const val `ProcessInstrumentationCallback`: `PROCESSINFOCLASS` = 40;
public const val `ProcessIoCounters`: `PROCESSINFOCLASS` = 2;
public const val `ProcessIoPortHandlers`: `PROCESSINFOCLASS` = 13;
public const val `ProcessIoPriority`: `PROCESSINFOCLASS` = 33;
public const val `ProcessKeepAliveCount`: `PROCESSINFOCLASS` = 55;
public const val `ProcessLUIDDeviceMapsEnabled`: `PROCESSINFOCLASS` = 28;
public const val `ProcessLdtInformation`: `PROCESSINFOCLASS` = 10;
public const val `ProcessLdtSize`: `PROCESSINFOCLASS` = 11;
public const val `ProcessMemoryAllocationMode`: `PROCESSINFOCLASS` = 46;
public const val `ProcessMemoryExhaustion`: `PROCESSINFOCLASS` = 62;
public const val `ProcessMitigationPolicy`: `PROCESSINFOCLASS` = 52;
public const val `ProcessOwnerInformation`: `PROCESSINFOCLASS` = 49;
public const val `ProcessPagePriority`: `PROCESSINFOCLASS` = 39;
public const val `ProcessPooledUsageAndLimits`: `PROCESSINFOCLASS` = 14;
public const val `ProcessPriorityBoost`: `PROCESSINFOCLASS` = 22;
public const val `ProcessPriorityClass`: `PROCESSINFOCLASS` = 18;
public const val `ProcessProtectionInformation`: `PROCESSINFOCLASS` = 61;
public const val `ProcessQuotaLimits`: `PROCESSINFOCLASS` = 1;
public const val `ProcessRaisePriority`: `PROCESSINFOCLASS` = 6;
public const val `ProcessRaiseUMExceptionOnInvalidHandleClose`: `PROCESSINFOCLASS` = 71;
public const val `ProcessReserved1Information`: `PROCESSINFOCLASS` = 66;
public const val `ProcessReserved2Information`: `PROCESSINFOCLASS` = 67;
public const val `ProcessRevokeFileHandles`: `PROCESSINFOCLASS` = 56;
public const val `ProcessSessionInformation`: `PROCESSINFOCLASS` = 24;
public const val `ProcessSubsystemInformation`: `PROCESSINFOCLASS` = 75;
public const val `ProcessSubsystemProcess`: `PROCESSINFOCLASS` = 68;
public const val `ProcessTelemetryIdInformation`: `PROCESSINFOCLASS` = 64;
public const val `ProcessThreadStackAllocation`: `PROCESSINFOCLASS` = 41;
public const val `ProcessTimes`: `PROCESSINFOCLASS` = 4;
public const val `ProcessTlsInformation`: `PROCESSINFOCLASS` = 35;
public const val `ProcessTokenVirtualizationEnabled`: `PROCESSINFOCLASS` = 48;
public const val `ProcessUserModeIOPL`: `PROCESSINFOCLASS` = 16;
public const val `ProcessVmCounters`: `PROCESSINFOCLASS` = 3;
public const val `ProcessWin32kSyscallFilterInformation`: `PROCESSINFOCLASS` = 79;
public const val `ProcessWindowInformation`: `PROCESSINFOCLASS` = 50;
public const val `ProcessWorkingSetControl`: `PROCESSINFOCLASS` = 57;
public const val `ProcessWorkingSetWatch`: `PROCESSINFOCLASS` = 15;
public const val `ProcessWorkingSetWatchEx`: `PROCESSINFOCLASS` = 42;
public const val `ProcessWow64Information`: `PROCESSINFOCLASS` = 26;
public const val `ProcessWx86Information`: `PROCESSINFOCLASS` = 19;
public typealias `THREADINFOCLASS` = Int;
public typealias `TIMER_SET_INFORMATION_CLASS` = Int;
public const val `ThreadActualBasePriority`: `THREADINFOCLASS` = 25;
public const val `ThreadActualGroupAffinity`: `THREADINFOCLASS` = 41;
public const val `ThreadAffinityMask`: `THREADINFOCLASS` = 4;
public const val `ThreadAmILastThread`: `THREADINFOCLASS` = 12;
public const val `ThreadBasePriority`: `THREADINFOCLASS` = 3;
public const val `ThreadBasicInformation`: `THREADINFOCLASS` = 0;
public const val `ThreadBreakOnTermination`: `THREADINFOCLASS` = 18;
public const val `ThreadCSwitchMon`: `THREADINFOCLASS` = 27;
public const val `ThreadCSwitchPmu`: `THREADINFOCLASS` = 28;
public const val `ThreadCounterProfiling`: `THREADINFOCLASS` = 32;
public const val `ThreadCpuAccountingInformation`: `THREADINFOCLASS` = 34;
public const val `ThreadCycleTime`: `THREADINFOCLASS` = 23;
public const val `ThreadDescriptorTableEntry`: `THREADINFOCLASS` = 6;
public const val `ThreadDynamicCodePolicyInfo`: `THREADINFOCLASS` = 42;
public const val `ThreadEnableAlignmentFaultFixup`: `THREADINFOCLASS` = 7;
public const val `ThreadEventPair_Reusable`: `THREADINFOCLASS` = 8;
public const val `ThreadGroupInformation`: `THREADINFOCLASS` = 30;
public const val `ThreadHideFromDebugger`: `THREADINFOCLASS` = 17;
public const val `ThreadIdealProcessor`: `THREADINFOCLASS` = 13;
public const val `ThreadIdealProcessorEx`: `THREADINFOCLASS` = 33;
public const val `ThreadImpersonationToken`: `THREADINFOCLASS` = 5;
public const val `ThreadIoPriority`: `THREADINFOCLASS` = 22;
public const val `ThreadIsIoPending`: `THREADINFOCLASS` = 16;
public const val `ThreadIsTerminated`: `THREADINFOCLASS` = 20;
public const val `ThreadLastSystemCall`: `THREADINFOCLASS` = 21;
public const val `ThreadNameInformation`: `THREADINFOCLASS` = 38;
public const val `ThreadPagePriority`: `THREADINFOCLASS` = 24;
public const val `ThreadPerformanceCount`: `THREADINFOCLASS` = 11;
public const val `ThreadPriority`: `THREADINFOCLASS` = 2;
public const val `ThreadPriorityBoost`: `THREADINFOCLASS` = 14;
public const val `ThreadQuerySetWin32StartAddress`: `THREADINFOCLASS` = 9;
public const val `ThreadSetTlsArrayAddress`: `THREADINFOCLASS` = 15;
public const val `ThreadSubsystemInformation`: `THREADINFOCLASS` = 45;
public const val `ThreadSuspendCount`: `THREADINFOCLASS` = 35;
public const val `ThreadSwitchLegacyState`: `THREADINFOCLASS` = 19;
public const val `ThreadTebInformation`: `THREADINFOCLASS` = 26;
public const val `ThreadTimes`: `THREADINFOCLASS` = 1;
public const val `ThreadUmsInformation`: `THREADINFOCLASS` = 31;
public const val `ThreadWow64Context`: `THREADINFOCLASS` = 29;
public const val `ThreadZeroTlsCell`: `THREADINFOCLASS` = 10;
public const val `TimerSetCoalescableTimer`: `TIMER_SET_INFORMATION_CLASS` = 0;
