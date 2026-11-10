@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.COpaquePointer
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
    external fun windowssys_windows_win32_devices_tapi_getTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_openTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpptnef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_openTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpadressbook: Long, lpptnef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAccept(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAddProvider(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAddProviderA(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAddProviderW(lpszproviderfilename: Long, hwndowner: Long, lpdwpermanentproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall: Int, hconsultcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline: Int, dwaddressid: Int, dwagentextensionidindex: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineAnswer(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall: Int, lpszdestaddressw: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineClose(hline: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall: Int, lpdwcompletionid: Long, dwcompletionmode: Int, dwmessageid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall: Int, hconsultcall: Int, lphconfcall: Long, dwtransfermode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long, lpdeviceconfigin: Long, dwsize: Int, lpdeviceconfigout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineConfigProvider(hwndowner: Long, dwpermanentproviderid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline: Int, lpszagentid: Long, lpszagentpin: Long, lphagent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline: Int, hagent: Int, lpszagentpin: Long, dwworkingaddressid: Int, lpgroupid: Long, lphagentsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline: Int, hagent: Int, lpszagentpin: Long, dwworkingaddressid: Int, lpgroupid: Long, lphagentsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline: Int, lpszagentid: Long, lpszagentpin: Long, lphagent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDevSpecific(hline: Int, dwaddressid: Int, hcall: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline: Int, dwfeature: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDial(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDialA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDialW(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineDrop(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineForward(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineForwardA(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineForwardW(hline: Int, balladdresses: Int, dwaddressid: Int, lpforwardlist: Long, dwnumringsnoanswer: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall: Int, dwdigitmodes: Int, lpsdigits: Long, dwnumdigits: Int, lpszterminationdigits: Long, dwfirstdigittimeout: Int, dwinterdigittimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall: Int, dwdigitmode: Int, lpszdigits: Long, dwduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall: Int, dwtonemode: Int, dwduration: Int, dwnumtones: Int, lptones: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwapiversion: Int, dwextversion: Int, lpaddresscaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressID(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline: Int, lpdwaddressid: Long, dwaddressmode: Int, lpsaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline: Int, dwaddressid: Int, lpaddressstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline: Int, dwaddressid: Int, lpagentactivitylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline: Int, dwaddressid: Int, lpagentactivitylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwappapiversion: Int, lpagentcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp: Int, dwdeviceid: Int, dwaddressid: Int, dwappapiversion: Int, lpagentcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline: Int, hagent: Int, lpagentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline: Int, hagentsession: Int, lpagentsessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline: Int, hagent: Int, lpagentsessionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline: Int, dwaddressid: Int, lpagentstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline: Int, dwaddressid: Int, lpagentstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAppPriority(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAppPriorityA(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetAppPriorityW(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpextensionname: Long, lpdwpriority: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall: Int, lpcallinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall: Int, lpcallstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall: Int, lpcalllist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid: Int, dwapiversion: Int, lplinecountrylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lplinedevcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid: Int, lpdeviceconfig: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline: Int, lpgrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline: Int, lpgrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetID(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetIDA(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetIDW(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline: Int, lplinedevstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp: Int, lpmessage: Long, dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline: Int, dwaddressid: Int, dwselect: Int, lpcalllist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetNumRings(hline: Int, dwaddressid: Int, lpdwnumrings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion: Int, lpproviderlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp: Int, dwdeviceid: Int, dwappapiversion: Int, lplineproxyreqestlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline: Int, dwqueueid: Int, lplinequeueinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline: Int, lpgroupid: Long, lpqueuelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline: Int, lpgroupid: Long, lpqueuelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp: Int, dwrequestmode: Int, lprequestbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline: Int, lpdwlinestates: Long, lpdwaddressstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp: Int, dwapiversion: Int, lptranslatecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineHandoff(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineHandoffA(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineHandoffW(hcall: Int, lpszfilename: Long, dwmediamode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineHold(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineInitialize(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszappname: Long, lpdwnumdevs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineInitializeExA(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineInitializeExW(lphlineapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMakeCall(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMakeCallA(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMakeCallW(hline: Int, lphcall: Long, lpszdestaddress: Long, dwcountrycode: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall: Int, dwdigitmodes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall: Int, dwmediamodes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall: Int, lptonelist: Long, dwnumentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp: Int, dwdeviceid: Int, dwapilowversion: Int, dwapihighversion: Int, lpdwapiversion: Long, lpextensionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextlowversion: Int, dwexthighversion: Int, lpdwextversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineOpen(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp: Int, dwdeviceid: Int, lphline: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivileges: Int, dwmediamodes: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePark(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineParkA(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineParkW(hcall: Int, dwparkmode: Int, lpszdiraddress: Long, lpnondiraddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePickup(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePickupA(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePickupW(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long, lpszgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineProxyMessage(hline: Int, hcall: Int, dwmsg: Int, dwparam1: Int, dwparam2: Int, dwparam3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineProxyResponse(hline: Int, lpproxyrequest: Long, dwresult: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRedirect(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRedirectA(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRedirectW(hcall: Int, lpszdestaddress: Long, dwcountrycode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp: Int, dwregistrationinstance: Int, dwrequestmode: Int, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid: Int, hwndowner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSecureCall(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall: Int, lpsuseruserinfo: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline: Int, dwaddressid: Int, dwactivityid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline: Int, dwaddressid: Int, lpagentgrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline: Int, hagent: Int, dwmeasurementperiod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline: Int, hagentsession: Int, dwagentsessionstate: Int, dwnextagentsessionstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentState(hline: Int, dwaddressid: Int, dwagentstate: Int, dwnextagentstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline: Int, hagent: Int, dwagentstate: Int, dwnextagentstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAppPriority(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAppPriorityA(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAppPriorityW(lpszappfilename: Long, dwmediamode: Int, lpextensionid: Long, dwrequestmode: Int, lpszextensionname: Long, dwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall: Int, dwappspecific: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCallData(hcall: Int, lpcalldata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall: Int, dwbearermode: Int, dwminrate: Int, dwmaxrate: Int, lpdialparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall: Int, dwcallprivilege: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall: Int, lpsendingflowspec: Long, dwsendingflowspecsize: Int, lpreceivingflowspec: Long, dwreceivingflowspecsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall: Int, dwtreatment: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp: Int, dwlocation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid: Int, lpdeviceconfig: Long, dwsize: Int, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline: Int, dwstatustochange: Int, fstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, lpdigitlist: Long, dwdigitnumentries: Int, lpmedialist: Long, dwmedianumentries: Int, lptonelist: Long, dwtonenumentries: Int, lpcallstatelist: Long, dwcallstatenumentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetMediaMode(hcall: Int, dwmediamodes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetNumRings(hline: Int, dwaddressid: Int, dwnumrings: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(hline: Int, dwqueueid: Int, dwmeasurementperiod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetStatusMessages(hline: Int, dwlinestates: Int, dwaddressstates: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetTerminal(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, dwterminalmodes: Int, dwterminalid: Int, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp: Int, dwdeviceid: Int, lpszaddressin: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp: Int, dwdeviceid: Int, lpszaddressin: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp: Int, dwdeviceid: Int, lpszaddressinw: Long, dwtolllistoption: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupConference(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall: Int, hline: Int, lphconfcall: Long, lphconsultcall: Long, dwnumparties: Int, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall: Int, lphconsultcall: Long, lpcallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall: Int, hheldcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, lpszaddressin: Long, dwcard: Int, dwtranslateoptions: Int, lptranslateoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp: Int, dwdeviceid: Int, dwapiversion: Int, hwndowner: Long, lpszaddressin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline: Int, dwcompletionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineUnhold(hcall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineUnpark(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineUnparkA(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_lineUnparkW(hline: Int, dwaddressid: Int, lphcall: Long, lpszdestaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneClose(hphone: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid: Int, hwndowner: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone: Int, lpparams: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetData(hphone: Int, dwdataid: Int, lpdata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextversion: Int, lpphonecaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone: Int, lpdisplay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetGain(hphone: Int, dwhookswitchdev: Int, lpdwgain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone: Int, lpdwhookswitchdevs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetID(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone: Int, lpdeviceid: Long, lpszdeviceclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid: Int, lpszdeviceclass: Long, lphicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone: Int, dwbuttonlampid: Int, lpdwlampmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp: Int, lpmessage: Long, dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetRing(hphone: Int, lpdwringmode: Long, lpdwvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone: Int, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone: Int, lpphonestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone: Int, dwhookswitchdev: Int, lpdwvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneInitialize(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszappname: Long, lpdwnumdevs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneInitializeExA(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneInitializeExW(lphphoneapp: Long, hinstance: Long, lpfncallback: Long, lpszfriendlyappname: Long, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp: Int, dwdeviceid: Int, dwapilowversion: Int, dwapihighversion: Int, lpdwapiversion: Long, lpextensionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp: Int, dwdeviceid: Int, dwapiversion: Int, dwextlowversion: Int, dwexthighversion: Int, lpdwextversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp: Int, dwdeviceid: Int, lphphone: Long, dwapiversion: Int, dwextversion: Int, dwcallbackinstance: Long, dwprivilege: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone: Int, dwbuttonlampid: Int, lpbuttoninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetData(hphone: Int, dwdataid: Int, lpdata: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone: Int, dwrow: Int, dwcolumn: Int, lpsdisplay: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetGain(hphone: Int, dwhookswitchdev: Int, dwgain: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(hphone: Int, dwhookswitchdevs: Int, dwhookswitchmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetLamp(hphone: Int, dwbuttonlampid: Int, dwlampmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetRing(hphone: Int, dwringmode: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(hphone: Int, dwphonestates: Int, dwbuttonmodes: Int, dwbuttonstates: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneSetVolume(hphone: Int, dwhookswitchdev: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_phoneShutdown(hphoneapp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiGetLocationInfo(lpszcountrycode: Long, lpszcitycode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA(lpszcountrycode: Long, lpszcitycode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW(lpszcountrycodew: Long, lpszcitycodew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestDrop(hwnd: Long, wrequestid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMakeCall(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW(lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMediaCall(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW(hwnd: Long, wrequestid: Long, lpszdeviceclass: Long, lpdeviceid: Long, dwsize: Int, dwsecure: Int, lpszdestaddress: Long, lpszappname: Long, lpszcalledparty: Long, lpszcomment: Long): Int
}

public actual fun getTnefStreamCodepage(lpstream: COpaquePointer?, lpulcodepage: COpaquePointer?, lpulsubcodepage: COpaquePointer?): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_getTnefStreamCodepage((lpstream?.value ?: 0L), (lpulcodepage?.value ?: 0L), (lpulsubcodepage?.value ?: 0L))

public actual fun openTnefStream(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpptnef: COpaquePointer?): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_openTnefStream((lpvsupport?.value ?: 0L), (lpstream?.value ?: 0L), (lpszstreamname?.value ?: 0L), ulflags.toInt(), (lpmessage?.value ?: 0L), wkeyval.toShort(), (lpptnef?.value ?: 0L))

public actual fun openTnefStreamEx(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpadressbook: COpaquePointer?, lpptnef: COpaquePointer?): Hresult =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_openTnefStreamEx((lpvsupport?.value ?: 0L), (lpstream?.value ?: 0L), (lpszstreamname?.value ?: 0L), ulflags.toInt(), (lpmessage?.value ?: 0L), wkeyval.toShort(), (lpadressbook?.value ?: 0L), (lpptnef?.value ?: 0L))

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAccept(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L), dwsize.toInt())

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProvider((lpszproviderfilename?.value ?: 0L), (hwndowner?.value ?: 0L), (lpdwpermanentproviderid?.value ?: 0L))

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProviderA((lpszproviderfilename?.value ?: 0L), (hwndowner?.value ?: 0L), (lpdwpermanentproviderid?.value ?: 0L))

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProviderW((lpszproviderfilename?.value ?: 0L), (hwndowner?.value ?: 0L), (lpdwpermanentproviderid?.value ?: 0L))

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall.toInt(), hconsultcall.toInt())

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), (lpparams?.value ?: 0L), dwsize.toInt())

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAnswer(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L), dwsize.toInt())

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall.toInt(), (lpszdestaddressw?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineClose(hline: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineClose(hline.toInt())

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: COpaquePointer?, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall.toInt(), (lpdwcompletionid?.value ?: 0L), dwcompletionmode.toInt(), dwmessageid.toInt())

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: COpaquePointer?, dwtransfermode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), (lphconfcall?.value ?: 0L), dwtransfermode.toInt())

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L), (lpdeviceconfigin?.value ?: 0L), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L))

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L), (lpdeviceconfigin?.value ?: 0L), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L))

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L), (lpdeviceconfigin?.value ?: 0L), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L))

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigProvider((hwndowner?.value ?: 0L), dwpermanentproviderid.toInt())

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline.toInt(), (lpszagentid?.value ?: 0L), (lpszagentpin?.value ?: 0L), (lphagent?.value ?: 0L))

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline.toInt(), hagent.toInt(), (lpszagentpin?.value ?: 0L), dwworkingaddressid.toInt(), (lpgroupid?.value ?: 0L), (lphagentsession?.value ?: 0L))

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline.toInt(), hagent.toInt(), (lpszagentpin?.value ?: 0L), dwworkingaddressid.toInt(), (lpgroupid?.value ?: 0L), (lphagentsession?.value ?: 0L))

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline.toInt(), (lpszagentid?.value ?: 0L), (lpszagentpin?.value ?: 0L), (lphagent?.value ?: 0L))

public actual fun lineDeallocateCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall.toInt())

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), (lpparams?.value ?: 0L), dwsize.toInt())

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), (lpparams?.value ?: 0L), dwsize.toInt())

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDial(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDialA(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDialW(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDrop(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L), dwsize.toInt())

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L), dwduration.toInt())

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L), dwduration.toInt())

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L), dwduration.toInt())

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), (lptones?.value ?: 0L))

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L))

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L))

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L))

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressID(hline.toInt(), (lpdwaddressid?.value ?: 0L), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L), dwsize.toInt())

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline.toInt(), (lpdwaddressid?.value ?: 0L), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L), dwsize.toInt())

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline.toInt(), (lpdwaddressid?.value ?: 0L), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L), dwsize.toInt())

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L))

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L))

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L))

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), (lpagentactivitylist?.value ?: 0L))

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), (lpagentactivitylist?.value ?: 0L))

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), (lpagentcaps?.value ?: 0L))

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), (lpagentcaps?.value ?: 0L))

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L))

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L))

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline.toInt(), hagent.toInt(), (lpagentinfo?.value ?: 0L))

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), (lpagentsessioninfo?.value ?: 0L))

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline.toInt(), hagent.toInt(), (lpagentsessionlist?.value ?: 0L))

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), (lpagentstatus?.value ?: 0L))

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), (lpagentstatus?.value ?: 0L))

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriority((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L), (lpdwpriority?.value ?: 0L))

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriorityA((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L), (lpdwpriority?.value ?: 0L))

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriorityW((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L), (lpdwpriority?.value ?: 0L))

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall.toInt(), (lpcallinfo?.value ?: 0L))

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall.toInt(), (lpcallinfo?.value ?: 0L))

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall.toInt(), (lpcallinfo?.value ?: 0L))

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall.toInt(), (lpcallstatus?.value ?: 0L))

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall.toInt(), (lpcalllist?.value ?: 0L))

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L))

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L))

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L))

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L))

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L))

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L))

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline.toInt(), (lpgrouplist?.value ?: 0L))

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline.toInt(), (lpgrouplist?.value ?: 0L))

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline.toInt(), (lplinedevstatus?.value ?: 0L))

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline.toInt(), (lplinedevstatus?.value ?: 0L))

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline.toInt(), (lplinedevstatus?.value ?: 0L))

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp.toInt(), (lpmessage?.value ?: 0L), dwtimeout.toInt())

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), (lpcalllist?.value ?: 0L))

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetNumRings(hline.toInt(), dwaddressid.toInt(), (lpdwnumrings?.value ?: 0L))

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L))

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L))

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L))

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), (lplineproxyreqestlist?.value ?: 0L))

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), (lplinequeueinfo?.value ?: 0L))

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline.toInt(), (lpgroupid?.value ?: 0L), (lpqueuelist?.value ?: 0L))

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline.toInt(), (lpgroupid?.value ?: 0L), (lpqueuelist?.value ?: 0L))

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L))

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L))

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L))

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: COpaquePointer?, lpdwaddressstates: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline.toInt(), (lpdwlinestates?.value ?: 0L), (lpdwaddressstates?.value ?: 0L))

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L))

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L))

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L))

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoff(hcall.toInt(), (lpszfilename?.value ?: 0L), dwmediamode.toInt())

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoffA(hcall.toInt(), (lpszfilename?.value ?: 0L), dwmediamode.toInt())

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoffW(hcall.toInt(), (lpszfilename?.value ?: 0L), dwmediamode.toInt())

