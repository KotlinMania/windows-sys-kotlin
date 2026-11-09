@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

private object WindowsWin32DevicesTapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpptnef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_tapi_OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: Int, lpmessage: Long, wkeyval: Short, lpadressbook: Long, lpptnef: Long): Int

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

public actual fun GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_GetTnefStreamCodepage(lpstream, lpulcodepage, lpulsubcodepage)

public actual fun OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_OpenTnefStream(lpvsupport, lpstream, lpszstreamname, ulflags.toInt(), lpmessage, wkeyval.toShort(), lpptnef)

public actual fun OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_OpenTnefStreamEx(lpvsupport, lpstream, lpszstreamname, ulflags.toInt(), lpmessage, wkeyval.toShort(), lpadressbook, lpptnef)

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAccept(hcall.toInt(), lpsuseruserinfo, dwsize.toInt())

public actual fun lineAddProvider(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProvider(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)

public actual fun lineAddProviderA(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProviderA(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)

public actual fun lineAddProviderW(lpszproviderfilename: PCWSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddProviderW(lpszproviderfilename, hwndowner, lpdwpermanentproviderid)

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall.toInt(), hconsultcall.toInt())

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), lpparams, dwsize.toInt())

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineAnswer(hcall.toInt(), lpsuseruserinfo, dwsize.toInt())

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: PCWSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall.toInt(), lpszdestaddressw, dwcountrycode.toInt())

public actual fun lineClose(hline: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineClose(hline.toInt())

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: Long, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall.toInt(), lpdwcompletionid, dwcompletionmode.toInt(), dwmessageid.toInt())

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: Long, dwtransfermode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), lphconfcall, dwtransfermode.toInt())

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid.toInt(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toInt(), lpdeviceconfigout)

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid.toInt(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toInt(), lpdeviceconfigout)

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid.toInt(), hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize.toInt(), lpdeviceconfigout)

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun lineConfigProvider(hwndowner: HWND, dwpermanentproviderid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineConfigProvider(hwndowner, dwpermanentproviderid.toInt())

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: PCSTR, lpszagentpin: PCSTR, lphagent: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline.toInt(), lpszagentid, lpszagentpin, lphagent)

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: PCSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline.toInt(), hagent.toInt(), lpszagentpin, dwworkingaddressid.toInt(), lpgroupid, lphagentsession)

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: PCWSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline.toInt(), hagent.toInt(), lpszagentpin, dwworkingaddressid.toInt(), lpgroupid, lphagentsession)

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: PCWSTR, lpszagentpin: PCWSTR, lphagent: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline.toInt(), lpszagentid, lpszagentpin, lphagent)

public actual fun lineDeallocateCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall.toInt())

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), lpparams, dwsize.toInt())

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), lpparams, dwsize.toInt())

public actual fun lineDial(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDial(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineDialA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDialA(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineDialW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDialW(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineDrop(hcall.toInt(), lpsuseruserinfo, dwsize.toInt())

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist, dwnumringsnoanswer.toInt(), lphconsultcall, lpcallparams)

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist, dwnumringsnoanswer.toInt(), lphconsultcall, lpcallparams)

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist, dwnumringsnoanswer.toInt(), lphconsultcall, lpcallparams)

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits, dwnumdigits.toInt(), lpszterminationdigits, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits, dwnumdigits.toInt(), lpszterminationdigits, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PWSTR, dwnumdigits: UInt, lpszterminationdigits: PCWSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits, dwnumdigits.toInt(), lpszterminationdigits, dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt())

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), lpszdigits, dwduration.toInt())

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), lpszdigits, dwduration.toInt())

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCWSTR, dwduration: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), lpszdigits, dwduration.toInt())

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), lptones)

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps)

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps)

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps)

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressID(hline.toInt(), lpdwaddressid, dwaddressmode.toInt(), lpsaddress, dwsize.toInt())

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline.toInt(), lpdwaddressid, dwaddressmode.toInt(), lpsaddress, dwsize.toInt())

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCWSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline.toInt(), lpdwaddressid, dwaddressmode.toInt(), lpsaddress, dwsize.toInt())

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), lpaddressstatus)

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), lpaddressstatus)

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), lpaddressstatus)

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist)

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist)

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps)

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps)

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist)

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist)

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline.toInt(), hagent.toInt(), lpagentinfo)

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), lpagentsessioninfo)

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline.toInt(), hagent.toInt(), lpagentsessionlist)

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), lpagentstatus)

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), lpagentstatus)

public actual fun lineGetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriority(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpextensionname, lpdwpriority)

public actual fun lineGetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriorityA(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpextensionname, lpdwpriority)

