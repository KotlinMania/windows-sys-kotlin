@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun drtClose(hdrt: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtContinueSearch(hsearchcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreateDerivedKey(plocalcert: COpaquePointer?, pkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: COpaquePointer?, plocalcert: COpaquePointer?, ppsecurityprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: COpaquePointer?, phtransport: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtDeleteDnsBootstrapResolver(presolver: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtDeleteIpv6UdpTransport(htransport: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtDeletePnrpBootstrapResolver(presolver: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtEndSearch(hsearchcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetEventData(hdrt: COpaquePointer?, uleventdatalen: UInt, peventdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetEventDataSize(hdrt: COpaquePointer?, puleventdatalen: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetInstanceName(hdrt: COpaquePointer?, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetInstanceNameSize(hdrt: COpaquePointer?, pulcbinstancenamesize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetSearchPath(hsearchcontext: COpaquePointer?, ulsearchpathsize: UInt, psearchpath: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetSearchPathSize(hsearchcontext: COpaquePointer?, pulsearchpathsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetSearchResult(hsearchcontext: COpaquePointer?, ulsearchresultsize: UInt, psearchresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtGetSearchResultSize(hsearchcontext: COpaquePointer?, pulsearchresultsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtOpen(psettings: COpaquePointer?, hevent: Handle, pvcontext: COpaquePointer?, phdrt: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtRegisterKey(hdrt: COpaquePointer?, pregistration: COpaquePointer?, pvkeycontext: COpaquePointer?, phkeyregistration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtStartSearch(hdrt: COpaquePointer?, pkey: COpaquePointer?, pinfo: COpaquePointer?, timeout: UInt, hevent: Handle, pvcontext: COpaquePointer?, hsearchcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtUnregisterKey(hkeyregistration: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drtUpdateKey(hkeyregistration: COpaquePointer?, pappdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabAsyncInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabDeleteEndpointData(pcendpoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabDeleteObject(pobjectid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumApplications(pcendpoint: COpaquePointer?, papplicationid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumContacts(phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumEndpoints(pccontact: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumObjects(pcendpoint: COpaquePointer?, pobjectid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType, ppapplication: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetEndpointName(ppwzendpointname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetPresenceInfo(pcendpoint: COpaquePointer?, pppresenceinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabQueryContactData(pcendpoint: COpaquePointer?, ppwzcontactdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabRefreshEndpointData(pcendpoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabRegisterApplication(pcapplication: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSetObject(pcobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabShutdown(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabSubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabUnregisterApplication(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCollabUpdateContact(pcontact: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistGetOverlappedResult(lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, cbcontentlength: ULong, ppublishoptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phstream: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: COpaquePointer?, pdwsupportedversion: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerEnumIdentities(phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerFreeData(pvdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphAddRecord(hgraph: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphClose(hgraph: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphCloseDirectConnection(hgraph: COpaquePointer?, ullconnectionid: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphConnect(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphCreate(pgraphproperties: COpaquePointer?, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphDeleteRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, flocal: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphEnumConnections(hgraph: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphEnumNodes(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphEnumRecords(hgraph: COpaquePointer?, precordtype: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphExportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphFreeData(pvdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetNodeInfo(hgraph: COpaquePointer?, ullnodeid: ULong, ppnodeinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetProperties(hgraph: COpaquePointer?, ppgraphproperties: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphGetStatus(hgraph: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphImportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphListen(hgraph: COpaquePointer?, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphOpenDirectConnection(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphRegisterEvent(hgraph: COpaquePointer?, hevent: Handle, ceventregistrations: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphSearchRecords(hgraph: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphSendData(hgraph: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphSetNodeAttributes(hgraph: COpaquePointer?, pwzattributes: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphSetPresence(hgraph: COpaquePointer?, fpresent: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphSetProperties(hgraph: COpaquePointer?, pgraphproperties: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphShutdown(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphUpdateRecord(hgraph: COpaquePointer?, precord: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGraphValidateDeferredRecords(hgraph: COpaquePointer?, crecordids: UInt, precordids: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupAddRecord(hgroup: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupClose(hgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupCloseDirectConnection(hgroup: COpaquePointer?, ullconnectionid: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupConnect(hgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupConnectByAddress(hgroup: COpaquePointer?, caddresses: UInt, paddresses: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupCreate(pproperties: COpaquePointer?, phgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupCreateInvitation(hgroup: COpaquePointer?, pwzidentityinfo: Pcwstr, pftexpiration: COpaquePointer?, croles: UInt, proles: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupCreatePasswordInvitation(hgroup: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupDeleteRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupEnumConnections(hgroup: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupEnumMembers(hgroup: COpaquePointer?, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupEnumRecords(hgroup: COpaquePointer?, precordtype: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupExportConfig(hgroup: COpaquePointer?, pwzpassword: Pcwstr, ppwzxml: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupExportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupGetProperties(hgroup: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupGetRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupGetStatus(hgroup: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: COpaquePointer?, ppwzgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupImportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupIssueCredentials(hgroup: COpaquePointer?, pwzsubjectidentity: Pcwstr, pcredentialinfo: COpaquePointer?, dwflags: UInt, ppwzinvitation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupOpenDirectConnection(hgroup: COpaquePointer?, pwzidentity: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupRegisterEvent(hgroup: COpaquePointer?, hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupResumePasswordAuthentication(hgroup: COpaquePointer?, hpeereventhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupSearchRecords(hgroup: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupSendData(hgroup: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupSetProperties(hgroup: COpaquePointer?, pproperties: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupShutdown(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerGroupUpdateRecord(hgroup: COpaquePointer?, precord: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityGetDefault(ppwzpeername: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpEndResolve(hresolve: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpGetCloudInfo(pcnumclouds: COpaquePointer?, ppcloudinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpGetEndpoint(hresolve: COpaquePointer?, ppendpoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: COpaquePointer?, phregistration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: COpaquePointer?, ppendpoints: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpShutdown(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpUnregister(hregistration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peerPnrpUpdateRegistration(hregistration: COpaquePointer?, pregistrationinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