public actual fun lineHold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHold(hcall.toInt())

public actual fun lineInitialize(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitialize((lphlineapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L))

public actual fun lineInitializeExA(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitializeExA((lphlineapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszfriendlyappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L), (lpdwapiversion?.value ?: 0L), (lplineinitializeexparams?.value ?: 0L))

public actual fun lineInitializeExW(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitializeExW((lphlineapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszfriendlyappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L), (lpdwapiversion?.value ?: 0L), (lplineinitializeexparams?.value ?: 0L))

public actual fun lineMakeCall(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCall(hline.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineMakeCallA(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCallA(hline.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineMakeCallW(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCallW(hline.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt())

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineMonitorTones(hcall: UInt, lptonelist: COpaquePointer?, dwnumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall.toInt(), (lptonelist?.value ?: 0L), dwnumentries.toInt())

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), (lpdwapiversion?.value ?: 0L), (lpextensionid?.value ?: 0L))

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), (lpdwextversion?.value ?: 0L))

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpen(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L))

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePark(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L), (lpnondiraddress?.value ?: 0L))

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineParkA(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L), (lpnondiraddress?.value ?: 0L))

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineParkW(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L), (lpnondiraddress?.value ?: 0L))

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickup(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), (lpszgroupid?.value ?: 0L))

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickupA(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), (lpszgroupid?.value ?: 0L))

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickupW(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L), (lpszgroupid?.value ?: 0L))

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt())

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: COpaquePointer?, dwresult: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineProxyResponse(hline.toInt(), (lpproxyrequest?.value ?: 0L), dwresult.toInt())

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirect(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirectA(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirectW(hcall.toInt(), (lpszdestaddress?.value ?: 0L), dwcountrycode.toInt())

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt())

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall.toInt())

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall.toInt())

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid.toInt(), (hwndowner?.value ?: 0L))