public actual fun lineGetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetAppPriorityW(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpextensionname, lpdwpriority)

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall.toInt(), lpcallinfo)

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall.toInt(), lpcallinfo)

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall.toInt(), lpcallinfo)

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall.toInt(), lpcallstatus)

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall.toInt(), lpcalllist)

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist)

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist)

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist)

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps)

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps)

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps)

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid.toInt(), lpdeviceconfig, lpszdeviceclass)

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig, lpszdeviceclass)

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig, lpszdeviceclass)

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline.toInt(), lpgrouplist)

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline.toInt(), lpgrouplist)

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline.toInt(), lplinedevstatus)

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline.toInt(), lplinedevstatus)

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline.toInt(), lplinedevstatus)

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp.toInt(), lpmessage, dwtimeout.toInt())

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), lpcalllist)

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetNumRings(hline.toInt(), dwaddressid.toInt(), lpdwnumrings)

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion.toInt(), lpproviderlist)

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion.toInt(), lpproviderlist)

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion.toInt(), lpproviderlist)

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), lplineproxyreqestlist)

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), lplinequeueinfo)

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline.toInt(), lpgroupid, lpqueuelist)

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline.toInt(), lpgroupid, lpqueuelist)

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer)

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer)

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer)

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: Long, lpdwaddressstates: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline.toInt(), lpdwlinestates, lpdwaddressstates)

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps)

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps)

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps)

public actual fun lineHandoff(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoff(hcall.toInt(), lpszfilename, dwmediamode.toInt())

public actual fun lineHandoffA(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoffA(hcall.toInt(), lpszfilename, dwmediamode.toInt())

public actual fun lineHandoffW(hcall: UInt, lpszfilename: PCWSTR, dwmediamode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHandoffW(hcall.toInt(), lpszfilename, dwmediamode.toInt())

public actual fun lineHold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineHold(hcall.toInt())

public actual fun lineInitialize(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitialize(lphlineapp, hinstance, lpfncallback.toLong(), lpszappname, lpdwnumdevs)

public actual fun lineInitializeExA(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitializeExA(lphlineapp, hinstance, lpfncallback.toLong(), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams)

public actual fun lineInitializeExW(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineInitializeExW(lphlineapp, hinstance, lpfncallback.toLong(), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams)

public actual fun lineMakeCall(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCall(hline.toInt(), lphcall, lpszdestaddress, dwcountrycode.toInt(), lpcallparams)

public actual fun lineMakeCallA(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCallA(hline.toInt(), lphcall, lpszdestaddress, dwcountrycode.toInt(), lpcallparams)

public actual fun lineMakeCallW(hline: UInt, lphcall: Long, lpszdestaddress: PCWSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMakeCallW(hline.toInt(), lphcall, lpszdestaddress, dwcountrycode.toInt(), lpcallparams)

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt())

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineMonitorTones(hcall: UInt, lptonelist: Long, dwnumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall.toInt(), lptonelist, dwnumentries.toInt())

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion, lpextensionid)

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion)

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpen(hlineapp.toInt(), dwdeviceid.toInt(), lphline, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams)

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), lphline, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams)

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), lphline, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams)

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePark(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress, lpnondiraddress)

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineParkA(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress, lpnondiraddress)

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCWSTR, lpnondiraddress: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineParkW(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress, lpnondiraddress)

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickup(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress, lpszgroupid)

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickupA(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress, lpszgroupid)

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR, lpszgroupid: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePickupW(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress, lpszgroupid)

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall.toInt(), lphconsultcall, lpcallparams)

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall.toInt(), lphconsultcall, lpcallparams)

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall.toInt(), lphconsultcall, lpcallparams)

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt())

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: Long, dwresult: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineProxyResponse(hline.toInt(), lpproxyrequest, dwresult.toInt())

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirect(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirectA(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRedirectW(hcall.toInt(), lpszdestaddress, dwcountrycode.toInt())

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt())

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall.toInt())

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall.toInt())

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: HWND): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid.toInt(), hwndowner)

public actual fun lineSecureCall(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSecureCall(hcall.toInt())

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall.toInt(), lpsuseruserinfo, dwsize.toInt())

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt())

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist)

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt())

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt())

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriority(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpszextensionname, dwpriority.toInt())

public actual fun lineSetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriorityA(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpszextensionname, dwpriority.toInt())

public actual fun lineSetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCWSTR, dwpriority: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppPriorityW(lpszappfilename, dwmediamode.toInt(), lpextensionid, dwrequestmode.toInt(), lpszextensionname, dwpriority.toInt())

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall.toInt(), dwappspecific.toInt())

