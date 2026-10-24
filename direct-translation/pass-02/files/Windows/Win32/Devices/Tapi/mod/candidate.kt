// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn GetTnefStreamCodepage(lpstream : * mut core::ffi::c_void, lpulcodepage : *mut u32, lpulsubcodepage : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
// windows_link::link!("mapi32.dll" "system" fn OpenTnefStream(lpvsupport : *mut core::ffi::c_void, lpstream : * mut core::ffi::c_void, lpszstreamname : *const i8, ulflags : u32, lpmessage : * mut core::ffi::c_void, wkeyval : u16, lpptnef : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
// windows_link::link!("mapi32.dll" "system" fn OpenTnefStreamEx(lpvsupport : *mut core::ffi::c_void, lpstream : * mut core::ffi::c_void, lpszstreamname : *const i8, ulflags : u32, lpmessage : * mut core::ffi::c_void, wkeyval : u16, lpadressbook : * mut core::ffi::c_void, lpptnef : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAccept(hcall : u32, lpsuseruserinfo : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAddProvider(lpszproviderfilename : windows_sys::core::PCSTR, hwndowner : super::super::Foundation:: HWND, lpdwpermanentproviderid : *mut u32) -> i32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAddProviderA(lpszproviderfilename : windows_sys::core::PCSTR, hwndowner : super::super::Foundation:: HWND, lpdwpermanentproviderid : *mut u32) -> i32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAddProviderW(lpszproviderfilename : windows_sys::core::PCWSTR, hwndowner : super::super::Foundation:: HWND, lpdwpermanentproviderid : *mut u32) -> i32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAddToConference(hconfcall : u32, hconsultcall : u32) -> i32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAgentSpecific(hline : u32, dwaddressid : u32, dwagentextensionidindex : u32, lpparams : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineAnswer(hcall : u32, lpsuseruserinfo : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineBlindTransfer(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineBlindTransferA(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineBlindTransferW(hcall : u32, lpszdestaddressw : windows_sys::core::PCWSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineClose(hline : u32) -> i32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCompleteCall(hcall : u32, lpdwcompletionid : *mut u32, dwcompletionmode : u32, dwmessageid : u32) -> i32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCompleteTransfer(hcall : u32, hconsultcall : u32, lphconfcall : *mut u32, dwtransfermode : u32) -> i32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialog(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialogA(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialogEdit(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR, lpdeviceconfigin : *const core::ffi::c_void, dwsize : u32, lpdeviceconfigout : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialogEditA(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR, lpdeviceconfigin : *const core::ffi::c_void, dwsize : u32, lpdeviceconfigout : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialogEditW(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCWSTR, lpdeviceconfigin : *const core::ffi::c_void, dwsize : u32, lpdeviceconfigout : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigDialogW(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineConfigProvider(hwndowner : super::super::Foundation:: HWND, dwpermanentproviderid : u32) -> i32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCreateAgentA(hline : u32, lpszagentid : windows_sys::core::PCSTR, lpszagentpin : windows_sys::core::PCSTR, lphagent : *mut u32) -> i32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCreateAgentSessionA(hline : u32, hagent : u32, lpszagentpin : windows_sys::core::PCSTR, dwworkingaddressid : u32, lpgroupid : *mut windows_sys::core::GUID, lphagentsession : *mut u32) -> i32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCreateAgentSessionW(hline : u32, hagent : u32, lpszagentpin : windows_sys::core::PCWSTR, dwworkingaddressid : u32, lpgroupid : *mut windows_sys::core::GUID, lphagentsession : *mut u32) -> i32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineCreateAgentW(hline : u32, lpszagentid : windows_sys::core::PCWSTR, lpszagentpin : windows_sys::core::PCWSTR, lphagent : *mut u32) -> i32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDeallocateCall(hcall : u32) -> i32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDevSpecific(hline : u32, dwaddressid : u32, hcall : u32, lpparams : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDevSpecificFeature(hline : u32, dwfeature : u32, lpparams : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDial(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDialA(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDialW(hcall : u32, lpszdestaddress : windows_sys::core::PCWSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineDrop(hcall : u32, lpsuseruserinfo : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineForward(hline : u32, balladdresses : u32, dwaddressid : u32, lpforwardlist : *const LINEFORWARDLIST, dwnumringsnoanswer : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineForwardA(hline : u32, balladdresses : u32, dwaddressid : u32, lpforwardlist : *const LINEFORWARDLIST, dwnumringsnoanswer : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineForwardW(hline : u32, balladdresses : u32, dwaddressid : u32, lpforwardlist : *const LINEFORWARDLIST, dwnumringsnoanswer : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGatherDigits(hcall : u32, dwdigitmodes : u32, lpsdigits : windows_sys::core::PSTR, dwnumdigits : u32, lpszterminationdigits : windows_sys::core::PCSTR, dwfirstdigittimeout : u32, dwinterdigittimeout : u32) -> i32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGatherDigitsA(hcall : u32, dwdigitmodes : u32, lpsdigits : windows_sys::core::PSTR, dwnumdigits : u32, lpszterminationdigits : windows_sys::core::PCSTR, dwfirstdigittimeout : u32, dwinterdigittimeout : u32) -> i32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGatherDigitsW(hcall : u32, dwdigitmodes : u32, lpsdigits : windows_sys::core::PWSTR, dwnumdigits : u32, lpszterminationdigits : windows_sys::core::PCWSTR, dwfirstdigittimeout : u32, dwinterdigittimeout : u32) -> i32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGenerateDigits(hcall : u32, dwdigitmode : u32, lpszdigits : windows_sys::core::PCSTR, dwduration : u32) -> i32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGenerateDigitsA(hcall : u32, dwdigitmode : u32, lpszdigits : windows_sys::core::PCSTR, dwduration : u32) -> i32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGenerateDigitsW(hcall : u32, dwdigitmode : u32, lpszdigits : windows_sys::core::PCWSTR, dwduration : u32) -> i32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGenerateTone(hcall : u32, dwtonemode : u32, dwduration : u32, dwnumtones : u32, lptones : *const LINEGENERATETONE) -> i32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressCaps(hlineapp : u32, dwdeviceid : u32, dwaddressid : u32, dwapiversion : u32, dwextversion : u32, lpaddresscaps : *mut LINEADDRESSCAPS) -> i32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressCapsA(hlineapp : u32, dwdeviceid : u32, dwaddressid : u32, dwapiversion : u32, dwextversion : u32, lpaddresscaps : *mut LINEADDRESSCAPS) -> i32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressCapsW(hlineapp : u32, dwdeviceid : u32, dwaddressid : u32, dwapiversion : u32, dwextversion : u32, lpaddresscaps : *mut LINEADDRESSCAPS) -> i32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressID(hline : u32, lpdwaddressid : *mut u32, dwaddressmode : u32, lpsaddress : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressIDA(hline : u32, lpdwaddressid : *mut u32, dwaddressmode : u32, lpsaddress : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressIDW(hline : u32, lpdwaddressid : *mut u32, dwaddressmode : u32, lpsaddress : windows_sys::core::PCWSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressStatus(hline : u32, dwaddressid : u32, lpaddressstatus : *mut LINEADDRESSSTATUS) -> i32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressStatusA(hline : u32, dwaddressid : u32, lpaddressstatus : *mut LINEADDRESSSTATUS) -> i32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAddressStatusW(hline : u32, dwaddressid : u32, lpaddressstatus : *mut LINEADDRESSSTATUS) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentActivityListA(hline : u32, dwaddressid : u32, lpagentactivitylist : *mut LINEAGENTACTIVITYLIST) -> i32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentActivityListW(hline : u32, dwaddressid : u32, lpagentactivitylist : *mut LINEAGENTACTIVITYLIST) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentCapsA(hlineapp : u32, dwdeviceid : u32, dwaddressid : u32, dwappapiversion : u32, lpagentcaps : *mut LINEAGENTCAPS) -> i32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentCapsW(hlineapp : u32, dwdeviceid : u32, dwaddressid : u32, dwappapiversion : u32, lpagentcaps : *mut LINEAGENTCAPS) -> i32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentGroupListA(hline : u32, dwaddressid : u32, lpagentgrouplist : *mut LINEAGENTGROUPLIST) -> i32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentGroupListW(hline : u32, dwaddressid : u32, lpagentgrouplist : *mut LINEAGENTGROUPLIST) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentInfo(hline : u32, hagent : u32, lpagentinfo : *mut LINEAGENTINFO) -> i32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentSessionInfo(hline : u32, hagentsession : u32, lpagentsessioninfo : *mut LINEAGENTSESSIONINFO) -> i32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentSessionList(hline : u32, hagent : u32, lpagentsessionlist : *mut LINEAGENTSESSIONLIST) -> i32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentStatusA(hline : u32, dwaddressid : u32, lpagentstatus : *mut LINEAGENTSTATUS) -> i32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAgentStatusW(hline : u32, dwaddressid : u32, lpagentstatus : *mut LINEAGENTSTATUS) -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAppPriority(lpszappfilename : windows_sys::core::PCSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpextensionname : *mut VARSTRING, lpdwpriority : *mut u32) -> i32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAppPriorityA(lpszappfilename : windows_sys::core::PCSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpextensionname : *mut VARSTRING, lpdwpriority : *mut u32) -> i32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetAppPriorityW(lpszappfilename : windows_sys::core::PCWSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpextensionname : *mut VARSTRING, lpdwpriority : *mut u32) -> i32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCallInfo(hcall : u32, lpcallinfo : *mut LINECALLINFO) -> i32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCallInfoA(hcall : u32, lpcallinfo : *mut LINECALLINFO) -> i32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCallInfoW(hcall : u32, lpcallinfo : *mut LINECALLINFO) -> i32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCallStatus(hcall : u32, lpcallstatus : *mut LINECALLSTATUS) -> i32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetConfRelatedCalls(hcall : u32, lpcalllist : *mut LINECALLLIST) -> i32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCountry(dwcountryid : u32, dwapiversion : u32, lplinecountrylist : *mut LINECOUNTRYLIST) -> i32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCountryA(dwcountryid : u32, dwapiversion : u32, lplinecountrylist : *mut LINECOUNTRYLIST) -> i32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetCountryW(dwcountryid : u32, dwapiversion : u32, lplinecountrylist : *mut LINECOUNTRYLIST) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevCaps(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lplinedevcaps : *mut LINEDEVCAPS) -> i32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevCapsA(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lplinedevcaps : *mut LINEDEVCAPS) -> i32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevCapsW(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lplinedevcaps : *mut LINEDEVCAPS) -> i32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevConfig(dwdeviceid : u32, lpdeviceconfig : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevConfigA(dwdeviceid : u32, lpdeviceconfig : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetDevConfigW(dwdeviceid : u32, lpdeviceconfig : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetGroupListA(hline : u32, lpgrouplist : *mut LINEAGENTGROUPLIST) -> i32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetGroupListW(hline : u32, lpgrouplist : *mut LINEAGENTGROUPLIST) -> i32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetID(hline : u32, dwaddressid : u32, hcall : u32, dwselect : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetIDA(hline : u32, dwaddressid : u32, hcall : u32, dwselect : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetIDW(hline : u32, dwaddressid : u32, hcall : u32, dwselect : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn lineGetIcon(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn lineGetIconA(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn lineGetIconW(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCWSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetLineDevStatus(hline : u32, lplinedevstatus : *mut LINEDEVSTATUS) -> i32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetLineDevStatusA(hline : u32, lplinedevstatus : *mut LINEDEVSTATUS) -> i32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetLineDevStatusW(hline : u32, lplinedevstatus : *mut LINEDEVSTATUS) -> i32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetMessage(hlineapp : u32, lpmessage : *mut LINEMESSAGE, dwtimeout : u32) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetNewCalls(hline : u32, dwaddressid : u32, dwselect : u32, lpcalllist : *mut LINECALLLIST) -> i32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetNumRings(hline : u32, dwaddressid : u32, lpdwnumrings : *mut u32) -> i32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetProviderList(dwapiversion : u32, lpproviderlist : *mut LINEPROVIDERLIST) -> i32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetProviderListA(dwapiversion : u32, lpproviderlist : *mut LINEPROVIDERLIST) -> i32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetProviderListW(dwapiversion : u32, lpproviderlist : *mut LINEPROVIDERLIST) -> i32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetProxyStatus(hlineapp : u32, dwdeviceid : u32, dwappapiversion : u32, lplineproxyreqestlist : *mut LINEPROXYREQUESTLIST) -> i32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetQueueInfo(hline : u32, dwqueueid : u32, lplinequeueinfo : *mut LINEQUEUEINFO) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetQueueListA(hline : u32, lpgroupid : *mut windows_sys::core::GUID, lpqueuelist : *mut LINEQUEUELIST) -> i32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetQueueListW(hline : u32, lpgroupid : *mut windows_sys::core::GUID, lpqueuelist : *mut LINEQUEUELIST) -> i32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetRequest(hlineapp : u32, dwrequestmode : u32, lprequestbuffer : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetRequestA(hlineapp : u32, dwrequestmode : u32, lprequestbuffer : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetRequestW(hlineapp : u32, dwrequestmode : u32, lprequestbuffer : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetStatusMessages(hline : u32, lpdwlinestates : *mut u32, lpdwaddressstates : *mut u32) -> i32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetTranslateCaps(hlineapp : u32, dwapiversion : u32, lptranslatecaps : *mut LINETRANSLATECAPS) -> i32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetTranslateCapsA(hlineapp : u32, dwapiversion : u32, lptranslatecaps : *mut LINETRANSLATECAPS) -> i32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineGetTranslateCapsW(hlineapp : u32, dwapiversion : u32, lptranslatecaps : *mut LINETRANSLATECAPS) -> i32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineHandoff(hcall : u32, lpszfilename : windows_sys::core::PCSTR, dwmediamode : u32) -> i32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineHandoffA(hcall : u32, lpszfilename : windows_sys::core::PCSTR, dwmediamode : u32) -> i32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineHandoffW(hcall : u32, lpszfilename : windows_sys::core::PCWSTR, dwmediamode : u32) -> i32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineHold(hcall : u32) -> i32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineInitialize(lphlineapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : LINECALLBACK, lpszappname : windows_sys::core::PCSTR, lpdwnumdevs : *mut u32) -> i32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineInitializeExA(lphlineapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : LINECALLBACK, lpszfriendlyappname : windows_sys::core::PCSTR, lpdwnumdevs : *mut u32, lpdwapiversion : *mut u32, lplineinitializeexparams : *mut LINEINITIALIZEEXPARAMS) -> i32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineInitializeExW(lphlineapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : LINECALLBACK, lpszfriendlyappname : windows_sys::core::PCWSTR, lpdwnumdevs : *mut u32, lpdwapiversion : *mut u32, lplineinitializeexparams : *mut LINEINITIALIZEEXPARAMS) -> i32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMakeCall(hline : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMakeCallA(hline : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMakeCallW(hline : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCWSTR, dwcountrycode : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMonitorDigits(hcall : u32, dwdigitmodes : u32) -> i32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMonitorMedia(hcall : u32, dwmediamodes : u32) -> i32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineMonitorTones(hcall : u32, lptonelist : *const LINEMONITORTONE, dwnumentries : u32) -> i32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineNegotiateAPIVersion(hlineapp : u32, dwdeviceid : u32, dwapilowversion : u32, dwapihighversion : u32, lpdwapiversion : *mut u32, lpextensionid : *mut LINEEXTENSIONID) -> i32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineNegotiateExtVersion(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextlowversion : u32, dwexthighversion : u32, lpdwextversion : *mut u32) -> i32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineOpen(hlineapp : u32, dwdeviceid : u32, lphline : *mut u32, dwapiversion : u32, dwextversion : u32, dwcallbackinstance : usize, dwprivileges : u32, dwmediamodes : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineOpenA(hlineapp : u32, dwdeviceid : u32, lphline : *mut u32, dwapiversion : u32, dwextversion : u32, dwcallbackinstance : usize, dwprivileges : u32, dwmediamodes : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineOpenW(hlineapp : u32, dwdeviceid : u32, lphline : *mut u32, dwapiversion : u32, dwextversion : u32, dwcallbackinstance : usize, dwprivileges : u32, dwmediamodes : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePark(hcall : u32, dwparkmode : u32, lpszdiraddress : windows_sys::core::PCSTR, lpnondiraddress : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineParkA(hcall : u32, dwparkmode : u32, lpszdiraddress : windows_sys::core::PCSTR, lpnondiraddress : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineParkW(hcall : u32, dwparkmode : u32, lpszdiraddress : windows_sys::core::PCWSTR, lpnondiraddress : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePickup(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR, lpszgroupid : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePickupA(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR, lpszgroupid : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePickupW(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCWSTR, lpszgroupid : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePrepareAddToConference(hconfcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePrepareAddToConferenceA(hconfcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn linePrepareAddToConferenceW(hconfcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineProxyMessage(hline : u32, hcall : u32, dwmsg : u32, dwparam1 : u32, dwparam2 : u32, dwparam3 : u32) -> i32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("tapi32.dll" "system" fn lineProxyResponse(hline : u32, lpproxyrequest : *mut LINEPROXYREQUEST, dwresult : u32) -> i32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRedirect(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRedirectA(hcall : u32, lpszdestaddress : windows_sys::core::PCSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRedirectW(hcall : u32, lpszdestaddress : windows_sys::core::PCWSTR, dwcountrycode : u32) -> i32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRegisterRequestRecipient(hlineapp : u32, dwregistrationinstance : u32, dwrequestmode : u32, benable : u32) -> i32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineReleaseUserUserInfo(hcall : u32) -> i32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRemoveFromConference(hcall : u32) -> i32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineRemoveProvider(dwpermanentproviderid : u32, hwndowner : super::super::Foundation:: HWND) -> i32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSecureCall(hcall : u32) -> i32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSendUserUserInfo(hcall : u32, lpsuseruserinfo : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentActivity(hline : u32, dwaddressid : u32, dwactivityid : u32) -> i32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentGroup(hline : u32, dwaddressid : u32, lpagentgrouplist : *mut LINEAGENTGROUPLIST) -> i32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentMeasurementPeriod(hline : u32, hagent : u32, dwmeasurementperiod : u32) -> i32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentSessionState(hline : u32, hagentsession : u32, dwagentsessionstate : u32, dwnextagentsessionstate : u32) -> i32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentState(hline : u32, dwaddressid : u32, dwagentstate : u32, dwnextagentstate : u32) -> i32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAgentStateEx(hline : u32, hagent : u32, dwagentstate : u32, dwnextagentstate : u32) -> i32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAppPriority(lpszappfilename : windows_sys::core::PCSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpszextensionname : windows_sys::core::PCSTR, dwpriority : u32) -> i32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAppPriorityA(lpszappfilename : windows_sys::core::PCSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpszextensionname : windows_sys::core::PCSTR, dwpriority : u32) -> i32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAppPriorityW(lpszappfilename : windows_sys::core::PCWSTR, dwmediamode : u32, lpextensionid : *mut LINEEXTENSIONID, dwrequestmode : u32, lpszextensionname : windows_sys::core::PCWSTR, dwpriority : u32) -> i32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetAppSpecific(hcall : u32, dwappspecific : u32) -> i32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCallData(hcall : u32, lpcalldata : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCallParams(hcall : u32, dwbearermode : u32, dwminrate : u32, dwmaxrate : u32, lpdialparams : *const LINEDIALPARAMS) -> i32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCallPrivilege(hcall : u32, dwcallprivilege : u32) -> i32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCallQualityOfService(hcall : u32, lpsendingflowspec : *mut core::ffi::c_void, dwsendingflowspecsize : u32, lpreceivingflowspec : *mut core::ffi::c_void, dwreceivingflowspecsize : u32) -> i32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCallTreatment(hcall : u32, dwtreatment : u32) -> i32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetCurrentLocation(hlineapp : u32, dwlocation : u32) -> i32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetDevConfig(dwdeviceid : u32, lpdeviceconfig : *const core::ffi::c_void, dwsize : u32, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetDevConfigA(dwdeviceid : u32, lpdeviceconfig : *const core::ffi::c_void, dwsize : u32, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetDevConfigW(dwdeviceid : u32, lpdeviceconfig : *const core::ffi::c_void, dwsize : u32, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetLineDevStatus(hline : u32, dwstatustochange : u32, fstatus : u32) -> i32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetMediaControl(hline : u32, dwaddressid : u32, hcall : u32, dwselect : u32, lpdigitlist : *const LINEMEDIACONTROLDIGIT, dwdigitnumentries : u32, lpmedialist : *const LINEMEDIACONTROLMEDIA, dwmedianumentries : u32, lptonelist : *const LINEMEDIACONTROLTONE, dwtonenumentries : u32, lpcallstatelist : *const LINEMEDIACONTROLCALLSTATE, dwcallstatenumentries : u32) -> i32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetMediaMode(hcall : u32, dwmediamodes : u32) -> i32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetNumRings(hline : u32, dwaddressid : u32, dwnumrings : u32) -> i32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetQueueMeasurementPeriod(hline : u32, dwqueueid : u32, dwmeasurementperiod : u32) -> i32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetStatusMessages(hline : u32, dwlinestates : u32, dwaddressstates : u32) -> i32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetTerminal(hline : u32, dwaddressid : u32, hcall : u32, dwselect : u32, dwterminalmodes : u32, dwterminalid : u32, benable : u32) -> i32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetTollList(hlineapp : u32, dwdeviceid : u32, lpszaddressin : windows_sys::core::PCSTR, dwtolllistoption : u32) -> i32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetTollListA(hlineapp : u32, dwdeviceid : u32, lpszaddressin : windows_sys::core::PCSTR, dwtolllistoption : u32) -> i32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetTollListW(hlineapp : u32, dwdeviceid : u32, lpszaddressinw : windows_sys::core::PCWSTR, dwtolllistoption : u32) -> i32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupConference(hcall : u32, hline : u32, lphconfcall : *mut u32, lphconsultcall : *mut u32, dwnumparties : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupConferenceA(hcall : u32, hline : u32, lphconfcall : *mut u32, lphconsultcall : *mut u32, dwnumparties : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupConferenceW(hcall : u32, hline : u32, lphconfcall : *mut u32, lphconsultcall : *mut u32, dwnumparties : u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupTransfer(hcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupTransferA(hcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSetupTransferW(hcall : u32, lphconsultcall : *mut u32, lpcallparams : *const LINECALLPARAMS) -> i32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineShutdown(hlineapp : u32) -> i32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineSwapHold(hactivecall : u32, hheldcall : u32) -> i32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateAddress(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, lpszaddressin : windows_sys::core::PCSTR, dwcard : u32, dwtranslateoptions : u32, lptranslateoutput : *mut LINETRANSLATEOUTPUT) -> i32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateAddressA(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, lpszaddressin : windows_sys::core::PCSTR, dwcard : u32, dwtranslateoptions : u32, lptranslateoutput : *mut LINETRANSLATEOUTPUT) -> i32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateAddressW(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, lpszaddressin : windows_sys::core::PCWSTR, dwcard : u32, dwtranslateoptions : u32, lptranslateoutput : *mut LINETRANSLATEOUTPUT) -> i32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateDialog(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, hwndowner : super::super::Foundation:: HWND, lpszaddressin : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateDialogA(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, hwndowner : super::super::Foundation:: HWND, lpszaddressin : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineTranslateDialogW(hlineapp : u32, dwdeviceid : u32, dwapiversion : u32, hwndowner : super::super::Foundation:: HWND, lpszaddressin : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineUncompleteCall(hline : u32, dwcompletionid : u32) -> i32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineUnhold(hcall : u32) -> i32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineUnpark(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineUnparkA(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn lineUnparkW(hline : u32, dwaddressid : u32, lphcall : *mut u32, lpszdestaddress : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneClose(hphone : u32) -> i32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneConfigDialog(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneConfigDialogA(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneConfigDialogW(dwdeviceid : u32, hwndowner : super::super::Foundation:: HWND, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneDevSpecific(hphone : u32, lpparams : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetButtonInfo(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *mut PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetButtonInfoA(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *mut PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetButtonInfoW(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *mut PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetData(hphone : u32, dwdataid : u32, lpdata : *mut core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetDevCaps(hphoneapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lpphonecaps : *mut PHONECAPS) -> i32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetDevCapsA(hphoneapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lpphonecaps : *mut PHONECAPS) -> i32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetDevCapsW(hphoneapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextversion : u32, lpphonecaps : *mut PHONECAPS) -> i32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetDisplay(hphone : u32, lpdisplay : *mut VARSTRING) -> i32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetGain(hphone : u32, dwhookswitchdev : u32, lpdwgain : *mut u32) -> i32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetHookSwitch(hphone : u32, lpdwhookswitchdevs : *mut u32) -> i32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetID(hphone : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetIDA(hphone : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetIDW(hphone : u32, lpdeviceid : *mut VARSTRING, lpszdeviceclass : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn phoneGetIcon(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn phoneGetIconA(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("tapi32.dll" "system" fn phoneGetIconW(dwdeviceid : u32, lpszdeviceclass : windows_sys::core::PCWSTR, lphicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> i32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetLamp(hphone : u32, dwbuttonlampid : u32, lpdwlampmode : *mut u32) -> i32);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetMessage(hphoneapp : u32, lpmessage : *mut PHONEMESSAGE, dwtimeout : u32) -> i32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetRing(hphone : u32, lpdwringmode : *mut u32, lpdwvolume : *mut u32) -> i32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetStatus(hphone : u32, lpphonestatus : *mut PHONESTATUS) -> i32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetStatusA(hphone : u32, lpphonestatus : *mut PHONESTATUS) -> i32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetStatusMessages(hphone : u32, lpdwphonestates : *mut u32, lpdwbuttonmodes : *mut u32, lpdwbuttonstates : *mut u32) -> i32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetStatusW(hphone : u32, lpphonestatus : *mut PHONESTATUS) -> i32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneGetVolume(hphone : u32, dwhookswitchdev : u32, lpdwvolume : *mut u32) -> i32);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneInitialize(lphphoneapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : PHONECALLBACK, lpszappname : windows_sys::core::PCSTR, lpdwnumdevs : *mut u32) -> i32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneInitializeExA(lphphoneapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : PHONECALLBACK, lpszfriendlyappname : windows_sys::core::PCSTR, lpdwnumdevs : *mut u32, lpdwapiversion : *mut u32, lpphoneinitializeexparams : *mut PHONEINITIALIZEEXPARAMS) -> i32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneInitializeExW(lphphoneapp : *mut u32, hinstance : super::super::Foundation:: HINSTANCE, lpfncallback : PHONECALLBACK, lpszfriendlyappname : windows_sys::core::PCWSTR, lpdwnumdevs : *mut u32, lpdwapiversion : *mut u32, lpphoneinitializeexparams : *mut PHONEINITIALIZEEXPARAMS) -> i32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneNegotiateAPIVersion(hphoneapp : u32, dwdeviceid : u32, dwapilowversion : u32, dwapihighversion : u32, lpdwapiversion : *mut u32, lpextensionid : *mut PHONEEXTENSIONID) -> i32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneNegotiateExtVersion(hphoneapp : u32, dwdeviceid : u32, dwapiversion : u32, dwextlowversion : u32, dwexthighversion : u32, lpdwextversion : *mut u32) -> i32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneOpen(hphoneapp : u32, dwdeviceid : u32, lphphone : *mut u32, dwapiversion : u32, dwextversion : u32, dwcallbackinstance : usize, dwprivilege : u32) -> i32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetButtonInfo(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *const PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetButtonInfoA(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *const PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetButtonInfoW(hphone : u32, dwbuttonlampid : u32, lpbuttoninfo : *const PHONEBUTTONINFO) -> i32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetData(hphone : u32, dwdataid : u32, lpdata : *const core::ffi::c_void, dwsize : u32) -> i32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetDisplay(hphone : u32, dwrow : u32, dwcolumn : u32, lpsdisplay : windows_sys::core::PCSTR, dwsize : u32) -> i32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetGain(hphone : u32, dwhookswitchdev : u32, dwgain : u32) -> i32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetHookSwitch(hphone : u32, dwhookswitchdevs : u32, dwhookswitchmode : u32) -> i32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetLamp(hphone : u32, dwbuttonlampid : u32, dwlampmode : u32) -> i32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetRing(hphone : u32, dwringmode : u32, dwvolume : u32) -> i32);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetStatusMessages(hphone : u32, dwphonestates : u32, dwbuttonmodes : u32, dwbuttonstates : u32) -> i32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneSetVolume(hphone : u32, dwhookswitchdev : u32, dwvolume : u32) -> i32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn phoneShutdown(hphoneapp : u32) -> i32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiGetLocationInfo(lpszcountrycode : windows_sys::core::PSTR, lpszcitycode : windows_sys::core::PSTR) -> i32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiGetLocationInfoA(lpszcountrycode : windows_sys::core::PSTR, lpszcitycode : windows_sys::core::PSTR) -> i32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiGetLocationInfoW(lpszcountrycodew : windows_sys::core::PWSTR, lpszcitycodew : windows_sys::core::PWSTR) -> i32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestDrop(hwnd : super::super::Foundation:: HWND, wrequestid : super::super::Foundation:: WPARAM) -> i32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMakeCall(lpszdestaddress : windows_sys::core::PCSTR, lpszappname : windows_sys::core::PCSTR, lpszcalledparty : windows_sys::core::PCSTR, lpszcomment : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMakeCallA(lpszdestaddress : windows_sys::core::PCSTR, lpszappname : windows_sys::core::PCSTR, lpszcalledparty : windows_sys::core::PCSTR, lpszcomment : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMakeCallW(lpszdestaddress : windows_sys::core::PCWSTR, lpszappname : windows_sys::core::PCWSTR, lpszcalledparty : windows_sys::core::PCWSTR, lpszcomment : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMediaCall(hwnd : super::super::Foundation:: HWND, wrequestid : super::super::Foundation:: WPARAM, lpszdeviceclass : windows_sys::core::PCSTR, lpdeviceid : windows_sys::core::PCSTR, dwsize : u32, dwsecure : u32, lpszdestaddress : windows_sys::core::PCSTR, lpszappname : windows_sys::core::PCSTR, lpszcalledparty : windows_sys::core::PCSTR, lpszcomment : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMediaCallA(hwnd : super::super::Foundation:: HWND, wrequestid : super::super::Foundation:: WPARAM, lpszdeviceclass : windows_sys::core::PCSTR, lpdeviceid : windows_sys::core::PCSTR, dwsize : u32, dwsecure : u32, lpszdestaddress : windows_sys::core::PCSTR, lpszappname : windows_sys::core::PCSTR, lpszcalledparty : windows_sys::core::PCSTR, lpszcomment : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("tapi32.dll" "system" fn tapiRequestMediaCallW(hwnd : super::super::Foundation:: HWND, wrequestid : super::super::Foundation:: WPARAM, lpszdeviceclass : windows_sys::core::PCWSTR, lpdeviceid : windows_sys::core::PCWSTR, dwsize : u32, dwsecure : u32, lpszdestaddress : windows_sys::core::PCWSTR, lpszappname : windows_sys::core::PCWSTR, lpszcalledparty : windows_sys::core::PCWSTR, lpszcomment : windows_sys::core::PCWSTR) -> i32);

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
// UNSUPPORTED Rust 325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRALIAS {
//     pub rgchName: [i8; 41],
//     pub rgchEName: [i8; 11],
//     pub rgchSrvr: [i8; 12],
//     pub dibDetail: u32,
//     pub r#type: u16,
// }

// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 379:1: generic scalar type unsupported
// pub type ASYNC_COMPLETION = Option<unsafe extern "system" fn(dwrequestid: u32, lresult: i32)>;

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
// UNSUPPORTED Rust 538:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DTR {
//     pub wYear: u16,
//     pub wMonth: u16,
//     pub wDay: u16,
//     pub wHour: u16,
//     pub wMinute: u16,
//     pub wSecond: u16,
//     pub wDayOfWeek: u16,
// }

public const val `DT_ILS`: `DIRECTORY_TYPE` = 2;
public const val `DT_NTDS`: `DIRECTORY_TYPE` = 1;
// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 564:1: non-scalar type Ptr unsupported
// pub const GETTNEFSTREAMCODEPAGE: windows_sys::core::PCSTR = windows_sys::core::s!("GetTnefStreamCodePage");

// UNSUPPORTED Rust 565:1: non-scalar type Ptr unsupported
// pub type HDRVCALL = *mut core::ffi::c_void;

// UNSUPPORTED Rust 566:1: non-scalar type Ptr unsupported
// pub type HDRVDIALOGINSTANCE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 567:1: non-scalar type Ptr unsupported
// pub type HDRVLINE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 568:1: non-scalar type Ptr unsupported
// pub type HDRVMSPLINE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 569:1: non-scalar type Ptr unsupported
// pub type HDRVPHONE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 570:1: non-scalar type Ptr unsupported
// pub type HPROVIDER = *mut core::ffi::c_void;

