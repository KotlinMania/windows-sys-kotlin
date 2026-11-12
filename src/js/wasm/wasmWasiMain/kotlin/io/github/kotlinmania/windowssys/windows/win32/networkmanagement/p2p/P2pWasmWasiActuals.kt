@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun drtClose(hdrt: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtClose")

public actual fun drtContinueSearch(hsearchcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch")

public actual fun drtCreateDerivedKey(plocalcert: ConstPtr, pkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey")

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr, plocalcert: ConstPtr, ppsecurityprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider")

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver")

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr, phtransport: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport")

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider")

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver")

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider")

public actual fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver")

public actual fun drtDeleteIpv6UdpTransport(htransport: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport")

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider")

public actual fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver")

public actual fun drtEndSearch(hsearchcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch")

public actual fun drtGetEventData(hdrt: ConstPtr, uleventdatalen: UInt, peventdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData")

public actual fun drtGetEventDataSize(hdrt: ConstPtr, puleventdatalen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize")

public actual fun drtGetInstanceName(hdrt: ConstPtr, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName")

public actual fun drtGetInstanceNameSize(hdrt: ConstPtr, pulcbinstancenamesize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize")

public actual fun drtGetSearchPath(hsearchcontext: ConstPtr, ulsearchpathsize: UInt, psearchpath: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath")

public actual fun drtGetSearchPathSize(hsearchcontext: ConstPtr, pulsearchpathsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize")

public actual fun drtGetSearchResult(hsearchcontext: ConstPtr, ulsearchresultsize: UInt, psearchresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult")

public actual fun drtGetSearchResultSize(hsearchcontext: ConstPtr, pulsearchresultsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize")

public actual fun drtOpen(psettings: ConstPtr, hevent: Handle, pvcontext: ConstPtr, phdrt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtOpen")

public actual fun drtRegisterKey(hdrt: ConstPtr, pregistration: ConstPtr, pvkeycontext: ConstPtr, phkeyregistration: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey")

public actual fun drtStartSearch(hdrt: ConstPtr, pkey: ConstPtr, pinfo: ConstPtr, timeout: UInt, hevent: Handle, pvcontext: ConstPtr, hsearchcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch")

public actual fun drtUnregisterKey(hkeyregistration: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey")

public actual fun drtUpdateKey(hkeyregistration: ConstPtr, pappdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey")

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact")

public actual fun peerCollabAsyncInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact")

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint")

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation")

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle")

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact")

public actual fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData")

public actual fun peerCollabDeleteObject(pobjectid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject")

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo")

public actual fun peerCollabEnumApplications(pcendpoint: ConstPtr, papplicationid: ConstPtr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications")

public actual fun peerCollabEnumContacts(phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts")

public actual fun peerCollabEnumEndpoints(pccontact: ConstPtr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints")

public actual fun peerCollabEnumObjects(pcendpoint: ConstPtr, pobjectid: ConstPtr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects")

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe")

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact")

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo")

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo")

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact")

public actual fun peerCollabGetEndpointName(ppwzendpointname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName")

public actual fun peerCollabGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData")

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse")

public actual fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr, pppresenceinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo")

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions")

public actual fun peerCollabInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact")

public actual fun peerCollabInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint")

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact")

public actual fun peerCollabQueryContactData(pcendpoint: ConstPtr, ppwzcontactdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData")

public actual fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData")

public actual fun peerCollabRegisterApplication(pcapplication: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication")

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent")

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName")

public actual fun peerCollabSetObject(pcobject: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject")

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown(): Int

public actual fun peerCollabShutdown(): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown()

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions: Int): Int

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested: Int): Int

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested.toInt())

public actual fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData")

public actual fun peerCollabUnregisterApplication(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication")

public actual fun peerCollabUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent")

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData")

public actual fun peerCollabUpdateContact(pcontact: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact")

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName")

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation")

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData")

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead")

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): Int

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist, hcontenthandle).toUInt()

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation")

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent")

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle")

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent")

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead")

public actual fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult")

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus")

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx")

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification")

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx")

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, poverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): Int

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist, hcontentinfo).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): Int

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist, hstream).toUInt()

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation")

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx")

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream")

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream")

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, cbcontentlength: ULong, ppublishoptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream")

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, lpoverlapped: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation")

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist: Long): Int

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist).toUInt()

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr, pdwsupportedversion: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): Int

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist).toUInt()

public actual fun peerEndEnumeration(hpeerenum: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration")

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups")

public actual fun peerEnumIdentities(phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities")

public actual fun peerFreeData(pvdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerFreeData")

public actual fun peerGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount")

public actual fun peerGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem")

public actual fun peerGraphAddRecord(hgraph: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord")

public actual fun peerGraphClose(hgraph: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose")

public actual fun peerGraphCloseDirectConnection(hgraph: ConstPtr, ullconnectionid: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection")

public actual fun peerGraphConnect(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect")

public actual fun peerGraphCreate(pgraphproperties: ConstPtr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, phgraph: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate")

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete")

public actual fun peerGraphDeleteRecord(hgraph: ConstPtr, precordid: ConstPtr, flocal: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord")

public actual fun peerGraphEndEnumeration(hpeerenum: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration")

public actual fun peerGraphEnumConnections(hgraph: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections")

public actual fun peerGraphEnumNodes(hgraph: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes")

public actual fun peerGraphEnumRecords(hgraph: ConstPtr, precordtype: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords")

public actual fun peerGraphExportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase")

public actual fun peerGraphFreeData(pvdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData")

public actual fun peerGraphGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData")

public actual fun peerGraphGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount")

public actual fun peerGraphGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem")

public actual fun peerGraphGetNodeInfo(hgraph: ConstPtr, ullnodeid: ULong, ppnodeinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo")

public actual fun peerGraphGetProperties(hgraph: ConstPtr, ppgraphproperties: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties")

public actual fun peerGraphGetRecord(hgraph: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord")

public actual fun peerGraphGetStatus(hgraph: ConstPtr, pdwstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus")

public actual fun peerGraphImportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase")

public actual fun peerGraphListen(hgraph: ConstPtr, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen")

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr, phgraph: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen")

public actual fun peerGraphOpenDirectConnection(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection")

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime")

public actual fun peerGraphRegisterEvent(hgraph: ConstPtr, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent")

public actual fun peerGraphSearchRecords(hgraph: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords")

public actual fun peerGraphSendData(hgraph: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData")

public actual fun peerGraphSetNodeAttributes(hgraph: ConstPtr, pwzattributes: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes")

public actual fun peerGraphSetPresence(hgraph: ConstPtr, fpresent: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence")

public actual fun peerGraphSetProperties(hgraph: ConstPtr, pgraphproperties: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown(): Int

public actual fun peerGraphShutdown(): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown()

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup")

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime")

public actual fun peerGraphUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent")

public actual fun peerGraphUpdateRecord(hgraph: ConstPtr, precord: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord")

public actual fun peerGraphValidateDeferredRecords(hgraph: ConstPtr, crecordids: UInt, precordids: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords")

public actual fun peerGroupAddRecord(hgroup: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord")

public actual fun peerGroupClose(hgroup: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose")

public actual fun peerGroupCloseDirectConnection(hgroup: ConstPtr, ullconnectionid: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection")

public actual fun peerGroupConnect(hgroup: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect")

public actual fun peerGroupConnectByAddress(hgroup: ConstPtr, caddresses: UInt, paddresses: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress")

public actual fun peerGroupCreate(pproperties: ConstPtr, phgroup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate")

public actual fun peerGroupCreateInvitation(hgroup: ConstPtr, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr, croles: UInt, proles: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation")

public actual fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation")

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete")

public actual fun peerGroupDeleteRecord(hgroup: ConstPtr, precordid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord")

public actual fun peerGroupEnumConnections(hgroup: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections")

public actual fun peerGroupEnumMembers(hgroup: ConstPtr, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers")

public actual fun peerGroupEnumRecords(hgroup: ConstPtr, precordtype: ConstPtr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords")

public actual fun peerGroupExportConfig(hgroup: ConstPtr, pwzpassword: Pcwstr, ppwzxml: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig")

public actual fun peerGroupExportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase")

public actual fun peerGroupGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData")

public actual fun peerGroupGetProperties(hgroup: ConstPtr, ppproperties: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties")

public actual fun peerGroupGetRecord(hgroup: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord")

public actual fun peerGroupGetStatus(hgroup: ConstPtr, pdwstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus")

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr, ppwzgroup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig")

public actual fun peerGroupImportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase")

public actual fun peerGroupIssueCredentials(hgroup: ConstPtr, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr, dwflags: UInt, ppwzinvitation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials")

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin")

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen")

public actual fun peerGroupOpenDirectConnection(hgroup: ConstPtr, pwzidentity: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection")

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation")

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin")

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime")

public actual fun peerGroupRegisterEvent(hgroup: ConstPtr, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent")

public actual fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr, hpeereventhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication")

public actual fun peerGroupSearchRecords(hgroup: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords")

public actual fun peerGroupSendData(hgroup: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData")

public actual fun peerGroupSetProperties(hgroup: ConstPtr, pproperties: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown(): Int

public actual fun peerGroupShutdown(): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown()

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup")

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime")

public actual fun peerGroupUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent")

public actual fun peerGroupUpdateRecord(hgroup: ConstPtr, precord: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord")

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName")

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate")

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete")

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport")

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey")

public actual fun peerIdentityGetDefault(ppwzpeername: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault")

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName")

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML")

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport")

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName")

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName")

public actual fun peerPnrpEndResolve(hresolve: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve")

public actual fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr, ppcloudinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo")

public actual fun peerPnrpGetEndpoint(hresolve: ConstPtr, ppendpoint: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint")

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr, phregistration: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister")

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr, ppendpoints: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown(): Int

public actual fun peerPnrpShutdown(): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown()

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested: Int): Int

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    wasiWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested.toInt())

public actual fun peerPnrpUnregister(hregistration: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister")

public actual fun peerPnrpUpdateRegistration(hregistration: ConstPtr, pregistrationinfo: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration")
