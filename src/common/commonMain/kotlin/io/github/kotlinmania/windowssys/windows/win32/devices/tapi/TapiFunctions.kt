package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public expect fun getTnefStreamCodepage(lpstream: MutPtr<CVoid>, lpulcodepage: MutPtr<UInt>, lpulsubcodepage: MutPtr<UInt>): Hresult

public expect fun openTnefStream(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun openTnefStreamEx(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpadressbook: MutPtr<CVoid>, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int

public expect fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int

public expect fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int

public expect fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int

public expect fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int

public expect fun lineClose(hline: UInt): Int

public expect fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr<UInt>, dwcompletionmode: UInt, dwmessageid: UInt): Int

public expect fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr<UInt>, dwtransfermode: UInt): Int

public expect fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int

public expect fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int

public expect fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int

public expect fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int

public expect fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int

public expect fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr<UInt>): Int

public expect fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int

public expect fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int

public expect fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr<UInt>): Int

public expect fun lineDeallocateCall(hcall: UInt): Int

public expect fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int

public expect fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int

public expect fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int

public expect fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int

public expect fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int

public expect fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int

public expect fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int

public expect fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr<Linegeneratetone>): Int

public expect fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int

public expect fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int

public expect fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int

public expect fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int

public expect fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int

public expect fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int

public expect fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int

public expect fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int

public expect fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int

public expect fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int

public expect fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int

public expect fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int

public expect fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int

public expect fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int

public expect fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int

public expect fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr<Lineagentinfo>): Int

public expect fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr<Lineagentsessioninfo>): Int

public expect fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr<Lineagentsessionlist>): Int

public expect fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int

public expect fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int

public expect fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int

public expect fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int

public expect fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int

public expect fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int

public expect fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int

public expect fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int

public expect fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr<Linecallstatus>): Int

public expect fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr<Linecalllist>): Int

public expect fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int

public expect fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int

public expect fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int

public expect fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int

public expect fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int

public expect fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int

public expect fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int

public expect fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int

public expect fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int

public expect fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int

public expect fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int

public expect fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int

public expect fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int

public expect fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int

public expect fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int

public expect fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int

public expect fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr<Linemessage>, dwtimeout: UInt): Int

public expect fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr<Linecalllist>): Int

public expect fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr<UInt>): Int

public expect fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int

public expect fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int

public expect fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int

public expect fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr<Lineproxyrequestlist>): Int

public expect fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr<Linequeueinfo>): Int

public expect fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int

public expect fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int

public expect fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int

public expect fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int

public expect fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int

public expect fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr<UInt>, lpdwaddressstates: MutPtr<UInt>): Int

public expect fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int

public expect fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int

public expect fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int

public expect fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int

public expect fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int

public expect fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int

public expect fun lineHold(hcall: UInt): Int

public expect fun lineInitialize(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int

public expect fun lineInitializeExA(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int

public expect fun lineInitializeExW(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int

public expect fun lineMakeCall(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineMakeCallA(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineMakeCallW(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int

public expect fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr<Linemonitortone>, dwnumentries: UInt): Int

public expect fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Lineextensionid>): Int

public expect fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int

public expect fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int

public expect fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int

public expect fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr<Varstring>): Int

public expect fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int

public expect fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int

public expect fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int

public expect fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int

public expect fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr<Lineproxyrequest>, dwresult: UInt): Int

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

public expect fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int

public expect fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int

public expect fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int

public expect fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int

public expect fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int

public expect fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int

public expect fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int

public expect fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr<Linedialparams>): Int

public expect fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int

public expect fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr<CVoid>, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr<CVoid>, dwreceivingflowspecsize: UInt): Int

public expect fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int

public expect fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int

public expect fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int

public expect fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int

public expect fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcwstr): Int

public expect fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int

public expect fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr<Linemediacontroldigit>, dwdigitnumentries: UInt, lpmedialist: ConstPtr<Linemediacontrolmedia>, dwmedianumentries: UInt, lptonelist: ConstPtr<Linemediacontroltone>, dwtonenumentries: UInt, lpcallstatelist: ConstPtr<Linemediacontrolcallstate>, dwcallstatenumentries: UInt): Int

public expect fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int

public expect fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int

public expect fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int

public expect fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int

public expect fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int

public expect fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int

public expect fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int

public expect fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int

public expect fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int

public expect fun lineShutdown(hlineapp: UInt): Int

public expect fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int

public expect fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int

public expect fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int

public expect fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int

public expect fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int

public expect fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int

public expect fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int

public expect fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int

public expect fun lineUnhold(hcall: UInt): Int

public expect fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int

public expect fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int

public expect fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr): Int

public expect fun phoneClose(hphone: UInt): Int

public expect fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int

public expect fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int

public expect fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int

public expect fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int

public expect fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int

public expect fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr<CVoid>, dwsize: UInt): Int

public expect fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int

public expect fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int

public expect fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int

public expect fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr<Varstring>): Int

public expect fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr<UInt>): Int

public expect fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr<UInt>): Int

public expect fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int

public expect fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int

public expect fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int

public expect fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int

public expect fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int

public expect fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr<UInt>): Int

public expect fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr<Phonemessage>, dwtimeout: UInt): Int

public expect fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr<UInt>, lpdwvolume: MutPtr<UInt>): Int

public expect fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int

public expect fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int

public expect fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr<UInt>, lpdwbuttonmodes: MutPtr<UInt>, lpdwbuttonstates: MutPtr<UInt>): Int

public expect fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int

public expect fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr<UInt>): Int

public expect fun phoneInitialize(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int

public expect fun phoneInitializeExA(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int

public expect fun phoneInitializeExW(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int

public expect fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Phoneextensionid>): Int

public expect fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int

public expect fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int

public expect fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int

public expect fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int

public expect fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int

public expect fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr<CVoid>, dwsize: UInt): Int

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
