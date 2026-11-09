@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DrtClose(hdrt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtClose(hdrt.toCPointer<ByteVar>())
}

public actual fun DrtContinueSearch(hsearchcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch(hsearchcontext.toCPointer<ByteVar>())

public actual fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey(plocalcert.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>())

public actual fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider(prootcert.toCPointer<ByteVar>(), plocalcert.toCPointer<ByteVar>(), ppsecurityprovider.toCPointer<ByteVar>())

public actual fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver(port, pwszaddress.toCPointer<ByteVar>(), ppmodule.toCPointer<ByteVar>())

public actual fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport(scope, dwscopeid, dwlocalitythreshold, pwport.toCPointer<ByteVar>(), phtransport.toCPointer<ByteVar>())

public actual fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider(ppsecurityprovider.toCPointer<ByteVar>())

public actual fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.toCPointer<ByteVar>(), pwzcloudname.toCPointer<ByteVar>(), pwzpublishingidentity.toCPointer<ByteVar>(), ppresolver.toCPointer<ByteVar>())

public actual fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider(psecurityprovider.toCPointer<ByteVar>())
}

public actual fun DrtDeleteDnsBootstrapResolver(presolver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver(presolver.toCPointer<ByteVar>())
}

public actual fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport(htransport.toCPointer<ByteVar>())

public actual fun DrtDeleteNullSecurityProvider(psecurityprovider: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider(psecurityprovider.toCPointer<ByteVar>())
}

public actual fun DrtDeletePnrpBootstrapResolver(presolver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver(presolver.toCPointer<ByteVar>())
}

public actual fun DrtEndSearch(hsearchcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch(hsearchcontext.toCPointer<ByteVar>())

public actual fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData(hdrt.toCPointer<ByteVar>(), uleventdatalen, peventdata.toCPointer<ByteVar>())

public actual fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize(hdrt.toCPointer<ByteVar>(), puleventdatalen.toCPointer<ByteVar>())

public actual fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName(hdrt.toCPointer<ByteVar>(), ulcbinstancenamesize, pwzdrtinstancename.toCPointer<ByteVar>())

public actual fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize(hdrt.toCPointer<ByteVar>(), pulcbinstancenamesize.toCPointer<ByteVar>())

public actual fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath(hsearchcontext.toCPointer<ByteVar>(), ulsearchpathsize, psearchpath.toCPointer<ByteVar>())

public actual fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize(hsearchcontext.toCPointer<ByteVar>(), pulsearchpathsize.toCPointer<ByteVar>())

public actual fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult(hsearchcontext.toCPointer<ByteVar>(), ulsearchresultsize, psearchresult.toCPointer<ByteVar>())

public actual fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize(hsearchcontext.toCPointer<ByteVar>(), pulsearchresultsize.toCPointer<ByteVar>())

public actual fun DrtOpen(psettings: Long, hevent: HANDLE, pvcontext: Long, phdrt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtOpen(psettings.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), phdrt.toCPointer<ByteVar>())

public actual fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey(hdrt.toCPointer<ByteVar>(), pregistration.toCPointer<ByteVar>(), pvkeycontext.toCPointer<ByteVar>(), phkeyregistration.toCPointer<ByteVar>())

public actual fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch(hdrt.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), timeout, hevent.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), hsearchcontext.toCPointer<ByteVar>())

public actual fun DrtUnregisterKey(hkeyregistration: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey(hkeyregistration.toCPointer<ByteVar>())
}

public actual fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey(hkeyregistration.toCPointer<ByteVar>(), pappdata.toCPointer<ByteVar>())

public actual fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact(pwzcontactdata.toCPointer<ByteVar>(), ppcontact.toCPointer<ByteVar>())

public actual fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact(pccontact.toCPointer<ByteVar>(), pcendpoint.toCPointer<ByteVar>(), pcinvitation.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), phinvitation.toCPointer<ByteVar>())

