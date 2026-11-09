@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32NetworkmanagementP2pNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun DrtClose(hdrt: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtClose(hdrt.toString())
    }
}

public actual fun DrtContinueSearch(hsearchcontext: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch(hsearchcontext.toString()) as Int) else 0

public actual fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey(plocalcert.toString(), pkey.toString()) as Int) else 0

public actual fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider(prootcert.toString(), plocalcert.toString(), ppsecurityprovider.toString()) as Int) else 0

public actual fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver(port.toInt(), pwszaddress.toString(), ppmodule.toString()) as Int) else 0

public actual fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport.toString(), phtransport.toString()) as Int) else 0

public actual fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider(ppsecurityprovider.toString()) as Int) else 0

public actual fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.toString(), pwzcloudname.toString(), pwzpublishingidentity.toString(), ppresolver.toString()) as Int) else 0

public actual fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider(psecurityprovider.toString())
    }
}

public actual fun DrtDeleteDnsBootstrapResolver(presolver: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver(presolver.toString())
    }
}

public actual fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport(htransport.toString()) as Int) else 0

public actual fun DrtDeleteNullSecurityProvider(psecurityprovider: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider(psecurityprovider.toString())
    }
}

public actual fun DrtDeletePnrpBootstrapResolver(presolver: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver(presolver.toString())
    }
}

public actual fun DrtEndSearch(hsearchcontext: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch(hsearchcontext.toString()) as Int) else 0

public actual fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData(hdrt.toString(), uleventdatalen.toInt(), peventdata.toString()) as Int) else 0

public actual fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize(hdrt.toString(), puleventdatalen.toString()) as Int) else 0

public actual fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName(hdrt.toString(), ulcbinstancenamesize.toInt(), pwzdrtinstancename.toString()) as Int) else 0

public actual fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize(hdrt.toString(), pulcbinstancenamesize.toString()) as Int) else 0

public actual fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath(hsearchcontext.toString(), ulsearchpathsize.toInt(), psearchpath.toString()) as Int) else 0

public actual fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize(hsearchcontext.toString(), pulsearchpathsize.toString()) as Int) else 0

public actual fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult(hsearchcontext.toString(), ulsearchresultsize.toInt(), psearchresult.toString()) as Int) else 0

public actual fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize(hsearchcontext.toString(), pulsearchresultsize.toString()) as Int) else 0

public actual fun DrtOpen(psettings: Long, hevent: HANDLE, pvcontext: Long, phdrt: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtOpen(psettings.toString(), hevent.toString(), pvcontext.toString(), phdrt.toString()) as Int) else 0

public actual fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey(hdrt.toString(), pregistration.toString(), pvkeycontext.toString(), phkeyregistration.toString()) as Int) else 0

public actual fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch(hdrt.toString(), pkey.toString(), pinfo.toString(), timeout.toInt(), hevent.toString(), pvcontext.toString(), hsearchcontext.toString()) as Int) else 0

public actual fun DrtUnregisterKey(hkeyregistration: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey(hkeyregistration.toString())
    }
}

public actual fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey(hkeyregistration.toString(), pappdata.toString()) as Int) else 0

public actual fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact(pwzcontactdata.toString(), ppcontact.toString()) as Int) else 0

public actual fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact(pccontact.toString(), pcendpoint.toString(), pcinvitation.toString(), hevent.toString(), phinvitation.toString()) as Int) else 0

public actual fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint(pcendpoint.toString(), pcinvitation.toString(), hevent.toString(), phinvitation.toString()) as Int) else 0

public actual fun PeerCollabCancelInvitation(hinvitation: HANDLE): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation(hinvitation.toString()) as Int) else 0

public actual fun PeerCollabCloseHandle(hinvitation: HANDLE): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle(hinvitation.toString()) as Int) else 0

public actual fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact(pwzpeername.toString()) as Int) else 0

public actual fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData(pcendpoint.toString()) as Int) else 0

public actual fun PeerCollabDeleteObject(pobjectid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject(pobjectid.toString()) as Int) else 0

