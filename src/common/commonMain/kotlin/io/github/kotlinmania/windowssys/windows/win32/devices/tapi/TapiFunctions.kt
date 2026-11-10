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

public expect fun getTnefStreamCodepage(lpstream: COpaquePointer?, lpulcodepage: COpaquePointer?, lpulsubcodepage: COpaquePointer?): Hresult

public expect fun openTnefStream(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpptnef: COpaquePointer?): Hresult

public expect fun openTnefStreamEx(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpadressbook: COpaquePointer?, lpptnef: COpaquePointer?): Hresult

public expect fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int

public expect fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int

public expect fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int

public expect fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int

public expect fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int

public expect fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int

public expect fun lineClose(hline: UInt): Int

public expect fun lineCompleteCall(hcall: UInt, lpdwcompletionid: COpaquePointer?, dwcompletionmode: UInt, dwmessageid: UInt): Int

public expect fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: COpaquePointer?, dwtransfermode: UInt): Int

public expect fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int

public expect fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int

public expect fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int

public expect fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int

public expect fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int

public expect fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: COpaquePointer?): Int

public expect fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int

public expect fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int

public expect fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: COpaquePointer?): Int

public expect fun lineDeallocateCall(hcall: UInt): Int

public expect fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int

public expect fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int

public expect fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int

public expect fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int

public expect fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int

public expect fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int

public expect fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: COpaquePointer?): Int

public expect fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int

public expect fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int

public expect fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int

public expect fun lineGetAddressID(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int

public expect fun lineGetAddressIDA(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int

public expect fun lineGetAddressIDW(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int

public expect fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int

public expect fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int

public expect fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int

public expect fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int

public expect fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int

public expect fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int

public expect fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int

public expect fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int

public expect fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int

public expect fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: COpaquePointer?): Int

public expect fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: COpaquePointer?): Int

public expect fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: COpaquePointer?): Int

public expect fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int

public expect fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int

public expect fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int

public expect fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int

public expect fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int

public expect fun lineGetCallInfo(hcall: UInt, lpcallinfo: COpaquePointer?): Int

public expect fun lineGetCallInfoA(hcall: UInt, lpcallinfo: COpaquePointer?): Int

public expect fun lineGetCallInfoW(hcall: UInt, lpcallinfo: COpaquePointer?): Int

public expect fun lineGetCallStatus(hcall: UInt, lpcallstatus: COpaquePointer?): Int

public expect fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: COpaquePointer?): Int

public expect fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int

public expect fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int

public expect fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int

public expect fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int

public expect fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int

public expect fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int

public expect fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcwstr): Int

public expect fun lineGetGroupListA(hline: UInt, lpgrouplist: COpaquePointer?): Int

public expect fun lineGetGroupListW(hline: UInt, lpgrouplist: COpaquePointer?): Int

public expect fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int

public expect fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int

public expect fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int

public expect fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int

public expect fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: COpaquePointer?): Int

public expect fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: COpaquePointer?): Int

public expect fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: COpaquePointer?): Int

public expect fun lineGetMessage(hlineapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int

public expect fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: COpaquePointer?): Int

public expect fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: COpaquePointer?): Int

public expect fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int

public expect fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int

public expect fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int

public expect fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: COpaquePointer?): Int

public expect fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: COpaquePointer?): Int

