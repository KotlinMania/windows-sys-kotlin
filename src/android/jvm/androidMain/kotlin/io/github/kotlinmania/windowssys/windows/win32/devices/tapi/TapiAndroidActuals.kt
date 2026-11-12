@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

private object WindowsWin32DevicesTapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiOpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpptnef: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpadressbook: Long, lpptnef: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAccept(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAddProvider(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAddProviderA(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAddProviderW(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall: Int, hconsultcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAgentSpecific(hline: Int, dwaddressid: Int, dwagentextensionidindex: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineAnswer(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineBlindTransfer(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineBlindTransferA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineBlindTransferW(hcall: Int, lpszdestaddressw: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineClose(hline: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCompleteCall(hcall: Int, lpdwcompletionid: Long, dwcompletionmode: Int, dwmessageid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCompleteTransfer(hcall: Int, hconsultcall: Int, lphconfcall: Long, dwtransfermode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialog(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialogA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigDialogW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineConfigProvider(hwndowner: Long, dwpermanentproviderid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCreateAgentA(hline: Int, lpszagentid: Long, lpszagentpin: Long, lphagent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(hline: Int, hagent: Int, lpszagentpin: Long, dwworkingaddressid: Int, lpgroupid: Long, lphagentsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(hline: Int, hagent: Int, lpszagentpin: Long, dwworkingaddressid: Int, lpgroupid: Long, lphagentsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineCreateAgentW(hline: Int, lpszagentid: Long, lpszagentpin: Long, lphagent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDevSpecific(hline: Int, dwaddressid: Int, hcall: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(hline: Int, dwfeature: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDial(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDialA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDialW(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineDrop(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineForward(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineForwardA(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineForwardW(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGatherDigits(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGatherDigitsA(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGatherDigitsW(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGenerateDigits(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGenerateTone(hcall: Int, dwtonemode: Int, dwduration: Int, dwnumtones: Int, lptones: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressCaps(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressID(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressIDA(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressIDW(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressStatus(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(hline: Int, dwaddressid: Int, lpagentactivitylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(hline: Int, dwaddressid: Int, lpagentactivitylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwappapiversion: Int, lpagentcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwappapiversion: Int, lpagentcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentInfo(hline: Int, hagent: Int, lpagentinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(hline: Int, hagentsession: Int, lpagentsessioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(hline: Int, hagent: Int, lpagentsessionlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(hline: Int, dwaddressid: Int, lpagentstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(hline: Int, dwaddressid: Int, lpagentstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAppPriority(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCallInfo(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCallInfoA(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCallInfoW(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCallStatus(hcall: Int, lpcallstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(hcall: Int, lpcalllist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCountry(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCountryA(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetCountryW(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevCaps(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevCapsA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevCapsW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevConfig(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevConfigA(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetDevConfigW(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetGroupListA(hline: Int, lpgrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetGroupListW(hline: Int, lpgrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetID(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetIDA(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetIDW(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetIcon(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetIconA(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetIconW(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetMessage(hlineapp: Int, lpmessage: Long, dwtimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetNewCalls(hline: Int, dwaddressid: Int, dwselect: Int, lpcalllist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetNumRings(hline: Int, dwaddressid: Int, lpdwnumrings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetProviderList(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetProviderListA(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetProviderListW(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetProxyStatus(hlineapp: Int, dwdeviceid: Int, dwappapiversion: Int, lplineproxyreqestlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetQueueInfo(hline: Int, dwqueueid: Int, lplinequeueinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetQueueListA(hline: Int, lpgroupid: Long, lpqueuelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetQueueListW(hline: Int, lpgroupid: Long, lpqueuelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetRequest(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetRequestA(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetRequestW(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetStatusMessages(hline: Int, lpdwlinestates: Long, lpdwaddressstates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineHandoff(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineHandoffA(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineHandoffW(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineHold(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineInitialize(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszappname: Long, lpdwnumdevs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineInitializeExA(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineInitializeExW(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMakeCall(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMakeCallA(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMakeCallW(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall: Int, dwdigitmodes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall: Int, dwmediamodes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineMonitorTones(hcall: Int, lptonelist: Long, dwnumentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(hlineapp: Int, dwdeviceid: Int, dwapilowversion: Int, dwapihighversion: Int, lpdwapiversion: Long, lpextensionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextlowversion: Int, dwexthighversion: Int, lpdwextversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineOpen(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineOpenA(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineOpenW(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePark(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineParkA(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineParkW(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePickup(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePickupA(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePickupW(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineProxyMessage(hline: Int, hcall: Int, dwmsg: Int, dwparam1: Int, dwparam2: Int, dwparam3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineProxyResponse(hline: Int, lpproxyrequest: Long, dwresult: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRedirect(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRedirectA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRedirectW(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp: Int, dwregistrationinstance: Int, dwrequestmode: Int, benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineRemoveProvider(dwpermanentproviderid: Int, hwndowner: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSecureCall(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline: Int, dwaddressid: Int, dwactivityid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentGroup(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline: Int, hagent: Int, dwmeasurementperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline: Int, hagentsession: Int, dwagentsessionstate: Int, dwnextagentsessionstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentState(hline: Int, dwaddressid: Int, dwagentstate: Int, dwnextagentstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline: Int, hagent: Int, dwagentstate: Int, dwnextagentstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAppPriority(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall: Int, dwappspecific: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCallData(hcall: Int, lpcalldata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCallParams(hcall: Int, dwbearermode: Int, dwminrate: Int, dwmaxrate: Int, lpdialparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall: Int, dwcallprivilege: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(hcall: Int, lpsendingflowspec: Long, dwsendingflowspecsize: Int, lpreceivingflowspec: Long, dwreceivingflowspecsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall: Int, dwtreatment: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp: Int, dwlocation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetDevConfig(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetDevConfigA(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetDevConfigW(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline: Int, dwstatustochange: Int, fstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetMediaControl(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdigitlist: Long, dwdigitnumentries: Int, lpmedialist: Long, dwmedianumentries: Int, lptonelist: Long, dwtonenumentries: Int, lpcallstatelist: Long, dwcallstatenumentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall: Int, dwmediamodes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetNumRings(hline: Int, dwaddressid: Int, dwnumrings: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline: Int, dwqueueid: Int, dwmeasurementperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline: Int, dwlinestates: Int, dwaddressstates: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetTerminal(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, dwterminalmodes: Int, dwterminalid: Int, benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetTollList(hlineapp: Int, dwdeviceid: Int, lpszaddressin: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetTollListA(hlineapp: Int, dwdeviceid: Int, lpszaddressin: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetTollListW(hlineapp: Int, dwdeviceid: Int, lpszaddressinw: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupConference(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupConferenceA(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupConferenceW(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupTransfer(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupTransferA(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSetupTransferW(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineShutdown(hlineapp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall: Int, hheldcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateAddress(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateAddressA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateAddressW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateDialog(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateDialogA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineTranslateDialogW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineUncompleteCall(hline: Int, dwcompletionid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineUnhold(hcall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineUnpark(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineUnparkA(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiLineUnparkW(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneClose(hphone: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneConfigDialog(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneDevSpecific(hphone: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetData(hphone: Int, dwdataid: Int, lpdata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetDisplay(hphone: Int, lpdisplay: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetGain(hphone: Int, dwhookswitchdev: Int, lpdwgain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(hphone: Int, lpdwhookswitchdevs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetID(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetIDA(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetIDW(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetIcon(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetIconA(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetIconW(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetLamp(hphone: Int, dwbuttonlampid: Int, lpdwlampmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetMessage(hphoneapp: Int, lpmessage: Long, dwtimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetRing(hphone: Int, lpdwringmode: Long, lpdwvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetStatus(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetStatusA(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(hphone: Int, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetStatusW(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneGetVolume(hphone: Int, dwhookswitchdev: Int, lpdwvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneInitialize(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszappname: Long, lpdwnumdevs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneInitializeExA(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneInitializeExW(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(hphoneapp: Int, dwdeviceid: Int, dwapilowversion: Int, dwapihighversion: Int, lpdwapiversion: Long, lpextensionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextlowversion: Int, dwexthighversion: Int, lpdwextversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneOpen(hphoneapp: Int, dwdeviceid: Int, lphphone: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivilege: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetData(hphone: Int, dwdataid: Int, lpdata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetDisplay(hphone: Int, dwrow: Int, dwcolumn: Int, lpsdisplay: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetGain(hphone: Int, dwhookswitchdev: Int, dwgain: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone: Int, dwhookswitchdevs: Int, dwhookswitchmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone: Int, dwbuttonlampid: Int, dwlampmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetRing(hphone: Int, dwringmode: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone: Int, dwphonestates: Int, dwbuttonmodes: Int, dwbuttonstates: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone: Int, dwhookswitchdev: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(lpszcountrycode: Long, lpszcitycode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(lpszcountrycode: Long, lpszcitycode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(lpszcountrycodew: Long, lpszcitycodew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestDrop(hwnd: Long, wrequestid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int
}

public actual fun getTnefStreamCodepage(lpstream: MutPtr, lpulcodepage: MutPtr, lpulsubcodepage: MutPtr): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(lpstream.rawAddress, lpulcodepage.rawAddress, lpulsubcodepage.rawAddress)

public actual fun openTnefStream(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpptnef: MutPtr): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiOpenTnefStream(lpvsupport.rawAddress, lpstream.rawAddress, lpszstreamname.rawAddress, ulflags.toInt(), lpmessage.rawAddress, wkeyval.toShort(), lpptnef.rawAddress)

public actual fun openTnefStreamEx(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpadressbook: MutPtr, lpptnef: MutPtr): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(lpvsupport.rawAddress, lpstream.rawAddress, lpszstreamname.rawAddress, ulflags.toInt(), lpmessage.rawAddress, wkeyval.toShort(), lpadressbook.rawAddress, lpptnef.rawAddress)

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAccept(hcall.toInt(), lpsuseruserinfo.rawAddress, dwsize.toInt())

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAddProvider(lpszproviderfilename.rawAddress, hwndowner.rawAddress, lpdwpermanentproviderid.rawAddress)

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAddProviderA(lpszproviderfilename.rawAddress, hwndowner.rawAddress, lpdwpermanentproviderid.rawAddress)

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAddProviderW(lpszproviderfilename.rawAddress, hwndowner.rawAddress, lpdwpermanentproviderid.rawAddress)

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall.toInt(), hconsultcall.toInt())

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), lpparams.rawAddress, dwsize.toInt())

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineAnswer(hcall.toInt(), lpsuseruserinfo.rawAddress, dwsize.toInt())

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineBlindTransfer(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineBlindTransferA(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineBlindTransferW(hcall.toInt(), lpszdestaddressw.rawAddress, dwcountrycode.toInt())

public actual fun lineClose(hline: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineClose(hline.toInt())

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCompleteCall(hcall.toInt(), lpdwcompletionid.rawAddress, dwcompletionmode.toInt(), dwmessageid.toInt())

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr, dwtransfermode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), lphconfcall.rawAddress, dwtransfermode.toInt())

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress, lpdeviceconfigin.rawAddress, dwsize.toInt(), lpdeviceconfigout.rawAddress)

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress, lpdeviceconfigin.rawAddress, dwsize.toInt(), lpdeviceconfigout.rawAddress)

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress, lpdeviceconfigin.rawAddress, dwsize.toInt(), lpdeviceconfigout.rawAddress)

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineConfigProvider(hwndowner.rawAddress, dwpermanentproviderid.toInt())

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCreateAgentA(hline.toInt(), lpszagentid.rawAddress, lpszagentpin.rawAddress, lphagent.rawAddress)

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress, dwworkingaddressid.toInt(), lpgroupid.rawAddress, lphagentsession.rawAddress)

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress, dwworkingaddressid.toInt(), lpgroupid.rawAddress, lphagentsession.rawAddress)

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineCreateAgentW(hline.toInt(), lpszagentid.rawAddress, lpszagentpin.rawAddress, lphagent.rawAddress)

public actual fun lineDeallocateCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall.toInt())

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), lpparams.rawAddress, dwsize.toInt())

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), lpparams.rawAddress, dwsize.toInt())

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDial(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDialA(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDialW(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineDrop(hcall.toInt(), lpsuseruserinfo.rawAddress, dwsize.toInt())

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress, dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress, dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress, dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress, dwnumdigits.toInt(), lpszterminationdigits.rawAddress, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress, dwnumdigits.toInt(), lpszterminationdigits.rawAddress, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress, dwnumdigits.toInt(), lpszterminationdigits.rawAddress, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress, dwduration.toInt())

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress, dwduration.toInt())

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress, dwduration.toInt())

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), lptones.rawAddress)

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress)

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress)

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress)

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressID(hline.toInt(), lpdwaddressid.rawAddress, dwaddressmode.toInt(), lpsaddress.rawAddress, dwsize.toInt())

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressIDA(hline.toInt(), lpdwaddressid.rawAddress, dwaddressmode.toInt(), lpsaddress.rawAddress, dwsize.toInt())

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressIDW(hline.toInt(), lpdwaddressid.rawAddress, dwaddressmode.toInt(), lpsaddress.rawAddress, dwsize.toInt())

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress)

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress)

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress)

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress)

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress)

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress)

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress)

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress)

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress)

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentInfo(hline.toInt(), hagent.toInt(), lpagentinfo.rawAddress)

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), lpagentsessioninfo.rawAddress)

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(hline.toInt(), hagent.toInt(), lpagentsessionlist.rawAddress)

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress)

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress)

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAppPriority(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpextensionname.rawAddress, lpdwpriority.rawAddress)

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpextensionname.rawAddress, lpdwpriority.rawAddress)

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpextensionname.rawAddress, lpdwpriority.rawAddress)

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCallInfo(hcall.toInt(), lpcallinfo.rawAddress)

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCallInfoA(hcall.toInt(), lpcallinfo.rawAddress)

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCallInfoW(hcall.toInt(), lpcallinfo.rawAddress)

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCallStatus(hcall.toInt(), lpcallstatus.rawAddress)

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(hcall.toInt(), lpcalllist.rawAddress)

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress)

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress)

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress)

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress)

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress)

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress)

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetGroupListA(hline.toInt(), lpgrouplist.rawAddress)

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetGroupListW(hline.toInt(), lpgrouplist.rawAddress)

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(hline.toInt(), lplinedevstatus.rawAddress)

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(hline.toInt(), lplinedevstatus.rawAddress)

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(hline.toInt(), lplinedevstatus.rawAddress)

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetMessage(hlineapp.toInt(), lpmessage.rawAddress, dwtimeout.toInt())

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), lpcalllist.rawAddress)

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetNumRings(hline.toInt(), dwaddressid.toInt(), lpdwnumrings.rawAddress)

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetProviderList(dwapiversion.toInt(), lpproviderlist.rawAddress)

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetProviderListA(dwapiversion.toInt(), lpproviderlist.rawAddress)

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetProviderListW(dwapiversion.toInt(), lpproviderlist.rawAddress)

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), lplineproxyreqestlist.rawAddress)

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), lplinequeueinfo.rawAddress)

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetQueueListA(hline.toInt(), lpgroupid.rawAddress, lpqueuelist.rawAddress)

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetQueueListW(hline.toInt(), lpgroupid.rawAddress, lpqueuelist.rawAddress)

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress)

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress)

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress)

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr, lpdwaddressstates: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetStatusMessages(hline.toInt(), lpdwlinestates.rawAddress, lpdwaddressstates.rawAddress)

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress)

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress)

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress)

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineHandoff(hcall.toInt(), lpszfilename.rawAddress, dwmediamode.toInt())

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineHandoffA(hcall.toInt(), lpszfilename.rawAddress, dwmediamode.toInt())

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineHandoffW(hcall.toInt(), lpszfilename.rawAddress, dwmediamode.toInt())

public actual fun lineHold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineHold(hcall.toInt())

public actual fun lineInitialize(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineInitialize(lphlineapp.rawAddress, hinstance.rawAddress, 0L, lpszappname.rawAddress, lpdwnumdevs.rawAddress)

public actual fun lineInitializeExA(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineInitializeExA(lphlineapp.rawAddress, hinstance.rawAddress, 0L, lpszfriendlyappname.rawAddress, lpdwnumdevs.rawAddress, lpdwapiversion.rawAddress, lplineinitializeexparams.rawAddress)

public actual fun lineInitializeExW(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineInitializeExW(lphlineapp.rawAddress, hinstance.rawAddress, 0L, lpszfriendlyappname.rawAddress, lpdwnumdevs.rawAddress, lpdwapiversion.rawAddress, lplineinitializeexparams.rawAddress)

public actual fun lineMakeCall(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMakeCall(hline.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, dwcountrycode.toInt(), lpcallparams.rawAddress)

public actual fun lineMakeCallA(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMakeCallA(hline.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, dwcountrycode.toInt(), lpcallparams.rawAddress)

public actual fun lineMakeCallW(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMakeCallW(hline.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, dwcountrycode.toInt(), lpcallparams.rawAddress)

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt())

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr, dwnumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineMonitorTones(hcall.toInt(), lptonelist.rawAddress, dwnumentries.toInt())

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress, lpextensionid.rawAddress)

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress)

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineOpen(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress)

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress)

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress)

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePark(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress, lpnondiraddress.rawAddress)

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineParkA(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress, lpnondiraddress.rawAddress)

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineParkW(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress, lpnondiraddress.rawAddress)

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePickup(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, lpszgroupid.rawAddress)

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePickupA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, lpszgroupid.rawAddress)

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePickupW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress, lpszgroupid.rawAddress)

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(hconfcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(hconfcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(hconfcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt())

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr, dwresult: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineProxyResponse(hline.toInt(), lpproxyrequest.rawAddress, dwresult.toInt())

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRedirect(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRedirectA(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRedirectW(hcall.toInt(), lpszdestaddress.rawAddress, dwcountrycode.toInt())

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt())

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall.toInt())

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall.toInt())

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineRemoveProvider(dwpermanentproviderid.toInt(), hwndowner.rawAddress)

public actual fun lineSecureCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSecureCall(hcall.toInt())

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(hcall.toInt(), lpsuseruserinfo.rawAddress, dwsize.toInt())

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt())

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress)

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt())

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt())

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAppPriority(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpszextensionname.rawAddress, dwpriority.toInt())

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpszextensionname.rawAddress, dwpriority.toInt())

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(lpszappfilename.rawAddress, dwmediamode.toInt(), lpextensionid.rawAddress, dwrequestmode.toInt(), lpszextensionname.rawAddress, dwpriority.toInt())

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall.toInt(), dwappspecific.toInt())

public actual fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCallData(hcall.toInt(), lpcalldata.rawAddress, dwsize.toInt())

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), lpdialparams.rawAddress)

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt())

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr, dwreceivingflowspecsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(hcall.toInt(), lpsendingflowspec.rawAddress, dwsendingflowspecsize.toInt(), lpreceivingflowspec.rawAddress, dwreceivingflowspecsize.toInt())

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall.toInt(), dwtreatment.toInt())

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt())

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, dwsize.toInt(), lpszdeviceclass.rawAddress)

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, dwsize.toInt(), lpszdeviceclass.rawAddress)

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress, dwsize.toInt(), lpszdeviceclass.rawAddress)

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt())

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr, dwdigitnumentries: UInt, lpmedialist: ConstPtr, dwmedianumentries: UInt, lptonelist: ConstPtr, dwtonenumentries: UInt, lpcallstatelist: ConstPtr, dwcallstatenumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdigitlist.rawAddress, dwdigitnumentries.toInt(), lpmedialist.rawAddress, dwmedianumentries.toInt(), lptonelist.rawAddress, dwtonenumentries.toInt(), lpcallstatelist.rawAddress, dwcallstatenumentries.toInt())

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt())

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt())

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt())

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt())

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress, dwtolllistoption.toInt())

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress, dwtolllistoption.toInt())

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressinw.rawAddress, dwtolllistoption.toInt())

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupConference(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress, lphconsultcall.rawAddress, dwnumparties.toInt(), lpcallparams.rawAddress)

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupConferenceA(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress, lphconsultcall.rawAddress, dwnumparties.toInt(), lpcallparams.rawAddress)

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupConferenceW(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress, lphconsultcall.rawAddress, dwnumparties.toInt(), lpcallparams.rawAddress)

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupTransfer(hcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupTransferA(hcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSetupTransferW(hcall.toInt(), lphconsultcall.rawAddress, lpcallparams.rawAddress)

public actual fun lineShutdown(hlineapp: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineShutdown(hlineapp.toInt())

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall.toInt(), hheldcall.toInt())

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress)

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress)

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress)

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress, lpszaddressin.rawAddress)

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress, lpszaddressin.rawAddress)

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress, lpszaddressin.rawAddress)

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineUncompleteCall(hline.toInt(), dwcompletionid.toInt())

public actual fun lineUnhold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineUnhold(hcall.toInt())

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineUnpark(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress)

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineUnparkA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress)

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiLineUnparkW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress, lpszdestaddress.rawAddress)

public actual fun phoneClose(hphone: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneClose(hphone.toInt())

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneDevSpecific(hphone.toInt(), lpparams.rawAddress, dwsize.toInt())

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress, dwsize.toInt())

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress)

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress)

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress)

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetDisplay(hphone.toInt(), lpdisplay.rawAddress)

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), lpdwgain.rawAddress)

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(hphone.toInt(), lpdwhookswitchdevs.rawAddress)

public actual fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetID(hphone.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetIDA(hphone.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetIDW(hphone.toInt(), lpdeviceid.rawAddress, lpszdeviceclass.rawAddress)

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress, lphicon.rawAddress)

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), lpdwlampmode.rawAddress)

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetMessage(hphoneapp.toInt(), lpmessage.rawAddress, dwtimeout.toInt())

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr, lpdwvolume: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetRing(hphone.toInt(), lpdwringmode.rawAddress, lpdwvolume.rawAddress)

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetStatus(hphone.toInt(), lpphonestatus.rawAddress)

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetStatusA(hphone.toInt(), lpphonestatus.rawAddress)

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr, lpdwbuttonmodes: MutPtr, lpdwbuttonstates: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(hphone.toInt(), lpdwphonestates.rawAddress, lpdwbuttonmodes.rawAddress, lpdwbuttonstates.rawAddress)

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetStatusW(hphone.toInt(), lpphonestatus.rawAddress)

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), lpdwvolume.rawAddress)

public actual fun phoneInitialize(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneInitialize(lphphoneapp.rawAddress, hinstance.rawAddress, 0L, lpszappname.rawAddress, lpdwnumdevs.rawAddress)

public actual fun phoneInitializeExA(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneInitializeExA(lphphoneapp.rawAddress, hinstance.rawAddress, 0L, lpszfriendlyappname.rawAddress, lpdwnumdevs.rawAddress, lpdwapiversion.rawAddress, lpphoneinitializeexparams.rawAddress)

public actual fun phoneInitializeExW(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneInitializeExW(lphphoneapp.rawAddress, hinstance.rawAddress, 0L, lpszfriendlyappname.rawAddress, lpdwnumdevs.rawAddress, lpdwapiversion.rawAddress, lpphoneinitializeexparams.rawAddress)

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress, lpextensionid.rawAddress)

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress)

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), lphphone.rawAddress, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivilege.toInt())

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress)

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress, dwsize.toInt())

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), lpsdisplay.rawAddress, dwsize.toInt())

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt())

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt())

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt())

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt())

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt())

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt())

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp.toInt())

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(lpszcountrycode.rawAddress, lpszcitycode.rawAddress)

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(lpszcountrycode.rawAddress, lpszcitycode.rawAddress)

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(lpszcountrycodew.rawAddress, lpszcitycodew.rawAddress)

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestDrop(hwnd.rawAddress, wrequestid.toLong())

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(hwnd.rawAddress, wrequestid.toLong(), lpszdeviceclass.rawAddress, lpdeviceid.rawAddress, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(hwnd.rawAddress, wrequestid.toLong(), lpszdeviceclass.rawAddress, lpdeviceid.rawAddress, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(hwnd.rawAddress, wrequestid.toLong(), lpszdeviceclass.rawAddress, lpdeviceid.rawAddress, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress, lpszappname.rawAddress, lpszcalledparty.rawAddress, lpszcomment.rawAddress)