public actual fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications(pcendpoint.toString(), papplicationid.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts(phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints(pccontact.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects(pcendpoint.toString(), pobjectid.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe(phpeerenum.toString()) as Int) else 0

public actual fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact(pwzpeername.toString(), ppwzcontactdata.toString()) as Int) else 0

public actual fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo(pplaunchinfo.toString()) as Int) else 0

public actual fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo(papplicationid.toString(), registrationtype, ppapplication.toString()) as Int) else 0

public actual fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact(pwzpeername.toString(), ppcontact.toString()) as Int) else 0

public actual fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName(ppwzendpointname.toString()) as Int) else 0

public actual fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData(hpeerevent.toString(), ppeventdata.toString()) as Int) else 0

public actual fun PeerCollabGetInvitationResponse(hinvitation: HANDLE, ppinvitationresponse: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse(hinvitation.toString(), ppinvitationresponse.toString()) as Int) else 0

public actual fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo(pcendpoint.toString(), pppresenceinfo.toString()) as Int) else 0

public actual fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions(pdwsigninoptions.toString()) as Int) else 0

public actual fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact(pccontact.toString(), pcendpoint.toString(), pcinvitation.toString(), ppresponse.toString()) as Int) else 0

public actual fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint(pcendpoint.toString(), pcinvitation.toString(), ppresponse.toString()) as Int) else 0

public actual fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact(pwzcontactdata.toString(), ppcontact.toString()) as Int) else 0

public actual fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData(pcendpoint.toString(), ppwzcontactdata.toString()) as Int) else 0

public actual fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData(pcendpoint.toString()) as Int) else 0

public actual fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication(pcapplication.toString(), registrationtype) as Int) else 0

public actual fun PeerCollabRegisterEvent(hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent(hevent.toString(), ceventregistration.toInt(), peventregistrations.toString(), phpeerevent.toString()) as Int) else 0

public actual fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName(pwzendpointname.toString()) as Int) else 0

public actual fun PeerCollabSetObject(pcobject: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject(pcobject.toString()) as Int) else 0

public actual fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo(pcpresenceinfo.toString()) as Int) else 0

public actual fun PeerCollabShutdown(): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown() as Int) else 0

public actual fun PeerCollabSignin(hwndparent: HWND, dwsigninoptions: UInt): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin(hwndparent.toString(), dwsigninoptions.toInt()) as Int) else 0

public actual fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout(dwsigninoptions.toInt()) as Int) else 0

public actual fun PeerCollabStartup(wversionrequested: UShort): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup(wversionrequested.toInt()) as Int) else 0

public actual fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData(pcendpoint.toString()) as Int) else 0

public actual fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication(papplicationid.toString(), registrationtype) as Int) else 0

public actual fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent(hpeerevent.toString()) as Int) else 0

public actual fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData(pcendpoint.toString()) as Int) else 0

public actual fun PeerCollabUpdateContact(pcontact: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact(pcontact.toString()) as Int) else 0

public actual fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName(pwzidentity.toString(), pwzclassifier.toString(), ppwzpeername.toString()) as Int) else 0