public actual fun lineSecureCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSecureCall(hcall.toInt())

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L), dwsize.toInt())

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt())

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L))

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt())

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt())

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriority((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L), dwpriority.toInt())

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriorityA((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L), dwpriority.toInt())

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriorityW((lpszappfilename?.value ?: 0L), dwmediamode.toInt(), (lpextensionid?.value ?: 0L), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L), dwpriority.toInt())

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall.toInt(), dwappspecific.toInt())

public actual fun lineSetCallData(hcall: UInt, lpcalldata: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallData(hcall.toInt(), (lpcalldata?.value ?: 0L), dwsize.toInt())

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), (lpdialparams?.value ?: 0L))

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt())

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: COpaquePointer?, dwsendingflowspecsize: UInt, lpreceivingflowspec: COpaquePointer?, dwreceivingflowspecsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall.toInt(), (lpsendingflowspec?.value ?: 0L), dwsendingflowspecsize.toInt(), (lpreceivingflowspec?.value ?: 0L), dwreceivingflowspecsize.toInt())

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall.toInt(), dwtreatment.toInt())

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt())

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L))

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L))

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L))

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt())

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: COpaquePointer?, dwdigitnumentries: UInt, lpmedialist: COpaquePointer?, dwmedianumentries: UInt, lptonelist: COpaquePointer?, dwtonenumentries: UInt, lpcallstatelist: COpaquePointer?, dwcallstatenumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdigitlist?.value ?: 0L), dwdigitnumentries.toInt(), (lpmedialist?.value ?: 0L), dwmedianumentries.toInt(), (lptonelist?.value ?: 0L), dwtonenumentries.toInt(), (lpcallstatelist?.value ?: 0L), dwcallstatenumentries.toInt())

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetMediaMode(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt())

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt())

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt())

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt())

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressin?.value ?: 0L), dwtolllistoption.toInt())

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressin?.value ?: 0L), dwtolllistoption.toInt())

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressinw?.value ?: 0L), dwtolllistoption.toInt())

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConference(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L), (lphconsultcall?.value ?: 0L), dwnumparties.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L), (lphconsultcall?.value ?: 0L), dwnumparties.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L), (lphconsultcall?.value ?: 0L), dwnumparties.toInt(), (lpcallparams?.value ?: 0L))

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall.toInt(), (lphconsultcall?.value ?: 0L), (lpcallparams?.value ?: 0L))

