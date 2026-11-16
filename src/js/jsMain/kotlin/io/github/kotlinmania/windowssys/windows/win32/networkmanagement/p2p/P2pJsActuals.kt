@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32NetworkmanagementP2pNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun drtClose(hdrt: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtClose(hdrt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtContinueSearch(hsearchcontext: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(hsearchcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKey(plocalcert: ConstPtr, pkey: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(plocalcert.rawAddress.toString(), pkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr, plocalcert: ConstPtr, ppsecurityprovider: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(prootcert.rawAddress.toString(), plocalcert.rawAddress.toString(), ppsecurityprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(port.toInt(), pwszaddress.rawAddress.toString(), ppmodule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr, phtransport: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport.rawAddress.toString(), phtransport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(ppsecurityprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.rawAddress.toString(), pwzcloudname.rawAddress.toString(), pwzpublishingidentity.rawAddress.toString(), ppresolver.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(psecurityprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(presolver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteIpv6UdpTransport(htransport: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(htransport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(psecurityprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(presolver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtEndSearch(hsearchcontext: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(hsearchcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventData(hdrt: ConstPtr, uleventdatalen: UInt, peventdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(hdrt.rawAddress.toString(), uleventdatalen.toInt(), peventdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventDataSize(hdrt: ConstPtr, puleventdatalen: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(hdrt.rawAddress.toString(), puleventdatalen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceName(hdrt: ConstPtr, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(hdrt.rawAddress.toString(), ulcbinstancenamesize.toInt(), pwzdrtinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceNameSize(hdrt: ConstPtr, pulcbinstancenamesize: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(hdrt.rawAddress.toString(), pulcbinstancenamesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPath(hsearchcontext: ConstPtr, ulsearchpathsize: UInt, psearchpath: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(hsearchcontext.rawAddress.toString(), ulsearchpathsize.toInt(), psearchpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPathSize(hsearchcontext: ConstPtr, pulsearchpathsize: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(hsearchcontext.rawAddress.toString(), pulsearchpathsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResult(hsearchcontext: ConstPtr, ulsearchresultsize: UInt, psearchresult: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(hsearchcontext.rawAddress.toString(), ulsearchresultsize.toInt(), psearchresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResultSize(hsearchcontext: ConstPtr, pulsearchresultsize: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(hsearchcontext.rawAddress.toString(), pulsearchresultsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtOpen(psettings: ConstPtr, hevent: Handle, pvcontext: ConstPtr, phdrt: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtOpen(psettings.rawAddress.toString(), hevent.rawAddress.toString(), pvcontext.rawAddress.toString(), phdrt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtRegisterKey(hdrt: ConstPtr, pregistration: ConstPtr, pvkeycontext: ConstPtr, phkeyregistration: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(hdrt.rawAddress.toString(), pregistration.rawAddress.toString(), pvkeycontext.rawAddress.toString(), phkeyregistration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtStartSearch(hdrt: ConstPtr, pkey: ConstPtr, pinfo: ConstPtr, timeout: UInt, hevent: Handle, pvcontext: ConstPtr, hsearchcontext: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(hdrt.rawAddress.toString(), pkey.rawAddress.toString(), pinfo.rawAddress.toString(), timeout.toInt(), hevent.rawAddress.toString(), pvcontext.rawAddress.toString(), hsearchcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtUnregisterKey(hkeyregistration: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(hkeyregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtUpdateKey(hkeyregistration: ConstPtr, pappdata: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(hkeyregistration.rawAddress.toString(), pappdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(pwzcontactdata.rawAddress.toString(), ppcontact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(pccontact.rawAddress.toString(), pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), hevent.rawAddress.toString(), phinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), hevent.rawAddress.toString(), phinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(hinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(hinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(pwzpeername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(pcendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteObject(pobjectid: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(pobjectid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplications(pcendpoint: ConstPtr, papplicationid: ConstPtr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(pcendpoint.rawAddress.toString(), papplicationid.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumContacts(phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumEndpoints(pccontact: ConstPtr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(pccontact.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumObjects(pcendpoint: ConstPtr, pobjectid: ConstPtr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(pcendpoint.rawAddress.toString(), pobjectid.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(pwzpeername.rawAddress.toString(), ppwzcontactdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(pplaunchinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(papplicationid.rawAddress.toString(), registrationtype, ppapplication.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(pwzpeername.rawAddress.toString(), ppcontact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEndpointName(ppwzendpointname: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(ppwzendpointname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(hinvitation.rawAddress.toString(), ppinvitationresponse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr, pppresenceinfo: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(pcendpoint.rawAddress.toString(), pppresenceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(pdwsigninoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(pccontact.rawAddress.toString(), pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), ppresponse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), ppresponse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(pwzcontactdata.rawAddress.toString(), ppcontact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabQueryContactData(pcendpoint: ConstPtr, ppwzcontactdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(pcendpoint.rawAddress.toString(), ppwzcontactdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(pcendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterApplication(pcapplication: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(pcapplication.rawAddress.toString(), registrationtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(hevent.rawAddress.toString(), ceventregistration.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(pwzendpointname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetObject(pcobject: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(pcobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(pcpresenceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(hwndparent.rawAddress.toString(), dwsigninoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(pcendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterApplication(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(papplicationid.rawAddress.toString(), registrationtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(hpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(pcendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUpdateContact(pcontact: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(pcontact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(pwzidentity.rawAddress.toString(), pwzclassifier.rawAddress.toString(), ppwzpeername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(hpeerdist.toString(), hcontenthandle.toString(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist.toString(), hcontenthandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(hpeerdist.toString(), hcontenthandle.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(hpeerdist.toString(), pcontenttag.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(hpeerdist.toString(), hcontenthandle.toString(), peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(hpeerdist.toString(), pcontenttag.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontenthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(hpeerdist.toString(), ppeerdiststatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(hpeerdist.toString(), ppeerdiststatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(hpeerdist.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString(), ppeerdiststatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(hpeerdist.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString(), ppeerdiststatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist.toString(), hcontentinfo.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist.toString(), hstream.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontentinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), pretrievaloptions.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontentinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(hpeerdist.toString(), hstream.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(hpeerdist.toString(), hstream.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, cbcontentlength: ULong, ppublishoptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), cbcontentlength.toString(), ppublishoptions.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phstream.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, lpoverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(hpeerdist.toString(), hcontentinfo.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr, pdwsupportedversion: MutPtr): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(dwversionrequested.toInt(), phpeerdist.rawAddress.toString(), pdwsupportedversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEndEnumeration(hpeerenum: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(hpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(pwzidentity.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumIdentities(phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerFreeData(pvdata: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(pvdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString(), pppvitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphAddRecord(hgraph: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(hgraph.rawAddress.toString(), precord.rawAddress.toString(), precordid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphClose(hgraph: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(hgraph.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCloseDirectConnection(hgraph: ConstPtr, ullconnectionid: ULong): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(hgraph.rawAddress.toString(), ullconnectionid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphConnect(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCreate(pgraphproperties: ConstPtr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, phgraph: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(pgraphproperties.rawAddress.toString(), pwzdatabasename.rawAddress.toString(), psecurityinterface.rawAddress.toString(), phgraph.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(pwzgraphid.rawAddress.toString(), pwzpeerid.rawAddress.toString(), pwzdatabasename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDeleteRecord(hgraph: ConstPtr, precordid: ConstPtr, flocal: Bool): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(hgraph.rawAddress.toString(), precordid.rawAddress.toString(), flocal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEndEnumeration(hpeerenum: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(hpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumConnections(hgraph: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(hgraph.rawAddress.toString(), dwflags.toInt(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumNodes(hgraph: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumRecords(hgraph: ConstPtr, precordtype: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(hgraph.rawAddress.toString(), precordtype.rawAddress.toString(), pwzpeerid.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphExportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(hgraph.rawAddress.toString(), pwzfilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphFreeData(pvdata: ConstPtr) {
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) {
        windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(pvdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGraphGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString(), pppvitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNodeInfo(hgraph: ConstPtr, ullnodeid: ULong, ppnodeinfo: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(hgraph.rawAddress.toString(), ullnodeid.toString(), ppnodeinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetProperties(hgraph: ConstPtr, ppgraphproperties: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(hgraph.rawAddress.toString(), ppgraphproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetRecord(hgraph: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(hgraph.rawAddress.toString(), precordid.rawAddress.toString(), pprecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetStatus(hgraph: ConstPtr, pdwstatus: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(hgraph.rawAddress.toString(), pdwstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphImportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(hgraph.rawAddress.toString(), pwzfilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphListen(hgraph: ConstPtr, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(hgraph.rawAddress.toString(), dwscope.toInt(), dwscopeid.toInt(), wport.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr, phgraph: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(pwzgraphid.rawAddress.toString(), pwzpeerid.rawAddress.toString(), pwzdatabasename.rawAddress.toString(), psecurityinterface.rawAddress.toString(), crecordtypesyncprecedence.toInt(), precordtypesyncprecedence.rawAddress.toString(), phgraph.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpenDirectConnection(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(hgraph.rawAddress.toString(), pftpeertime.rawAddress.toString(), pftuniversaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphRegisterEvent(hgraph: ConstPtr, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(hgraph.rawAddress.toString(), hevent.rawAddress.toString(), ceventregistrations.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSearchRecords(hgraph: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(hgraph.rawAddress.toString(), pwzcriteria.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSendData(hgraph: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(hgraph.rawAddress.toString(), ullconnectionid.toString(), ptype.rawAddress.toString(), cbdata.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetNodeAttributes(hgraph: ConstPtr, pwzattributes: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(hgraph.rawAddress.toString(), pwzattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetPresence(hgraph: ConstPtr, fpresent: Bool): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(hgraph.rawAddress.toString(), fpresent) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetProperties(hgraph: ConstPtr, pgraphproperties: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(hgraph.rawAddress.toString(), pgraphproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(wversionrequested.toInt(), pversiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(hgraph.rawAddress.toString(), pftuniversaltime.rawAddress.toString(), pftpeertime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(hpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUpdateRecord(hgraph: ConstPtr, precord: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(hgraph.rawAddress.toString(), precord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphValidateDeferredRecords(hgraph: ConstPtr, crecordids: UInt, precordids: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(hgraph.rawAddress.toString(), crecordids.toInt(), precordids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupAddRecord(hgroup: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(hgroup.rawAddress.toString(), precord.rawAddress.toString(), precordid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupClose(hgroup: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(hgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCloseDirectConnection(hgroup: ConstPtr, ullconnectionid: ULong): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(hgroup.rawAddress.toString(), ullconnectionid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnect(hgroup: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(hgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnectByAddress(hgroup: ConstPtr, caddresses: UInt, paddresses: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(hgroup.rawAddress.toString(), caddresses.toInt(), paddresses.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreate(pproperties: ConstPtr, phgroup: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(pproperties.rawAddress.toString(), phgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreateInvitation(hgroup: ConstPtr, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr, croles: UInt, proles: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(hgroup.rawAddress.toString(), pwzidentityinfo.rawAddress.toString(), pftexpiration.rawAddress.toString(), croles.toInt(), proles.rawAddress.toString(), ppwzinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(hgroup.rawAddress.toString(), ppwzinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(pwzidentity.rawAddress.toString(), pwzgrouppeername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDeleteRecord(hgroup: ConstPtr, precordid: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(hgroup.rawAddress.toString(), precordid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumConnections(hgroup: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(hgroup.rawAddress.toString(), dwflags.toInt(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumMembers(hgroup: ConstPtr, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(hgroup.rawAddress.toString(), dwflags.toInt(), pwzidentity.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumRecords(hgroup: ConstPtr, precordtype: ConstPtr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(hgroup.rawAddress.toString(), precordtype.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportConfig(hgroup: ConstPtr, pwzpassword: Pcwstr, ppwzxml: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(hgroup.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(hgroup.rawAddress.toString(), pwzfilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetProperties(hgroup: ConstPtr, ppproperties: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(hgroup.rawAddress.toString(), ppproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetRecord(hgroup: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(hgroup.rawAddress.toString(), precordid.rawAddress.toString(), pprecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetStatus(hgroup: ConstPtr, pdwstatus: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(hgroup.rawAddress.toString(), pdwstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr, ppwzgroup: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(pwzxml.rawAddress.toString(), pwzpassword.rawAddress.toString(), foverwrite, ppwzidentity.rawAddress.toString(), ppwzgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(hgroup.rawAddress.toString(), pwzfilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupIssueCredentials(hgroup: ConstPtr, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr, dwflags: UInt, ppwzinvitation: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(hgroup.rawAddress.toString(), pwzsubjectidentity.rawAddress.toString(), pcredentialinfo.rawAddress.toString(), dwflags.toInt(), ppwzinvitation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(pwzidentity.rawAddress.toString(), pwzinvitation.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(pwzidentity.rawAddress.toString(), pwzgrouppeername.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpenDirectConnection(hgroup: ConstPtr, pwzidentity: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(hgroup.rawAddress.toString(), pwzidentity.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(pwzinvitation.rawAddress.toString(), ppinvitationinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(pwzidentity.rawAddress.toString(), pwzinvitation.rawAddress.toString(), pwzpassword.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(hgroup.rawAddress.toString(), pftpeertime.rawAddress.toString(), pftuniversaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupRegisterEvent(hgroup: ConstPtr, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(hgroup.rawAddress.toString(), hevent.rawAddress.toString(), ceventregistration.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr, hpeereventhandle: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(hgroup.rawAddress.toString(), hpeereventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSearchRecords(hgroup: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(hgroup.rawAddress.toString(), pwzcriteria.rawAddress.toString(), phpeerenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSendData(hgroup: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(hgroup.rawAddress.toString(), ullconnectionid.toString(), ptype.rawAddress.toString(), cbdata.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSetProperties(hgroup: ConstPtr, pproperties: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(hgroup.rawAddress.toString(), pproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(wversionrequested.toInt(), pversiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(hgroup.rawAddress.toString(), pftuniversaltime.rawAddress.toString(), pftpeertime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(hpeerevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUpdateRecord(hgroup: ConstPtr, precord: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(hgroup.rawAddress.toString(), precord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(pwzhostname.rawAddress.toString(), ppwzpeername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(pwzclassifier.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), hcryptprov.toString(), ppwzidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(pwzidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(pwzidentity.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzexportxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(pwzidentity.rawAddress.toString(), phcryptprov.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetDefault(ppwzpeername: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(ppwzpeername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(pwzidentity.rawAddress.toString(), ppwzfriendlyname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(pwzidentity.rawAddress.toString(), ppwzidentityxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(pwzimportxml.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(pwzidentity.rawAddress.toString(), pwzfriendlyname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(pwzpeername.rawAddress.toString(), ppwzhostname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpEndResolve(hresolve: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(hresolve.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr, ppcloudinfo: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(pcnumclouds.rawAddress.toString(), ppcloudinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetEndpoint(hresolve: ConstPtr, ppendpoint: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(hresolve.rawAddress.toString(), ppendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr, phregistration: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(pcwzpeername.rawAddress.toString(), pregistrationinfo.rawAddress.toString(), phregistration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr, ppendpoints: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(pcwzpeername.rawAddress.toString(), pcwzcloudname.rawAddress.toString(), pcendpoints.rawAddress.toString(), ppendpoints.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(pcwzpeername.rawAddress.toString(), pcwzcloudname.rawAddress.toString(), cmaxendpoints.toInt(), hevent.rawAddress.toString(), phresolve.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUnregister(hregistration: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(hregistration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUpdateRegistration(hregistration: ConstPtr, pregistrationinfo: ConstPtr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAddon != null) (windowsWin32NetworkmanagementP2pNapiAddon.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(hregistration.rawAddress.toString(), pregistrationinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