public actual fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation(hpeerdist.toString(), hcontenthandle.toString(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent(hpeerdist.toString(), hcontenthandle.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation(hpeerdist.toString(), hcontenthandle.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent(hpeerdist.toString(), pcontenttag.toString(), hcompletionport.toString(), ulcompletionkey.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle(hpeerdist.toString(), hcontenthandle.toString(), peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent(hpeerdist.toString(), pcontenttag.toString(), hcompletionport.toString(), ulcompletionkey.toString(), phcontenthandle.toString()) as Int).toUInt() else 0u

public actual fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult(lpoverlapped.toString(), lpnumberofbytestransferred.toString(), bwait) as Int) else 0

public actual fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus(hpeerdist.toString(), ppeerdiststatus.toString()) as Int).toUInt() else 0u

public actual fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx(hpeerdist.toString(), ppeerdiststatus.toString()) as Int).toUInt() else 0u

public actual fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification(hpeerdist.toString(), hcompletionport.toString(), ulcompletionkey.toString(), lpoverlapped.toString(), ppeerdiststatus.toString()) as Int).toUInt() else 0u

public actual fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx(hpeerdist.toString(), hcompletionport.toString(), ulcompletionkey.toString(), lpoverlapped.toString(), ppeerdiststatus.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.toString(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation(hpeerdist.toString(), hcontentinfo.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle(hpeerdist.toString(), hstream.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), hcompletionport.toString(), ulcompletionkey.toString(), phcontentinfo.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), pretrievaloptions.toString(), hcompletionport.toString(), ulcompletionkey.toString(), phcontentinfo.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream(hpeerdist.toString(), hstream.toString(), cbnumberofbytes.toInt(), pbuffer.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream(hpeerdist.toString(), hstream.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phstream: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.toString(), cbcontentlength.toString(), ppublishoptions.toString(), hcompletionport.toString(), ulcompletionkey.toString(), phstream.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation(hpeerdist.toString(), hcontentinfo.toString(), cbmaxnumberofbytes.toInt(), pbuffer.toString(), lpoverlapped.toString()) as Int).toUInt() else 0u

public actual fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.toString()) as Int).toUInt() else 0u

public actual fun PeerDistShutdown(hpeerdist: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown(hpeerdist.toString()) as Int).toUInt() else 0u

public actual fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup(dwversionrequested.toInt(), phpeerdist.toString(), pdwsupportedversion.toString()) as Int).toUInt() else 0u

public actual fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification(hpeerdist.toString()) as Int).toUInt() else 0u

public actual fun PeerEndEnumeration(hpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration(hpeerenum.toString()) as Int) else 0

public actual fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups(pwzidentity.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerEnumIdentities(phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities(phpeerenum.toString()) as Int) else 0

public actual fun PeerFreeData(pvdata: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerFreeData(pvdata.toString())
    }
}

public actual fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount(hpeerenum.toString(), pcount.toString()) as Int) else 0

public actual fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem(hpeerenum.toString(), pcount.toString(), pppvitems.toString()) as Int) else 0

public actual fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord(hgraph.toString(), precord.toString(), precordid.toString()) as Int) else 0

public actual fun PeerGraphClose(hgraph: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose(hgraph.toString()) as Int) else 0

public actual fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection(hgraph.toString(), ullconnectionid.toString()) as Int) else 0

public actual fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect(hgraph.toString(), pwzpeerid.toString(), paddress.toString(), pullconnectionid.toString()) as Int) else 0

public actual fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate(pgraphproperties.toString(), pwzdatabasename.toString(), psecurityinterface.toString(), phgraph.toString()) as Int) else 0

public actual fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete(pwzgraphid.toString(), pwzpeerid.toString(), pwzdatabasename.toString()) as Int) else 0

public actual fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord(hgraph.toString(), precordid.toString(), flocal) as Int) else 0

public actual fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration(hpeerenum.toString()) as Int) else 0

public actual fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections(hgraph.toString(), dwflags.toInt(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes(hgraph.toString(), pwzpeerid.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords(hgraph.toString(), precordtype.toString(), pwzpeerid.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase(hgraph.toString(), pwzfilepath.toString()) as Int) else 0

public actual fun PeerGraphFreeData(pvdata: Long) {
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) {
        _windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData(pvdata.toString())
    }
}

public actual fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData(hpeerevent.toString(), ppeventdata.toString()) as Int) else 0

public actual fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount(hpeerenum.toString(), pcount.toString()) as Int) else 0

public actual fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem(hpeerenum.toString(), pcount.toString(), pppvitems.toString()) as Int) else 0

public actual fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo(hgraph.toString(), ullnodeid.toString(), ppnodeinfo.toString()) as Int) else 0

public actual fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties(hgraph.toString(), ppgraphproperties.toString()) as Int) else 0

public actual fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord(hgraph.toString(), precordid.toString(), pprecord.toString()) as Int) else 0

public actual fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus(hgraph.toString(), pdwstatus.toString()) as Int) else 0

public actual fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase(hgraph.toString(), pwzfilepath.toString()) as Int) else 0

public actual fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen(hgraph.toString(), dwscope.toInt(), dwscopeid.toInt(), wport.toInt()) as Int) else 0

