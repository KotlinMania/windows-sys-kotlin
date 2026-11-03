package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun DrtClose(hdrt: Long) {
    Win32DynamicFfi.invoke("drt.dll", "DrtClose", longArrayOf(hdrt))
}

public fun DrtContinueSearch(hsearchcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtContinueSearch", longArrayOf(hsearchcontext)).toInt()
}

public fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("drtprov.dll", "DrtCreateDerivedKey", longArrayOf(plocalcert, pkey)).toInt()
}

public fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("drtprov.dll", "DrtCreateDerivedKeySecurityProvider", longArrayOf(prootcert, plocalcert, ppsecurityprovider)).toInt()
}

public fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT {
    return Win32DynamicFfi.invoke("drtprov.dll", "DrtCreateDnsBootstrapResolver", longArrayOf(port.toLong(), pwszaddress, ppmodule)).toInt()
}

public fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT {
    return Win32DynamicFfi.invoke("drttransport.dll", "DrtCreateIpv6UdpTransport", longArrayOf(scope.toLong(), dwscopeid.toLong(), dwlocalitythreshold.toLong(), pwport, phtransport)).toInt()
}

public fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("drtprov.dll", "DrtCreateNullSecurityProvider", longArrayOf(ppsecurityprovider)).toInt()
}

public fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT {
    return Win32DynamicFfi.invoke("drtprov.dll", "DrtCreatePnrpBootstrapResolver", longArrayOf(fpublish.toLong(), pwzpeername, pwzcloudname, pwzpublishingidentity, ppresolver)).toInt()
}

public fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long) {
    Win32DynamicFfi.invoke("drtprov.dll", "DrtDeleteDerivedKeySecurityProvider", longArrayOf(psecurityprovider))
}

public fun DrtDeleteDnsBootstrapResolver(presolver: Long) {
    Win32DynamicFfi.invoke("drtprov.dll", "DrtDeleteDnsBootstrapResolver", longArrayOf(presolver))
}

public fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT {
    return Win32DynamicFfi.invoke("drttransport.dll", "DrtDeleteIpv6UdpTransport", longArrayOf(htransport)).toInt()
}

public fun DrtDeleteNullSecurityProvider(psecurityprovider: Long) {
    Win32DynamicFfi.invoke("drtprov.dll", "DrtDeleteNullSecurityProvider", longArrayOf(psecurityprovider))
}

public fun DrtDeletePnrpBootstrapResolver(presolver: Long) {
    Win32DynamicFfi.invoke("drtprov.dll", "DrtDeletePnrpBootstrapResolver", longArrayOf(presolver))
}

public fun DrtEndSearch(hsearchcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtEndSearch", longArrayOf(hsearchcontext)).toInt()
}

public fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetEventData", longArrayOf(hdrt, uleventdatalen.toLong(), peventdata)).toInt()
}

public fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetEventDataSize", longArrayOf(hdrt, puleventdatalen)).toInt()
}

public fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetInstanceName", longArrayOf(hdrt, ulcbinstancenamesize.toLong(), pwzdrtinstancename)).toInt()
}

public fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetInstanceNameSize", longArrayOf(hdrt, pulcbinstancenamesize)).toInt()
}

public fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetSearchPath", longArrayOf(hsearchcontext, ulsearchpathsize.toLong(), psearchpath)).toInt()
}

public fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetSearchPathSize", longArrayOf(hsearchcontext, pulsearchpathsize)).toInt()
}

public fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetSearchResult", longArrayOf(hsearchcontext, ulsearchresultsize.toLong(), psearchresult)).toInt()
}

public fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtGetSearchResultSize", longArrayOf(hsearchcontext, pulsearchresultsize)).toInt()
}

public fun DrtOpen(psettings: Long, hevent: Foundation.HANDLE, pvcontext: Long, phdrt: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtOpen", longArrayOf(psettings, Win32DynamicFfi.objectSlot(hevent), pvcontext, phdrt)).toInt()
}

public fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtRegisterKey", longArrayOf(hdrt, pregistration, pvkeycontext, phkeyregistration)).toInt()
}

public fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: Foundation.HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtStartSearch", longArrayOf(hdrt, pkey, pinfo, timeout.toLong(), Win32DynamicFfi.objectSlot(hevent), pvcontext, hsearchcontext)).toInt()
}

public fun DrtUnregisterKey(hkeyregistration: Long) {
    Win32DynamicFfi.invoke("drt.dll", "DrtUnregisterKey", longArrayOf(hkeyregistration))
}

public fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("drt.dll", "DrtUpdateKey", longArrayOf(hkeyregistration, pappdata)).toInt()
}

public fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabAddContact", longArrayOf(pwzcontactdata, ppcontact)).toInt()
}

public fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: Foundation.HANDLE, phinvitation: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabAsyncInviteContact", longArrayOf(pccontact, pcendpoint, pcinvitation, Win32DynamicFfi.objectSlot(hevent), phinvitation)).toInt()
}

public fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: Foundation.HANDLE, phinvitation: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabAsyncInviteEndpoint", longArrayOf(pcendpoint, pcinvitation, Win32DynamicFfi.objectSlot(hevent), phinvitation)).toInt()
}

public fun PeerCollabCancelInvitation(hinvitation: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabCancelInvitation", longArrayOf(Win32DynamicFfi.objectSlot(hinvitation))).toInt()
}

public fun PeerCollabCloseHandle(hinvitation: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(hinvitation))).toInt()
}

public fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabDeleteContact", longArrayOf(pwzpeername)).toInt()
}

public fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabDeleteEndpointData", longArrayOf(pcendpoint)).toInt()
}

public fun PeerCollabDeleteObject(pobjectid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabDeleteObject", longArrayOf(pobjectid)).toInt()
}

public fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumApplicationRegistrationInfo", longArrayOf(registrationtype.toLong(), phpeerenum)).toInt()
}

public fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumApplications", longArrayOf(pcendpoint, papplicationid, phpeerenum)).toInt()
}

public fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumContacts", longArrayOf(phpeerenum)).toInt()
}

public fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumEndpoints", longArrayOf(pccontact, phpeerenum)).toInt()
}

public fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumObjects", longArrayOf(pcendpoint, pobjectid, phpeerenum)).toInt()
}

public fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabEnumPeopleNearMe", longArrayOf(phpeerenum)).toInt()
}

public fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabExportContact", longArrayOf(pwzpeername, ppwzcontactdata)).toInt()
}

public fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetAppLaunchInfo", longArrayOf(pplaunchinfo)).toInt()
}

public fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetApplicationRegistrationInfo", longArrayOf(papplicationid, registrationtype.toLong(), ppapplication)).toInt()
}

public fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetContact", longArrayOf(pwzpeername, ppcontact)).toInt()
}

public fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetEndpointName", longArrayOf(ppwzendpointname)).toInt()
}

public fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetEventData", longArrayOf(hpeerevent, ppeventdata)).toInt()
}

public fun PeerCollabGetInvitationResponse(hinvitation: Foundation.HANDLE, ppinvitationresponse: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetInvitationResponse", longArrayOf(Win32DynamicFfi.objectSlot(hinvitation), ppinvitationresponse)).toInt()
}

public fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetPresenceInfo", longArrayOf(pcendpoint, pppresenceinfo)).toInt()
}

public fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabGetSigninOptions", longArrayOf(pdwsigninoptions)).toInt()
}

public fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabInviteContact", longArrayOf(pccontact, pcendpoint, pcinvitation, ppresponse)).toInt()
}

public fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabInviteEndpoint", longArrayOf(pcendpoint, pcinvitation, ppresponse)).toInt()
}

public fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabParseContact", longArrayOf(pwzcontactdata, ppcontact)).toInt()
}

public fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabQueryContactData", longArrayOf(pcendpoint, ppwzcontactdata)).toInt()
}

public fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabRefreshEndpointData", longArrayOf(pcendpoint)).toInt()
}

public fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabRegisterApplication", longArrayOf(pcapplication, registrationtype.toLong())).toInt()
}

public fun PeerCollabRegisterEvent(hevent: Foundation.HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabRegisterEvent", longArrayOf(Win32DynamicFfi.objectSlot(hevent), ceventregistration.toLong(), peventregistrations, phpeerevent)).toInt()
}

public fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSetEndpointName", longArrayOf(pwzendpointname)).toInt()
}

public fun PeerCollabSetObject(pcobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSetObject", longArrayOf(pcobject)).toInt()
}

public fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSetPresenceInfo", longArrayOf(pcpresenceinfo)).toInt()
}

public fun PeerCollabShutdown(): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabShutdown", longArrayOf()).toInt()
}

public fun PeerCollabSignin(hwndparent: Foundation.HWND, dwsigninoptions: UInt): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSignin", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dwsigninoptions.toLong())).toInt()
}

public fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSignout", longArrayOf(dwsigninoptions.toLong())).toInt()
}

public fun PeerCollabStartup(wversionrequested: UShort): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabStartup", longArrayOf(wversionrequested.toLong())).toInt()
}

public fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabSubscribeEndpointData", longArrayOf(pcendpoint)).toInt()
}

public fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabUnregisterApplication", longArrayOf(papplicationid, registrationtype.toLong())).toInt()
}

public fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabUnregisterEvent", longArrayOf(hpeerevent)).toInt()
}

public fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabUnsubscribeEndpointData", longArrayOf(pcendpoint)).toInt()
}

public fun PeerCollabUpdateContact(pcontact: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCollabUpdateContact", longArrayOf(pcontact)).toInt()
}

public fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerCreatePeerName", longArrayOf(pwzidentity, pwzclassifier, ppwzpeername)).toInt()
}

public fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientAddContentInformation", longArrayOf(hpeerdist, hcontenthandle, cbnumberofbytes.toLong(), pbuffer, lpoverlapped)).toUInt()
}

public fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientAddData", longArrayOf(hpeerdist, hcontenthandle, cbnumberofbytes.toLong(), pbuffer, lpoverlapped)).toUInt()
}

public fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientBlockRead", longArrayOf(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toLong(), pbuffer, dwtimeoutinmilliseconds.toLong(), lpoverlapped)).toUInt()
}

public fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientCancelAsyncOperation", longArrayOf(hpeerdist, hcontenthandle, poverlapped)).toUInt()
}

public fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientCloseContent", longArrayOf(hpeerdist, hcontenthandle)).toUInt()
}

public fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientCompleteContentInformation", longArrayOf(hpeerdist, hcontenthandle, lpoverlapped)).toUInt()
}

public fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientFlushContent", longArrayOf(hpeerdist, pcontenttag, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), lpoverlapped)).toUInt()
}

public fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientGetInformationByHandle", longArrayOf(hpeerdist, hcontenthandle, peerdistclientinfoclass.toLong(), dwbuffersize.toLong(), lpinformation)).toUInt()
}

public fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientOpenContent", longArrayOf(hpeerdist, pcontenttag, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), phcontenthandle)).toUInt()
}

public fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistClientStreamRead", longArrayOf(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toLong(), pbuffer, dwtimeoutinmilliseconds.toLong(), lpoverlapped)).toUInt()
}

public fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistGetOverlappedResult", longArrayOf(lpoverlapped, lpnumberofbytestransferred, bwait.toLong())).toInt()
}

public fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistGetStatus", longArrayOf(hpeerdist, ppeerdiststatus)).toUInt()
}

public fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistGetStatusEx", longArrayOf(hpeerdist, ppeerdiststatus)).toUInt()
}

public fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistRegisterForStatusChangeNotification", longArrayOf(hpeerdist, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), lpoverlapped, ppeerdiststatus)).toUInt()
}

public fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistRegisterForStatusChangeNotificationEx", longArrayOf(hpeerdist, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), lpoverlapped, ppeerdiststatus)).toUInt()
}

public fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerCancelAsyncOperation", longArrayOf(hpeerdist, cbcontentidentifier.toLong(), pcontentidentifier, poverlapped)).toUInt()
}

public fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerCloseContentInformation", longArrayOf(hpeerdist, hcontentinfo)).toUInt()
}

public fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerCloseStreamHandle", longArrayOf(hpeerdist, hstream)).toUInt()
}

public fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerOpenContentInformation", longArrayOf(hpeerdist, cbcontentidentifier.toLong(), pcontentidentifier, ullcontentoffset.toLong(), cbcontentlength.toLong(), Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), phcontentinfo)).toUInt()
}

public fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerOpenContentInformationEx", longArrayOf(hpeerdist, cbcontentidentifier.toLong(), pcontentidentifier, ullcontentoffset.toLong(), cbcontentlength.toLong(), pretrievaloptions, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), phcontentinfo)).toUInt()
}

public fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerPublishAddToStream", longArrayOf(hpeerdist, hstream, cbnumberofbytes.toLong(), pbuffer, lpoverlapped)).toUInt()
}

public fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerPublishCompleteStream", longArrayOf(hpeerdist, hstream, lpoverlapped)).toUInt()
}

public fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: Foundation.HANDLE, ulcompletionkey: ULong, phstream: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerPublishStream", longArrayOf(hpeerdist, cbcontentidentifier.toLong(), pcontentidentifier, cbcontentlength.toLong(), ppublishoptions, Win32DynamicFfi.objectSlot(hcompletionport), ulcompletionkey.toLong(), phstream)).toUInt()
}

public fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerRetrieveContentInformation", longArrayOf(hpeerdist, hcontentinfo, cbmaxnumberofbytes.toLong(), pbuffer, lpoverlapped)).toUInt()
}

public fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistServerUnpublish", longArrayOf(hpeerdist, cbcontentidentifier.toLong(), pcontentidentifier)).toUInt()
}

public fun PeerDistShutdown(hpeerdist: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistShutdown", longArrayOf(hpeerdist)).toUInt()
}

public fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistStartup", longArrayOf(dwversionrequested.toLong(), phpeerdist, pdwsupportedversion)).toUInt()
}

public fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt {
    return Win32DynamicFfi.invoke("peerdist.dll", "PeerDistUnregisterForStatusChangeNotification", longArrayOf(hpeerdist)).toUInt()
}

public fun PeerEndEnumeration(hpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerEndEnumeration", longArrayOf(hpeerenum)).toInt()
}

public fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerEnumGroups", longArrayOf(pwzidentity, phpeerenum)).toInt()
}

public fun PeerEnumIdentities(phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerEnumIdentities", longArrayOf(phpeerenum)).toInt()
}

public fun PeerFreeData(pvdata: Long) {
    Win32DynamicFfi.invoke("p2p.dll", "PeerFreeData", longArrayOf(pvdata))
}

public fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGetItemCount", longArrayOf(hpeerenum, pcount)).toInt()
}

public fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGetNextItem", longArrayOf(hpeerenum, pcount, pppvitems)).toInt()
}

public fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphAddRecord", longArrayOf(hgraph, precord, precordid)).toInt()
}

public fun PeerGraphClose(hgraph: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphClose", longArrayOf(hgraph)).toInt()
}

public fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphCloseDirectConnection", longArrayOf(hgraph, ullconnectionid.toLong())).toInt()
}

public fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphConnect", longArrayOf(hgraph, pwzpeerid, paddress, pullconnectionid)).toInt()
}

public fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphCreate", longArrayOf(pgraphproperties, pwzdatabasename, psecurityinterface, phgraph)).toInt()
}

public fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphDelete", longArrayOf(pwzgraphid, pwzpeerid, pwzdatabasename)).toInt()
}

public fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphDeleteRecord", longArrayOf(hgraph, precordid, flocal.toLong())).toInt()
}

public fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphEndEnumeration", longArrayOf(hpeerenum)).toInt()
}

public fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphEnumConnections", longArrayOf(hgraph, dwflags.toLong(), phpeerenum)).toInt()
}

public fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphEnumNodes", longArrayOf(hgraph, pwzpeerid, phpeerenum)).toInt()
}

public fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphEnumRecords", longArrayOf(hgraph, precordtype, pwzpeerid, phpeerenum)).toInt()
}

public fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphExportDatabase", longArrayOf(hgraph, pwzfilepath)).toInt()
}

public fun PeerGraphFreeData(pvdata: Long) {
    Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphFreeData", longArrayOf(pvdata))
}

public fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetEventData", longArrayOf(hpeerevent, ppeventdata)).toInt()
}

public fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetItemCount", longArrayOf(hpeerenum, pcount)).toInt()
}

public fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetNextItem", longArrayOf(hpeerenum, pcount, pppvitems)).toInt()
}

public fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetNodeInfo", longArrayOf(hgraph, ullnodeid.toLong(), ppnodeinfo)).toInt()
}

public fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetProperties", longArrayOf(hgraph, ppgraphproperties)).toInt()
}

public fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetRecord", longArrayOf(hgraph, precordid, pprecord)).toInt()
}

public fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphGetStatus", longArrayOf(hgraph, pdwstatus)).toInt()
}

public fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphImportDatabase", longArrayOf(hgraph, pwzfilepath)).toInt()
}

public fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphListen", longArrayOf(hgraph, dwscope.toLong(), dwscopeid.toLong(), wport.toLong())).toInt()
}

public fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphOpen", longArrayOf(pwzgraphid, pwzpeerid, pwzdatabasename, psecurityinterface, crecordtypesyncprecedence.toLong(), precordtypesyncprecedence, phgraph)).toInt()
}

public fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphOpenDirectConnection", longArrayOf(hgraph, pwzpeerid, paddress, pullconnectionid)).toInt()
}

public fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphPeerTimeToUniversalTime", longArrayOf(hgraph, pftpeertime, pftuniversaltime)).toInt()
}

public fun PeerGraphRegisterEvent(hgraph: Long, hevent: Foundation.HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphRegisterEvent", longArrayOf(hgraph, Win32DynamicFfi.objectSlot(hevent), ceventregistrations.toLong(), peventregistrations, phpeerevent)).toInt()
}

public fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphSearchRecords", longArrayOf(hgraph, pwzcriteria, phpeerenum)).toInt()
}

public fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphSendData", longArrayOf(hgraph, ullconnectionid.toLong(), ptype, cbdata.toLong(), pvdata)).toInt()
}

public fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphSetNodeAttributes", longArrayOf(hgraph, pwzattributes)).toInt()
}

public fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphSetPresence", longArrayOf(hgraph, fpresent.toLong())).toInt()
}

public fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphSetProperties", longArrayOf(hgraph, pgraphproperties)).toInt()
}

public fun PeerGraphShutdown(): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphShutdown", longArrayOf()).toInt()
}

public fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphStartup", longArrayOf(wversionrequested.toLong(), pversiondata)).toInt()
}

public fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphUniversalTimeToPeerTime", longArrayOf(hgraph, pftuniversaltime, pftpeertime)).toInt()
}

public fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphUnregisterEvent", longArrayOf(hpeerevent)).toInt()
}

public fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphUpdateRecord", longArrayOf(hgraph, precord)).toInt()
}

public fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2pgraph.dll", "PeerGraphValidateDeferredRecords", longArrayOf(hgraph, crecordids.toLong(), precordids)).toInt()
}

public fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupAddRecord", longArrayOf(hgroup, precord, precordid)).toInt()
}

public fun PeerGroupClose(hgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupClose", longArrayOf(hgroup)).toInt()
}

public fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupCloseDirectConnection", longArrayOf(hgroup, ullconnectionid.toLong())).toInt()
}

public fun PeerGroupConnect(hgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupConnect", longArrayOf(hgroup)).toInt()
}

public fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupConnectByAddress", longArrayOf(hgroup, caddresses.toLong(), paddresses)).toInt()
}

public fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupCreate", longArrayOf(pproperties, phgroup)).toInt()
}

public fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupCreateInvitation", longArrayOf(hgroup, pwzidentityinfo, pftexpiration, croles.toLong(), proles, ppwzinvitation)).toInt()
}

public fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupCreatePasswordInvitation", longArrayOf(hgroup, ppwzinvitation)).toInt()
}

public fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupDelete", longArrayOf(pwzidentity, pwzgrouppeername)).toInt()
}

public fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupDeleteRecord", longArrayOf(hgroup, precordid)).toInt()
}

public fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupEnumConnections", longArrayOf(hgroup, dwflags.toLong(), phpeerenum)).toInt()
}

public fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupEnumMembers", longArrayOf(hgroup, dwflags.toLong(), pwzidentity, phpeerenum)).toInt()
}

public fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupEnumRecords", longArrayOf(hgroup, precordtype, phpeerenum)).toInt()
}

public fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupExportConfig", longArrayOf(hgroup, pwzpassword, ppwzxml)).toInt()
}

public fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupExportDatabase", longArrayOf(hgroup, pwzfilepath)).toInt()
}

public fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupGetEventData", longArrayOf(hpeerevent, ppeventdata)).toInt()
}

public fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupGetProperties", longArrayOf(hgroup, ppproperties)).toInt()
}

public fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupGetRecord", longArrayOf(hgroup, precordid, pprecord)).toInt()
}

public fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupGetStatus", longArrayOf(hgroup, pdwstatus)).toInt()
}

public fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupImportConfig", longArrayOf(pwzxml, pwzpassword, foverwrite.toLong(), ppwzidentity, ppwzgroup)).toInt()
}

public fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupImportDatabase", longArrayOf(hgroup, pwzfilepath)).toInt()
}

public fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupIssueCredentials", longArrayOf(hgroup, pwzsubjectidentity, pcredentialinfo, dwflags.toLong(), ppwzinvitation)).toInt()
}

public fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupJoin", longArrayOf(pwzidentity, pwzinvitation, pwzcloud, phgroup)).toInt()
}

public fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupOpen", longArrayOf(pwzidentity, pwzgrouppeername, pwzcloud, phgroup)).toInt()
}

public fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupOpenDirectConnection", longArrayOf(hgroup, pwzidentity, paddress, pullconnectionid)).toInt()
}

public fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupParseInvitation", longArrayOf(pwzinvitation, ppinvitationinfo)).toInt()
}

public fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupPasswordJoin", longArrayOf(pwzidentity, pwzinvitation, pwzpassword, pwzcloud, phgroup)).toInt()
}

public fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupPeerTimeToUniversalTime", longArrayOf(hgroup, pftpeertime, pftuniversaltime)).toInt()
}

public fun PeerGroupRegisterEvent(hgroup: Long, hevent: Foundation.HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupRegisterEvent", longArrayOf(hgroup, Win32DynamicFfi.objectSlot(hevent), ceventregistration.toLong(), peventregistrations, phpeerevent)).toInt()
}

public fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupResumePasswordAuthentication", longArrayOf(hgroup, hpeereventhandle)).toInt()
}

public fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupSearchRecords", longArrayOf(hgroup, pwzcriteria, phpeerenum)).toInt()
}

public fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupSendData", longArrayOf(hgroup, ullconnectionid.toLong(), ptype, cbdata.toLong(), pvdata)).toInt()
}

public fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupSetProperties", longArrayOf(hgroup, pproperties)).toInt()
}

public fun PeerGroupShutdown(): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupShutdown", longArrayOf()).toInt()
}

public fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupStartup", longArrayOf(wversionrequested.toLong(), pversiondata)).toInt()
}

public fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupUniversalTimeToPeerTime", longArrayOf(hgroup, pftuniversaltime, pftpeertime)).toInt()
}

public fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupUnregisterEvent", longArrayOf(hpeerevent)).toInt()
}

public fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerGroupUpdateRecord", longArrayOf(hgroup, precord)).toInt()
}

public fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerHostNameToPeerName", longArrayOf(pwzhostname, ppwzpeername)).toInt()
}

public fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityCreate", longArrayOf(pwzclassifier, pwzfriendlyname, hcryptprov.toLong(), ppwzidentity)).toInt()
}

public fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityDelete", longArrayOf(pwzidentity)).toInt()
}

public fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityExport", longArrayOf(pwzidentity, pwzpassword, ppwzexportxml)).toInt()
}

public fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityGetCryptKey", longArrayOf(pwzidentity, phcryptprov)).toInt()
}

public fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityGetDefault", longArrayOf(ppwzpeername)).toInt()
}

public fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityGetFriendlyName", longArrayOf(pwzidentity, ppwzfriendlyname)).toInt()
}

public fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityGetXML", longArrayOf(pwzidentity, ppwzidentityxml)).toInt()
}

public fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentityImport", longArrayOf(pwzimportxml, pwzpassword, ppwzidentity)).toInt()
}

public fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerIdentitySetFriendlyName", longArrayOf(pwzidentity, pwzfriendlyname)).toInt()
}

public fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerNameToPeerHostName", longArrayOf(pwzpeername, ppwzhostname)).toInt()
}

public fun PeerPnrpEndResolve(hresolve: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpEndResolve", longArrayOf(hresolve)).toInt()
}

public fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpGetCloudInfo", longArrayOf(pcnumclouds, ppcloudinfo)).toInt()
}

public fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpGetEndpoint", longArrayOf(hresolve, ppendpoint)).toInt()
}

public fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpRegister", longArrayOf(pcwzpeername, pregistrationinfo, phregistration)).toInt()
}

public fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpResolve", longArrayOf(pcwzpeername, pcwzcloudname, pcendpoints, ppendpoints)).toInt()
}

public fun PeerPnrpShutdown(): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpShutdown", longArrayOf()).toInt()
}

public fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: Foundation.HANDLE, phresolve: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpStartResolve", longArrayOf(pcwzpeername, pcwzcloudname, cmaxendpoints.toLong(), Win32DynamicFfi.objectSlot(hevent), phresolve)).toInt()
}

public fun PeerPnrpStartup(wversionrequested: UShort): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpStartup", longArrayOf(wversionrequested.toLong())).toInt()
}

public fun PeerPnrpUnregister(hregistration: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpUnregister", longArrayOf(hregistration)).toInt()
}

public fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("p2p.dll", "PeerPnrpUpdateRegistration", longArrayOf(hregistration, pregistrationinfo)).toInt()
}
