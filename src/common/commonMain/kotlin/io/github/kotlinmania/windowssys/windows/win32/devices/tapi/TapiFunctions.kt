package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public fun interface FnCallback {
    public operator fun invoke(hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public fun GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "GetTnefStreamCodepage", longArrayOf(lpstream, lpulcodepage, lpulsubcodepage)).toInt()
}

public fun OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "OpenTnefStream", longArrayOf(lpvsupport, lpstream, lpszstreamname, ulflags.toLong(), lpmessage, wkeyval.toLong(), lpptnef)).toInt()
}

public fun OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "OpenTnefStreamEx", longArrayOf(lpvsupport, lpstream, lpszstreamname, ulflags.toLong(), lpmessage, wkeyval.toLong(), lpadressbook, lpptnef)).toInt()
}

public fun lineAccept(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAccept", longArrayOf(hcall.toLong(), lpsuseruserinfo, dwsize.toLong())).toInt()
}

public fun lineAddProvider(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAddProvider", longArrayOf(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)).toInt()
}

public fun lineAddProviderA(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAddProviderA", longArrayOf(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)).toInt()
}

public fun lineAddProviderW(lpszproviderfilename: PCWSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAddProviderW", longArrayOf(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)).toInt()
}

public fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAddToConference", longArrayOf(hconfcall.toLong(), hconsultcall.toLong())).toInt()
}

public fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAgentSpecific", longArrayOf(hline.toLong(), dwaddressid.toLong(), dwagentextensionidindex.toLong(), lpparams, dwsize.toLong())).toInt()
}

public fun lineAnswer(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineAnswer", longArrayOf(hcall.toLong(), lpsuseruserinfo, dwsize.toLong())).toInt()
}

public fun lineBlindTransfer(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineBlindTransfer", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineBlindTransferA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineBlindTransferA", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: PCWSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineBlindTransferW", longArrayOf(hcall.toLong(), lpszdestaddressw, dwcountrycode.toLong())).toInt()
}

public fun lineClose(hline: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineClose", longArrayOf(hline.toLong())).toInt()
}

public fun lineCompleteCall(hcall: UInt, lpdwcompletionid: Long, dwcompletionmode: UInt, dwmessageid: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCompleteCall", longArrayOf(hcall.toLong(), lpdwcompletionid, dwcompletionmode.toLong(), dwmessageid.toLong())).toInt()
}

public fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: Long, dwtransfermode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCompleteTransfer", longArrayOf(hcall.toLong(), hconsultcall.toLong(), lphconfcall, dwtransfermode.toLong())).toInt()
}

public fun lineConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialog", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialogA", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialogEdit", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toLong(), lpdeviceconfigout)).toInt()
}

public fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialogEditA", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toLong(), lpdeviceconfigout)).toInt()
}

public fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialogEditW", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toLong(), lpdeviceconfigout)).toInt()
}

public fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigDialogW", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun lineConfigProvider(hwndowner: HWND, dwpermanentproviderid: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineConfigProvider", longArrayOf(hwndowner, dwpermanentproviderid.toLong())).toInt()
}

public fun lineCreateAgentA(hline: UInt, lpszagentid: PCSTR, lpszagentpin: PCSTR, lphagent: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCreateAgentA", longArrayOf(hline.toLong(), lpszagentid, lpszagentpin, lphagent)).toInt()
}

public fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: PCSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCreateAgentSessionA", longArrayOf(hline.toLong(), hagent.toLong(), lpszagentpin, dwworkingaddressid.toLong(), lpgroupid, lphagentsession)).toInt()
}

public fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: PCWSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCreateAgentSessionW", longArrayOf(hline.toLong(), hagent.toLong(), lpszagentpin, dwworkingaddressid.toLong(), lpgroupid, lphagentsession)).toInt()
}

public fun lineCreateAgentW(hline: UInt, lpszagentid: PCWSTR, lpszagentpin: PCWSTR, lphagent: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineCreateAgentW", longArrayOf(hline.toLong(), lpszagentid, lpszagentpin, lphagent)).toInt()
}

public fun lineDeallocateCall(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDeallocateCall", longArrayOf(hcall.toLong())).toInt()
}

public fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDevSpecific", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), lpparams, dwsize.toLong())).toInt()
}

public fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDevSpecificFeature", longArrayOf(hline.toLong(), dwfeature.toLong(), lpparams, dwsize.toLong())).toInt()
}

public fun lineDial(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDial", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineDialA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDialA", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineDialW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDialW", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineDrop(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineDrop", longArrayOf(hcall.toLong(), lpsuseruserinfo, dwsize.toLong())).toInt()
}

public fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineForward", longArrayOf(hline.toLong(), balladdresses.toLong(), dwaddressid.toLong(), lpforwardlist, dwnumringsnoanswer.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineForwardA", longArrayOf(hline.toLong(), balladdresses.toLong(), dwaddressid.toLong(), lpforwardlist, dwnumringsnoanswer.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineForwardW", longArrayOf(hline.toLong(), balladdresses.toLong(), dwaddressid.toLong(), lpforwardlist, dwnumringsnoanswer.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGatherDigits", longArrayOf(hcall.toLong(), dwdigitmodes.toLong(), lpsdigits, dwnumdigits.toLong(), lpszterminationdigits, dwfirstdigittimeout.toLong(), dwinterdigittimeout.toLong())).toInt()
}

public fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGatherDigitsA", longArrayOf(hcall.toLong(), dwdigitmodes.toLong(), lpsdigits, dwnumdigits.toLong(), lpszterminationdigits, dwfirstdigittimeout.toLong(), dwinterdigittimeout.toLong())).toInt()
}

public fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PWSTR, dwnumdigits: UInt, lpszterminationdigits: PCWSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGatherDigitsW", longArrayOf(hcall.toLong(), dwdigitmodes.toLong(), lpsdigits, dwnumdigits.toLong(), lpszterminationdigits, dwfirstdigittimeout.toLong(), dwinterdigittimeout.toLong())).toInt()
}

public fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGenerateDigits", longArrayOf(hcall.toLong(), dwdigitmode.toLong(), lpszdigits, dwduration.toLong())).toInt()
}

public fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGenerateDigitsA", longArrayOf(hcall.toLong(), dwdigitmode.toLong(), lpszdigits, dwduration.toLong())).toInt()
}

public fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCWSTR, dwduration: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGenerateDigitsW", longArrayOf(hcall.toLong(), dwdigitmode.toLong(), lpszdigits, dwduration.toLong())).toInt()
}

public fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGenerateTone", longArrayOf(hcall.toLong(), dwtonemode.toLong(), dwduration.toLong(), dwnumtones.toLong(), lptones)).toInt()
}

public fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressCaps", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwaddressid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpaddresscaps)).toInt()
}

public fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressCapsA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwaddressid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpaddresscaps)).toInt()
}

public fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressCapsW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwaddressid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpaddresscaps)).toInt()
}

public fun lineGetAddressID(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressID", longArrayOf(hline.toLong(), lpdwaddressid, dwaddressmode.toLong(), lpsaddress, dwsize.toLong())).toInt()
}

public fun lineGetAddressIDA(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressIDA", longArrayOf(hline.toLong(), lpdwaddressid, dwaddressmode.toLong(), lpsaddress, dwsize.toLong())).toInt()
}

public fun lineGetAddressIDW(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCWSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressIDW", longArrayOf(hline.toLong(), lpdwaddressid, dwaddressmode.toLong(), lpsaddress, dwsize.toLong())).toInt()
}

public fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressStatus", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpaddressstatus)).toInt()
}

public fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressStatusA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpaddressstatus)).toInt()
}

public fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAddressStatusW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpaddressstatus)).toInt()
}

public fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentActivityListA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentactivitylist)).toInt()
}

public fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentActivityListW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentactivitylist)).toInt()
}

public fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentCapsA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwaddressid.toLong(), dwappapiversion.toLong(), lpagentcaps)).toInt()
}

public fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentCapsW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwaddressid.toLong(), dwappapiversion.toLong(), lpagentcaps)).toInt()
}

public fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentGroupListA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentgrouplist)).toInt()
}

public fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentGroupListW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentgrouplist)).toInt()
}

public fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentInfo", longArrayOf(hline.toLong(), hagent.toLong(), lpagentinfo)).toInt()
}

public fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentSessionInfo", longArrayOf(hline.toLong(), hagentsession.toLong(), lpagentsessioninfo)).toInt()
}

public fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentSessionList", longArrayOf(hline.toLong(), hagent.toLong(), lpagentsessionlist)).toInt()
}

public fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentStatusA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentstatus)).toInt()
}

public fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAgentStatusW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentstatus)).toInt()
}

public fun lineGetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAppPriority", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpextensionname, lpdwpriority)).toInt()
}

public fun lineGetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAppPriorityA", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpextensionname, lpdwpriority)).toInt()
}

public fun lineGetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetAppPriorityW", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpextensionname, lpdwpriority)).toInt()
}

public fun lineGetCallInfo(hcall: UInt, lpcallinfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCallInfo", longArrayOf(hcall.toLong(), lpcallinfo)).toInt()
}

public fun lineGetCallInfoA(hcall: UInt, lpcallinfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCallInfoA", longArrayOf(hcall.toLong(), lpcallinfo)).toInt()
}

public fun lineGetCallInfoW(hcall: UInt, lpcallinfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCallInfoW", longArrayOf(hcall.toLong(), lpcallinfo)).toInt()
}

public fun lineGetCallStatus(hcall: UInt, lpcallstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCallStatus", longArrayOf(hcall.toLong(), lpcallstatus)).toInt()
}

public fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetConfRelatedCalls", longArrayOf(hcall.toLong(), lpcalllist)).toInt()
}

public fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCountry", longArrayOf(dwcountryid.toLong(), dwapiversion.toLong(), lplinecountrylist)).toInt()
}

public fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCountryA", longArrayOf(dwcountryid.toLong(), dwapiversion.toLong(), lplinecountrylist)).toInt()
}

public fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetCountryW", longArrayOf(dwcountryid.toLong(), dwapiversion.toLong(), lplinecountrylist)).toInt()
}

public fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevCaps", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lplinedevcaps)).toInt()
}

public fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevCapsA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lplinedevcaps)).toInt()
}

public fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevCapsW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lplinedevcaps)).toInt()
}

public fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevConfig", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, lpszdeviceclass)).toInt()
}

public fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevConfigA", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, lpszdeviceclass)).toInt()
}

public fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetDevConfigW", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, lpszdeviceclass)).toInt()
}

public fun lineGetGroupListA(hline: UInt, lpgrouplist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetGroupListA", longArrayOf(hline.toLong(), lpgrouplist)).toInt()
}

public fun lineGetGroupListW(hline: UInt, lpgrouplist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetGroupListW", longArrayOf(hline.toLong(), lpgrouplist)).toInt()
}

public fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetID", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), dwselect.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetIDA", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), dwselect.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetIDW", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), dwselect.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetIcon", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetIconA", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetIconW", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetLineDevStatus", longArrayOf(hline.toLong(), lplinedevstatus)).toInt()
}

public fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetLineDevStatusA", longArrayOf(hline.toLong(), lplinedevstatus)).toInt()
}

public fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetLineDevStatusW", longArrayOf(hline.toLong(), lplinedevstatus)).toInt()
}

public fun lineGetMessage(hlineapp: UInt, lpmessage: Long, dwtimeout: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetMessage", longArrayOf(hlineapp.toLong(), lpmessage, dwtimeout.toLong())).toInt()
}

public fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetNewCalls", longArrayOf(hline.toLong(), dwaddressid.toLong(), dwselect.toLong(), lpcalllist)).toInt()
}

public fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetNumRings", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpdwnumrings)).toInt()
}

public fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetProviderList", longArrayOf(dwapiversion.toLong(), lpproviderlist)).toInt()
}

public fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetProviderListA", longArrayOf(dwapiversion.toLong(), lpproviderlist)).toInt()
}

public fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetProviderListW", longArrayOf(dwapiversion.toLong(), lpproviderlist)).toInt()
}

public fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetProxyStatus", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwappapiversion.toLong(), lplineproxyreqestlist)).toInt()
}

public fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetQueueInfo", longArrayOf(hline.toLong(), dwqueueid.toLong(), lplinequeueinfo)).toInt()
}

public fun lineGetQueueListA(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetQueueListA", longArrayOf(hline.toLong(), lpgroupid, lpqueuelist)).toInt()
}