// UNSUPPORTED Rust 571:1: non-scalar type Ptr unsupported
// pub type HTAPICALL = *mut core::ffi::c_void;

// UNSUPPORTED Rust 572:1: non-scalar type Ptr unsupported
// pub type HTAPILINE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 573:1: non-scalar type Ptr unsupported
// pub type HTAPIPHONE = *mut core::ffi::c_void;

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
// UNSUPPORTED Rust 634:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEADDRESSCAPS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwLineDeviceID: u32,
//     pub dwAddressSize: u32,
//     pub dwAddressOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwAddressSharing: u32,
//     pub dwAddressStates: u32,
//     pub dwCallInfoStates: u32,
//     pub dwCallerIDFlags: u32,
//     pub dwCalledIDFlags: u32,
//     pub dwConnectedIDFlags: u32,
//     pub dwRedirectionIDFlags: u32,
//     pub dwRedirectingIDFlags: u32,
//     pub dwCallStates: u32,
//     pub dwDialToneModes: u32,
//     pub dwBusyModes: u32,
//     pub dwSpecialInfo: u32,
//     pub dwDisconnectModes: u32,
//     pub dwMaxNumActiveCalls: u32,
//     pub dwMaxNumOnHoldCalls: u32,
//     pub dwMaxNumOnHoldPendingCalls: u32,
//     pub dwMaxNumConference: u32,
//     pub dwMaxNumTransConf: u32,
//     pub dwAddrCapFlags: u32,
//     pub dwCallFeatures: u32,
//     pub dwRemoveFromConfCaps: u32,
//     pub dwRemoveFromConfState: u32,
//     pub dwTransferModes: u32,
//     pub dwParkModes: u32,
//     pub dwForwardModes: u32,
//     pub dwMaxForwardEntries: u32,
//     pub dwMaxSpecificEntries: u32,
//     pub dwMinFwdNumRings: u32,
//     pub dwMaxFwdNumRings: u32,
//     pub dwMaxCallCompletions: u32,
//     pub dwCallCompletionConds: u32,
//     pub dwCallCompletionModes: u32,
//     pub dwNumCompletionMessages: u32,
//     pub dwCompletionMsgTextEntrySize: u32,
//     pub dwCompletionMsgTextSize: u32,
//     pub dwCompletionMsgTextOffset: u32,
//     pub dwAddressFeatures: u32,
//     pub dwPredictiveAutoTransferStates: u32,
//     pub dwNumCallTreatments: u32,
//     pub dwCallTreatmentListSize: u32,
//     pub dwCallTreatmentListOffset: u32,
//     pub dwDeviceClassesSize: u32,
//     pub dwDeviceClassesOffset: u32,
//     pub dwMaxCallDataSize: u32,
//     pub dwCallFeatures2: u32,
//     pub dwMaxNoAnswerTimeout: u32,
//     pub dwConnectedModes: u32,
//     pub dwOfferingModes: u32,
//     pub dwAvailableMediaModes: u32,
// }

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
// UNSUPPORTED Rust 711:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEADDRESSSTATUS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumInUse: u32,
//     pub dwNumActiveCalls: u32,
//     pub dwNumOnHoldCalls: u32,
//     pub dwNumOnHoldPendCalls: u32,
//     pub dwAddressFeatures: u32,
//     pub dwNumRingsNoAnswer: u32,
//     pub dwForwardNumEntries: u32,
//     pub dwForwardSize: u32,
//     pub dwForwardOffset: u32,
//     pub dwTerminalModesSize: u32,
//     pub dwTerminalModesOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
// }

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
// UNSUPPORTED Rust 750:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTACTIVITYENTRY {
//     pub dwID: u32,
//     pub dwNameSize: u32,
//     pub dwNameOffset: u32,
// }