public actual fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen(pwzgraphid.toString(), pwzpeerid.toString(), pwzdatabasename.toString(), psecurityinterface.toString(), crecordtypesyncprecedence.toInt(), precordtypesyncprecedence.toString(), phgraph.toString()) as Int) else 0

public actual fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection(hgraph.toString(), pwzpeerid.toString(), paddress.toString(), pullconnectionid.toString()) as Int) else 0

public actual fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime(hgraph.toString(), pftpeertime.toString(), pftuniversaltime.toString()) as Int) else 0

public actual fun PeerGraphRegisterEvent(hgraph: Long, hevent: HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent(hgraph.toString(), hevent.toString(), ceventregistrations.toInt(), peventregistrations.toString(), phpeerevent.toString()) as Int) else 0

public actual fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords(hgraph.toString(), pwzcriteria.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData(hgraph.toString(), ullconnectionid.toString(), ptype.toString(), cbdata.toInt(), pvdata.toString()) as Int) else 0

public actual fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes(hgraph.toString(), pwzattributes.toString()) as Int) else 0

public actual fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence(hgraph.toString(), fpresent) as Int) else 0

public actual fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties(hgraph.toString(), pgraphproperties.toString()) as Int) else 0

public actual fun PeerGraphShutdown(): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown() as Int) else 0

public actual fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup(wversionrequested.toInt(), pversiondata.toString()) as Int) else 0

public actual fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime(hgraph.toString(), pftuniversaltime.toString(), pftpeertime.toString()) as Int) else 0

public actual fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent(hpeerevent.toString()) as Int) else 0

public actual fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord(hgraph.toString(), precord.toString()) as Int) else 0

public actual fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords(hgraph.toString(), crecordids.toInt(), precordids.toString()) as Int) else 0

public actual fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord(hgroup.toString(), precord.toString(), precordid.toString()) as Int) else 0

public actual fun PeerGroupClose(hgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose(hgroup.toString()) as Int) else 0

public actual fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection(hgroup.toString(), ullconnectionid.toString()) as Int) else 0

public actual fun PeerGroupConnect(hgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect(hgroup.toString()) as Int) else 0

public actual fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress(hgroup.toString(), caddresses.toInt(), paddresses.toString()) as Int) else 0

public actual fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate(pproperties.toString(), phgroup.toString()) as Int) else 0

public actual fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation(hgroup.toString(), pwzidentityinfo.toString(), pftexpiration.toString(), croles.toInt(), proles.toString(), ppwzinvitation.toString()) as Int) else 0

public actual fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation(hgroup.toString(), ppwzinvitation.toString()) as Int) else 0

public actual fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete(pwzidentity.toString(), pwzgrouppeername.toString()) as Int) else 0

public actual fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord(hgroup.toString(), precordid.toString()) as Int) else 0

public actual fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections(hgroup.toString(), dwflags.toInt(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers(hgroup.toString(), dwflags.toInt(), pwzidentity.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords(hgroup.toString(), precordtype.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig(hgroup.toString(), pwzpassword.toString(), ppwzxml.toString()) as Int) else 0

public actual fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase(hgroup.toString(), pwzfilepath.toString()) as Int) else 0

public actual fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData(hpeerevent.toString(), ppeventdata.toString()) as Int) else 0

public actual fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties(hgroup.toString(), ppproperties.toString()) as Int) else 0

public actual fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord(hgroup.toString(), precordid.toString(), pprecord.toString()) as Int) else 0

public actual fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus(hgroup.toString(), pdwstatus.toString()) as Int) else 0

public actual fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig(pwzxml.toString(), pwzpassword.toString(), foverwrite, ppwzidentity.toString(), ppwzgroup.toString()) as Int) else 0

public actual fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase(hgroup.toString(), pwzfilepath.toString()) as Int) else 0

public actual fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials(hgroup.toString(), pwzsubjectidentity.toString(), pcredentialinfo.toString(), dwflags.toInt(), ppwzinvitation.toString()) as Int) else 0

public actual fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin(pwzidentity.toString(), pwzinvitation.toString(), pwzcloud.toString(), phgroup.toString()) as Int) else 0

public actual fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen(pwzidentity.toString(), pwzgrouppeername.toString(), pwzcloud.toString(), phgroup.toString()) as Int) else 0