public actual fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint(pcendpoint.toCPointer<ByteVar>(), pcinvitation.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), phinvitation.toCPointer<ByteVar>())

public actual fun PeerCollabCancelInvitation(hinvitation: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation(hinvitation.toCPointer<ByteVar>())

public actual fun PeerCollabCloseHandle(hinvitation: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle(hinvitation.toCPointer<ByteVar>())

public actual fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact(pwzpeername.toCPointer<ByteVar>())

public actual fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData(pcendpoint.toCPointer<ByteVar>())

public actual fun PeerCollabDeleteObject(pobjectid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject(pobjectid.toCPointer<ByteVar>())

public actual fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications(pcendpoint.toCPointer<ByteVar>(), papplicationid.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts(phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints(pccontact.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects(pcendpoint.toCPointer<ByteVar>(), pobjectid.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe(phpeerenum.toCPointer<ByteVar>())

public actual fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact(pwzpeername.toCPointer<ByteVar>(), ppwzcontactdata.toCPointer<ByteVar>())

public actual fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo(pplaunchinfo.toCPointer<ByteVar>())

public actual fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo(papplicationid.toCPointer<ByteVar>(), registrationtype, ppapplication.toCPointer<ByteVar>())

public actual fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact(pwzpeername.toCPointer<ByteVar>(), ppcontact.toCPointer<ByteVar>())

public actual fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName(ppwzendpointname.toCPointer<ByteVar>())

public actual fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData(hpeerevent.toCPointer<ByteVar>(), ppeventdata.toCPointer<ByteVar>())

public actual fun PeerCollabGetInvitationResponse(hinvitation: HANDLE, ppinvitationresponse: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse(hinvitation.toCPointer<ByteVar>(), ppinvitationresponse.toCPointer<ByteVar>())

public actual fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo(pcendpoint.toCPointer<ByteVar>(), pppresenceinfo.toCPointer<ByteVar>())

public actual fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions(pdwsigninoptions.toCPointer<ByteVar>())

public actual fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact(pccontact.toCPointer<ByteVar>(), pcendpoint.toCPointer<ByteVar>(), pcinvitation.toCPointer<ByteVar>(), ppresponse.toCPointer<ByteVar>())

public actual fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint(pcendpoint.toCPointer<ByteVar>(), pcinvitation.toCPointer<ByteVar>(), ppresponse.toCPointer<ByteVar>())

public actual fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact(pwzcontactdata.toCPointer<ByteVar>(), ppcontact.toCPointer<ByteVar>())

public actual fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData(pcendpoint.toCPointer<ByteVar>(), ppwzcontactdata.toCPointer<ByteVar>())

public actual fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData(pcendpoint.toCPointer<ByteVar>())

public actual fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication(pcapplication.toCPointer<ByteVar>(), registrationtype)

public actual fun PeerCollabRegisterEvent(hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent(hevent.toCPointer<ByteVar>(), ceventregistration, peventregistrations.toCPointer<ByteVar>(), phpeerevent.toCPointer<ByteVar>())

public actual fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName(pwzendpointname.toCPointer<ByteVar>())

public actual fun PeerCollabSetObject(pcobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject(pcobject.toCPointer<ByteVar>())

public actual fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo(pcpresenceinfo.toCPointer<ByteVar>())

public actual fun PeerCollabShutdown(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown()

public actual fun PeerCollabSignin(hwndparent: HWND, dwsigninoptions: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin(hwndparent.toCPointer<ByteVar>(), dwsigninoptions)

public actual fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout(dwsigninoptions)

public actual fun PeerCollabStartup(wversionrequested: UShort): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup(wversionrequested)

public actual fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData(pcendpoint.toCPointer<ByteVar>())

public actual fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication(papplicationid.toCPointer<ByteVar>(), registrationtype)

public actual fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent(hpeerevent.toCPointer<ByteVar>())

public actual fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData(pcendpoint.toCPointer<ByteVar>())

public actual fun PeerCollabUpdateContact(pcontact: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact(pcontact.toCPointer<ByteVar>())

public actual fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName(pwzidentity.toCPointer<ByteVar>(), pwzclassifier.toCPointer<ByteVar>(), ppwzpeername.toCPointer<ByteVar>())

public actual fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer.toCPointer<ByteVar>(), dwtimeoutinmilliseconds, lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, poverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent(hpeerdist, hcontenthandle)

public actual fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent(hpeerdist, pcontenttag.toCPointer<ByteVar>(), hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize, lpinformation.toCPointer<ByteVar>())

public actual fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent(hpeerdist, pcontenttag.toCPointer<ByteVar>(), hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, phcontenthandle.toCPointer<ByteVar>())

public actual fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer.toCPointer<ByteVar>(), dwtimeoutinmilliseconds, lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult(lpoverlapped.toCPointer<ByteVar>(), lpnumberofbytestransferred.toCPointer<ByteVar>(), bwait)

public actual fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus(hpeerdist, ppeerdiststatus.toCPointer<ByteVar>())

public actual fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx(hpeerdist, ppeerdiststatus.toCPointer<ByteVar>())

public actual fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification(hpeerdist, hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped.toCPointer<ByteVar>(), ppeerdiststatus.toCPointer<ByteVar>())

public actual fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx(hpeerdist, hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped.toCPointer<ByteVar>(), ppeerdiststatus.toCPointer<ByteVar>())

public actual fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier, pcontentidentifier.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation(hpeerdist, hcontentinfo)

public actual fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle(hpeerdist, hstream)

public actual fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier, pcontentidentifier.toCPointer<ByteVar>(), ullcontentoffset, cbcontentlength, hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, phcontentinfo.toCPointer<ByteVar>())

public actual fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier, pcontentidentifier.toCPointer<ByteVar>(), ullcontentoffset, cbcontentlength, pretrievaloptions.toCPointer<ByteVar>(), hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, phcontentinfo.toCPointer<ByteVar>())

public actual fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes, pbuffer.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream(hpeerdist, hstream, lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phstream: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream(hpeerdist, cbcontentidentifier, pcontentidentifier.toCPointer<ByteVar>(), cbcontentlength, ppublishoptions.toCPointer<ByteVar>(), hcompletionport.toCPointer<ByteVar>(), ulcompletionkey, phstream.toCPointer<ByteVar>())

public actual fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes, pbuffer.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish(hpeerdist, cbcontentidentifier, pcontentidentifier.toCPointer<ByteVar>())

public actual fun PeerDistShutdown(hpeerdist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown(hpeerdist)

public actual fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup(dwversionrequested, phpeerdist.toCPointer<ByteVar>(), pdwsupportedversion.toCPointer<ByteVar>())

public actual fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification(hpeerdist)

public actual fun PeerEndEnumeration(hpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration(hpeerenum.toCPointer<ByteVar>())

public actual fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups(pwzidentity.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerEnumIdentities(phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities(phpeerenum.toCPointer<ByteVar>())

public actual fun PeerFreeData(pvdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerFreeData(pvdata.toCPointer<ByteVar>())
}

public actual fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount(hpeerenum.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem(hpeerenum.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>(), pppvitems.toCPointer<ByteVar>())

public actual fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord(hgraph.toCPointer<ByteVar>(), precord.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>())

public actual fun PeerGraphClose(hgraph: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose(hgraph.toCPointer<ByteVar>())

public actual fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection(hgraph.toCPointer<ByteVar>(), ullconnectionid)

public actual fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect(hgraph.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), paddress.toCPointer<ByteVar>(), pullconnectionid.toCPointer<ByteVar>())

public actual fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate(pgraphproperties.toCPointer<ByteVar>(), pwzdatabasename.toCPointer<ByteVar>(), psecurityinterface.toCPointer<ByteVar>(), phgraph.toCPointer<ByteVar>())

public actual fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete(pwzgraphid.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), pwzdatabasename.toCPointer<ByteVar>())

public actual fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord(hgraph.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>(), flocal)

public actual fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration(hpeerenum.toCPointer<ByteVar>())

public actual fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections(hgraph.toCPointer<ByteVar>(), dwflags, phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes(hgraph.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords(hgraph.toCPointer<ByteVar>(), precordtype.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase(hgraph.toCPointer<ByteVar>(), pwzfilepath.toCPointer<ByteVar>())

public actual fun PeerGraphFreeData(pvdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData(pvdata.toCPointer<ByteVar>())
}

public actual fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData(hpeerevent.toCPointer<ByteVar>(), ppeventdata.toCPointer<ByteVar>())

public actual fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount(hpeerenum.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem(hpeerenum.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>(), pppvitems.toCPointer<ByteVar>())

public actual fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo(hgraph.toCPointer<ByteVar>(), ullnodeid, ppnodeinfo.toCPointer<ByteVar>())

public actual fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties(hgraph.toCPointer<ByteVar>(), ppgraphproperties.toCPointer<ByteVar>())

public actual fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord(hgraph.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>(), pprecord.toCPointer<ByteVar>())

public actual fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus(hgraph.toCPointer<ByteVar>(), pdwstatus.toCPointer<ByteVar>())

public actual fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase(hgraph.toCPointer<ByteVar>(), pwzfilepath.toCPointer<ByteVar>())

public actual fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen(hgraph.toCPointer<ByteVar>(), dwscope, dwscopeid, wport)

public actual fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen(pwzgraphid.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), pwzdatabasename.toCPointer<ByteVar>(), psecurityinterface.toCPointer<ByteVar>(), crecordtypesyncprecedence, precordtypesyncprecedence.toCPointer<ByteVar>(), phgraph.toCPointer<ByteVar>())

public actual fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection(hgraph.toCPointer<ByteVar>(), pwzpeerid.toCPointer<ByteVar>(), paddress.toCPointer<ByteVar>(), pullconnectionid.toCPointer<ByteVar>())

public actual fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime(hgraph.toCPointer<ByteVar>(), pftpeertime.toCPointer<ByteVar>(), pftuniversaltime.toCPointer<ByteVar>())

public actual fun PeerGraphRegisterEvent(hgraph: Long, hevent: HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent(hgraph.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), ceventregistrations, peventregistrations.toCPointer<ByteVar>(), phpeerevent.toCPointer<ByteVar>())

public actual fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords(hgraph.toCPointer<ByteVar>(), pwzcriteria.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData(hgraph.toCPointer<ByteVar>(), ullconnectionid, ptype.toCPointer<ByteVar>(), cbdata, pvdata.toCPointer<ByteVar>())

public actual fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes(hgraph.toCPointer<ByteVar>(), pwzattributes.toCPointer<ByteVar>())

public actual fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence(hgraph.toCPointer<ByteVar>(), fpresent)

public actual fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties(hgraph.toCPointer<ByteVar>(), pgraphproperties.toCPointer<ByteVar>())

public actual fun PeerGraphShutdown(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown()

public actual fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup(wversionrequested, pversiondata.toCPointer<ByteVar>())

public actual fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime(hgraph.toCPointer<ByteVar>(), pftuniversaltime.toCPointer<ByteVar>(), pftpeertime.toCPointer<ByteVar>())

public actual fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent(hpeerevent.toCPointer<ByteVar>())

public actual fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord(hgraph.toCPointer<ByteVar>(), precord.toCPointer<ByteVar>())

public actual fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords(hgraph.toCPointer<ByteVar>(), crecordids, precordids.toCPointer<ByteVar>())

public actual fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord(hgroup.toCPointer<ByteVar>(), precord.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>())

public actual fun PeerGroupClose(hgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose(hgroup.toCPointer<ByteVar>())

public actual fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection(hgroup.toCPointer<ByteVar>(), ullconnectionid)

public actual fun PeerGroupConnect(hgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect(hgroup.toCPointer<ByteVar>())

public actual fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress(hgroup.toCPointer<ByteVar>(), caddresses, paddresses.toCPointer<ByteVar>())

public actual fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate(pproperties.toCPointer<ByteVar>(), phgroup.toCPointer<ByteVar>())

public actual fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation(hgroup.toCPointer<ByteVar>(), pwzidentityinfo.toCPointer<ByteVar>(), pftexpiration.toCPointer<ByteVar>(), croles, proles.toCPointer<ByteVar>(), ppwzinvitation.toCPointer<ByteVar>())

public actual fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation(hgroup.toCPointer<ByteVar>(), ppwzinvitation.toCPointer<ByteVar>())

public actual fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete(pwzidentity.toCPointer<ByteVar>(), pwzgrouppeername.toCPointer<ByteVar>())

public actual fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord(hgroup.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>())

public actual fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections(hgroup.toCPointer<ByteVar>(), dwflags, phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers(hgroup.toCPointer<ByteVar>(), dwflags, pwzidentity.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords(hgroup.toCPointer<ByteVar>(), precordtype.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig(hgroup.toCPointer<ByteVar>(), pwzpassword.toCPointer<ByteVar>(), ppwzxml.toCPointer<ByteVar>())

public actual fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase(hgroup.toCPointer<ByteVar>(), pwzfilepath.toCPointer<ByteVar>())

public actual fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData(hpeerevent.toCPointer<ByteVar>(), ppeventdata.toCPointer<ByteVar>())

public actual fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties(hgroup.toCPointer<ByteVar>(), ppproperties.toCPointer<ByteVar>())

public actual fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord(hgroup.toCPointer<ByteVar>(), precordid.toCPointer<ByteVar>(), pprecord.toCPointer<ByteVar>())

public actual fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus(hgroup.toCPointer<ByteVar>(), pdwstatus.toCPointer<ByteVar>())

public actual fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig(pwzxml.toCPointer<ByteVar>(), pwzpassword.toCPointer<ByteVar>(), foverwrite, ppwzidentity.toCPointer<ByteVar>(), ppwzgroup.toCPointer<ByteVar>())

public actual fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase(hgroup.toCPointer<ByteVar>(), pwzfilepath.toCPointer<ByteVar>())

public actual fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials(hgroup.toCPointer<ByteVar>(), pwzsubjectidentity.toCPointer<ByteVar>(), pcredentialinfo.toCPointer<ByteVar>(), dwflags, ppwzinvitation.toCPointer<ByteVar>())

public actual fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin(pwzidentity.toCPointer<ByteVar>(), pwzinvitation.toCPointer<ByteVar>(), pwzcloud.toCPointer<ByteVar>(), phgroup.toCPointer<ByteVar>())

public actual fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen(pwzidentity.toCPointer<ByteVar>(), pwzgrouppeername.toCPointer<ByteVar>(), pwzcloud.toCPointer<ByteVar>(), phgroup.toCPointer<ByteVar>())

public actual fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection(hgroup.toCPointer<ByteVar>(), pwzidentity.toCPointer<ByteVar>(), paddress.toCPointer<ByteVar>(), pullconnectionid.toCPointer<ByteVar>())

public actual fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation(pwzinvitation.toCPointer<ByteVar>(), ppinvitationinfo.toCPointer<ByteVar>())

public actual fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin(pwzidentity.toCPointer<ByteVar>(), pwzinvitation.toCPointer<ByteVar>(), pwzpassword.toCPointer<ByteVar>(), pwzcloud.toCPointer<ByteVar>(), phgroup.toCPointer<ByteVar>())

public actual fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime(hgroup.toCPointer<ByteVar>(), pftpeertime.toCPointer<ByteVar>(), pftuniversaltime.toCPointer<ByteVar>())

public actual fun PeerGroupRegisterEvent(hgroup: Long, hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent(hgroup.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), ceventregistration, peventregistrations.toCPointer<ByteVar>(), phpeerevent.toCPointer<ByteVar>())

public actual fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication(hgroup.toCPointer<ByteVar>(), hpeereventhandle.toCPointer<ByteVar>())

public actual fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords(hgroup.toCPointer<ByteVar>(), pwzcriteria.toCPointer<ByteVar>(), phpeerenum.toCPointer<ByteVar>())

public actual fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData(hgroup.toCPointer<ByteVar>(), ullconnectionid, ptype.toCPointer<ByteVar>(), cbdata, pvdata.toCPointer<ByteVar>())

public actual fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties(hgroup.toCPointer<ByteVar>(), pproperties.toCPointer<ByteVar>())

public actual fun PeerGroupShutdown(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown()

public actual fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup(wversionrequested, pversiondata.toCPointer<ByteVar>())

public actual fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime(hgroup.toCPointer<ByteVar>(), pftuniversaltime.toCPointer<ByteVar>(), pftpeertime.toCPointer<ByteVar>())

public actual fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent(hpeerevent.toCPointer<ByteVar>())

public actual fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord(hgroup.toCPointer<ByteVar>(), precord.toCPointer<ByteVar>())

public actual fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName(pwzhostname.toCPointer<ByteVar>(), ppwzpeername.toCPointer<ByteVar>())

public actual fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate(pwzclassifier.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>(), hcryptprov, ppwzidentity.toCPointer<ByteVar>())

public actual fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete(pwzidentity.toCPointer<ByteVar>())

public actual fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport(pwzidentity.toCPointer<ByteVar>(), pwzpassword.toCPointer<ByteVar>(), ppwzexportxml.toCPointer<ByteVar>())

public actual fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey(pwzidentity.toCPointer<ByteVar>(), phcryptprov.toCPointer<ByteVar>())

public actual fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault(ppwzpeername.toCPointer<ByteVar>())

public actual fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName(pwzidentity.toCPointer<ByteVar>(), ppwzfriendlyname.toCPointer<ByteVar>())

public actual fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML(pwzidentity.toCPointer<ByteVar>(), ppwzidentityxml.toCPointer<ByteVar>())

public actual fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport(pwzimportxml.toCPointer<ByteVar>(), pwzpassword.toCPointer<ByteVar>(), ppwzidentity.toCPointer<ByteVar>())

public actual fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName(pwzidentity.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>())

public actual fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName(pwzpeername.toCPointer<ByteVar>(), ppwzhostname.toCPointer<ByteVar>())

public actual fun PeerPnrpEndResolve(hresolve: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve(hresolve.toCPointer<ByteVar>())

public actual fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo(pcnumclouds.toCPointer<ByteVar>(), ppcloudinfo.toCPointer<ByteVar>())

public actual fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint(hresolve.toCPointer<ByteVar>(), ppendpoint.toCPointer<ByteVar>())

public actual fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister(pcwzpeername.toCPointer<ByteVar>(), pregistrationinfo.toCPointer<ByteVar>(), phregistration.toCPointer<ByteVar>())

public actual fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve(pcwzpeername.toCPointer<ByteVar>(), pcwzcloudname.toCPointer<ByteVar>(), pcendpoints.toCPointer<ByteVar>(), ppendpoints.toCPointer<ByteVar>())

public actual fun PeerPnrpShutdown(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown()

public actual fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: HANDLE, phresolve: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve(pcwzpeername.toCPointer<ByteVar>(), pcwzcloudname.toCPointer<ByteVar>(), cmaxendpoints, hevent.toCPointer<ByteVar>(), phresolve.toCPointer<ByteVar>())

public actual fun PeerPnrpStartup(wversionrequested: UShort): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup(wversionrequested)

public actual fun PeerPnrpUnregister(hregistration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister(hregistration.toCPointer<ByteVar>())

public actual fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration(hregistration.toCPointer<ByteVar>(), pregistrationinfo.toCPointer<ByteVar>())
