// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCancelMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCancelMsg`(`session` : Long, `reqid` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCleanup`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCleanupEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCleanupEx`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpClose`(`session` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpContextToStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpContextToStr`(`context` : Long, `string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOCTETS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCountVbl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCountVbl`(`vbl` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCreatePdu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCreatePdu`(`session` : Long, `pdu_type` : `SNMP_PDU_TYPE`, `request_id` : Int, `error_status` : Int, `error_index` : Int, `varbindlist` : Long) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCreateSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCreateSession`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsg` : UInt, `fcallback` : `SNMPAPI_CALLBACK`, `lpclientdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpCreateVbl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpCreateVbl`(`session` : Long, `name` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiVALUE`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpDecodeMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpDecodeMsg`(`session` : Long, `srcentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `dstentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pdu` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `msgbufdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOCTETS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpDeleteVb; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpDeleteVb`(`vbl` : Long, `index` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpDuplicatePdu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpDuplicatePdu`(`session` : Long, `pdu` : Long) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpDuplicateVbl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpDuplicateVbl`(`session` : Long, `vbl` : Long) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpEncodeMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpEncodeMsg`(`session` : Long, `srcentity` : Long, `dstentity` : Long, `context` : Long, `pdu` : Long, `msgbufdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOCTETS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpEntityToStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpEntityToStr`(`entity` : Long, `size` : UInt, `string` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpFreeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpFreeContext`(`context` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpFreeDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpFreeDescriptor`(`syntax` : UInt, `descriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOCTETS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpFreeEntity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpFreeEntity`(`entity` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpFreePdu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpFreePdu`(`pdu` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpFreeVbl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpFreeVbl`(`vbl` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetLastError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetLastError`(`session` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetPduData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetPduData`(`pdu` : Long, `pdu_type` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_PDU_TYPE`>?, `request_id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `error_status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_ERROR`>?, `error_index` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `varbindlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetRetransmitMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetRetransmitMode`(`nretransmitmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetRetry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetRetry`(`hentity` : Long, `npolicyretry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nactualretry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetTimeout`(`hentity` : Long, `npolicytimeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nactualtimeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetTranslateMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetTranslateMode`(`ntranslatemode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_API_TRANSLATE_MODE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetVb; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetVb`(`vbl` : Long, `index` : UInt, `name` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiVALUE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpGetVendorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpGetVendorInfo`(`vendorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiVENDORINFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpListen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpListen`(`hentity` : Long, `lstatus` : `SNMP_STATUS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpListenEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpListenEx`(`hentity` : Long, `lstatus` : UInt, `nuseentityaddr` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrClose`(`session` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrCtl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrCtl`(`session` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwctlcode` : UInt, `lpvinbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbinbuffer` : UInt, `lpvoutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cboutbuffer` : UInt, `lpcbbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrGetTrap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrGetTrap`(`enterprise` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `ipaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `generictrap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_GENERICTRAP`>?, `specifictrap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `timestamp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `variablebindings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrGetTrapEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrGetTrapEx`(`enterprise` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `agentaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `sourceaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `generictrap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_GENERICTRAP`>?, `specifictrap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `community` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `timestamp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `variablebindings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrOidToStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrOidToStr`(`oid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrOpen`(`lpagentaddress` : `windows_sys`.`core`.`PCSTR`, `lpagentcommunity` : `windows_sys`.`core`.`PCSTR`, `ntimeout` : Int, `nretries` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrRequest`(`session` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requesttype` : UByte, `variablebindings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?, `errorstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_ERROR_STATUS`>?, `errorindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrStrToOid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrStrToOid`(`string` : `windows_sys`.`core`.`PCSTR`, `oid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mgmtapi.dll, ABI=system, export=SnmpMgrTrapListen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpMgrTrapListen`(`phtrapavailable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpOidCompare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpOidCompare`(`xoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `yoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `maxlen` : UInt, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpOidCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpOidCopy`(`srcoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `dstoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpOidToStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpOidToStr`(`srcoid` : /* Rust *const */ kotlinx.cinterop.CPointer<`smiOID`>?, `size` : UInt, `string` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpOpen`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsg` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpRecvMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpRecvMsg`(`session` : Long, `srcentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `dstentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pdu` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpRegister`(`session` : Long, `srcentity` : Long, `dstentity` : Long, `context` : Long, `notification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `state` : `SNMP_STATUS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSendMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSendMsg`(`session` : Long, `srcentity` : Long, `dstentity` : Long, `context` : Long, `pdu` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetPduData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetPduData`(`pdu` : Long, `pdu_type` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `request_id` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `non_repeaters` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `max_repetitions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `varbindlist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetPort`(`hentity` : Long, `nport` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetRetransmitMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetRetransmitMode`(`nretransmitmode` : `SNMP_STATUS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetRetry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetRetry`(`hentity` : Long, `npolicyretry` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetTimeout`(`hentity` : Long, `npolicytimeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetTranslateMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetTranslateMode`(`ntranslatemode` : `SNMP_API_TRANSLATE_MODE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpSetVb; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSetVb`(`vbl` : Long, `index` : UInt, `name` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiVALUE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpStartup`(`nmajorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nminorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ntranslatemode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_API_TRANSLATE_MODE`>?, `nretransmitmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpStartupEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpStartupEx`(`nmajorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nminorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ntranslatemode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_API_TRANSLATE_MODE`>?, `nretransmitmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SNMP_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpStrToContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpStrToContext`(`session` : Long, `string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOCTETS`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpStrToEntity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpStrToEntity`(`session` : Long, `string` : `windows_sys`.`core`.`PCSTR`) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsnmp32.dll, ABI=system, export=SnmpStrToOid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpStrToOid`(`string` : `windows_sys`.`core`.`PCSTR`, `dstoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`smiOID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpSvcGetUptime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSvcGetUptime`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpSvcSetLogLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSvcSetLogLevel`(`nloglevel` : `SNMP_LOG`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpSvcSetLogType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpSvcSetLogType`(`nlogtype` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilAsnAnyCpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilAsnAnyCpy`(`panydst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnAny`>?, `panysrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnAny`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilAsnAnyFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilAsnAnyFree`(`pany` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnAny`>?)
// UNSUPPORTED Rust 64:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("snmpapi.dll" "C" fn SnmpUtilDbgPrint(nloglevel : SNMP_LOG, szformat : windows_sys::core::PCSTR, ...));

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilIdsToA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilIdsToA`(`ids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `idlength` : UInt) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilMemAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilMemAlloc`(`nbytes` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilMemFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilMemFree`(`pmem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilMemReAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilMemReAlloc`(`pmem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nbytes` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOctetsCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOctetsCmp`(`poctets1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `poctets2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOctetsCpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOctetsCpy`(`poctetsdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `poctetssrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOctetsFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOctetsFree`(`poctets` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOctetsNCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOctetsNCmp`(`poctets1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `poctets2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, `nchars` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidAppend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidAppend`(`poiddst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `poidsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidCmp`(`poid1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `poid2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidCpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidCpy`(`poiddst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `poidsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidFree`(`poid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidNCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidNCmp`(`poid1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `poid2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, `nsubids` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilOidToA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilOidToA`(`oid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilPrintAsnAny; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilPrintAsnAny`(`pany` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnAny`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilPrintOid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilPrintOid`(`oid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilVarBindCpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilVarBindCpy`(`pvbdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBind`>?, `pvbsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBind`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilVarBindFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilVarBindFree`(`pvb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBind`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilVarBindListCpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilVarBindListCpy`(`pvbldst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?, `pvblsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=snmpapi.dll, ABI=system, export=SnmpUtilVarBindListFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SnmpUtilVarBindListFree`(`pvbl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?)
public const val `ASN_APPLICATION`: UInt = 64u;
public const val `ASN_CONSTRUCTOR`: UInt = 32u;
public const val `ASN_CONTEXT`: UInt = 128u;
public const val `ASN_CONTEXTSPECIFIC`: UInt = 128u;
public const val `ASN_PRIMATIVE`: UInt = 0u;
public const val `ASN_PRIMITIVE`: UInt = 0u;
public const val `ASN_PRIVATE`: UInt = 192u;
public const val `ASN_UNIVERSAL`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AsnAny` (
    public var `asnType`: UByte,
    public var `asnValue`: `AsnAny_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnAny`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AsnAny`.Companion.`default`() : `AsnAny` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 104:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union AsnAny_0 {
//     pub number: i32,
//     pub unsigned32: u32,
//     pub counter64: u64,
//     pub string: AsnOctetString,
//     pub bits: AsnOctetString,
//     pub object: AsnObjectIdentifier,
//     pub sequence: AsnOctetString,
//     pub address: AsnOctetString,
//     pub counter: u32,
//     pub gauge: u32,
//     pub ticks: u32,
//     pub arbitrary: AsnOctetString,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnAny_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AsnAny_0`.Companion.`default`() : `AsnAny_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AsnObjectIdentifier` (
    public var `idLength`: UInt,
    public var `ids`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnObjectIdentifier`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `AsnObjectIdentifier`.Companion.`default`() : `AsnObjectIdentifier` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AsnObjectIdentifier` (
    public var `idLength`: UInt,
    public var `ids`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnObjectIdentifier`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `AsnObjectIdentifier`.Companion.`default`() : `AsnObjectIdentifier` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AsnOctetString` (
    public var `stream`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `length`: UInt,
    public var `dynamic`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnOctetString`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `AsnOctetString`.Companion.`default`() : `AsnOctetString` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AsnOctetString` (
    public var `stream`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `length`: UInt,
    public var `dynamic`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AsnOctetString`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `AsnOctetString`.Companion.`default`() : `AsnOctetString` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DEFAULT_SNMPTRAP_PORT_IPX`: UInt = 36880u;
public const val `DEFAULT_SNMPTRAP_PORT_UDP`: UInt = 162u;
public const val `DEFAULT_SNMP_PORT_IPX`: UInt = 36879u;
public const val `DEFAULT_SNMP_PORT_UDP`: UInt = 161u;
public const val `MAXOBJIDSIZE`: UInt = 128u;
public const val `MAXOBJIDSTRSIZE`: UInt = 1408u;
public const val `MAXVENDORINFO`: UInt = 32u;
public const val `MGMCTL_SETAGENTPORT`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPCLEANUPEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONCLOSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONINIT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONINITEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONMONITOR` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONQUERY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONQUERYEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`AsnOctetString`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPEXTENSIONTRAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`AsnObjectIdentifier`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBindList`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSNMPSTARTUPEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
public const val `SNMPAPI_ALLOC_ERROR`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SNMPAPI_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, `super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `SNMPAPI_CONTEXT_INVALID`: UInt = 3u;
public const val `SNMPAPI_CONTEXT_UNKNOWN`: UInt = 4u;
public const val `SNMPAPI_ENTITY_INVALID`: UInt = 5u;
public const val `SNMPAPI_ENTITY_UNKNOWN`: UInt = 6u;
public const val `SNMPAPI_ERROR`: UInt = 0u;
public const val `SNMPAPI_FAILURE`: UInt = 0u;
public const val `SNMPAPI_HWND_INVALID`: UInt = 20u;
public const val `SNMPAPI_INDEX_INVALID`: UInt = 7u;
public const val `SNMPAPI_M2M_SUPPORT`: UInt = 3u;
public const val `SNMPAPI_MESSAGE_INVALID`: UInt = 19u;
public const val `SNMPAPI_MODE_INVALID`: UInt = 16u;
public const val `SNMPAPI_NOERROR`: UInt = 1u;
public const val `SNMPAPI_NOOP`: UInt = 8u;
public const val `SNMPAPI_NOT_INITIALIZED`: UInt = 18u;
public const val `SNMPAPI_NO_SUPPORT`: UInt = 0u;
public const val `SNMPAPI_OFF`: `SNMP_STATUS` = 0u;
public const val `SNMPAPI_OID_INVALID`: UInt = 9u;
public const val `SNMPAPI_ON`: `SNMP_STATUS` = 1u;
public const val `SNMPAPI_OPERATION_INVALID`: UInt = 10u;
public const val `SNMPAPI_OTHER_ERROR`: UInt = 99u;
public const val `SNMPAPI_OUTPUT_TRUNCATED`: UInt = 11u;
public const val `SNMPAPI_PDU_INVALID`: UInt = 12u;
public const val `SNMPAPI_SESSION_INVALID`: UInt = 13u;
public const val `SNMPAPI_SIZE_INVALID`: UInt = 17u;
public const val `SNMPAPI_SUCCESS`: UInt = 1u;
public const val `SNMPAPI_SYNTAX_INVALID`: UInt = 14u;
public const val `SNMPAPI_TL_INVALID_PARAM`: UInt = 106u;
public const val `SNMPAPI_TL_IN_USE`: UInt = 107u;
public const val `SNMPAPI_TL_NOT_AVAILABLE`: UInt = 102u;
public const val `SNMPAPI_TL_NOT_INITIALIZED`: UInt = 100u;
public const val `SNMPAPI_TL_NOT_SUPPORTED`: UInt = 101u;
public const val `SNMPAPI_TL_OTHER`: UInt = 199u;
public const val `SNMPAPI_TL_PDU_TOO_BIG`: UInt = 109u;
public const val `SNMPAPI_TL_RESOURCE_ERROR`: UInt = 103u;
public const val `SNMPAPI_TL_SRC_INVALID`: UInt = 105u;
public const val `SNMPAPI_TL_TIMEOUT`: UInt = 108u;
public const val `SNMPAPI_TL_UNDELIVERABLE`: UInt = 104u;
public const val `SNMPAPI_TRANSLATED`: `SNMP_API_TRANSLATE_MODE` = 0u;
public const val `SNMPAPI_UNTRANSLATED_V1`: `SNMP_API_TRANSLATE_MODE` = 1u;
public const val `SNMPAPI_UNTRANSLATED_V2`: `SNMP_API_TRANSLATE_MODE` = 2u;
public const val `SNMPAPI_V1_SUPPORT`: UInt = 1u;
public const val `SNMPAPI_V2_SUPPORT`: UInt = 2u;
public const val `SNMPAPI_VBL_INVALID`: UInt = 15u;
public const val `SNMPLISTEN_ALL_ADDR`: UInt = 1u;
public const val `SNMPLISTEN_USEENTITY_ADDR`: UInt = 0u;
public const val `SNMP_ACCESS_NONE`: UInt = 0u;
public const val `SNMP_ACCESS_NOTIFY`: UInt = 1u;
public const val `SNMP_ACCESS_READ_CREATE`: UInt = 4u;
public const val `SNMP_ACCESS_READ_ONLY`: UInt = 2u;
public const val `SNMP_ACCESS_READ_WRITE`: UInt = 3u;
public typealias `SNMP_API_TRANSLATE_MODE` = UInt;
public const val `SNMP_AUTHAPI_INVALID_MSG_TYPE`: UInt = 31u;
public const val `SNMP_AUTHAPI_INVALID_VERSION`: UInt = 30u;
public const val `SNMP_AUTHAPI_TRIV_AUTH_FAILED`: UInt = 32u;
public const val `SNMP_BERAPI_INVALID_LENGTH`: UInt = 10u;
public const val `SNMP_BERAPI_INVALID_OBJELEM`: UInt = 14u;
public const val `SNMP_BERAPI_INVALID_TAG`: UInt = 11u;
public const val `SNMP_BERAPI_OVERFLOW`: UInt = 12u;
public const val `SNMP_BERAPI_SHORT_BUFFER`: UInt = 13u;
public typealias `SNMP_ERROR` = UInt;
public const val `SNMP_ERRORSTATUS_AUTHORIZATIONERROR`: `SNMP_ERROR_STATUS` = 16u;
public const val `SNMP_ERRORSTATUS_BADVALUE`: `SNMP_ERROR_STATUS` = 3u;
public const val `SNMP_ERRORSTATUS_COMMITFAILED`: `SNMP_ERROR_STATUS` = 14u;
public const val `SNMP_ERRORSTATUS_GENERR`: `SNMP_ERROR_STATUS` = 5u;
public const val `SNMP_ERRORSTATUS_INCONSISTENTNAME`: `SNMP_ERROR_STATUS` = 18u;
public const val `SNMP_ERRORSTATUS_INCONSISTENTVALUE`: `SNMP_ERROR_STATUS` = 12u;
public const val `SNMP_ERRORSTATUS_NOACCESS`: `SNMP_ERROR_STATUS` = 6u;
public const val `SNMP_ERRORSTATUS_NOCREATION`: `SNMP_ERROR_STATUS` = 11u;
public const val `SNMP_ERRORSTATUS_NOERROR`: `SNMP_ERROR_STATUS` = 0u;
public const val `SNMP_ERRORSTATUS_NOSUCHNAME`: `SNMP_ERROR_STATUS` = 2u;
public const val `SNMP_ERRORSTATUS_NOTWRITABLE`: `SNMP_ERROR_STATUS` = 17u;
public const val `SNMP_ERRORSTATUS_READONLY`: `SNMP_ERROR_STATUS` = 4u;
public const val `SNMP_ERRORSTATUS_RESOURCEUNAVAILABLE`: `SNMP_ERROR_STATUS` = 13u;
public const val `SNMP_ERRORSTATUS_TOOBIG`: `SNMP_ERROR_STATUS` = 1u;
public const val `SNMP_ERRORSTATUS_UNDOFAILED`: `SNMP_ERROR_STATUS` = 15u;
public const val `SNMP_ERRORSTATUS_WRONGENCODING`: `SNMP_ERROR_STATUS` = 9u;
public const val `SNMP_ERRORSTATUS_WRONGLENGTH`: `SNMP_ERROR_STATUS` = 8u;
public const val `SNMP_ERRORSTATUS_WRONGTYPE`: `SNMP_ERROR_STATUS` = 7u;
public const val `SNMP_ERRORSTATUS_WRONGVALUE`: `SNMP_ERROR_STATUS` = 10u;
public const val `SNMP_ERROR_AUTHORIZATIONERROR`: `SNMP_ERROR` = 16u;
public const val `SNMP_ERROR_BADVALUE`: `SNMP_ERROR` = 3u;
public const val `SNMP_ERROR_COMMITFAILED`: `SNMP_ERROR` = 14u;
public const val `SNMP_ERROR_GENERR`: `SNMP_ERROR` = 5u;
public const val `SNMP_ERROR_INCONSISTENTNAME`: `SNMP_ERROR` = 18u;
public const val `SNMP_ERROR_INCONSISTENTVALUE`: `SNMP_ERROR` = 12u;
public const val `SNMP_ERROR_NOACCESS`: `SNMP_ERROR` = 6u;
public const val `SNMP_ERROR_NOCREATION`: `SNMP_ERROR` = 11u;
public const val `SNMP_ERROR_NOERROR`: `SNMP_ERROR` = 0u;
public const val `SNMP_ERROR_NOSUCHNAME`: `SNMP_ERROR` = 2u;
public const val `SNMP_ERROR_NOTWRITABLE`: `SNMP_ERROR` = 17u;
public const val `SNMP_ERROR_READONLY`: `SNMP_ERROR` = 4u;
public const val `SNMP_ERROR_RESOURCEUNAVAILABLE`: `SNMP_ERROR` = 13u;
public typealias `SNMP_ERROR_STATUS` = UInt;
public const val `SNMP_ERROR_TOOBIG`: `SNMP_ERROR` = 1u;
public const val `SNMP_ERROR_UNDOFAILED`: `SNMP_ERROR` = 15u;
public const val `SNMP_ERROR_WRONGENCODING`: `SNMP_ERROR` = 9u;
public const val `SNMP_ERROR_WRONGLENGTH`: `SNMP_ERROR` = 8u;
public const val `SNMP_ERROR_WRONGTYPE`: `SNMP_ERROR` = 7u;
public const val `SNMP_ERROR_WRONGVALUE`: `SNMP_ERROR` = 10u;
public const val `SNMP_EXTENSION_GET`: `SNMP_EXTENSION_REQUEST_TYPE` = 160u;
public const val `SNMP_EXTENSION_GET_NEXT`: `SNMP_EXTENSION_REQUEST_TYPE` = 161u;
public typealias `SNMP_EXTENSION_REQUEST_TYPE` = UInt;
public const val `SNMP_EXTENSION_SET_CLEANUP`: `SNMP_EXTENSION_REQUEST_TYPE` = 226u;
public const val `SNMP_EXTENSION_SET_COMMIT`: `SNMP_EXTENSION_REQUEST_TYPE` = 163u;
public const val `SNMP_EXTENSION_SET_TEST`: `SNMP_EXTENSION_REQUEST_TYPE` = 224u;
public const val `SNMP_EXTENSION_SET_UNDO`: `SNMP_EXTENSION_REQUEST_TYPE` = 225u;
public typealias `SNMP_GENERICTRAP` = UInt;
public const val `SNMP_GENERICTRAP_AUTHFAILURE`: `SNMP_GENERICTRAP` = 4u;
public const val `SNMP_GENERICTRAP_COLDSTART`: `SNMP_GENERICTRAP` = 0u;
public const val `SNMP_GENERICTRAP_EGPNEIGHLOSS`: `SNMP_GENERICTRAP` = 5u;
public const val `SNMP_GENERICTRAP_ENTERSPECIFIC`: `SNMP_GENERICTRAP` = 6u;
public const val `SNMP_GENERICTRAP_LINKDOWN`: `SNMP_GENERICTRAP` = 2u;
public const val `SNMP_GENERICTRAP_LINKUP`: `SNMP_GENERICTRAP` = 3u;
public const val `SNMP_GENERICTRAP_WARMSTART`: `SNMP_GENERICTRAP` = 1u;
public typealias `SNMP_LOG` = Int;
public const val `SNMP_LOG_ERROR`: `SNMP_LOG` = 2;
public const val `SNMP_LOG_FATAL`: `SNMP_LOG` = 1;
public const val `SNMP_LOG_SILENT`: `SNMP_LOG` = 0;
public const val `SNMP_LOG_TRACE`: `SNMP_LOG` = 4;
public const val `SNMP_LOG_VERBOSE`: `SNMP_LOG` = 5;
public const val `SNMP_LOG_WARNING`: `SNMP_LOG` = 3;
public const val `SNMP_MAX_OID_LEN`: UInt = 128u;
public const val `SNMP_MEM_ALLOC_ERROR`: UInt = 1u;
public const val `SNMP_MGMTAPI_AGAIN`: UInt = 45u;
public const val `SNMP_MGMTAPI_INVALID_BUFFER`: UInt = 48u;
public const val `SNMP_MGMTAPI_INVALID_CTL`: UInt = 46u;
public const val `SNMP_MGMTAPI_INVALID_SESSION`: UInt = 47u;
public const val `SNMP_MGMTAPI_NOTRAPS`: UInt = 44u;
public const val `SNMP_MGMTAPI_SELECT_FDERRORS`: UInt = 41u;
public const val `SNMP_MGMTAPI_TIMEOUT`: UInt = 40u;
public const val `SNMP_MGMTAPI_TRAP_DUPINIT`: UInt = 43u;
public const val `SNMP_MGMTAPI_TRAP_ERRORS`: UInt = 42u;
public typealias `SNMP_OUTPUT_LOG_TYPE` = UInt;
public const val `SNMP_OUTPUT_TO_CONSOLE`: `SNMP_OUTPUT_LOG_TYPE` = 1u;
public const val `SNMP_OUTPUT_TO_DEBUGGER`: `SNMP_OUTPUT_LOG_TYPE` = 8u;
public const val `SNMP_OUTPUT_TO_EVENTLOG`: UInt = 4u;
public const val `SNMP_OUTPUT_TO_LOGFILE`: `SNMP_OUTPUT_LOG_TYPE` = 2u;
public const val `SNMP_PDUAPI_INVALID_ES`: UInt = 21u;
public const val `SNMP_PDUAPI_INVALID_GT`: UInt = 22u;
public const val `SNMP_PDUAPI_UNRECOGNIZED_PDU`: UInt = 20u;
public const val `SNMP_PDU_GET`: `SNMP_PDU_TYPE` = 160u;
public const val `SNMP_PDU_GETBULK`: `SNMP_PDU_TYPE` = 165u;
public const val `SNMP_PDU_GETNEXT`: `SNMP_PDU_TYPE` = 161u;
public const val `SNMP_PDU_RESPONSE`: `SNMP_PDU_TYPE` = 162u;
public const val `SNMP_PDU_SET`: `SNMP_PDU_TYPE` = 163u;
public const val `SNMP_PDU_TRAP`: `SNMP_PDU_TYPE` = 167u;
public typealias `SNMP_PDU_TYPE` = UInt;
public typealias `SNMP_STATUS` = UInt;
public const val `SNMP_TRAP_AUTHFAIL`: UInt = 4u;
public const val `SNMP_TRAP_COLDSTART`: UInt = 0u;
public const val `SNMP_TRAP_EGPNEIGHBORLOSS`: UInt = 5u;
public const val `SNMP_TRAP_ENTERPRISESPECIFIC`: UInt = 6u;
public const val `SNMP_TRAP_LINKDOWN`: UInt = 2u;
public const val `SNMP_TRAP_LINKUP`: UInt = 3u;
public const val `SNMP_TRAP_WARMSTART`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SnmpVarBind` (
    public var `name`: `AsnObjectIdentifier`,
    public var `value`: `AsnAny`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SnmpVarBind`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SnmpVarBind`.Companion.`default`() : `SnmpVarBind` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SnmpVarBindList` (
    public var `list`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBind`>?,
    public var `len`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SnmpVarBindList`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `SnmpVarBindList`.Companion.`default`() : `SnmpVarBindList` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SnmpVarBindList` (
    public var `list`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SnmpVarBind`>?,
    public var `len`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SnmpVarBindList`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `SnmpVarBindList`.Companion.`default`() : `SnmpVarBindList` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `smiCNTR64` (
    public var `hipart`: UInt,
    public var `lopart`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `smiOCTETS` (
    public var `len`: UInt,
    public var `ptr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `smiOCTETS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `smiOCTETS`.Companion.`default`() : `smiOCTETS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `smiOID` (
    public var `len`: UInt,
    public var `ptr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `smiOID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `smiOID`.Companion.`default`() : `smiOID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `smiVALUE` (
    public var `syntax`: UInt,
    public var `value`: `smiVALUE_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `smiVALUE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `smiVALUE`.Companion.`default`() : `smiVALUE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 429:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union smiVALUE_0 {
//     pub sNumber: i32,
//     pub uNumber: u32,
//     pub hNumber: smiCNTR64,
//     pub string: smiOCTETS,
//     pub oid: smiOID,
//     pub empty: u8,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `smiVALUE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `smiVALUE_0`.Companion.`default`() : `smiVALUE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `smiVENDORINFO` (
    public var `vendorName`: ByteArray,
    public var `vendorContact`: ByteArray,
    public var `vendorVersionId`: ByteArray,
    public var `vendorVersionDate`: ByteArray,
    public var `vendorEnterprise`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `smiVENDORINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `smiVENDORINFO`.Companion.`default`() : `smiVENDORINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

