package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public expect fun GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT

public expect fun OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT

public expect fun OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT

public expect fun lineAccept(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int

public expect fun lineAddProvider(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int

public expect fun lineAddProviderA(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int

public expect fun lineAddProviderW(lpszproviderfilename: PCWSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int

public expect fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int

public expect fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: Long, dwsize: UInt): Int

public expect fun lineAnswer(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int

public expect fun lineBlindTransfer(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineBlindTransferA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: PCWSTR, dwcountrycode: UInt): Int

public expect fun lineClose(hline: UInt): Int

public expect fun lineCompleteCall(hcall: UInt, lpdwcompletionid: Long, dwcompletionmode: UInt, dwmessageid: UInt): Int

public expect fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: Long, dwtransfermode: UInt): Int

public expect fun lineConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int

public expect fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int

public expect fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int

public expect fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int

public expect fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int

public expect fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int

public expect fun lineConfigProvider(hwndowner: HWND, dwpermanentproviderid: UInt): Int

public expect fun lineCreateAgentA(hline: UInt, lpszagentid: PCSTR, lpszagentpin: PCSTR, lphagent: Long): Int

public expect fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: PCSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int

public expect fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: PCWSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int

public expect fun lineCreateAgentW(hline: UInt, lpszagentid: PCWSTR, lpszagentpin: PCWSTR, lphagent: Long): Int

public expect fun lineDeallocateCall(hcall: UInt): Int

public expect fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: Long, dwsize: UInt): Int

public expect fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: Long, dwsize: UInt): Int

public expect fun lineDial(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineDialA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineDialW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int

public expect fun lineDrop(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int

public expect fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PWSTR, dwnumdigits: UInt, lpszterminationdigits: PCWSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int

public expect fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int

public expect fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCWSTR, dwduration: UInt): Int

public expect fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: Long): Int

public expect fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int

public expect fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int

public expect fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int

public expect fun lineGetAddressID(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int

public expect fun lineGetAddressIDA(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int

public expect fun lineGetAddressIDW(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCWSTR, dwsize: UInt): Int

public expect fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int

public expect fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int

public expect fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int

public expect fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int

public expect fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int

public expect fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int

public expect fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int

public expect fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int

public expect fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int

public expect fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: Long): Int

public expect fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: Long): Int

public expect fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: Long): Int

public expect fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int

public expect fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int

public expect fun lineGetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int

public expect fun lineGetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int

public expect fun lineGetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int

public expect fun lineGetCallInfo(hcall: UInt, lpcallinfo: Long): Int

public expect fun lineGetCallInfoA(hcall: UInt, lpcallinfo: Long): Int

public expect fun lineGetCallInfoW(hcall: UInt, lpcallinfo: Long): Int

public expect fun lineGetCallStatus(hcall: UInt, lpcallstatus: Long): Int

public expect fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: Long): Int

public expect fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int

public expect fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int

public expect fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int

public expect fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int

public expect fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int

public expect fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int

public expect fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int

public expect fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int

public expect fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCWSTR): Int

public expect fun lineGetGroupListA(hline: UInt, lpgrouplist: Long): Int

public expect fun lineGetGroupListW(hline: UInt, lpgrouplist: Long): Int

public expect fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int

public expect fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int

public expect fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int

public expect fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int

public expect fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int

public expect fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int

public expect fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: Long): Int

public expect fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: Long): Int

public expect fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: Long): Int

public expect fun lineGetMessage(hlineapp: UInt, lpmessage: Long, dwtimeout: UInt): Int

public expect fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: Long): Int

public expect fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: Long): Int

public expect fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: Long): Int

public expect fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: Long): Int

public expect fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: Long): Int

public expect fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: Long): Int

public expect fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: Long): Int