public actual fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection(hgroup.toString(), pwzidentity.toString(), paddress.toString(), pullconnectionid.toString()) as Int) else 0

public actual fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation(pwzinvitation.toString(), ppinvitationinfo.toString()) as Int) else 0

public actual fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin(pwzidentity.toString(), pwzinvitation.toString(), pwzpassword.toString(), pwzcloud.toString(), phgroup.toString()) as Int) else 0

public actual fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime(hgroup.toString(), pftpeertime.toString(), pftuniversaltime.toString()) as Int) else 0

public actual fun PeerGroupRegisterEvent(hgroup: Long, hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent(hgroup.toString(), hevent.toString(), ceventregistration.toInt(), peventregistrations.toString(), phpeerevent.toString()) as Int) else 0

public actual fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication(hgroup.toString(), hpeereventhandle.toString()) as Int) else 0

public actual fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords(hgroup.toString(), pwzcriteria.toString(), phpeerenum.toString()) as Int) else 0

public actual fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData(hgroup.toString(), ullconnectionid.toString(), ptype.toString(), cbdata.toInt(), pvdata.toString()) as Int) else 0

public actual fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties(hgroup.toString(), pproperties.toString()) as Int) else 0

public actual fun PeerGroupShutdown(): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown() as Int) else 0

public actual fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup(wversionrequested.toInt(), pversiondata.toString()) as Int) else 0

public actual fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime(hgroup.toString(), pftuniversaltime.toString(), pftpeertime.toString()) as Int) else 0

public actual fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent(hpeerevent.toString()) as Int) else 0

public actual fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord(hgroup.toString(), precord.toString()) as Int) else 0

public actual fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName(pwzhostname.toString(), ppwzpeername.toString()) as Int) else 0

public actual fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate(pwzclassifier.toString(), pwzfriendlyname.toString(), hcryptprov.toString(), ppwzidentity.toString()) as Int) else 0

public actual fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete(pwzidentity.toString()) as Int) else 0

public actual fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport(pwzidentity.toString(), pwzpassword.toString(), ppwzexportxml.toString()) as Int) else 0

public actual fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey(pwzidentity.toString(), phcryptprov.toString()) as Int) else 0

public actual fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault(ppwzpeername.toString()) as Int) else 0

public actual fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName(pwzidentity.toString(), ppwzfriendlyname.toString()) as Int) else 0

public actual fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML(pwzidentity.toString(), ppwzidentityxml.toString()) as Int) else 0

public actual fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport(pwzimportxml.toString(), pwzpassword.toString(), ppwzidentity.toString()) as Int) else 0

public actual fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName(pwzidentity.toString(), pwzfriendlyname.toString()) as Int) else 0

public actual fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName(pwzpeername.toString(), ppwzhostname.toString()) as Int) else 0

public actual fun PeerPnrpEndResolve(hresolve: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve(hresolve.toString()) as Int) else 0

public actual fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo(pcnumclouds.toString(), ppcloudinfo.toString()) as Int) else 0

public actual fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint(hresolve.toString(), ppendpoint.toString()) as Int) else 0

public actual fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister(pcwzpeername.toString(), pregistrationinfo.toString(), phregistration.toString()) as Int) else 0

public actual fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve(pcwzpeername.toString(), pcwzcloudname.toString(), pcendpoints.toString(), ppendpoints.toString()) as Int) else 0

public actual fun PeerPnrpShutdown(): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown() as Int) else 0

public actual fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: HANDLE, phresolve: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve(pcwzpeername.toString(), pcwzcloudname.toString(), cmaxendpoints.toInt(), hevent.toString(), phresolve.toString()) as Int) else 0

public actual fun PeerPnrpStartup(wversionrequested: UShort): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup(wversionrequested.toInt()) as Int) else 0

public actual fun PeerPnrpUnregister(hregistration: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister(hregistration.toString()) as Int) else 0

public actual fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementP2pNapiAddon != null) (_windowsWin32NetworkmanagementP2pNapiAddon.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration(hregistration.toString(), pregistrationinfo.toString()) as Int) else 0