// UNSUPPORTED Rust 757:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTACTIVITYLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

// UNSUPPORTED Rust 767:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTCAPS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwAgentHandlerInfoSize: u32,
//     pub dwAgentHandlerInfoOffset: u32,
//     pub dwCapsVersion: u32,
//     pub dwFeatures: u32,
//     pub dwStates: u32,
//     pub dwNextStates: u32,
//     pub dwMaxNumGroupEntries: u32,
//     pub dwAgentStatusMessages: u32,
//     pub dwNumAgentExtensionIDs: u32,
//     pub dwAgentExtensionIDListSize: u32,
//     pub dwAgentExtensionIDListOffset: u32,
//     pub ProxyGUID: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 786:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTENTRY {
//     pub hAgent: u32,
//     pub dwNameSize: u32,
//     pub dwNameOffset: u32,
//     pub dwIDSize: u32,
//     pub dwIDOffset: u32,
//     pub dwPINSize: u32,
//     pub dwPINOffset: u32,
// }

public const val `LINEAGENTFEATURE_AGENTSPECIFIC`: UInt = 8u;
public const val `LINEAGENTFEATURE_GETAGENTACTIVITYLIST`: UInt = 16u;
public const val `LINEAGENTFEATURE_GETAGENTGROUP`: UInt = 32u;
public const val `LINEAGENTFEATURE_SETAGENTACTIVITY`: UInt = 4u;
public const val `LINEAGENTFEATURE_SETAGENTGROUP`: UInt = 1u;
public const val `LINEAGENTFEATURE_SETAGENTSTATE`: UInt = 2u;
// UNSUPPORTED Rust 803:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTGROUPENTRY {
//     pub GroupID: LINEAGENTGROUPENTRY_0,
//     pub dwNameSize: u32,
//     pub dwNameOffset: u32,
// }

// UNSUPPORTED Rust 810:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTGROUPENTRY_0 {
//     pub dwGroupID1: u32,
//     pub dwGroupID2: u32,
//     pub dwGroupID3: u32,
//     pub dwGroupID4: u32,
// }

// UNSUPPORTED Rust 818:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTGROUPLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

// UNSUPPORTED Rust 828:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEAGENTINFO {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwAgentState: u32,
//     pub dwNextAgentState: u32,
//     pub dwMeasurementPeriod: u32,
//     pub cyOverallCallRate: super::super::System::Com::CY,
//     pub dwNumberOfACDCalls: u32,
//     pub dwNumberOfIncomingCalls: u32,
//     pub dwNumberOfOutgoingCalls: u32,
//     pub dwTotalACDTalkTime: u32,
//     pub dwTotalACDCallTime: u32,
//     pub dwTotalACDWrapUpTime: u32,
// }

// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEAGENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 852:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

// UNSUPPORTED Rust 862:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTSESSIONENTRY {
//     pub hAgentSession: u32,
//     pub hAgent: u32,
//     pub GroupID: windows_sys::core::GUID,
//     pub dwWorkingAddressID: u32,
// }

// UNSUPPORTED Rust 870:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEAGENTSESSIONINFO {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwAgentSessionState: u32,
//     pub dwNextAgentSessionState: u32,
//     pub dateSessionStartTime: f64,
//     pub dwSessionDuration: u32,
//     pub dwNumberOfCalls: u32,
//     pub dwTotalTalkTime: u32,
//     pub dwAverageTalkTime: u32,
//     pub dwTotalCallTime: u32,
//     pub dwAverageCallTime: u32,
//     pub dwTotalWrapUpTime: u32,
//     pub dwAverageWrapUpTime: u32,
//     pub cyACDCallRate: super::super::System::Com::CY,
//     pub dwLongestTimeToAnswer: u32,
//     pub dwAverageTimeToAnswer: u32,
// }

