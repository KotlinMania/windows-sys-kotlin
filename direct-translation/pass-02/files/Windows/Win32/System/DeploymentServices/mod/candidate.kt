// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeAsyncRecvDone(hclientrequest : super::super::Foundation:: HANDLE, action : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpAppendOption(preplypacket : *mut core::ffi::c_void, umaxreplypacketlen : u32, pureplypacketlen : *mut u32, boption : u8, boptionlen : u8, pvalue : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpAppendOptionRaw(preplypacket : *mut core::ffi::c_void, umaxreplypacketlen : u32, pureplypacketlen : *mut u32, ubufferlen : u16, pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpGetOptionValue(ppacket : *const core::ffi::c_void, upacketlen : u32, uinstance : u32, boption : u8, pboptionlen : *mut u8, ppoptionvalue : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpGetVendorOptionValue(ppacket : *const core::ffi::c_void, upacketlen : u32, boption : u8, uinstance : u32, pboptionlen : *mut u8, ppoptionvalue : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpInitialize(precvpacket : *const core::ffi::c_void, urecvpacketlen : u32, preplypacket : *mut core::ffi::c_void, umaxreplypacketlen : u32, pureplypacketlen : *mut u32) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpIsValid(ppacket : *const core::ffi::c_void, upacketlen : u32, brequestpacket : windows_sys::core::BOOL, pbpxeoptionpresent : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6AppendOption(preply : *mut core::ffi::c_void, cbreply : u32, pcbreplyused : *mut u32, woptiontype : u16, cboption : u16, poption : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6AppendOptionRaw(preply : *mut core::ffi::c_void, cbreply : u32, pcbreplyused : *mut u32, cbbuffer : u16, pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6CreateRelayRepl(prelaymessages : *const PXE_DHCPV6_NESTED_RELAY_MESSAGE, nrelaymessages : u32, pinnerpacket : *const u8, cbinnerpacket : u32, preplybuffer : *mut core::ffi::c_void, cbreplybuffer : u32, pcbreplybuffer : *mut u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6GetOptionValue(ppacket : *const core::ffi::c_void, upacketlen : u32, uinstance : u32, woption : u16, pwoptionlen : *mut u16, ppoptionvalue : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6GetVendorOptionValue(ppacket : *const core::ffi::c_void, upacketlen : u32, dwenterprisenumber : u32, woption : u16, uinstance : u32, pwoptionlen : *mut u16, ppoptionvalue : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6Initialize(prequest : *const core::ffi::c_void, cbrequest : u32, preply : *mut core::ffi::c_void, cbreply : u32, pcbreplyused : *mut u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6IsValid(ppacket : *const core::ffi::c_void, upacketlen : u32, brequestpacket : windows_sys::core::BOOL, pbpxeoptionpresent : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeDhcpv6ParseRelayForw(prelayforwpacket : *const core::ffi::c_void, urelayforwpacketlen : u32, prelaymessages : *mut PXE_DHCPV6_NESTED_RELAY_MESSAGE, nrelaymessages : u32, pnrelaymessages : *mut u32, ppinnerpacket : *mut *mut u8, pcbinnerpacket : *mut u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeGetServerInfo(uinfotype : u32, pbuffer : *mut core::ffi::c_void, ubufferlen : u32) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeGetServerInfoEx(uinfotype : u32, pbuffer : *mut core::ffi::c_void, ubufferlen : u32, pubufferused : *mut u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxePacketAllocate(hprovider : super::super::Foundation:: HANDLE, hclientrequest : super::super::Foundation:: HANDLE, usize : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxePacketFree(hprovider : super::super::Foundation:: HANDLE, hclientrequest : super::super::Foundation:: HANDLE, ppacket : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderEnumClose(henum : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderEnumFirst(phenum : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderEnumNext(henum : super::super::Foundation:: HANDLE, ppprovider : *mut *mut PXE_PROVIDER) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderFreeInfo(pprovider : *const PXE_PROVIDER) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderQueryIndex(pszprovidername : windows_sys::core::PCWSTR, puindex : *mut u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderRegister(pszprovidername : windows_sys::core::PCWSTR, pszmodulepath : windows_sys::core::PCWSTR, index : u32, biscritical : windows_sys::core::BOOL, phproviderkey : *mut super::Registry:: HKEY) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderSetAttribute(hprovider : super::super::Foundation:: HANDLE, attribute : u32, pparameterbuffer : *const core::ffi::c_void, uparamlen : u32) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeProviderUnRegister(pszprovidername : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeRegisterCallback(hprovider : super::super::Foundation:: HANDLE, callbacktype : u32, pcallbackfunction : *const core::ffi::c_void, pcontext : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeSendReply(hclientrequest : super::super::Foundation:: HANDLE, ppacket : *const core::ffi::c_void, upacketlen : u32, paddress : *const PXE_ADDRESS) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "C" fn PxeTrace(hprovider : super::super::Foundation:: HANDLE, severity : u32, pszformat : windows_sys::core::PCWSTR, ...) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wdspxe.dll" "system" fn PxeTraceV(hprovider : super::super::Foundation:: HANDLE, severity : u32, pszformat : windows_sys::core::PCWSTR, params : *const i8) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpAddOption(hhandle : super::super::Foundation:: HANDLE, uoption : u32, uvaluelen : u32, pvalue : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpCloseHandle(hhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpGetOptionBuffer(hhandle : super::super::Foundation:: HANDLE, ubufferlen : u32, pbuffer : *mut core::ffi::c_void, pubytes : *mut u32) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpInitialize(bpackettype : u8, phhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpParseInitialize(ppacket : *const core::ffi::c_void, upacketlen : u32, pbpackettype : *mut u8, phhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpParseInitializev6(ppacket : *const core::ffi::c_void, upacketlen : u32, pbpackettype : *mut u8, phhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wdsbp.dll" "system" fn WdsBpQueryOption(hhandle : super::super::Foundation:: HANDLE, uoption : u32, uvaluelen : u32, pvalue : *mut core::ffi::c_void, pubytes : *mut u32) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliAuthorizeSession(hsession : super::super::Foundation:: HANDLE, pcred : *const WDS_CLI_CRED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliCancelTransfer(htransfer : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliClose(handle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliCreateSession(pwszserver : windows_sys::core::PCWSTR, pcred : *const WDS_CLI_CRED, phsession : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliFindFirstImage(hsession : super::super::Foundation:: HANDLE, phfindhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliFindNextImage(handle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliFreeStringArray(ppwszarray : *mut windows_sys::core::PWSTR, ulcount : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetDriverQueryXml(pwszwindirpath : windows_sys::core::PCWSTR, ppwszdriverquery : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetEnumerationFlags(handle : super::super::Foundation:: HANDLE, pdwflags : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageArchitecture(hifh : super::super::Foundation:: HANDLE, pdwvalue : *mut CPU_ARCHITECTURE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageDescription(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageFiles(hifh : super::super::Foundation:: HANDLE, pppwszfiles : *mut *mut windows_sys::core::PWSTR, pdwcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageGroup(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageHalName(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageHandleFromFindHandle(findhandle : super::super::Foundation:: HANDLE, phimagehandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageHandleFromTransferHandle(htransfer : super::super::Foundation:: HANDLE, phimagehandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageIndex(hifh : super::super::Foundation:: HANDLE, pdwvalue : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageLanguage(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageLanguages(hifh : super::super::Foundation:: HANDLE, pppszvalues : *mut *mut *mut i8, pdwnumvalues : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageLastModifiedTime(hifh : super::super::Foundation:: HANDLE, ppsystimevalue : *mut *mut super::super::Foundation:: SYSTEMTIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageName(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageNamespace(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageParameter(hifh : super::super::Foundation:: HANDLE, paramtype : WDS_CLI_IMAGE_PARAM_TYPE, presponse : *mut core::ffi::c_void, uresponselen : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImagePath(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageSize(hifh : super::super::Foundation:: HANDLE, pullvalue : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageType(hifh : super::super::Foundation:: HANDLE, pimagetype : *mut WDS_CLI_IMAGE_TYPE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetImageVersion(hifh : super::super::Foundation:: HANDLE, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliGetTransferSize(hifh : super::super::Foundation:: HANDLE, pullvalue : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliInitializeLog(hsession : super::super::Foundation:: HANDLE, ulclientarchitecture : CPU_ARCHITECTURE, pwszclientid : windows_sys::core::PCWSTR, pwszclientaddress : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "C" fn WdsCliLog(hsession : super::super::Foundation:: HANDLE, ulloglevel : u32, ulmessagecode : u32, ...) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliObtainDriverPackages(himage : super::super::Foundation:: HANDLE, ppwszservername : *mut windows_sys::core::PWSTR, pppwszdriverpackages : *mut *mut windows_sys::core::PWSTR, pulcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliObtainDriverPackagesEx(hsession : super::super::Foundation:: HANDLE, pwszmachineinfo : windows_sys::core::PCWSTR, ppwszservername : *mut windows_sys::core::PWSTR, pppwszdriverpackages : *mut *mut windows_sys::core::PWSTR, pulcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliRegisterTrace(pfn : PFN_WdsCliTraceFunction) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliSetTransferBufferSize(ulsizeinbytes : u32));

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliTransferFile(pwszserver : windows_sys::core::PCWSTR, pwsznamespace : windows_sys::core::PCWSTR, pwszremotefilepath : windows_sys::core::PCWSTR, pwszlocalfilepath : windows_sys::core::PCWSTR, dwflags : u32, dwreserved : u32, pfnwdsclicallback : PFN_WdsCliCallback, pvuserdata : *const core::ffi::c_void, phtransfer : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliTransferImage(himage : super::super::Foundation:: HANDLE, pwszlocalpath : windows_sys::core::PCWSTR, dwflags : u32, dwreserved : u32, pfnwdsclicallback : PFN_WdsCliCallback, pvuserdata : *const core::ffi::c_void, phtransfer : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("wdsclientapi.dll" "system" fn WdsCliWaitForTransfer(htransfer : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientAddRefBuffer(pvbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientCancelSession(hsessionkey : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientCancelSessionEx(hsessionkey : super::super::Foundation:: HANDLE, dwerrorcode : u32) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientCloseSession(hsessionkey : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientCompleteReceive(hsessionkey : super::super::Foundation:: HANDLE, ulsize : u32, pulloffset : *const u64) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientInitialize() -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientInitializeSession(psessionrequest : *const WDS_TRANSPORTCLIENT_REQUEST, pcallerdata : *const core::ffi::c_void, hsessionkey : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientQueryStatus(hsessionkey : super::super::Foundation:: HANDLE, pustatus : *mut u32, puerrorcode : *mut u32) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientRegisterCallback(hsessionkey : super::super::Foundation:: HANDLE, callbackid : TRANSPORTCLIENT_CALLBACK_ID, pfncallback : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientReleaseBuffer(pvbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientShutdown() -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientStartSession(hsessionkey : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("wdstptc.dll" "system" fn WdsTransportClientWaitForCompletion(hsessionkey : super::super::Foundation:: HANDLE, utimeout : u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "system" fn WdsTransportServerAllocateBuffer(hprovider : super::super::Foundation:: HANDLE, ulbuffersize : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "system" fn WdsTransportServerCompleteRead(hprovider : super::super::Foundation:: HANDLE, ulbytesread : u32, pvuserdata : *const core::ffi::c_void, hreadresult : windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "system" fn WdsTransportServerFreeBuffer(hprovider : super::super::Foundation:: HANDLE, pvbuffer : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "system" fn WdsTransportServerRegisterCallback(hprovider : super::super::Foundation:: HANDLE, callbackid : TRANSPORTPROVIDER_CALLBACK_ID, pfncallback : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "C" fn WdsTransportServerTrace(hprovider : super::super::Foundation:: HANDLE, severity : u32, pwszformat : windows_sys::core::PCWSTR, ...) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("wdsmc.dll" "system" fn WdsTransportServerTraceV(hprovider : super::super::Foundation:: HANDLE, severity : u32, pwszformat : windows_sys::core::PCWSTR, params : *const i8) -> windows_sys::core::HRESULT);

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
// UNSUPPORTED Rust 125:1: generic scalar type unsupported
// pub type PFN_WdsCliCallback = Option<unsafe extern "system" fn(dwmessageid: PFN_WDS_CLI_CALLBACK_MESSAGE_ID, wparam: super::super::Foundation::WPARAM, lparam: super::super::Foundation::LPARAM, pvuserdata: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 126:1: generic scalar type unsupported
// pub type PFN_WdsCliTraceFunction = Option<unsafe extern "system" fn(pwszformat: windows_sys::core::PCWSTR, params: *const i8)>;

// UNSUPPORTED Rust 127:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientReceiveContents = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, pcontents: *const core::ffi::c_void, ulsize: u32, pullcontentoffset: *const u64)>;

// UNSUPPORTED Rust 128:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientReceiveMetadata = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, pmetadata: *const core::ffi::c_void, ulsize: u32)>;

// UNSUPPORTED Rust 129:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientSessionComplete = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, dwerror: u32)>;

// UNSUPPORTED Rust 130:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientSessionNegotiate = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, pinfo: *const TRANSPORTCLIENT_SESSION_INFO, hnegotiatekey: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 131:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientSessionStart = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, ullfilesize: *const u64)>;

// UNSUPPORTED Rust 132:1: generic scalar type unsupported
// pub type PFN_WdsTransportClientSessionStartEx = Option<unsafe extern "system" fn(hsessionkey: super::super::Foundation::HANDLE, pcallerdata: *const core::ffi::c_void, info: *const TRANSPORTCLIENT_SESSION_INFO)>;

// UNSUPPORTED Rust 133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PXE_ADDRESS {
//     pub uFlags: u32,
//     pub Anonymous: PXE_ADDRESS_0,
//     pub uAddrLen: u32,
//     pub uPort: u16,
// }

// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule
// impl Default for PXE_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 146:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PXE_ADDRESS_0 {
//     pub bAddress: [u8; 16],
//     pub uIpAddress: u32,
// }

// UNSUPPORTED Rust 152:1: declaration Impl has no candidate rule
// impl Default for PXE_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
// UNSUPPORTED Rust 170:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCPV6_MESSAGE {
//     pub MessageType: u8,
//     pub TransactionIDByte1: u8,
//     pub TransactionIDByte2: u8,
//     pub TransactionIDByte3: u8,
//     pub Options: [PXE_DHCPV6_OPTION; 1],
// }

// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCPV6_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 184:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCPV6_MESSAGE_HEADER {
//     pub MessageType: u8,
//     pub Message: [u8; 1],
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCPV6_MESSAGE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCPV6_NESTED_RELAY_MESSAGE {
//     pub pRelayMessage: *mut PXE_DHCPV6_RELAY_MESSAGE,
//     pub cbRelayMessage: u32,
//     pub pInterfaceIdOption: *mut core::ffi::c_void,
//     pub cbInterfaceIdOption: u16,
// }

// UNSUPPORTED Rust 203:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCPV6_NESTED_RELAY_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 208:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCPV6_OPTION {
//     pub OptionCode: u16,
//     pub DataLength: u16,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 215:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCPV6_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PXE_DHCPV6_RELAY_HOP_COUNT_LIMIT`: UInt = 32u;
// UNSUPPORTED Rust 221:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCPV6_RELAY_MESSAGE {
//     pub MessageType: u8,
//     pub HopCount: u8,
//     pub LinkAddress: [u8; 16],
//     pub PeerAddress: [u8; 16],
//     pub Options: [PXE_DHCPV6_OPTION; 1],
// }

// UNSUPPORTED Rust 230:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCPV6_RELAY_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PXE_DHCPV6_SERVER_PORT`: UInt = 547u;
public const val `PXE_DHCP_CLIENT_PORT`: UInt = 68u;
public const val `PXE_DHCP_FILE_SIZE`: UInt = 128u;
public const val `PXE_DHCP_HWAADR_SIZE`: UInt = 16u;
public const val `PXE_DHCP_MAGIC_COOKIE_SIZE`: UInt = 4u;
// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCP_MESSAGE {
//     pub Operation: u8,
//     pub HardwareAddressType: u8,
//     pub HardwareAddressLength: u8,
//     pub HopCount: u8,
//     pub TransactionID: u32,
//     pub SecondsSinceBoot: u16,
//     pub Reserved: u16,
//     pub ClientIpAddress: u32,
//     pub YourIpAddress: u32,
//     pub BootstrapServerAddress: u32,
//     pub RelayAgentIpAddress: u32,
//     pub HardwareAddress: [u8; 16],
//     pub HostName: [u8; 64],
//     pub BootFileName: [u8; 128],
//     pub Anonymous: PXE_DHCP_MESSAGE_0,
//     pub Option: PXE_DHCP_OPTION,
// }

// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCP_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 265:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union PXE_DHCP_MESSAGE_0 {
//     pub bMagicCookie: [u8; 4],
//     pub uMagicCookie: u32,
// }

// UNSUPPORTED Rust 271:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCP_MESSAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 276:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PXE_DHCP_OPTION {
//     pub OptionType: u8,
//     pub OptionLength: u8,
//     pub OptionValue: [u8; 1],
// }

// UNSUPPORTED Rust 283:1: declaration Impl has no candidate rule
// impl Default for PXE_DHCP_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PXE_DHCP_SERVER_PORT`: UInt = 67u;
public const val `PXE_DHCP_SERVER_SIZE`: UInt = 64u;
public const val `PXE_GSI_SERVER_DUID`: UInt = 2u;
public const val `PXE_GSI_TRACE_ENABLED`: UInt = 1u;
public const val `PXE_MAX_ADDRESS`: UInt = 16u;
// UNSUPPORTED Rust 293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PXE_PROVIDER {
//     pub uSizeOfStruct: u32,
//     pub pwszName: windows_sys::core::PWSTR,
//     pub pwszFilePath: windows_sys::core::PWSTR,
//     pub bIsCritical: windows_sys::core::BOOL,
//     pub uIndex: u32,
// }

// UNSUPPORTED Rust 302:1: declaration Impl has no candidate rule
// impl Default for PXE_PROVIDER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
// UNSUPPORTED Rust 322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRANSPORTCLIENT_SESSION_INFO {
//     pub ulStructureLength: u32,
//     pub ullFileSize: u64,
//     pub ulBlockSize: u32,
// }

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
// UNSUPPORTED Rust 434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDS_CLI_CRED {
//     pub pwszUserName: windows_sys::core::PCWSTR,
//     pub pwszDomain: windows_sys::core::PCWSTR,
//     pub pwszPassword: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule
// impl Default for WDS_CLI_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
// UNSUPPORTED Rust 499:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WDS_TRANSPORTCLIENT_CALLBACKS {
//     pub SessionStart: PFN_WdsTransportClientSessionStart,
//     pub SessionStartEx: PFN_WdsTransportClientSessionStartEx,
//     pub ReceiveContents: PFN_WdsTransportClientReceiveContents,
//     pub ReceiveMetadata: PFN_WdsTransportClientReceiveMetadata,
//     pub SessionComplete: PFN_WdsTransportClientSessionComplete,
//     pub SessionNegotiate: PFN_WdsTransportClientSessionNegotiate,
// }

public const val `WDS_TRANSPORTCLIENT_CURRENT_API_VERSION`: UInt = 1u;
public const val `WDS_TRANSPORTCLIENT_MAX_CALLBACKS`: `TRANSPORTCLIENT_CALLBACK_ID` = 6;
public const val `WDS_TRANSPORTCLIENT_NO_AUTH`: `WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL` = 2u;
public const val `WDS_TRANSPORTCLIENT_NO_CACHE`: UInt = 0u;
public const val `WDS_TRANSPORTCLIENT_PROTOCOL_MULTICAST`: UInt = 1u;
public const val `WDS_TRANSPORTCLIENT_RECEIVE_CONTENTS`: `TRANSPORTCLIENT_CALLBACK_ID` = 1;
public const val `WDS_TRANSPORTCLIENT_RECEIVE_METADATA`: `TRANSPORTCLIENT_CALLBACK_ID` = 3;
// UNSUPPORTED Rust 516:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDS_TRANSPORTCLIENT_REQUEST {
//     pub ulLength: u32,
//     pub ulApiVersion: u32,
//     pub ulAuthLevel: WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL,
//     pub pwszServer: windows_sys::core::PCWSTR,
//     pub pwszNamespace: windows_sys::core::PCWSTR,
//     pub pwszObjectName: windows_sys::core::PCWSTR,
//     pub ulCacheSize: u32,
//     pub ulProtocol: u32,
//     pub pvProtocolData: *mut core::ffi::c_void,
//     pub ulProtocolDataLength: u32,
// }

// UNSUPPORTED Rust 530:1: declaration Impl has no candidate rule
// impl Default for WDS_TRANSPORTCLIENT_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
// UNSUPPORTED Rust 550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct WDS_TRANSPORTPROVIDER_INIT_PARAMS {
//     pub ulLength: u32,
//     pub ulMcServerVersion: u32,
//     pub hRegistryKey: super::Registry::HKEY,
//     pub hProvider: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 559:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for WDS_TRANSPORTPROVIDER_INIT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WDS_TRANSPORTPROVIDER_MAX_CALLBACKS`: `TRANSPORTPROVIDER_CALLBACK_ID` = 12;
public const val `WDS_TRANSPORTPROVIDER_OPEN_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 2;
public const val `WDS_TRANSPORTPROVIDER_READ_CONTENT`: `TRANSPORTPROVIDER_CALLBACK_ID` = 5;
public const val `WDS_TRANSPORTPROVIDER_REFRESH_SETTINGS`: `TRANSPORTPROVIDER_CALLBACK_ID` = 10;
// UNSUPPORTED Rust 569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WDS_TRANSPORTPROVIDER_SETTINGS {
//     pub ulLength: u32,
//     pub ulProviderVersion: u32,
// }

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
// UNSUPPORTED Rust 616:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportCacheable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70590b16_f146_46bd_bd9d_4aaa90084bf5);

// UNSUPPORTED Rust 617:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportClient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66d2c5e9_0ff6_49ec_9733_dafb1e01df1c);

// UNSUPPORTED Rust 618:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7f18b09_391e_436e_b10b_c3ef46f2c34f);

// UNSUPPORTED Rust 619:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportConfigurationManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8743f674_904c_47ca_8512_35fe98f6b0ac);

// UNSUPPORTED Rust 620:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportContent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a891fe7_4a3f_4c65_b6f2_1467619679ea);

// UNSUPPORTED Rust 621:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportContentProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0be741f_5a75_4eb9_8a2d_5e189b45f327);

// UNSUPPORTED Rust 622:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportDiagnosticsPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb3333e1_a7ad_46f5_80d6_6b740204e509);

// UNSUPPORTED Rust 623:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf21523f6_837c_4a58_af99_8a7e27f8ff59);

// UNSUPPORTED Rust 624:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportMulticastSessionPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c6bc3f4_6418_472a_b6f1_52d457195437);

// UNSUPPORTED Rust 625:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespace: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8385768_0732_4ec1_95ea_16da581908a1);

// UNSUPPORTED Rust 626:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespaceAutoCast: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb091f5a8_6a99_478d_b23b_09e8fee04574);

// UNSUPPORTED Rust 627:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespaceManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf08cdb63_85de_4a28_a1a9_5ca3e7efda73);

// UNSUPPORTED Rust 628:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespaceScheduledCast: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbadc1897_7025_44eb_9108_fb61c4055792);

// UNSUPPORTED Rust 629:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespaceScheduledCastAutoStart: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1107052_122c_4b81_9b7c_386e6855383f);

// UNSUPPORTED Rust 630:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportNamespaceScheduledCastManualStart: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3e1a2aa_caac_460e_b98a_47f9f318a1fa);

// UNSUPPORTED Rust 631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea19b643_4adf_4413_942c_14f379118760);

// UNSUPPORTED Rust 632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportServicePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65aceadc_2f0b_4f43_9f4d_811865d8cead);

// UNSUPPORTED Rust 633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x749ac4e0_67bc_4743_bfe5_cacb1f26f57f);

// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportSetupManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7beeaad_9f04_4923_9f0c_fbf52bc7590f);

// UNSUPPORTED Rust 635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportTftpClient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50343925_7c5c_4c8c_96c4_ad9fa5005fba);

// UNSUPPORTED Rust 636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WdsTransportTftpManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8e9dca2_3241_4e4d_b806_bc74019dfeda);

