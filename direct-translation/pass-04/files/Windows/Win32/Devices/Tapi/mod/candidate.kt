// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=GetTnefStreamCodepage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GetTnefStreamCodepage`(`lpstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpulcodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpulsubcodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=OpenTnefStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
public external fun `OpenTnefStream`(`lpvsupport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszstreamname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `ulflags` : UInt, `lpmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wkeyval` : UShort, `lpptnef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=OpenTnefStreamEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
public external fun `OpenTnefStreamEx`(`lpvsupport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszstreamname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `ulflags` : UInt, `lpmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wkeyval` : UShort, `lpadressbook` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpptnef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAccept; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAccept`(`hcall` : UInt, `lpsuseruserinfo` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAddProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAddProvider`(`lpszproviderfilename` : `windows_sys`.`core`.`PCSTR`, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpdwpermanentproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAddProviderA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAddProviderA`(`lpszproviderfilename` : `windows_sys`.`core`.`PCSTR`, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpdwpermanentproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAddProviderW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAddProviderW`(`lpszproviderfilename` : `windows_sys`.`core`.`PCWSTR`, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpdwpermanentproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAddToConference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAddToConference`(`hconfcall` : UInt, `hconsultcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAgentSpecific; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAgentSpecific`(`hline` : UInt, `dwaddressid` : UInt, `dwagentextensionidindex` : UInt, `lpparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineAnswer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineAnswer`(`hcall` : UInt, `lpsuseruserinfo` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineBlindTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineBlindTransfer`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineBlindTransferA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineBlindTransferA`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineBlindTransferW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineBlindTransferW`(`hcall` : UInt, `lpszdestaddressw` : `windows_sys`.`core`.`PCWSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineClose`(`hline` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCompleteCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCompleteCall`(`hcall` : UInt, `lpdwcompletionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwcompletionmode` : UInt, `dwmessageid` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCompleteTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCompleteTransfer`(`hcall` : UInt, `hconsultcall` : UInt, `lphconfcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwtransfermode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialog`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialogA`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialogEdit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialogEdit`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lpdeviceconfigin` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpdeviceconfigout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialogEditA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialogEditA`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lpdeviceconfigin` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpdeviceconfigout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialogEditW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialogEditW`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`, `lpdeviceconfigin` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpdeviceconfigout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigDialogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigDialogW`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineConfigProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineConfigProvider`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `dwpermanentproviderid` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCreateAgentA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCreateAgentA`(`hline` : UInt, `lpszagentid` : `windows_sys`.`core`.`PCSTR`, `lpszagentpin` : `windows_sys`.`core`.`PCSTR`, `lphagent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCreateAgentSessionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCreateAgentSessionA`(`hline` : UInt, `hagent` : UInt, `lpszagentpin` : `windows_sys`.`core`.`PCSTR`, `dwworkingaddressid` : UInt, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lphagentsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCreateAgentSessionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCreateAgentSessionW`(`hline` : UInt, `hagent` : UInt, `lpszagentpin` : `windows_sys`.`core`.`PCWSTR`, `dwworkingaddressid` : UInt, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lphagentsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineCreateAgentW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineCreateAgentW`(`hline` : UInt, `lpszagentid` : `windows_sys`.`core`.`PCWSTR`, `lpszagentpin` : `windows_sys`.`core`.`PCWSTR`, `lphagent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDeallocateCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDeallocateCall`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDevSpecific; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDevSpecific`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `lpparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDevSpecificFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDevSpecificFeature`(`hline` : UInt, `dwfeature` : UInt, `lpparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDial`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDialA`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDialW`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineDrop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineDrop`(`hcall` : UInt, `lpsuseruserinfo` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineForward; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineForward`(`hline` : UInt, `balladdresses` : UInt, `dwaddressid` : UInt, `lpforwardlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEFORWARDLIST`>?, `dwnumringsnoanswer` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineForwardA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineForwardA`(`hline` : UInt, `balladdresses` : UInt, `dwaddressid` : UInt, `lpforwardlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEFORWARDLIST`>?, `dwnumringsnoanswer` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineForwardW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineForwardW`(`hline` : UInt, `balladdresses` : UInt, `dwaddressid` : UInt, `lpforwardlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEFORWARDLIST`>?, `dwnumringsnoanswer` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGatherDigits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGatherDigits`(`hcall` : UInt, `dwdigitmodes` : UInt, `lpsdigits` : `windows_sys`.`core`.`PSTR`, `dwnumdigits` : UInt, `lpszterminationdigits` : `windows_sys`.`core`.`PCSTR`, `dwfirstdigittimeout` : UInt, `dwinterdigittimeout` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGatherDigitsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGatherDigitsA`(`hcall` : UInt, `dwdigitmodes` : UInt, `lpsdigits` : `windows_sys`.`core`.`PSTR`, `dwnumdigits` : UInt, `lpszterminationdigits` : `windows_sys`.`core`.`PCSTR`, `dwfirstdigittimeout` : UInt, `dwinterdigittimeout` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGatherDigitsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGatherDigitsW`(`hcall` : UInt, `dwdigitmodes` : UInt, `lpsdigits` : `windows_sys`.`core`.`PWSTR`, `dwnumdigits` : UInt, `lpszterminationdigits` : `windows_sys`.`core`.`PCWSTR`, `dwfirstdigittimeout` : UInt, `dwinterdigittimeout` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGenerateDigits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGenerateDigits`(`hcall` : UInt, `dwdigitmode` : UInt, `lpszdigits` : `windows_sys`.`core`.`PCSTR`, `dwduration` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGenerateDigitsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGenerateDigitsA`(`hcall` : UInt, `dwdigitmode` : UInt, `lpszdigits` : `windows_sys`.`core`.`PCSTR`, `dwduration` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGenerateDigitsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGenerateDigitsW`(`hcall` : UInt, `dwdigitmode` : UInt, `lpszdigits` : `windows_sys`.`core`.`PCWSTR`, `dwduration` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGenerateTone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGenerateTone`(`hcall` : UInt, `dwtonemode` : UInt, `dwduration` : UInt, `dwnumtones` : UInt, `lptones` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEGENERATETONE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressCaps`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwaddressid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpaddresscaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressCapsA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwaddressid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpaddresscaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressCapsW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwaddressid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpaddresscaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressID`(`hline` : UInt, `lpdwaddressid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwaddressmode` : UInt, `lpsaddress` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressIDA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressIDA`(`hline` : UInt, `lpdwaddressid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwaddressmode` : UInt, `lpsaddress` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressIDW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressIDW`(`hline` : UInt, `lpdwaddressid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwaddressmode` : UInt, `lpsaddress` : `windows_sys`.`core`.`PCWSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressStatus`(`hline` : UInt, `dwaddressid` : UInt, `lpaddressstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressStatusA`(`hline` : UInt, `dwaddressid` : UInt, `lpaddressstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAddressStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAddressStatusW`(`hline` : UInt, `dwaddressid` : UInt, `lpaddressstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEADDRESSSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentActivityListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentActivityListA`(`hline` : UInt, `dwaddressid` : UInt, `lpagentactivitylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTACTIVITYLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentActivityListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentActivityListW`(`hline` : UInt, `dwaddressid` : UInt, `lpagentactivitylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTACTIVITYLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentCapsA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwaddressid` : UInt, `dwappapiversion` : UInt, `lpagentcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentCapsW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwaddressid` : UInt, `dwappapiversion` : UInt, `lpagentcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentGroupListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentGroupListA`(`hline` : UInt, `dwaddressid` : UInt, `lpagentgrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTGROUPLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentGroupListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentGroupListW`(`hline` : UInt, `dwaddressid` : UInt, `lpagentgrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTGROUPLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `lineGetAgentInfo`(`hline` : UInt, `hagent` : UInt, `lpagentinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentSessionInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `lineGetAgentSessionInfo`(`hline` : UInt, `hagentsession` : UInt, `lpagentsessioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTSESSIONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentSessionList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentSessionList`(`hline` : UInt, `hagent` : UInt, `lpagentsessionlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTSESSIONLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentStatusA`(`hline` : UInt, `dwaddressid` : UInt, `lpagentstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAgentStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAgentStatusW`(`hline` : UInt, `dwaddressid` : UInt, `lpagentstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAppPriority; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAppPriority`(`lpszappfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpextensionname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpdwpriority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAppPriorityA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAppPriorityA`(`lpszappfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpextensionname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpdwpriority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetAppPriorityW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetAppPriorityW`(`lpszappfilename` : `windows_sys`.`core`.`PCWSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpextensionname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpdwpriority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCallInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCallInfo`(`hcall` : UInt, `lpcallinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCallInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCallInfoA`(`hcall` : UInt, `lpcallinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCallInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCallInfoW`(`hcall` : UInt, `lpcallinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCallStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCallStatus`(`hcall` : UInt, `lpcallstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetConfRelatedCalls; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetConfRelatedCalls`(`hcall` : UInt, `lpcalllist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCountry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCountry`(`dwcountryid` : UInt, `dwapiversion` : UInt, `lplinecountrylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECOUNTRYLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCountryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCountryA`(`dwcountryid` : UInt, `dwapiversion` : UInt, `lplinecountrylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECOUNTRYLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetCountryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetCountryW`(`dwcountryid` : UInt, `dwapiversion` : UInt, `lplinecountrylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECOUNTRYLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevCaps`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lplinedevcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevCapsA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lplinedevcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevCapsW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lplinedevcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVCAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevConfig`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevConfigA`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetDevConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetDevConfigW`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetGroupListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetGroupListA`(`hline` : UInt, `lpgrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTGROUPLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetGroupListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetGroupListW`(`hline` : UInt, `lpgrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTGROUPLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetID`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `dwselect` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetIDA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetIDA`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `dwselect` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetIDW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetIDW`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `dwselect` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `lineGetIcon`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetIconA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `lineGetIconA`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetIconW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `lineGetIconW`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetLineDevStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetLineDevStatus`(`hline` : UInt, `lplinedevstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetLineDevStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetLineDevStatusA`(`hline` : UInt, `lplinedevstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetLineDevStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetLineDevStatusW`(`hline` : UInt, `lplinedevstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEDEVSTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetMessage`(`hlineapp` : UInt, `lpmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEMESSAGE`>?, `dwtimeout` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetNewCalls; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetNewCalls`(`hline` : UInt, `dwaddressid` : UInt, `dwselect` : UInt, `lpcalllist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINECALLLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetNumRings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetNumRings`(`hline` : UInt, `dwaddressid` : UInt, `lpdwnumrings` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetProviderList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetProviderList`(`dwapiversion` : UInt, `lpproviderlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEPROVIDERLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetProviderListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetProviderListA`(`dwapiversion` : UInt, `lpproviderlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEPROVIDERLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetProviderListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetProviderListW`(`dwapiversion` : UInt, `lpproviderlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEPROVIDERLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetProxyStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetProxyStatus`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwappapiversion` : UInt, `lplineproxyreqestlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEPROXYREQUESTLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetQueueInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetQueueInfo`(`hline` : UInt, `dwqueueid` : UInt, `lplinequeueinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEQUEUEINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetQueueListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetQueueListA`(`hline` : UInt, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpqueuelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEQUEUELIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetQueueListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetQueueListW`(`hline` : UInt, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpqueuelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEQUEUELIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetRequest`(`hlineapp` : UInt, `dwrequestmode` : UInt, `lprequestbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetRequestA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetRequestA`(`hlineapp` : UInt, `dwrequestmode` : UInt, `lprequestbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetRequestW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetRequestW`(`hlineapp` : UInt, `dwrequestmode` : UInt, `lprequestbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetStatusMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetStatusMessages`(`hline` : UInt, `lpdwlinestates` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwaddressstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetTranslateCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetTranslateCaps`(`hlineapp` : UInt, `dwapiversion` : UInt, `lptranslatecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetTranslateCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetTranslateCapsA`(`hlineapp` : UInt, `dwapiversion` : UInt, `lptranslatecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineGetTranslateCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineGetTranslateCapsW`(`hlineapp` : UInt, `dwapiversion` : UInt, `lptranslatecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineHandoff; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineHandoff`(`hcall` : UInt, `lpszfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineHandoffA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineHandoffA`(`hcall` : UInt, `lpszfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineHandoffW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineHandoffW`(`hcall` : UInt, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `dwmediamode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineHold; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineHold`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineInitialize`(`lphlineapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `LINECALLBACK`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineInitializeExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineInitializeExA`(`lphlineapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `LINECALLBACK`, `lpszfriendlyappname` : `windows_sys`.`core`.`PCSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplineinitializeexparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEINITIALIZEEXPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineInitializeExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineInitializeExW`(`lphlineapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `LINECALLBACK`, `lpszfriendlyappname` : `windows_sys`.`core`.`PCWSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplineinitializeexparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEINITIALIZEEXPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMakeCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMakeCall`(`hline` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMakeCallA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMakeCallA`(`hline` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMakeCallW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMakeCallW`(`hline` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `dwcountrycode` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMonitorDigits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMonitorDigits`(`hcall` : UInt, `dwdigitmodes` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMonitorMedia; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMonitorMedia`(`hcall` : UInt, `dwmediamodes` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineMonitorTones; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineMonitorTones`(`hcall` : UInt, `lptonelist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEMONITORTONE`>?, `dwnumentries` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineNegotiateAPIVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineNegotiateAPIVersion`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapilowversion` : UInt, `dwapihighversion` : UInt, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineNegotiateExtVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineNegotiateExtVersion`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextlowversion` : UInt, `dwexthighversion` : UInt, `lpdwextversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineOpen`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lphline` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwapiversion` : UInt, `dwextversion` : UInt, `dwcallbackinstance` : ULong, `dwprivileges` : UInt, `dwmediamodes` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineOpenA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineOpenA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lphline` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwapiversion` : UInt, `dwextversion` : UInt, `dwcallbackinstance` : ULong, `dwprivileges` : UInt, `dwmediamodes` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineOpenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineOpenW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lphline` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwapiversion` : UInt, `dwextversion` : UInt, `dwcallbackinstance` : ULong, `dwprivileges` : UInt, `dwmediamodes` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePark`(`hcall` : UInt, `dwparkmode` : UInt, `lpszdiraddress` : `windows_sys`.`core`.`PCSTR`, `lpnondiraddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineParkA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineParkA`(`hcall` : UInt, `dwparkmode` : UInt, `lpszdiraddress` : `windows_sys`.`core`.`PCSTR`, `lpnondiraddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineParkW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineParkW`(`hcall` : UInt, `dwparkmode` : UInt, `lpszdiraddress` : `windows_sys`.`core`.`PCWSTR`, `lpnondiraddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePickup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePickup`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszgroupid` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePickupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePickupA`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszgroupid` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePickupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePickupW`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `lpszgroupid` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePrepareAddToConference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePrepareAddToConference`(`hconfcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePrepareAddToConferenceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePrepareAddToConferenceA`(`hconfcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=linePrepareAddToConferenceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `linePrepareAddToConferenceW`(`hconfcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineProxyMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineProxyMessage`(`hline` : UInt, `hcall` : UInt, `dwmsg` : UInt, `dwparam1` : UInt, `dwparam2` : UInt, `dwparam3` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineProxyResponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `lineProxyResponse`(`hline` : UInt, `lpproxyrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEPROXYREQUEST`>?, `dwresult` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRedirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRedirect`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRedirectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRedirectA`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRedirectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRedirectW`(`hcall` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `dwcountrycode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRegisterRequestRecipient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRegisterRequestRecipient`(`hlineapp` : UInt, `dwregistrationinstance` : UInt, `dwrequestmode` : UInt, `benable` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineReleaseUserUserInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineReleaseUserUserInfo`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRemoveFromConference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRemoveFromConference`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineRemoveProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineRemoveProvider`(`dwpermanentproviderid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSecureCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSecureCall`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSendUserUserInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSendUserUserInfo`(`hcall` : UInt, `lpsuseruserinfo` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentActivity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentActivity`(`hline` : UInt, `dwaddressid` : UInt, `dwactivityid` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentGroup`(`hline` : UInt, `dwaddressid` : UInt, `lpagentgrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEAGENTGROUPLIST`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentMeasurementPeriod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentMeasurementPeriod`(`hline` : UInt, `hagent` : UInt, `dwmeasurementperiod` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentSessionState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentSessionState`(`hline` : UInt, `hagentsession` : UInt, `dwagentsessionstate` : UInt, `dwnextagentsessionstate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentState`(`hline` : UInt, `dwaddressid` : UInt, `dwagentstate` : UInt, `dwnextagentstate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAgentStateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAgentStateEx`(`hline` : UInt, `hagent` : UInt, `dwagentstate` : UInt, `dwnextagentstate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAppPriority; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAppPriority`(`lpszappfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpszextensionname` : `windows_sys`.`core`.`PCSTR`, `dwpriority` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAppPriorityA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAppPriorityA`(`lpszappfilename` : `windows_sys`.`core`.`PCSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpszextensionname` : `windows_sys`.`core`.`PCSTR`, `dwpriority` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAppPriorityW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAppPriorityW`(`lpszappfilename` : `windows_sys`.`core`.`PCWSTR`, `dwmediamode` : UInt, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEEXTENSIONID`>?, `dwrequestmode` : UInt, `lpszextensionname` : `windows_sys`.`core`.`PCWSTR`, `dwpriority` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetAppSpecific; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetAppSpecific`(`hcall` : UInt, `dwappspecific` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCallData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCallData`(`hcall` : UInt, `lpcalldata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCallParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCallParams`(`hcall` : UInt, `dwbearermode` : UInt, `dwminrate` : UInt, `dwmaxrate` : UInt, `lpdialparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEDIALPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCallPrivilege; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCallPrivilege`(`hcall` : UInt, `dwcallprivilege` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCallQualityOfService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCallQualityOfService`(`hcall` : UInt, `lpsendingflowspec` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsendingflowspecsize` : UInt, `lpreceivingflowspec` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreceivingflowspecsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCallTreatment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCallTreatment`(`hcall` : UInt, `dwtreatment` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetCurrentLocation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetCurrentLocation`(`hlineapp` : UInt, `dwlocation` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetDevConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetDevConfig`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetDevConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetDevConfigA`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetDevConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetDevConfigW`(`dwdeviceid` : UInt, `lpdeviceconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetLineDevStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetLineDevStatus`(`hline` : UInt, `dwstatustochange` : UInt, `fstatus` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetMediaControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetMediaControl`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `dwselect` : UInt, `lpdigitlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEMEDIACONTROLDIGIT`>?, `dwdigitnumentries` : UInt, `lpmedialist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEMEDIACONTROLMEDIA`>?, `dwmedianumentries` : UInt, `lptonelist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEMEDIACONTROLTONE`>?, `dwtonenumentries` : UInt, `lpcallstatelist` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINEMEDIACONTROLCALLSTATE`>?, `dwcallstatenumentries` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetMediaMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetMediaMode`(`hcall` : UInt, `dwmediamodes` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetNumRings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetNumRings`(`hline` : UInt, `dwaddressid` : UInt, `dwnumrings` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetQueueMeasurementPeriod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetQueueMeasurementPeriod`(`hline` : UInt, `dwqueueid` : UInt, `dwmeasurementperiod` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetStatusMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetStatusMessages`(`hline` : UInt, `dwlinestates` : UInt, `dwaddressstates` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetTerminal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetTerminal`(`hline` : UInt, `dwaddressid` : UInt, `hcall` : UInt, `dwselect` : UInt, `dwterminalmodes` : UInt, `dwterminalid` : UInt, `benable` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetTollList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetTollList`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`, `dwtolllistoption` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetTollListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetTollListA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`, `dwtolllistoption` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetTollListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetTollListW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `lpszaddressinw` : `windows_sys`.`core`.`PCWSTR`, `dwtolllistoption` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupConference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupConference`(`hcall` : UInt, `hline` : UInt, `lphconfcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwnumparties` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupConferenceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupConferenceA`(`hcall` : UInt, `hline` : UInt, `lphconfcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwnumparties` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupConferenceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupConferenceW`(`hcall` : UInt, `hline` : UInt, `lphconfcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwnumparties` : UInt, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupTransfer`(`hcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupTransferA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupTransferA`(`hcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSetupTransferW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSetupTransferW`(`hcall` : UInt, `lphconsultcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcallparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`LINECALLPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineShutdown`(`hlineapp` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineSwapHold; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineSwapHold`(`hactivecall` : UInt, `hheldcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateAddress`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`, `dwcard` : UInt, `dwtranslateoptions` : UInt, `lptranslateoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATEOUTPUT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateAddressA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateAddressA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`, `dwcard` : UInt, `dwtranslateoptions` : UInt, `lptranslateoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATEOUTPUT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateAddressW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateAddressW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `lpszaddressin` : `windows_sys`.`core`.`PCWSTR`, `dwcard` : UInt, `dwtranslateoptions` : UInt, `lptranslateoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINETRANSLATEOUTPUT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateDialog`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateDialogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateDialogA`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszaddressin` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineTranslateDialogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineTranslateDialogW`(`hlineapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszaddressin` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineUncompleteCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineUncompleteCall`(`hline` : UInt, `dwcompletionid` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineUnhold; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineUnhold`(`hcall` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineUnpark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineUnpark`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineUnparkA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineUnparkA`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=lineUnparkW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `lineUnparkW`(`hline` : UInt, `dwaddressid` : UInt, `lphcall` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneClose`(`hphone` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneConfigDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneConfigDialog`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneConfigDialogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneConfigDialogA`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneConfigDialogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneConfigDialogW`(`dwdeviceid` : UInt, `hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneDevSpecific; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneDevSpecific`(`hphone` : UInt, `lpparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetButtonInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetButtonInfo`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetButtonInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetButtonInfoA`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetButtonInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetButtonInfoW`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetData`(`hphone` : UInt, `dwdataid` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetDevCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetDevCaps`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpphonecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetDevCapsA`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpphonecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetDevCapsW`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextversion` : UInt, `lpphonecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONECAPS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetDisplay; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetDisplay`(`hphone` : UInt, `lpdisplay` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetGain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetGain`(`hphone` : UInt, `dwhookswitchdev` : UInt, `lpdwgain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetHookSwitch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetHookSwitch`(`hphone` : UInt, `lpdwhookswitchdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetID`(`hphone` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetIDA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetIDA`(`hphone` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetIDW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetIDW`(`hphone` : UInt, `lpdeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARSTRING`>?, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `phoneGetIcon`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetIconA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `phoneGetIconA`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetIconW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `phoneGetIconW`(`dwdeviceid` : UInt, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`, `lphicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetLamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetLamp`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpdwlampmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetMessage`(`hphoneapp` : UInt, `lpmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEMESSAGE`>?, `dwtimeout` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetRing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetRing`(`hphone` : UInt, `lpdwringmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetStatus`(`hphone` : UInt, `lpphonestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONESTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetStatusA`(`hphone` : UInt, `lpphonestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONESTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetStatusMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetStatusMessages`(`hphone` : UInt, `lpdwphonestates` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwbuttonmodes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwbuttonstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetStatusW`(`hphone` : UInt, `lpphonestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONESTATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneGetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneGetVolume`(`hphone` : UInt, `dwhookswitchdev` : UInt, `lpdwvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneInitialize`(`lphphoneapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `PHONECALLBACK`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneInitializeExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneInitializeExA`(`lphphoneapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `PHONECALLBACK`, `lpszfriendlyappname` : `windows_sys`.`core`.`PCSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpphoneinitializeexparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEINITIALIZEEXPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneInitializeExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneInitializeExW`(`lphphoneapp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpfncallback` : `PHONECALLBACK`, `lpszfriendlyappname` : `windows_sys`.`core`.`PCWSTR`, `lpdwnumdevs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpphoneinitializeexparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEINITIALIZEEXPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneNegotiateAPIVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneNegotiateAPIVersion`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `dwapilowversion` : UInt, `dwapihighversion` : UInt, `lpdwapiversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpextensionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHONEEXTENSIONID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneNegotiateExtVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneNegotiateExtVersion`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `dwapiversion` : UInt, `dwextlowversion` : UInt, `dwexthighversion` : UInt, `lpdwextversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneOpen`(`hphoneapp` : UInt, `dwdeviceid` : UInt, `lphphone` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwapiversion` : UInt, `dwextversion` : UInt, `dwcallbackinstance` : ULong, `dwprivilege` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetButtonInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetButtonInfo`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetButtonInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetButtonInfoA`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetButtonInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetButtonInfoW`(`hphone` : UInt, `dwbuttonlampid` : UInt, `lpbuttoninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PHONEBUTTONINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetData`(`hphone` : UInt, `dwdataid` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetDisplay; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetDisplay`(`hphone` : UInt, `dwrow` : UInt, `dwcolumn` : UInt, `lpsdisplay` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetGain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetGain`(`hphone` : UInt, `dwhookswitchdev` : UInt, `dwgain` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetHookSwitch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetHookSwitch`(`hphone` : UInt, `dwhookswitchdevs` : UInt, `dwhookswitchmode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetLamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetLamp`(`hphone` : UInt, `dwbuttonlampid` : UInt, `dwlampmode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetRing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetRing`(`hphone` : UInt, `dwringmode` : UInt, `dwvolume` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetStatusMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetStatusMessages`(`hphone` : UInt, `dwphonestates` : UInt, `dwbuttonmodes` : UInt, `dwbuttonstates` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneSetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneSetVolume`(`hphone` : UInt, `dwhookswitchdev` : UInt, `dwvolume` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=phoneShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `phoneShutdown`(`hphoneapp` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiGetLocationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiGetLocationInfo`(`lpszcountrycode` : `windows_sys`.`core`.`PSTR`, `lpszcitycode` : `windows_sys`.`core`.`PSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiGetLocationInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiGetLocationInfoA`(`lpszcountrycode` : `windows_sys`.`core`.`PSTR`, `lpszcitycode` : `windows_sys`.`core`.`PSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiGetLocationInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiGetLocationInfoW`(`lpszcountrycodew` : `windows_sys`.`core`.`PWSTR`, `lpszcitycodew` : `windows_sys`.`core`.`PWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestDrop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestDrop`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wrequestid` : `super`.`super`.`Foundation`.`WPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMakeCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMakeCall`(`lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCSTR`, `lpszcomment` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMakeCallA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMakeCallA`(`lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCSTR`, `lpszcomment` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMakeCallW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMakeCallW`(`lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `lpszappname` : `windows_sys`.`core`.`PCWSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCWSTR`, `lpszcomment` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMediaCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMediaCall`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wrequestid` : `super`.`super`.`Foundation`.`WPARAM`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lpdeviceid` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt, `dwsecure` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCSTR`, `lpszcomment` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMediaCallA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMediaCallA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wrequestid` : `super`.`super`.`Foundation`.`WPARAM`, `lpszdeviceclass` : `windows_sys`.`core`.`PCSTR`, `lpdeviceid` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt, `dwsecure` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCSTR`, `lpszappname` : `windows_sys`.`core`.`PCSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCSTR`, `lpszcomment` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tapi32.dll, ABI=system, export=tapiRequestMediaCallW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `tapiRequestMediaCallW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wrequestid` : `super`.`super`.`Foundation`.`WPARAM`, `lpszdeviceclass` : `windows_sys`.`core`.`PCWSTR`, `lpdeviceid` : `windows_sys`.`core`.`PCWSTR`, `dwsize` : UInt, `dwsecure` : UInt, `lpszdestaddress` : `windows_sys`.`core`.`PCWSTR`, `lpszappname` : `windows_sys`.`core`.`PCWSTR`, `lpszcalledparty` : `windows_sys`.`core`.`PCWSTR`, `lpszcomment` : `windows_sys`.`core`.`PCWSTR`) : Int
public const val `ACDGE_GROUP_REMOVED`: `ACDGROUP_EVENT` = 1;
public const val `ACDGE_NEW_GROUP`: `ACDGROUP_EVENT` = 0;
public typealias `ACDGROUP_EVENT` = Int;
public const val `ACDQE_NEW_QUEUE`: `ACDQUEUE_EVENT` = 0;
public const val `ACDQE_QUEUE_REMOVED`: `ACDQUEUE_EVENT` = 1;
public typealias `ACDQUEUE_EVENT` = Int;
public const val `ACS_ADDRESSDEVICESPECIFIC`: `ADDRESS_CAPABILITY_STRING` = 1;
public const val `ACS_LINEDEVICESPECIFIC`: `ADDRESS_CAPABILITY_STRING` = 2;
public const val `ACS_PERMANENTDEVICEGUID`: `ADDRESS_CAPABILITY_STRING` = 5;
public const val `ACS_PROTOCOL`: `ADDRESS_CAPABILITY_STRING` = 0;
public const val `ACS_PROVIDERSPECIFIC`: `ADDRESS_CAPABILITY_STRING` = 3;
public const val `ACS_SWITCHSPECIFIC`: `ADDRESS_CAPABILITY_STRING` = 4;
public const val `AC_ADDRESSCAPFLAGS`: `ADDRESS_CAPABILITY` = 23;
public const val `AC_ADDRESSFEATURES`: `ADDRESS_CAPABILITY` = 29;
public const val `AC_ADDRESSID`: `ADDRESS_CAPABILITY` = 33;
public const val `AC_ADDRESSTYPES`: `ADDRESS_CAPABILITY` = 0;
public const val `AC_ANSWERMODES`: `ADDRESS_CAPABILITY` = 14;
public const val `AC_BEARERMODES`: `ADDRESS_CAPABILITY` = 1;
public const val `AC_CALLCOMPLETIONCONDITIONS`: `ADDRESS_CAPABILITY` = 40;
public const val `AC_CALLCOMPLETIONMODES`: `ADDRESS_CAPABILITY` = 41;
public const val `AC_CALLEDIDSUPPORT`: `ADDRESS_CAPABILITY` = 19;
public const val `AC_CALLERIDSUPPORT`: `ADDRESS_CAPABILITY` = 18;
public const val `AC_CALLFEATURES1`: `ADDRESS_CAPABILITY` = 24;
public const val `AC_CALLFEATURES2`: `ADDRESS_CAPABILITY` = 25;
public const val `AC_CONNECTEDIDSUPPORT`: `ADDRESS_CAPABILITY` = 20;
public const val `AC_DEVCAPFLAGS`: `ADDRESS_CAPABILITY` = 13;
public const val `AC_FORWARDMODES`: `ADDRESS_CAPABILITY` = 34;
public const val `AC_GATHERDIGITSMAXTIMEOUT`: `ADDRESS_CAPABILITY` = 44;
public const val `AC_GATHERDIGITSMINTIMEOUT`: `ADDRESS_CAPABILITY` = 43;
public const val `AC_GENERATEDIGITDEFAULTDURATION`: `ADDRESS_CAPABILITY` = 47;
public const val `AC_GENERATEDIGITMAXDURATION`: `ADDRESS_CAPABILITY` = 46;
public const val `AC_GENERATEDIGITMINDURATION`: `ADDRESS_CAPABILITY` = 45;
public const val `AC_GENERATEDIGITSUPPORT`: `ADDRESS_CAPABILITY` = 8;
public const val `AC_GENERATETONEMAXNUMFREQ`: `ADDRESS_CAPABILITY` = 10;
public const val `AC_GENERATETONEMODES`: `ADDRESS_CAPABILITY` = 9;
public const val `AC_LINEFEATURES`: `ADDRESS_CAPABILITY` = 15;
public const val `AC_LINEID`: `ADDRESS_CAPABILITY` = 32;
public const val `AC_MAXACTIVECALLS`: `ADDRESS_CAPABILITY` = 2;
public const val `AC_MAXCALLCOMPLETIONS`: `ADDRESS_CAPABILITY` = 39;
public const val `AC_MAXCALLDATASIZE`: `ADDRESS_CAPABILITY` = 31;
public const val `AC_MAXFORWARDENTRIES`: `ADDRESS_CAPABILITY` = 35;
public const val `AC_MAXFWDNUMRINGS`: `ADDRESS_CAPABILITY` = 38;
public const val `AC_MAXNUMCONFERENCE`: `ADDRESS_CAPABILITY` = 5;
public const val `AC_MAXNUMTRANSCONF`: `ADDRESS_CAPABILITY` = 6;
public const val `AC_MAXONHOLDCALLS`: `ADDRESS_CAPABILITY` = 3;
public const val `AC_MAXONHOLDPENDINGCALLS`: `ADDRESS_CAPABILITY` = 4;
public const val `AC_MAXSPECIFICENTRIES`: `ADDRESS_CAPABILITY` = 36;
public const val `AC_MINFWDNUMRINGS`: `ADDRESS_CAPABILITY` = 37;
public const val `AC_MONITORDIGITSUPPORT`: `ADDRESS_CAPABILITY` = 7;
public const val `AC_MONITORTONEMAXNUMENTRIES`: `ADDRESS_CAPABILITY` = 12;
public const val `AC_MONITORTONEMAXNUMFREQ`: `ADDRESS_CAPABILITY` = 11;
public const val `AC_PARKSUPPORT`: `ADDRESS_CAPABILITY` = 17;
public const val `AC_PERMANENTDEVICEID`: `ADDRESS_CAPABILITY` = 42;
public const val `AC_PREDICTIVEAUTOTRANSFERSTATES`: `ADDRESS_CAPABILITY` = 30;
public const val `AC_REDIRECTINGIDSUPPORT`: `ADDRESS_CAPABILITY` = 22;
public const val `AC_REDIRECTIONIDSUPPORT`: `ADDRESS_CAPABILITY` = 21;
public const val `AC_REMOVEFROMCONFCAPS`: `ADDRESS_CAPABILITY` = 26;
public const val `AC_REMOVEFROMCONFSTATE`: `ADDRESS_CAPABILITY` = 27;
public const val `AC_SETTABLEDEVSTATUS`: `ADDRESS_CAPABILITY` = 16;
public const val `AC_TRANSFERMODES`: `ADDRESS_CAPABILITY` = 28;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 41 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADDRALIAS` (
    public var `rgchName`: ByteArray,
    public var `rgchEName`: ByteArray,
    public var `rgchSrvr`: ByteArray,
    public var `dibDetail`: UInt,
    public var `type`: UShort,
)
// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADDRALIAS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADDRESS_CAPABILITY` = Int;
public typealias `ADDRESS_CAPABILITY_STRING` = Int;
public typealias `ADDRESS_EVENT` = Int;
public typealias `ADDRESS_STATE` = Int;
public const val `ADDRESS_TERMINAL_AVAILABLE`: `MSP_ADDRESS_EVENT` = 0;
public const val `ADDRESS_TERMINAL_UNAVAILABLE`: `MSP_ADDRESS_EVENT` = 1;
public const val `AE_BUSY_ACD`: `AGENT_EVENT` = 2;
public const val `AE_BUSY_INCOMING`: `AGENT_EVENT` = 3;
public const val `AE_BUSY_OUTGOING`: `AGENT_EVENT` = 4;
public const val `AE_CAPSCHANGE`: `ADDRESS_EVENT` = 1;
public const val `AE_CONFIGCHANGE`: `ADDRESS_EVENT` = 3;
public const val `AE_FORWARD`: `ADDRESS_EVENT` = 4;
public const val `AE_LASTITEM`: `ADDRESS_EVENT` = 8;
public const val `AE_MSGWAITOFF`: `ADDRESS_EVENT` = 8;
public const val `AE_MSGWAITON`: `ADDRESS_EVENT` = 7;
public const val `AE_NEWTERMINAL`: `ADDRESS_EVENT` = 5;
public const val `AE_NOT_READY`: `AGENT_EVENT` = 0;
public const val `AE_READY`: `AGENT_EVENT` = 1;
public const val `AE_REMOVETERMINAL`: `ADDRESS_EVENT` = 6;
public const val `AE_RINGING`: `ADDRESS_EVENT` = 2;
public const val `AE_STATE`: `ADDRESS_EVENT` = 0;
public const val `AE_UNKNOWN`: `AGENT_EVENT` = 5;
public typealias `AGENTHANDLER_EVENT` = Int;
public typealias `AGENT_EVENT` = Int;
public typealias `AGENT_SESSION_EVENT` = Int;
public typealias `AGENT_SESSION_STATE` = Int;
public typealias `AGENT_STATE` = Int;
public const val `AHE_AGENTHANDLER_REMOVED`: `AGENTHANDLER_EVENT` = 1;
public const val `AHE_NEW_AGENTHANDLER`: `AGENTHANDLER_EVENT` = 0;
public const val `ASE_BUSY`: `AGENT_SESSION_EVENT` = 3;
public const val `ASE_END`: `AGENT_SESSION_EVENT` = 5;
public const val `ASE_NEW_SESSION`: `AGENT_SESSION_EVENT` = 0;
public const val `ASE_NOT_READY`: `AGENT_SESSION_EVENT` = 1;
public const val `ASE_READY`: `AGENT_SESSION_EVENT` = 2;
public const val `ASE_WRAPUP`: `AGENT_SESSION_EVENT` = 4;
public const val `ASST_BUSY_ON_CALL`: `AGENT_SESSION_STATE` = 2;
public const val `ASST_BUSY_WRAPUP`: `AGENT_SESSION_STATE` = 3;
public const val `ASST_NOT_READY`: `AGENT_SESSION_STATE` = 0;
public const val `ASST_READY`: `AGENT_SESSION_STATE` = 1;
public const val `ASST_SESSION_ENDED`: `AGENT_SESSION_STATE` = 4;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ASYNC_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int) -> Unit>>>;
public const val `AS_BUSY_ACD`: `AGENT_STATE` = 2;
public const val `AS_BUSY_INCOMING`: `AGENT_STATE` = 3;
public const val `AS_BUSY_OUTGOING`: `AGENT_STATE` = 4;
public const val `AS_INSERVICE`: `ADDRESS_STATE` = 0;
public const val `AS_NOT_READY`: `AGENT_STATE` = 0;
public const val `AS_OUTOFSERVICE`: `ADDRESS_STATE` = 1;
public const val `AS_READY`: `AGENT_STATE` = 1;
public const val `AS_UNKNOWN`: `AGENT_STATE` = 5;
public typealias `CALLHUB_EVENT` = Int;
public typealias `CALLHUB_STATE` = Int;
public typealias `CALLINFOCHANGE_CAUSE` = Int;
public typealias `CALLINFO_BUFFER` = Int;
public typealias `CALLINFO_LONG` = Int;
public typealias `CALLINFO_STRING` = Int;
public const val `CALL_CAUSE_BAD_DEVICE`: `MSP_CALL_EVENT_CAUSE` = 1;
public const val `CALL_CAUSE_CONNECT_FAIL`: `MSP_CALL_EVENT_CAUSE` = 2;
public const val `CALL_CAUSE_LOCAL_REQUEST`: `MSP_CALL_EVENT_CAUSE` = 3;
public const val `CALL_CAUSE_MEDIA_RECOVERED`: `MSP_CALL_EVENT_CAUSE` = 6;
public const val `CALL_CAUSE_MEDIA_TIMEOUT`: `MSP_CALL_EVENT_CAUSE` = 5;
public const val `CALL_CAUSE_QUALITY_OF_SERVICE`: `MSP_CALL_EVENT_CAUSE` = 7;
public const val `CALL_CAUSE_REMOTE_REQUEST`: `MSP_CALL_EVENT_CAUSE` = 4;
public const val `CALL_CAUSE_UNKNOWN`: `MSP_CALL_EVENT_CAUSE` = 0;
public typealias `CALL_MEDIA_EVENT` = Int;
public typealias `CALL_MEDIA_EVENT_CAUSE` = Int;
public const val `CALL_NEW_STREAM`: `MSP_CALL_EVENT` = 0;
public typealias `CALL_NOTIFICATION_EVENT` = Int;
public typealias `CALL_PRIVILEGE` = Int;
public typealias `CALL_STATE` = Int;
public typealias `CALL_STATE_EVENT_CAUSE` = Int;
public const val `CALL_STREAM_ACTIVE`: `MSP_CALL_EVENT` = 4;
public const val `CALL_STREAM_FAIL`: `MSP_CALL_EVENT` = 1;
public const val `CALL_STREAM_INACTIVE`: `MSP_CALL_EVENT` = 5;
public const val `CALL_STREAM_NOT_USED`: `MSP_CALL_EVENT` = 3;
public const val `CALL_TERMINAL_FAIL`: `MSP_CALL_EVENT` = 2;
public const val `CEC_DISCONNECT_BADADDRESS`: `CALL_STATE_EVENT_CAUSE` = 3;
public const val `CEC_DISCONNECT_BLOCKED`: `CALL_STATE_EVENT_CAUSE` = 8;
public const val `CEC_DISCONNECT_BUSY`: `CALL_STATE_EVENT_CAUSE` = 2;
public const val `CEC_DISCONNECT_CANCELLED`: `CALL_STATE_EVENT_CAUSE` = 5;
public const val `CEC_DISCONNECT_FAILED`: `CALL_STATE_EVENT_CAUSE` = 7;
public const val `CEC_DISCONNECT_NOANSWER`: `CALL_STATE_EVENT_CAUSE` = 4;
public const val `CEC_DISCONNECT_NORMAL`: `CALL_STATE_EVENT_CAUSE` = 1;
public const val `CEC_DISCONNECT_REJECTED`: `CALL_STATE_EVENT_CAUSE` = 6;
public const val `CEC_NONE`: `CALL_STATE_EVENT_CAUSE` = 0;
public const val `CHE_CALLHUBIDLE`: `CALLHUB_EVENT` = 3;
public const val `CHE_CALLHUBNEW`: `CALLHUB_EVENT` = 2;
public const val `CHE_CALLJOIN`: `CALLHUB_EVENT` = 0;
public const val `CHE_CALLLEAVE`: `CALLHUB_EVENT` = 1;
public const val `CHE_LASTITEM`: `CALLHUB_EVENT` = 3;
public const val `CHS_ACTIVE`: `CALLHUB_STATE` = 0;
public const val `CHS_IDLE`: `CALLHUB_STATE` = 1;
public const val `CIB_CALLDATABUFFER`: `CALLINFO_BUFFER` = 2;
public const val `CIB_CHARGINGINFOBUFFER`: `CALLINFO_BUFFER` = 3;
public const val `CIB_DEVSPECIFICBUFFER`: `CALLINFO_BUFFER` = 1;
public const val `CIB_HIGHLEVELCOMPATIBILITYBUFFER`: `CALLINFO_BUFFER` = 4;
public const val `CIB_LOWLEVELCOMPATIBILITYBUFFER`: `CALLINFO_BUFFER` = 5;
public const val `CIB_USERUSERINFO`: `CALLINFO_BUFFER` = 0;
public const val `CIC_APPSPECIFIC`: `CALLINFOCHANGE_CAUSE` = 4;
public const val `CIC_BEARERMODE`: `CALLINFOCHANGE_CAUSE` = 2;
public const val `CIC_CALLDATA`: `CALLINFOCHANGE_CAUSE` = 24;
public const val `CIC_CALLEDID`: `CALLINFOCHANGE_CAUSE` = 15;
public const val `CIC_CALLERID`: `CALLINFOCHANGE_CAUSE` = 14;
public const val `CIC_CALLID`: `CALLINFOCHANGE_CAUSE` = 5;
public const val `CIC_CHARGINGINFO`: `CALLINFOCHANGE_CAUSE` = 22;
public const val `CIC_COMPLETIONID`: `CALLINFOCHANGE_CAUSE` = 9;
public const val `CIC_CONNECTEDID`: `CALLINFOCHANGE_CAUSE` = 16;
public const val `CIC_DEVSPECIFIC`: `CALLINFOCHANGE_CAUSE` = 1;
public const val `CIC_HIGHLEVELCOMP`: `CALLINFOCHANGE_CAUSE` = 20;
public const val `CIC_LASTITEM`: `CALLINFOCHANGE_CAUSE` = 26;
public const val `CIC_LOWLEVELCOMP`: `CALLINFOCHANGE_CAUSE` = 21;
public const val `CIC_MEDIATYPE`: `CALLINFOCHANGE_CAUSE` = 26;
public const val `CIC_NUMMONITORS`: `CALLINFOCHANGE_CAUSE` = 12;
public const val `CIC_NUMOWNERDECR`: `CALLINFOCHANGE_CAUSE` = 11;
public const val `CIC_NUMOWNERINCR`: `CALLINFOCHANGE_CAUSE` = 10;
public const val `CIC_ORIGIN`: `CALLINFOCHANGE_CAUSE` = 7;
public const val `CIC_OTHER`: `CALLINFOCHANGE_CAUSE` = 0;
public const val `CIC_PRIVILEGE`: `CALLINFOCHANGE_CAUSE` = 25;
public const val `CIC_RATE`: `CALLINFOCHANGE_CAUSE` = 3;
public const val `CIC_REASON`: `CALLINFOCHANGE_CAUSE` = 8;
public const val `CIC_REDIRECTINGID`: `CALLINFOCHANGE_CAUSE` = 18;
public const val `CIC_REDIRECTIONID`: `CALLINFOCHANGE_CAUSE` = 17;
public const val `CIC_RELATEDCALLID`: `CALLINFOCHANGE_CAUSE` = 6;
public const val `CIC_TREATMENT`: `CALLINFOCHANGE_CAUSE` = 23;
public const val `CIC_TRUNK`: `CALLINFOCHANGE_CAUSE` = 13;
public const val `CIC_USERUSERINFO`: `CALLINFOCHANGE_CAUSE` = 19;
public const val `CIL_APPSPECIFIC`: `CALLINFO_LONG` = 9;
public const val `CIL_BEARERMODE`: `CALLINFO_LONG` = 1;
public const val `CIL_CALLEDIDADDRESSTYPE`: `CALLINFO_LONG` = 3;
public const val `CIL_CALLERIDADDRESSTYPE`: `CALLINFO_LONG` = 2;
public const val `CIL_CALLID`: `CALLINFO_LONG` = 15;
public const val `CIL_CALLPARAMSFLAGS`: `CALLINFO_LONG` = 10;
public const val `CIL_CALLTREATMENT`: `CALLINFO_LONG` = 11;
public const val `CIL_COMPLETIONID`: `CALLINFO_LONG` = 17;
public const val `CIL_CONNECTEDIDADDRESSTYPE`: `CALLINFO_LONG` = 4;
public const val `CIL_COUNTRYCODE`: `CALLINFO_LONG` = 14;
public const val `CIL_GENERATEDIGITDURATION`: `CALLINFO_LONG` = 22;
public const val `CIL_MAXRATE`: `CALLINFO_LONG` = 13;
public const val `CIL_MEDIATYPESAVAILABLE`: `CALLINFO_LONG` = 0;
public const val `CIL_MINRATE`: `CALLINFO_LONG` = 12;
public const val `CIL_MONITORDIGITMODES`: `CALLINFO_LONG` = 23;
public const val `CIL_MONITORMEDIAMODES`: `CALLINFO_LONG` = 24;
public const val `CIL_NUMBEROFMONITORS`: `CALLINFO_LONG` = 19;
public const val `CIL_NUMBEROFOWNERS`: `CALLINFO_LONG` = 18;
public const val `CIL_ORIGIN`: `CALLINFO_LONG` = 7;
public const val `CIL_RATE`: `CALLINFO_LONG` = 21;
public const val `CIL_REASON`: `CALLINFO_LONG` = 8;
public const val `CIL_REDIRECTINGIDADDRESSTYPE`: `CALLINFO_LONG` = 6;
public const val `CIL_REDIRECTIONIDADDRESSTYPE`: `CALLINFO_LONG` = 5;
public const val `CIL_RELATEDCALLID`: `CALLINFO_LONG` = 16;
public const val `CIL_TRUNK`: `CALLINFO_LONG` = 20;
public const val `CIS_CALLEDIDNAME`: `CALLINFO_STRING` = 2;
public const val `CIS_CALLEDIDNUMBER`: `CALLINFO_STRING` = 3;
public const val `CIS_CALLEDPARTYFRIENDLYNAME`: `CALLINFO_STRING` = 10;
public const val `CIS_CALLERIDNAME`: `CALLINFO_STRING` = 0;
public const val `CIS_CALLERIDNUMBER`: `CALLINFO_STRING` = 1;
public const val `CIS_CALLINGPARTYID`: `CALLINFO_STRING` = 13;
public const val `CIS_COMMENT`: `CALLINFO_STRING` = 11;
public const val `CIS_CONNECTEDIDNAME`: `CALLINFO_STRING` = 4;
public const val `CIS_CONNECTEDIDNUMBER`: `CALLINFO_STRING` = 5;
public const val `CIS_DISPLAYABLEADDRESS`: `CALLINFO_STRING` = 12;
public const val `CIS_REDIRECTINGIDNAME`: `CALLINFO_STRING` = 8;
public const val `CIS_REDIRECTINGIDNUMBER`: `CALLINFO_STRING` = 9;
public const val `CIS_REDIRECTIONIDNAME`: `CALLINFO_STRING` = 6;
public const val `CIS_REDIRECTIONIDNUMBER`: `CALLINFO_STRING` = 7;
public const val `CMC_BAD_DEVICE`: `CALL_MEDIA_EVENT_CAUSE` = 1;
public const val `CMC_CONNECT_FAIL`: `CALL_MEDIA_EVENT_CAUSE` = 2;
public const val `CMC_LOCAL_REQUEST`: `CALL_MEDIA_EVENT_CAUSE` = 3;
public const val `CMC_MEDIA_RECOVERED`: `CALL_MEDIA_EVENT_CAUSE` = 6;
public const val `CMC_MEDIA_TIMEOUT`: `CALL_MEDIA_EVENT_CAUSE` = 5;
public const val `CMC_QUALITY_OF_SERVICE`: `CALL_MEDIA_EVENT_CAUSE` = 7;
public const val `CMC_REMOTE_REQUEST`: `CALL_MEDIA_EVENT_CAUSE` = 4;
public const val `CMC_UNKNOWN`: `CALL_MEDIA_EVENT_CAUSE` = 0;
public const val `CME_LASTITEM`: `CALL_MEDIA_EVENT` = 5;
public const val `CME_NEW_STREAM`: `CALL_MEDIA_EVENT` = 0;
public const val `CME_STREAM_ACTIVE`: `CALL_MEDIA_EVENT` = 4;
public const val `CME_STREAM_FAIL`: `CALL_MEDIA_EVENT` = 1;
public const val `CME_STREAM_INACTIVE`: `CALL_MEDIA_EVENT` = 5;
public const val `CME_STREAM_NOT_USED`: `CALL_MEDIA_EVENT` = 3;
public const val `CME_TERMINAL_FAIL`: `CALL_MEDIA_EVENT` = 2;
public const val `CNE_LASTITEM`: `CALL_NOTIFICATION_EVENT` = 1;
public const val `CNE_MONITOR`: `CALL_NOTIFICATION_EVENT` = 1;
public const val `CNE_OWNER`: `CALL_NOTIFICATION_EVENT` = 0;
public const val `CP_MONITOR`: `CALL_PRIVILEGE` = 1;
public const val `CP_OWNER`: `CALL_PRIVILEGE` = 0;
public const val `CS_CONNECTED`: `CALL_STATE` = 2;
public const val `CS_DISCONNECTED`: `CALL_STATE` = 3;
public const val `CS_HOLD`: `CALL_STATE` = 5;
public const val `CS_IDLE`: `CALL_STATE` = 0;
public const val `CS_INPROGRESS`: `CALL_STATE` = 1;
public const val `CS_LASTITEM`: `CALL_STATE` = 6;
public const val `CS_OFFERING`: `CALL_STATE` = 4;
public const val `CS_QUEUED`: `CALL_STATE` = 6;
public const val `DC_NOANSWER`: `DISCONNECT_CODE` = 1;
public const val `DC_NORMAL`: `DISCONNECT_CODE` = 0;
public const val `DC_REJECTED`: `DISCONNECT_CODE` = 2;
public typealias `DIRECTORY_OBJECT_TYPE` = Int;
public typealias `DIRECTORY_TYPE` = Int;
public typealias `DISCONNECT_CODE` = Int;
public const val `DISPIDMASK`: UInt = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTR` (
    public var `wYear`: UShort,
    public var `wMonth`: UShort,
    public var `wDay`: UShort,
    public var `wHour`: UShort,
    public var `wMinute`: UShort,
    public var `wSecond`: UShort,
    public var `wDayOfWeek`: UShort,
)
public const val `DT_ILS`: `DIRECTORY_TYPE` = 2;
public const val `DT_NTDS`: `DIRECTORY_TYPE` = 1;
// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DispatchMapper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe9225296_c759_11d1_a02b_00c04fb6809f);

public const val `FDS_NOTSUPPORTED`: `FULLDUPLEX_SUPPORT` = 1;
public const val `FDS_SUPPORTED`: `FULLDUPLEX_SUPPORT` = 0;
public const val `FDS_UNKNOWN`: `FULLDUPLEX_SUPPORT` = 2;
public typealias `FINISH_MODE` = Int;
public const val `FM_ASCONFERENCE`: `FINISH_MODE` = 1;
public const val `FM_ASTRANSFER`: `FINISH_MODE` = 0;
public const val `FTEC_END_OF_FILE`: `FT_STATE_EVENT_CAUSE` = 1;
public const val `FTEC_NORMAL`: `FT_STATE_EVENT_CAUSE` = 0;
public const val `FTEC_READ_ERROR`: `FT_STATE_EVENT_CAUSE` = 2;
public const val `FTEC_WRITE_ERROR`: `FT_STATE_EVENT_CAUSE` = 3;
public typealias `FT_STATE_EVENT_CAUSE` = Int;
public typealias `FULLDUPLEX_SUPPORT` = Int;
// UNSUPPORTED Rust 564:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GETTNEFSTREAMCODEPAGE: windows_sys::core::PCSTR = windows_sys::core::s!("GetTnefStreamCodePage");

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVCALL` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVDIALOGINSTANCE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVLINE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVMSPLINE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVPHONE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPROVIDER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTAPICALL` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTAPILINE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTAPIPHONE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `IDISPADDRESS`: UInt = 65536u;
public const val `IDISPADDRESSCAPABILITIES`: UInt = 131072u;
public const val `IDISPADDRESSTRANSLATION`: UInt = 262144u;
public const val `IDISPAGGREGATEDMSPADDRESSOBJ`: UInt = 393216u;
public const val `IDISPAGGREGATEDMSPCALLOBJ`: UInt = 262144u;
public const val `IDISPAPC`: UInt = 131072u;
public const val `IDISPBASICCALLCONTROL`: UInt = 131072u;
public const val `IDISPCALLINFO`: UInt = 65536u;
public const val `IDISPDIRECTORY`: UInt = 65536u;
public const val `IDISPDIROBJCONFERENCE`: UInt = 131072u;
public const val `IDISPDIROBJECT`: UInt = 65536u;
public const val `IDISPDIROBJUSER`: UInt = 196608u;
public const val `IDISPFILETRACK`: UInt = 65536u;
public const val `IDISPILSCONFIG`: UInt = 131072u;
public const val `IDISPLEGACYADDRESSMEDIACONTROL`: UInt = 327680u;
public const val `IDISPLEGACYCALLMEDIACONTROL`: UInt = 196608u;
public const val `IDISPMEDIACONTROL`: UInt = 131072u;
public const val `IDISPMEDIAPLAYBACK`: UInt = 262144u;
public const val `IDISPMEDIARECORD`: UInt = 196608u;
public const val `IDISPMEDIASUPPORT`: UInt = 196608u;
public const val `IDISPMULTITRACK`: UInt = 65536u;
public const val `IDISPPHONE`: UInt = 65536u;
public const val `IDISPTAPI`: UInt = 65536u;
public const val `IDISPTAPICALLCENTER`: UInt = 131072u;
public const val `INITIALIZE_NEGOTIATION`: UInt = 4294967295u;
public const val `INTERFACEMASK`: UInt = 16711680u;
public const val `LAST_LINEMEDIAMODE`: UInt = 32768u;
public const val `LAST_LINEREQUESTMODE`: UInt = 2u;
public const val `LINEADDRCAPFLAGS_ACCEPTTOALERT`: UInt = 1048576u;
public const val `LINEADDRCAPFLAGS_ACDGROUP`: UInt = 1073741824u;
public const val `LINEADDRCAPFLAGS_AUTORECONNECT`: UInt = 1024u;
public const val `LINEADDRCAPFLAGS_BLOCKIDDEFAULT`: UInt = 8u;
public const val `LINEADDRCAPFLAGS_BLOCKIDOVERRIDE`: UInt = 16u;
public const val `LINEADDRCAPFLAGS_COMPLETIONID`: UInt = 2048u;
public const val `LINEADDRCAPFLAGS_CONFDROP`: UInt = 2097152u;
public const val `LINEADDRCAPFLAGS_CONFERENCEHELD`: UInt = 16384u;
public const val `LINEADDRCAPFLAGS_CONFERENCEMAKE`: UInt = 32768u;
public const val `LINEADDRCAPFLAGS_DESTOFFHOOK`: UInt = 128u;
public const val `LINEADDRCAPFLAGS_DIALED`: UInt = 32u;
public const val `LINEADDRCAPFLAGS_FWDBUSYNAADDR`: UInt = 524288u;
public const val `LINEADDRCAPFLAGS_FWDCONSULT`: UInt = 256u;
public const val `LINEADDRCAPFLAGS_FWDINTEXTADDR`: UInt = 262144u;
public const val `LINEADDRCAPFLAGS_FWDNUMRINGS`: UInt = 1u;
public const val `LINEADDRCAPFLAGS_FWDSTATUSVALID`: UInt = 131072u;
public const val `LINEADDRCAPFLAGS_HOLDMAKESNEW`: UInt = 67108864u;
public const val `LINEADDRCAPFLAGS_NOEXTERNALCALLS`: UInt = 268435456u;
public const val `LINEADDRCAPFLAGS_NOINTERNALCALLS`: UInt = 134217728u;
public const val `LINEADDRCAPFLAGS_NOPSTNADDRESSTRANSLATION`: UInt = 2147483648u;
public const val `LINEADDRCAPFLAGS_ORIGOFFHOOK`: UInt = 64u;
public const val `LINEADDRCAPFLAGS_PARTIALDIAL`: UInt = 65536u;
public const val `LINEADDRCAPFLAGS_PICKUPCALLWAIT`: UInt = 4194304u;
public const val `LINEADDRCAPFLAGS_PICKUPGROUPID`: UInt = 2u;
public const val `LINEADDRCAPFLAGS_PREDICTIVEDIALER`: UInt = 8388608u;
public const val `LINEADDRCAPFLAGS_QUEUE`: UInt = 16777216u;
public const val `LINEADDRCAPFLAGS_ROUTEPOINT`: UInt = 33554432u;
public const val `LINEADDRCAPFLAGS_SECURE`: UInt = 4u;
public const val `LINEADDRCAPFLAGS_SETCALLINGID`: UInt = 536870912u;
public const val `LINEADDRCAPFLAGS_SETUPCONFNULL`: UInt = 512u;
public const val `LINEADDRCAPFLAGS_TRANSFERHELD`: UInt = 4096u;
public const val `LINEADDRCAPFLAGS_TRANSFERMAKE`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEADDRESSCAPS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwLineDeviceID`: UInt,
    public var `dwAddressSize`: UInt,
    public var `dwAddressOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwAddressSharing`: UInt,
    public var `dwAddressStates`: UInt,
    public var `dwCallInfoStates`: UInt,
    public var `dwCallerIDFlags`: UInt,
    public var `dwCalledIDFlags`: UInt,
    public var `dwConnectedIDFlags`: UInt,
    public var `dwRedirectionIDFlags`: UInt,
    public var `dwRedirectingIDFlags`: UInt,
    public var `dwCallStates`: UInt,
    public var `dwDialToneModes`: UInt,
    public var `dwBusyModes`: UInt,
    public var `dwSpecialInfo`: UInt,
    public var `dwDisconnectModes`: UInt,
    public var `dwMaxNumActiveCalls`: UInt,
    public var `dwMaxNumOnHoldCalls`: UInt,
    public var `dwMaxNumOnHoldPendingCalls`: UInt,
    public var `dwMaxNumConference`: UInt,
    public var `dwMaxNumTransConf`: UInt,
    public var `dwAddrCapFlags`: UInt,
    public var `dwCallFeatures`: UInt,
    public var `dwRemoveFromConfCaps`: UInt,
    public var `dwRemoveFromConfState`: UInt,
    public var `dwTransferModes`: UInt,
    public var `dwParkModes`: UInt,
    public var `dwForwardModes`: UInt,
    public var `dwMaxForwardEntries`: UInt,
    public var `dwMaxSpecificEntries`: UInt,
    public var `dwMinFwdNumRings`: UInt,
    public var `dwMaxFwdNumRings`: UInt,
    public var `dwMaxCallCompletions`: UInt,
    public var `dwCallCompletionConds`: UInt,
    public var `dwCallCompletionModes`: UInt,
    public var `dwNumCompletionMessages`: UInt,
    public var `dwCompletionMsgTextEntrySize`: UInt,
    public var `dwCompletionMsgTextSize`: UInt,
    public var `dwCompletionMsgTextOffset`: UInt,
    public var `dwAddressFeatures`: UInt,
    public var `dwPredictiveAutoTransferStates`: UInt,
    public var `dwNumCallTreatments`: UInt,
    public var `dwCallTreatmentListSize`: UInt,
    public var `dwCallTreatmentListOffset`: UInt,
    public var `dwDeviceClassesSize`: UInt,
    public var `dwDeviceClassesOffset`: UInt,
    public var `dwMaxCallDataSize`: UInt,
    public var `dwCallFeatures2`: UInt,
    public var `dwMaxNoAnswerTimeout`: UInt,
    public var `dwConnectedModes`: UInt,
    public var `dwOfferingModes`: UInt,
    public var `dwAvailableMediaModes`: UInt,
)
public const val `LINEADDRESSMODE_ADDRESSID`: UInt = 1u;
public const val `LINEADDRESSMODE_DIALABLEADDR`: UInt = 2u;
public const val `LINEADDRESSSHARING_BRIDGEDEXCL`: UInt = 2u;
public const val `LINEADDRESSSHARING_BRIDGEDNEW`: UInt = 4u;
public const val `LINEADDRESSSHARING_BRIDGEDSHARED`: UInt = 8u;
public const val `LINEADDRESSSHARING_MONITORED`: UInt = 16u;
public const val `LINEADDRESSSHARING_PRIVATE`: UInt = 1u;
public const val `LINEADDRESSSTATE_CAPSCHANGE`: UInt = 256u;
public const val `LINEADDRESSSTATE_DEVSPECIFIC`: UInt = 2u;
public const val `LINEADDRESSSTATE_FORWARD`: UInt = 64u;
public const val `LINEADDRESSSTATE_INUSEMANY`: UInt = 16u;
public const val `LINEADDRESSSTATE_INUSEONE`: UInt = 8u;
public const val `LINEADDRESSSTATE_INUSEZERO`: UInt = 4u;
public const val `LINEADDRESSSTATE_NUMCALLS`: UInt = 32u;
public const val `LINEADDRESSSTATE_OTHER`: UInt = 1u;
public const val `LINEADDRESSSTATE_TERMINALS`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEADDRESSSTATUS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumInUse`: UInt,
    public var `dwNumActiveCalls`: UInt,
    public var `dwNumOnHoldCalls`: UInt,
    public var `dwNumOnHoldPendCalls`: UInt,
    public var `dwAddressFeatures`: UInt,
    public var `dwNumRingsNoAnswer`: UInt,
    public var `dwForwardNumEntries`: UInt,
    public var `dwForwardSize`: UInt,
    public var `dwForwardOffset`: UInt,
    public var `dwTerminalModesSize`: UInt,
    public var `dwTerminalModesOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
)
public const val `LINEADDRESSTYPE_DOMAINNAME`: UInt = 8u;
public const val `LINEADDRESSTYPE_EMAILNAME`: UInt = 4u;
public const val `LINEADDRESSTYPE_IPADDRESS`: UInt = 16u;
public const val `LINEADDRESSTYPE_PHONENUMBER`: UInt = 1u;
public const val `LINEADDRESSTYPE_SDP`: UInt = 2u;
public const val `LINEADDRFEATURE_FORWARD`: UInt = 1u;
public const val `LINEADDRFEATURE_FORWARDDND`: UInt = 8192u;
public const val `LINEADDRFEATURE_FORWARDFWD`: UInt = 4096u;
public const val `LINEADDRFEATURE_MAKECALL`: UInt = 2u;
public const val `LINEADDRFEATURE_PICKUP`: UInt = 4u;
public const val `LINEADDRFEATURE_PICKUPDIRECT`: UInt = 1024u;
public const val `LINEADDRFEATURE_PICKUPGROUP`: UInt = 512u;
public const val `LINEADDRFEATURE_PICKUPHELD`: UInt = 256u;
public const val `LINEADDRFEATURE_PICKUPWAITING`: UInt = 2048u;
public const val `LINEADDRFEATURE_SETMEDIACONTROL`: UInt = 8u;
public const val `LINEADDRFEATURE_SETTERMINAL`: UInt = 16u;
public const val `LINEADDRFEATURE_SETUPCONF`: UInt = 32u;
public const val `LINEADDRFEATURE_UNCOMPLETECALL`: UInt = 64u;
public const val `LINEADDRFEATURE_UNPARK`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTACTIVITYENTRY` (
    public var `dwID`: UInt,
    public var `dwNameSize`: UInt,
    public var `dwNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTACTIVITYLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTCAPS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwAgentHandlerInfoSize`: UInt,
    public var `dwAgentHandlerInfoOffset`: UInt,
    public var `dwCapsVersion`: UInt,
    public var `dwFeatures`: UInt,
    public var `dwStates`: UInt,
    public var `dwNextStates`: UInt,
    public var `dwMaxNumGroupEntries`: UInt,
    public var `dwAgentStatusMessages`: UInt,
    public var `dwNumAgentExtensionIDs`: UInt,
    public var `dwAgentExtensionIDListSize`: UInt,
    public var `dwAgentExtensionIDListOffset`: UInt,
    public var `ProxyGUID`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTENTRY` (
    public var `hAgent`: UInt,
    public var `dwNameSize`: UInt,
    public var `dwNameOffset`: UInt,
    public var `dwIDSize`: UInt,
    public var `dwIDOffset`: UInt,
    public var `dwPINSize`: UInt,
    public var `dwPINOffset`: UInt,
)
public const val `LINEAGENTFEATURE_AGENTSPECIFIC`: UInt = 8u;
public const val `LINEAGENTFEATURE_GETAGENTACTIVITYLIST`: UInt = 16u;
public const val `LINEAGENTFEATURE_GETAGENTGROUP`: UInt = 32u;
public const val `LINEAGENTFEATURE_SETAGENTACTIVITY`: UInt = 4u;
public const val `LINEAGENTFEATURE_SETAGENTGROUP`: UInt = 1u;
public const val `LINEAGENTFEATURE_SETAGENTSTATE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTGROUPENTRY` (
    public var `GroupID`: `LINEAGENTGROUPENTRY_0`,
    public var `dwNameSize`: UInt,
    public var `dwNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTGROUPENTRY_0` (
    public var `dwGroupID1`: UInt,
    public var `dwGroupID2`: UInt,
    public var `dwGroupID3`: UInt,
    public var `dwGroupID4`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTGROUPLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEAGENTINFO` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwAgentState`: UInt,
    public var `dwNextAgentState`: UInt,
    public var `dwMeasurementPeriod`: UInt,
    public var `cyOverallCallRate`: `super`.`super`.`System`.`Com`.`CY`,
    public var `dwNumberOfACDCalls`: UInt,
    public var `dwNumberOfIncomingCalls`: UInt,
    public var `dwNumberOfOutgoingCalls`: UInt,
    public var `dwTotalACDTalkTime`: UInt,
    public var `dwTotalACDCallTime`: UInt,
    public var `dwTotalACDWrapUpTime`: UInt,
)
// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEAGENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTSESSIONENTRY` (
    public var `hAgentSession`: UInt,
    public var `hAgent`: UInt,
    public var `GroupID`: `windows_sys`.`core`.`GUID`,
    public var `dwWorkingAddressID`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEAGENTSESSIONINFO` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwAgentSessionState`: UInt,
    public var `dwNextAgentSessionState`: UInt,
    public var `dateSessionStartTime`: Double,
    public var `dwSessionDuration`: UInt,
    public var `dwNumberOfCalls`: UInt,
    public var `dwTotalTalkTime`: UInt,
    public var `dwAverageTalkTime`: UInt,
    public var `dwTotalCallTime`: UInt,
    public var `dwAverageCallTime`: UInt,
    public var `dwTotalWrapUpTime`: UInt,
    public var `dwAverageWrapUpTime`: UInt,
    public var `cyACDCallRate`: `super`.`super`.`System`.`Com`.`CY`,
    public var `dwLongestTimeToAnswer`: UInt,
    public var `dwAverageTimeToAnswer`: UInt,
)
// UNSUPPORTED Rust 892:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEAGENTSESSIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTSESSIONLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
public const val `LINEAGENTSESSIONSTATE_BUSYONCALL`: UInt = 4u;
public const val `LINEAGENTSESSIONSTATE_BUSYWRAPUP`: UInt = 8u;
public const val `LINEAGENTSESSIONSTATE_ENDED`: UInt = 16u;
public const val `LINEAGENTSESSIONSTATE_NOTREADY`: UInt = 1u;
public const val `LINEAGENTSESSIONSTATE_READY`: UInt = 2u;
public const val `LINEAGENTSESSIONSTATE_RELEASED`: UInt = 32u;
public const val `LINEAGENTSESSIONSTATUS_NEWSESSION`: UInt = 1u;
public const val `LINEAGENTSESSIONSTATUS_STATE`: UInt = 2u;
public const val `LINEAGENTSESSIONSTATUS_UPDATEINFO`: UInt = 4u;
public const val `LINEAGENTSTATEEX_BUSYACD`: UInt = 4u;
public const val `LINEAGENTSTATEEX_BUSYINCOMING`: UInt = 8u;
public const val `LINEAGENTSTATEEX_BUSYOUTGOING`: UInt = 16u;
public const val `LINEAGENTSTATEEX_NOTREADY`: UInt = 1u;
public const val `LINEAGENTSTATEEX_READY`: UInt = 2u;
public const val `LINEAGENTSTATEEX_RELEASED`: UInt = 64u;
public const val `LINEAGENTSTATEEX_UNKNOWN`: UInt = 32u;
public const val `LINEAGENTSTATE_BUSYACD`: UInt = 8u;
public const val `LINEAGENTSTATE_BUSYINCOMING`: UInt = 16u;
public const val `LINEAGENTSTATE_BUSYOTHER`: UInt = 64u;
public const val `LINEAGENTSTATE_BUSYOUTBOUND`: UInt = 32u;
public const val `LINEAGENTSTATE_LOGGEDOFF`: UInt = 1u;
public const val `LINEAGENTSTATE_NOTREADY`: UInt = 2u;
public const val `LINEAGENTSTATE_READY`: UInt = 4u;
public const val `LINEAGENTSTATE_UNAVAIL`: UInt = 512u;
public const val `LINEAGENTSTATE_UNKNOWN`: UInt = 256u;
public const val `LINEAGENTSTATE_WORKINGAFTERCALL`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAGENTSTATUS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwGroupListSize`: UInt,
    public var `dwGroupListOffset`: UInt,
    public var `dwState`: UInt,
    public var `dwNextState`: UInt,
    public var `dwActivityID`: UInt,
    public var `dwActivitySize`: UInt,
    public var `dwActivityOffset`: UInt,
    public var `dwAgentFeatures`: UInt,
    public var `dwValidStates`: UInt,
    public var `dwValidNextStates`: UInt,
)
public const val `LINEAGENTSTATUSEX_NEWAGENT`: UInt = 1u;
public const val `LINEAGENTSTATUSEX_STATE`: UInt = 2u;
public const val `LINEAGENTSTATUSEX_UPDATEINFO`: UInt = 4u;
public const val `LINEAGENTSTATUS_ACTIVITY`: UInt = 8u;
public const val `LINEAGENTSTATUS_ACTIVITYLIST`: UInt = 16u;
public const val `LINEAGENTSTATUS_CAPSCHANGE`: UInt = 64u;
public const val `LINEAGENTSTATUS_GROUP`: UInt = 1u;
public const val `LINEAGENTSTATUS_GROUPLIST`: UInt = 32u;
public const val `LINEAGENTSTATUS_NEXTSTATE`: UInt = 4u;
public const val `LINEAGENTSTATUS_STATE`: UInt = 2u;
public const val `LINEAGENTSTATUS_VALIDNEXTSTATES`: UInt = 256u;
public const val `LINEAGENTSTATUS_VALIDSTATES`: UInt = 128u;
public const val `LINEANSWERMODE_DROP`: UInt = 2u;
public const val `LINEANSWERMODE_HOLD`: UInt = 4u;
public const val `LINEANSWERMODE_NONE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEAPPINFO` (
    public var `dwMachineNameSize`: UInt,
    public var `dwMachineNameOffset`: UInt,
    public var `dwUserNameSize`: UInt,
    public var `dwUserNameOffset`: UInt,
    public var `dwModuleFilenameSize`: UInt,
    public var `dwModuleFilenameOffset`: UInt,
    public var `dwFriendlyNameSize`: UInt,
    public var `dwFriendlyNameOffset`: UInt,
    public var `dwMediaModes`: UInt,
    public var `dwAddressID`: UInt,
)
public const val `LINEBEARERMODE_ALTSPEECHDATA`: UInt = 16u;
public const val `LINEBEARERMODE_DATA`: UInt = 8u;
public const val `LINEBEARERMODE_MULTIUSE`: UInt = 4u;
public const val `LINEBEARERMODE_NONCALLSIGNALING`: UInt = 32u;
public const val `LINEBEARERMODE_PASSTHROUGH`: UInt = 64u;
public const val `LINEBEARERMODE_RESTRICTEDDATA`: UInt = 128u;
public const val `LINEBEARERMODE_SPEECH`: UInt = 2u;
public const val `LINEBEARERMODE_VOICE`: UInt = 1u;
public const val `LINEBUSYMODE_STATION`: UInt = 1u;
public const val `LINEBUSYMODE_TRUNK`: UInt = 2u;
public const val `LINEBUSYMODE_UNAVAIL`: UInt = 8u;
public const val `LINEBUSYMODE_UNKNOWN`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LINECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, ULong, ULong, ULong, ULong) -> Unit>>>;
public const val `LINECALLCOMPLCOND_BUSY`: UInt = 1u;
public const val `LINECALLCOMPLCOND_NOANSWER`: UInt = 2u;
public const val `LINECALLCOMPLMODE_CALLBACK`: UInt = 2u;
public const val `LINECALLCOMPLMODE_CAMPON`: UInt = 1u;
public const val `LINECALLCOMPLMODE_INTRUDE`: UInt = 4u;
public const val `LINECALLCOMPLMODE_MESSAGE`: UInt = 8u;
public const val `LINECALLFEATURE2_COMPLCALLBACK`: UInt = 8u;
public const val `LINECALLFEATURE2_COMPLCAMPON`: UInt = 4u;
public const val `LINECALLFEATURE2_COMPLINTRUDE`: UInt = 16u;
public const val `LINECALLFEATURE2_COMPLMESSAGE`: UInt = 32u;
public const val `LINECALLFEATURE2_NOHOLDCONFERENCE`: UInt = 1u;
public const val `LINECALLFEATURE2_ONESTEPTRANSFER`: UInt = 2u;
public const val `LINECALLFEATURE2_PARKDIRECT`: UInt = 256u;
public const val `LINECALLFEATURE2_PARKNONDIRECT`: UInt = 512u;
public const val `LINECALLFEATURE2_TRANSFERCONF`: UInt = 128u;
public const val `LINECALLFEATURE2_TRANSFERNORM`: UInt = 64u;
public const val `LINECALLFEATURE_ACCEPT`: UInt = 1u;
public const val `LINECALLFEATURE_ADDTOCONF`: UInt = 2u;
public const val `LINECALLFEATURE_ANSWER`: UInt = 4u;
public const val `LINECALLFEATURE_BLINDTRANSFER`: UInt = 8u;
public const val `LINECALLFEATURE_COMPLETECALL`: UInt = 16u;
public const val `LINECALLFEATURE_COMPLETETRANSF`: UInt = 32u;
public const val `LINECALLFEATURE_DIAL`: UInt = 64u;
public const val `LINECALLFEATURE_DROP`: UInt = 128u;
public const val `LINECALLFEATURE_GATHERDIGITS`: UInt = 256u;
public const val `LINECALLFEATURE_GENERATEDIGITS`: UInt = 512u;
public const val `LINECALLFEATURE_GENERATETONE`: UInt = 1024u;
public const val `LINECALLFEATURE_HOLD`: UInt = 2048u;
public const val `LINECALLFEATURE_MONITORDIGITS`: UInt = 4096u;
public const val `LINECALLFEATURE_MONITORMEDIA`: UInt = 8192u;
public const val `LINECALLFEATURE_MONITORTONES`: UInt = 16384u;
public const val `LINECALLFEATURE_PARK`: UInt = 32768u;
public const val `LINECALLFEATURE_PREPAREADDCONF`: UInt = 65536u;
public const val `LINECALLFEATURE_REDIRECT`: UInt = 131072u;
public const val `LINECALLFEATURE_RELEASEUSERUSERINFO`: UInt = 268435456u;
public const val `LINECALLFEATURE_REMOVEFROMCONF`: UInt = 262144u;
public const val `LINECALLFEATURE_SECURECALL`: UInt = 524288u;
public const val `LINECALLFEATURE_SENDUSERUSER`: UInt = 1048576u;
public const val `LINECALLFEATURE_SETCALLDATA`: UInt = 2147483648u;
public const val `LINECALLFEATURE_SETCALLPARAMS`: UInt = 2097152u;
public const val `LINECALLFEATURE_SETMEDIACONTROL`: UInt = 4194304u;
public const val `LINECALLFEATURE_SETQOS`: UInt = 1073741824u;
public const val `LINECALLFEATURE_SETTERMINAL`: UInt = 8388608u;
public const val `LINECALLFEATURE_SETTREATMENT`: UInt = 536870912u;
public const val `LINECALLFEATURE_SETUPCONF`: UInt = 16777216u;
public const val `LINECALLFEATURE_SETUPTRANSFER`: UInt = 33554432u;
public const val `LINECALLFEATURE_SWAPHOLD`: UInt = 67108864u;
public const val `LINECALLFEATURE_UNHOLD`: UInt = 134217728u;
public const val `LINECALLHUBTRACKING_ALLCALLS`: UInt = 2u;
public const val `LINECALLHUBTRACKING_NONE`: UInt = 0u;
public const val `LINECALLHUBTRACKING_PROVIDERLEVEL`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECALLINFO` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `hLine`: UInt,
    public var `dwLineDeviceID`: UInt,
    public var `dwAddressID`: UInt,
    public var `dwBearerMode`: UInt,
    public var `dwRate`: UInt,
    public var `dwMediaMode`: UInt,
    public var `dwAppSpecific`: UInt,
    public var `dwCallID`: UInt,
    public var `dwRelatedCallID`: UInt,
    public var `dwCallParamFlags`: UInt,
    public var `dwCallStates`: UInt,
    public var `dwMonitorDigitModes`: UInt,
    public var `dwMonitorMediaModes`: UInt,
    public var `DialParams`: `LINEDIALPARAMS`,
    public var `dwOrigin`: UInt,
    public var `dwReason`: UInt,
    public var `dwCompletionID`: UInt,
    public var `dwNumOwners`: UInt,
    public var `dwNumMonitors`: UInt,
    public var `dwCountryCode`: UInt,
    public var `dwTrunk`: UInt,
    public var `dwCallerIDFlags`: UInt,
    public var `dwCallerIDSize`: UInt,
    public var `dwCallerIDOffset`: UInt,
    public var `dwCallerIDNameSize`: UInt,
    public var `dwCallerIDNameOffset`: UInt,
    public var `dwCalledIDFlags`: UInt,
    public var `dwCalledIDSize`: UInt,
    public var `dwCalledIDOffset`: UInt,
    public var `dwCalledIDNameSize`: UInt,
    public var `dwCalledIDNameOffset`: UInt,
    public var `dwConnectedIDFlags`: UInt,
    public var `dwConnectedIDSize`: UInt,
    public var `dwConnectedIDOffset`: UInt,
    public var `dwConnectedIDNameSize`: UInt,
    public var `dwConnectedIDNameOffset`: UInt,
    public var `dwRedirectionIDFlags`: UInt,
    public var `dwRedirectionIDSize`: UInt,
    public var `dwRedirectionIDOffset`: UInt,
    public var `dwRedirectionIDNameSize`: UInt,
    public var `dwRedirectionIDNameOffset`: UInt,
    public var `dwRedirectingIDFlags`: UInt,
    public var `dwRedirectingIDSize`: UInt,
    public var `dwRedirectingIDOffset`: UInt,
    public var `dwRedirectingIDNameSize`: UInt,
    public var `dwRedirectingIDNameOffset`: UInt,
    public var `dwAppNameSize`: UInt,
    public var `dwAppNameOffset`: UInt,
    public var `dwDisplayableAddressSize`: UInt,
    public var `dwDisplayableAddressOffset`: UInt,
    public var `dwCalledPartySize`: UInt,
    public var `dwCalledPartyOffset`: UInt,
    public var `dwCommentSize`: UInt,
    public var `dwCommentOffset`: UInt,
    public var `dwDisplaySize`: UInt,
    public var `dwDisplayOffset`: UInt,
    public var `dwUserUserInfoSize`: UInt,
    public var `dwUserUserInfoOffset`: UInt,
    public var `dwHighLevelCompSize`: UInt,
    public var `dwHighLevelCompOffset`: UInt,
    public var `dwLowLevelCompSize`: UInt,
    public var `dwLowLevelCompOffset`: UInt,
    public var `dwChargingInfoSize`: UInt,
    public var `dwChargingInfoOffset`: UInt,
    public var `dwTerminalModesSize`: UInt,
    public var `dwTerminalModesOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwCallTreatment`: UInt,
    public var `dwCallDataSize`: UInt,
    public var `dwCallDataOffset`: UInt,
    public var `dwSendingFlowspecSize`: UInt,
    public var `dwSendingFlowspecOffset`: UInt,
    public var `dwReceivingFlowspecSize`: UInt,
    public var `dwReceivingFlowspecOffset`: UInt,
)
public const val `LINECALLINFOSTATE_APPSPECIFIC`: UInt = 32u;
public const val `LINECALLINFOSTATE_BEARERMODE`: UInt = 4u;
public const val `LINECALLINFOSTATE_CALLDATA`: UInt = 1073741824u;
public const val `LINECALLINFOSTATE_CALLEDID`: UInt = 65536u;
public const val `LINECALLINFOSTATE_CALLERID`: UInt = 32768u;
public const val `LINECALLINFOSTATE_CALLID`: UInt = 64u;
public const val `LINECALLINFOSTATE_CHARGINGINFO`: UInt = 16777216u;
public const val `LINECALLINFOSTATE_COMPLETIONID`: UInt = 1024u;
public const val `LINECALLINFOSTATE_CONNECTEDID`: UInt = 131072u;
public const val `LINECALLINFOSTATE_DEVSPECIFIC`: UInt = 2u;
public const val `LINECALLINFOSTATE_DIALPARAMS`: UInt = 67108864u;
public const val `LINECALLINFOSTATE_DISPLAY`: UInt = 1048576u;
public const val `LINECALLINFOSTATE_HIGHLEVELCOMP`: UInt = 4194304u;
public const val `LINECALLINFOSTATE_LOWLEVELCOMP`: UInt = 8388608u;
public const val `LINECALLINFOSTATE_MEDIAMODE`: UInt = 16u;
public const val `LINECALLINFOSTATE_MONITORMODES`: UInt = 134217728u;
public const val `LINECALLINFOSTATE_NUMMONITORS`: UInt = 8192u;
public const val `LINECALLINFOSTATE_NUMOWNERDECR`: UInt = 4096u;
public const val `LINECALLINFOSTATE_NUMOWNERINCR`: UInt = 2048u;
public const val `LINECALLINFOSTATE_ORIGIN`: UInt = 256u;
public const val `LINECALLINFOSTATE_OTHER`: UInt = 1u;
public const val `LINECALLINFOSTATE_QOS`: UInt = 536870912u;
public const val `LINECALLINFOSTATE_RATE`: UInt = 8u;
public const val `LINECALLINFOSTATE_REASON`: UInt = 512u;
public const val `LINECALLINFOSTATE_REDIRECTINGID`: UInt = 524288u;
public const val `LINECALLINFOSTATE_REDIRECTIONID`: UInt = 262144u;
public const val `LINECALLINFOSTATE_RELATEDCALLID`: UInt = 128u;
public const val `LINECALLINFOSTATE_TERMINAL`: UInt = 33554432u;
public const val `LINECALLINFOSTATE_TREATMENT`: UInt = 268435456u;
public const val `LINECALLINFOSTATE_TRUNK`: UInt = 16384u;
public const val `LINECALLINFOSTATE_USERUSERINFO`: UInt = 2097152u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECALLLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwCallsNumEntries`: UInt,
    public var `dwCallsSize`: UInt,
    public var `dwCallsOffset`: UInt,
)
public const val `LINECALLORIGIN_CONFERENCE`: UInt = 64u;
public const val `LINECALLORIGIN_EXTERNAL`: UInt = 4u;
public const val `LINECALLORIGIN_INBOUND`: UInt = 128u;
public const val `LINECALLORIGIN_INTERNAL`: UInt = 2u;
public const val `LINECALLORIGIN_OUTBOUND`: UInt = 1u;
public const val `LINECALLORIGIN_UNAVAIL`: UInt = 32u;
public const val `LINECALLORIGIN_UNKNOWN`: UInt = 16u;
public const val `LINECALLPARAMFLAGS_BLOCKID`: UInt = 4u;
public const val `LINECALLPARAMFLAGS_DESTOFFHOOK`: UInt = 16u;
public const val `LINECALLPARAMFLAGS_IDLE`: UInt = 2u;
public const val `LINECALLPARAMFLAGS_NOHOLDCONFERENCE`: UInt = 32u;
public const val `LINECALLPARAMFLAGS_ONESTEPTRANSFER`: UInt = 128u;
public const val `LINECALLPARAMFLAGS_ORIGOFFHOOK`: UInt = 8u;
public const val `LINECALLPARAMFLAGS_PREDICTIVEDIAL`: UInt = 64u;
public const val `LINECALLPARAMFLAGS_SECURE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECALLPARAMS` (
    public var `dwTotalSize`: UInt,
    public var `dwBearerMode`: UInt,
    public var `dwMinRate`: UInt,
    public var `dwMaxRate`: UInt,
    public var `dwMediaMode`: UInt,
    public var `dwCallParamFlags`: UInt,
    public var `dwAddressMode`: UInt,
    public var `dwAddressID`: UInt,
    public var `DialParams`: `LINEDIALPARAMS`,
    public var `dwOrigAddressSize`: UInt,
    public var `dwOrigAddressOffset`: UInt,
    public var `dwDisplayableAddressSize`: UInt,
    public var `dwDisplayableAddressOffset`: UInt,
    public var `dwCalledPartySize`: UInt,
    public var `dwCalledPartyOffset`: UInt,
    public var `dwCommentSize`: UInt,
    public var `dwCommentOffset`: UInt,
    public var `dwUserUserInfoSize`: UInt,
    public var `dwUserUserInfoOffset`: UInt,
    public var `dwHighLevelCompSize`: UInt,
    public var `dwHighLevelCompOffset`: UInt,
    public var `dwLowLevelCompSize`: UInt,
    public var `dwLowLevelCompOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwPredictiveAutoTransferStates`: UInt,
    public var `dwTargetAddressSize`: UInt,
    public var `dwTargetAddressOffset`: UInt,
    public var `dwSendingFlowspecSize`: UInt,
    public var `dwSendingFlowspecOffset`: UInt,
    public var `dwReceivingFlowspecSize`: UInt,
    public var `dwReceivingFlowspecOffset`: UInt,
    public var `dwDeviceClassSize`: UInt,
    public var `dwDeviceClassOffset`: UInt,
    public var `dwDeviceConfigSize`: UInt,
    public var `dwDeviceConfigOffset`: UInt,
    public var `dwCallDataSize`: UInt,
    public var `dwCallDataOffset`: UInt,
    public var `dwNoAnswerTimeout`: UInt,
    public var `dwCallingPartyIDSize`: UInt,
    public var `dwCallingPartyIDOffset`: UInt,
)
public const val `LINECALLPARTYID_ADDRESS`: UInt = 8u;
public const val `LINECALLPARTYID_BLOCKED`: UInt = 1u;
public const val `LINECALLPARTYID_NAME`: UInt = 4u;
public const val `LINECALLPARTYID_OUTOFAREA`: UInt = 2u;
public const val `LINECALLPARTYID_PARTIAL`: UInt = 16u;
public const val `LINECALLPARTYID_UNAVAIL`: UInt = 64u;
public const val `LINECALLPARTYID_UNKNOWN`: UInt = 32u;
public const val `LINECALLPRIVILEGE_MONITOR`: UInt = 2u;
public const val `LINECALLPRIVILEGE_NONE`: UInt = 1u;
public const val `LINECALLPRIVILEGE_OWNER`: UInt = 4u;
public const val `LINECALLREASON_CALLCOMPLETION`: UInt = 128u;
public const val `LINECALLREASON_CAMPEDON`: UInt = 16384u;
public const val `LINECALLREASON_DIRECT`: UInt = 1u;
public const val `LINECALLREASON_FWDBUSY`: UInt = 2u;
public const val `LINECALLREASON_FWDNOANSWER`: UInt = 4u;
public const val `LINECALLREASON_FWDUNCOND`: UInt = 8u;
public const val `LINECALLREASON_INTRUDE`: UInt = 4096u;
public const val `LINECALLREASON_PARKED`: UInt = 8192u;
public const val `LINECALLREASON_PICKUP`: UInt = 16u;
public const val `LINECALLREASON_REDIRECT`: UInt = 64u;
public const val `LINECALLREASON_REMINDER`: UInt = 512u;
public const val `LINECALLREASON_ROUTEREQUEST`: UInt = 32768u;
public const val `LINECALLREASON_TRANSFER`: UInt = 256u;
public const val `LINECALLREASON_UNAVAIL`: UInt = 2048u;
public const val `LINECALLREASON_UNKNOWN`: UInt = 1024u;
public const val `LINECALLREASON_UNPARK`: UInt = 32u;
public const val `LINECALLSELECT_ADDRESS`: UInt = 2u;
public const val `LINECALLSELECT_CALL`: UInt = 4u;
public const val `LINECALLSELECT_CALLID`: UInt = 16u;
public const val `LINECALLSELECT_DEVICEID`: UInt = 8u;
public const val `LINECALLSELECT_LINE`: UInt = 1u;
public const val `LINECALLSTATE_ACCEPTED`: UInt = 4u;
public const val `LINECALLSTATE_BUSY`: UInt = 64u;
public const val `LINECALLSTATE_CONFERENCED`: UInt = 2048u;
public const val `LINECALLSTATE_CONNECTED`: UInt = 256u;
public const val `LINECALLSTATE_DIALING`: UInt = 16u;
public const val `LINECALLSTATE_DIALTONE`: UInt = 8u;
public const val `LINECALLSTATE_DISCONNECTED`: UInt = 16384u;
public const val `LINECALLSTATE_IDLE`: UInt = 1u;
public const val `LINECALLSTATE_OFFERING`: UInt = 2u;
public const val `LINECALLSTATE_ONHOLD`: UInt = 1024u;
public const val `LINECALLSTATE_ONHOLDPENDCONF`: UInt = 4096u;
public const val `LINECALLSTATE_ONHOLDPENDTRANSFER`: UInt = 8192u;
public const val `LINECALLSTATE_PROCEEDING`: UInt = 512u;
public const val `LINECALLSTATE_RINGBACK`: UInt = 32u;
public const val `LINECALLSTATE_SPECIALINFO`: UInt = 128u;
public const val `LINECALLSTATE_UNKNOWN`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECALLSTATUS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwCallState`: UInt,
    public var `dwCallStateMode`: UInt,
    public var `dwCallPrivilege`: UInt,
    public var `dwCallFeatures`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwCallFeatures2`: UInt,
    public var `tStateEntryTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECALLTREATMENTENTRY` (
    public var `dwCallTreatmentID`: UInt,
    public var `dwCallTreatmentNameSize`: UInt,
    public var `dwCallTreatmentNameOffset`: UInt,
)
public const val `LINECALLTREATMENT_BUSY`: UInt = 3u;
public const val `LINECALLTREATMENT_MUSIC`: UInt = 4u;
public const val `LINECALLTREATMENT_RINGBACK`: UInt = 2u;
public const val `LINECALLTREATMENT_SILENCE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECARDENTRY` (
    public var `dwPermanentCardID`: UInt,
    public var `dwCardNameSize`: UInt,
    public var `dwCardNameOffset`: UInt,
    public var `dwCardNumberDigits`: UInt,
    public var `dwSameAreaRuleSize`: UInt,
    public var `dwSameAreaRuleOffset`: UInt,
    public var `dwLongDistanceRuleSize`: UInt,
    public var `dwLongDistanceRuleOffset`: UInt,
    public var `dwInternationalRuleSize`: UInt,
    public var `dwInternationalRuleOffset`: UInt,
    public var `dwOptions`: UInt,
)
public const val `LINECARDOPTION_HIDDEN`: UInt = 2u;
public const val `LINECARDOPTION_PREDEFINED`: UInt = 1u;
public const val `LINECONNECTEDMODE_ACTIVE`: UInt = 1u;
public const val `LINECONNECTEDMODE_ACTIVEHELD`: UInt = 4u;
public const val `LINECONNECTEDMODE_CONFIRMED`: UInt = 16u;
public const val `LINECONNECTEDMODE_INACTIVE`: UInt = 2u;
public const val `LINECONNECTEDMODE_INACTIVEHELD`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECOUNTRYENTRY` (
    public var `dwCountryID`: UInt,
    public var `dwCountryCode`: UInt,
    public var `dwNextCountryID`: UInt,
    public var `dwCountryNameSize`: UInt,
    public var `dwCountryNameOffset`: UInt,
    public var `dwSameAreaRuleSize`: UInt,
    public var `dwSameAreaRuleOffset`: UInt,
    public var `dwLongDistanceRuleSize`: UInt,
    public var `dwLongDistanceRuleOffset`: UInt,
    public var `dwInternationalRuleSize`: UInt,
    public var `dwInternationalRuleOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINECOUNTRYLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumCountries`: UInt,
    public var `dwCountryListSize`: UInt,
    public var `dwCountryListOffset`: UInt,
)
public const val `LINEDEVCAPFLAGS_CALLHUB`: UInt = 1024u;
public const val `LINEDEVCAPFLAGS_CALLHUBTRACKING`: UInt = 2048u;
public const val `LINEDEVCAPFLAGS_CLOSEDROP`: UInt = 32u;
public const val `LINEDEVCAPFLAGS_CROSSADDRCONF`: UInt = 1u;
public const val `LINEDEVCAPFLAGS_DIALBILLING`: UInt = 64u;
public const val `LINEDEVCAPFLAGS_DIALDIALTONE`: UInt = 256u;
public const val `LINEDEVCAPFLAGS_DIALQUIET`: UInt = 128u;
public const val `LINEDEVCAPFLAGS_HIGHLEVCOMP`: UInt = 2u;
public const val `LINEDEVCAPFLAGS_LOCAL`: UInt = 8192u;
public const val `LINEDEVCAPFLAGS_LOWLEVCOMP`: UInt = 4u;
public const val `LINEDEVCAPFLAGS_MEDIACONTROL`: UInt = 8u;
public const val `LINEDEVCAPFLAGS_MSP`: UInt = 512u;
public const val `LINEDEVCAPFLAGS_MULTIPLEADDR`: UInt = 16u;
public const val `LINEDEVCAPFLAGS_PRIVATEOBJECTS`: UInt = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEDEVCAPS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwProviderInfoSize`: UInt,
    public var `dwProviderInfoOffset`: UInt,
    public var `dwSwitchInfoSize`: UInt,
    public var `dwSwitchInfoOffset`: UInt,
    public var `dwPermanentLineID`: UInt,
    public var `dwLineNameSize`: UInt,
    public var `dwLineNameOffset`: UInt,
    public var `dwStringFormat`: UInt,
    public var `dwAddressModes`: UInt,
    public var `dwNumAddresses`: UInt,
    public var `dwBearerModes`: UInt,
    public var `dwMaxRate`: UInt,
    public var `dwMediaModes`: UInt,
    public var `dwGenerateToneModes`: UInt,
    public var `dwGenerateToneMaxNumFreq`: UInt,
    public var `dwGenerateDigitModes`: UInt,
    public var `dwMonitorToneMaxNumFreq`: UInt,
    public var `dwMonitorToneMaxNumEntries`: UInt,
    public var `dwMonitorDigitModes`: UInt,
    public var `dwGatherDigitsMinTimeout`: UInt,
    public var `dwGatherDigitsMaxTimeout`: UInt,
    public var `dwMedCtlDigitMaxListSize`: UInt,
    public var `dwMedCtlMediaMaxListSize`: UInt,
    public var `dwMedCtlToneMaxListSize`: UInt,
    public var `dwMedCtlCallStateMaxListSize`: UInt,
    public var `dwDevCapFlags`: UInt,
    public var `dwMaxNumActiveCalls`: UInt,
    public var `dwAnswerMode`: UInt,
    public var `dwRingModes`: UInt,
    public var `dwLineStates`: UInt,
    public var `dwUUIAcceptSize`: UInt,
    public var `dwUUIAnswerSize`: UInt,
    public var `dwUUIMakeCallSize`: UInt,
    public var `dwUUIDropSize`: UInt,
    public var `dwUUISendUserUserInfoSize`: UInt,
    public var `dwUUICallInfoSize`: UInt,
    public var `MinDialParams`: `LINEDIALPARAMS`,
    public var `MaxDialParams`: `LINEDIALPARAMS`,
    public var `DefaultDialParams`: `LINEDIALPARAMS`,
    public var `dwNumTerminals`: UInt,
    public var `dwTerminalCapsSize`: UInt,
    public var `dwTerminalCapsOffset`: UInt,
    public var `dwTerminalTextEntrySize`: UInt,
    public var `dwTerminalTextSize`: UInt,
    public var `dwTerminalTextOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwLineFeatures`: UInt,
    public var `dwSettableDevStatus`: UInt,
    public var `dwDeviceClassesSize`: UInt,
    public var `dwDeviceClassesOffset`: UInt,
    public var `PermanentLineGuid`: `windows_sys`.`core`.`GUID`,
)
public const val `LINEDEVSTATE_BATTERY`: UInt = 32768u;
public const val `LINEDEVSTATE_CAPSCHANGE`: UInt = 1048576u;
public const val `LINEDEVSTATE_CLOSE`: UInt = 1024u;
public const val `LINEDEVSTATE_COMPLCANCEL`: UInt = 8388608u;
public const val `LINEDEVSTATE_CONFIGCHANGE`: UInt = 2097152u;
public const val `LINEDEVSTATE_CONNECTED`: UInt = 4u;
public const val `LINEDEVSTATE_DEVSPECIFIC`: UInt = 131072u;
public const val `LINEDEVSTATE_DISCONNECTED`: UInt = 8u;
public const val `LINEDEVSTATE_INSERVICE`: UInt = 64u;
public const val `LINEDEVSTATE_LOCK`: UInt = 524288u;
public const val `LINEDEVSTATE_MAINTENANCE`: UInt = 256u;
public const val `LINEDEVSTATE_MSGWAITOFF`: UInt = 32u;
public const val `LINEDEVSTATE_MSGWAITON`: UInt = 16u;
public const val `LINEDEVSTATE_NUMCALLS`: UInt = 2048u;
public const val `LINEDEVSTATE_NUMCOMPLETIONS`: UInt = 4096u;
public const val `LINEDEVSTATE_OPEN`: UInt = 512u;
public const val `LINEDEVSTATE_OTHER`: UInt = 1u;
public const val `LINEDEVSTATE_OUTOFSERVICE`: UInt = 128u;
public const val `LINEDEVSTATE_REINIT`: UInt = 262144u;
public const val `LINEDEVSTATE_REMOVED`: UInt = 16777216u;
public const val `LINEDEVSTATE_RINGING`: UInt = 2u;
public const val `LINEDEVSTATE_ROAMMODE`: UInt = 16384u;
public const val `LINEDEVSTATE_SIGNAL`: UInt = 65536u;
public const val `LINEDEVSTATE_TERMINALS`: UInt = 8192u;
public const val `LINEDEVSTATE_TRANSLATECHANGE`: UInt = 4194304u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEDEVSTATUS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumOpens`: UInt,
    public var `dwOpenMediaModes`: UInt,
    public var `dwNumActiveCalls`: UInt,
    public var `dwNumOnHoldCalls`: UInt,
    public var `dwNumOnHoldPendCalls`: UInt,
    public var `dwLineFeatures`: UInt,
    public var `dwNumCallCompletions`: UInt,
    public var `dwRingMode`: UInt,
    public var `dwSignalLevel`: UInt,
    public var `dwBatteryLevel`: UInt,
    public var `dwRoamMode`: UInt,
    public var `dwDevStatusFlags`: UInt,
    public var `dwTerminalModesSize`: UInt,
    public var `dwTerminalModesOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwAvailableMediaModes`: UInt,
    public var `dwAppInfoSize`: UInt,
    public var `dwAppInfoOffset`: UInt,
)
public const val `LINEDEVSTATUSFLAGS_CONNECTED`: UInt = 1u;
public const val `LINEDEVSTATUSFLAGS_INSERVICE`: UInt = 4u;
public const val `LINEDEVSTATUSFLAGS_LOCKED`: UInt = 8u;
public const val `LINEDEVSTATUSFLAGS_MSGWAIT`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEDIALPARAMS` (
    public var `dwDialPause`: UInt,
    public var `dwDialSpeed`: UInt,
    public var `dwDigitDuration`: UInt,
    public var `dwWaitForDialtone`: UInt,
)
public const val `LINEDIALTONEMODE_EXTERNAL`: UInt = 8u;
public const val `LINEDIALTONEMODE_INTERNAL`: UInt = 4u;
public const val `LINEDIALTONEMODE_NORMAL`: UInt = 1u;
public const val `LINEDIALTONEMODE_SPECIAL`: UInt = 2u;
public const val `LINEDIALTONEMODE_UNAVAIL`: UInt = 32u;
public const val `LINEDIALTONEMODE_UNKNOWN`: UInt = 16u;
public const val `LINEDIGITMODE_DTMF`: UInt = 2u;
public const val `LINEDIGITMODE_DTMFEND`: UInt = 4u;
public const val `LINEDIGITMODE_PULSE`: UInt = 1u;
public const val `LINEDISCONNECTMODE_BADADDRESS`: UInt = 128u;
public const val `LINEDISCONNECTMODE_BLOCKED`: UInt = 131072u;
public const val `LINEDISCONNECTMODE_BUSY`: UInt = 32u;
public const val `LINEDISCONNECTMODE_CANCELLED`: UInt = 524288u;
public const val `LINEDISCONNECTMODE_CONGESTION`: UInt = 512u;
public const val `LINEDISCONNECTMODE_DESTINATIONBARRED`: UInt = 1048576u;
public const val `LINEDISCONNECTMODE_DONOTDISTURB`: UInt = 262144u;
public const val `LINEDISCONNECTMODE_FDNRESTRICT`: UInt = 2097152u;
public const val `LINEDISCONNECTMODE_FORWARDED`: UInt = 16u;
public const val `LINEDISCONNECTMODE_INCOMPATIBLE`: UInt = 1024u;
public const val `LINEDISCONNECTMODE_NOANSWER`: UInt = 64u;
public const val `LINEDISCONNECTMODE_NODIALTONE`: UInt = 4096u;
public const val `LINEDISCONNECTMODE_NORMAL`: UInt = 1u;
public const val `LINEDISCONNECTMODE_NUMBERCHANGED`: UInt = 8192u;
public const val `LINEDISCONNECTMODE_OUTOFORDER`: UInt = 16384u;
public const val `LINEDISCONNECTMODE_PICKUP`: UInt = 8u;
public const val `LINEDISCONNECTMODE_QOSUNAVAIL`: UInt = 65536u;
public const val `LINEDISCONNECTMODE_REJECT`: UInt = 4u;
public const val `LINEDISCONNECTMODE_TEMPFAILURE`: UInt = 32768u;
public const val `LINEDISCONNECTMODE_UNAVAIL`: UInt = 2048u;
public const val `LINEDISCONNECTMODE_UNKNOWN`: UInt = 2u;
public const val `LINEDISCONNECTMODE_UNREACHABLE`: UInt = 256u;
public const val `LINEEQOSINFO_ADMISSIONFAILURE`: UInt = 2u;
public const val `LINEEQOSINFO_GENERICERROR`: UInt = 4u;
public const val `LINEEQOSINFO_NOQOS`: UInt = 1u;
public const val `LINEEQOSINFO_POLICYFAILURE`: UInt = 3u;
public const val `LINEERR_ADDRESSBLOCKED`: UInt = 2147483731u;
public const val `LINEERR_ALLOCATED`: UInt = 2147483649u;
public const val `LINEERR_BADDEVICEID`: UInt = 2147483650u;
public const val `LINEERR_BEARERMODEUNAVAIL`: UInt = 2147483651u;
public const val `LINEERR_BILLINGREJECTED`: UInt = 2147483732u;
public const val `LINEERR_CALLUNAVAIL`: UInt = 2147483653u;
public const val `LINEERR_COMPLETIONOVERRUN`: UInt = 2147483654u;
public const val `LINEERR_CONFERENCEFULL`: UInt = 2147483655u;
public const val `LINEERR_DIALBILLING`: UInt = 2147483656u;
public const val `LINEERR_DIALDIALTONE`: UInt = 2147483657u;
public const val `LINEERR_DIALPROMPT`: UInt = 2147483658u;
public const val `LINEERR_DIALQUIET`: UInt = 2147483659u;
public const val `LINEERR_DIALVOICEDETECT`: UInt = 2147483740u;
public const val `LINEERR_DISCONNECTED`: UInt = 2147483744u;
public const val `LINEERR_INCOMPATIBLEAPIVERSION`: UInt = 2147483660u;
public const val `LINEERR_INCOMPATIBLEEXTVERSION`: UInt = 2147483661u;
public const val `LINEERR_INIFILECORRUPT`: UInt = 2147483662u;
public const val `LINEERR_INUSE`: UInt = 2147483663u;
public const val `LINEERR_INVALADDRESS`: UInt = 2147483664u;
public const val `LINEERR_INVALADDRESSID`: UInt = 2147483665u;
public const val `LINEERR_INVALADDRESSMODE`: UInt = 2147483666u;
public const val `LINEERR_INVALADDRESSSTATE`: UInt = 2147483667u;
public const val `LINEERR_INVALADDRESSTYPE`: UInt = 2147483742u;
public const val `LINEERR_INVALAGENTACTIVITY`: UInt = 2147483739u;
public const val `LINEERR_INVALAGENTGROUP`: UInt = 2147483736u;
public const val `LINEERR_INVALAGENTID`: UInt = 2147483735u;
public const val `LINEERR_INVALAGENTSESSIONSTATE`: UInt = 2147483743u;
public const val `LINEERR_INVALAGENTSTATE`: UInt = 2147483738u;
public const val `LINEERR_INVALAPPHANDLE`: UInt = 2147483668u;
public const val `LINEERR_INVALAPPNAME`: UInt = 2147483669u;
public const val `LINEERR_INVALBEARERMODE`: UInt = 2147483670u;
public const val `LINEERR_INVALCALLCOMPLMODE`: UInt = 2147483671u;
public const val `LINEERR_INVALCALLHANDLE`: UInt = 2147483672u;
public const val `LINEERR_INVALCALLPARAMS`: UInt = 2147483673u;
public const val `LINEERR_INVALCALLPRIVILEGE`: UInt = 2147483674u;
public const val `LINEERR_INVALCALLSELECT`: UInt = 2147483675u;
public const val `LINEERR_INVALCALLSTATE`: UInt = 2147483676u;
public const val `LINEERR_INVALCALLSTATELIST`: UInt = 2147483677u;
public const val `LINEERR_INVALCARD`: UInt = 2147483678u;
public const val `LINEERR_INVALCOMPLETIONID`: UInt = 2147483679u;
public const val `LINEERR_INVALCONFCALLHANDLE`: UInt = 2147483680u;
public const val `LINEERR_INVALCONSULTCALLHANDLE`: UInt = 2147483681u;
public const val `LINEERR_INVALCOUNTRYCODE`: UInt = 2147483682u;
public const val `LINEERR_INVALDEVICECLASS`: UInt = 2147483683u;
public const val `LINEERR_INVALDEVICEHANDLE`: UInt = 2147483684u;
public const val `LINEERR_INVALDIALPARAMS`: UInt = 2147483685u;
public const val `LINEERR_INVALDIGITLIST`: UInt = 2147483686u;
public const val `LINEERR_INVALDIGITMODE`: UInt = 2147483687u;
public const val `LINEERR_INVALDIGITS`: UInt = 2147483688u;
public const val `LINEERR_INVALEXTVERSION`: UInt = 2147483689u;
public const val `LINEERR_INVALFEATURE`: UInt = 2147483733u;
public const val `LINEERR_INVALGROUPID`: UInt = 2147483690u;
public const val `LINEERR_INVALLINEHANDLE`: UInt = 2147483691u;
public const val `LINEERR_INVALLINESTATE`: UInt = 2147483692u;
public const val `LINEERR_INVALLOCATION`: UInt = 2147483693u;
public const val `LINEERR_INVALMEDIALIST`: UInt = 2147483694u;
public const val `LINEERR_INVALMEDIAMODE`: UInt = 2147483695u;
public const val `LINEERR_INVALMESSAGEID`: UInt = 2147483696u;
public const val `LINEERR_INVALPARAM`: UInt = 2147483698u;
public const val `LINEERR_INVALPARKID`: UInt = 2147483699u;
public const val `LINEERR_INVALPARKMODE`: UInt = 2147483700u;
public const val `LINEERR_INVALPASSWORD`: UInt = 2147483737u;
public const val `LINEERR_INVALPOINTER`: UInt = 2147483701u;
public const val `LINEERR_INVALPRIVSELECT`: UInt = 2147483702u;
public const val `LINEERR_INVALRATE`: UInt = 2147483703u;
public const val `LINEERR_INVALREQUESTMODE`: UInt = 2147483704u;
public const val `LINEERR_INVALTERMINALID`: UInt = 2147483705u;
public const val `LINEERR_INVALTERMINALMODE`: UInt = 2147483706u;
public const val `LINEERR_INVALTIMEOUT`: UInt = 2147483707u;
public const val `LINEERR_INVALTONE`: UInt = 2147483708u;
public const val `LINEERR_INVALTONELIST`: UInt = 2147483709u;
public const val `LINEERR_INVALTONEMODE`: UInt = 2147483710u;
public const val `LINEERR_INVALTRANSFERMODE`: UInt = 2147483711u;
public const val `LINEERR_LINEMAPPERFAILED`: UInt = 2147483712u;
public const val `LINEERR_NOCONFERENCE`: UInt = 2147483713u;
public const val `LINEERR_NODEVICE`: UInt = 2147483714u;
public const val `LINEERR_NODRIVER`: UInt = 2147483715u;
public const val `LINEERR_NOMEM`: UInt = 2147483716u;
public const val `LINEERR_NOMULTIPLEINSTANCE`: UInt = 2147483734u;
public const val `LINEERR_NOREQUEST`: UInt = 2147483717u;
public const val `LINEERR_NOTOWNER`: UInt = 2147483718u;
public const val `LINEERR_NOTREGISTERED`: UInt = 2147483719u;
public const val `LINEERR_OPERATIONFAILED`: UInt = 2147483720u;
public const val `LINEERR_OPERATIONUNAVAIL`: UInt = 2147483721u;
public const val `LINEERR_RATEUNAVAIL`: UInt = 2147483722u;
public const val `LINEERR_REINIT`: UInt = 2147483730u;
public const val `LINEERR_REQUESTOVERRUN`: UInt = 2147483724u;
public const val `LINEERR_RESOURCEUNAVAIL`: UInt = 2147483723u;
public const val `LINEERR_SERVICE_NOT_RUNNING`: UInt = 2147483745u;
public const val `LINEERR_STRUCTURETOOSMALL`: UInt = 2147483725u;
public const val `LINEERR_TARGETNOTFOUND`: UInt = 2147483726u;
public const val `LINEERR_TARGETSELF`: UInt = 2147483727u;
public const val `LINEERR_UNINITIALIZED`: UInt = 2147483728u;
public const val `LINEERR_USERCANCELLED`: UInt = 2147483741u;
public const val `LINEERR_USERUSERINFOTOOBIG`: UInt = 2147483729u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LINEEVENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HTAPILINE`, `HTAPICALL`, UInt, ULong, ULong, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEEXTENSIONID` (
    public var `dwExtensionID0`: UInt,
    public var `dwExtensionID1`: UInt,
    public var `dwExtensionID2`: UInt,
    public var `dwExtensionID3`: UInt,
)
public const val `LINEFEATURE_DEVSPECIFIC`: UInt = 1u;
public const val `LINEFEATURE_DEVSPECIFICFEAT`: UInt = 2u;
public const val `LINEFEATURE_FORWARD`: UInt = 4u;
public const val `LINEFEATURE_FORWARDDND`: UInt = 256u;
public const val `LINEFEATURE_FORWARDFWD`: UInt = 128u;
public const val `LINEFEATURE_MAKECALL`: UInt = 8u;
public const val `LINEFEATURE_SETDEVSTATUS`: UInt = 64u;
public const val `LINEFEATURE_SETMEDIACONTROL`: UInt = 16u;
public const val `LINEFEATURE_SETTERMINAL`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEFORWARD` (
    public var `dwForwardMode`: UInt,
    public var `dwCallerAddressSize`: UInt,
    public var `dwCallerAddressOffset`: UInt,
    public var `dwDestCountryCode`: UInt,
    public var `dwDestAddressSize`: UInt,
    public var `dwDestAddressOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEFORWARDLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `ForwardList`: Array<`LINEFORWARD`>,
)
// UNSUPPORTED Rust 1649:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEFORWARDLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LINEFORWARDMODE_BUSY`: UInt = 16u;
public const val `LINEFORWARDMODE_BUSYEXTERNAL`: UInt = 64u;
public const val `LINEFORWARDMODE_BUSYINTERNAL`: UInt = 32u;
public const val `LINEFORWARDMODE_BUSYNA`: UInt = 4096u;
public const val `LINEFORWARDMODE_BUSYNAEXTERNAL`: UInt = 16384u;
public const val `LINEFORWARDMODE_BUSYNAINTERNAL`: UInt = 8192u;
public const val `LINEFORWARDMODE_BUSYNASPECIFIC`: UInt = 32768u;
public const val `LINEFORWARDMODE_BUSYSPECIFIC`: UInt = 128u;
public const val `LINEFORWARDMODE_NOANSW`: UInt = 256u;
public const val `LINEFORWARDMODE_NOANSWEXTERNAL`: UInt = 1024u;
public const val `LINEFORWARDMODE_NOANSWINTERNAL`: UInt = 512u;
public const val `LINEFORWARDMODE_NOANSWSPECIFIC`: UInt = 2048u;
public const val `LINEFORWARDMODE_UNAVAIL`: UInt = 131072u;
public const val `LINEFORWARDMODE_UNCOND`: UInt = 1u;
public const val `LINEFORWARDMODE_UNCONDEXTERNAL`: UInt = 4u;
public const val `LINEFORWARDMODE_UNCONDINTERNAL`: UInt = 2u;
public const val `LINEFORWARDMODE_UNCONDSPECIFIC`: UInt = 8u;
public const val `LINEFORWARDMODE_UNKNOWN`: UInt = 65536u;
public const val `LINEGATHERTERM_BUFFERFULL`: UInt = 1u;
public const val `LINEGATHERTERM_CANCEL`: UInt = 16u;
public const val `LINEGATHERTERM_FIRSTTIMEOUT`: UInt = 4u;
public const val `LINEGATHERTERM_INTERTIMEOUT`: UInt = 8u;
public const val `LINEGATHERTERM_TERMDIGIT`: UInt = 2u;
public const val `LINEGENERATETERM_CANCEL`: UInt = 2u;
public const val `LINEGENERATETERM_DONE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEGENERATETONE` (
    public var `dwFrequency`: UInt,
    public var `dwCadenceOn`: UInt,
    public var `dwCadenceOff`: UInt,
    public var `dwVolume`: UInt,
)
public const val `LINEGROUPSTATUS_GROUPREMOVED`: UInt = 2u;
public const val `LINEGROUPSTATUS_NEWGROUP`: UInt = 1u;
public const val `LINEINITIALIZEEXOPTION_CALLHUBTRACKING`: UInt = 2147483648u;
public const val `LINEINITIALIZEEXOPTION_USECOMPLETIONPORT`: UInt = 3u;
public const val `LINEINITIALIZEEXOPTION_USEEVENT`: UInt = 2u;
public const val `LINEINITIALIZEEXOPTION_USEHIDDENWINDOW`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEINITIALIZEEXPARAMS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwOptions`: UInt,
    public var `Handles`: `LINEINITIALIZEEXPARAMS_0`,
    public var `dwCompletionKey`: UInt,
)
// UNSUPPORTED Rust 1703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEINITIALIZEEXPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1708:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union LINEINITIALIZEEXPARAMS_0 {
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub hCompletionPort: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEINITIALIZEEXPARAMS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINELOCATIONENTRY` (
    public var `dwPermanentLocationID`: UInt,
    public var `dwLocationNameSize`: UInt,
    public var `dwLocationNameOffset`: UInt,
    public var `dwCountryCode`: UInt,
    public var `dwCityCodeSize`: UInt,
    public var `dwCityCodeOffset`: UInt,
    public var `dwPreferredCardID`: UInt,
    public var `dwLocalAccessCodeSize`: UInt,
    public var `dwLocalAccessCodeOffset`: UInt,
    public var `dwLongDistanceAccessCodeSize`: UInt,
    public var `dwLongDistanceAccessCodeOffset`: UInt,
    public var `dwTollPrefixListSize`: UInt,
    public var `dwTollPrefixListOffset`: UInt,
    public var `dwCountryID`: UInt,
    public var `dwOptions`: UInt,
    public var `dwCancelCallWaitingSize`: UInt,
    public var `dwCancelCallWaitingOffset`: UInt,
)
public const val `LINELOCATIONOPTION_PULSEDIAL`: UInt = 1u;
public const val `LINEMAPPER`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMEDIACONTROLCALLSTATE` (
    public var `dwCallStates`: UInt,
    public var `dwMediaControl`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMEDIACONTROLDIGIT` (
    public var `dwDigit`: UInt,
    public var `dwDigitModes`: UInt,
    public var `dwMediaControl`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMEDIACONTROLMEDIA` (
    public var `dwMediaModes`: UInt,
    public var `dwDuration`: UInt,
    public var `dwMediaControl`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMEDIACONTROLTONE` (
    public var `dwAppSpecific`: UInt,
    public var `dwDuration`: UInt,
    public var `dwFrequency1`: UInt,
    public var `dwFrequency2`: UInt,
    public var `dwFrequency3`: UInt,
    public var `dwMediaControl`: UInt,
)
public const val `LINEMEDIACONTROL_NONE`: UInt = 1u;
public const val `LINEMEDIACONTROL_PAUSE`: UInt = 8u;
public const val `LINEMEDIACONTROL_RATEDOWN`: UInt = 64u;
public const val `LINEMEDIACONTROL_RATENORMAL`: UInt = 128u;
public const val `LINEMEDIACONTROL_RATEUP`: UInt = 32u;
public const val `LINEMEDIACONTROL_RESET`: UInt = 4u;
public const val `LINEMEDIACONTROL_RESUME`: UInt = 16u;
public const val `LINEMEDIACONTROL_START`: UInt = 2u;
public const val `LINEMEDIACONTROL_VOLUMEDOWN`: UInt = 512u;
public const val `LINEMEDIACONTROL_VOLUMENORMAL`: UInt = 1024u;
public const val `LINEMEDIACONTROL_VOLUMEUP`: UInt = 256u;
public const val `LINEMEDIAMODE_ADSI`: UInt = 8192u;
public const val `LINEMEDIAMODE_AUTOMATEDVOICE`: UInt = 8u;
public const val `LINEMEDIAMODE_DATAMODEM`: UInt = 16u;
public const val `LINEMEDIAMODE_DIGITALDATA`: UInt = 256u;
public const val `LINEMEDIAMODE_G3FAX`: UInt = 32u;
public const val `LINEMEDIAMODE_G4FAX`: UInt = 128u;
public const val `LINEMEDIAMODE_INTERACTIVEVOICE`: UInt = 4u;
public const val `LINEMEDIAMODE_MIXED`: UInt = 4096u;
public const val `LINEMEDIAMODE_TDD`: UInt = 64u;
public const val `LINEMEDIAMODE_TELETEX`: UInt = 512u;
public const val `LINEMEDIAMODE_TELEX`: UInt = 2048u;
public const val `LINEMEDIAMODE_UNKNOWN`: UInt = 2u;
public const val `LINEMEDIAMODE_VIDEO`: UInt = 32768u;
public const val `LINEMEDIAMODE_VIDEOTEX`: UInt = 1024u;
public const val `LINEMEDIAMODE_VOICEVIEW`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMESSAGE` (
    public var `hDevice`: UInt,
    public var `dwMessageID`: UInt,
    public var `dwCallbackInstance`: ULong,
    public var `dwParam1`: ULong,
    public var `dwParam2`: ULong,
    public var `dwParam3`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEMONITORTONE` (
    public var `dwAppSpecific`: UInt,
    public var `dwDuration`: UInt,
    public var `dwFrequency1`: UInt,
    public var `dwFrequency2`: UInt,
    public var `dwFrequency3`: UInt,
)
public const val `LINEOFFERINGMODE_ACTIVE`: UInt = 1u;
public const val `LINEOFFERINGMODE_INACTIVE`: UInt = 2u;
public const val `LINEOPENOPTION_PROXY`: UInt = 1073741824u;
public const val `LINEOPENOPTION_SINGLEADDRESS`: UInt = 2147483648u;
public const val `LINEPARKMODE_DIRECTED`: UInt = 1u;
public const val `LINEPARKMODE_NONDIRECTED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROVIDERENTRY` (
    public var `dwPermanentProviderID`: UInt,
    public var `dwProviderFilenameSize`: UInt,
    public var `dwProviderFilenameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROVIDERLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumProviders`: UInt,
    public var `dwProviderListSize`: UInt,
    public var `dwProviderListOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEPROXYREQUEST` (
    public var `dwSize`: UInt,
    public var `dwClientMachineNameSize`: UInt,
    public var `dwClientMachineNameOffset`: UInt,
    public var `dwClientUserNameSize`: UInt,
    public var `dwClientUserNameOffset`: UInt,
    public var `dwClientAppAPIVersion`: UInt,
    public var `dwRequestType`: UInt,
    public var `Anonymous`: `LINEPROXYREQUEST_0`,
)
// UNSUPPORTED Rust 1853:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union LINEPROXYREQUEST_0 {
//     pub SetAgentGroup: LINEPROXYREQUEST_0_0,
//     pub SetAgentState: LINEPROXYREQUEST_0_1,
//     pub SetAgentActivity: LINEPROXYREQUEST_0_2,
//     pub GetAgentCaps: LINEPROXYREQUEST_0_3,
//     pub GetAgentStatus: LINEPROXYREQUEST_0_4,
//     pub AgentSpecific: LINEPROXYREQUEST_0_5,
//     pub GetAgentActivityList: LINEPROXYREQUEST_0_6,
//     pub GetAgentGroupList: LINEPROXYREQUEST_0_7,
//     pub CreateAgent: LINEPROXYREQUEST_0_8,
//     pub SetAgentStateEx: LINEPROXYREQUEST_0_9,
//     pub SetAgentMeasurementPeriod: LINEPROXYREQUEST_0_10,
//     pub GetAgentInfo: LINEPROXYREQUEST_0_11,
//     pub CreateAgentSession: LINEPROXYREQUEST_0_12,
//     pub GetAgentSessionList: LINEPROXYREQUEST_0_13,
//     pub GetAgentSessionInfo: LINEPROXYREQUEST_0_14,
//     pub SetAgentSessionState: LINEPROXYREQUEST_0_15,
//     pub GetQueueList: LINEPROXYREQUEST_0_16,
//     pub SetQueueMeasurementPeriod: LINEPROXYREQUEST_0_17,
//     pub GetQueueInfo: LINEPROXYREQUEST_0_18,
//     pub GetGroupList: LINEPROXYREQUEST_0_19,
// }

// UNSUPPORTED Rust 1884:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEPROXYREQUEST_0_5` (
    public var `dwAddressID`: UInt,
    public var `dwAgentExtensionIDIndex`: UInt,
    public var `dwSize`: UInt,
    public var `Params`: UByteArray,
)
// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_12` (
    public var `hAgentSession`: UInt,
    public var `dwAgentPINSize`: UInt,
    public var `dwAgentPINOffset`: UInt,
    public var `hAgent`: UInt,
    public var `GroupID`: `windows_sys`.`core`.`GUID`,
    public var `dwWorkingAddressID`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_8` (
    public var `hAgent`: UInt,
    public var `dwAgentIDSize`: UInt,
    public var `dwAgentIDOffset`: UInt,
    public var `dwAgentPINSize`: UInt,
    public var `dwAgentPINOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_6` (
    public var `dwAddressID`: UInt,
    public var `ActivityList`: `LINEAGENTACTIVITYLIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_3` (
    public var `dwAddressID`: UInt,
    public var `AgentCaps`: `LINEAGENTCAPS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_7` (
    public var `dwAddressID`: UInt,
    public var `GroupList`: `LINEAGENTGROUPLIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEPROXYREQUEST_0_11` (
    public var `hAgent`: UInt,
    public var `AgentInfo`: `LINEAGENTINFO`,
)
// UNSUPPORTED Rust 1954:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEPROXYREQUEST_0_14` (
    public var `hAgentSession`: UInt,
    public var `SessionInfo`: `LINEAGENTSESSIONINFO`,
)
// UNSUPPORTED Rust 1967:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_13` (
    public var `hAgent`: UInt,
    public var `SessionList`: `LINEAGENTSESSIONLIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_4` (
    public var `dwAddressID`: UInt,
    public var `AgentStatus`: `LINEAGENTSTATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_19` (
    public var `GroupList`: `LINEAGENTGROUPLIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_18` (
    public var `dwQueueID`: UInt,
    public var `QueueInfo`: `LINEQUEUEINFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_16` (
    public var `GroupID`: `windows_sys`.`core`.`GUID`,
    public var `QueueList`: `LINEQUEUELIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_2` (
    public var `dwAddressID`: UInt,
    public var `dwActivityID`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_0` (
    public var `dwAddressID`: UInt,
    public var `GroupList`: `LINEAGENTGROUPLIST`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_10` (
    public var `hAgent`: UInt,
    public var `dwMeasurementPeriod`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_15` (
    public var `hAgentSession`: UInt,
    public var `dwAgentSessionState`: UInt,
    public var `dwNextAgentSessionState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_9` (
    public var `hAgent`: UInt,
    public var `dwAgentState`: UInt,
    public var `dwNextAgentState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_1` (
    public var `dwAddressID`: UInt,
    public var `dwAgentState`: UInt,
    public var `dwNextAgentState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUEST_0_17` (
    public var `dwQueueID`: UInt,
    public var `dwMeasurementPeriod`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEPROXYREQUESTLIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
public const val `LINEPROXYREQUEST_AGENTSPECIFIC`: UInt = 6u;
public const val `LINEPROXYREQUEST_CREATEAGENT`: UInt = 9u;
public const val `LINEPROXYREQUEST_CREATEAGENTSESSION`: UInt = 12u;
public const val `LINEPROXYREQUEST_GETAGENTACTIVITYLIST`: UInt = 7u;
public const val `LINEPROXYREQUEST_GETAGENTCAPS`: UInt = 4u;
public const val `LINEPROXYREQUEST_GETAGENTGROUPLIST`: UInt = 8u;
public const val `LINEPROXYREQUEST_GETAGENTINFO`: UInt = 11u;
public const val `LINEPROXYREQUEST_GETAGENTSESSIONINFO`: UInt = 15u;
public const val `LINEPROXYREQUEST_GETAGENTSESSIONLIST`: UInt = 13u;
public const val `LINEPROXYREQUEST_GETAGENTSTATUS`: UInt = 5u;
public const val `LINEPROXYREQUEST_GETGROUPLIST`: UInt = 19u;
public const val `LINEPROXYREQUEST_GETQUEUEINFO`: UInt = 18u;
public const val `LINEPROXYREQUEST_GETQUEUELIST`: UInt = 16u;
public const val `LINEPROXYREQUEST_SETAGENTACTIVITY`: UInt = 3u;
public const val `LINEPROXYREQUEST_SETAGENTGROUP`: UInt = 1u;
public const val `LINEPROXYREQUEST_SETAGENTMEASUREMENTPERIOD`: UInt = 10u;
public const val `LINEPROXYREQUEST_SETAGENTSESSIONSTATE`: UInt = 14u;
public const val `LINEPROXYREQUEST_SETAGENTSTATE`: UInt = 2u;
public const val `LINEPROXYREQUEST_SETAGENTSTATEEX`: UInt = 20u;
public const val `LINEPROXYREQUEST_SETQUEUEMEASUREMENTPERIOD`: UInt = 17u;
public const val `LINEPROXYSTATUS_ALLOPENFORACD`: UInt = 4u;
public const val `LINEPROXYSTATUS_CLOSE`: UInt = 2u;
public const val `LINEPROXYSTATUS_OPEN`: UInt = 1u;
public const val `LINEQOSREQUESTTYPE_SERVICELEVEL`: UInt = 1u;
public const val `LINEQOSSERVICELEVEL_BESTEFFORT`: UInt = 3u;
public const val `LINEQOSSERVICELEVEL_IFAVAILABLE`: UInt = 2u;
public const val `LINEQOSSERVICELEVEL_NEEDED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEQUEUEENTRY` (
    public var `dwQueueID`: UInt,
    public var `dwNameSize`: UInt,
    public var `dwNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEQUEUEINFO` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwMeasurementPeriod`: UInt,
    public var `dwTotalCallsQueued`: UInt,
    public var `dwCurrentCallsQueued`: UInt,
    public var `dwTotalCallsAbandoned`: UInt,
    public var `dwTotalCallsFlowedIn`: UInt,
    public var `dwTotalCallsFlowedOut`: UInt,
    public var `dwLongestEverWaitTime`: UInt,
    public var `dwCurrentLongestWaitTime`: UInt,
    public var `dwAverageWaitTime`: UInt,
    public var `dwFinalDisposition`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINEQUEUELIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumEntries`: UInt,
    public var `dwListSize`: UInt,
    public var `dwListOffset`: UInt,
)
public const val `LINEQUEUESTATUS_NEWQUEUE`: UInt = 2u;
public const val `LINEQUEUESTATUS_QUEUEREMOVED`: UInt = 4u;
public const val `LINEQUEUESTATUS_UPDATEINFO`: UInt = 1u;
public const val `LINEREMOVEFROMCONF_ANY`: UInt = 3u;
public const val `LINEREMOVEFROMCONF_LAST`: UInt = 2u;
public const val `LINEREMOVEFROMCONF_NONE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEREQMAKECALL` (
    public var `szDestAddress`: ByteArray,
    public var `szAppName`: ByteArray,
    public var `szCalledParty`: ByteArray,
    public var `szComment`: ByteArray,
)
// UNSUPPORTED Rust 2144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEREQMAKECALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEREQMAKECALLW` (
    public var `szDestAddress`: UShortArray,
    public var `szAppName`: UShortArray,
    public var `szCalledParty`: UShortArray,
    public var `szComment`: UShortArray,
)
// UNSUPPORTED Rust 2157:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEREQMAKECALLW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEREQMEDIACALL` (
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `wRequestID`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `szDeviceClass`: ByteArray,
    public var `ucDeviceID`: UByteArray,
    public var `dwSize`: UInt,
    public var `dwSecure`: UInt,
    public var `szDestAddress`: ByteArray,
    public var `szAppName`: ByteArray,
    public var `szCalledParty`: ByteArray,
    public var `szComment`: ByteArray,
)
// UNSUPPORTED Rust 2176:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEREQMEDIACALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEREQMEDIACALLW` (
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `wRequestID`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `szDeviceClass`: UShortArray,
    public var `ucDeviceID`: UByteArray,
    public var `dwSize`: UInt,
    public var `dwSecure`: UInt,
    public var `szDestAddress`: UShortArray,
    public var `szAppName`: UShortArray,
    public var `szCalledParty`: UShortArray,
    public var `szComment`: UShortArray,
)
// UNSUPPORTED Rust 2195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LINEREQMEDIACALLW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LINEREQUESTMODE_DROP`: UInt = 4u;
public const val `LINEREQUESTMODE_MAKECALL`: UInt = 1u;
public const val `LINEREQUESTMODE_MEDIACALL`: UInt = 2u;
public const val `LINEROAMMODE_HOME`: UInt = 4u;
public const val `LINEROAMMODE_ROAMA`: UInt = 8u;
public const val `LINEROAMMODE_ROAMB`: UInt = 16u;
public const val `LINEROAMMODE_UNAVAIL`: UInt = 2u;
public const val `LINEROAMMODE_UNKNOWN`: UInt = 1u;
public const val `LINESPECIALINFO_CUSTIRREG`: UInt = 2u;
public const val `LINESPECIALINFO_NOCIRCUIT`: UInt = 1u;
public const val `LINESPECIALINFO_REORDER`: UInt = 4u;
public const val `LINESPECIALINFO_UNAVAIL`: UInt = 16u;
public const val `LINESPECIALINFO_UNKNOWN`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINETERMCAPS` (
    public var `dwTermDev`: UInt,
    public var `dwTermModes`: UInt,
    public var `dwTermSharing`: UInt,
)
public const val `LINETERMDEV_HEADSET`: UInt = 2u;
public const val `LINETERMDEV_PHONE`: UInt = 1u;
public const val `LINETERMDEV_SPEAKER`: UInt = 4u;
public const val `LINETERMMODE_BUTTONS`: UInt = 1u;
public const val `LINETERMMODE_DISPLAY`: UInt = 4u;
public const val `LINETERMMODE_HOOKSWITCH`: UInt = 16u;
public const val `LINETERMMODE_LAMPS`: UInt = 2u;
public const val `LINETERMMODE_MEDIABIDIRECT`: UInt = 128u;
public const val `LINETERMMODE_MEDIAFROMLINE`: UInt = 64u;
public const val `LINETERMMODE_MEDIATOLINE`: UInt = 32u;
public const val `LINETERMMODE_RINGER`: UInt = 8u;
public const val `LINETERMSHARING_PRIVATE`: UInt = 1u;
public const val `LINETERMSHARING_SHAREDCONF`: UInt = 4u;
public const val `LINETERMSHARING_SHAREDEXCL`: UInt = 2u;
public const val `LINETOLLLISTOPTION_ADD`: UInt = 1u;
public const val `LINETOLLLISTOPTION_REMOVE`: UInt = 2u;
public const val `LINETONEMODE_BEEP`: UInt = 8u;
public const val `LINETONEMODE_BILLING`: UInt = 16u;
public const val `LINETONEMODE_BUSY`: UInt = 4u;
public const val `LINETONEMODE_CUSTOM`: UInt = 1u;
public const val `LINETONEMODE_RINGBACK`: UInt = 2u;
public const val `LINETRANSFERMODE_CONFERENCE`: UInt = 2u;
public const val `LINETRANSFERMODE_TRANSFER`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINETRANSLATECAPS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwNumLocations`: UInt,
    public var `dwLocationListSize`: UInt,
    public var `dwLocationListOffset`: UInt,
    public var `dwCurrentLocationID`: UInt,
    public var `dwNumCards`: UInt,
    public var `dwCardListSize`: UInt,
    public var `dwCardListOffset`: UInt,
    public var `dwCurrentPreferredCardID`: UInt,
)
public const val `LINETRANSLATEOPTION_CANCELCALLWAITING`: UInt = 2u;
public const val `LINETRANSLATEOPTION_CARDOVERRIDE`: UInt = 1u;
public const val `LINETRANSLATEOPTION_FORCELD`: UInt = 8u;
public const val `LINETRANSLATEOPTION_FORCELOCAL`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINETRANSLATEOUTPUT` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwDialableStringSize`: UInt,
    public var `dwDialableStringOffset`: UInt,
    public var `dwDisplayableStringSize`: UInt,
    public var `dwDisplayableStringOffset`: UInt,
    public var `dwCurrentCountry`: UInt,
    public var `dwDestCountry`: UInt,
    public var `dwTranslateResults`: UInt,
)
public const val `LINETRANSLATERESULT_CANONICAL`: UInt = 1u;
public const val `LINETRANSLATERESULT_DIALBILLING`: UInt = 64u;
public const val `LINETRANSLATERESULT_DIALDIALTONE`: UInt = 256u;
public const val `LINETRANSLATERESULT_DIALPROMPT`: UInt = 512u;
public const val `LINETRANSLATERESULT_DIALQUIET`: UInt = 128u;
public const val `LINETRANSLATERESULT_INTERNATIONAL`: UInt = 2u;
public const val `LINETRANSLATERESULT_INTOLLLIST`: UInt = 16u;
public const val `LINETRANSLATERESULT_LOCAL`: UInt = 8u;
public const val `LINETRANSLATERESULT_LONGDISTANCE`: UInt = 4u;
public const val `LINETRANSLATERESULT_NOTINTOLLLIST`: UInt = 32u;
public const val `LINETRANSLATERESULT_NOTRANSLATION`: UInt = 2048u;
public const val `LINETRANSLATERESULT_VOICEDETECT`: UInt = 1024u;
public const val `LINETSPIOPTION_NONREENTRANT`: UInt = 1u;
public const val `LINE_ADDRESSSTATE`: Int = 0;
public const val `LINE_AGENTSESSIONSTATUS`: Int = 27;
public const val `LINE_AGENTSPECIFIC`: Int = 21;
public const val `LINE_AGENTSTATUS`: Int = 22;
public const val `LINE_AGENTSTATUSEX`: Int = 29;
public const val `LINE_APPNEWCALL`: Int = 23;
public const val `LINE_APPNEWCALLHUB`: Int = 32;
public const val `LINE_CALLHUBCLOSE`: Int = 33;
public const val `LINE_CALLINFO`: Int = 1;
public const val `LINE_CALLSTATE`: Int = 2;
public const val `LINE_CLOSE`: Int = 3;
public const val `LINE_CREATE`: Int = 19;
public const val `LINE_DEVSPECIFIC`: Int = 4;
public const val `LINE_DEVSPECIFICEX`: Int = 34;
public const val `LINE_DEVSPECIFICFEATURE`: Int = 5;
public const val `LINE_GATHERDIGITS`: Int = 6;
public const val `LINE_GENERATE`: Int = 7;
public const val `LINE_GROUPSTATUS`: Int = 30;
public const val `LINE_LINEDEVSTATE`: Int = 8;
public const val `LINE_MONITORDIGITS`: Int = 9;
public const val `LINE_MONITORMEDIA`: Int = 10;
public const val `LINE_MONITORTONE`: Int = 11;
public const val `LINE_PROXYREQUEST`: Int = 24;
public const val `LINE_PROXYSTATUS`: Int = 31;
public const val `LINE_QUEUESTATUS`: Int = 28;
public const val `LINE_REMOVE`: Int = 25;
public const val `LINE_REPLY`: Int = 12;
public const val `LINE_REQUEST`: Int = 13;
public const val `LM_BROKENFLUTTER`: `PHONE_LAMP_MODE` = 64;
public const val `LM_DUMMY`: `PHONE_LAMP_MODE` = 1;
public const val `LM_FLASH`: `PHONE_LAMP_MODE` = 16;
public const val `LM_FLUTTER`: `PHONE_LAMP_MODE` = 32;
public const val `LM_OFF`: `PHONE_LAMP_MODE` = 2;
public const val `LM_STEADY`: `PHONE_LAMP_MODE` = 4;
public const val `LM_UNKNOWN`: `PHONE_LAMP_MODE` = 128;
public const val `LM_WINK`: `PHONE_LAMP_MODE` = 8;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `LPGETTNEFSTREAMCODEPAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
public typealias `LPOPENTNEFSTREAM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
public typealias `LPOPENTNEFSTREAMEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `ME_ADDRESS_EVENT`: `MSP_EVENT` = 0;
public const val `ME_ASR_TERMINAL_EVENT`: `MSP_EVENT` = 4;
public const val `ME_CALL_EVENT`: `MSP_EVENT` = 1;
public const val `ME_FILE_TERMINAL_EVENT`: `MSP_EVENT` = 6;
public const val `ME_PRIVATE_EVENT`: `MSP_EVENT` = 3;
public const val `ME_TONE_TERMINAL_EVENT`: `MSP_EVENT` = 7;
public const val `ME_TSP_DATA`: `MSP_EVENT` = 2;
public const val `ME_TTS_TERMINAL_EVENT`: `MSP_EVENT` = 5;
public typealias `MSP_ADDRESS_EVENT` = Int;
public typealias `MSP_CALL_EVENT` = Int;
public typealias `MSP_CALL_EVENT_CAUSE` = Int;
public typealias `MSP_EVENT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO` (
    public var `dwSize`: UInt,
    public var `Event`: `MSP_EVENT`,
    public var `hCall`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `Anonymous`: `MSP_EVENT_INFO_0`,
)
// UNSUPPORTED Rust 2352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2358:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union MSP_EVENT_INFO_0 {
//     pub MSP_ADDRESS_EVENT_INFO: MSP_EVENT_INFO_0_0,
//     pub MSP_CALL_EVENT_INFO: MSP_EVENT_INFO_0_1,
//     pub MSP_TSP_DATA: MSP_EVENT_INFO_0_2,
//     pub MSP_PRIVATE_EVENT_INFO: MSP_EVENT_INFO_0_3,
//     pub MSP_FILE_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_4,
//     pub MSP_ASR_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_5,
//     pub MSP_TTS_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_6,
//     pub MSP_TONE_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_7,
// }

// UNSUPPORTED Rust 2371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_0` (
    public var `Type`: `MSP_ADDRESS_EVENT`,
    public var `pTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_5` (
    public var `pASRTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hrErrorCode`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_1` (
    public var `Type`: `MSP_CALL_EVENT`,
    public var `Cause`: `MSP_CALL_EVENT_CAUSE`,
    public var `pStream`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hrError`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 2413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_4` (
    public var `pParentFileTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pFileTrack`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TerminalMediaState`: `TERMINAL_MEDIA_STATE`,
    public var `ftecEventCause`: `FT_STATE_EVENT_CAUSE`,
    public var `hrErrorCode`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 2429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_3` (
    public var `pEvent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lEventCode`: Int,
)
// UNSUPPORTED Rust 2442:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_7` (
    public var `pToneTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hrErrorCode`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 2455:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_2` (
    public var `dwBufferSize`: UInt,
    public var `pBuffer`: UByteArray,
)
// UNSUPPORTED Rust 2468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSP_EVENT_INFO_0_6` (
    public var `pTTSTerminal`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hrErrorCode`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 2481:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const McastAddressAllocation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf0daef2_a289_11d1_8697_006008b0e5d2);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NSID` (
    public var `dwSize`: UInt,
    public var `uchType`: UByteArray,
    public var `xtype`: UInt,
    public var `lTime`: Int,
    public var `address`: `NSID_0`,
)
// UNSUPPORTED Rust 2497:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2502:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NSID_0 {
//     pub alias: ADDRALIAS,
//     pub rgchInterNet: [i8; 1],
// }

// UNSUPPORTED Rust 2508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NSID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2513:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OPENTNEFSTREAM: windows_sys::core::PCSTR = windows_sys::core::s!("OpenTnefStream");

// UNSUPPORTED Rust 2514:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OPENTNEFSTREAMEX: windows_sys::core::PCSTR = windows_sys::core::s!("OpenTnefStreamEx");

public const val `OT_CONFERENCE`: `DIRECTORY_OBJECT_TYPE` = 1;
public const val `OT_USER`: `DIRECTORY_OBJECT_TYPE` = 2;
public const val `PBF_ABBREVDIAL`: `PHONE_BUTTON_FUNCTION` = 11;
public const val `PBF_BRIDGEDAPP`: `PHONE_BUTTON_FUNCTION` = 28;
public const val `PBF_BUSY`: `PHONE_BUTTON_FUNCTION` = 29;
public const val `PBF_CALLAPP`: `PHONE_BUTTON_FUNCTION` = 30;
public const val `PBF_CALLID`: `PHONE_BUTTON_FUNCTION` = 34;
public const val `PBF_CAMPON`: `PHONE_BUTTON_FUNCTION` = 43;
public const val `PBF_CONFERENCE`: `PHONE_BUTTON_FUNCTION` = 1;
public const val `PBF_CONNECT`: `PHONE_BUTTON_FUNCTION` = 7;
public const val `PBF_COVER`: `PHONE_BUTTON_FUNCTION` = 33;
public const val `PBF_DATAOFF`: `PHONE_BUTTON_FUNCTION` = 25;
public const val `PBF_DATAON`: `PHONE_BUTTON_FUNCTION` = 24;
public const val `PBF_DATETIME`: `PHONE_BUTTON_FUNCTION` = 31;
public const val `PBF_DIRECTORY`: `PHONE_BUTTON_FUNCTION` = 32;
public const val `PBF_DISCONNECT`: `PHONE_BUTTON_FUNCTION` = 6;
public const val `PBF_DONOTDISTURB`: `PHONE_BUTTON_FUNCTION` = 26;
public const val `PBF_DROP`: `PHONE_BUTTON_FUNCTION` = 3;
public const val `PBF_FLASH`: `PHONE_BUTTON_FUNCTION` = 23;
public const val `PBF_FORWARD`: `PHONE_BUTTON_FUNCTION` = 12;
public const val `PBF_HOLD`: `PHONE_BUTTON_FUNCTION` = 4;
public const val `PBF_INTERCOM`: `PHONE_BUTTON_FUNCTION` = 27;
public const val `PBF_LASTNUM`: `PHONE_BUTTON_FUNCTION` = 35;
public const val `PBF_MSGINDICATOR`: `PHONE_BUTTON_FUNCTION` = 38;
public const val `PBF_MSGWAITOFF`: `PHONE_BUTTON_FUNCTION` = 9;
public const val `PBF_MSGWAITON`: `PHONE_BUTTON_FUNCTION` = 8;
public const val `PBF_MUTE`: `PHONE_BUTTON_FUNCTION` = 18;
public const val `PBF_NIGHTSRV`: `PHONE_BUTTON_FUNCTION` = 36;
public const val `PBF_NONE`: `PHONE_BUTTON_FUNCTION` = 46;
public const val `PBF_PARK`: `PHONE_BUTTON_FUNCTION` = 15;
public const val `PBF_PICKUP`: `PHONE_BUTTON_FUNCTION` = 13;
public const val `PBF_QUEUECALL`: `PHONE_BUTTON_FUNCTION` = 45;
public const val `PBF_RECALL`: `PHONE_BUTTON_FUNCTION` = 5;
public const val `PBF_REDIRECT`: `PHONE_BUTTON_FUNCTION` = 17;
public const val `PBF_REJECT`: `PHONE_BUTTON_FUNCTION` = 16;
public const val `PBF_REPDIAL`: `PHONE_BUTTON_FUNCTION` = 39;
public const val `PBF_RINGAGAIN`: `PHONE_BUTTON_FUNCTION` = 14;
public const val `PBF_SAVEREPEAT`: `PHONE_BUTTON_FUNCTION` = 44;
public const val `PBF_SELECTRING`: `PHONE_BUTTON_FUNCTION` = 10;
public const val `PBF_SEND`: `PHONE_BUTTON_FUNCTION` = 47;
public const val `PBF_SENDCALLS`: `PHONE_BUTTON_FUNCTION` = 37;
public const val `PBF_SETREPDIAL`: `PHONE_BUTTON_FUNCTION` = 40;
public const val `PBF_SPEAKEROFF`: `PHONE_BUTTON_FUNCTION` = 22;
public const val `PBF_SPEAKERON`: `PHONE_BUTTON_FUNCTION` = 21;
public const val `PBF_STATIONSPEED`: `PHONE_BUTTON_FUNCTION` = 42;
public const val `PBF_SYSTEMSPEED`: `PHONE_BUTTON_FUNCTION` = 41;
public const val `PBF_TRANSFER`: `PHONE_BUTTON_FUNCTION` = 2;
public const val `PBF_UNKNOWN`: `PHONE_BUTTON_FUNCTION` = 0;
public const val `PBF_VOLUMEDOWN`: `PHONE_BUTTON_FUNCTION` = 20;
public const val `PBF_VOLUMEUP`: `PHONE_BUTTON_FUNCTION` = 19;
public const val `PBM_CALL`: `PHONE_BUTTON_MODE` = 1;
public const val `PBM_DISPLAY`: `PHONE_BUTTON_MODE` = 5;
public const val `PBM_DUMMY`: `PHONE_BUTTON_MODE` = 0;
public const val `PBM_FEATURE`: `PHONE_BUTTON_MODE` = 2;
public const val `PBM_KEYPAD`: `PHONE_BUTTON_MODE` = 3;
public const val `PBM_LOCAL`: `PHONE_BUTTON_MODE` = 4;
public const val `PBS_DOWN`: `PHONE_BUTTON_STATE` = 2;
public const val `PBS_UNAVAIL`: `PHONE_BUTTON_STATE` = 8;
public const val `PBS_UNKNOWN`: `PHONE_BUTTON_STATE` = 4;
public const val `PBS_UP`: `PHONE_BUTTON_STATE` = 1;
public const val `PCB_DEVSPECIFICBUFFER`: `PHONECAPS_BUFFER` = 0;
public const val `PCL_DISPLAYNUMCOLUMNS`: `PHONECAPS_LONG` = 5;
public const val `PCL_DISPLAYNUMROWS`: `PHONECAPS_LONG` = 4;
public const val `PCL_GENERICPHONE`: `PHONECAPS_LONG` = 8;
public const val `PCL_HANDSETHOOKSWITCHMODES`: `PHONECAPS_LONG` = 1;
public const val `PCL_HEADSETHOOKSWITCHMODES`: `PHONECAPS_LONG` = 2;
public const val `PCL_HOOKSWITCHES`: `PHONECAPS_LONG` = 0;
public const val `PCL_NUMBUTTONLAMPS`: `PHONECAPS_LONG` = 7;
public const val `PCL_NUMRINGMODES`: `PHONECAPS_LONG` = 6;
public const val `PCL_SPEAKERPHONEHOOKSWITCHMODES`: `PHONECAPS_LONG` = 3;
public const val `PCS_PHONEINFO`: `PHONECAPS_STRING` = 1;
public const val `PCS_PHONENAME`: `PHONECAPS_STRING` = 0;
public const val `PCS_PROVIDERINFO`: `PHONECAPS_STRING` = 2;
public const val `PE_ANSWER`: `PHONE_EVENT` = 10;
public const val `PE_BUTTON`: `PHONE_EVENT` = 6;
public const val `PE_CAPSCHANGE`: `PHONE_EVENT` = 5;
public const val `PE_CLOSE`: `PHONE_EVENT` = 7;
public const val `PE_DIALING`: `PHONE_EVENT` = 9;
public const val `PE_DISCONNECT`: `PHONE_EVENT` = 11;
public const val `PE_DISPLAY`: `PHONE_EVENT` = 0;
public const val `PE_HOOKSWITCH`: `PHONE_EVENT` = 4;
public const val `PE_LAMPMODE`: `PHONE_EVENT` = 1;
public const val `PE_LASTITEM`: `PHONE_EVENT` = 11;
public const val `PE_NUMBERGATHERED`: `PHONE_EVENT` = 8;
public const val `PE_RINGMODE`: `PHONE_EVENT` = 2;
public const val `PE_RINGVOLUME`: `PHONE_EVENT` = 3;
public const val `PHONEBUTTONFUNCTION_ABBREVDIAL`: UInt = 11u;
public const val `PHONEBUTTONFUNCTION_BRIDGEDAPP`: UInt = 28u;
public const val `PHONEBUTTONFUNCTION_BUSY`: UInt = 29u;
public const val `PHONEBUTTONFUNCTION_CALLAPP`: UInt = 30u;
public const val `PHONEBUTTONFUNCTION_CALLID`: UInt = 34u;
public const val `PHONEBUTTONFUNCTION_CAMPON`: UInt = 43u;
public const val `PHONEBUTTONFUNCTION_CONFERENCE`: UInt = 1u;
public const val `PHONEBUTTONFUNCTION_CONNECT`: UInt = 7u;
public const val `PHONEBUTTONFUNCTION_COVER`: UInt = 33u;
public const val `PHONEBUTTONFUNCTION_DATAOFF`: UInt = 25u;
public const val `PHONEBUTTONFUNCTION_DATAON`: UInt = 24u;
public const val `PHONEBUTTONFUNCTION_DATETIME`: UInt = 31u;
public const val `PHONEBUTTONFUNCTION_DIRECTORY`: UInt = 32u;
public const val `PHONEBUTTONFUNCTION_DISCONNECT`: UInt = 6u;
public const val `PHONEBUTTONFUNCTION_DONOTDISTURB`: UInt = 26u;
public const val `PHONEBUTTONFUNCTION_DROP`: UInt = 3u;
public const val `PHONEBUTTONFUNCTION_FLASH`: UInt = 23u;
public const val `PHONEBUTTONFUNCTION_FORWARD`: UInt = 12u;
public const val `PHONEBUTTONFUNCTION_HOLD`: UInt = 4u;
public const val `PHONEBUTTONFUNCTION_INTERCOM`: UInt = 27u;
public const val `PHONEBUTTONFUNCTION_LASTNUM`: UInt = 35u;
public const val `PHONEBUTTONFUNCTION_MSGINDICATOR`: UInt = 38u;
public const val `PHONEBUTTONFUNCTION_MSGWAITOFF`: UInt = 9u;
public const val `PHONEBUTTONFUNCTION_MSGWAITON`: UInt = 8u;
public const val `PHONEBUTTONFUNCTION_MUTE`: UInt = 18u;
public const val `PHONEBUTTONFUNCTION_NIGHTSRV`: UInt = 36u;
public const val `PHONEBUTTONFUNCTION_NONE`: UInt = 46u;
public const val `PHONEBUTTONFUNCTION_PARK`: UInt = 15u;
public const val `PHONEBUTTONFUNCTION_PICKUP`: UInt = 13u;
public const val `PHONEBUTTONFUNCTION_QUEUECALL`: UInt = 45u;
public const val `PHONEBUTTONFUNCTION_RECALL`: UInt = 5u;
public const val `PHONEBUTTONFUNCTION_REDIRECT`: UInt = 17u;
public const val `PHONEBUTTONFUNCTION_REJECT`: UInt = 16u;
public const val `PHONEBUTTONFUNCTION_REPDIAL`: UInt = 39u;
public const val `PHONEBUTTONFUNCTION_RINGAGAIN`: UInt = 14u;
public const val `PHONEBUTTONFUNCTION_SAVEREPEAT`: UInt = 44u;
public const val `PHONEBUTTONFUNCTION_SELECTRING`: UInt = 10u;
public const val `PHONEBUTTONFUNCTION_SEND`: UInt = 47u;
public const val `PHONEBUTTONFUNCTION_SENDCALLS`: UInt = 37u;
public const val `PHONEBUTTONFUNCTION_SETREPDIAL`: UInt = 40u;
public const val `PHONEBUTTONFUNCTION_SPEAKEROFF`: UInt = 22u;
public const val `PHONEBUTTONFUNCTION_SPEAKERON`: UInt = 21u;
public const val `PHONEBUTTONFUNCTION_STATIONSPEED`: UInt = 42u;
public const val `PHONEBUTTONFUNCTION_SYSTEMSPEED`: UInt = 41u;
public const val `PHONEBUTTONFUNCTION_TRANSFER`: UInt = 2u;
public const val `PHONEBUTTONFUNCTION_UNKNOWN`: UInt = 0u;
public const val `PHONEBUTTONFUNCTION_VOLUMEDOWN`: UInt = 20u;
public const val `PHONEBUTTONFUNCTION_VOLUMEUP`: UInt = 19u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHONEBUTTONINFO` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwButtonMode`: UInt,
    public var `dwButtonFunction`: UInt,
    public var `dwButtonTextSize`: UInt,
    public var `dwButtonTextOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwButtonState`: UInt,
)
public const val `PHONEBUTTONMODE_CALL`: UInt = 2u;
public const val `PHONEBUTTONMODE_DISPLAY`: UInt = 32u;
public const val `PHONEBUTTONMODE_DUMMY`: UInt = 1u;
public const val `PHONEBUTTONMODE_FEATURE`: UInt = 4u;
public const val `PHONEBUTTONMODE_KEYPAD`: UInt = 8u;
public const val `PHONEBUTTONMODE_LOCAL`: UInt = 16u;
public const val `PHONEBUTTONSTATE_DOWN`: UInt = 2u;
public const val `PHONEBUTTONSTATE_UNAVAIL`: UInt = 8u;
public const val `PHONEBUTTONSTATE_UNKNOWN`: UInt = 4u;
public const val `PHONEBUTTONSTATE_UP`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PHONECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, ULong, ULong, ULong, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHONECAPS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwProviderInfoSize`: UInt,
    public var `dwProviderInfoOffset`: UInt,
    public var `dwPhoneInfoSize`: UInt,
    public var `dwPhoneInfoOffset`: UInt,
    public var `dwPermanentPhoneID`: UInt,
    public var `dwPhoneNameSize`: UInt,
    public var `dwPhoneNameOffset`: UInt,
    public var `dwStringFormat`: UInt,
    public var `dwPhoneStates`: UInt,
    public var `dwHookSwitchDevs`: UInt,
    public var `dwHandsetHookSwitchModes`: UInt,
    public var `dwSpeakerHookSwitchModes`: UInt,
    public var `dwHeadsetHookSwitchModes`: UInt,
    public var `dwVolumeFlags`: UInt,
    public var `dwGainFlags`: UInt,
    public var `dwDisplayNumRows`: UInt,
    public var `dwDisplayNumColumns`: UInt,
    public var `dwNumRingModes`: UInt,
    public var `dwNumButtonLamps`: UInt,
    public var `dwButtonModesSize`: UInt,
    public var `dwButtonModesOffset`: UInt,
    public var `dwButtonFunctionsSize`: UInt,
    public var `dwButtonFunctionsOffset`: UInt,
    public var `dwLampModesSize`: UInt,
    public var `dwLampModesOffset`: UInt,
    public var `dwNumSetData`: UInt,
    public var `dwSetDataSize`: UInt,
    public var `dwSetDataOffset`: UInt,
    public var `dwNumGetData`: UInt,
    public var `dwGetDataSize`: UInt,
    public var `dwGetDataOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwDeviceClassesSize`: UInt,
    public var `dwDeviceClassesOffset`: UInt,
    public var `dwPhoneFeatures`: UInt,
    public var `dwSettableHandsetHookSwitchModes`: UInt,
    public var `dwSettableSpeakerHookSwitchModes`: UInt,
    public var `dwSettableHeadsetHookSwitchModes`: UInt,
    public var `dwMonitoredHandsetHookSwitchModes`: UInt,
    public var `dwMonitoredSpeakerHookSwitchModes`: UInt,
    public var `dwMonitoredHeadsetHookSwitchModes`: UInt,
    public var `PermanentPhoneGuid`: `windows_sys`.`core`.`GUID`,
)
public typealias `PHONECAPS_BUFFER` = Int;
public typealias `PHONECAPS_LONG` = Int;
public typealias `PHONECAPS_STRING` = Int;
public const val `PHONEERR_ALLOCATED`: UInt = 2415919105u;
public const val `PHONEERR_BADDEVICEID`: UInt = 2415919106u;
public const val `PHONEERR_DISCONNECTED`: UInt = 2415919140u;
public const val `PHONEERR_INCOMPATIBLEAPIVERSION`: UInt = 2415919107u;
public const val `PHONEERR_INCOMPATIBLEEXTVERSION`: UInt = 2415919108u;
public const val `PHONEERR_INIFILECORRUPT`: UInt = 2415919109u;
public const val `PHONEERR_INUSE`: UInt = 2415919110u;
public const val `PHONEERR_INVALAPPHANDLE`: UInt = 2415919111u;
public const val `PHONEERR_INVALAPPNAME`: UInt = 2415919112u;
public const val `PHONEERR_INVALBUTTONLAMPID`: UInt = 2415919113u;
public const val `PHONEERR_INVALBUTTONMODE`: UInt = 2415919114u;
public const val `PHONEERR_INVALBUTTONSTATE`: UInt = 2415919115u;
public const val `PHONEERR_INVALDATAID`: UInt = 2415919116u;
public const val `PHONEERR_INVALDEVICECLASS`: UInt = 2415919117u;
public const val `PHONEERR_INVALEXTVERSION`: UInt = 2415919118u;
public const val `PHONEERR_INVALHOOKSWITCHDEV`: UInt = 2415919119u;
public const val `PHONEERR_INVALHOOKSWITCHMODE`: UInt = 2415919120u;
public const val `PHONEERR_INVALLAMPMODE`: UInt = 2415919121u;
public const val `PHONEERR_INVALPARAM`: UInt = 2415919122u;
public const val `PHONEERR_INVALPHONEHANDLE`: UInt = 2415919123u;
public const val `PHONEERR_INVALPHONESTATE`: UInt = 2415919124u;
public const val `PHONEERR_INVALPOINTER`: UInt = 2415919125u;
public const val `PHONEERR_INVALPRIVILEGE`: UInt = 2415919126u;
public const val `PHONEERR_INVALRINGMODE`: UInt = 2415919127u;
public const val `PHONEERR_NODEVICE`: UInt = 2415919128u;
public const val `PHONEERR_NODRIVER`: UInt = 2415919129u;
public const val `PHONEERR_NOMEM`: UInt = 2415919130u;
public const val `PHONEERR_NOTOWNER`: UInt = 2415919131u;
public const val `PHONEERR_OPERATIONFAILED`: UInt = 2415919132u;
public const val `PHONEERR_OPERATIONUNAVAIL`: UInt = 2415919133u;
public const val `PHONEERR_REINIT`: UInt = 2415919139u;
public const val `PHONEERR_REQUESTOVERRUN`: UInt = 2415919136u;
public const val `PHONEERR_RESOURCEUNAVAIL`: UInt = 2415919135u;
public const val `PHONEERR_SERVICE_NOT_RUNNING`: UInt = 2415919141u;
public const val `PHONEERR_STRUCTURETOOSMALL`: UInt = 2415919137u;
public const val `PHONEERR_UNINITIALIZED`: UInt = 2415919138u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PHONEEVENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HTAPIPHONE`, UInt, ULong, ULong, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHONEEXTENSIONID` (
    public var `dwExtensionID0`: UInt,
    public var `dwExtensionID1`: UInt,
    public var `dwExtensionID2`: UInt,
    public var `dwExtensionID3`: UInt,
)
public const val `PHONEFEATURE_GENERICPHONE`: UInt = 268435456u;
public const val `PHONEFEATURE_GETBUTTONINFO`: UInt = 1u;
public const val `PHONEFEATURE_GETDATA`: UInt = 2u;
public const val `PHONEFEATURE_GETDISPLAY`: UInt = 4u;
public const val `PHONEFEATURE_GETGAINHANDSET`: UInt = 8u;
public const val `PHONEFEATURE_GETGAINHEADSET`: UInt = 32u;
public const val `PHONEFEATURE_GETGAINSPEAKER`: UInt = 16u;
public const val `PHONEFEATURE_GETHOOKSWITCHHANDSET`: UInt = 64u;
public const val `PHONEFEATURE_GETHOOKSWITCHHEADSET`: UInt = 256u;
public const val `PHONEFEATURE_GETHOOKSWITCHSPEAKER`: UInt = 128u;
public const val `PHONEFEATURE_GETLAMP`: UInt = 512u;
public const val `PHONEFEATURE_GETRING`: UInt = 1024u;
public const val `PHONEFEATURE_GETVOLUMEHANDSET`: UInt = 2048u;
public const val `PHONEFEATURE_GETVOLUMEHEADSET`: UInt = 8192u;
public const val `PHONEFEATURE_GETVOLUMESPEAKER`: UInt = 4096u;
public const val `PHONEFEATURE_SETBUTTONINFO`: UInt = 16384u;
public const val `PHONEFEATURE_SETDATA`: UInt = 32768u;
public const val `PHONEFEATURE_SETDISPLAY`: UInt = 65536u;
public const val `PHONEFEATURE_SETGAINHANDSET`: UInt = 131072u;
public const val `PHONEFEATURE_SETGAINHEADSET`: UInt = 524288u;
public const val `PHONEFEATURE_SETGAINSPEAKER`: UInt = 262144u;
public const val `PHONEFEATURE_SETHOOKSWITCHHANDSET`: UInt = 1048576u;
public const val `PHONEFEATURE_SETHOOKSWITCHHEADSET`: UInt = 4194304u;
public const val `PHONEFEATURE_SETHOOKSWITCHSPEAKER`: UInt = 2097152u;
public const val `PHONEFEATURE_SETLAMP`: UInt = 8388608u;
public const val `PHONEFEATURE_SETRING`: UInt = 16777216u;
public const val `PHONEFEATURE_SETVOLUMEHANDSET`: UInt = 33554432u;
public const val `PHONEFEATURE_SETVOLUMEHEADSET`: UInt = 134217728u;
public const val `PHONEFEATURE_SETVOLUMESPEAKER`: UInt = 67108864u;
public const val `PHONEHOOKSWITCHDEV_HANDSET`: UInt = 1u;
public const val `PHONEHOOKSWITCHDEV_HEADSET`: UInt = 4u;
public const val `PHONEHOOKSWITCHDEV_SPEAKER`: UInt = 2u;
public const val `PHONEHOOKSWITCHMODE_MIC`: UInt = 2u;
public const val `PHONEHOOKSWITCHMODE_MICSPEAKER`: UInt = 8u;
public const val `PHONEHOOKSWITCHMODE_ONHOOK`: UInt = 1u;
public const val `PHONEHOOKSWITCHMODE_SPEAKER`: UInt = 4u;
public const val `PHONEHOOKSWITCHMODE_UNKNOWN`: UInt = 16u;
public const val `PHONEINITIALIZEEXOPTION_USECOMPLETIONPORT`: UInt = 3u;
public const val `PHONEINITIALIZEEXOPTION_USEEVENT`: UInt = 2u;
public const val `PHONEINITIALIZEEXOPTION_USEHIDDENWINDOW`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHONEINITIALIZEEXPARAMS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwOptions`: UInt,
    public var `Handles`: `PHONEINITIALIZEEXPARAMS_0`,
    public var `dwCompletionKey`: UInt,
)
// UNSUPPORTED Rust 2822:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHONEINITIALIZEEXPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2827:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union PHONEINITIALIZEEXPARAMS_0 {
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub hCompletionPort: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 2833:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHONEINITIALIZEEXPARAMS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PHONELAMPMODE_BROKENFLUTTER`: UInt = 64u;
public const val `PHONELAMPMODE_DUMMY`: UInt = 1u;
public const val `PHONELAMPMODE_FLASH`: UInt = 16u;
public const val `PHONELAMPMODE_FLUTTER`: UInt = 32u;
public const val `PHONELAMPMODE_OFF`: UInt = 2u;
public const val `PHONELAMPMODE_STEADY`: UInt = 4u;
public const val `PHONELAMPMODE_UNKNOWN`: UInt = 128u;
public const val `PHONELAMPMODE_WINK`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHONEMESSAGE` (
    public var `hDevice`: UInt,
    public var `dwMessageID`: UInt,
    public var `dwCallbackInstance`: ULong,
    public var `dwParam1`: ULong,
    public var `dwParam2`: ULong,
    public var `dwParam3`: ULong,
)
public const val `PHONEPRIVILEGE_MONITOR`: UInt = 1u;
public const val `PHONEPRIVILEGE_OWNER`: UInt = 2u;
public const val `PHONESTATE_CAPSCHANGE`: UInt = 4194304u;
public const val `PHONESTATE_CONNECTED`: UInt = 2u;
public const val `PHONESTATE_DEVSPECIFIC`: UInt = 1048576u;
public const val `PHONESTATE_DISCONNECTED`: UInt = 4u;
public const val `PHONESTATE_DISPLAY`: UInt = 32u;
public const val `PHONESTATE_HANDSETGAIN`: UInt = 2048u;
public const val `PHONESTATE_HANDSETHOOKSWITCH`: UInt = 512u;
public const val `PHONESTATE_HANDSETVOLUME`: UInt = 1024u;
public const val `PHONESTATE_HEADSETGAIN`: UInt = 131072u;
public const val `PHONESTATE_HEADSETHOOKSWITCH`: UInt = 32768u;
public const val `PHONESTATE_HEADSETVOLUME`: UInt = 65536u;
public const val `PHONESTATE_LAMP`: UInt = 64u;
public const val `PHONESTATE_MONITORS`: UInt = 16u;
public const val `PHONESTATE_OTHER`: UInt = 1u;
public const val `PHONESTATE_OWNER`: UInt = 8u;
public const val `PHONESTATE_REINIT`: UInt = 2097152u;
public const val `PHONESTATE_REMOVED`: UInt = 8388608u;
public const val `PHONESTATE_RESUME`: UInt = 524288u;
public const val `PHONESTATE_RINGMODE`: UInt = 128u;
public const val `PHONESTATE_RINGVOLUME`: UInt = 256u;
public const val `PHONESTATE_SPEAKERGAIN`: UInt = 16384u;
public const val `PHONESTATE_SPEAKERHOOKSWITCH`: UInt = 4096u;
public const val `PHONESTATE_SPEAKERVOLUME`: UInt = 8192u;
public const val `PHONESTATE_SUSPEND`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHONESTATUS` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwStatusFlags`: UInt,
    public var `dwNumOwners`: UInt,
    public var `dwNumMonitors`: UInt,
    public var `dwRingMode`: UInt,
    public var `dwRingVolume`: UInt,
    public var `dwHandsetHookSwitchMode`: UInt,
    public var `dwHandsetVolume`: UInt,
    public var `dwHandsetGain`: UInt,
    public var `dwSpeakerHookSwitchMode`: UInt,
    public var `dwSpeakerVolume`: UInt,
    public var `dwSpeakerGain`: UInt,
    public var `dwHeadsetHookSwitchMode`: UInt,
    public var `dwHeadsetVolume`: UInt,
    public var `dwHeadsetGain`: UInt,
    public var `dwDisplaySize`: UInt,
    public var `dwDisplayOffset`: UInt,
    public var `dwLampModesSize`: UInt,
    public var `dwLampModesOffset`: UInt,
    public var `dwOwnerNameSize`: UInt,
    public var `dwOwnerNameOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwPhoneFeatures`: UInt,
)
public const val `PHONESTATUSFLAGS_CONNECTED`: UInt = 1u;
public const val `PHONESTATUSFLAGS_SUSPENDED`: UInt = 2u;
public const val `PHONE_BUTTON`: Int = 14;
public typealias `PHONE_BUTTON_FUNCTION` = Int;
public typealias `PHONE_BUTTON_MODE` = Int;
public typealias `PHONE_BUTTON_STATE` = Int;
public const val `PHONE_CLOSE`: Int = 15;
public const val `PHONE_CREATE`: Int = 20;
public const val `PHONE_DEVSPECIFIC`: Int = 16;
public typealias `PHONE_EVENT` = Int;
public typealias `PHONE_HOOK_SWITCH_DEVICE` = Int;
public typealias `PHONE_HOOK_SWITCH_STATE` = Int;
public typealias `PHONE_LAMP_MODE` = Int;
public typealias `PHONE_PRIVILEGE` = Int;
public const val `PHONE_REMOVE`: Int = 26;
public const val `PHONE_REPLY`: Int = 17;
public const val `PHONE_STATE`: Int = 18;
public typealias `PHONE_TONE` = Int;
public const val `PHSD_HANDSET`: `PHONE_HOOK_SWITCH_DEVICE` = 1;
public const val `PHSD_HEADSET`: `PHONE_HOOK_SWITCH_DEVICE` = 4;
public const val `PHSD_SPEAKERPHONE`: `PHONE_HOOK_SWITCH_DEVICE` = 2;
public const val `PHSS_OFFHOOK`: `PHONE_HOOK_SWITCH_STATE` = 8;
public const val `PHSS_OFFHOOK_MIC_ONLY`: `PHONE_HOOK_SWITCH_STATE` = 2;
public const val `PHSS_OFFHOOK_SPEAKER_ONLY`: `PHONE_HOOK_SWITCH_STATE` = 4;
public const val `PHSS_ONHOOK`: `PHONE_HOOK_SWITCH_STATE` = 1;
public const val `PP_MONITOR`: `PHONE_PRIVILEGE` = 1;
public const val `PP_OWNER`: `PHONE_PRIVILEGE` = 0;
public const val `PRIVATEOBJECT_ADDRESS`: UInt = 6u;
public const val `PRIVATEOBJECT_CALL`: UInt = 4u;
public const val `PRIVATEOBJECT_CALLID`: UInt = 2u;
public const val `PRIVATEOBJECT_LINE`: UInt = 3u;
public const val `PRIVATEOBJECT_NONE`: UInt = 1u;
public const val `PRIVATEOBJECT_PHONE`: UInt = 5u;
public const val `PT_BUSY`: `PHONE_TONE` = 18;
public const val `PT_ERRORTONE`: `PHONE_TONE` = 20;
public const val `PT_EXTERNALDIALTONE`: `PHONE_TONE` = 17;
public const val `PT_KEYPADA`: `PHONE_TONE` = 12;
public const val `PT_KEYPADB`: `PHONE_TONE` = 13;
public const val `PT_KEYPADC`: `PHONE_TONE` = 14;
public const val `PT_KEYPADD`: `PHONE_TONE` = 15;
public const val `PT_KEYPADEIGHT`: `PHONE_TONE` = 8;
public const val `PT_KEYPADFIVE`: `PHONE_TONE` = 5;
public const val `PT_KEYPADFOUR`: `PHONE_TONE` = 4;
public const val `PT_KEYPADNINE`: `PHONE_TONE` = 9;
public const val `PT_KEYPADONE`: `PHONE_TONE` = 1;
public const val `PT_KEYPADPOUND`: `PHONE_TONE` = 11;
public const val `PT_KEYPADSEVEN`: `PHONE_TONE` = 7;
public const val `PT_KEYPADSIX`: `PHONE_TONE` = 6;
public const val `PT_KEYPADSTAR`: `PHONE_TONE` = 10;
public const val `PT_KEYPADTHREE`: `PHONE_TONE` = 3;
public const val `PT_KEYPADTWO`: `PHONE_TONE` = 2;
public const val `PT_KEYPADZERO`: `PHONE_TONE` = 0;
public const val `PT_NORMALDIALTONE`: `PHONE_TONE` = 16;
public const val `PT_RINGBACK`: `PHONE_TONE` = 19;
public const val `PT_SILENCE`: `PHONE_TONE` = 21;
public const val `QE_ADMISSIONFAILURE`: `QOS_EVENT` = 2;
public const val `QE_GENERICERROR`: `QOS_EVENT` = 4;
public const val `QE_LASTITEM`: `QOS_EVENT` = 4;
public const val `QE_NOQOS`: `QOS_EVENT` = 1;
public const val `QE_POLICYFAILURE`: `QOS_EVENT` = 3;
public typealias `QOS_EVENT` = Int;
public typealias `QOS_SERVICE_LEVEL` = Int;
public const val `QSL_BEST_EFFORT`: `QOS_SERVICE_LEVEL` = 3;
public const val `QSL_IF_AVAILABLE`: `QOS_SERVICE_LEVEL` = 2;
public const val `QSL_NEEDED`: `QOS_SERVICE_LEVEL` = 1;
public const val `RAS_LOCAL`: `RND_ADVERTISING_SCOPE` = 1;
public const val `RAS_REGION`: `RND_ADVERTISING_SCOPE` = 3;
public const val `RAS_SITE`: `RND_ADVERTISING_SCOPE` = 2;
public const val `RAS_WORLD`: `RND_ADVERTISING_SCOPE` = 4;
public const val `RENDBIND_AUTHENTICATE`: UInt = 1u;
public const val `RENDBIND_DEFAULTCREDENTIALS`: UInt = 14u;
public const val `RENDBIND_DEFAULTDOMAINNAME`: UInt = 2u;
public const val `RENDBIND_DEFAULTPASSWORD`: UInt = 8u;
public const val `RENDBIND_DEFAULTUSERNAME`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RENDDATA` (
    public var `atyp`: UShort,
    public var `ulPosition`: UInt,
    public var `dxWidth`: UShort,
    public var `dyHeight`: UShort,
    public var `dwFlags`: UInt,
)
public typealias `RND_ADVERTISING_SCOPE` = Int;
// UNSUPPORTED Rust 2996:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Rendezvous: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1029e5b_cb5b_11d0_8d59_00c04fd91ac0);

// UNSUPPORTED Rust 2997:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RequestMakeCall: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xac48ffe0_f8c4_11d1_a030_00c04fb6809f);

public const val `STRINGFORMAT_ASCII`: UInt = 1u;
public const val `STRINGFORMAT_BINARY`: UInt = 4u;
public const val `STRINGFORMAT_DBCS`: UInt = 2u;
public const val `STRINGFORMAT_UNICODE`: UInt = 3u;
public const val `STRM_CONFIGURED`: UInt = 2u;
public const val `STRM_INITIAL`: UInt = 0u;
public const val `STRM_PAUSED`: UInt = 8u;
public const val `STRM_RUNNING`: UInt = 4u;
public const val `STRM_STOPPED`: UInt = 16u;
public const val `STRM_TERMINALSELECTED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STnefProblem` (
    public var `ulComponent`: UInt,
    public var `ulAttribute`: UInt,
    public var `ulPropTag`: UInt,
    public var `scode`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STnefProblemArray` (
    public var `cProblem`: UInt,
    public var `aProblem`: Array<`STnefProblem`>,
)
// UNSUPPORTED Rust 3022:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STnefProblemArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TAPI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x21d6d48e_a88b_11d0_83dd_00aa003ccabd);

public const val `TAPIERR_CONNECTED`: Int = 0;
public const val `TAPIERR_DESTBUSY`: Int = -11;
public const val `TAPIERR_DESTNOANSWER`: Int = -12;
public const val `TAPIERR_DESTUNAVAIL`: Int = -13;
public const val `TAPIERR_DEVICECLASSUNAVAIL`: Int = -8;
public const val `TAPIERR_DEVICEIDUNAVAIL`: Int = -9;
public const val `TAPIERR_DEVICEINUSE`: Int = -10;
public const val `TAPIERR_DROPPED`: Int = -1;
public const val `TAPIERR_INVALDESTADDRESS`: Int = -4;
public const val `TAPIERR_INVALDEVICECLASS`: Int = -6;
public const val `TAPIERR_INVALDEVICEID`: Int = -7;
public const val `TAPIERR_INVALPOINTER`: Int = -18;
public const val `TAPIERR_INVALWINDOWHANDLE`: Int = -5;
public const val `TAPIERR_MMCWRITELOCKED`: Int = -20;
public const val `TAPIERR_NOREQUESTRECIPIENT`: Int = -2;
public const val `TAPIERR_NOTADMIN`: Int = -19;
public const val `TAPIERR_PROVIDERALREADYINSTALLED`: Int = -21;
public const val `TAPIERR_REQUESTCANCELLED`: Int = -17;
public const val `TAPIERR_REQUESTFAILED`: Int = -16;
public const val `TAPIERR_REQUESTQUEUEFULL`: Int = -3;
public const val `TAPIERR_SCP_ALREADY_EXISTS`: Int = -22;
public const val `TAPIERR_SCP_DOES_NOT_EXIST`: Int = -23;
public const val `TAPIERR_UNKNOWNREQUESTID`: Int = -15;
public const val `TAPIERR_UNKNOWNWINHANDLE`: Int = -14;
public const val `TAPIMAXAPPNAMESIZE`: Int = 40;
public const val `TAPIMAXCALLEDPARTYSIZE`: Int = 40;
public const val `TAPIMAXCOMMENTSIZE`: Int = 80;
public const val `TAPIMAXDESTADDRESSSIZE`: Int = 80;
public const val `TAPIMAXDEVICECLASSSIZE`: Int = 40;
public const val `TAPIMAXDEVICEIDSIZE`: Int = 40;
public const val `TAPIMEDIATYPE_AUDIO`: UInt = 8u;
public const val `TAPIMEDIATYPE_DATAMODEM`: UInt = 16u;
public const val `TAPIMEDIATYPE_G3FAX`: UInt = 32u;
public const val `TAPIMEDIATYPE_MULTITRACK`: UInt = 65536u;
public const val `TAPIMEDIATYPE_VIDEO`: UInt = 32768u;
public typealias `TAPIOBJECT_EVENT` = Int;
public const val `TAPI_CURRENT_VERSION`: UInt = 131074u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPI_CUSTOMTONE` (
    public var `dwFrequency`: UInt,
    public var `dwCadenceOn`: UInt,
    public var `dwCadenceOff`: UInt,
    public var `dwVolume`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPI_DETECTTONE` (
    public var `dwAppSpecific`: UInt,
    public var `dwDuration`: UInt,
    public var `dwFrequency1`: UInt,
    public var `dwFrequency2`: UInt,
    public var `dwFrequency3`: UInt,
)
public typealias `TAPI_EVENT` = Int;
public const val `TAPI_E_ADDRESSBLOCKED`: Int = -2147221462;
public const val `TAPI_E_ALLOCATED`: Int = -2147221498;
public const val `TAPI_E_BILLINGREJECTED`: Int = -2147221461;
public const val `TAPI_E_CALLCENTER_GROUP_REMOVED`: Int = -2147221435;
public const val `TAPI_E_CALLCENTER_INVALAGENTACTIVITY`: Int = -2147221428;
public const val `TAPI_E_CALLCENTER_INVALAGENTGROUP`: Int = -2147221431;
public const val `TAPI_E_CALLCENTER_INVALAGENTID`: Int = -2147221432;
public const val `TAPI_E_CALLCENTER_INVALAGENTSTATE`: Int = -2147221429;
public const val `TAPI_E_CALLCENTER_INVALPASSWORD`: Int = -2147221430;
public const val `TAPI_E_CALLCENTER_NO_AGENT_ID`: Int = -2147221433;
public const val `TAPI_E_CALLCENTER_QUEUE_REMOVED`: Int = -2147221434;
public const val `TAPI_E_CALLNOTSELECTED`: Int = -2147221420;
public const val `TAPI_E_CALLUNAVAIL`: Int = -2147221497;
public const val `TAPI_E_COMPLETIONOVERRUN`: Int = -2147221496;
public const val `TAPI_E_CONFERENCEFULL`: Int = -2147221495;
public const val `TAPI_E_DESTBUSY`: Int = -2147221452;
public const val `TAPI_E_DESTNOANSWER`: Int = -2147221451;
public const val `TAPI_E_DESTUNAVAIL`: Int = -2147221450;
public const val `TAPI_E_DIALMODIFIERNOTSUPPORTED`: Int = -2147221494;
public const val `TAPI_E_DROPPED`: Int = -2147221455;
public const val `TAPI_E_INUSE`: Int = -2147221493;
public const val `TAPI_E_INVALADDRESS`: Int = -2147221492;
public const val `TAPI_E_INVALADDRESSSTATE`: Int = -2147221491;
public const val `TAPI_E_INVALADDRESSTYPE`: Int = -2147221423;
public const val `TAPI_E_INVALBUTTONLAMPID`: Int = -2147221459;
public const val `TAPI_E_INVALBUTTONSTATE`: Int = -2147221458;
public const val `TAPI_E_INVALCALLPARAMS`: Int = -2147221490;
public const val `TAPI_E_INVALCALLPRIVILEGE`: Int = -2147221489;
public const val `TAPI_E_INVALCALLSTATE`: Int = -2147221488;
public const val `TAPI_E_INVALCARD`: Int = -2147221487;
public const val `TAPI_E_INVALCOMPLETIONID`: Int = -2147221486;
public const val `TAPI_E_INVALCOUNTRYCODE`: Int = -2147221485;
public const val `TAPI_E_INVALDATAID`: Int = -2147221457;
public const val `TAPI_E_INVALDEVICECLASS`: Int = -2147221484;
public const val `TAPI_E_INVALDIALPARAMS`: Int = -2147221483;
public const val `TAPI_E_INVALDIGITS`: Int = -2147221482;
public const val `TAPI_E_INVALFEATURE`: Int = -2147221460;
public const val `TAPI_E_INVALGROUPID`: Int = -2147221481;
public const val `TAPI_E_INVALHOOKSWITCHDEV`: Int = -2147221456;
public const val `TAPI_E_INVALIDDIRECTION`: Int = -2147221446;
public const val `TAPI_E_INVALIDMEDIATYPE`: Int = -2147221500;
public const val `TAPI_E_INVALIDSTREAM`: Int = -2147221437;
public const val `TAPI_E_INVALIDSTREAMSTATE`: Int = -2147221417;
public const val `TAPI_E_INVALIDTERMINAL`: Int = -2147221445;
public const val `TAPI_E_INVALIDTERMINALCLASS`: Int = -2147221444;
public const val `TAPI_E_INVALLIST`: Int = -2147221474;
public const val `TAPI_E_INVALLOCATION`: Int = -2147221480;
public const val `TAPI_E_INVALMESSAGEID`: Int = -2147221479;
public const val `TAPI_E_INVALMODE`: Int = -2147221473;
public const val `TAPI_E_INVALPARKID`: Int = -2147221478;
public const val `TAPI_E_INVALPRIVILEGE`: Int = -2147221447;
public const val `TAPI_E_INVALRATE`: Int = -2147221477;
public const val `TAPI_E_INVALTIMEOUT`: Int = -2147221476;
public const val `TAPI_E_INVALTONE`: Int = -2147221475;
public const val `TAPI_E_MAXSTREAMS`: Int = -2147221442;
public const val `TAPI_E_MAXTERMINALS`: Int = -2147221438;
public const val `TAPI_E_NOCONFERENCE`: Int = -2147221472;
public const val `TAPI_E_NODEVICE`: Int = -2147221471;
public const val `TAPI_E_NODRIVER`: Int = -2147221443;
public const val `TAPI_E_NOEVENT`: Int = -2147221424;
public const val `TAPI_E_NOFORMAT`: Int = -2147221418;
public const val `TAPI_E_NOITEMS`: Int = -2147221502;
public const val `TAPI_E_NOREQUEST`: Int = -2147221470;
public const val `TAPI_E_NOREQUESTRECIPIENT`: Int = -2147221454;
public const val `TAPI_E_NOTENOUGHMEMORY`: Int = -2147221503;
public const val `TAPI_E_NOTERMINALSELECTED`: Int = -2147221441;
public const val `TAPI_E_NOTOWNER`: Int = -2147221469;
public const val `TAPI_E_NOTREGISTERED`: Int = -2147221468;
public const val `TAPI_E_NOTSTOPPED`: Int = -2147221439;
public const val `TAPI_E_NOTSUPPORTED`: Int = -2147221501;
public const val `TAPI_E_NOT_INITIALIZED`: Int = -2147221415;
public const val `TAPI_E_OPERATIONFAILED`: Int = -2147221499;
public const val `TAPI_E_PEER_NOT_SET`: Int = -2147221425;
public const val `TAPI_E_PHONENOTOPEN`: Int = -2147221421;
public const val `TAPI_E_REGISTRY_SETTING_CORRUPT`: Int = -2147221427;
public const val `TAPI_E_REINIT`: Int = -2147221463;
public const val `TAPI_E_REQUESTCANCELLED`: Int = -2147221448;
public const val `TAPI_E_REQUESTFAILED`: Int = -2147221449;
public const val `TAPI_E_REQUESTOVERRUN`: Int = -2147221467;
public const val `TAPI_E_REQUESTQUEUEFULL`: Int = -2147221453;
public const val `TAPI_E_RESOURCEUNAVAIL`: Int = -2147221422;
public const val `TAPI_E_SERVICE_NOT_RUNNING`: Int = -2147221414;
public const val `TAPI_E_TARGETNOTFOUND`: Int = -2147221466;
public const val `TAPI_E_TARGETSELF`: Int = -2147221465;
public const val `TAPI_E_TERMINALINUSE`: Int = -2147221440;
public const val `TAPI_E_TERMINAL_PEER`: Int = -2147221426;
public const val `TAPI_E_TIMEOUT`: Int = -2147221436;
public const val `TAPI_E_USERUSERINFOTOOBIG`: Int = -2147221464;
public const val `TAPI_E_WRONGEVENT`: Int = -2147221419;
public const val `TAPI_E_WRONG_STATE`: Int = -2147221416;
public typealias `TAPI_GATHERTERM` = Int;
public typealias `TAPI_OBJECT_TYPE` = Int;
public const val `TAPI_REPLY`: UInt = 1123u;
public typealias `TAPI_TONEMODE` = Int;
public const val `TD_BIDIRECTIONAL`: `TERMINAL_DIRECTION` = 2;
public const val `TD_CAPTURE`: `TERMINAL_DIRECTION` = 0;
public const val `TD_MULTITRACK_MIXED`: `TERMINAL_DIRECTION` = 3;
public const val `TD_NONE`: `TERMINAL_DIRECTION` = 4;
public const val `TD_RENDER`: `TERMINAL_DIRECTION` = 1;
public typealias `TERMINAL_DIRECTION` = Int;
public typealias `TERMINAL_MEDIA_STATE` = Int;
public typealias `TERMINAL_STATE` = Int;
public typealias `TERMINAL_TYPE` = Int;
public const val `TE_ACDGROUP`: `TAPI_EVENT` = 8192;
public const val `TE_ADDRESS`: `TAPI_EVENT` = 2;
public const val `TE_ADDRESSCLOSE`: `TAPIOBJECT_EVENT` = 4;
public const val `TE_ADDRESSCREATE`: `TAPIOBJECT_EVENT` = 0;
public const val `TE_ADDRESSDEVSPECIFIC`: `TAPI_EVENT` = 16777216;
public const val `TE_ADDRESSREMOVE`: `TAPIOBJECT_EVENT` = 1;
public const val `TE_AGENT`: `TAPI_EVENT` = 512;
public const val `TE_AGENTHANDLER`: `TAPI_EVENT` = 4096;
public const val `TE_AGENTSESSION`: `TAPI_EVENT` = 1024;
public const val `TE_ASRTERMINAL`: `TAPI_EVENT` = 131072;
public const val `TE_CALLHUB`: `TAPI_EVENT` = 32;
public const val `TE_CALLINFOCHANGE`: `TAPI_EVENT` = 64;
public const val `TE_CALLMEDIA`: `TAPI_EVENT` = 16;
public const val `TE_CALLNOTIFICATION`: `TAPI_EVENT` = 4;
public const val `TE_CALLSTATE`: `TAPI_EVENT` = 8;
public const val `TE_DIGITEVENT`: `TAPI_EVENT` = 32768;
public const val `TE_FILETERMINAL`: `TAPI_EVENT` = 524288;
public const val `TE_GATHERDIGITS`: `TAPI_EVENT` = 8388608;
public const val `TE_GENERATEEVENT`: `TAPI_EVENT` = 65536;
public const val `TE_PHONECREATE`: `TAPIOBJECT_EVENT` = 5;
public const val `TE_PHONEDEVSPECIFIC`: `TAPI_EVENT` = 33554432;
public const val `TE_PHONEEVENT`: `TAPI_EVENT` = 2097152;
public const val `TE_PHONEREMOVE`: `TAPIOBJECT_EVENT` = 6;
public const val `TE_PRIVATE`: `TAPI_EVENT` = 128;
public const val `TE_QOSEVENT`: `TAPI_EVENT` = 2048;
public const val `TE_QUEUE`: `TAPI_EVENT` = 16384;
public const val `TE_REINIT`: `TAPIOBJECT_EVENT` = 2;
public const val `TE_REQUEST`: `TAPI_EVENT` = 256;
public const val `TE_TAPIOBJECT`: `TAPI_EVENT` = 1;
public const val `TE_TONEEVENT`: `TAPI_EVENT` = 4194304;
public const val `TE_TONETERMINAL`: `TAPI_EVENT` = 1048576;
public const val `TE_TRANSLATECHANGE`: `TAPIOBJECT_EVENT` = 3;
public const val `TE_TTSTERMINAL`: `TAPI_EVENT` = 262144;
public const val `TGT_BUFFERFULL`: `TAPI_GATHERTERM` = 1;
public const val `TGT_CANCEL`: `TAPI_GATHERTERM` = 16;
public const val `TGT_FIRSTTIMEOUT`: `TAPI_GATHERTERM` = 4;
public const val `TGT_INTERTIMEOUT`: `TAPI_GATHERTERM` = 8;
public const val `TGT_TERMDIGIT`: `TAPI_GATHERTERM` = 2;
public const val `TMS_ACTIVE`: `TERMINAL_MEDIA_STATE` = 1;
public const val `TMS_IDLE`: `TERMINAL_MEDIA_STATE` = 0;
public const val `TMS_LASTITEM`: `TERMINAL_MEDIA_STATE` = 2;
public const val `TMS_PAUSED`: `TERMINAL_MEDIA_STATE` = 2;
public const val `TOT_ADDRESS`: `TAPI_OBJECT_TYPE` = 2;
public const val `TOT_CALL`: `TAPI_OBJECT_TYPE` = 4;
public const val `TOT_CALLHUB`: `TAPI_OBJECT_TYPE` = 5;
public const val `TOT_NONE`: `TAPI_OBJECT_TYPE` = 0;
public const val `TOT_PHONE`: `TAPI_OBJECT_TYPE` = 6;
public const val `TOT_TAPI`: `TAPI_OBJECT_TYPE` = 1;
public const val `TOT_TERMINAL`: `TAPI_OBJECT_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRP` (
    public var `trpid`: UShort,
    public var `cbgrtrp`: UShort,
    public var `cch`: UShort,
    public var `cbRgb`: UShort,
)
public const val `TSPI_LINEACCEPT`: UInt = 500u;
public const val `TSPI_LINEADDTOCONFERENCE`: UInt = 501u;
public const val `TSPI_LINEANSWER`: UInt = 502u;
public const val `TSPI_LINEBLINDTRANSFER`: UInt = 503u;
public const val `TSPI_LINECLOSE`: UInt = 504u;
public const val `TSPI_LINECLOSECALL`: UInt = 505u;
public const val `TSPI_LINECLOSEMSPINSTANCE`: UInt = 609u;
public const val `TSPI_LINECOMPLETECALL`: UInt = 506u;
public const val `TSPI_LINECOMPLETETRANSFER`: UInt = 507u;
public const val `TSPI_LINECONDITIONALMEDIADETECTION`: UInt = 508u;
public const val `TSPI_LINECONFIGDIALOG`: UInt = 509u;
public const val `TSPI_LINECONFIGDIALOGEDIT`: UInt = 601u;
public const val `TSPI_LINECREATEMSPINSTANCE`: UInt = 608u;
public const val `TSPI_LINEDEVSPECIFIC`: UInt = 510u;
public const val `TSPI_LINEDEVSPECIFICFEATURE`: UInt = 511u;
public const val `TSPI_LINEDIAL`: UInt = 512u;
public const val `TSPI_LINEDROP`: UInt = 513u;
public const val `TSPI_LINEDROPNOOWNER`: UInt = 597u;
public const val `TSPI_LINEDROPONCLOSE`: UInt = 596u;
public const val `TSPI_LINEFORWARD`: UInt = 514u;
public const val `TSPI_LINEGATHERDIGITS`: UInt = 515u;
public const val `TSPI_LINEGENERATEDIGITS`: UInt = 516u;
public const val `TSPI_LINEGENERATETONE`: UInt = 517u;
public const val `TSPI_LINEGETADDRESSCAPS`: UInt = 518u;
public const val `TSPI_LINEGETADDRESSID`: UInt = 519u;
public const val `TSPI_LINEGETADDRESSSTATUS`: UInt = 520u;
public const val `TSPI_LINEGETCALLADDRESSID`: UInt = 521u;
public const val `TSPI_LINEGETCALLHUBTRACKING`: UInt = 604u;
public const val `TSPI_LINEGETCALLID`: UInt = 603u;
public const val `TSPI_LINEGETCALLINFO`: UInt = 522u;
public const val `TSPI_LINEGETCALLSTATUS`: UInt = 523u;
public const val `TSPI_LINEGETDEVCAPS`: UInt = 524u;
public const val `TSPI_LINEGETDEVCONFIG`: UInt = 525u;
public const val `TSPI_LINEGETEXTENSIONID`: UInt = 526u;
public const val `TSPI_LINEGETICON`: UInt = 527u;
public const val `TSPI_LINEGETID`: UInt = 528u;
public const val `TSPI_LINEGETLINEDEVSTATUS`: UInt = 529u;
public const val `TSPI_LINEGETNUMADDRESSIDS`: UInt = 530u;
public const val `TSPI_LINEHOLD`: UInt = 531u;
public const val `TSPI_LINEMAKECALL`: UInt = 532u;
public const val `TSPI_LINEMONITORDIGITS`: UInt = 533u;
public const val `TSPI_LINEMONITORMEDIA`: UInt = 534u;
public const val `TSPI_LINEMONITORTONES`: UInt = 535u;
public const val `TSPI_LINEMSPIDENTIFY`: UInt = 607u;
public const val `TSPI_LINENEGOTIATEEXTVERSION`: UInt = 536u;
public const val `TSPI_LINENEGOTIATETSPIVERSION`: UInt = 537u;
public const val `TSPI_LINEOPEN`: UInt = 538u;
public const val `TSPI_LINEPARK`: UInt = 539u;
public const val `TSPI_LINEPICKUP`: UInt = 540u;
public const val `TSPI_LINEPREPAREADDTOCONFERENCE`: UInt = 541u;
public const val `TSPI_LINERECEIVEMSPDATA`: UInt = 606u;
public const val `TSPI_LINEREDIRECT`: UInt = 542u;
public const val `TSPI_LINERELEASEUSERUSERINFO`: UInt = 602u;
public const val `TSPI_LINEREMOVEFROMCONFERENCE`: UInt = 543u;
public const val `TSPI_LINESECURECALL`: UInt = 544u;
public const val `TSPI_LINESELECTEXTVERSION`: UInt = 545u;
public const val `TSPI_LINESENDUSERUSERINFO`: UInt = 546u;
public const val `TSPI_LINESETAPPSPECIFIC`: UInt = 547u;
public const val `TSPI_LINESETCALLHUBTRACKING`: UInt = 605u;
public const val `TSPI_LINESETCALLPARAMS`: UInt = 548u;
public const val `TSPI_LINESETCURRENTLOCATION`: UInt = 600u;
public const val `TSPI_LINESETDEFAULTMEDIADETECTION`: UInt = 549u;
public const val `TSPI_LINESETDEVCONFIG`: UInt = 550u;
public const val `TSPI_LINESETMEDIACONTROL`: UInt = 551u;
public const val `TSPI_LINESETMEDIAMODE`: UInt = 552u;
public const val `TSPI_LINESETSTATUSMESSAGES`: UInt = 553u;
public const val `TSPI_LINESETTERMINAL`: UInt = 554u;
public const val `TSPI_LINESETUPCONFERENCE`: UInt = 555u;
public const val `TSPI_LINESETUPTRANSFER`: UInt = 556u;
public const val `TSPI_LINESWAPHOLD`: UInt = 557u;
public const val `TSPI_LINEUNCOMPLETECALL`: UInt = 558u;
public const val `TSPI_LINEUNHOLD`: UInt = 559u;
public const val `TSPI_LINEUNPARK`: UInt = 560u;
public const val `TSPI_MESSAGE_BASE`: UInt = 500u;
public const val `TSPI_PHONECLOSE`: UInt = 561u;
public const val `TSPI_PHONECONFIGDIALOG`: UInt = 562u;
public const val `TSPI_PHONEDEVSPECIFIC`: UInt = 563u;
public const val `TSPI_PHONEGETBUTTONINFO`: UInt = 564u;
public const val `TSPI_PHONEGETDATA`: UInt = 565u;
public const val `TSPI_PHONEGETDEVCAPS`: UInt = 566u;
public const val `TSPI_PHONEGETDISPLAY`: UInt = 567u;
public const val `TSPI_PHONEGETEXTENSIONID`: UInt = 568u;
public const val `TSPI_PHONEGETGAIN`: UInt = 569u;
public const val `TSPI_PHONEGETHOOKSWITCH`: UInt = 570u;
public const val `TSPI_PHONEGETICON`: UInt = 571u;
public const val `TSPI_PHONEGETID`: UInt = 572u;
public const val `TSPI_PHONEGETLAMP`: UInt = 573u;
public const val `TSPI_PHONEGETRING`: UInt = 574u;
public const val `TSPI_PHONEGETSTATUS`: UInt = 575u;
public const val `TSPI_PHONEGETVOLUME`: UInt = 576u;
public const val `TSPI_PHONENEGOTIATEEXTVERSION`: UInt = 577u;
public const val `TSPI_PHONENEGOTIATETSPIVERSION`: UInt = 578u;
public const val `TSPI_PHONEOPEN`: UInt = 579u;
public const val `TSPI_PHONESELECTEXTVERSION`: UInt = 580u;
public const val `TSPI_PHONESETBUTTONINFO`: UInt = 581u;
public const val `TSPI_PHONESETDATA`: UInt = 582u;
public const val `TSPI_PHONESETDISPLAY`: UInt = 583u;
public const val `TSPI_PHONESETGAIN`: UInt = 584u;
public const val `TSPI_PHONESETHOOKSWITCH`: UInt = 585u;
public const val `TSPI_PHONESETLAMP`: UInt = 586u;
public const val `TSPI_PHONESETRING`: UInt = 587u;
public const val `TSPI_PHONESETSTATUSMESSAGES`: UInt = 588u;
public const val `TSPI_PHONESETVOLUME`: UInt = 589u;
public const val `TSPI_PROC_BASE`: UInt = 500u;
public const val `TSPI_PROVIDERCONFIG`: UInt = 590u;
public const val `TSPI_PROVIDERCREATELINEDEVICE`: UInt = 598u;
public const val `TSPI_PROVIDERCREATEPHONEDEVICE`: UInt = 599u;
public const val `TSPI_PROVIDERENUMDEVICES`: UInt = 595u;
public const val `TSPI_PROVIDERINIT`: UInt = 591u;
public const val `TSPI_PROVIDERINSTALL`: UInt = 592u;
public const val `TSPI_PROVIDERREMOVE`: UInt = 593u;
public const val `TSPI_PROVIDERSHUTDOWN`: UInt = 594u;
public const val `TS_INUSE`: `TERMINAL_STATE` = 0;
public const val `TS_NOTINUSE`: `TERMINAL_STATE` = 1;
public const val `TTM_BEEP`: `TAPI_TONEMODE` = 8;
public const val `TTM_BILLING`: `TAPI_TONEMODE` = 16;
public const val `TTM_BUSY`: `TAPI_TONEMODE` = 4;
public const val `TTM_RINGBACK`: `TAPI_TONEMODE` = 2;
public const val `TT_DYNAMIC`: `TERMINAL_TYPE` = 1;
public const val `TT_STATIC`: `TERMINAL_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TUISPICREATEDIALOGINSTANCEPARAMS` (
    public var `dwRequestID`: UInt,
    public var `hdDlgInst`: `HDRVDIALOGINSTANCE`,
    public var `htDlgInst`: UInt,
    public var `lpszUIDLLName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpParams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwSize`: UInt,
)
// UNSUPPORTED Rust 3373:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TUISPICREATEDIALOGINSTANCEPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TUISPIDLLCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Int>>>;
public const val `TUISPIDLL_OBJECT_DIALOGINSTANCE`: Int = 4;
public const val `TUISPIDLL_OBJECT_LINEID`: Int = 1;
public const val `TUISPIDLL_OBJECT_PHONEID`: Int = 2;
public const val `TUISPIDLL_OBJECT_PROVIDERID`: Int = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VARSTRING` (
    public var `dwTotalSize`: UInt,
    public var `dwNeededSize`: UInt,
    public var `dwUsedSize`: UInt,
    public var `dwStringFormat`: UInt,
    public var `dwStringSize`: UInt,
    public var `dwStringOffset`: UInt,
)
public const val `atypFile`: Int = 1;
public const val `atypMax`: Int = 4;
public const val `atypNull`: Int = 0;
public const val `atypOle`: Int = 2;
public const val `atypPicture`: Int = 3;
public const val `cbDisplayName`: UInt = 41u;
public const val `cbEmailName`: UInt = 11u;
public const val `cbMaxIdData`: UInt = 200u;
public const val `cbSeverName`: UInt = 12u;
public const val `cbTYPE`: UInt = 16u;
public const val `prioHigh`: UInt = 1u;
public const val `prioLow`: UInt = 3u;
public const val `prioNorm`: UInt = 2u;
