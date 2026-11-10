@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun drtClose(hdrt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtClose(hdrt?.value?.toCPointer<ByteVar>())
}

public actual fun drtContinueSearch(hsearchcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch(hsearchcontext?.value?.toCPointer<ByteVar>())

public actual fun drtCreateDerivedKey(plocalcert: COpaquePointer?, pkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey(plocalcert?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>())

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: COpaquePointer?, plocalcert: COpaquePointer?, ppsecurityprovider: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider(prootcert?.value?.toCPointer<ByteVar>(), plocalcert?.value?.toCPointer<ByteVar>(), ppsecurityprovider?.value?.toCPointer<ByteVar>())

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(port, pwszaddress?.value?.toCPointer<ByteVar>(), ppmodule?.value?.toCPointer<ByteVar>())

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: COpaquePointer?, phtransport: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(scope, dwscopeid, dwlocalitythreshold, pwport?.value?.toCPointer<ByteVar>(), phtransport?.value?.toCPointer<ByteVar>())

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider(ppsecurityprovider?.value?.toCPointer<ByteVar>())

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(fpublish, pwzpeername?.value?.toCPointer<ByteVar>(), pwzcloudname?.value?.toCPointer<ByteVar>(), pwzpublishingidentity?.value?.toCPointer<ByteVar>(), ppresolver?.value?.toCPointer<ByteVar>())

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider(psecurityprovider?.value?.toCPointer<ByteVar>())
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver(presolver?.value?.toCPointer<ByteVar>())
}

public actual fun drtDeleteIpv6UdpTransport(htransport: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport(htransport?.value?.toCPointer<ByteVar>())

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider(psecurityprovider?.value?.toCPointer<ByteVar>())
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver(presolver?.value?.toCPointer<ByteVar>())
}

public actual fun drtEndSearch(hsearchcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtEndSearch(hsearchcontext?.value?.toCPointer<ByteVar>())

public actual fun drtGetEventData(hdrt: COpaquePointer?, uleventdatalen: UInt, peventdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetEventData(hdrt?.value?.toCPointer<ByteVar>(), uleventdatalen, peventdata?.value?.toCPointer<ByteVar>())

public actual fun drtGetEventDataSize(hdrt: COpaquePointer?, puleventdatalen: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize(hdrt?.value?.toCPointer<ByteVar>(), puleventdatalen?.value?.toCPointer<ByteVar>())

public actual fun drtGetInstanceName(hdrt: COpaquePointer?, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName(hdrt?.value?.toCPointer<ByteVar>(), ulcbinstancenamesize, pwzdrtinstancename?.value?.toCPointer<ByteVar>())

public actual fun drtGetInstanceNameSize(hdrt: COpaquePointer?, pulcbinstancenamesize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize(hdrt?.value?.toCPointer<ByteVar>(), pulcbinstancenamesize?.value?.toCPointer<ByteVar>())

public actual fun drtGetSearchPath(hsearchcontext: COpaquePointer?, ulsearchpathsize: UInt, psearchpath: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath(hsearchcontext?.value?.toCPointer<ByteVar>(), ulsearchpathsize, psearchpath?.value?.toCPointer<ByteVar>())

public actual fun drtGetSearchPathSize(hsearchcontext: COpaquePointer?, pulsearchpathsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize(hsearchcontext?.value?.toCPointer<ByteVar>(), pulsearchpathsize?.value?.toCPointer<ByteVar>())

public actual fun drtGetSearchResult(hsearchcontext: COpaquePointer?, ulsearchresultsize: UInt, psearchresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult(hsearchcontext?.value?.toCPointer<ByteVar>(), ulsearchresultsize, psearchresult?.value?.toCPointer<ByteVar>())

public actual fun drtGetSearchResultSize(hsearchcontext: COpaquePointer?, pulsearchresultsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize(hsearchcontext?.value?.toCPointer<ByteVar>(), pulsearchresultsize?.value?.toCPointer<ByteVar>())

public actual fun drtOpen(psettings: COpaquePointer?, hevent: Handle, pvcontext: COpaquePointer?, phdrt: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtOpen(psettings?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), phdrt?.value?.toCPointer<ByteVar>())

public actual fun drtRegisterKey(hdrt: COpaquePointer?, pregistration: COpaquePointer?, pvkeycontext: COpaquePointer?, phkeyregistration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey(hdrt?.value?.toCPointer<ByteVar>(), pregistration?.value?.toCPointer<ByteVar>(), pvkeycontext?.value?.toCPointer<ByteVar>(), phkeyregistration?.value?.toCPointer<ByteVar>())

public actual fun drtStartSearch(hdrt: COpaquePointer?, pkey: COpaquePointer?, pinfo: COpaquePointer?, timeout: UInt, hevent: Handle, pvcontext: COpaquePointer?, hsearchcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtStartSearch(hdrt?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pinfo?.value?.toCPointer<ByteVar>(), timeout, hevent?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), hsearchcontext?.value?.toCPointer<ByteVar>())

public actual fun drtUnregisterKey(hkeyregistration: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey(hkeyregistration?.value?.toCPointer<ByteVar>())
}

public actual fun drtUpdateKey(hkeyregistration: COpaquePointer?, pappdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey(hkeyregistration?.value?.toCPointer<ByteVar>(), pappdata?.value?.toCPointer<ByteVar>())

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact(pwzcontactdata?.value?.toCPointer<ByteVar>(), ppcontact?.value?.toCPointer<ByteVar>())

public actual fun peerCollabAsyncInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact(pccontact?.value?.toCPointer<ByteVar>(), pcendpoint?.value?.toCPointer<ByteVar>(), pcinvitation?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), phinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint(pcendpoint?.value?.toCPointer<ByteVar>(), pcinvitation?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), phinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation(hinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle(hinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact(pwzpeername?.value?.toCPointer<ByteVar>())

public actual fun peerCollabDeleteEndpointData(pcendpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData(pcendpoint?.value?.toCPointer<ByteVar>())

public actual fun peerCollabDeleteObject(pobjectid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject(pobjectid?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumApplications(pcendpoint: COpaquePointer?, papplicationid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications(pcendpoint?.value?.toCPointer<ByteVar>(), papplicationid?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumContacts(phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts(phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumEndpoints(pccontact: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints(pccontact?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumObjects(pcendpoint: COpaquePointer?, pobjectid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects(pcendpoint?.value?.toCPointer<ByteVar>(), pobjectid?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe(phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact(pwzpeername?.value?.toCPointer<ByteVar>(), ppwzcontactdata?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo(pplaunchinfo?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType, ppapplication: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo(papplicationid?.value?.toCPointer<ByteVar>(), registrationtype, ppapplication?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact(pwzpeername?.value?.toCPointer<ByteVar>(), ppcontact?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetEndpointName(ppwzendpointname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName(ppwzendpointname?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData(hpeerevent?.value?.toCPointer<ByteVar>(), ppeventdata?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse(hinvitation?.value?.toCPointer<ByteVar>(), ppinvitationresponse?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetPresenceInfo(pcendpoint: COpaquePointer?, pppresenceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo(pcendpoint?.value?.toCPointer<ByteVar>(), pppresenceinfo?.value?.toCPointer<ByteVar>())

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions(pdwsigninoptions?.value?.toCPointer<ByteVar>())

public actual fun peerCollabInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact(pccontact?.value?.toCPointer<ByteVar>(), pcendpoint?.value?.toCPointer<ByteVar>(), pcinvitation?.value?.toCPointer<ByteVar>(), ppresponse?.value?.toCPointer<ByteVar>())

public actual fun peerCollabInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint(pcendpoint?.value?.toCPointer<ByteVar>(), pcinvitation?.value?.toCPointer<ByteVar>(), ppresponse?.value?.toCPointer<ByteVar>())

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact(pwzcontactdata?.value?.toCPointer<ByteVar>(), ppcontact?.value?.toCPointer<ByteVar>())

public actual fun peerCollabQueryContactData(pcendpoint: COpaquePointer?, ppwzcontactdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData(pcendpoint?.value?.toCPointer<ByteVar>(), ppwzcontactdata?.value?.toCPointer<ByteVar>())

public actual fun peerCollabRefreshEndpointData(pcendpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData(pcendpoint?.value?.toCPointer<ByteVar>())

public actual fun peerCollabRegisterApplication(pcapplication: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication(pcapplication?.value?.toCPointer<ByteVar>(), registrationtype)

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent(hevent?.value?.toCPointer<ByteVar>(), ceventregistration, peventregistrations?.value?.toCPointer<ByteVar>(), phpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName(pwzendpointname?.value?.toCPointer<ByteVar>())

public actual fun peerCollabSetObject(pcobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject(pcobject?.value?.toCPointer<ByteVar>())

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo(pcpresenceinfo?.value?.toCPointer<ByteVar>())

public actual fun peerCollabShutdown(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown()

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin(hwndparent?.value?.toCPointer<ByteVar>(), dwsigninoptions)

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(dwsigninoptions)

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(wversionrequested)

public actual fun peerCollabSubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData(pcendpoint?.value?.toCPointer<ByteVar>())

public actual fun peerCollabUnregisterApplication(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication(papplicationid?.value?.toCPointer<ByteVar>(), registrationtype)

public actual fun peerCollabUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent(hpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData(pcendpoint?.value?.toCPointer<ByteVar>())

public actual fun peerCollabUpdateContact(pcontact: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact(pcontact?.value?.toCPointer<ByteVar>())

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName(pwzidentity?.value?.toCPointer<ByteVar>(), pwzclassifier?.value?.toCPointer<ByteVar>(), ppwzpeername?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), dwtimeoutinmilliseconds, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, poverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(hpeerdist, hcontenthandle)

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(hpeerdist, pcontenttag?.value?.toCPointer<ByteVar>(), hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize, lpinformation?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(hpeerdist, pcontenttag?.value?.toCPointer<ByteVar>(), hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, phcontenthandle?.value?.toCPointer<ByteVar>())

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), dwtimeoutinmilliseconds, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistGetOverlappedResult(lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult(lpoverlapped?.value?.toCPointer<ByteVar>(), lpnumberofbytestransferred?.value?.toCPointer<ByteVar>(), bwait)

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(hpeerdist, ppeerdiststatus?.value?.toCPointer<ByteVar>())

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(hpeerdist, ppeerdiststatus?.value?.toCPointer<ByteVar>())

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(hpeerdist, hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped?.value?.toCPointer<ByteVar>(), ppeerdiststatus?.value?.toCPointer<ByteVar>())

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(hpeerdist, hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, lpoverlapped?.value?.toCPointer<ByteVar>(), ppeerdiststatus?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier, pcontentidentifier?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(hpeerdist, hcontentinfo)

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(hpeerdist, hstream)

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier, pcontentidentifier?.value?.toCPointer<ByteVar>(), ullcontentoffset, cbcontentlength, hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, phcontentinfo?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier, pcontentidentifier?.value?.toCPointer<ByteVar>(), ullcontentoffset, cbcontentlength, pretrievaloptions?.value?.toCPointer<ByteVar>(), hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, phcontentinfo?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(hpeerdist, hstream, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, cbcontentlength: ULong, ppublishoptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phstream: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(hpeerdist, cbcontentidentifier, pcontentidentifier?.value?.toCPointer<ByteVar>(), cbcontentlength, ppublishoptions?.value?.toCPointer<ByteVar>(), hcompletionport?.value?.toCPointer<ByteVar>(), ulcompletionkey, phstream?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes, pbuffer?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(hpeerdist, cbcontentidentifier, pcontentidentifier?.value?.toCPointer<ByteVar>())

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(hpeerdist)

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: COpaquePointer?, pdwsupportedversion: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(dwversionrequested, phpeerdist?.value?.toCPointer<ByteVar>(), pdwsupportedversion?.value?.toCPointer<ByteVar>())

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(hpeerdist)

public actual fun peerEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration(hpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups(pwzidentity?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerEnumIdentities(phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities(phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerFreeData(pvdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerFreeData(pvdata?.value?.toCPointer<ByteVar>())
}

public actual fun peerGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount(hpeerenum?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun peerGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem(hpeerenum?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>(), pppvitems?.value?.toCPointer<ByteVar>())

public actual fun peerGraphAddRecord(hgraph: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord(hgraph?.value?.toCPointer<ByteVar>(), precord?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>())

public actual fun peerGraphClose(hgraph: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphClose(hgraph?.value?.toCPointer<ByteVar>())

public actual fun peerGraphCloseDirectConnection(hgraph: COpaquePointer?, ullconnectionid: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection(hgraph?.value?.toCPointer<ByteVar>(), ullconnectionid)

public actual fun peerGraphConnect(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect(hgraph?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), paddress?.value?.toCPointer<ByteVar>(), pullconnectionid?.value?.toCPointer<ByteVar>())

public actual fun peerGraphCreate(pgraphproperties: COpaquePointer?, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate(pgraphproperties?.value?.toCPointer<ByteVar>(), pwzdatabasename?.value?.toCPointer<ByteVar>(), psecurityinterface?.value?.toCPointer<ByteVar>(), phgraph?.value?.toCPointer<ByteVar>())

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete(pwzgraphid?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), pwzdatabasename?.value?.toCPointer<ByteVar>())

public actual fun peerGraphDeleteRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, flocal: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord(hgraph?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>(), flocal)

public actual fun peerGraphEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration(hpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGraphEnumConnections(hgraph: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections(hgraph?.value?.toCPointer<ByteVar>(), dwflags, phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGraphEnumNodes(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes(hgraph?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGraphEnumRecords(hgraph: COpaquePointer?, precordtype: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords(hgraph?.value?.toCPointer<ByteVar>(), precordtype?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGraphExportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase(hgraph?.value?.toCPointer<ByteVar>(), pwzfilepath?.value?.toCPointer<ByteVar>())

public actual fun peerGraphFreeData(pvdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData(pvdata?.value?.toCPointer<ByteVar>())
}

public actual fun peerGraphGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData(hpeerevent?.value?.toCPointer<ByteVar>(), ppeventdata?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount(hpeerenum?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem(hpeerenum?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>(), pppvitems?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetNodeInfo(hgraph: COpaquePointer?, ullnodeid: ULong, ppnodeinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo(hgraph?.value?.toCPointer<ByteVar>(), ullnodeid, ppnodeinfo?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetProperties(hgraph: COpaquePointer?, ppgraphproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties(hgraph?.value?.toCPointer<ByteVar>(), ppgraphproperties?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord(hgraph?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>(), pprecord?.value?.toCPointer<ByteVar>())

public actual fun peerGraphGetStatus(hgraph: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus(hgraph?.value?.toCPointer<ByteVar>(), pdwstatus?.value?.toCPointer<ByteVar>())

public actual fun peerGraphImportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase(hgraph?.value?.toCPointer<ByteVar>(), pwzfilepath?.value?.toCPointer<ByteVar>())

public actual fun peerGraphListen(hgraph: COpaquePointer?, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphListen(hgraph?.value?.toCPointer<ByteVar>(), dwscope, dwscopeid, wport)

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen(pwzgraphid?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), pwzdatabasename?.value?.toCPointer<ByteVar>(), psecurityinterface?.value?.toCPointer<ByteVar>(), crecordtypesyncprecedence, precordtypesyncprecedence?.value?.toCPointer<ByteVar>(), phgraph?.value?.toCPointer<ByteVar>())

public actual fun peerGraphOpenDirectConnection(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection(hgraph?.value?.toCPointer<ByteVar>(), pwzpeerid?.value?.toCPointer<ByteVar>(), paddress?.value?.toCPointer<ByteVar>(), pullconnectionid?.value?.toCPointer<ByteVar>())

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime(hgraph?.value?.toCPointer<ByteVar>(), pftpeertime?.value?.toCPointer<ByteVar>(), pftuniversaltime?.value?.toCPointer<ByteVar>())

public actual fun peerGraphRegisterEvent(hgraph: COpaquePointer?, hevent: Handle, ceventregistrations: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent(hgraph?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), ceventregistrations, peventregistrations?.value?.toCPointer<ByteVar>(), phpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerGraphSearchRecords(hgraph: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords(hgraph?.value?.toCPointer<ByteVar>(), pwzcriteria?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGraphSendData(hgraph: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData(hgraph?.value?.toCPointer<ByteVar>(), ullconnectionid, ptype?.value?.toCPointer<ByteVar>(), cbdata, pvdata?.value?.toCPointer<ByteVar>())

public actual fun peerGraphSetNodeAttributes(hgraph: COpaquePointer?, pwzattributes: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes(hgraph?.value?.toCPointer<ByteVar>(), pwzattributes?.value?.toCPointer<ByteVar>())

public actual fun peerGraphSetPresence(hgraph: COpaquePointer?, fpresent: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence(hgraph?.value?.toCPointer<ByteVar>(), fpresent)

public actual fun peerGraphSetProperties(hgraph: COpaquePointer?, pgraphproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties(hgraph?.value?.toCPointer<ByteVar>(), pgraphproperties?.value?.toCPointer<ByteVar>())

public actual fun peerGraphShutdown(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown()

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(wversionrequested, pversiondata?.value?.toCPointer<ByteVar>())

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime(hgraph?.value?.toCPointer<ByteVar>(), pftuniversaltime?.value?.toCPointer<ByteVar>(), pftpeertime?.value?.toCPointer<ByteVar>())

public actual fun peerGraphUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent(hpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerGraphUpdateRecord(hgraph: COpaquePointer?, precord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord(hgraph?.value?.toCPointer<ByteVar>(), precord?.value?.toCPointer<ByteVar>())

public actual fun peerGraphValidateDeferredRecords(hgraph: COpaquePointer?, crecordids: UInt, precordids: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords(hgraph?.value?.toCPointer<ByteVar>(), crecordids, precordids?.value?.toCPointer<ByteVar>())

public actual fun peerGroupAddRecord(hgroup: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord(hgroup?.value?.toCPointer<ByteVar>(), precord?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>())

public actual fun peerGroupClose(hgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupClose(hgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupCloseDirectConnection(hgroup: COpaquePointer?, ullconnectionid: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection(hgroup?.value?.toCPointer<ByteVar>(), ullconnectionid)

public actual fun peerGroupConnect(hgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect(hgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupConnectByAddress(hgroup: COpaquePointer?, caddresses: UInt, paddresses: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress(hgroup?.value?.toCPointer<ByteVar>(), caddresses, paddresses?.value?.toCPointer<ByteVar>())

public actual fun peerGroupCreate(pproperties: COpaquePointer?, phgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate(pproperties?.value?.toCPointer<ByteVar>(), phgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupCreateInvitation(hgroup: COpaquePointer?, pwzidentityinfo: Pcwstr, pftexpiration: COpaquePointer?, croles: UInt, proles: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation(hgroup?.value?.toCPointer<ByteVar>(), pwzidentityinfo?.value?.toCPointer<ByteVar>(), pftexpiration?.value?.toCPointer<ByteVar>(), croles, proles?.value?.toCPointer<ByteVar>(), ppwzinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerGroupCreatePasswordInvitation(hgroup: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation(hgroup?.value?.toCPointer<ByteVar>(), ppwzinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete(pwzidentity?.value?.toCPointer<ByteVar>(), pwzgrouppeername?.value?.toCPointer<ByteVar>())

public actual fun peerGroupDeleteRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord(hgroup?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>())

public actual fun peerGroupEnumConnections(hgroup: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections(hgroup?.value?.toCPointer<ByteVar>(), dwflags, phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGroupEnumMembers(hgroup: COpaquePointer?, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers(hgroup?.value?.toCPointer<ByteVar>(), dwflags, pwzidentity?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGroupEnumRecords(hgroup: COpaquePointer?, precordtype: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords(hgroup?.value?.toCPointer<ByteVar>(), precordtype?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGroupExportConfig(hgroup: COpaquePointer?, pwzpassword: Pcwstr, ppwzxml: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig(hgroup?.value?.toCPointer<ByteVar>(), pwzpassword?.value?.toCPointer<ByteVar>(), ppwzxml?.value?.toCPointer<ByteVar>())

public actual fun peerGroupExportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase(hgroup?.value?.toCPointer<ByteVar>(), pwzfilepath?.value?.toCPointer<ByteVar>())

public actual fun peerGroupGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData(hpeerevent?.value?.toCPointer<ByteVar>(), ppeventdata?.value?.toCPointer<ByteVar>())

public actual fun peerGroupGetProperties(hgroup: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties(hgroup?.value?.toCPointer<ByteVar>(), ppproperties?.value?.toCPointer<ByteVar>())

public actual fun peerGroupGetRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord(hgroup?.value?.toCPointer<ByteVar>(), precordid?.value?.toCPointer<ByteVar>(), pprecord?.value?.toCPointer<ByteVar>())

public actual fun peerGroupGetStatus(hgroup: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus(hgroup?.value?.toCPointer<ByteVar>(), pdwstatus?.value?.toCPointer<ByteVar>())

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: COpaquePointer?, ppwzgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig(pwzxml?.value?.toCPointer<ByteVar>(), pwzpassword?.value?.toCPointer<ByteVar>(), foverwrite, ppwzidentity?.value?.toCPointer<ByteVar>(), ppwzgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupImportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase(hgroup?.value?.toCPointer<ByteVar>(), pwzfilepath?.value?.toCPointer<ByteVar>())

public actual fun peerGroupIssueCredentials(hgroup: COpaquePointer?, pwzsubjectidentity: Pcwstr, pcredentialinfo: COpaquePointer?, dwflags: UInt, ppwzinvitation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials(hgroup?.value?.toCPointer<ByteVar>(), pwzsubjectidentity?.value?.toCPointer<ByteVar>(), pcredentialinfo?.value?.toCPointer<ByteVar>(), dwflags, ppwzinvitation?.value?.toCPointer<ByteVar>())

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin(pwzidentity?.value?.toCPointer<ByteVar>(), pwzinvitation?.value?.toCPointer<ByteVar>(), pwzcloud?.value?.toCPointer<ByteVar>(), phgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen(pwzidentity?.value?.toCPointer<ByteVar>(), pwzgrouppeername?.value?.toCPointer<ByteVar>(), pwzcloud?.value?.toCPointer<ByteVar>(), phgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupOpenDirectConnection(hgroup: COpaquePointer?, pwzidentity: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection(hgroup?.value?.toCPointer<ByteVar>(), pwzidentity?.value?.toCPointer<ByteVar>(), paddress?.value?.toCPointer<ByteVar>(), pullconnectionid?.value?.toCPointer<ByteVar>())

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation(pwzinvitation?.value?.toCPointer<ByteVar>(), ppinvitationinfo?.value?.toCPointer<ByteVar>())

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin(pwzidentity?.value?.toCPointer<ByteVar>(), pwzinvitation?.value?.toCPointer<ByteVar>(), pwzpassword?.value?.toCPointer<ByteVar>(), pwzcloud?.value?.toCPointer<ByteVar>(), phgroup?.value?.toCPointer<ByteVar>())

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime(hgroup?.value?.toCPointer<ByteVar>(), pftpeertime?.value?.toCPointer<ByteVar>(), pftuniversaltime?.value?.toCPointer<ByteVar>())

public actual fun peerGroupRegisterEvent(hgroup: COpaquePointer?, hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent(hgroup?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), ceventregistration, peventregistrations?.value?.toCPointer<ByteVar>(), phpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerGroupResumePasswordAuthentication(hgroup: COpaquePointer?, hpeereventhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication(hgroup?.value?.toCPointer<ByteVar>(), hpeereventhandle?.value?.toCPointer<ByteVar>())

public actual fun peerGroupSearchRecords(hgroup: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords(hgroup?.value?.toCPointer<ByteVar>(), pwzcriteria?.value?.toCPointer<ByteVar>(), phpeerenum?.value?.toCPointer<ByteVar>())

public actual fun peerGroupSendData(hgroup: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData(hgroup?.value?.toCPointer<ByteVar>(), ullconnectionid, ptype?.value?.toCPointer<ByteVar>(), cbdata, pvdata?.value?.toCPointer<ByteVar>())

public actual fun peerGroupSetProperties(hgroup: COpaquePointer?, pproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties(hgroup?.value?.toCPointer<ByteVar>(), pproperties?.value?.toCPointer<ByteVar>())

public actual fun peerGroupShutdown(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown()

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(wversionrequested, pversiondata?.value?.toCPointer<ByteVar>())

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime(hgroup?.value?.toCPointer<ByteVar>(), pftuniversaltime?.value?.toCPointer<ByteVar>(), pftpeertime?.value?.toCPointer<ByteVar>())

public actual fun peerGroupUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent(hpeerevent?.value?.toCPointer<ByteVar>())

public actual fun peerGroupUpdateRecord(hgroup: COpaquePointer?, precord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord(hgroup?.value?.toCPointer<ByteVar>(), precord?.value?.toCPointer<ByteVar>())

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName(pwzhostname?.value?.toCPointer<ByteVar>(), ppwzpeername?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate(pwzclassifier?.value?.toCPointer<ByteVar>(), pwzfriendlyname?.value?.toCPointer<ByteVar>(), hcryptprov, ppwzidentity?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete(pwzidentity?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport(pwzidentity?.value?.toCPointer<ByteVar>(), pwzpassword?.value?.toCPointer<ByteVar>(), ppwzexportxml?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey(pwzidentity?.value?.toCPointer<ByteVar>(), phcryptprov?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityGetDefault(ppwzpeername: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault(ppwzpeername?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName(pwzidentity?.value?.toCPointer<ByteVar>(), ppwzfriendlyname?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML(pwzidentity?.value?.toCPointer<ByteVar>(), ppwzidentityxml?.value?.toCPointer<ByteVar>())

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport(pwzimportxml?.value?.toCPointer<ByteVar>(), pwzpassword?.value?.toCPointer<ByteVar>(), ppwzidentity?.value?.toCPointer<ByteVar>())

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName(pwzidentity?.value?.toCPointer<ByteVar>(), pwzfriendlyname?.value?.toCPointer<ByteVar>())

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName(pwzpeername?.value?.toCPointer<ByteVar>(), ppwzhostname?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpEndResolve(hresolve: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve(hresolve?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpGetCloudInfo(pcnumclouds: COpaquePointer?, ppcloudinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo(pcnumclouds?.value?.toCPointer<ByteVar>(), ppcloudinfo?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpGetEndpoint(hresolve: COpaquePointer?, ppendpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint(hresolve?.value?.toCPointer<ByteVar>(), ppendpoint?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: COpaquePointer?, phregistration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister(pcwzpeername?.value?.toCPointer<ByteVar>(), pregistrationinfo?.value?.toCPointer<ByteVar>(), phregistration?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: COpaquePointer?, ppendpoints: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve(pcwzpeername?.value?.toCPointer<ByteVar>(), pcwzcloudname?.value?.toCPointer<ByteVar>(), pcendpoints?.value?.toCPointer<ByteVar>(), ppendpoints?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpShutdown(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown()

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve(pcwzpeername?.value?.toCPointer<ByteVar>(), pcwzcloudname?.value?.toCPointer<ByteVar>(), cmaxendpoints, hevent?.value?.toCPointer<ByteVar>(), phresolve?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(wversionrequested)

public actual fun peerPnrpUnregister(hregistration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister(hregistration?.value?.toCPointer<ByteVar>())

public actual fun peerPnrpUpdateRegistration(hregistration: COpaquePointer?, pregistrationinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p.cinterop.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration(hregistration?.value?.toCPointer<ByteVar>(), pregistrationinfo?.value?.toCPointer<ByteVar>())