public fun lineGetQueueListW(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetQueueListW", longArrayOf(hline.toLong(), lpgroupid, lpqueuelist)).toInt()
}

public fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetRequest", longArrayOf(hlineapp.toLong(), dwrequestmode.toLong(), lprequestbuffer)).toInt()
}

public fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetRequestA", longArrayOf(hlineapp.toLong(), dwrequestmode.toLong(), lprequestbuffer)).toInt()
}

public fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetRequestW", longArrayOf(hlineapp.toLong(), dwrequestmode.toLong(), lprequestbuffer)).toInt()
}

public fun lineGetStatusMessages(hline: UInt, lpdwlinestates: Long, lpdwaddressstates: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetStatusMessages", longArrayOf(hline.toLong(), lpdwlinestates, lpdwaddressstates)).toInt()
}

public fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetTranslateCaps", longArrayOf(hlineapp.toLong(), dwapiversion.toLong(), lptranslatecaps)).toInt()
}

public fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetTranslateCapsA", longArrayOf(hlineapp.toLong(), dwapiversion.toLong(), lptranslatecaps)).toInt()
}

public fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineGetTranslateCapsW", longArrayOf(hlineapp.toLong(), dwapiversion.toLong(), lptranslatecaps)).toInt()
}

public fun lineHandoff(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineHandoff", longArrayOf(hcall.toLong(), lpszfilename, dwmediamode.toLong())).toInt()
}

public fun lineHandoffA(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineHandoffA", longArrayOf(hcall.toLong(), lpszfilename, dwmediamode.toLong())).toInt()
}

public fun lineHandoffW(hcall: UInt, lpszfilename: PCWSTR, dwmediamode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineHandoffW", longArrayOf(hcall.toLong(), lpszfilename, dwmediamode.toLong())).toInt()
}

public fun lineHold(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineHold", longArrayOf(hcall.toLong())).toInt()
}

public fun lineInitialize(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineInitialize", longArrayOf(lphlineapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszappname, lpdwnumdevs)).toInt()
}

public fun lineInitializeExA(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineInitializeExA", longArrayOf(lphlineapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams)).toInt()
}

public fun lineInitializeExW(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineInitializeExW", longArrayOf(lphlineapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams)).toInt()
}

public fun lineMakeCall(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMakeCall", longArrayOf(hline.toLong(), lphcall, lpszdestaddress, dwcountrycode.toLong(), lpcallparams)).toInt()
}

public fun lineMakeCallA(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMakeCallA", longArrayOf(hline.toLong(), lphcall, lpszdestaddress, dwcountrycode.toLong(), lpcallparams)).toInt()
}

public fun lineMakeCallW(hline: UInt, lphcall: Long, lpszdestaddress: PCWSTR, dwcountrycode: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMakeCallW", longArrayOf(hline.toLong(), lphcall, lpszdestaddress, dwcountrycode.toLong(), lpcallparams)).toInt()
}

public fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMonitorDigits", longArrayOf(hcall.toLong(), dwdigitmodes.toLong())).toInt()
}

public fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMonitorMedia", longArrayOf(hcall.toLong(), dwmediamodes.toLong())).toInt()
}

public fun lineMonitorTones(hcall: UInt, lptonelist: Long, dwnumentries: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineMonitorTones", longArrayOf(hcall.toLong(), lptonelist, dwnumentries.toLong())).toInt()
}

public fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineNegotiateAPIVersion", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapilowversion.toLong(), dwapihighversion.toLong(), lpdwapiversion, lpextensionid)).toInt()
}

public fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineNegotiateExtVersion", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextlowversion.toLong(), dwexthighversion.toLong(), lpdwextversion)).toInt()
}

public fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineOpen", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lphline, dwapiversion.toLong(), dwextversion.toLong(), dwcallbackinstance.toLong(), dwprivileges.toLong(), dwmediamodes.toLong(), lpcallparams)).toInt()
}

public fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineOpenA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lphline, dwapiversion.toLong(), dwextversion.toLong(), dwcallbackinstance.toLong(), dwprivileges.toLong(), dwmediamodes.toLong(), lpcallparams)).toInt()
}

public fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineOpenW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lphline, dwapiversion.toLong(), dwextversion.toLong(), dwcallbackinstance.toLong(), dwprivileges.toLong(), dwmediamodes.toLong(), lpcallparams)).toInt()
}

public fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePark", longArrayOf(hcall.toLong(), dwparkmode.toLong(), lpszdiraddress, lpnondiraddress)).toInt()
}

public fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineParkA", longArrayOf(hcall.toLong(), dwparkmode.toLong(), lpszdiraddress, lpnondiraddress)).toInt()
}

public fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCWSTR, lpnondiraddress: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineParkW", longArrayOf(hcall.toLong(), dwparkmode.toLong(), lpszdiraddress, lpnondiraddress)).toInt()
}

public fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePickup", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress, lpszgroupid)).toInt()
}

public fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePickupA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress, lpszgroupid)).toInt()
}

public fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR, lpszgroupid: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePickupW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress, lpszgroupid)).toInt()
}

public fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePrepareAddToConference", longArrayOf(hconfcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePrepareAddToConferenceA", longArrayOf(hconfcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "linePrepareAddToConferenceW", longArrayOf(hconfcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineProxyMessage", longArrayOf(hline.toLong(), hcall.toLong(), dwmsg.toLong(), dwparam1.toLong(), dwparam2.toLong(), dwparam3.toLong())).toInt()
}

public fun lineProxyResponse(hline: UInt, lpproxyrequest: Long, dwresult: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineProxyResponse", longArrayOf(hline.toLong(), lpproxyrequest, dwresult.toLong())).toInt()
}

public fun lineRedirect(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRedirect", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineRedirectA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRedirectA", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineRedirectW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRedirectW", longArrayOf(hcall.toLong(), lpszdestaddress, dwcountrycode.toLong())).toInt()
}

public fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRegisterRequestRecipient", longArrayOf(hlineapp.toLong(), dwregistrationinstance.toLong(), dwrequestmode.toLong(), benable.toLong())).toInt()
}

public fun lineReleaseUserUserInfo(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineReleaseUserUserInfo", longArrayOf(hcall.toLong())).toInt()
}

public fun lineRemoveFromConference(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRemoveFromConference", longArrayOf(hcall.toLong())).toInt()
}

public fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: HWND): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineRemoveProvider", longArrayOf(dwpermanentproviderid.toLong(), hwndowner)).toInt()
}

public fun lineSecureCall(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSecureCall", longArrayOf(hcall.toLong())).toInt()
}

public fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSendUserUserInfo", longArrayOf(hcall.toLong(), lpsuseruserinfo, dwsize.toLong())).toInt()
}

public fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentActivity", longArrayOf(hline.toLong(), dwaddressid.toLong(), dwactivityid.toLong())).toInt()
}

public fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentGroup", longArrayOf(hline.toLong(), dwaddressid.toLong(), lpagentgrouplist)).toInt()
}

public fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentMeasurementPeriod", longArrayOf(hline.toLong(), hagent.toLong(), dwmeasurementperiod.toLong())).toInt()
}

public fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentSessionState", longArrayOf(hline.toLong(), hagentsession.toLong(), dwagentsessionstate.toLong(), dwnextagentsessionstate.toLong())).toInt()
}

public fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentState", longArrayOf(hline.toLong(), dwaddressid.toLong(), dwagentstate.toLong(), dwnextagentstate.toLong())).toInt()
}

public fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAgentStateEx", longArrayOf(hline.toLong(), hagent.toLong(), dwagentstate.toLong(), dwnextagentstate.toLong())).toInt()
}

public fun lineSetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAppPriority", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpszextensionname, dwpriority.toLong())).toInt()
}

public fun lineSetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAppPriorityA", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpszextensionname, dwpriority.toLong())).toInt()
}

public fun lineSetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCWSTR, dwpriority: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAppPriorityW", longArrayOf(lpszappfilename, dwmediamode.toLong(), lpextensionid, dwrequestmode.toLong(), lpszextensionname, dwpriority.toLong())).toInt()
}

public fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetAppSpecific", longArrayOf(hcall.toLong(), dwappspecific.toLong())).toInt()
}