public actual fun lineShutdown(hlineapp: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp.toInt())

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall.toInt(), hheldcall.toInt())

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L))

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L))

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L))

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L), (lpszaddressin?.value ?: 0L))

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L), (lpszaddressin?.value ?: 0L))

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L), (lpszaddressin?.value ?: 0L))

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline.toInt(), dwcompletionid.toInt())

public actual fun lineUnhold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnhold(hcall.toInt())

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnpark(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L))

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnparkA(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L))

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnparkW(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L), (lpszdestaddress?.value ?: 0L))

public actual fun phoneClose(hphone: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneClose(hphone.toInt())

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneDevSpecific(hphone: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone.toInt(), (lpparams?.value ?: 0L), dwsize.toInt())

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetData(hphone.toInt(), dwdataid.toInt(), (lpdata?.value ?: 0L), dwsize.toInt())

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L))

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L))

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L))

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone.toInt(), (lpdisplay?.value ?: 0L))

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), (lpdwgain?.value ?: 0L))

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone.toInt(), (lpdwhookswitchdevs?.value ?: 0L))

public actual fun phoneGetID(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetID(hphone.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone.toInt(), (lpdeviceid?.value ?: 0L), (lpszdeviceclass?.value ?: 0L))

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L), (lphicon?.value ?: 0L))

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), (lpdwlampmode?.value ?: 0L))

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp.toInt(), (lpmessage?.value ?: 0L), dwtimeout.toInt())

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: COpaquePointer?, lpdwvolume: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetRing(hphone.toInt(), (lpdwringmode?.value ?: 0L), (lpdwvolume?.value ?: 0L))

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone.toInt(), (lpphonestatus?.value ?: 0L))

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone.toInt(), (lpphonestatus?.value ?: 0L))

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: COpaquePointer?, lpdwbuttonmodes: COpaquePointer?, lpdwbuttonstates: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone.toInt(), (lpdwphonestates?.value ?: 0L), (lpdwbuttonmodes?.value ?: 0L), (lpdwbuttonstates?.value ?: 0L))

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone.toInt(), (lpphonestatus?.value ?: 0L))

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), (lpdwvolume?.value ?: 0L))