public expect fun lineGetQueueListA(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int

public expect fun lineGetQueueListW(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int

public expect fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int

public expect fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int

public expect fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int

public expect fun lineGetStatusMessages(hline: UInt, lpdwlinestates: COpaquePointer?, lpdwaddressstates: COpaquePointer?): Int

public expect fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int

public expect fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int

public expect fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int

public expect fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int

public expect fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int

public expect fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int

public expect fun lineHold(hcall: UInt): Int

public expect fun lineInitialize(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int

public expect fun lineInitializeExA(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int

public expect fun lineInitializeExW(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int

public expect fun lineMakeCall(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineMakeCallA(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineMakeCallW(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int

public expect fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineMonitorTones(hcall: UInt, lptonelist: COpaquePointer?, dwnumentries: UInt): Int

public expect fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int

public expect fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int

public expect fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int

public expect fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int

public expect fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int

public expect fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: COpaquePointer?): Int

public expect fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int

public expect fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int

public expect fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int

public expect fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int

public expect fun lineProxyResponse(hline: UInt, lpproxyrequest: COpaquePointer?, dwresult: UInt): Int

public expect fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int

public expect fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int

public expect fun lineReleaseUserUserInfo(hcall: UInt): Int

public expect fun lineRemoveFromConference(hcall: UInt): Int

public expect fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int

public expect fun lineSecureCall(hcall: UInt): Int

public expect fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int

public expect fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int

public expect fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int

public expect fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int

public expect fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int

public expect fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int

public expect fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int

public expect fun lineSetCallData(hcall: UInt, lpcalldata: COpaquePointer?, dwsize: UInt): Int

public expect fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: COpaquePointer?): Int

public expect fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int

public expect fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: COpaquePointer?, dwsendingflowspecsize: UInt, lpreceivingflowspec: COpaquePointer?, dwreceivingflowspecsize: UInt): Int

public expect fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int

public expect fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int

public expect fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int

public expect fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int

public expect fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcwstr): Int

public expect fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int

public expect fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: COpaquePointer?, dwdigitnumentries: UInt, lpmedialist: COpaquePointer?, dwmedianumentries: UInt, lptonelist: COpaquePointer?, dwtonenumentries: UInt, lpcallstatelist: COpaquePointer?, dwcallstatenumentries: UInt): Int

public expect fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int

public expect fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int

public expect fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int

public expect fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int

public expect fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int

public expect fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int

public expect fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int

public expect fun lineSetupTransfer(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineSetupTransferA(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineSetupTransferW(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int

public expect fun lineShutdown(hlineapp: UInt): Int

public expect fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int

public expect fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int

public expect fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int

public expect fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int

public expect fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int

public expect fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int

public expect fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int

public expect fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int

public expect fun lineUnhold(hcall: UInt): Int

public expect fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int

public expect fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int

public expect fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr): Int

public expect fun phoneClose(hphone: UInt): Int

public expect fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int

public expect fun phoneDevSpecific(hphone: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int

public expect fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int

public expect fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int

public expect fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int

public expect fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int

public expect fun phoneGetDisplay(hphone: UInt, lpdisplay: COpaquePointer?): Int

public expect fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: COpaquePointer?): Int

public expect fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: COpaquePointer?): Int

public expect fun phoneGetID(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun phoneGetIDA(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int

public expect fun phoneGetIDW(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int

public expect fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int

public expect fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int

public expect fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int

public expect fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: COpaquePointer?): Int

public expect fun phoneGetMessage(hphoneapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int

public expect fun phoneGetRing(hphone: UInt, lpdwringmode: COpaquePointer?, lpdwvolume: COpaquePointer?): Int

public expect fun phoneGetStatus(hphone: UInt, lpphonestatus: COpaquePointer?): Int

public expect fun phoneGetStatusA(hphone: UInt, lpphonestatus: COpaquePointer?): Int

public expect fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: COpaquePointer?, lpdwbuttonmodes: COpaquePointer?, lpdwbuttonstates: COpaquePointer?): Int

public expect fun phoneGetStatusW(hphone: UInt, lpphonestatus: COpaquePointer?): Int

public expect fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: COpaquePointer?): Int

public expect fun phoneInitialize(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int

public expect fun phoneInitializeExA(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int

public expect fun phoneInitializeExW(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int

public expect fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int

public expect fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int

public expect fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int

public expect fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int

public expect fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int

public expect fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int

public expect fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int

public expect fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int

public expect fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int

public expect fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int

public expect fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int

public expect fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int

public expect fun phoneShutdown(hphoneapp: UInt): Int

public expect fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int

public expect fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int

public expect fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int

public expect fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int

public expect fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int

public expect fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int

public expect fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int

public expect fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int

public expect fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int

public expect fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int