// UNSUPPORTED Rust 892:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEAGENTSESSIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 898:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTSESSIONLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

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
// UNSUPPORTED Rust 934:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAGENTSTATUS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwGroupListSize: u32,
//     pub dwGroupListOffset: u32,
//     pub dwState: u32,
//     pub dwNextState: u32,
//     pub dwActivityID: u32,
//     pub dwActivitySize: u32,
//     pub dwActivityOffset: u32,
//     pub dwAgentFeatures: u32,
//     pub dwValidStates: u32,
//     pub dwValidNextStates: u32,
// }

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
// UNSUPPORTED Rust 967:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEAPPINFO {
//     pub dwMachineNameSize: u32,
//     pub dwMachineNameOffset: u32,
//     pub dwUserNameSize: u32,
//     pub dwUserNameOffset: u32,
//     pub dwModuleFilenameSize: u32,
//     pub dwModuleFilenameOffset: u32,
//     pub dwFriendlyNameSize: u32,
//     pub dwFriendlyNameOffset: u32,
//     pub dwMediaModes: u32,
//     pub dwAddressID: u32,
// }

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
// UNSUPPORTED Rust 993:1: generic scalar type unsupported
// pub type LINECALLBACK = Option<unsafe extern "system" fn(hdevice: u32, dwmessage: u32, dwinstance: usize, dwparam1: usize, dwparam2: usize, dwparam3: usize)>;

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
// UNSUPPORTED Rust 1045:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECALLINFO {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub hLine: u32,
//     pub dwLineDeviceID: u32,
//     pub dwAddressID: u32,
//     pub dwBearerMode: u32,
//     pub dwRate: u32,
//     pub dwMediaMode: u32,
//     pub dwAppSpecific: u32,
//     pub dwCallID: u32,
//     pub dwRelatedCallID: u32,
//     pub dwCallParamFlags: u32,
//     pub dwCallStates: u32,
//     pub dwMonitorDigitModes: u32,
//     pub dwMonitorMediaModes: u32,
//     pub DialParams: LINEDIALPARAMS,
//     pub dwOrigin: u32,
//     pub dwReason: u32,
//     pub dwCompletionID: u32,
//     pub dwNumOwners: u32,
//     pub dwNumMonitors: u32,
//     pub dwCountryCode: u32,
//     pub dwTrunk: u32,
//     pub dwCallerIDFlags: u32,
//     pub dwCallerIDSize: u32,
//     pub dwCallerIDOffset: u32,
//     pub dwCallerIDNameSize: u32,
//     pub dwCallerIDNameOffset: u32,
//     pub dwCalledIDFlags: u32,
//     pub dwCalledIDSize: u32,
//     pub dwCalledIDOffset: u32,
//     pub dwCalledIDNameSize: u32,
//     pub dwCalledIDNameOffset: u32,
//     pub dwConnectedIDFlags: u32,
//     pub dwConnectedIDSize: u32,
//     pub dwConnectedIDOffset: u32,
//     pub dwConnectedIDNameSize: u32,
//     pub dwConnectedIDNameOffset: u32,
//     pub dwRedirectionIDFlags: u32,
//     pub dwRedirectionIDSize: u32,
//     pub dwRedirectionIDOffset: u32,
//     pub dwRedirectionIDNameSize: u32,
//     pub dwRedirectionIDNameOffset: u32,
//     pub dwRedirectingIDFlags: u32,
//     pub dwRedirectingIDSize: u32,
//     pub dwRedirectingIDOffset: u32,
//     pub dwRedirectingIDNameSize: u32,
//     pub dwRedirectingIDNameOffset: u32,
//     pub dwAppNameSize: u32,
//     pub dwAppNameOffset: u32,
//     pub dwDisplayableAddressSize: u32,
//     pub dwDisplayableAddressOffset: u32,
//     pub dwCalledPartySize: u32,
//     pub dwCalledPartyOffset: u32,
//     pub dwCommentSize: u32,
//     pub dwCommentOffset: u32,
//     pub dwDisplaySize: u32,
//     pub dwDisplayOffset: u32,
//     pub dwUserUserInfoSize: u32,
//     pub dwUserUserInfoOffset: u32,
//     pub dwHighLevelCompSize: u32,
//     pub dwHighLevelCompOffset: u32,
//     pub dwLowLevelCompSize: u32,
//     pub dwLowLevelCompOffset: u32,
//     pub dwChargingInfoSize: u32,
//     pub dwChargingInfoOffset: u32,
//     pub dwTerminalModesSize: u32,
//     pub dwTerminalModesOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwCallTreatment: u32,
//     pub dwCallDataSize: u32,
//     pub dwCallDataOffset: u32,
//     pub dwSendingFlowspecSize: u32,
//     pub dwSendingFlowspecOffset: u32,
//     pub dwReceivingFlowspecSize: u32,
//     pub dwReceivingFlowspecOffset: u32,
// }

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
// UNSUPPORTED Rust 1158:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECALLLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwCallsNumEntries: u32,
//     pub dwCallsSize: u32,
//     pub dwCallsOffset: u32,
// }

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
// UNSUPPORTED Rust 1183:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECALLPARAMS {
//     pub dwTotalSize: u32,
//     pub dwBearerMode: u32,
//     pub dwMinRate: u32,
//     pub dwMaxRate: u32,
//     pub dwMediaMode: u32,
//     pub dwCallParamFlags: u32,
//     pub dwAddressMode: u32,
//     pub dwAddressID: u32,
//     pub DialParams: LINEDIALPARAMS,
//     pub dwOrigAddressSize: u32,
//     pub dwOrigAddressOffset: u32,
//     pub dwDisplayableAddressSize: u32,
//     pub dwDisplayableAddressOffset: u32,
//     pub dwCalledPartySize: u32,
//     pub dwCalledPartyOffset: u32,
//     pub dwCommentSize: u32,
//     pub dwCommentOffset: u32,
//     pub dwUserUserInfoSize: u32,
//     pub dwUserUserInfoOffset: u32,
//     pub dwHighLevelCompSize: u32,
//     pub dwHighLevelCompOffset: u32,
//     pub dwLowLevelCompSize: u32,
//     pub dwLowLevelCompOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwPredictiveAutoTransferStates: u32,
//     pub dwTargetAddressSize: u32,
//     pub dwTargetAddressOffset: u32,
//     pub dwSendingFlowspecSize: u32,
//     pub dwSendingFlowspecOffset: u32,
//     pub dwReceivingFlowspecSize: u32,
//     pub dwReceivingFlowspecOffset: u32,
//     pub dwDeviceClassSize: u32,
//     pub dwDeviceClassOffset: u32,
//     pub dwDeviceConfigSize: u32,
//     pub dwDeviceConfigOffset: u32,
//     pub dwCallDataSize: u32,
//     pub dwCallDataOffset: u32,
//     pub dwNoAnswerTimeout: u32,
//     pub dwCallingPartyIDSize: u32,
//     pub dwCallingPartyIDOffset: u32,
// }

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
// UNSUPPORTED Rust 1275:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECALLSTATUS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwCallState: u32,
//     pub dwCallStateMode: u32,
//     pub dwCallPrivilege: u32,
//     pub dwCallFeatures: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwCallFeatures2: u32,
//     pub tStateEntryTime: super::super::Foundation::SYSTEMTIME,
// }

// UNSUPPORTED Rust 1290:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECALLTREATMENTENTRY {
//     pub dwCallTreatmentID: u32,
//     pub dwCallTreatmentNameSize: u32,
//     pub dwCallTreatmentNameOffset: u32,
// }

public const val `LINECALLTREATMENT_BUSY`: UInt = 3u;
public const val `LINECALLTREATMENT_MUSIC`: UInt = 4u;
public const val `LINECALLTREATMENT_RINGBACK`: UInt = 2u;
public const val `LINECALLTREATMENT_SILENCE`: UInt = 1u;
// UNSUPPORTED Rust 1301:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECARDENTRY {
//     pub dwPermanentCardID: u32,
//     pub dwCardNameSize: u32,
//     pub dwCardNameOffset: u32,
//     pub dwCardNumberDigits: u32,
//     pub dwSameAreaRuleSize: u32,
//     pub dwSameAreaRuleOffset: u32,
//     pub dwLongDistanceRuleSize: u32,
//     pub dwLongDistanceRuleOffset: u32,
//     pub dwInternationalRuleSize: u32,
//     pub dwInternationalRuleOffset: u32,
//     pub dwOptions: u32,
// }

public const val `LINECARDOPTION_HIDDEN`: UInt = 2u;
public const val `LINECARDOPTION_PREDEFINED`: UInt = 1u;
public const val `LINECONNECTEDMODE_ACTIVE`: UInt = 1u;
public const val `LINECONNECTEDMODE_ACTIVEHELD`: UInt = 4u;
public const val `LINECONNECTEDMODE_CONFIRMED`: UInt = 16u;
public const val `LINECONNECTEDMODE_INACTIVE`: UInt = 2u;
public const val `LINECONNECTEDMODE_INACTIVEHELD`: UInt = 8u;
// UNSUPPORTED Rust 1323:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECOUNTRYENTRY {
//     pub dwCountryID: u32,
//     pub dwCountryCode: u32,
//     pub dwNextCountryID: u32,
//     pub dwCountryNameSize: u32,
//     pub dwCountryNameOffset: u32,
//     pub dwSameAreaRuleSize: u32,
//     pub dwSameAreaRuleOffset: u32,
//     pub dwLongDistanceRuleSize: u32,
//     pub dwLongDistanceRuleOffset: u32,
//     pub dwInternationalRuleSize: u32,
//     pub dwInternationalRuleOffset: u32,
// }