public actual fun lineSetCallData(hcall: UInt, lpcalldata: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallData(hcall.toInt(), lpcalldata, dwsize.toInt())

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), lpdialparams)

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt())

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: Long, dwsendingflowspecsize: UInt, lpreceivingflowspec: Long, dwreceivingflowspecsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall.toInt(), lpsendingflowspec, dwsendingflowspecsize.toInt(), lpreceivingflowspec, dwreceivingflowspecsize.toInt())

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall.toInt(), dwtreatment.toInt())

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt())

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid.toInt(), lpdeviceconfig, dwsize.toInt(), lpszdeviceclass)

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig, dwsize.toInt(), lpszdeviceclass)

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig, dwsize.toInt(), lpszdeviceclass)

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt())

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: Long, dwdigitnumentries: UInt, lpmedialist: Long, dwmedianumentries: UInt, lptonelist: Long, dwtonenumentries: UInt, lpcallstatelist: Long, dwcallstatenumentries: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdigitlist, dwdigitnumentries.toInt(), lpmedialist, dwmedianumentries.toInt(), lptonelist, dwtonenumentries.toInt(), lpcallstatelist, dwcallstatenumentries.toInt())

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

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin, dwtolllistoption.toInt())

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin, dwtolllistoption.toInt())

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: PCWSTR, dwtolllistoption: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressinw, dwtolllistoption.toInt())

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConference(hcall.toInt(), hline.toInt(), lphconfcall, lphconsultcall, dwnumparties.toInt(), lpcallparams)

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall.toInt(), hline.toInt(), lphconfcall, lphconsultcall, dwnumparties.toInt(), lpcallparams)

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall.toInt(), hline.toInt(), lphconfcall, lphconsultcall, dwnumparties.toInt(), lpcallparams)

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall.toInt(), lphconsultcall, lpcallparams)

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall.toInt(), lphconsultcall, lpcallparams)

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall.toInt(), lphconsultcall, lpcallparams)

public actual fun lineShutdown(hlineapp: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp.toInt())

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall.toInt(), hheldcall.toInt())

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput)

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput)

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCWSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin, dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput)

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner, lpszaddressin)

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner, lpszaddressin)

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner, lpszaddressin)

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline.toInt(), dwcompletionid.toInt())

public actual fun lineUnhold(hcall: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnhold(hcall.toInt())

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnpark(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress)

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnparkA(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress)

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_lineUnparkW(hline.toInt(), dwaddressid.toInt(), lphcall, lpszdestaddress)

public actual fun phoneClose(hphone: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneClose(hphone.toInt())

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid.toInt(), hwndowner, lpszdeviceclass)

public actual fun phoneDevSpecific(hphone: UInt, lpparams: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone.toInt(), lpparams, dwsize.toInt())

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetData(hphone.toInt(), dwdataid.toInt(), lpdata, dwsize.toInt())

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps)

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps)

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps)

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone.toInt(), lpdisplay)

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), lpdwgain)

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone.toInt(), lpdwhookswitchdevs)

public actual fun phoneGetID(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetID(hphone.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone.toInt(), lpdeviceid, lpszdeviceclass)

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid.toInt(), lpszdeviceclass, lphicon)

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), lpdwlampmode)

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp.toInt(), lpmessage, dwtimeout.toInt())

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: Long, lpdwvolume: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetRing(hphone.toInt(), lpdwringmode, lpdwvolume)

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone.toInt(), lpphonestatus)

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone.toInt(), lpphonestatus)

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone.toInt(), lpdwphonestates, lpdwbuttonmodes, lpdwbuttonstates)

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone.toInt(), lpphonestatus)

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), lpdwvolume)

public actual fun phoneInitialize(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitialize(lphphoneapp, hinstance, lpfncallback.toLong(), lpszappname, lpdwnumdevs)

public actual fun phoneInitializeExA(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitializeExA(lphphoneapp, hinstance, lpfncallback.toLong(), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams)

public actual fun phoneInitializeExW(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneInitializeExW(lphphoneapp, hinstance, lpfncallback.toLong(), lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams)

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion, lpextensionid)

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion)

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), lphphone, dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toLong(), dwprivilege.toInt())

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo)

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetData(hphone.toInt(), dwdataid.toInt(), lpdata, dwsize.toInt())

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: PCSTR, dwsize: UInt): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), lpsdisplay, dwsize.toInt())

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

public actual fun tapiGetLocationInfo(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfo(lpszcountrycode, lpszcitycode)

public actual fun tapiGetLocationInfoA(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA(lpszcountrycode, lpszcitycode)

public actual fun tapiGetLocationInfoW(lpszcountrycodew: PWSTR, lpszcitycodew: PWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW(lpszcountrycodew, lpszcitycodew)

public actual fun tapiRequestDrop(hwnd: HWND, wrequestid: WPARAM): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestDrop(hwnd, wrequestid.toLong())

public actual fun tapiRequestMakeCall(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCall(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)

public actual fun tapiRequestMakeCallA(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)

public actual fun tapiRequestMakeCallW(lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)

public actual fun tapiRequestMediaCall(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCall(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)

public actual fun tapiRequestMediaCallA(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)

public actual fun tapiRequestMediaCallW(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCWSTR, lpdeviceid: PCWSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    WindowsWin32DevicesTapiJniBridge.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW(hwnd, wrequestid.toLong(), lpszdeviceclass, lpdeviceid, dwsize.toInt(), dwsecure.toInt(), lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment)