public fun lineSetCallData(hcall: UInt, lpcalldata: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCallData", longArrayOf(hcall.toLong(), lpcalldata, dwsize.toLong())).toInt()
}

public fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCallParams", longArrayOf(hcall.toLong(), dwbearermode.toLong(), dwminrate.toLong(), dwmaxrate.toLong(), lpdialparams)).toInt()
}

public fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCallPrivilege", longArrayOf(hcall.toLong(), dwcallprivilege.toLong())).toInt()
}

public fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: Long, dwsendingflowspecsize: UInt, lpreceivingflowspec: Long, dwreceivingflowspecsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCallQualityOfService", longArrayOf(hcall.toLong(), lpsendingflowspec, dwsendingflowspecsize.toLong(), lpreceivingflowspec, dwreceivingflowspecsize.toLong())).toInt()
}

public fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCallTreatment", longArrayOf(hcall.toLong(), dwtreatment.toLong())).toInt()
}

public fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetCurrentLocation", longArrayOf(hlineapp.toLong(), dwlocation.toLong())).toInt()
}

public fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetDevConfig", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, dwsize.toLong(), lpszdeviceclass)).toInt()
}

public fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetDevConfigA", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, dwsize.toLong(), lpszdeviceclass)).toInt()
}

public fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetDevConfigW", longArrayOf(dwdeviceid.toLong(), lpdeviceconfig, dwsize.toLong(), lpszdeviceclass)).toInt()
}

public fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetLineDevStatus", longArrayOf(hline.toLong(), dwstatustochange.toLong(), fstatus.toLong())).toInt()
}

public fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: Long, dwdigitnumentries: UInt, lpmedialist: Long, dwmedianumentries: UInt, lptonelist: Long, dwtonenumentries: UInt, lpcallstatelist: Long, dwcallstatenumentries: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetMediaControl", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), dwselect.toLong(), lpdigitlist, dwdigitnumentries.toLong(), lpmedialist, dwmedianumentries.toLong(), lptonelist, dwtonenumentries.toLong(), lpcallstatelist, dwcallstatenumentries.toLong())).toInt()
}

public fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetMediaMode", longArrayOf(hcall.toLong(), dwmediamodes.toLong())).toInt()
}

public fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetNumRings", longArrayOf(hline.toLong(), dwaddressid.toLong(), dwnumrings.toLong())).toInt()
}

public fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetQueueMeasurementPeriod", longArrayOf(hline.toLong(), dwqueueid.toLong(), dwmeasurementperiod.toLong())).toInt()
}

public fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetStatusMessages", longArrayOf(hline.toLong(), dwlinestates.toLong(), dwaddressstates.toLong())).toInt()
}

public fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetTerminal", longArrayOf(hline.toLong(), dwaddressid.toLong(), hcall.toLong(), dwselect.toLong(), dwterminalmodes.toLong(), dwterminalid.toLong(), benable.toLong())).toInt()
}

public fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetTollList", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lpszaddressin, dwtolllistoption.toLong())).toInt()
}

public fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetTollListA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lpszaddressin, dwtolllistoption.toLong())).toInt()
}

public fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: PCWSTR, dwtolllistoption: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetTollListW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), lpszaddressinw, dwtolllistoption.toLong())).toInt()
}

public fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupConference", longArrayOf(hcall.toLong(), hline.toLong(), lphconfcall, lphconsultcall, dwnumparties.toLong(), lpcallparams)).toInt()
}

public fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupConferenceA", longArrayOf(hcall.toLong(), hline.toLong(), lphconfcall, lphconsultcall, dwnumparties.toLong(), lpcallparams)).toInt()
}

public fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupConferenceW", longArrayOf(hcall.toLong(), hline.toLong(), lphconfcall, lphconsultcall, dwnumparties.toLong(), lpcallparams)).toInt()
}

public fun lineSetupTransfer(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupTransfer", longArrayOf(hcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineSetupTransferA(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupTransferA", longArrayOf(hcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineSetupTransferW(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSetupTransferW", longArrayOf(hcall.toLong(), lphconsultcall, lpcallparams)).toInt()
}

public fun lineShutdown(hlineapp: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineShutdown", longArrayOf(hlineapp.toLong())).toInt()
}

public fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineSwapHold", longArrayOf(hactivecall.toLong(), hheldcall.toLong())).toInt()
}

public fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateAddress", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), lpszaddressin, dwcard.toLong(), dwtranslateoptions.toLong(), lptranslateoutput)).toInt()
}

public fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateAddressA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), lpszaddressin, dwcard.toLong(), dwtranslateoptions.toLong(), lptranslateoutput)).toInt()
}

public fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCWSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateAddressW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), lpszaddressin, dwcard.toLong(), dwtranslateoptions.toLong(), lptranslateoutput)).toInt()
}

public fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateDialog", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), hwndowner, lpszaddressin)).toInt()
}

public fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateDialogA", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), hwndowner, lpszaddressin)).toInt()
}

public fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineTranslateDialogW", longArrayOf(hlineapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), hwndowner, lpszaddressin)).toInt()
}

public fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineUncompleteCall", longArrayOf(hline.toLong(), dwcompletionid.toLong())).toInt()
}

public fun lineUnhold(hcall: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineUnhold", longArrayOf(hcall.toLong())).toInt()
}

public fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineUnpark", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress)).toInt()
}

public fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineUnparkA", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress)).toInt()
}

public fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "lineUnparkW", longArrayOf(hline.toLong(), dwaddressid.toLong(), lphcall, lpszdestaddress)).toInt()
}

public fun phoneClose(hphone: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneClose", longArrayOf(hphone.toLong())).toInt()
}

public fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneConfigDialog", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneConfigDialogA", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneConfigDialogW", longArrayOf(dwdeviceid.toLong(), hwndowner, lpszdeviceclass)).toInt()
}

public fun phoneDevSpecific(hphone: UInt, lpparams: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneDevSpecific", longArrayOf(hphone.toLong(), lpparams, dwsize.toLong())).toInt()
}

public fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetButtonInfo", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetButtonInfoA", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetButtonInfoW", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetData", longArrayOf(hphone.toLong(), dwdataid.toLong(), lpdata, dwsize.toLong())).toInt()
}

public fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetDevCaps", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpphonecaps)).toInt()
}

public fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetDevCapsA", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpphonecaps)).toInt()
}

public fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetDevCapsW", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextversion.toLong(), lpphonecaps)).toInt()
}

public fun phoneGetDisplay(hphone: UInt, lpdisplay: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetDisplay", longArrayOf(hphone.toLong(), lpdisplay)).toInt()
}

public fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetGain", longArrayOf(hphone.toLong(), dwhookswitchdev.toLong(), lpdwgain)).toInt()
}

public fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetHookSwitch", longArrayOf(hphone.toLong(), lpdwhookswitchdevs)).toInt()
}

public fun phoneGetID(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetID", longArrayOf(hphone.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun phoneGetIDA(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetIDA", longArrayOf(hphone.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun phoneGetIDW(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetIDW", longArrayOf(hphone.toLong(), lpdeviceid, lpszdeviceclass)).toInt()
}

public fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetIcon", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetIconA", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetIconW", longArrayOf(dwdeviceid.toLong(), lpszdeviceclass, lphicon)).toInt()
}

public fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetLamp", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpdwlampmode)).toInt()
}

public fun phoneGetMessage(hphoneapp: UInt, lpmessage: Long, dwtimeout: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetMessage", longArrayOf(hphoneapp.toLong(), lpmessage, dwtimeout.toLong())).toInt()
}

public fun phoneGetRing(hphone: UInt, lpdwringmode: Long, lpdwvolume: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetRing", longArrayOf(hphone.toLong(), lpdwringmode, lpdwvolume)).toInt()
}

public fun phoneGetStatus(hphone: UInt, lpphonestatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetStatus", longArrayOf(hphone.toLong(), lpphonestatus)).toInt()
}

public fun phoneGetStatusA(hphone: UInt, lpphonestatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetStatusA", longArrayOf(hphone.toLong(), lpphonestatus)).toInt()
}

public fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetStatusMessages", longArrayOf(hphone.toLong(), lpdwphonestates, lpdwbuttonmodes, lpdwbuttonstates)).toInt()
}

public fun phoneGetStatusW(hphone: UInt, lpphonestatus: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetStatusW", longArrayOf(hphone.toLong(), lpphonestatus)).toInt()
}

public fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneGetVolume", longArrayOf(hphone.toLong(), dwhookswitchdev.toLong(), lpdwvolume)).toInt()
}

public fun phoneInitialize(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneInitialize", longArrayOf(lphphoneapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszappname, lpdwnumdevs)).toInt()
}

public fun phoneInitializeExA(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneInitializeExA", longArrayOf(lphphoneapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams)).toInt()
}

public fun phoneInitializeExW(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneInitializeExW", longArrayOf(lphphoneapp, hinstance, Win32DynamicFfi.objectSlot(lpfncallback), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams)).toInt()
}

public fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneNegotiateAPIVersion", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), dwapilowversion.toLong(), dwapihighversion.toLong(), lpdwapiversion, lpextensionid)).toInt()
}

public fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneNegotiateExtVersion", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), dwapiversion.toLong(), dwextlowversion.toLong(), dwexthighversion.toLong(), lpdwextversion)).toInt()
}

public fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneOpen", longArrayOf(hphoneapp.toLong(), dwdeviceid.toLong(), lphphone, dwapiversion.toLong(), dwextversion.toLong(), dwcallbackinstance.toLong(), dwprivilege.toLong())).toInt()
}

public fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetButtonInfo", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetButtonInfoA", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetButtonInfoW", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), lpbuttoninfo)).toInt()
}

public fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetData", longArrayOf(hphone.toLong(), dwdataid.toLong(), lpdata, dwsize.toLong())).toInt()
}

public fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: PCSTR, dwsize: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetDisplay", longArrayOf(hphone.toLong(), dwrow.toLong(), dwcolumn.toLong(), lpsdisplay, dwsize.toLong())).toInt()
}

public fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetGain", longArrayOf(hphone.toLong(), dwhookswitchdev.toLong(), dwgain.toLong())).toInt()
}

public fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetHookSwitch", longArrayOf(hphone.toLong(), dwhookswitchdevs.toLong(), dwhookswitchmode.toLong())).toInt()
}

public fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetLamp", longArrayOf(hphone.toLong(), dwbuttonlampid.toLong(), dwlampmode.toLong())).toInt()
}

public fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetRing", longArrayOf(hphone.toLong(), dwringmode.toLong(), dwvolume.toLong())).toInt()
}

public fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetStatusMessages", longArrayOf(hphone.toLong(), dwphonestates.toLong(), dwbuttonmodes.toLong(), dwbuttonstates.toLong())).toInt()
}

public fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneSetVolume", longArrayOf(hphone.toLong(), dwhookswitchdev.toLong(), dwvolume.toLong())).toInt()
}

public fun phoneShutdown(hphoneapp: UInt): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "phoneShutdown", longArrayOf(hphoneapp.toLong())).toInt()
}

public fun tapiGetLocationInfo(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiGetLocationInfo", longArrayOf(lpszcountrycode, lpszcitycode)).toInt()
}

public fun tapiGetLocationInfoA(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiGetLocationInfoA", longArrayOf(lpszcountrycode, lpszcitycode)).toInt()
}

public fun tapiGetLocationInfoW(lpszcountrycodew: PWSTR, lpszcitycodew: PWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiGetLocationInfoW", longArrayOf(lpszcountrycodew, lpszcitycodew)).toInt()
}

public fun tapiRequestDrop(hwnd: HWND, wrequestid: WPARAM): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestDrop", longArrayOf(hwnd, wrequestid.toLong())).toInt()
}

public fun tapiRequestMakeCall(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMakeCall", longArrayOf(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}

public fun tapiRequestMakeCallA(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMakeCallA", longArrayOf(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}

public fun tapiRequestMakeCallW(lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMakeCallW", longArrayOf(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}

public fun tapiRequestMediaCall(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMediaCall", longArrayOf(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toLong(), dwsecure.toLong(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}

public fun tapiRequestMediaCallA(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMediaCallA", longArrayOf(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toLong(), dwsecure.toLong(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}

public fun tapiRequestMediaCallW(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCWSTR, lpdeviceid: PCWSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int {
    return Win32DynamicFfi.invoke("tapi32.dll", "tapiRequestMediaCallW", longArrayOf(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toLong(), dwsecure.toLong(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)).toInt()
}