// UNSUPPORTED Rust 1338:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINECOUNTRYLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumCountries: u32,
//     pub dwCountryListSize: u32,
//     pub dwCountryListOffset: u32,
// }

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
// UNSUPPORTED Rust 1362:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEDEVCAPS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwProviderInfoSize: u32,
//     pub dwProviderInfoOffset: u32,
//     pub dwSwitchInfoSize: u32,
//     pub dwSwitchInfoOffset: u32,
//     pub dwPermanentLineID: u32,
//     pub dwLineNameSize: u32,
//     pub dwLineNameOffset: u32,
//     pub dwStringFormat: u32,
//     pub dwAddressModes: u32,
//     pub dwNumAddresses: u32,
//     pub dwBearerModes: u32,
//     pub dwMaxRate: u32,
//     pub dwMediaModes: u32,
//     pub dwGenerateToneModes: u32,
//     pub dwGenerateToneMaxNumFreq: u32,
//     pub dwGenerateDigitModes: u32,
//     pub dwMonitorToneMaxNumFreq: u32,
//     pub dwMonitorToneMaxNumEntries: u32,
//     pub dwMonitorDigitModes: u32,
//     pub dwGatherDigitsMinTimeout: u32,
//     pub dwGatherDigitsMaxTimeout: u32,
//     pub dwMedCtlDigitMaxListSize: u32,
//     pub dwMedCtlMediaMaxListSize: u32,
//     pub dwMedCtlToneMaxListSize: u32,
//     pub dwMedCtlCallStateMaxListSize: u32,
//     pub dwDevCapFlags: u32,
//     pub dwMaxNumActiveCalls: u32,
//     pub dwAnswerMode: u32,
//     pub dwRingModes: u32,
//     pub dwLineStates: u32,
//     pub dwUUIAcceptSize: u32,
//     pub dwUUIAnswerSize: u32,
//     pub dwUUIMakeCallSize: u32,
//     pub dwUUIDropSize: u32,
//     pub dwUUISendUserUserInfoSize: u32,
//     pub dwUUICallInfoSize: u32,
//     pub MinDialParams: LINEDIALPARAMS,
//     pub MaxDialParams: LINEDIALPARAMS,
//     pub DefaultDialParams: LINEDIALPARAMS,
//     pub dwNumTerminals: u32,
//     pub dwTerminalCapsSize: u32,
//     pub dwTerminalCapsOffset: u32,
//     pub dwTerminalTextEntrySize: u32,
//     pub dwTerminalTextSize: u32,
//     pub dwTerminalTextOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwLineFeatures: u32,
//     pub dwSettableDevStatus: u32,
//     pub dwDeviceClassesSize: u32,
//     pub dwDeviceClassesOffset: u32,
//     pub PermanentLineGuid: windows_sys::core::GUID,
// }

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
// UNSUPPORTED Rust 1446:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEDEVSTATUS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumOpens: u32,
//     pub dwOpenMediaModes: u32,
//     pub dwNumActiveCalls: u32,
//     pub dwNumOnHoldCalls: u32,
//     pub dwNumOnHoldPendCalls: u32,
//     pub dwLineFeatures: u32,
//     pub dwNumCallCompletions: u32,
//     pub dwRingMode: u32,
//     pub dwSignalLevel: u32,
//     pub dwBatteryLevel: u32,
//     pub dwRoamMode: u32,
//     pub dwDevStatusFlags: u32,
//     pub dwTerminalModesSize: u32,
//     pub dwTerminalModesOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwAvailableMediaModes: u32,
//     pub dwAppInfoSize: u32,
//     pub dwAppInfoOffset: u32,
// }

public const val `LINEDEVSTATUSFLAGS_CONNECTED`: UInt = 1u;
public const val `LINEDEVSTATUSFLAGS_INSERVICE`: UInt = 4u;
public const val `LINEDEVSTATUSFLAGS_LOCKED`: UInt = 8u;
public const val `LINEDEVSTATUSFLAGS_MSGWAIT`: UInt = 2u;
// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEDIALPARAMS {
//     pub dwDialPause: u32,
//     pub dwDialSpeed: u32,
//     pub dwDigitDuration: u32,
//     pub dwWaitForDialtone: u32,
// }

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
// UNSUPPORTED Rust 1614:1: generic scalar type unsupported
// pub type LINEEVENT = Option<unsafe extern "system" fn(htline: HTAPILINE, htcall: HTAPICALL, dwmsg: u32, dwparam1: usize, dwparam2: usize, dwparam3: usize)>;

// UNSUPPORTED Rust 1615:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEEXTENSIONID {
//     pub dwExtensionID0: u32,
//     pub dwExtensionID1: u32,
//     pub dwExtensionID2: u32,
//     pub dwExtensionID3: u32,
// }

public const val `LINEFEATURE_DEVSPECIFIC`: UInt = 1u;
public const val `LINEFEATURE_DEVSPECIFICFEAT`: UInt = 2u;
public const val `LINEFEATURE_FORWARD`: UInt = 4u;
public const val `LINEFEATURE_FORWARDDND`: UInt = 256u;
public const val `LINEFEATURE_FORWARDFWD`: UInt = 128u;
public const val `LINEFEATURE_MAKECALL`: UInt = 8u;
public const val `LINEFEATURE_SETDEVSTATUS`: UInt = 64u;
public const val `LINEFEATURE_SETMEDIACONTROL`: UInt = 16u;
public const val `LINEFEATURE_SETTERMINAL`: UInt = 32u;
// UNSUPPORTED Rust 1632:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEFORWARD {
//     pub dwForwardMode: u32,
//     pub dwCallerAddressSize: u32,
//     pub dwCallerAddressOffset: u32,
//     pub dwDestCountryCode: u32,
//     pub dwDestAddressSize: u32,
//     pub dwDestAddressOffset: u32,
// }

// UNSUPPORTED Rust 1642:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct LINEFORWARDLIST {
//     pub dwTotalSize: u32,
//     pub dwNumEntries: u32,
//     pub ForwardList: [LINEFORWARD; 1],
// }

// UNSUPPORTED Rust 1649:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1679:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEGENERATETONE {
//     pub dwFrequency: u32,
//     pub dwCadenceOn: u32,
//     pub dwCadenceOff: u32,
//     pub dwVolume: u32,
// }

public const val `LINEGROUPSTATUS_GROUPREMOVED`: UInt = 2u;
public const val `LINEGROUPSTATUS_NEWGROUP`: UInt = 1u;
public const val `LINEINITIALIZEEXOPTION_CALLHUBTRACKING`: UInt = 2147483648u;
public const val `LINEINITIALIZEEXOPTION_USECOMPLETIONPORT`: UInt = 3u;
public const val `LINEINITIALIZEEXOPTION_USEEVENT`: UInt = 2u;
public const val `LINEINITIALIZEEXOPTION_USEHIDDENWINDOW`: UInt = 1u;
// UNSUPPORTED Rust 1693:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct LINEINITIALIZEEXPARAMS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwOptions: u32,
//     pub Handles: LINEINITIALIZEEXPARAMS_0,
//     pub dwCompletionKey: u32,
// }

// UNSUPPORTED Rust 1703:1: declaration Impl has no candidate rule
// impl Default for LINEINITIALIZEEXPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1708:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union LINEINITIALIZEEXPARAMS_0 {
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub hCompletionPort: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1714:1: declaration Impl has no candidate rule
// impl Default for LINEINITIALIZEEXPARAMS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1719:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINELOCATIONENTRY {
//     pub dwPermanentLocationID: u32,
//     pub dwLocationNameSize: u32,
//     pub dwLocationNameOffset: u32,
//     pub dwCountryCode: u32,
//     pub dwCityCodeSize: u32,
//     pub dwCityCodeOffset: u32,
//     pub dwPreferredCardID: u32,
//     pub dwLocalAccessCodeSize: u32,
//     pub dwLocalAccessCodeOffset: u32,
//     pub dwLongDistanceAccessCodeSize: u32,
//     pub dwLongDistanceAccessCodeOffset: u32,
//     pub dwTollPrefixListSize: u32,
//     pub dwTollPrefixListOffset: u32,
//     pub dwCountryID: u32,
//     pub dwOptions: u32,
//     pub dwCancelCallWaitingSize: u32,
//     pub dwCancelCallWaitingOffset: u32,
// }

public const val `LINELOCATIONOPTION_PULSEDIAL`: UInt = 1u;
public const val `LINEMAPPER`: UInt = 4294967295u;
// UNSUPPORTED Rust 1742:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMEDIACONTROLCALLSTATE {
//     pub dwCallStates: u32,
//     pub dwMediaControl: u32,
// }

// UNSUPPORTED Rust 1748:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMEDIACONTROLDIGIT {
//     pub dwDigit: u32,
//     pub dwDigitModes: u32,
//     pub dwMediaControl: u32,
// }

// UNSUPPORTED Rust 1755:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMEDIACONTROLMEDIA {
//     pub dwMediaModes: u32,
//     pub dwDuration: u32,
//     pub dwMediaControl: u32,
// }

// UNSUPPORTED Rust 1762:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMEDIACONTROLTONE {
//     pub dwAppSpecific: u32,
//     pub dwDuration: u32,
//     pub dwFrequency1: u32,
//     pub dwFrequency2: u32,
//     pub dwFrequency3: u32,
//     pub dwMediaControl: u32,
// }

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
// UNSUPPORTED Rust 1798:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMESSAGE {
//     pub hDevice: u32,
//     pub dwMessageID: u32,
//     pub dwCallbackInstance: usize,
//     pub dwParam1: usize,
//     pub dwParam2: usize,
//     pub dwParam3: usize,
// }

// UNSUPPORTED Rust 1808:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEMONITORTONE {
//     pub dwAppSpecific: u32,
//     pub dwDuration: u32,
//     pub dwFrequency1: u32,
//     pub dwFrequency2: u32,
//     pub dwFrequency3: u32,
// }

public const val `LINEOFFERINGMODE_ACTIVE`: UInt = 1u;
public const val `LINEOFFERINGMODE_INACTIVE`: UInt = 2u;
public const val `LINEOPENOPTION_PROXY`: UInt = 1073741824u;
public const val `LINEOPENOPTION_SINGLEADDRESS`: UInt = 2147483648u;
public const val `LINEPARKMODE_DIRECTED`: UInt = 1u;
public const val `LINEPARKMODE_NONDIRECTED`: UInt = 2u;
// UNSUPPORTED Rust 1823:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROVIDERENTRY {
//     pub dwPermanentProviderID: u32,
//     pub dwProviderFilenameSize: u32,
//     pub dwProviderFilenameOffset: u32,
// }

// UNSUPPORTED Rust 1830:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROVIDERLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumProviders: u32,
//     pub dwProviderListSize: u32,
//     pub dwProviderListOffset: u32,
// }

