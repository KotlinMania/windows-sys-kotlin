// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQADsPathToFormatName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQADsPathToFormatName`(`lpwcsadspath` : `windows_sys`.`core`.`PCWSTR`, `lpwcsformatname` : `windows_sys`.`core`.`PWSTR`, `lpdwformatnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQBeginTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_DistributedTransactionCoordinator")]
public external fun `MQBeginTransaction`(`pptransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQCloseCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQCloseCursor`(`hcursor` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQCloseQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQCloseQueue`(`hqueue` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQCreateCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQCreateCursor`(`hqueue` : Long, `phcursor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQCreateQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQCreateQueue`(`psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `pqueueprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQQUEUEPROPS`>?, `lpwcsformatname` : `windows_sys`.`core`.`PWSTR`, `lpdwformatnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQDeleteQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQDeleteQueue`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQFreeMemory`(`pvmemory` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQFreeSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQFreeSecurityContext`(`hsecuritycontext` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetMachineProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQGetMachineProperties`(`lpwcsmachinename` : `windows_sys`.`core`.`PCWSTR`, `pguidmachineid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pqmprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQQMPROPS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetOverlappedResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `MQGetOverlappedResult`(`lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetPrivateComputerInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQGetPrivateComputerInformation`(`lpwcscomputername` : `windows_sys`.`core`.`PCWSTR`, `pprivateprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQPRIVATEPROPS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetQueueProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQGetQueueProperties`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`, `pqueueprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQQUEUEPROPS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetQueueSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `MQGetQueueSecurity`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`, `requestedinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `nlength` : UInt, `lpnlengthneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQGetSecurityContext`(`lpcertbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcertbufferlength` : UInt, `phsecuritycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQGetSecurityContextEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQGetSecurityContextEx`(`lpcertbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcertbufferlength` : UInt, `phsecuritycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQHandleToFormatName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQHandleToFormatName`(`hqueue` : Long, `lpwcsformatname` : `windows_sys`.`core`.`PWSTR`, `lpdwformatnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQInstanceToFormatName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQInstanceToFormatName`(`pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpwcsformatname` : `windows_sys`.`core`.`PWSTR`, `lpdwformatnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQLocateBegin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQLocateBegin`(`lpwcscontext` : `windows_sys`.`core`.`PCWSTR`, `prestriction` : /* Rust *const */ kotlinx.cinterop.CPointer<`MQRESTRICTION`>?, `pcolumns` : /* Rust *const */ kotlinx.cinterop.CPointer<`MQCOLUMNSET`>?, `psort` : /* Rust *const */ kotlinx.cinterop.CPointer<`MQSORTSET`>?, `phenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQLocateEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQLocateEnd`(`henum` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQLocateNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQLocateNext`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `pcprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `apropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQMarkMessageRejected; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQMarkMessageRejected`(`hqueue` : `super`.`super`.`Foundation`.`HANDLE`, `ulllookupid` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQMgmtAction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQMgmtAction`(`pcomputername` : `windows_sys`.`core`.`PCWSTR`, `pobjectname` : `windows_sys`.`core`.`PCWSTR`, `paction` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQMgmtGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQMgmtGetInfo`(`pcomputername` : `windows_sys`.`core`.`PCWSTR`, `pobjectname` : `windows_sys`.`core`.`PCWSTR`, `pmgmtprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQMGMTPROPS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQMoveMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_DistributedTransactionCoordinator")]
public external fun `MQMoveMessage`(`hsourcequeue` : Long, `hdestinationqueue` : Long, `ulllookupid` : ULong, `ptransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQOpenQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQOpenQueue`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`, `dwaccess` : UInt, `dwsharemode` : UInt, `phqueue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQPathNameToFormatName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQPathNameToFormatName`(`lpwcspathname` : `windows_sys`.`core`.`PCWSTR`, `lpwcsformatname` : `windows_sys`.`core`.`PWSTR`, `lpdwformatnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQPurgeQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQPurgeQueue`(`hqueue` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQReceiveMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_DistributedTransactionCoordinator", feature = "Win32_System_IO", feature = "Win32_System_Variant"))]
public external fun `MQReceiveMessage`(`hsource` : Long, `dwtimeout` : UInt, `dwaction` : UInt, `pmessageprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQMSGPROPS`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO`.`OVERLAPPED`>?, `fnreceivecallback` : `PMQRECEIVECALLBACK`, `hcursor` : `super`.`super`.`Foundation`.`HANDLE`, `ptransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQReceiveMessageByLookupId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_DistributedTransactionCoordinator", feature = "Win32_System_IO", feature = "Win32_System_Variant"))]
public external fun `MQReceiveMessageByLookupId`(`hsource` : Long, `ulllookupid` : ULong, `dwlookupaction` : UInt, `pmessageprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQMSGPROPS`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO`.`OVERLAPPED`>?, `fnreceivecallback` : `PMQRECEIVECALLBACK`, `ptransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQRegisterCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MQRegisterCertificate`(`dwflags` : UInt, `lpcertbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcertbufferlength` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQSendMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_DistributedTransactionCoordinator", feature = "Win32_System_Variant"))]
public external fun `MQSendMessage`(`hdestinationqueue` : Long, `pmessageprops` : /* Rust *const */ kotlinx.cinterop.CPointer<`MQMSGPROPS`>?, `ptransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQSetQueueProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `MQSetQueueProperties`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`, `pqueueprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MQQUEUEPROPS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mqrt.dll, ABI=system, export=MQSetQueueSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `MQSetQueueSecurity`(`lpwcsformatname` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : `super`.`super`.`Security`.`OBJECT_SECURITY_INFORMATION`, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : `windows_sys`.`core`.`HRESULT`
public const val `DEFAULT_M_ACKNOWLEDGE`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_APPSPECIFIC`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_AUTH_LEVEL`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_DELIVERY`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_JOURNAL`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_LOOKUPID`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_PRIORITY`: `MQDEFAULT` = 3;
public const val `DEFAULT_M_PRIV_LEVEL`: `MQDEFAULT` = 0;
public const val `DEFAULT_M_SENDERID_TYPE`: `MQDEFAULT` = 1;
public const val `DEFAULT_Q_AUTHENTICATE`: `MQDEFAULT` = 0;
public const val `DEFAULT_Q_BASEPRIORITY`: `MQDEFAULT` = 0;
public const val `DEFAULT_Q_JOURNAL`: `MQDEFAULT` = 0;
public const val `DEFAULT_Q_JOURNAL_QUOTA`: `MQDEFAULT` = -1;
public const val `DEFAULT_Q_PRIV_LEVEL`: `MQDEFAULT` = 1;
public const val `DEFAULT_Q_QUOTA`: `MQDEFAULT` = -1;
public const val `DEFAULT_Q_TRANSACTION`: `MQDEFAULT` = 0;
public typealias `FOREIGN_STATUS` = Int;
public const val `LONG_LIVED`: UInt = 4294967294u;
// UNSUPPORTED Rust 69:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MACHINE_ACTION_CONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("CONNECT");

// UNSUPPORTED Rust 70:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MACHINE_ACTION_DISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("DISCONNECT");

// UNSUPPORTED Rust 71:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MACHINE_ACTION_TIDY: windows_sys::core::PCWSTR = windows_sys::core::w!("TIDY");

// UNSUPPORTED Rust 72:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_CORRECT_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("YES");

// UNSUPPORTED Rust 73:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_FOREIGN_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("YES");

// UNSUPPORTED Rust 74:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_INCORRECT_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NO");

// UNSUPPORTED Rust 75:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_LOCAL_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCAL");

// UNSUPPORTED Rust 76:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_NOT_FOREIGN_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NO");

// UNSUPPORTED Rust 77:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_NOT_TRANSACTIONAL_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NO");

// UNSUPPORTED Rust 78:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_REMOTE_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("REMOTE");

// UNSUPPORTED Rust 79:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_CONNECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("CONNECTED");

// UNSUPPORTED Rust 80:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_DISCONNECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("DISCONNECTED");

// UNSUPPORTED Rust 81:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_DISCONNECTING: windows_sys::core::PCWSTR = windows_sys::core::w!("DISCONNECTING");

// UNSUPPORTED Rust 82:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_LOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCAL CONNECTION");

// UNSUPPORTED Rust 83:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_LOCKED: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCKED");

// UNSUPPORTED Rust 84:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_NEED_VALIDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("NEED VALIDATION");

// UNSUPPORTED Rust 85:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_NONACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("INACTIVE");

// UNSUPPORTED Rust 86:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_ONHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("ONHOLD");

// UNSUPPORTED Rust 87:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_STATE_WAITING: windows_sys::core::PCWSTR = windows_sys::core::w!("WAITING");

// UNSUPPORTED Rust 88:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TRANSACTIONAL_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("YES");

// UNSUPPORTED Rust 89:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TYPE_CONNECTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("CONNECTOR");

// UNSUPPORTED Rust 90:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TYPE_MACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("MACHINE");

// UNSUPPORTED Rust 91:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TYPE_MULTICAST: windows_sys::core::PCWSTR = windows_sys::core::w!("MULTICAST");

// UNSUPPORTED Rust 92:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TYPE_PRIVATE: windows_sys::core::PCWSTR = windows_sys::core::w!("PRIVATE");

// UNSUPPORTED Rust 93:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_TYPE_PUBLIC: windows_sys::core::PCWSTR = windows_sys::core::w!("PUBLIC");

// UNSUPPORTED Rust 94:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MGMT_QUEUE_UNKNOWN_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("UNKNOWN");

// UNSUPPORTED Rust 95:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MO_MACHINE_TOKEN: windows_sys::core::PCWSTR = windows_sys::core::w!("MACHINE");

// UNSUPPORTED Rust 96:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MO_QUEUE_TOKEN: windows_sys::core::PCWSTR = windows_sys::core::w!("QUEUE");

public typealias `MQACCESS` = Int;
public typealias `MQAUTHENTICATE` = Int;
public typealias `MQCALG` = Int;
public typealias `MQCERT_REGISTER` = Int;
public const val `MQCERT_REGISTER_ALWAYS`: `MQCERT_REGISTER` = 1;
public const val `MQCERT_REGISTER_IF_NOT_EXIST`: `MQCERT_REGISTER` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQCOLUMNSET` (
    public var `cCol`: UInt,
    public var `aCol`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MQCOLUMNSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MQCONN_BIND_SOCKET_FAILURE`: `MQConnectionState` = -2147483645;
public const val `MQCONN_CONNECT_SOCKET_FAILURE`: `MQConnectionState` = -2147483644;
public const val `MQCONN_CREATE_SOCKET_FAILURE`: `MQConnectionState` = -2147483646;
public const val `MQCONN_ESTABLISH_PACKET_RECEIVED`: `MQConnectionState` = 1;
public const val `MQCONN_INVALID_SERVER_CERT`: `MQConnectionState` = -2147483639;
public const val `MQCONN_LIMIT_REACHED`: `MQConnectionState` = -2147483638;
public const val `MQCONN_NAME_RESOLUTION_FAILURE`: `MQConnectionState` = -2147483640;
public const val `MQCONN_NOFAILURE`: `MQConnectionState` = 0;
public const val `MQCONN_NOT_READY`: `MQConnectionState` = -2147483641;
public const val `MQCONN_OUT_OF_MEMORY`: `MQConnectionState` = -2147483635;
public const val `MQCONN_PING_FAILURE`: `MQConnectionState` = -2147483647;
public const val `MQCONN_READY`: `MQConnectionState` = 2;
public const val `MQCONN_REFUSED_BY_OTHER_SIDE`: `MQConnectionState` = -2147483637;
public const val `MQCONN_ROUTING_FAILURE`: `MQConnectionState` = -2147483636;
public const val `MQCONN_SEND_FAILURE`: `MQConnectionState` = -2147483642;
public const val `MQCONN_TCP_NOT_ENABLED`: `MQConnectionState` = -2147483643;
public const val `MQCONN_UNKNOWN_FAILURE`: `MQConnectionState` = -2147483648;
public typealias `MQConnectionState` = Int;
public typealias `MQDEFAULT` = Int;
public typealias `MQERROR` = Int;
public typealias `MQJOURNAL` = Int;
public typealias `MQMAX` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQMGMTPROPS` (
    public var `cProp`: UInt,
    public var `aPropID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `aPropVar`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `aStatus`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQMGMTPROPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MQMSGACKNOWLEDGEMENT` = Int;
public typealias `MQMSGAUTHENTICATION` = Int;
public typealias `MQMSGAUTHLEVEL` = Int;
public typealias `MQMSGCLASS` = Int;
public typealias `MQMSGCURSOR` = Int;
public typealias `MQMSGDELIVERY` = Int;
public typealias `MQMSGIDSIZE` = Int;
public typealias `MQMSGJOURNAL` = Int;
public typealias `MQMSGMAX` = Int;
public typealias `MQMSGPRIVLEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQMSGPROPS` (
    public var `cProp`: UInt,
    public var `aPropID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `aPropVar`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `aStatus`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQMSGPROPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MQMSGSENDERIDTYPE` = Int;
public typealias `MQMSGTRACE` = Int;
public const val `MQMSG_ACKNOWLEDGMENT_FULL_REACH_QUEUE`: `MQMSGACKNOWLEDGEMENT` = 5;
public const val `MQMSG_ACKNOWLEDGMENT_FULL_RECEIVE`: `MQMSGACKNOWLEDGEMENT` = 14;
public const val `MQMSG_ACKNOWLEDGMENT_NACK_REACH_QUEUE`: `MQMSGACKNOWLEDGEMENT` = 4;
public const val `MQMSG_ACKNOWLEDGMENT_NACK_RECEIVE`: `MQMSGACKNOWLEDGEMENT` = 12;
public const val `MQMSG_ACKNOWLEDGMENT_NEG_ARRIVAL`: `MQMSGACKNOWLEDGEMENT` = 4;
public const val `MQMSG_ACKNOWLEDGMENT_NEG_RECEIVE`: `MQMSGACKNOWLEDGEMENT` = 8;
public const val `MQMSG_ACKNOWLEDGMENT_NONE`: `MQMSGACKNOWLEDGEMENT` = 0;
public const val `MQMSG_ACKNOWLEDGMENT_POS_ARRIVAL`: `MQMSGACKNOWLEDGEMENT` = 1;
public const val `MQMSG_ACKNOWLEDGMENT_POS_RECEIVE`: `MQMSGACKNOWLEDGEMENT` = 2;
public const val `MQMSG_AUTHENTICATED_QM_MESSAGE`: UInt = 11u;
public const val `MQMSG_AUTHENTICATED_SIG10`: `MQMSGAUTHENTICATION` = 1;
public const val `MQMSG_AUTHENTICATED_SIG20`: `MQMSGAUTHENTICATION` = 3;
public const val `MQMSG_AUTHENTICATED_SIG30`: `MQMSGAUTHENTICATION` = 5;
public const val `MQMSG_AUTHENTICATED_SIGXML`: `MQMSGAUTHENTICATION` = 9;
public const val `MQMSG_AUTHENTICATION_NOT_REQUESTED`: `MQMSGAUTHENTICATION` = 0;
public const val `MQMSG_AUTHENTICATION_REQUESTED`: `MQMSGAUTHENTICATION` = 1;
public const val `MQMSG_AUTHENTICATION_REQUESTED_EX`: `MQMSGAUTHENTICATION` = 3;
public const val `MQMSG_AUTH_LEVEL_ALWAYS`: `MQMSGAUTHLEVEL` = 1;
public const val `MQMSG_AUTH_LEVEL_MSMQ10`: `MQMSGAUTHLEVEL` = 2;
public const val `MQMSG_AUTH_LEVEL_MSMQ20`: `MQMSGAUTHLEVEL` = 4;
public const val `MQMSG_AUTH_LEVEL_NONE`: `MQMSGAUTHLEVEL` = 0;
public const val `MQMSG_AUTH_LEVEL_SIG10`: `MQMSGAUTHLEVEL` = 2;
public const val `MQMSG_AUTH_LEVEL_SIG20`: `MQMSGAUTHLEVEL` = 4;
public const val `MQMSG_AUTH_LEVEL_SIG30`: `MQMSGAUTHLEVEL` = 8;
public const val `MQMSG_CALG_DES`: `MQCALG` = 26113;
public const val `MQMSG_CALG_DSS_SIGN`: `MQCALG` = 8704;
public const val `MQMSG_CALG_MAC`: `MQCALG` = 32773;
public const val `MQMSG_CALG_MD2`: `MQCALG` = 32769;
public const val `MQMSG_CALG_MD4`: `MQCALG` = 32770;
public const val `MQMSG_CALG_MD5`: `MQCALG` = 32771;
public const val `MQMSG_CALG_RC2`: `MQCALG` = 26114;
public const val `MQMSG_CALG_RC4`: `MQCALG` = 26625;
public const val `MQMSG_CALG_RSA_KEYX`: `MQCALG` = 41984;
public const val `MQMSG_CALG_RSA_SIGN`: `MQCALG` = 9216;
public const val `MQMSG_CALG_SEAL`: `MQCALG` = 26626;
public const val `MQMSG_CALG_SHA`: `MQCALG` = 32772;
public const val `MQMSG_CALG_SHA1`: `MQCALG` = 32772;
public const val `MQMSG_CLASS_ACK_REACH_QUEUE`: `MQMSGCLASS` = 2;
public const val `MQMSG_CLASS_ACK_RECEIVE`: `MQMSGCLASS` = 16384;
public const val `MQMSG_CLASS_NACK_ACCESS_DENIED`: `MQMSGCLASS` = 32772;
public const val `MQMSG_CLASS_NACK_BAD_DST_Q`: `MQMSGCLASS` = 32768;
public const val `MQMSG_CLASS_NACK_BAD_ENCRYPTION`: `MQMSGCLASS` = 32775;
public const val `MQMSG_CLASS_NACK_BAD_SIGNATURE`: `MQMSGCLASS` = 32774;
public const val `MQMSG_CLASS_NACK_COULD_NOT_ENCRYPT`: `MQMSGCLASS` = 32776;
public const val `MQMSG_CLASS_NACK_HOP_COUNT_EXCEEDED`: `MQMSGCLASS` = 32773;
public const val `MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_MSG`: `MQMSGCLASS` = 32778;
public const val `MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_Q`: `MQMSGCLASS` = 32777;
public const val `MQMSG_CLASS_NACK_PURGED`: `MQMSGCLASS` = 32769;
public const val `MQMSG_CLASS_NACK_Q_DELETED`: `MQMSGCLASS` = 49152;
public const val `MQMSG_CLASS_NACK_Q_EXCEED_QUOTA`: `MQMSGCLASS` = 32771;
public const val `MQMSG_CLASS_NACK_Q_PURGED`: `MQMSGCLASS` = 49153;
public const val `MQMSG_CLASS_NACK_REACH_QUEUE_TIMEOUT`: `MQMSGCLASS` = 32770;
public const val `MQMSG_CLASS_NACK_RECEIVE_TIMEOUT`: `MQMSGCLASS` = 49154;
public const val `MQMSG_CLASS_NACK_RECEIVE_TIMEOUT_AT_SENDER`: `MQMSGCLASS` = 49155;
public const val `MQMSG_CLASS_NACK_SOURCE_COMPUTER_GUID_CHANGED`: `MQMSGCLASS` = 32780;
public const val `MQMSG_CLASS_NACK_UNSUPPORTED_CRYPTO_PROVIDER`: `MQMSGCLASS` = 32779;
public const val `MQMSG_CLASS_NORMAL`: `MQMSGCLASS` = 0;
public const val `MQMSG_CLASS_REPORT`: `MQMSGCLASS` = 1;
public const val `MQMSG_CORRELATIONID_SIZE`: `MQMSGIDSIZE` = 20;
public const val `MQMSG_CURRENT`: `MQMSGCURSOR` = 1;
public const val `MQMSG_DEADLETTER`: `MQMSGJOURNAL` = 1;
public const val `MQMSG_DELIVERY_EXPRESS`: `MQMSGDELIVERY` = 0;
public const val `MQMSG_DELIVERY_RECOVERABLE`: `MQMSGDELIVERY` = 1;
public const val `MQMSG_FIRST`: `MQMSGCURSOR` = 0;
public const val `MQMSG_FIRST_IN_XACT`: UInt = 1u;
public const val `MQMSG_JOURNAL`: `MQMSGJOURNAL` = 2;
public const val `MQMSG_JOURNAL_NONE`: `MQMSGJOURNAL` = 0;
public const val `MQMSG_LAST_IN_XACT`: UInt = 1u;
public const val `MQMSG_MSGID_SIZE`: `MQMSGIDSIZE` = 20;
public const val `MQMSG_NEXT`: `MQMSGCURSOR` = 2;
public const val `MQMSG_NOT_FIRST_IN_XACT`: UInt = 0u;
public const val `MQMSG_NOT_LAST_IN_XACT`: UInt = 0u;
public const val `MQMSG_PRIV_LEVEL_BODY_AES`: UInt = 5u;
public const val `MQMSG_PRIV_LEVEL_BODY_BASE`: `MQMSGPRIVLEVEL` = 1;
public const val `MQMSG_PRIV_LEVEL_BODY_ENHANCED`: `MQMSGPRIVLEVEL` = 3;
public const val `MQMSG_PRIV_LEVEL_NONE`: `MQMSGPRIVLEVEL` = 0;
public const val `MQMSG_SENDERID_TYPE_NONE`: `MQMSGSENDERIDTYPE` = 0;
public const val `MQMSG_SENDERID_TYPE_SID`: `MQMSGSENDERIDTYPE` = 1;
public const val `MQMSG_SEND_ROUTE_TO_REPORT_QUEUE`: `MQMSGTRACE` = 1;
public const val `MQMSG_TRACE_NONE`: `MQMSGTRACE` = 0;
public const val `MQMSG_XACTID_SIZE`: `MQMSGIDSIZE` = 20;
public typealias `MQPRIORITY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQPRIVATEPROPS` (
    public var `cProp`: UInt,
    public var `aPropID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `aPropVar`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `aStatus`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 269:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQPRIVATEPROPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MQPRIVLEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQPROPERTYRESTRICTION` (
    public var `rel`: UInt,
    public var `prop`: UInt,
    public var `prval`: `super`.`Com`.`StructuredStorage`.`PROPVARIANT`,
)
// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQPROPERTYRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQQMPROPS` (
    public var `cProp`: UInt,
    public var `aPropID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `aPropVar`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `aStatus`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 299:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQQMPROPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MQQUEUEACCESSMASK` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQQUEUEPROPS` (
    public var `cProp`: UInt,
    public var `aPropID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `aPropVar`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `aStatus`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQQUEUEPROPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQRESTRICTION` (
    public var `cRes`: UInt,
    public var `paPropRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MQPROPERTYRESTRICTION`>?,
)
// UNSUPPORTED Rust 328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for MQRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MQSEC_CHANGE_QUEUE_PERMISSIONS`: `MQQUEUEACCESSMASK` = 262144u;
public const val `MQSEC_DELETE_JOURNAL_MESSAGE`: `MQQUEUEACCESSMASK` = 8u;
public const val `MQSEC_DELETE_MESSAGE`: `MQQUEUEACCESSMASK` = 1u;
public const val `MQSEC_DELETE_QUEUE`: `MQQUEUEACCESSMASK` = 65536u;
public const val `MQSEC_GET_QUEUE_PERMISSIONS`: `MQQUEUEACCESSMASK` = 131072u;
public const val `MQSEC_GET_QUEUE_PROPERTIES`: `MQQUEUEACCESSMASK` = 32u;
public const val `MQSEC_PEEK_MESSAGE`: `MQQUEUEACCESSMASK` = 2u;
public const val `MQSEC_QUEUE_GENERIC_ALL`: `MQQUEUEACCESSMASK` = 983103u;
public const val `MQSEC_QUEUE_GENERIC_EXECUTE`: `MQQUEUEACCESSMASK` = 0u;
public const val `MQSEC_QUEUE_GENERIC_READ`: `MQQUEUEACCESSMASK` = 131115u;
public const val `MQSEC_QUEUE_GENERIC_WRITE`: `MQQUEUEACCESSMASK` = 131108u;
public const val `MQSEC_RECEIVE_JOURNAL_MESSAGE`: `MQQUEUEACCESSMASK` = 10u;
public const val `MQSEC_RECEIVE_MESSAGE`: `MQQUEUEACCESSMASK` = 3u;
public const val `MQSEC_SET_QUEUE_PROPERTIES`: `MQQUEUEACCESSMASK` = 16u;
public const val `MQSEC_TAKE_QUEUE_OWNERSHIP`: `MQQUEUEACCESSMASK` = 524288u;
public const val `MQSEC_WRITE_MESSAGE`: `MQQUEUEACCESSMASK` = 4u;
public typealias `MQSHARE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MQSORTKEY` (
    public var `propColumn`: UInt,
    public var `dwOrder`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MQSORTSET` (
    public var `cCol`: UInt,
    public var `aCol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MQSORTKEY`>?,
)
// UNSUPPORTED Rust 363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MQSORTSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MQTRANSACTION` = Int;
public typealias `MQTRANSACTIONAL` = Int;
public typealias `MQWARNING` = Int;
public const val `MQ_ACTION_PEEK_CURRENT`: UInt = 2147483648u;
public const val `MQ_ACTION_PEEK_NEXT`: UInt = 2147483649u;
public const val `MQ_ACTION_RECEIVE`: UInt = 0u;
public const val `MQ_ADMIN_ACCESS`: `MQACCESS` = 128;
public const val `MQ_AUTHENTICATE`: `MQAUTHENTICATE` = 1;
public const val `MQ_AUTHENTICATE_NONE`: `MQAUTHENTICATE` = 0;
public const val `MQ_CORRUPTED_QUEUE_WAS_DELETED`: `MQERROR` = -1072824216;
public const val `MQ_DENY_NONE`: `MQSHARE` = 0;
public const val `MQ_DENY_RECEIVE_SHARE`: `MQSHARE` = 1;
public const val `MQ_ERROR`: `MQERROR` = -1072824319;
public const val `MQ_ERROR_ACCESS_DENIED`: `MQERROR` = -1072824283;
public const val `MQ_ERROR_BAD_SECURITY_CONTEXT`: `MQERROR` = -1072824267;
public const val `MQ_ERROR_BAD_XML_FORMAT`: `MQERROR` = -1072824174;
public const val `MQ_ERROR_BUFFER_OVERFLOW`: `MQERROR` = -1072824294;
public const val `MQ_ERROR_CANNOT_CREATE_CERT_STORE`: `MQERROR` = -1072824209;
public const val `MQ_ERROR_CANNOT_CREATE_HASH_EX`: `MQERROR` = -1072824191;
public const val `MQ_ERROR_CANNOT_CREATE_ON_GC`: `MQERROR` = -1072824201;
public const val `MQ_ERROR_CANNOT_CREATE_PSC_OBJECTS`: `MQERROR` = -1072824171;
public const val `MQ_ERROR_CANNOT_DELETE_PSC_OBJECTS`: `MQERROR` = -1072824189;
public const val `MQ_ERROR_CANNOT_GET_DN`: `MQERROR` = -1072824194;
public const val `MQ_ERROR_CANNOT_GRANT_ADD_GUID`: `MQERROR` = -1072824206;
public const val `MQ_ERROR_CANNOT_HASH_DATA_EX`: `MQERROR` = -1072824193;
public const val `MQ_ERROR_CANNOT_IMPERSONATE_CLIENT`: `MQERROR` = -1072824284;
public const val `MQ_ERROR_CANNOT_JOIN_DOMAIN`: `MQERROR` = -1072824202;
public const val `MQ_ERROR_CANNOT_LOAD_MQAD`: `MQERROR` = -1072824187;
public const val `MQ_ERROR_CANNOT_LOAD_MQDSSRV`: `MQERROR` = -1072824186;
public const val `MQ_ERROR_CANNOT_LOAD_MSMQOCM`: `MQERROR` = -1072824205;
public const val `MQ_ERROR_CANNOT_OPEN_CERT_STORE`: `MQERROR` = -1072824208;
public const val `MQ_ERROR_CANNOT_SET_CRYPTO_SEC_DESCR`: `MQERROR` = -1072824212;
public const val `MQ_ERROR_CANNOT_SIGN_DATA_EX`: `MQERROR` = -1072824192;
public const val `MQ_ERROR_CANNOT_UPDATE_PSC_OBJECTS`: `MQERROR` = -1072824170;
public const val `MQ_ERROR_CANT_CREATE_CERT_STORE`: `MQERROR` = -1072824209;
public const val `MQ_ERROR_CANT_OPEN_CERT_STORE`: `MQERROR` = -1072824208;
public const val `MQ_ERROR_CANT_RESOLVE_SITES`: `MQERROR` = -1072824183;
public const val `MQ_ERROR_CERTIFICATE_NOT_PROVIDED`: `MQERROR` = -1072824211;
public const val `MQ_ERROR_COMPUTER_DOES_NOT_SUPPORT_ENCRYPTION`: `MQERROR` = -1072824269;
public const val `MQ_ERROR_CORRUPTED_INTERNAL_CERTIFICATE`: `MQERROR` = -1072824275;
public const val `MQ_ERROR_CORRUPTED_PERSONAL_CERT_STORE`: `MQERROR` = -1072824271;
public const val `MQ_ERROR_CORRUPTED_SECURITY_DATA`: `MQERROR` = -1072824272;
public const val `MQ_ERROR_COULD_NOT_GET_ACCOUNT_INFO`: `MQERROR` = -1072824265;
public const val `MQ_ERROR_COULD_NOT_GET_USER_SID`: `MQERROR` = -1072824266;
public const val `MQ_ERROR_DELETE_CN_IN_USE`: `MQERROR` = -1072824248;
public const val `MQ_ERROR_DEPEND_WKS_LICENSE_OVERFLOW`: `MQERROR` = -1072824217;
public const val `MQ_ERROR_DS_BIND_ROOT_FOREST`: `MQERROR` = -1072824177;
public const val `MQ_ERROR_DS_ERROR`: `MQERROR` = -1072824253;
public const val `MQ_ERROR_DS_IS_FULL`: `MQERROR` = -1072824254;
public const val `MQ_ERROR_DS_LOCAL_USER`: `MQERROR` = -1072824176;
public const val `MQ_ERROR_DTC_CONNECT`: `MQERROR` = -1072824244;
public const val `MQ_ERROR_ENCRYPTION_PROVIDER_NOT_SUPPORTED`: `MQERROR` = -1072824213;
public const val `MQ_ERROR_FAIL_VERIFY_SIGNATURE_EX`: `MQERROR` = -1072824190;
public const val `MQ_ERROR_FORMATNAME_BUFFER_TOO_SMALL`: `MQERROR` = -1072824289;
public const val `MQ_ERROR_GC_NEEDED`: `MQERROR` = -1072824178;
public const val `MQ_ERROR_GUID_NOT_MATCHING`: `MQERROR` = -1072824200;
public const val `MQ_ERROR_ILLEGAL_CONTEXT`: `MQERROR` = -1072824229;
public const val `MQ_ERROR_ILLEGAL_CURSOR_ACTION`: `MQERROR` = -1072824292;
public const val `MQ_ERROR_ILLEGAL_ENTERPRISE_OPERATION`: `MQERROR` = -1072824207;
public const val `MQ_ERROR_ILLEGAL_FORMATNAME`: `MQERROR` = -1072824290;
public const val `MQ_ERROR_ILLEGAL_MQCOLUMNS`: `MQERROR` = -1072824264;
public const val `MQ_ERROR_ILLEGAL_MQPRIVATEPROPS`: `MQERROR` = -1072824197;
public const val `MQ_ERROR_ILLEGAL_MQQMPROPS`: `MQERROR` = -1072824255;
public const val `MQ_ERROR_ILLEGAL_MQQUEUEPROPS`: `MQERROR` = -1072824259;
public const val `MQ_ERROR_ILLEGAL_OPERATION`: `MQERROR` = -1072824220;
public const val `MQ_ERROR_ILLEGAL_PROPERTY_SIZE`: `MQERROR` = -1072824261;
public const val `MQ_ERROR_ILLEGAL_PROPERTY_VALUE`: `MQERROR` = -1072824296;
public const val `MQ_ERROR_ILLEGAL_PROPERTY_VT`: `MQERROR` = -1072824295;
public const val `MQ_ERROR_ILLEGAL_PROPID`: `MQERROR` = -1072824263;
public const val `MQ_ERROR_ILLEGAL_QUEUE_PATHNAME`: `MQERROR` = -1072824300;
public const val `MQ_ERROR_ILLEGAL_RELATION`: `MQERROR` = -1072824262;
public const val `MQ_ERROR_ILLEGAL_RESTRICTION_PROPID`: `MQERROR` = -1072824260;
public const val `MQ_ERROR_ILLEGAL_SECURITY_DESCRIPTOR`: `MQERROR` = -1072824287;
public const val `MQ_ERROR_ILLEGAL_SORT`: `MQERROR` = -1072824304;
public const val `MQ_ERROR_ILLEGAL_SORT_PROPID`: `MQERROR` = -1072824228;
public const val `MQ_ERROR_ILLEGAL_USER`: `MQERROR` = -1072824303;
public const val `MQ_ERROR_INSUFFICIENT_PROPERTIES`: `MQERROR` = -1072824257;
public const val `MQ_ERROR_INSUFFICIENT_RESOURCES`: `MQERROR` = -1072824281;
public const val `MQ_ERROR_INTERNAL_USER_CERT_EXIST`: `MQERROR` = -1072824274;
public const val `MQ_ERROR_INVALID_CERTIFICATE`: `MQERROR` = -1072824276;
public const val `MQ_ERROR_INVALID_HANDLE`: `MQERROR` = -1072824313;
public const val `MQ_ERROR_INVALID_OWNER`: `MQERROR` = -1072824252;
public const val `MQ_ERROR_INVALID_PARAMETER`: `MQERROR` = -1072824314;
public const val `MQ_ERROR_IO_TIMEOUT`: `MQERROR` = -1072824293;
public const val `MQ_ERROR_LABEL_BUFFER_TOO_SMALL`: `MQERROR` = -1072824226;
public const val `MQ_ERROR_LABEL_TOO_LONG`: `MQERROR` = -1072824227;
public const val `MQ_ERROR_MACHINE_EXISTS`: `MQERROR` = -1072824256;
public const val `MQ_ERROR_MACHINE_NOT_FOUND`: `MQERROR` = -1072824307;
public const val `MQ_ERROR_MESSAGE_ALREADY_RECEIVED`: `MQERROR` = -1072824291;
public const val `MQ_ERROR_MESSAGE_LOCKED_UNDER_TRANSACTION`: Int = -1072824164;
public const val `MQ_ERROR_MESSAGE_NOT_AUTHENTICATED`: Int = -1072824165;
public const val `MQ_ERROR_MESSAGE_NOT_FOUND`: `MQERROR` = -1072824184;
public const val `MQ_ERROR_MESSAGE_STORAGE_FAILED`: `MQERROR` = -1072824278;
public const val `MQ_ERROR_MISSING_CONNECTOR_TYPE`: `MQERROR` = -1072824235;
public const val `MQ_ERROR_MQIS_READONLY_MODE`: `MQERROR` = -1072824224;
public const val `MQ_ERROR_MQIS_SERVER_EMPTY`: `MQERROR` = -1072824225;
public const val `MQ_ERROR_MULTI_SORT_KEYS`: `MQERROR` = -1072824179;
public const val `MQ_ERROR_NOT_A_CORRECT_OBJECT_CLASS`: `MQERROR` = -1072824180;
public const val `MQ_ERROR_NOT_SUPPORTED_BY_DEPENDENT_CLIENTS`: `MQERROR` = -1072824182;
public const val `MQ_ERROR_NO_DS`: `MQERROR` = -1072824301;
public const val `MQ_ERROR_NO_ENTRY_POINT_MSMQOCM`: `MQERROR` = -1072824204;
public const val `MQ_ERROR_NO_GC_IN_DOMAIN`: `MQERROR` = -1072824196;
public const val `MQ_ERROR_NO_INTERNAL_USER_CERT`: `MQERROR` = -1072824273;
public const val `MQ_ERROR_NO_MQUSER_OU`: `MQERROR` = -1072824188;
public const val `MQ_ERROR_NO_MSMQ_SERVERS_ON_DC`: `MQERROR` = -1072824203;
public const val `MQ_ERROR_NO_MSMQ_SERVERS_ON_GC`: `MQERROR` = -1072824195;
public const val `MQ_ERROR_NO_RESPONSE_FROM_OBJECT_SERVER`: `MQERROR` = -1072824247;
public const val `MQ_ERROR_OBJECT_SERVER_NOT_AVAILABLE`: `MQERROR` = -1072824246;
public const val `MQ_ERROR_OPERATION_CANCELLED`: `MQERROR` = -1072824312;
public const val `MQ_ERROR_OPERATION_NOT_SUPPORTED_BY_REMOTE_COMPUTER`: `MQERROR` = -1072824181;
public const val `MQ_ERROR_PRIVILEGE_NOT_HELD`: `MQERROR` = -1072824282;
public const val `MQ_ERROR_PROPERTIES_CONFLICT`: `MQERROR` = -1072824185;
public const val `MQ_ERROR_PROPERTY`: `MQERROR` = -1072824318;
public const val `MQ_ERROR_PROPERTY_NOTALLOWED`: `MQERROR` = -1072824258;
public const val `MQ_ERROR_PROV_NAME_BUFFER_TOO_SMALL`: `MQERROR` = -1072824221;
public const val `MQ_ERROR_PUBLIC_KEY_DOES_NOT_EXIST`: `MQERROR` = -1072824198;
public const val `MQ_ERROR_PUBLIC_KEY_NOT_FOUND`: `MQERROR` = -1072824199;
public const val `MQ_ERROR_QUEUE_DELETED`: `MQERROR` = -1072824230;
public const val `MQ_ERROR_QUEUE_EXISTS`: `MQERROR` = -1072824315;
public const val `MQ_ERROR_QUEUE_NOT_ACTIVE`: `MQERROR` = -1072824316;
public const val `MQ_ERROR_QUEUE_NOT_AVAILABLE`: `MQERROR` = -1072824245;
public const val `MQ_ERROR_QUEUE_NOT_FOUND`: `MQERROR` = -1072824317;
public const val `MQ_ERROR_Q_ADS_PROPERTY_NOT_SUPPORTED`: `MQERROR` = -1072824175;
public const val `MQ_ERROR_Q_DNS_PROPERTY_NOT_SUPPORTED`: `MQERROR` = -1072824210;
public const val `MQ_ERROR_REMOTE_MACHINE_NOT_AVAILABLE`: `MQERROR` = -1072824215;
public const val `MQ_ERROR_RESOLVE_ADDRESS`: Int = -1072824167;
public const val `MQ_ERROR_RESULT_BUFFER_TOO_SMALL`: `MQERROR` = -1072824250;
public const val `MQ_ERROR_SECURITY_DESCRIPTOR_TOO_SMALL`: `MQERROR` = -1072824285;
public const val `MQ_ERROR_SENDERID_BUFFER_TOO_SMALL`: `MQERROR` = -1072824286;
public const val `MQ_ERROR_SENDER_CERT_BUFFER_TOO_SMALL`: `MQERROR` = -1072824277;
public const val `MQ_ERROR_SERVICE_NOT_AVAILABLE`: `MQERROR` = -1072824309;
public const val `MQ_ERROR_SHARING_VIOLATION`: `MQERROR` = -1072824311;
public const val `MQ_ERROR_SIGNATURE_BUFFER_TOO_SMALL`: `MQERROR` = -1072824222;
public const val `MQ_ERROR_STALE_HANDLE`: `MQERROR` = -1072824234;
public const val `MQ_ERROR_SYMM_KEY_BUFFER_TOO_SMALL`: `MQERROR` = -1072824223;
public const val `MQ_ERROR_TOO_MANY_PROPERTIES`: Int = -1072824166;
public const val `MQ_ERROR_TRANSACTION_ENLIST`: `MQERROR` = -1072824232;
public const val `MQ_ERROR_TRANSACTION_IMPORT`: `MQERROR` = -1072824242;
public const val `MQ_ERROR_TRANSACTION_SEQUENCE`: `MQERROR` = -1072824239;
public const val `MQ_ERROR_TRANSACTION_USAGE`: `MQERROR` = -1072824240;
public const val `MQ_ERROR_UNINITIALIZED_OBJECT`: `MQERROR` = -1072824172;
public const val `MQ_ERROR_UNSUPPORTED_ACCESS_MODE`: `MQERROR` = -1072824251;
public const val `MQ_ERROR_UNSUPPORTED_CLASS`: `MQERROR` = -1072824173;
public const val `MQ_ERROR_UNSUPPORTED_FORMATNAME_OPERATION`: `MQERROR` = -1072824288;
public const val `MQ_ERROR_UNSUPPORTED_OPERATION`: `MQERROR` = -1072824214;
public const val `MQ_ERROR_USER_BUFFER_TOO_SMALL`: `MQERROR` = -1072824280;
public const val `MQ_ERROR_WKS_CANT_SERVE_CLIENT`: `MQERROR` = -1072824218;
public const val `MQ_ERROR_WRITE_NOT_ALLOWED`: `MQERROR` = -1072824219;
public const val `MQ_INFORMATION_DUPLICATE_PROPERTY`: `MQWARNING` = 1074659333;
public const val `MQ_INFORMATION_FORMATNAME_BUFFER_TOO_SMALL`: `MQWARNING` = 1074659337;
public const val `MQ_INFORMATION_ILLEGAL_PROPERTY`: `MQWARNING` = 1074659330;
public const val `MQ_INFORMATION_INTERNAL_USER_CERT_EXIST`: `MQWARNING` = 1074659338;
public const val `MQ_INFORMATION_OPERATION_PENDING`: `MQWARNING` = 1074659334;
public const val `MQ_INFORMATION_OWNER_IGNORED`: `MQWARNING` = 1074659339;
public const val `MQ_INFORMATION_PROPERTY`: `MQWARNING` = 1074659329;
public const val `MQ_INFORMATION_PROPERTY_IGNORED`: `MQWARNING` = 1074659331;
public const val `MQ_INFORMATION_UNSUPPORTED_PROPERTY`: `MQWARNING` = 1074659332;
public const val `MQ_JOURNAL`: `MQJOURNAL` = 1;
public const val `MQ_JOURNAL_NONE`: `MQJOURNAL` = 0;
public const val `MQ_LOOKUP_PEEK_CURRENT`: UInt = 1073741840u;
public const val `MQ_LOOKUP_PEEK_FIRST`: UInt = 1073741844u;
public const val `MQ_LOOKUP_PEEK_LAST`: UInt = 1073741848u;
public const val `MQ_LOOKUP_PEEK_NEXT`: UInt = 1073741841u;
public const val `MQ_LOOKUP_PEEK_PREV`: UInt = 1073741842u;
public const val `MQ_LOOKUP_RECEIVE_ALLOW_PEEK`: UInt = 1073742112u;
public const val `MQ_LOOKUP_RECEIVE_CURRENT`: UInt = 1073741856u;
public const val `MQ_LOOKUP_RECEIVE_FIRST`: UInt = 1073741860u;
public const val `MQ_LOOKUP_RECEIVE_LAST`: UInt = 1073741864u;
public const val `MQ_LOOKUP_RECEIVE_NEXT`: UInt = 1073741857u;
public const val `MQ_LOOKUP_RECEIVE_PREV`: UInt = 1073741858u;
public const val `MQ_MAX_MSG_LABEL_LEN`: `MQMSGMAX` = 249;
public const val `MQ_MAX_PRIORITY`: `MQPRIORITY` = 7;
public const val `MQ_MAX_Q_LABEL_LEN`: `MQMAX` = 124;
public const val `MQ_MAX_Q_NAME_LEN`: `MQMAX` = 124;
public const val `MQ_MIN_PRIORITY`: `MQPRIORITY` = 0;
public const val `MQ_MOVE_ACCESS`: UInt = 4u;
public const val `MQ_MTS_TRANSACTION`: `MQTRANSACTION` = 1;
public const val `MQ_NO_TRANSACTION`: `MQTRANSACTION` = 0;
public const val `MQ_OK`: Int = 0;
public const val `MQ_PEEK_ACCESS`: `MQACCESS` = 32;
public const val `MQ_PRIV_LEVEL_BODY`: `MQPRIVLEVEL` = 2;
public const val `MQ_PRIV_LEVEL_NONE`: `MQPRIVLEVEL` = 0;
public const val `MQ_PRIV_LEVEL_OPTIONAL`: `MQPRIVLEVEL` = 1;
// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MQ_QTYPE_REPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55ee8f32_cce9_11cf_b108_0020afd61ce9);

// UNSUPPORTED Rust 552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MQ_QTYPE_TEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55ee8f33_cce9_11cf_b108_0020afd61ce9);

public const val `MQ_QUEUE_STATE_CONNECTED`: `QUEUE_STATE` = 6;
public const val `MQ_QUEUE_STATE_DISCONNECTED`: `QUEUE_STATE` = 1;
public const val `MQ_QUEUE_STATE_DISCONNECTING`: `QUEUE_STATE` = 7;
public const val `MQ_QUEUE_STATE_LOCAL_CONNECTION`: `QUEUE_STATE` = 0;
public const val `MQ_QUEUE_STATE_LOCKED`: `QUEUE_STATE` = 8;
public const val `MQ_QUEUE_STATE_NEEDVALIDATE`: `QUEUE_STATE` = 3;
public const val `MQ_QUEUE_STATE_NONACTIVE`: `QUEUE_STATE` = 5;
public const val `MQ_QUEUE_STATE_ONHOLD`: `QUEUE_STATE` = 4;
public const val `MQ_QUEUE_STATE_WAITING`: `QUEUE_STATE` = 2;
public const val `MQ_RECEIVE_ACCESS`: `MQACCESS` = 1;
public const val `MQ_SEND_ACCESS`: `MQACCESS` = 2;
public const val `MQ_SINGLE_MESSAGE`: `MQTRANSACTION` = 3;
public const val `MQ_STATUS_FOREIGN`: `FOREIGN_STATUS` = 0;
public const val `MQ_STATUS_NOT_FOREIGN`: `FOREIGN_STATUS` = 1;
public const val `MQ_STATUS_UNKNOWN`: `FOREIGN_STATUS` = 2;
public const val `MQ_TRANSACTIONAL`: `MQTRANSACTIONAL` = 1;
public const val `MQ_TRANSACTIONAL_NONE`: `MQTRANSACTIONAL` = 0;
public const val `MQ_TYPE_CONNECTOR`: `QUEUE_TYPE` = 3;
public const val `MQ_TYPE_MACHINE`: `QUEUE_TYPE` = 2;
public const val `MQ_TYPE_MULTICAST`: `QUEUE_TYPE` = 4;
public const val `MQ_TYPE_PRIVATE`: `QUEUE_TYPE` = 1;
public const val `MQ_TYPE_PUBLIC`: `QUEUE_TYPE` = 0;
public const val `MQ_XACT_STATUS_NOT_XACT`: `XACT_STATUS` = 1;
public const val `MQ_XACT_STATUS_UNKNOWN`: `XACT_STATUS` = 2;
public const val `MQ_XACT_STATUS_XACT`: `XACT_STATUS` = 0;
public const val `MQ_XA_TRANSACTION`: `MQTRANSACTION` = 2;
// UNSUPPORTED Rust 579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQApplication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e086_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72b9031_2f0c_43e8_924e_e6052cdc493f);

// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQCoordinatedTransactionDispenser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e082_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQDestination: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeba96b18_2168_11d3_898c_00e02c074f6b);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQEvent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e07a_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39ce96fe_f4c5_4484_a143_4c2d5d324229);

// UNSUPPORTED Rust 585:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e075_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQOutgoingQueueManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0188401c_247a_4fed_99c6_bf14119d7055);

// UNSUPPORTED Rust 587:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e073_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 588:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e079_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 589:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQQueueInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e07c_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 590:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQQueueInfos: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e07e_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 591:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQQueueManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33b6d07e_f27d_42fa_b2d7_bf82e11e9374);

// UNSUPPORTED Rust 592:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQTransaction: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e080_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 593:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSMQTransactionDispenser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d6e084_dccd_11d0_aa4b_0060970debae);

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MSMQ_CONNECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("CONNECTED");

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MSMQ_DISCONNECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("DISCONNECTED");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_IO", feature = "Win32_System_Variant"))]
public typealias `PMQRECEIVECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, Long, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`MQMSGPROPS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO`.`OVERLAPPED`>?, `super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
public const val `PREQ`: UInt = 4u;
public const val `PRGE`: UInt = 3u;
public const val `PRGT`: UInt = 2u;
public const val `PRLE`: UInt = 1u;
public const val `PRLT`: UInt = 0u;
public const val `PRNE`: UInt = 5u;
public const val `PROPID_MGMT_MSMQ_ACTIVEQUEUES`: UInt = 1u;
public const val `PROPID_MGMT_MSMQ_BASE`: UInt = 0u;
public const val `PROPID_MGMT_MSMQ_BYTES_IN_ALL_QUEUES`: UInt = 6u;
public const val `PROPID_MGMT_MSMQ_CONNECTED`: UInt = 4u;
public const val `PROPID_MGMT_MSMQ_DSSERVER`: UInt = 3u;
public const val `PROPID_MGMT_MSMQ_PRIVATEQ`: UInt = 2u;
public const val `PROPID_MGMT_MSMQ_TYPE`: UInt = 5u;
public const val `PROPID_MGMT_QUEUE_BASE`: UInt = 0u;
public const val `PROPID_MGMT_QUEUE_BYTES_IN_JOURNAL`: UInt = 10u;
public const val `PROPID_MGMT_QUEUE_BYTES_IN_QUEUE`: UInt = 8u;
public const val `PROPID_MGMT_QUEUE_CONNECTION_HISTORY`: UInt = 25u;
public const val `PROPID_MGMT_QUEUE_EOD_FIRST_NON_ACK`: UInt = 16u;
public const val `PROPID_MGMT_QUEUE_EOD_LAST_ACK`: UInt = 13u;
public const val `PROPID_MGMT_QUEUE_EOD_LAST_ACK_COUNT`: UInt = 15u;
public const val `PROPID_MGMT_QUEUE_EOD_LAST_ACK_TIME`: UInt = 14u;
public const val `PROPID_MGMT_QUEUE_EOD_LAST_NON_ACK`: UInt = 17u;
public const val `PROPID_MGMT_QUEUE_EOD_NEXT_SEQ`: UInt = 18u;
public const val `PROPID_MGMT_QUEUE_EOD_NO_ACK_COUNT`: UInt = 20u;
public const val `PROPID_MGMT_QUEUE_EOD_NO_READ_COUNT`: UInt = 19u;
public const val `PROPID_MGMT_QUEUE_EOD_RESEND_COUNT`: UInt = 23u;
public const val `PROPID_MGMT_QUEUE_EOD_RESEND_INTERVAL`: UInt = 22u;
public const val `PROPID_MGMT_QUEUE_EOD_RESEND_TIME`: UInt = 21u;
public const val `PROPID_MGMT_QUEUE_EOD_SOURCE_INFO`: UInt = 24u;
public const val `PROPID_MGMT_QUEUE_FOREIGN`: UInt = 6u;
public const val `PROPID_MGMT_QUEUE_FORMATNAME`: UInt = 2u;
public const val `PROPID_MGMT_QUEUE_JOURNAL_MESSAGE_COUNT`: UInt = 9u;
public const val `PROPID_MGMT_QUEUE_JOURNAL_USED_QUOTA`: UInt = 10u;
public const val `PROPID_MGMT_QUEUE_LOCATION`: UInt = 4u;
public const val `PROPID_MGMT_QUEUE_MESSAGE_COUNT`: UInt = 7u;
public const val `PROPID_MGMT_QUEUE_NEXTHOPS`: UInt = 12u;
public const val `PROPID_MGMT_QUEUE_PATHNAME`: UInt = 1u;
public const val `PROPID_MGMT_QUEUE_STATE`: UInt = 11u;
public const val `PROPID_MGMT_QUEUE_SUBQUEUE_COUNT`: UInt = 26u;
public const val `PROPID_MGMT_QUEUE_SUBQUEUE_NAMES`: UInt = 27u;
public const val `PROPID_MGMT_QUEUE_TYPE`: UInt = 3u;
public const val `PROPID_MGMT_QUEUE_USED_QUOTA`: UInt = 8u;
public const val `PROPID_MGMT_QUEUE_XACT`: UInt = 5u;
public const val `PROPID_M_ABORT_COUNT`: UInt = 69u;
public const val `PROPID_M_ACKNOWLEDGE`: UInt = 6u;
public const val `PROPID_M_ADMIN_QUEUE`: UInt = 17u;
public const val `PROPID_M_ADMIN_QUEUE_LEN`: UInt = 18u;
public const val `PROPID_M_APPSPECIFIC`: UInt = 8u;
public const val `PROPID_M_ARRIVEDTIME`: UInt = 32u;
public const val `PROPID_M_AUTHENTICATED`: UInt = 25u;
public const val `PROPID_M_AUTHENTICATED_EX`: UInt = 53u;
public const val `PROPID_M_AUTH_LEVEL`: UInt = 24u;
public const val `PROPID_M_BASE`: UInt = 0u;
public const val `PROPID_M_BODY`: UInt = 9u;
public const val `PROPID_M_BODY_SIZE`: UInt = 10u;
public const val `PROPID_M_BODY_TYPE`: UInt = 42u;
public const val `PROPID_M_CLASS`: UInt = 1u;
public const val `PROPID_M_COMPOUND_MESSAGE`: UInt = 63u;
public const val `PROPID_M_COMPOUND_MESSAGE_SIZE`: UInt = 64u;
public const val `PROPID_M_CONNECTOR_TYPE`: UInt = 38u;
public const val `PROPID_M_CORRELATIONID`: UInt = 3u;
public const val `PROPID_M_CORRELATIONID_SIZE`: UInt = 20u;
public const val `PROPID_M_DEADLETTER_QUEUE`: UInt = 67u;
public const val `PROPID_M_DEADLETTER_QUEUE_LEN`: UInt = 68u;
public const val `PROPID_M_DELIVERY`: UInt = 5u;
public const val `PROPID_M_DEST_FORMAT_NAME`: UInt = 58u;
public const val `PROPID_M_DEST_FORMAT_NAME_LEN`: UInt = 59u;
public const val `PROPID_M_DEST_QUEUE`: UInt = 33u;
public const val `PROPID_M_DEST_QUEUE_LEN`: UInt = 34u;
public const val `PROPID_M_DEST_SYMM_KEY`: UInt = 43u;
public const val `PROPID_M_DEST_SYMM_KEY_LEN`: UInt = 44u;
public const val `PROPID_M_ENCRYPTION_ALG`: UInt = 27u;
public const val `PROPID_M_EXTENSION`: UInt = 35u;
public const val `PROPID_M_EXTENSION_LEN`: UInt = 36u;
public const val `PROPID_M_FIRST_IN_XACT`: UInt = 50u;
public const val `PROPID_M_HASH_ALG`: UInt = 26u;
public const val `PROPID_M_JOURNAL`: UInt = 7u;
public const val `PROPID_M_LABEL`: UInt = 11u;
public const val `PROPID_M_LABEL_LEN`: UInt = 12u;
public const val `PROPID_M_LAST_IN_XACT`: UInt = 51u;
public const val `PROPID_M_LAST_MOVE_TIME`: UInt = 75u;
public const val `PROPID_M_LOOKUPID`: UInt = 60u;
public const val `PROPID_M_MOVE_COUNT`: UInt = 70u;
public const val `PROPID_M_MSGID`: UInt = 2u;
public const val `PROPID_M_MSGID_SIZE`: UInt = 20u;
public const val `PROPID_M_PRIORITY`: UInt = 4u;
public const val `PROPID_M_PRIV_LEVEL`: UInt = 23u;
public const val `PROPID_M_PROV_NAME`: UInt = 48u;
public const val `PROPID_M_PROV_NAME_LEN`: UInt = 49u;
public const val `PROPID_M_PROV_TYPE`: UInt = 47u;
public const val `PROPID_M_RESP_FORMAT_NAME`: UInt = 54u;
public const val `PROPID_M_RESP_FORMAT_NAME_LEN`: UInt = 55u;
public const val `PROPID_M_RESP_QUEUE`: UInt = 15u;
public const val `PROPID_M_RESP_QUEUE_LEN`: UInt = 16u;
public const val `PROPID_M_SECURITY_CONTEXT`: UInt = 37u;
public const val `PROPID_M_SENDERID`: UInt = 20u;
public const val `PROPID_M_SENDERID_LEN`: UInt = 21u;
public const val `PROPID_M_SENDERID_TYPE`: UInt = 22u;
public const val `PROPID_M_SENDER_CERT`: UInt = 28u;
public const val `PROPID_M_SENDER_CERT_LEN`: UInt = 29u;
public const val `PROPID_M_SENTTIME`: UInt = 31u;
public const val `PROPID_M_SIGNATURE`: UInt = 45u;
public const val `PROPID_M_SIGNATURE_LEN`: UInt = 46u;
public const val `PROPID_M_SOAP_BODY`: UInt = 66u;
public const val `PROPID_M_SOAP_ENVELOPE`: UInt = 61u;
public const val `PROPID_M_SOAP_ENVELOPE_LEN`: UInt = 62u;
public const val `PROPID_M_SOAP_HEADER`: UInt = 65u;
public const val `PROPID_M_SRC_MACHINE_ID`: UInt = 30u;
public const val `PROPID_M_TIME_TO_BE_RECEIVED`: UInt = 14u;
public const val `PROPID_M_TIME_TO_REACH_QUEUE`: UInt = 13u;
public const val `PROPID_M_TRACE`: UInt = 41u;
public const val `PROPID_M_VERSION`: UInt = 19u;
public const val `PROPID_M_XACTID`: UInt = 52u;
public const val `PROPID_M_XACTID_SIZE`: UInt = 20u;
public const val `PROPID_M_XACT_STATUS_QUEUE`: UInt = 39u;
public const val `PROPID_M_XACT_STATUS_QUEUE_LEN`: UInt = 40u;
public const val `PROPID_PC_BASE`: UInt = 5800u;
public const val `PROPID_PC_DS_ENABLED`: UInt = 5802u;
public const val `PROPID_PC_VERSION`: UInt = 5801u;
public const val `PROPID_QM_BASE`: UInt = 200u;
public const val `PROPID_QM_CONNECTION`: UInt = 204u;
public const val `PROPID_QM_ENCRYPTION_PK`: UInt = 205u;
public const val `PROPID_QM_ENCRYPTION_PK_AES`: UInt = 244u;
public const val `PROPID_QM_ENCRYPTION_PK_BASE`: UInt = 231u;
public const val `PROPID_QM_ENCRYPTION_PK_ENHANCED`: UInt = 232u;
public const val `PROPID_QM_MACHINE_ID`: UInt = 202u;
public const val `PROPID_QM_PATHNAME`: UInt = 203u;
public const val `PROPID_QM_PATHNAME_DNS`: UInt = 233u;
public const val `PROPID_QM_SITE_ID`: UInt = 201u;
public const val `PROPID_Q_ADS_PATH`: UInt = 126u;
public const val `PROPID_Q_AUTHENTICATE`: UInt = 111u;
public const val `PROPID_Q_BASE`: UInt = 100u;
public const val `PROPID_Q_BASEPRIORITY`: UInt = 106u;
public const val `PROPID_Q_CREATE_TIME`: UInt = 109u;
public const val `PROPID_Q_INSTANCE`: UInt = 101u;
public const val `PROPID_Q_JOURNAL`: UInt = 104u;
public const val `PROPID_Q_JOURNAL_QUOTA`: UInt = 107u;
public const val `PROPID_Q_LABEL`: UInt = 108u;
public const val `PROPID_Q_MODIFY_TIME`: UInt = 110u;
public const val `PROPID_Q_MULTICAST_ADDRESS`: UInt = 125u;
public const val `PROPID_Q_PATHNAME`: UInt = 103u;
public const val `PROPID_Q_PATHNAME_DNS`: UInt = 124u;
public const val `PROPID_Q_PRIV_LEVEL`: UInt = 112u;
public const val `PROPID_Q_QUOTA`: UInt = 105u;
public const val `PROPID_Q_TRANSACTION`: UInt = 113u;
public const val `PROPID_Q_TYPE`: UInt = 102u;
public const val `QUERY_SORTASCEND`: UInt = 0u;
public const val `QUERY_SORTDESCEND`: UInt = 1u;
// UNSUPPORTED Rust 746:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const QUEUE_ACTION_EOD_RESEND: windows_sys::core::PCWSTR = windows_sys::core::w!("EOD_RESEND");

// UNSUPPORTED Rust 747:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const QUEUE_ACTION_PAUSE: windows_sys::core::PCWSTR = windows_sys::core::w!("PAUSE");

// UNSUPPORTED Rust 748:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const QUEUE_ACTION_RESUME: windows_sys::core::PCWSTR = windows_sys::core::w!("RESUME");

public typealias `QUEUE_STATE` = Int;
public typealias `QUEUE_TYPE` = Int;
public typealias `RELOPS` = Int;
public const val `REL_EQ`: `RELOPS` = 1;
public const val `REL_GE`: `RELOPS` = 6;
public const val `REL_GT`: `RELOPS` = 4;
public const val `REL_LE`: `RELOPS` = 5;
public const val `REL_LT`: `RELOPS` = 3;
public const val `REL_NEQ`: `RELOPS` = 2;
public const val `REL_NOP`: `RELOPS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEQUENCE_INFO` (
    public var `SeqID`: Long,
    public var `SeqNo`: UInt,
    public var `PrevNo`: UInt,
)
public typealias `XACT_STATUS` = Int;