public actual fun phoneInitialize(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitialize((lphphoneapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L))

public actual fun phoneInitializeExA(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitializeExA((lphphoneapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszfriendlyappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L), (lpdwapiversion?.value ?: 0L), (lpphoneinitializeexparams?.value ?: 0L))

public actual fun phoneInitializeExW(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitializeExW((lphphoneapp?.value ?: 0L), (hinstance?.value ?: 0L), 0L, (lpszfriendlyappname?.value ?: 0L), (lpdwnumdevs?.value ?: 0L), (lpdwapiversion?.value ?: 0L), (lpphoneinitializeexparams?.value ?: 0L))

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), (lpdwapiversion?.value ?: 0L), (lpextensionid?.value ?: 0L))

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), (lpdwextversion?.value ?: 0L))

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), (lphphone?.value ?: 0L), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivilege.toInt())

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L))

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetData(hphone.toInt(), dwdataid.toInt(), (lpdata?.value ?: 0L), dwsize.toInt())

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), (lpsdisplay?.value ?: 0L), dwsize.toInt())

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt())

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt())

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt())

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt())

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt())

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt())

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneShutdown(hphoneapp.toInt())

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfo((lpszcountrycode?.value ?: 0L), (lpszcitycode?.value ?: 0L))

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA((lpszcountrycode?.value ?: 0L), (lpszcitycode?.value ?: 0L))

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW((lpszcountrycodew?.value ?: 0L), (lpszcitycodew?.value ?: 0L))

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestDrop((hwnd?.value ?: 0L), wrequestid.toLong())

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCall((lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA((lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW((lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCall((hwnd?.value ?: 0L), wrequestid.toLong(), (lpszdeviceclass?.value ?: 0L), (lpdeviceid?.value ?: 0L), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA((hwnd?.value ?: 0L), wrequestid.toLong(), (lpszdeviceclass?.value ?: 0L), (lpdeviceid?.value ?: 0L), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW((hwnd?.value ?: 0L), wrequestid.toLong(), (lpszdeviceclass?.value ?: 0L), (lpdeviceid?.value ?: 0L), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L), (lpszappname?.value ?: 0L), (lpszcalledparty?.value ?: 0L), (lpszcomment?.value ?: 0L))
