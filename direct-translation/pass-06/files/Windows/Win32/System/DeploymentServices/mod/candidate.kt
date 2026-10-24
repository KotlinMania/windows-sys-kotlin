// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeAsyncRecvDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeAsyncRecvDone`(`hclientrequest` : `super`.`super`.`Foundation`.`HANDLE`, `action` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpAppendOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpAppendOption`(`preplypacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `umaxreplypacketlen` : UInt, `pureplypacketlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `boption` : UByte, `boptionlen` : UByte, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpAppendOptionRaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpAppendOptionRaw`(`preplypacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `umaxreplypacketlen` : UInt, `pureplypacketlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ubufferlen` : UShort, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpGetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpGetOptionValue`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `uinstance` : UInt, `boption` : UByte, `pboptionlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ppoptionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpGetVendorOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpGetVendorOptionValue`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `boption` : UByte, `uinstance` : UInt, `pboptionlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ppoptionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpInitialize`(`precvpacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `urecvpacketlen` : UInt, `preplypacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `umaxreplypacketlen` : UInt, `pureplypacketlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpIsValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpIsValid`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `brequestpacket` : `windows_sys`.`core`.`BOOL`, `pbpxeoptionpresent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6AppendOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6AppendOption`(`preply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbreply` : UInt, `pcbreplyused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `woptiontype` : UShort, `cboption` : UShort, `poption` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6AppendOptionRaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6AppendOptionRaw`(`preply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbreply` : UInt, `pcbreplyused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbbuffer` : UShort, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6CreateRelayRepl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6CreateRelayRepl`(`prelaymessages` : /* Rust *const */ kotlinx.cinterop.CPointer<`PXE_DHCPV6_NESTED_RELAY_MESSAGE`>?, `nrelaymessages` : UInt, `pinnerpacket` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbinnerpacket` : UInt, `preplybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbreplybuffer` : UInt, `pcbreplybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6GetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6GetOptionValue`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `uinstance` : UInt, `woption` : UShort, `pwoptionlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ppoptionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6GetVendorOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6GetVendorOptionValue`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `dwenterprisenumber` : UInt, `woption` : UShort, `uinstance` : UInt, `pwoptionlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ppoptionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6Initialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6Initialize`(`prequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbrequest` : UInt, `preply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbreply` : UInt, `pcbreplyused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6IsValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6IsValid`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `brequestpacket` : `windows_sys`.`core`.`BOOL`, `pbpxeoptionpresent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeDhcpv6ParseRelayForw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeDhcpv6ParseRelayForw`(`prelayforwpacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `urelayforwpacketlen` : UInt, `prelaymessages` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PXE_DHCPV6_NESTED_RELAY_MESSAGE`>?, `nrelaymessages` : UInt, `pnrelaymessages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppinnerpacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pcbinnerpacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeGetServerInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeGetServerInfo`(`uinfotype` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ubufferlen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeGetServerInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeGetServerInfoEx`(`uinfotype` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ubufferlen` : UInt, `pubufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxePacketAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxePacketAllocate`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `hclientrequest` : `super`.`super`.`Foundation`.`HANDLE`, `usize` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxePacketFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxePacketFree`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `hclientrequest` : `super`.`super`.`Foundation`.`HANDLE`, `ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderEnumClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderEnumClose`(`henum` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderEnumFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderEnumFirst`(`phenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderEnumNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderEnumNext`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PXE_PROVIDER`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderFreeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderFreeInfo`(`pprovider` : /* Rust *const */ kotlinx.cinterop.CPointer<`PXE_PROVIDER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderQueryIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderQueryIndex`(`pszprovidername` : `windows_sys`.`core`.`PCWSTR`, `puindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PxeProviderRegister`(`pszprovidername` : `windows_sys`.`core`.`PCWSTR`, `pszmodulepath` : `windows_sys`.`core`.`PCWSTR`, `index` : UInt, `biscritical` : `windows_sys`.`core`.`BOOL`, `phproviderkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Registry`.`HKEY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderSetAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderSetAttribute`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `attribute` : UInt, `pparameterbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `uparamlen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeProviderUnRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeProviderUnRegister`(`pszprovidername` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeRegisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeRegisterCallback`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `callbacktype` : UInt, `pcallbackfunction` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeSendReply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeSendReply`(`hclientrequest` : `super`.`super`.`Foundation`.`HANDLE`, `ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `paddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`PXE_ADDRESS`>?) : UInt
// UNSUPPORTED Rust 31:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("wdspxe.dll" "C" fn PxeTrace(hprovider : super::super::Foundation:: HANDLE, severity : u32, pszformat : windows_sys::core::PCWSTR, ...) -> u32);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdspxe.dll, ABI=system, export=PxeTraceV; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PxeTraceV`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `severity` : UInt, `pszformat` : `windows_sys`.`core`.`PCWSTR`, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpAddOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpAddOption`(`hhandle` : `super`.`super`.`Foundation`.`HANDLE`, `uoption` : UInt, `uvaluelen` : UInt, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpCloseHandle`(`hhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpGetOptionBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpGetOptionBuffer`(`hhandle` : `super`.`super`.`Foundation`.`HANDLE`, `ubufferlen` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pubytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpInitialize`(`bpackettype` : UByte, `phhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpParseInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpParseInitialize`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `pbpackettype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `phhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpParseInitializev6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpParseInitializev6`(`ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `upacketlen` : UInt, `pbpackettype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `phhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsbp.dll, ABI=system, export=WdsBpQueryOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsBpQueryOption`(`hhandle` : `super`.`super`.`Foundation`.`HANDLE`, `uoption` : UInt, `uvaluelen` : UInt, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pubytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliAuthorizeSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliAuthorizeSession`(`hsession` : `super`.`super`.`Foundation`.`HANDLE`, `pcred` : /* Rust *const */ kotlinx.cinterop.CPointer<`WDS_CLI_CRED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliCancelTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliCancelTransfer`(`htransfer` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliClose`(`handle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliCreateSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliCreateSession`(`pwszserver` : `windows_sys`.`core`.`PCWSTR`, `pcred` : /* Rust *const */ kotlinx.cinterop.CPointer<`WDS_CLI_CRED`>?, `phsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliFindFirstImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliFindFirstImage`(`hsession` : `super`.`super`.`Foundation`.`HANDLE`, `phfindhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliFindNextImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliFindNextImage`(`handle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliFreeStringArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliFreeStringArray`(`ppwszarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `ulcount` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetDriverQueryXml; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetDriverQueryXml`(`pwszwindirpath` : `windows_sys`.`core`.`PCWSTR`, `ppwszdriverquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetEnumerationFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetEnumerationFlags`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageArchitecture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageArchitecture`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pdwvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CPU_ARCHITECTURE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageDescription`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageFiles`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pppwszfiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pdwcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageGroup`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageHalName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageHalName`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageHandleFromFindHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageHandleFromFindHandle`(`findhandle` : `super`.`super`.`Foundation`.`HANDLE`, `phimagehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageHandleFromTransferHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageHandleFromTransferHandle`(`htransfer` : `super`.`super`.`Foundation`.`HANDLE`, `phimagehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageIndex`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pdwvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageLanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageLanguage`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageLanguages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageLanguages`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pppszvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>>?, `pdwnumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageLastModifiedTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageLastModifiedTime`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppsystimevalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Foundation`.`SYSTEMTIME`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageName`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageNamespace`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageParameter`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `paramtype` : `WDS_CLI_IMAGE_PARAM_TYPE`, `presponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `uresponselen` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImagePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImagePath`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageSize`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pullvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageType`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pimagetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WDS_CLI_IMAGE_TYPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetImageVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetImageVersion`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliGetTransferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliGetTransferSize`(`hifh` : `super`.`super`.`Foundation`.`HANDLE`, `pullvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliInitializeLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliInitializeLog`(`hsession` : `super`.`super`.`Foundation`.`HANDLE`, `ulclientarchitecture` : `CPU_ARCHITECTURE`, `pwszclientid` : `windows_sys`.`core`.`PCWSTR`, `pwszclientaddress` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 69:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("wdsclientapi.dll" "C" fn WdsCliLog(hsession : super::super::Foundation:: HANDLE, ulloglevel : u32, ulmessagecode : u32, ...) -> windows_sys::core::HRESULT);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliObtainDriverPackages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliObtainDriverPackages`(`himage` : `super`.`super`.`Foundation`.`HANDLE`, `ppwszservername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pppwszdriverpackages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pulcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliObtainDriverPackagesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliObtainDriverPackagesEx`(`hsession` : `super`.`super`.`Foundation`.`HANDLE`, `pwszmachineinfo` : `windows_sys`.`core`.`PCWSTR`, `ppwszservername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pppwszdriverpackages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pulcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliRegisterTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliRegisterTrace`(`pfn` : `PFN_WdsCliTraceFunction`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliSetTransferBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliSetTransferBufferSize`(`ulsizeinbytes` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliTransferFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliTransferFile`(`pwszserver` : `windows_sys`.`core`.`PCWSTR`, `pwsznamespace` : `windows_sys`.`core`.`PCWSTR`, `pwszremotefilepath` : `windows_sys`.`core`.`PCWSTR`, `pwszlocalfilepath` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwreserved` : UInt, `pfnwdsclicallback` : `PFN_WdsCliCallback`, `pvuserdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phtransfer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliTransferImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliTransferImage`(`himage` : `super`.`super`.`Foundation`.`HANDLE`, `pwszlocalpath` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwreserved` : UInt, `pfnwdsclicallback` : `PFN_WdsCliCallback`, `pvuserdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phtransfer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsclientapi.dll, ABI=system, export=WdsCliWaitForTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsCliWaitForTransfer`(`htransfer` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientAddRefBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientAddRefBuffer`(`pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientCancelSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientCancelSession`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientCancelSessionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientCancelSessionEx`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`, `dwerrorcode` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientCloseSession`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientCompleteReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientCompleteReceive`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`, `ulsize` : UInt, `pulloffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientInitialize`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientInitializeSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientInitializeSession`(`psessionrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`WDS_TRANSPORTCLIENT_REQUEST`>?, `pcallerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hsessionkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientQueryStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientQueryStatus`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`, `pustatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `puerrorcode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientRegisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientRegisterCallback`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`, `callbackid` : `TRANSPORTCLIENT_CALLBACK_ID`, `pfncallback` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientReleaseBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientReleaseBuffer`(`pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientShutdown`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientStartSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientStartSession`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdstptc.dll, ABI=system, export=WdsTransportClientWaitForCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportClientWaitForCompletion`(`hsessionkey` : `super`.`super`.`Foundation`.`HANDLE`, `utimeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsmc.dll, ABI=system, export=WdsTransportServerAllocateBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportServerAllocateBuffer`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `ulbuffersize` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsmc.dll, ABI=system, export=WdsTransportServerCompleteRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportServerCompleteRead`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `ulbytesread` : UInt, `pvuserdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hreadresult` : `windows_sys`.`core`.`HRESULT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsmc.dll, ABI=system, export=WdsTransportServerFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportServerFreeBuffer`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsmc.dll, ABI=system, export=WdsTransportServerRegisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportServerRegisterCallback`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `callbackid` : `TRANSPORTPROVIDER_CALLBACK_ID`, `pfncallback` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 94:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("wdsmc.dll" "C" fn WdsTransportServerTrace(hprovider : super::super::Foundation:: HANDLE, severity : u32, pwszformat : windows_sys::core::PCWSTR, ...) -> windows_sys::core::HRESULT);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wdsmc.dll, ABI=system, export=WdsTransportServerTraceV; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WdsTransportServerTraceV`(`hprovider` : `super`.`super`.`Foundation`.`HANDLE`, `severity` : UInt, `pwszformat` : `windows_sys`.`core`.`PCWSTR`, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `windows_sys`.`core`.`HRESULT`
public typealias `CPU_ARCHITECTURE` = UInt;
public const val `CPU_ARCHITECTURE_AMD64`: `CPU_ARCHITECTURE` = 9u;
public const val `CPU_ARCHITECTURE_IA64`: `CPU_ARCHITECTURE` = 6u;
public const val `CPU_ARCHITECTURE_INTEL`: `CPU_ARCHITECTURE` = 0u;
public const val `EVT_WDSMCS_E_CP_CALLBACKS_NOT_REG`: Int = -1054801324;
public const val `EVT_WDSMCS_E_CP_CLOSE_INSTANCE_FAILED`: Int = -1054801320;
public const val `EVT_WDSMCS_E_CP_DLL_LOAD_FAILED`: Int = -1054801328;
public const val `EVT_WDSMCS_E_CP_DLL_LOAD_FAILED_CRITICAL`: Int = -1054801317;
public const val `EVT_WDSMCS_E_CP_INCOMPATIBLE_SERVER_VERSION`: Int = -1054801325;
public const val `EVT_WDSMCS_E_CP_INIT_FUNC_FAILED`: Int = -1054801326;
public const val `EVT_WDSMCS_E_CP_INIT_FUNC_MISSING`: Int = -1054801327;
public const val `EVT_WDSMCS_E_CP_MEMORY_LEAK`: Int = -1054801322;
public const val `EVT_WDSMCS_E_CP_OPEN_CONTENT_FAILED`: Int = -1054801319;
public const val `EVT_WDSMCS_E_CP_OPEN_INSTANCE_FAILED`: Int = -1054801321;
public const val `EVT_WDSMCS_E_CP_SHUTDOWN_FUNC_FAILED`: Int = -1054801323;
public const val `EVT_WDSMCS_E_DUPLICATE_MULTICAST_ADDR`: Int = -1054801406;
public const val `EVT_WDSMCS_E_NON_WDS_DUPLICATE_MULTICAST_ADDR`: Int = -1054801405;
public const val `EVT_WDSMCS_E_NSREG_CONTENT_PROVIDER_NOT_REG`: Int = -1054801151;
public const val `EVT_WDSMCS_E_NSREG_FAILURE`: Int = -1054801149;
public const val `EVT_WDSMCS_E_NSREG_NAMESPACE_EXISTS`: Int = -1054801150;
public const val `EVT_WDSMCS_E_NSREG_START_TIME_IN_PAST`: Int = -1054801152;
public const val `EVT_WDSMCS_E_PARAMETERS_READ_FAILED`: Int = -1054801407;
public const val `EVT_WDSMCS_S_PARAMETERS_READ`: Int = 1092682240;
public const val `EVT_WDSMCS_W_CP_DLL_LOAD_FAILED_NOT_CRITICAL`: Int = -2128543142;
public const val `FACILITY_WDSMCCLIENT`: UInt = 290u;
public const val `FACILITY_WDSMCSERVER`: UInt = 289u;
public const val `FACILITY_WDSTPTMGMT`: UInt = 272u;
public const val `MC_SERVER_CURRENT_VERSION`: UInt = 1u;
public typealias `PFN_WDS_CLI_CALLBACK_MESSAGE_ID` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsCliCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFN_WDS_CLI_CALLBACK_MESSAGE_ID`, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsCliTraceFunction` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientReceiveContents` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientReceiveMetadata` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientSessionComplete` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientSessionNegotiate` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`TRANSPORTCLIENT_SESSION_INFO`>?, `super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientSessionStart` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WdsTransportClientSessionStartEx` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`TRANSPORTCLIENT_SESSION_INFO`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_ADDRESS` (
    public var `uFlags`: UInt,
    public var `Anonymous`: `PXE_ADDRESS_0`,
    public var `uAddrLen`: UInt,
    public var `uPort`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_ADDRESS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_ADDRESS`.Companion.`default`() : `PXE_ADDRESS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 146:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PXE_ADDRESS_0 {
//     pub bAddress: [u8; 16],
//     pub uIpAddress: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_ADDRESS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_ADDRESS_0`.Companion.`default`() : `PXE_ADDRESS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PXE_ADDR_BROADCAST`: UInt = 1u;
public const val `PXE_ADDR_USE_ADDR`: UInt = 4u;
public const val `PXE_ADDR_USE_DHCP_RULES`: UInt = 8u;
public const val `PXE_ADDR_USE_PORT`: UInt = 2u;
public const val `PXE_BA_CUSTOM`: UInt = 2u;
public const val `PXE_BA_IGNORE`: UInt = 3u;
public const val `PXE_BA_NBP`: UInt = 1u;
public const val `PXE_BA_REJECTED`: UInt = 4u;
public const val `PXE_CALLBACK_MAX`: UInt = 3u;
public const val `PXE_CALLBACK_RECV_REQUEST`: UInt = 0u;
public const val `PXE_CALLBACK_SERVICE_CONTROL`: UInt = 2u;
public const val `PXE_CALLBACK_SHUTDOWN`: UInt = 1u;
public const val `PXE_DHCPV6_CLIENT_PORT`: UInt = 546u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCPV6_MESSAGE` (
    public var `MessageType`: UByte,
    public var `TransactionIDByte1`: UByte,
    public var `TransactionIDByte2`: UByte,
    public var `TransactionIDByte3`: UByte,
    public var `Options`: Array<`PXE_DHCPV6_OPTION`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCPV6_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCPV6_MESSAGE`.Companion.`default`() : `PXE_DHCPV6_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCPV6_MESSAGE_HEADER` (
    public var `MessageType`: UByte,
    public var `Message`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCPV6_MESSAGE_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCPV6_MESSAGE_HEADER`.Companion.`default`() : `PXE_DHCPV6_MESSAGE_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCPV6_NESTED_RELAY_MESSAGE` (
    public var `pRelayMessage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PXE_DHCPV6_RELAY_MESSAGE`>?,
    public var `cbRelayMessage`: UInt,
    public var `pInterfaceIdOption`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbInterfaceIdOption`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCPV6_NESTED_RELAY_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCPV6_NESTED_RELAY_MESSAGE`.Companion.`default`() : `PXE_DHCPV6_NESTED_RELAY_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCPV6_OPTION` (
    public var `OptionCode`: UShort,
    public var `DataLength`: UShort,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCPV6_OPTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCPV6_OPTION`.Companion.`default`() : `PXE_DHCPV6_OPTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PXE_DHCPV6_RELAY_HOP_COUNT_LIMIT`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCPV6_RELAY_MESSAGE` (
    public var `MessageType`: UByte,
    public var `HopCount`: UByte,
    public var `LinkAddress`: UByteArray,
    public var `PeerAddress`: UByteArray,
    public var `Options`: Array<`PXE_DHCPV6_OPTION`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCPV6_RELAY_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCPV6_RELAY_MESSAGE`.Companion.`default`() : `PXE_DHCPV6_RELAY_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PXE_DHCPV6_SERVER_PORT`: UInt = 547u;
public const val `PXE_DHCP_CLIENT_PORT`: UInt = 68u;
public const val `PXE_DHCP_FILE_SIZE`: UInt = 128u;
public const val `PXE_DHCP_HWAADR_SIZE`: UInt = 16u;
public const val `PXE_DHCP_MAGIC_COOKIE_SIZE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCP_MESSAGE` (
    public var `Operation`: UByte,
    public var `HardwareAddressType`: UByte,
    public var `HardwareAddressLength`: UByte,
    public var `HopCount`: UByte,
    public var `TransactionID`: UInt,
    public var `SecondsSinceBoot`: UShort,
    public var `Reserved`: UShort,
    public var `ClientIpAddress`: UInt,
    public var `YourIpAddress`: UInt,
    public var `BootstrapServerAddress`: UInt,
    public var `RelayAgentIpAddress`: UInt,
    public var `HardwareAddress`: UByteArray,
    public var `HostName`: UByteArray,
    public var `BootFileName`: UByteArray,
    public var `Anonymous`: `PXE_DHCP_MESSAGE_0`,
    public var `Option`: `PXE_DHCP_OPTION`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCP_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCP_MESSAGE`.Companion.`default`() : `PXE_DHCP_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 265:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union PXE_DHCP_MESSAGE_0 {
//     pub bMagicCookie: [u8; 4],
//     pub uMagicCookie: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCP_MESSAGE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCP_MESSAGE_0`.Companion.`default`() : `PXE_DHCP_MESSAGE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_DHCP_OPTION` (
    public var `OptionType`: UByte,
    public var `OptionLength`: UByte,
    public var `OptionValue`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_DHCP_OPTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_DHCP_OPTION`.Companion.`default`() : `PXE_DHCP_OPTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PXE_DHCP_SERVER_PORT`: UInt = 67u;
public const val `PXE_DHCP_SERVER_SIZE`: UInt = 64u;
public const val `PXE_GSI_SERVER_DUID`: UInt = 2u;
public const val `PXE_GSI_TRACE_ENABLED`: UInt = 1u;
public const val `PXE_MAX_ADDRESS`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PXE_PROVIDER` (
    public var `uSizeOfStruct`: UInt,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszFilePath`: `windows_sys`.`core`.`PWSTR`,
    public var `bIsCritical`: `windows_sys`.`core`.`BOOL`,
    public var `uIndex`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PXE_PROVIDER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PXE_PROVIDER`.Companion.`default`() : `PXE_PROVIDER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PXE_PROV_ATTR_FILTER`: UInt = 0u;
public const val `PXE_PROV_ATTR_FILTER_IPV6`: UInt = 1u;
public const val `PXE_PROV_ATTR_IPV6_CAPABLE`: UInt = 2u;
public const val `PXE_PROV_FILTER_ALL`: UInt = 0u;
public const val `PXE_PROV_FILTER_DHCP_ONLY`: UInt = 1u;
public const val `PXE_PROV_FILTER_PXE_ONLY`: UInt = 2u;
public const val `PXE_REG_INDEX_BOTTOM`: UInt = 4294967295u;
public const val `PXE_REG_INDEX_TOP`: UInt = 0u;
public const val `PXE_SERVER_PORT`: UInt = 4011u;
public const val `PXE_TRACE_ERROR`: UInt = 524288u;
public const val `PXE_TRACE_FATAL`: UInt = 1048576u;
public const val `PXE_TRACE_INFO`: UInt = 131072u;
public const val `PXE_TRACE_VERBOSE`: UInt = 65536u;
public const val `PXE_TRACE_WARNING`: UInt = 262144u;
public typealias `TRANSPORTCLIENT_CALLBACK_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORTCLIENT_SESSION_INFO` (
    public var `ulStructureLength`: UInt,
    public var `ullFileSize`: ULong,
    public var `ulBlockSize`: UInt,
)
public typealias `TRANSPORTPROVIDER_CALLBACK_ID` = Int;
public const val `TRANSPORTPROVIDER_CURRENT_VERSION`: UInt = 1u;
public const val `WDSBP_OPTVAL_ACTION_ABORT`: UInt = 5u;
public const val `WDSBP_OPTVAL_ACTION_APPROVAL`: UInt = 1u;
public const val `WDSBP_OPTVAL_ACTION_REFERRAL`: UInt = 3u;
public const val `WDSBP_OPTVAL_NBP_VER_7`: UInt = 1792u;
public const val `WDSBP_OPTVAL_NBP_VER_8`: UInt = 2048u;
public const val `WDSBP_OPTVAL_PXE_PROMPT_NOPROMPT`: UInt = 2u;
public const val `WDSBP_OPTVAL_PXE_PROMPT_OPTIN`: UInt = 1u;
public const val `WDSBP_OPTVAL_PXE_PROMPT_OPTOUT`: UInt = 3u;
public const val `WDSBP_OPT_TYPE_BYTE`: UInt = 1u;
public const val `WDSBP_OPT_TYPE_IP4`: UInt = 6u;
public const val `WDSBP_OPT_TYPE_IP6`: UInt = 7u;
public const val `WDSBP_OPT_TYPE_NONE`: UInt = 0u;
public const val `WDSBP_OPT_TYPE_STR`: UInt = 5u;
public const val `WDSBP_OPT_TYPE_ULONG`: UInt = 3u;
public const val `WDSBP_OPT_TYPE_USHORT`: UInt = 2u;
public const val `WDSBP_OPT_TYPE_WSTR`: UInt = 4u;
public const val `WDSBP_PK_TYPE_BCD`: UInt = 4u;
public const val `WDSBP_PK_TYPE_DHCP`: UInt = 1u;
public const val `WDSBP_PK_TYPE_DHCPV6`: UInt = 8u;
public const val `WDSBP_PK_TYPE_WDSNBP`: UInt = 2u;
public const val `WDSMCCLIENT_CATEGORY`: Int = 2;
public const val `WDSMCSERVER_CATEGORY`: Int = 1;
public const val `WDSMCS_E_CLIENT_DOESNOT_SUPPORT_SECURITY_MODE`: Int = -1054801648;
public const val `WDSMCS_E_CLIENT_NOT_FOUND`: Int = -1054801660;
public const val `WDSMCS_E_CONTENT_NOT_FOUND`: Int = -1054801661;
public const val `WDSMCS_E_CONTENT_PROVIDER_NOT_FOUND`: Int = -1054801658;
public const val `WDSMCS_E_INCOMPATIBLE_VERSION`: Int = -1054801662;
public const val `WDSMCS_E_NAMESPACE_ALREADY_EXISTS`: Int = -1054801657;
public const val `WDSMCS_E_NAMESPACE_ALREADY_STARTED`: Int = -1054801655;
public const val `WDSMCS_E_NAMESPACE_NOT_FOUND`: Int = -1054801659;
public const val `WDSMCS_E_NAMESPACE_SHUTDOWN_IN_PROGRESS`: Int = -1054801656;
public const val `WDSMCS_E_NS_START_FAILED_NO_CLIENTS`: Int = -1054801654;
public const val `WDSMCS_E_PACKET_HAS_SECURITY`: Int = -1054801650;
public const val `WDSMCS_E_PACKET_NOT_CHECKSUMED`: Int = -1054801649;
public const val `WDSMCS_E_PACKET_NOT_HASHED`: Int = -1054801652;
public const val `WDSMCS_E_PACKET_NOT_SIGNED`: Int = -1054801651;
public const val `WDSMCS_E_REQCALLBACKS_NOT_REG`: Int = -1054801663;
public const val `WDSMCS_E_SESSION_SHUTDOWN_IN_PROGRESS`: Int = -1054801664;
public const val `WDSMCS_E_START_TIME_IN_PAST`: Int = -1054801653;
public const val `WDSTPC_E_ALREADY_COMPLETED`: Int = -1054735615;
public const val `WDSTPC_E_ALREADY_IN_LOWEST_SESSION`: Int = -1054735606;
public const val `WDSTPC_E_ALREADY_IN_PROGRESS`: Int = -1054735614;
public const val `WDSTPC_E_CALLBACKS_NOT_REG`: Int = -1054735616;
public const val `WDSTPC_E_CLIENT_DEMOTE_NOT_SUPPORTED`: Int = -1054735605;
public const val `WDSTPC_E_KICKED_FAIL`: Int = -1054735609;
public const val `WDSTPC_E_KICKED_FALLBACK`: Int = -1054735610;
public const val `WDSTPC_E_KICKED_POLICY_NOT_MET`: Int = -1054735611;
public const val `WDSTPC_E_KICKED_UNKNOWN`: Int = -1054735608;
public const val `WDSTPC_E_MULTISTREAM_NOT_ENABLED`: Int = -1054735607;
public const val `WDSTPC_E_NOT_INITIALIZED`: Int = -1054735612;
public const val `WDSTPC_E_NO_IP4_INTERFACE`: Int = -1054735604;
public const val `WDSTPC_E_UNKNOWN_ERROR`: Int = -1054735613;
public const val `WDSTPTC_E_WIM_APPLY_REQUIRES_REFERENCE_IMAGE`: Int = -1054735603;
public const val `WDSTPTMGMT_CATEGORY`: Int = 1;
public const val `WDSTPTMGMT_E_CANNOT_REFRESH_DIRTY_OBJECT`: Int = -1055915761;
public const val `WDSTPTMGMT_E_CANNOT_REINITIALIZE_OBJECT`: Int = -1055915767;
public const val `WDSTPTMGMT_E_CONTENT_PROVIDER_ALREADY_REGISTERED`: Int = -1055915773;
public const val `WDSTPTMGMT_E_CONTENT_PROVIDER_NOT_REGISTERED`: Int = -1055915772;
public const val `WDSTPTMGMT_E_INVALID_AUTO_DISCONNECT_THRESHOLD`: Int = -1055915748;
public const val `WDSTPTMGMT_E_INVALID_CLASS`: Int = -1055915774;
public const val `WDSTPTMGMT_E_INVALID_CONTENT_PROVIDER_NAME`: Int = -1055915771;
public const val `WDSTPTMGMT_E_INVALID_DIAGNOSTICS_COMPONENTS`: Int = -1055915762;
public const val `WDSTPTMGMT_E_INVALID_IPV4_MULTICAST_ADDRESS`: Int = -1055915753;
public const val `WDSTPTMGMT_E_INVALID_IPV6_MULTICAST_ADDRESS`: Int = -1055915752;
public const val `WDSTPTMGMT_E_INVALID_IPV6_MULTICAST_ADDRESS_SOURCE`: Int = -1055915750;
public const val `WDSTPTMGMT_E_INVALID_IP_ADDRESS`: Int = -1055915754;
public const val `WDSTPTMGMT_E_INVALID_MULTISTREAM_STREAM_COUNT`: Int = -1055915749;
public const val `WDSTPTMGMT_E_INVALID_NAMESPACE_DATA`: Int = -1055915765;
public const val `WDSTPTMGMT_E_INVALID_NAMESPACE_NAME`: Int = -1055915766;
public const val `WDSTPTMGMT_E_INVALID_NAMESPACE_START_PARAMETERS`: Int = -1055915758;
public const val `WDSTPTMGMT_E_INVALID_NAMESPACE_START_TIME`: Int = -1055915763;
public const val `WDSTPTMGMT_E_INVALID_OPERATION`: Int = -1055915775;
public const val `WDSTPTMGMT_E_INVALID_PROPERTY`: Int = -1055915776;
public const val `WDSTPTMGMT_E_INVALID_SERVICE_IP_ADDRESS_RANGE`: Int = -1055915760;
public const val `WDSTPTMGMT_E_INVALID_SERVICE_PORT_RANGE`: Int = -1055915759;
public const val `WDSTPTMGMT_E_INVALID_SLOW_CLIENT_HANDLING_TYPE`: Int = -1055915746;
public const val `WDSTPTMGMT_E_INVALID_TFTP_MAX_BLOCKSIZE`: Int = -1055915741;
public const val `WDSTPTMGMT_E_IPV6_NOT_SUPPORTED`: Int = -1055915751;
public const val `WDSTPTMGMT_E_MULTICAST_SESSION_POLICY_NOT_SUPPORTED`: Int = -1055915747;
public const val `WDSTPTMGMT_E_NAMESPACE_ALREADY_REGISTERED`: Int = -1055915769;
public const val `WDSTPTMGMT_E_NAMESPACE_NOT_ON_SERVER`: Int = -1055915756;
public const val `WDSTPTMGMT_E_NAMESPACE_NOT_REGISTERED`: Int = -1055915768;
public const val `WDSTPTMGMT_E_NAMESPACE_READ_ONLY`: Int = -1055915764;
public const val `WDSTPTMGMT_E_NAMESPACE_REMOVED_FROM_SERVER`: Int = -1055915755;
public const val `WDSTPTMGMT_E_NETWORK_PROFILES_NOT_SUPPORTED`: Int = -1055915745;
public const val `WDSTPTMGMT_E_TFTP_MAX_BLOCKSIZE_NOT_SUPPORTED`: Int = -1055915743;
public const val `WDSTPTMGMT_E_TFTP_VAR_WINDOW_NOT_SUPPORTED`: Int = -1055915742;
public const val `WDSTPTMGMT_E_TRANSPORT_SERVER_ROLE_NOT_CONFIGURED`: Int = -1055915770;
public const val `WDSTPTMGMT_E_TRANSPORT_SERVER_UNAVAILABLE`: Int = -1055915757;
public const val `WDSTPTMGMT_E_UDP_PORT_POLICY_NOT_SUPPORTED`: Int = -1055915744;
public typealias `WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS` = Int;
public typealias `WDSTRANSPORT_DISCONNECT_TYPE` = Int;
public typealias `WDSTRANSPORT_FEATURE_FLAGS` = Int;
public typealias `WDSTRANSPORT_IP_ADDRESS_SOURCE_TYPE` = Int;
public typealias `WDSTRANSPORT_IP_ADDRESS_TYPE` = Int;
public typealias `WDSTRANSPORT_NAMESPACE_TYPE` = Int;
public typealias `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = Int;
public typealias `WDSTRANSPORT_PROTOCOL_FLAGS` = Int;
public const val `WDSTRANSPORT_RESOURCE_UTILIZATION_UNKNOWN`: UInt = 255u;
public typealias `WDSTRANSPORT_SERVICE_NOTIFICATION` = Int;
public typealias `WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE` = Int;
public typealias `WDSTRANSPORT_TFTP_CAPABILITY` = Int;
public typealias `WDSTRANSPORT_UDP_PORT_POLICY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WDS_CLI_CRED` (
    public var `pwszUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszDomain`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszPassword`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDS_CLI_CRED`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WDS_CLI_CRED`.Companion.`default`() : `WDS_CLI_CRED` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WDS_CLI_FIRMWARE_BIOS`: `WDS_CLI_FIRMWARE_TYPE` = 1;
public const val `WDS_CLI_FIRMWARE_EFI`: `WDS_CLI_FIRMWARE_TYPE` = 2;
public typealias `WDS_CLI_FIRMWARE_TYPE` = Int;
public const val `WDS_CLI_FIRMWARE_UNKNOWN`: `WDS_CLI_FIRMWARE_TYPE` = 0;
public const val `WDS_CLI_IMAGE_PARAM_SPARSE_FILE`: `WDS_CLI_IMAGE_PARAM_TYPE` = 1;
public const val `WDS_CLI_IMAGE_PARAM_SUPPORTED_FIRMWARES`: `WDS_CLI_IMAGE_PARAM_TYPE` = 2;
public typealias `WDS_CLI_IMAGE_PARAM_TYPE` = Int;
public const val `WDS_CLI_IMAGE_PARAM_UNKNOWN`: `WDS_CLI_IMAGE_PARAM_TYPE` = 0;
public typealias `WDS_CLI_IMAGE_TYPE` = Int;
public const val `WDS_CLI_IMAGE_TYPE_UNKNOWN`: `WDS_CLI_IMAGE_TYPE` = 0;
public const val `WDS_CLI_IMAGE_TYPE_VHD`: `WDS_CLI_IMAGE_TYPE` = 2;
public const val `WDS_CLI_IMAGE_TYPE_VHDX`: `WDS_CLI_IMAGE_TYPE` = 3;
public const val `WDS_CLI_IMAGE_TYPE_WIM`: `WDS_CLI_IMAGE_TYPE` = 1;
public const val `WDS_CLI_MSG_COMPLETE`: `PFN_WDS_CLI_CALLBACK_MESSAGE_ID` = 1u;
public const val `WDS_CLI_MSG_PROGRESS`: `PFN_WDS_CLI_CALLBACK_MESSAGE_ID` = 2u;
public const val `WDS_CLI_MSG_START`: `PFN_WDS_CLI_CALLBACK_MESSAGE_ID` = 0u;
public const val `WDS_CLI_MSG_TEXT`: `PFN_WDS_CLI_CALLBACK_MESSAGE_ID` = 3u;
public const val `WDS_CLI_NO_SPARSE_FILE`: UInt = 2u;
public const val `WDS_CLI_TRANSFER_ASYNCHRONOUS`: UInt = 1u;
public const val `WDS_LOG_LEVEL_DISABLED`: Int = 0;
public const val `WDS_LOG_LEVEL_ERROR`: Int = 1;
public const val `WDS_LOG_LEVEL_INFO`: Int = 3;
public const val `WDS_LOG_LEVEL_WARNING`: Int = 2;
public const val `WDS_LOG_TYPE_CLIENT_APPLY_FINISHED`: Int = 6;
public const val `WDS_LOG_TYPE_CLIENT_APPLY_FINISHED_2`: Int = 16;
public const val `WDS_LOG_TYPE_CLIENT_APPLY_STARTED`: Int = 5;
public const val `WDS_LOG_TYPE_CLIENT_APPLY_STARTED_2`: Int = 15;
public const val `WDS_LOG_TYPE_CLIENT_DOMAINJOINERROR`: Int = 12;
public const val `WDS_LOG_TYPE_CLIENT_DOMAINJOINERROR_2`: Int = 17;
public const val `WDS_LOG_TYPE_CLIENT_DRIVER_PACKAGE_NOT_ACCESSIBLE`: Int = 18;
public const val `WDS_LOG_TYPE_CLIENT_ERROR`: Int = 1;
public const val `WDS_LOG_TYPE_CLIENT_FINISHED`: Int = 3;
public const val `WDS_LOG_TYPE_CLIENT_GENERIC_MESSAGE`: Int = 7;
public const val `WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED`: Int = 4;
public const val `WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED2`: Int = 22;
public const val `WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED3`: Int = 23;
public const val `WDS_LOG_TYPE_CLIENT_MAX_CODE`: Int = 24;
public const val `WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_END`: Int = 20;
public const val `WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_FAILURE`: Int = 21;
public const val `WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_START`: Int = 19;
public const val `WDS_LOG_TYPE_CLIENT_POST_ACTIONS_END`: Int = 14;
public const val `WDS_LOG_TYPE_CLIENT_POST_ACTIONS_START`: Int = 13;
public const val `WDS_LOG_TYPE_CLIENT_STARTED`: Int = 2;
public const val `WDS_LOG_TYPE_CLIENT_TRANSFER_DOWNGRADE`: Int = 11;
public const val `WDS_LOG_TYPE_CLIENT_TRANSFER_END`: Int = 10;
public const val `WDS_LOG_TYPE_CLIENT_TRANSFER_START`: Int = 9;
public const val `WDS_LOG_TYPE_CLIENT_UNATTEND_MODE`: Int = 8;
public const val `WDS_MC_TRACE_ERROR`: UInt = 524288u;
public const val `WDS_MC_TRACE_FATAL`: UInt = 1048576u;
public const val `WDS_MC_TRACE_INFO`: UInt = 131072u;
public const val `WDS_MC_TRACE_VERBOSE`: UInt = 65536u;
public const val `WDS_MC_TRACE_WARNING`: UInt = 262144u;
public const val `WDS_TRANSPORTCLIENT_AUTH`: `WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WDS_TRANSPORTCLIENT_CALLBACKS` (
    public var `SessionStart`: `PFN_WdsTransportClientSessionStart`,
    public var `SessionStartEx`: `PFN_WdsTransportClientSessionStartEx`,
    public var `ReceiveContents`: `PFN_WdsTransportClientReceiveContents`,
    public var `ReceiveMetadata`: `PFN_WdsTransportClientReceiveMetadata`,
    public var `SessionComplete`: `PFN_WdsTransportClientSessionComplete`,
    public var `SessionNegotiate`: `PFN_WdsTransportClientSessionNegotiate`,
)
public const val `WDS_TRANSPORTCLIENT_CURRENT_API_VERSION`: UInt = 1u;
public const val `WDS_TRANSPORTCLIENT_MAX_CALLBACKS`: `TRANSPORTCLIENT_CALLBACK_ID` = 6;
public const val `WDS_TRANSPORTCLIENT_NO_AUTH`: `WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL` = 2u;
public const val `WDS_TRANSPORTCLIENT_NO_CACHE`: UInt = 0u;
public const val `WDS_TRANSPORTCLIENT_PROTOCOL_MULTICAST`: UInt = 1u;
public const val `WDS_TRANSPORTCLIENT_RECEIVE_CONTENTS`: `TRANSPORTCLIENT_CALLBACK_ID` = 1;
public const val `WDS_TRANSPORTCLIENT_RECEIVE_METADATA`: `TRANSPORTCLIENT_CALLBACK_ID` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WDS_TRANSPORTCLIENT_REQUEST` (
    public var `ulLength`: UInt,
    public var `ulApiVersion`: UInt,
    public var `ulAuthLevel`: `WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL`,
    public var `pwszServer`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszNamespace`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszObjectName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ulCacheSize`: UInt,
    public var `ulProtocol`: UInt,
    public var `pvProtocolData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulProtocolDataLength`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDS_TRANSPORTCLIENT_REQUEST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WDS_TRANSPORTCLIENT_REQUEST`.Companion.`default`() : `WDS_TRANSPORTCLIENT_REQUEST` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL` = UInt;
public const val `WDS_TRANSPORTCLIENT_SESSION_COMPLETE`: `TRANSPORTCLIENT_CALLBACK_ID` = 2;
public const val `WDS_TRANSPORTCLIENT_SESSION_NEGOTIATE`: `TRANSPORTCLIENT_CALLBACK_ID` = 5;
public const val `WDS_TRANSPORTCLIENT_SESSION_START`: `TRANSPORTCLIENT_CALLBACK_ID` = 0;
public const val `WDS_TRANSPORTCLIENT_SESSION_STARTEX`: `TRANSPORTCLIENT_CALLBACK_ID` = 4;
public const val `WDS_TRANSPORTCLIENT_STATUS_FAILURE`: UInt = 3u;
public const val `WDS_TRANSPORTCLIENT_STATUS_IN_PROGRESS`: UInt = 1u;
public const val `WDS_TRANSPORTCLIENT_STATUS_SUCCESS`: UInt = 2u;
public const val `WDS_TRANSPORTPROVIDER_CLOSE_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 6;
public const val `WDS_TRANSPORTPROVIDER_CLOSE_INSTANCE`: `TRANSPORTPROVIDER_CALLBACK_ID` = 7;
public const val `WDS_TRANSPORTPROVIDER_COMPARE_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 1;
public const val `WDS_TRANSPORTPROVIDER_CREATE_INSTANCE`: `TRANSPORTPROVIDER_CALLBACK_ID` = 0;
public const val `WDS_TRANSPORTPROVIDER_DUMP_STATE`: `TRANSPORTPROVIDER_CALLBACK_ID` = 9;
public const val `WDS_TRANSPORTPROVIDER_GET_CONTENT_METADATA`: `TRANSPORTPROVIDER_CALLBACK_ID` = 11;
public const val `WDS_TRANSPORTPROVIDER_GET_CONTENT_SIZE`: `TRANSPORTPROVIDER_CALLBACK_ID` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WDS_TRANSPORTPROVIDER_INIT_PARAMS` (
    public var `ulLength`: UInt,
    public var `ulMcServerVersion`: UInt,
    public var `hRegistryKey`: `super`.`Registry`.`HKEY`,
    public var `hProvider`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDS_TRANSPORTPROVIDER_INIT_PARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]

    public fun `WDS_TRANSPORTPROVIDER_INIT_PARAMS`.Companion.`default`() : `WDS_TRANSPORTPROVIDER_INIT_PARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WDS_TRANSPORTPROVIDER_MAX_CALLBACKS`: `TRANSPORTPROVIDER_CALLBACK_ID` = 12;
public const val `WDS_TRANSPORTPROVIDER_OPEN_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 2;
public const val `WDS_TRANSPORTPROVIDER_READ_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 5;
public const val `WDS_TRANSPORTPROVIDER_REFRESH_SETTINGS`: `TRANSPORTPROVIDER_CALLBACK_ID` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WDS_TRANSPORTPROVIDER_SETTINGS` (
    public var `ulLength`: UInt,
    public var `ulProviderVersion`: UInt,
)
public const val `WDS_TRANSPORTPROVIDER_SHUTDOWN`: `TRANSPORTPROVIDER_CALLBACK_ID` = 8;
public const val `WDS_TRANSPORTPROVIDER_USER_ACCESS_CHECK`: `TRANSPORTPROVIDER_CALLBACK_ID` = 3;
public const val `WdsCliFlagEnumFilterFirmware`: Int = 2;
public const val `WdsCliFlagEnumFilterVersion`: Int = 1;
public const val `WdsTptDiagnosticsComponentImageServer`: `WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS` = 4;
public const val `WdsTptDiagnosticsComponentMulticast`: `WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS` = 8;
public const val `WdsTptDiagnosticsComponentPxe`: `WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS` = 1;
public const val `WdsTptDiagnosticsComponentTftp`: `WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS` = 2;
public const val `WdsTptDisconnectAbort`: `WDSTRANSPORT_DISCONNECT_TYPE` = 2;
public const val `WdsTptDisconnectFallback`: `WDSTRANSPORT_DISCONNECT_TYPE` = 1;
public const val `WdsTptDisconnectUnknown`: `WDSTRANSPORT_DISCONNECT_TYPE` = 0;
public const val `WdsTptFeatureAdminPack`: `WDSTRANSPORT_FEATURE_FLAGS` = 1;
public const val `WdsTptFeatureDeploymentServer`: `WDSTRANSPORT_FEATURE_FLAGS` = 4;
public const val `WdsTptFeatureTransportServer`: `WDSTRANSPORT_FEATURE_FLAGS` = 2;
public const val `WdsTptIpAddressIpv4`: `WDSTRANSPORT_IP_ADDRESS_TYPE` = 1;
public const val `WdsTptIpAddressIpv6`: `WDSTRANSPORT_IP_ADDRESS_TYPE` = 2;
public const val `WdsTptIpAddressSourceDhcp`: `WDSTRANSPORT_IP_ADDRESS_SOURCE_TYPE` = 1;
public const val `WdsTptIpAddressSourceRange`: `WDSTRANSPORT_IP_ADDRESS_SOURCE_TYPE` = 2;
public const val `WdsTptIpAddressSourceUnknown`: `WDSTRANSPORT_IP_ADDRESS_SOURCE_TYPE` = 0;
public const val `WdsTptIpAddressUnknown`: `WDSTRANSPORT_IP_ADDRESS_TYPE` = 0;
public const val `WdsTptNamespaceTypeAutoCast`: `WDSTRANSPORT_NAMESPACE_TYPE` = 1;
public const val `WdsTptNamespaceTypeScheduledCastAutoStart`: `WDSTRANSPORT_NAMESPACE_TYPE` = 3;
public const val `WdsTptNamespaceTypeScheduledCastManualStart`: `WDSTRANSPORT_NAMESPACE_TYPE` = 2;
public const val `WdsTptNamespaceTypeUnknown`: `WDSTRANSPORT_NAMESPACE_TYPE` = 0;
public const val `WdsTptNetworkProfile100Mbps`: `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = 3;
public const val `WdsTptNetworkProfile10Mbps`: `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = 2;
public const val `WdsTptNetworkProfile1Gbps`: `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = 4;
public const val `WdsTptNetworkProfileCustom`: `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = 1;
public const val `WdsTptNetworkProfileUnknown`: `WDSTRANSPORT_NETWORK_PROFILE_TYPE` = 0;
public const val `WdsTptProtocolMulticast`: `WDSTRANSPORT_PROTOCOL_FLAGS` = 2;
public const val `WdsTptProtocolUnicast`: `WDSTRANSPORT_PROTOCOL_FLAGS` = 1;
public const val `WdsTptServiceNotifyReadSettings`: `WDSTRANSPORT_SERVICE_NOTIFICATION` = 1;
public const val `WdsTptServiceNotifyUnknown`: `WDSTRANSPORT_SERVICE_NOTIFICATION` = 0;
public const val `WdsTptSlowClientHandlingAutoDisconnect`: `WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE` = 2;
public const val `WdsTptSlowClientHandlingMultistream`: `WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE` = 3;
public const val `WdsTptSlowClientHandlingNone`: `WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE` = 1;
public const val `WdsTptSlowClientHandlingUnknown`: `WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE` = 0;
public const val `WdsTptTftpCapMaximumBlockSize`: `WDSTRANSPORT_TFTP_CAPABILITY` = 1;
public const val `WdsTptTftpCapVariableWindow`: `WDSTRANSPORT_TFTP_CAPABILITY` = 2;
public const val `WdsTptUdpPortPolicyDynamic`: `WDSTRANSPORT_UDP_PORT_POLICY` = 0;
public const val `WdsTptUdpPortPolicyFixed`: `WDSTRANSPORT_UDP_PORT_POLICY` = 1;
// UNSUPPORTED Rust 616:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportCacheable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70590b16_f146_46bd_bd9d_4aaa90084bf5);

// UNSUPPORTED Rust 617:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportClient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66d2c5e9_0ff6_49ec_9733_dafb1e01df1c);

// UNSUPPORTED Rust 618:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7f18b09_391e_436e_b10b_c3ef46f2c34f);

// UNSUPPORTED Rust 619:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportConfigurationManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8743f674_904c_47ca_8512_35fe98f6b0ac);

// UNSUPPORTED Rust 620:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportContent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a891fe7_4a3f_4c65_b6f2_1467619679ea);

// UNSUPPORTED Rust 621:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportContentProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0be741f_5a75_4eb9_8a2d_5e189b45f327);

// UNSUPPORTED Rust 622:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportDiagnosticsPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb3333e1_a7ad_46f5_80d6_6b740204e509);

// UNSUPPORTED Rust 623:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf21523f6_837c_4a58_af99_8a7e27f8ff59);

// UNSUPPORTED Rust 624:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportMulticastSessionPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c6bc3f4_6418_472a_b6f1_52d457195437);

// UNSUPPORTED Rust 625:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespace: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8385768_0732_4ec1_95ea_16da581908a1);

// UNSUPPORTED Rust 626:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespaceAutoCast: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb091f5a8_6a99_478d_b23b_09e8fee04574);

// UNSUPPORTED Rust 627:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespaceManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf08cdb63_85de_4a28_a1a9_5ca3e7efda73);

// UNSUPPORTED Rust 628:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespaceScheduledCast: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbadc1897_7025_44eb_9108_fb61c4055792);

// UNSUPPORTED Rust 629:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespaceScheduledCastAutoStart: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1107052_122c_4b81_9b7c_386e6855383f);

// UNSUPPORTED Rust 630:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportNamespaceScheduledCastManualStart: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3e1a2aa_caac_460e_b98a_47f9f318a1fa);

// UNSUPPORTED Rust 631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea19b643_4adf_4413_942c_14f379118760);

// UNSUPPORTED Rust 632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportServicePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65aceadc_2f0b_4f43_9f4d_811865d8cead);

// UNSUPPORTED Rust 633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x749ac4e0_67bc_4743_bfe5_cacb1f26f57f);

// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportSetupManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7beeaad_9f04_4923_9f0c_fbf52bc7590f);

// UNSUPPORTED Rust 635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportTftpClient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50343925_7c5c_4c8c_96c4_ad9fa5005fba);

// UNSUPPORTED Rust 636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WdsTransportTftpManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8e9dca2_3241_4e4d_b806_bc74019dfeda);