public expect fun lineGetQueueListA(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int

public expect fun lineGetQueueListW(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int

public expect fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int

public expect fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int

public expect fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int

public expect fun lineGetStatusMessages(hline: UInt, lpdwlinestates: Long, lpdwaddressstates: Long): Int

public expect fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int

public expect fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int

public expect fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int

public expect fun lineHandoff(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int

public expect fun lineHandoffA(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int

public expect fun lineHandoffW(hcall: UInt, lpszfilename: PCWSTR, dwmediamode: UInt): Int

public expect fun lineHold(hcall: UInt): Int

public expect fun lineInitialize(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int

public expect fun lineInitializeExA(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

public expect fun lineInitializeExW(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int

public expect fun lineMakeCall(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int

public expect fun lineMakeCallA(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int

public expect fun lineMakeCallW(hline: UInt, lphcall: Long, lpszdestaddress: PCWSTR, dwcountrycode: UInt, lpcallparams: Long): Int

public expect fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int

public expect fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineMonitorTones(hcall: UInt, lptonelist: Long, dwnumentries: UInt): Int

public expect fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int

public expect fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int

public expect fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int

public expect fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int

public expect fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int

public expect fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int

public expect fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int

public expect fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCWSTR, lpnondiraddress: Long): Int

public expect fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int

public expect fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int

public expect fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR, lpszgroupid: PCWSTR): Int

public expect fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int

public expect fun lineProxyResponse(hline: UInt, lpproxyrequest: Long, dwresult: UInt): Int

public expect fun lineRedirect(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineRedirectA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int

public expect fun lineRedirectW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int

public expect fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int

public expect fun lineReleaseUserUserInfo(hcall: UInt): Int

public expect fun lineRemoveFromConference(hcall: UInt): Int

public expect fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: HWND): Int

public expect fun lineSecureCall(hcall: UInt): Int

public expect fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int

public expect fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int

public expect fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int

public expect fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int

public expect fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int

public expect fun lineSetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int

public expect fun lineSetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCWSTR, dwpriority: UInt): Int

public expect fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int

public expect fun lineSetCallData(hcall: UInt, lpcalldata: Long, dwsize: UInt): Int

public expect fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: Long): Int

public expect fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int

public expect fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: Long, dwsendingflowspecsize: UInt, lpreceivingflowspec: Long, dwreceivingflowspecsize: UInt): Int

public expect fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int

public expect fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int

public expect fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int

public expect fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int

public expect fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCWSTR): Int

public expect fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int

public expect fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: Long, dwdigitnumentries: UInt, lpmedialist: Long, dwmedianumentries: UInt, lptonelist: Long, dwtonenumentries: UInt, lpcallstatelist: Long, dwcallstatenumentries: UInt): Int

public expect fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int

public expect fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int

public expect fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int

public expect fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int

public expect fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int

public expect fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: PCWSTR, dwtolllistoption: UInt): Int

public expect fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int

public expect fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int

public expect fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int

public expect fun lineSetupTransfer(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineSetupTransferA(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineSetupTransferW(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int

public expect fun lineShutdown(hlineapp: UInt): Int

public expect fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int

public expect fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int

public expect fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int

public expect fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCWSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int

public expect fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int

public expect fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int

public expect fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCWSTR): Int

public expect fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int

public expect fun lineUnhold(hcall: UInt): Int

public expect fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int

public expect fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int

public expect fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR): Int

public expect fun phoneClose(hphone: UInt): Int

public expect fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int

public expect fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int

public expect fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int

public expect fun phoneDevSpecific(hphone: UInt, lpparams: Long, dwsize: UInt): Int

public expect fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int

public expect fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int

public expect fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int

public expect fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int

public expect fun phoneGetDisplay(hphone: UInt, lpdisplay: Long): Int

public expect fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: Long): Int

public expect fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: Long): Int

public expect fun phoneGetID(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int

public expect fun phoneGetIDA(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int

public expect fun phoneGetIDW(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int

public expect fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int

public expect fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int

public expect fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int

public expect fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: Long): Int

public expect fun phoneGetMessage(hphoneapp: UInt, lpmessage: Long, dwtimeout: UInt): Int

public expect fun phoneGetRing(hphone: UInt, lpdwringmode: Long, lpdwvolume: Long): Int

public expect fun phoneGetStatus(hphone: UInt, lpphonestatus: Long): Int

public expect fun phoneGetStatusA(hphone: UInt, lpphonestatus: Long): Int

public expect fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int

public expect fun phoneGetStatusW(hphone: UInt, lpphonestatus: Long): Int

public expect fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: Long): Int

public expect fun phoneInitialize(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int

public expect fun phoneInitializeExA(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

public expect fun phoneInitializeExW(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int

public expect fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int

public expect fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int

public expect fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int

public expect fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int

public expect fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int

public expect fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: PCSTR, dwsize: UInt): Int

public expect fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int

public expect fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int

public expect fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int

public expect fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int

public expect fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int

public expect fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int

public expect fun phoneShutdown(hphoneapp: UInt): Int

public expect fun tapiGetLocationInfo(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int

public expect fun tapiGetLocationInfoA(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int

public expect fun tapiGetLocationInfoW(lpszcountrycodew: PWSTR, lpszcitycodew: PWSTR): Int

public expect fun tapiRequestDrop(hwnd: HWND, wrequestid: WPARAM): Int

public expect fun tapiRequestMakeCall(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int

public expect fun tapiRequestMakeCallA(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int

public expect fun tapiRequestMakeCallW(lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int

public expect fun tapiRequestMediaCall(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int

public expect fun tapiRequestMediaCallA(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int

public expect fun tapiRequestMediaCallW(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCWSTR, lpdeviceid: PCWSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int