// UNSUPPORTED Rust 1840:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEPROXYREQUEST {
//     pub dwSize: u32,
//     pub dwClientMachineNameSize: u32,
//     pub dwClientMachineNameOffset: u32,
//     pub dwClientUserNameSize: u32,
//     pub dwClientUserNameOffset: u32,
//     pub dwClientAppAPIVersion: u32,
//     pub dwRequestType: u32,
//     pub Anonymous: LINEPROXYREQUEST_0,
// }

// UNSUPPORTED Rust 1853:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 1884:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1890:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEPROXYREQUEST_0_5 {
//     pub dwAddressID: u32,
//     pub dwAgentExtensionIDIndex: u32,
//     pub dwSize: u32,
//     pub Params: [u8; 1],
// }

// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1905:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_12 {
//     pub hAgentSession: u32,
//     pub dwAgentPINSize: u32,
//     pub dwAgentPINOffset: u32,
//     pub hAgent: u32,
//     pub GroupID: windows_sys::core::GUID,
//     pub dwWorkingAddressID: u32,
// }

// UNSUPPORTED Rust 1916:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_8 {
//     pub hAgent: u32,
//     pub dwAgentIDSize: u32,
//     pub dwAgentIDOffset: u32,
//     pub dwAgentPINSize: u32,
//     pub dwAgentPINOffset: u32,
// }

// UNSUPPORTED Rust 1926:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_6 {
//     pub dwAddressID: u32,
//     pub ActivityList: LINEAGENTACTIVITYLIST,
// }

// UNSUPPORTED Rust 1933:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_3 {
//     pub dwAddressID: u32,
//     pub AgentCaps: LINEAGENTCAPS,
// }

// UNSUPPORTED Rust 1940:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_7 {
//     pub dwAddressID: u32,
//     pub GroupList: LINEAGENTGROUPLIST,
// }

// UNSUPPORTED Rust 1947:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEPROXYREQUEST_0_11 {
//     pub hAgent: u32,
//     pub AgentInfo: LINEAGENTINFO,
// }

// UNSUPPORTED Rust 1954:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1960:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct LINEPROXYREQUEST_0_14 {
//     pub hAgentSession: u32,
//     pub SessionInfo: LINEAGENTSESSIONINFO,
// }

// UNSUPPORTED Rust 1967:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for LINEPROXYREQUEST_0_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1973:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_13 {
//     pub hAgent: u32,
//     pub SessionList: LINEAGENTSESSIONLIST,
// }

// UNSUPPORTED Rust 1980:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_4 {
//     pub dwAddressID: u32,
//     pub AgentStatus: LINEAGENTSTATUS,
// }

// UNSUPPORTED Rust 1987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_19 {
//     pub GroupList: LINEAGENTGROUPLIST,
// }

// UNSUPPORTED Rust 1993:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_18 {
//     pub dwQueueID: u32,
//     pub QueueInfo: LINEQUEUEINFO,
// }

// UNSUPPORTED Rust 2000:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_16 {
//     pub GroupID: windows_sys::core::GUID,
//     pub QueueList: LINEQUEUELIST,
// }

// UNSUPPORTED Rust 2007:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_2 {
//     pub dwAddressID: u32,
//     pub dwActivityID: u32,
// }

// UNSUPPORTED Rust 2014:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_0 {
//     pub dwAddressID: u32,
//     pub GroupList: LINEAGENTGROUPLIST,
// }

// UNSUPPORTED Rust 2021:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_10 {
//     pub hAgent: u32,
//     pub dwMeasurementPeriod: u32,
// }

// UNSUPPORTED Rust 2028:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_15 {
//     pub hAgentSession: u32,
//     pub dwAgentSessionState: u32,
//     pub dwNextAgentSessionState: u32,
// }

// UNSUPPORTED Rust 2036:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_9 {
//     pub hAgent: u32,
//     pub dwAgentState: u32,
//     pub dwNextAgentState: u32,
// }

// UNSUPPORTED Rust 2044:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_1 {
//     pub dwAddressID: u32,
//     pub dwAgentState: u32,
//     pub dwNextAgentState: u32,
// }

// UNSUPPORTED Rust 2052:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUEST_0_17 {
//     pub dwQueueID: u32,
//     pub dwMeasurementPeriod: u32,
// }

// UNSUPPORTED Rust 2059:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEPROXYREQUESTLIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

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
// UNSUPPORTED Rust 2096:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEQUEUEENTRY {
//     pub dwQueueID: u32,
//     pub dwNameSize: u32,
//     pub dwNameOffset: u32,
// }

// UNSUPPORTED Rust 2103:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEQUEUEINFO {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwMeasurementPeriod: u32,
//     pub dwTotalCallsQueued: u32,
//     pub dwCurrentCallsQueued: u32,
//     pub dwTotalCallsAbandoned: u32,
//     pub dwTotalCallsFlowedIn: u32,
//     pub dwTotalCallsFlowedOut: u32,
//     pub dwLongestEverWaitTime: u32,
//     pub dwCurrentLongestWaitTime: u32,
//     pub dwAverageWaitTime: u32,
//     pub dwFinalDisposition: u32,
// }

// UNSUPPORTED Rust 2120:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINEQUEUELIST {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumEntries: u32,
//     pub dwListSize: u32,
//     pub dwListOffset: u32,
// }

public const val `LINEQUEUESTATUS_NEWQUEUE`: UInt = 2u;
public const val `LINEQUEUESTATUS_QUEUEREMOVED`: UInt = 4u;
public const val `LINEQUEUESTATUS_UPDATEINFO`: UInt = 1u;
public const val `LINEREMOVEFROMCONF_ANY`: UInt = 3u;
public const val `LINEREMOVEFROMCONF_LAST`: UInt = 2u;
public const val `LINEREMOVEFROMCONF_NONE`: UInt = 1u;
// UNSUPPORTED Rust 2136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LINEREQMAKECALL {
//     pub szDestAddress: [i8; 80],
//     pub szAppName: [i8; 40],
//     pub szCalledParty: [i8; 40],
//     pub szComment: [i8; 80],
// }

// UNSUPPORTED Rust 2144:1: declaration Impl has no candidate rule
// impl Default for LINEREQMAKECALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2149:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct LINEREQMAKECALLW {
//     pub szDestAddress: [u16; 80],
//     pub szAppName: [u16; 40],
//     pub szCalledParty: [u16; 40],
//     pub szComment: [u16; 80],
// }

// UNSUPPORTED Rust 2157:1: declaration Impl has no candidate rule
// impl Default for LINEREQMAKECALLW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2162:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct LINEREQMEDIACALL {
//     pub hWnd: super::super::Foundation::HWND,
//     pub wRequestID: super::super::Foundation::WPARAM,
//     pub szDeviceClass: [i8; 40],
//     pub ucDeviceID: [u8; 40],
//     pub dwSize: u32,
//     pub dwSecure: u32,
//     pub szDestAddress: [i8; 80],
//     pub szAppName: [i8; 40],
//     pub szCalledParty: [i8; 40],
//     pub szComment: [i8; 80],
// }

// UNSUPPORTED Rust 2176:1: declaration Impl has no candidate rule
// impl Default for LINEREQMEDIACALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2181:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct LINEREQMEDIACALLW {
//     pub hWnd: super::super::Foundation::HWND,
//     pub wRequestID: super::super::Foundation::WPARAM,
//     pub szDeviceClass: [u16; 40],
//     pub ucDeviceID: [u8; 40],
//     pub dwSize: u32,
//     pub dwSecure: u32,
//     pub szDestAddress: [u16; 80],
//     pub szAppName: [u16; 40],
//     pub szCalledParty: [u16; 40],
//     pub szComment: [u16; 80],
// }

// UNSUPPORTED Rust 2195:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2213:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINETERMCAPS {
//     pub dwTermDev: u32,
//     pub dwTermModes: u32,
//     pub dwTermSharing: u32,
// }

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
// UNSUPPORTED Rust 2243:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINETRANSLATECAPS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwNumLocations: u32,
//     pub dwLocationListSize: u32,
//     pub dwLocationListOffset: u32,
//     pub dwCurrentLocationID: u32,
//     pub dwNumCards: u32,
//     pub dwCardListSize: u32,
//     pub dwCardListOffset: u32,
//     pub dwCurrentPreferredCardID: u32,
// }

public const val `LINETRANSLATEOPTION_CANCELCALLWAITING`: UInt = 2u;
public const val `LINETRANSLATEOPTION_CARDOVERRIDE`: UInt = 1u;
public const val `LINETRANSLATEOPTION_FORCELD`: UInt = 8u;
public const val `LINETRANSLATEOPTION_FORCELOCAL`: UInt = 4u;
// UNSUPPORTED Rust 2262:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct LINETRANSLATEOUTPUT {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwDialableStringSize: u32,
//     pub dwDialableStringOffset: u32,
//     pub dwDisplayableStringSize: u32,
//     pub dwDisplayableStringOffset: u32,
//     pub dwCurrentCountry: u32,
//     pub dwDestCountry: u32,
//     pub dwTranslateResults: u32,
// }

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
// UNSUPPORTED Rust 2325:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPGETTNEFSTREAMCODEPAGE = Option<unsafe extern "system" fn(lpstream: *mut core::ffi::c_void, lpulcodepage: *mut u32, lpulsubcodepage: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2327:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
// pub type LPOPENTNEFSTREAM = Option<unsafe extern "system" fn(lpvsupport: *mut core::ffi::c_void, lpstream: *mut core::ffi::c_void, lpszstreamname: *const i8, ulflags: u32, lpmessage: *mut core::ffi::c_void, wkeyval: u16, lpptnef: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2329:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com"))]
// pub type LPOPENTNEFSTREAMEX = Option<unsafe extern "system" fn(lpvsupport: *mut core::ffi::c_void, lpstream: *mut core::ffi::c_void, lpszstreamname: *const i8, ulflags: u32, lpmessage: *mut core::ffi::c_void, wkeyval: u16, lpadressbook: *mut core::ffi::c_void, lpptnef: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

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
// UNSUPPORTED Rust 2343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO {
//     pub dwSize: u32,
//     pub Event: MSP_EVENT,
//     pub hCall: *mut i32,
//     pub Anonymous: MSP_EVENT_INFO_0,
// }

// UNSUPPORTED Rust 2352:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2358:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 2371:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2377:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_0 {
//     pub Type: MSP_ADDRESS_EVENT,
//     pub pTerminal: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2384:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2390:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_5 {
//     pub pASRTerminal: *mut core::ffi::c_void,
//     pub hrErrorCode: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_1 {
//     pub Type: MSP_CALL_EVENT,
//     pub Cause: MSP_CALL_EVENT_CAUSE,
//     pub pStream: *mut core::ffi::c_void,
//     pub pTerminal: *mut core::ffi::c_void,
//     pub hrError: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 2413:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_4 {
//     pub pParentFileTerminal: *mut core::ffi::c_void,
//     pub pFileTrack: *mut core::ffi::c_void,
//     pub TerminalMediaState: TERMINAL_MEDIA_STATE,
//     pub ftecEventCause: FT_STATE_EVENT_CAUSE,
//     pub hrErrorCode: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 2429:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_3 {
//     pub pEvent: *mut core::ffi::c_void,
//     pub lEventCode: i32,
// }

// UNSUPPORTED Rust 2442:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2448:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_7 {
//     pub pToneTerminal: *mut core::ffi::c_void,
//     pub hrErrorCode: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 2455:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_2 {
//     pub dwBufferSize: u32,
//     pub pBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 2468:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MSP_EVENT_INFO_0_6 {
//     pub pTTSTerminal: *mut core::ffi::c_void,
//     pub hrErrorCode: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 2481:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MSP_EVENT_INFO_0_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const McastAddressAllocation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf0daef2_a289_11d1_8697_006008b0e5d2);

// UNSUPPORTED Rust 2488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NSID {
//     pub dwSize: u32,
//     pub uchType: [u8; 16],
//     pub xtype: u32,
//     pub lTime: i32,
//     pub address: NSID_0,
// }

// UNSUPPORTED Rust 2497:1: declaration Impl has no candidate rule
// impl Default for NSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2502:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NSID_0 {
//     pub alias: ADDRALIAS,
//     pub rgchInterNet: [i8; 1],
// }

// UNSUPPORTED Rust 2508:1: declaration Impl has no candidate rule
// impl Default for NSID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2513:1: non-scalar type Ptr unsupported
// pub const OPENTNEFSTREAM: windows_sys::core::PCSTR = windows_sys::core::s!("OpenTnefStream");

// UNSUPPORTED Rust 2514:1: non-scalar type Ptr unsupported
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
// UNSUPPORTED Rust 2649:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PHONEBUTTONINFO {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwButtonMode: u32,
//     pub dwButtonFunction: u32,
//     pub dwButtonTextSize: u32,
//     pub dwButtonTextOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwButtonState: u32,
// }

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
// UNSUPPORTED Rust 2673:1: generic scalar type unsupported
// pub type PHONECALLBACK = Option<unsafe extern "system" fn(hdevice: u32, dwmessage: u32, dwinstance: usize, dwparam1: usize, dwparam2: usize, dwparam3: usize)>;

// UNSUPPORTED Rust 2674:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PHONECAPS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwProviderInfoSize: u32,
//     pub dwProviderInfoOffset: u32,
//     pub dwPhoneInfoSize: u32,
//     pub dwPhoneInfoOffset: u32,
//     pub dwPermanentPhoneID: u32,
//     pub dwPhoneNameSize: u32,
//     pub dwPhoneNameOffset: u32,
//     pub dwStringFormat: u32,
//     pub dwPhoneStates: u32,
//     pub dwHookSwitchDevs: u32,
//     pub dwHandsetHookSwitchModes: u32,
//     pub dwSpeakerHookSwitchModes: u32,
//     pub dwHeadsetHookSwitchModes: u32,
//     pub dwVolumeFlags: u32,
//     pub dwGainFlags: u32,
//     pub dwDisplayNumRows: u32,
//     pub dwDisplayNumColumns: u32,
//     pub dwNumRingModes: u32,
//     pub dwNumButtonLamps: u32,
//     pub dwButtonModesSize: u32,
//     pub dwButtonModesOffset: u32,
//     pub dwButtonFunctionsSize: u32,
//     pub dwButtonFunctionsOffset: u32,
//     pub dwLampModesSize: u32,
//     pub dwLampModesOffset: u32,
//     pub dwNumSetData: u32,
//     pub dwSetDataSize: u32,
//     pub dwSetDataOffset: u32,
//     pub dwNumGetData: u32,
//     pub dwGetDataSize: u32,
//     pub dwGetDataOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwDeviceClassesSize: u32,
//     pub dwDeviceClassesOffset: u32,
//     pub dwPhoneFeatures: u32,
//     pub dwSettableHandsetHookSwitchModes: u32,
//     pub dwSettableSpeakerHookSwitchModes: u32,
//     pub dwSettableHeadsetHookSwitchModes: u32,
//     pub dwMonitoredHandsetHookSwitchModes: u32,
//     pub dwMonitoredSpeakerHookSwitchModes: u32,
//     pub dwMonitoredHeadsetHookSwitchModes: u32,
//     pub PermanentPhoneGuid: windows_sys::core::GUID,
// }

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
// UNSUPPORTED Rust 2763:1: generic scalar type unsupported
// pub type PHONEEVENT = Option<unsafe extern "system" fn(htphone: HTAPIPHONE, dwmsg: u32, dwparam1: usize, dwparam2: usize, dwparam3: usize)>;

// UNSUPPORTED Rust 2764:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PHONEEXTENSIONID {
//     pub dwExtensionID0: u32,
//     pub dwExtensionID1: u32,
//     pub dwExtensionID2: u32,
//     pub dwExtensionID3: u32,
// }

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
// UNSUPPORTED Rust 2812:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PHONEINITIALIZEEXPARAMS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwOptions: u32,
//     pub Handles: PHONEINITIALIZEEXPARAMS_0,
//     pub dwCompletionKey: u32,
// }

// UNSUPPORTED Rust 2822:1: declaration Impl has no candidate rule
// impl Default for PHONEINITIALIZEEXPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2827:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union PHONEINITIALIZEEXPARAMS_0 {
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub hCompletionPort: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 2833:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2846:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PHONEMESSAGE {
//     pub hDevice: u32,
//     pub dwMessageID: u32,
//     pub dwCallbackInstance: usize,
//     pub dwParam1: usize,
//     pub dwParam2: usize,
//     pub dwParam3: usize,
// }

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
// UNSUPPORTED Rust 2882:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PHONESTATUS {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwStatusFlags: u32,
//     pub dwNumOwners: u32,
//     pub dwNumMonitors: u32,
//     pub dwRingMode: u32,
//     pub dwRingVolume: u32,
//     pub dwHandsetHookSwitchMode: u32,
//     pub dwHandsetVolume: u32,
//     pub dwHandsetGain: u32,
//     pub dwSpeakerHookSwitchMode: u32,
//     pub dwSpeakerVolume: u32,
//     pub dwSpeakerGain: u32,
//     pub dwHeadsetHookSwitchMode: u32,
//     pub dwHeadsetVolume: u32,
//     pub dwHeadsetGain: u32,
//     pub dwDisplaySize: u32,
//     pub dwDisplayOffset: u32,
//     pub dwLampModesSize: u32,
//     pub dwLampModesOffset: u32,
//     pub dwOwnerNameSize: u32,
//     pub dwOwnerNameOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwPhoneFeatures: u32,
// }

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
// UNSUPPORTED Rust 2986:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RENDDATA {
//     pub atyp: u16,
//     pub ulPosition: u32,
//     pub dxWidth: u16,
//     pub dyHeight: u16,
//     pub dwFlags: u32,
// }

public typealias `RND_ADVERTISING_SCOPE` = Int;
// UNSUPPORTED Rust 2996:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Rendezvous: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1029e5b_cb5b_11d0_8d59_00c04fd91ac0);

// UNSUPPORTED Rust 2997:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 3008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STnefProblem {
//     pub ulComponent: u32,
//     pub ulAttribute: u32,
//     pub ulPropTag: u32,
//     pub scode: i32,
// }

// UNSUPPORTED Rust 3016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STnefProblemArray {
//     pub cProblem: u32,
//     pub aProblem: [STnefProblem; 1],
// }

// UNSUPPORTED Rust 3022:1: declaration Impl has no candidate rule
// impl Default for STnefProblemArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 3065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TAPI_CUSTOMTONE {
//     pub dwFrequency: u32,
//     pub dwCadenceOn: u32,
//     pub dwCadenceOff: u32,
//     pub dwVolume: u32,
// }

// UNSUPPORTED Rust 3073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TAPI_DETECTTONE {
//     pub dwAppSpecific: u32,
//     pub dwDuration: u32,
//     pub dwFrequency1: u32,
//     pub dwFrequency2: u32,
//     pub dwFrequency3: u32,
// }

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
// UNSUPPORTED Rust 3235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRP {
//     pub trpid: u16,
//     pub cbgrtrp: u16,
//     pub cch: u16,
//     pub cbRgb: u16,
// }

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
// UNSUPPORTED Rust 3363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TUISPICREATEDIALOGINSTANCEPARAMS {
//     pub dwRequestID: u32,
//     pub hdDlgInst: HDRVDIALOGINSTANCE,
//     pub htDlgInst: u32,
//     pub lpszUIDLLName: windows_sys::core::PCWSTR,
//     pub lpParams: *mut core::ffi::c_void,
//     pub dwSize: u32,
// }

// UNSUPPORTED Rust 3373:1: declaration Impl has no candidate rule
// impl Default for TUISPICREATEDIALOGINSTANCEPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3378:1: generic scalar type unsupported
// pub type TUISPIDLLCALLBACK = Option<unsafe extern "system" fn(dwobjectid: usize, dwobjecttype: u32, lpparams: *mut core::ffi::c_void, dwsize: u32) -> i32>;

public const val `TUISPIDLL_OBJECT_DIALOGINSTANCE`: Int = 4;
public const val `TUISPIDLL_OBJECT_LINEID`: Int = 1;
public const val `TUISPIDLL_OBJECT_PHONEID`: Int = 2;
public const val `TUISPIDLL_OBJECT_PROVIDERID`: Int = 3;
// UNSUPPORTED Rust 3383:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct VARSTRING {
//     pub dwTotalSize: u32,
//     pub dwNeededSize: u32,
//     pub dwUsedSize: u32,
//     pub dwStringFormat: u32,
//     pub dwStringSize: u32,
//     pub dwStringOffset: u32,
// }

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
