package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun drtClose(hdrt: ConstPtr<CVoid>)

public expect fun drtContinueSearch(hsearchcontext: ConstPtr<CVoid>): Hresult

public expect fun drtCreateDerivedKey(plocalcert: ConstPtr<CertContext>, pkey: MutPtr<DrtData>): Hresult

public expect fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr<CertContext>, plocalcert: ConstPtr<CertContext>, ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult

public expect fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult

public expect fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr<UShort>, phtransport: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult

public expect fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult

public expect fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>)

public expect fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>)

public expect fun drtDeleteIpv6UdpTransport(htransport: ConstPtr<CVoid>): Hresult

public expect fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>)

public expect fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>)

public expect fun drtEndSearch(hsearchcontext: ConstPtr<CVoid>): Hresult

public expect fun drtGetEventData(hdrt: ConstPtr<CVoid>, uleventdatalen: UInt, peventdata: MutPtr<DrtEventData>): Hresult

public expect fun drtGetEventDataSize(hdrt: ConstPtr<CVoid>, puleventdatalen: MutPtr<UInt>): Hresult

public expect fun drtGetInstanceName(hdrt: ConstPtr<CVoid>, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult

public expect fun drtGetInstanceNameSize(hdrt: ConstPtr<CVoid>, pulcbinstancenamesize: MutPtr<UInt>): Hresult

public expect fun drtGetSearchPath(hsearchcontext: ConstPtr<CVoid>, ulsearchpathsize: UInt, psearchpath: MutPtr<DrtAddressList>): Hresult

public expect fun drtGetSearchPathSize(hsearchcontext: ConstPtr<CVoid>, pulsearchpathsize: MutPtr<UInt>): Hresult

public expect fun drtGetSearchResult(hsearchcontext: ConstPtr<CVoid>, ulsearchresultsize: UInt, psearchresult: MutPtr<DrtSearchResult>): Hresult

public expect fun drtGetSearchResultSize(hsearchcontext: ConstPtr<CVoid>, pulsearchresultsize: MutPtr<UInt>): Hresult

public expect fun drtOpen(psettings: ConstPtr<DrtSettings>, hevent: Handle, pvcontext: ConstPtr<CVoid>, phdrt: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun drtRegisterKey(hdrt: ConstPtr<CVoid>, pregistration: ConstPtr<DrtRegistration>, pvkeycontext: ConstPtr<CVoid>, phkeyregistration: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun drtStartSearch(hdrt: ConstPtr<CVoid>, pkey: ConstPtr<DrtData>, pinfo: ConstPtr<DrtSearchInfo>, timeout: UInt, hevent: Handle, pvcontext: ConstPtr<CVoid>, hsearchcontext: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun drtUnregisterKey(hkeyregistration: ConstPtr<CVoid>)

public expect fun drtUpdateKey(hkeyregistration: ConstPtr<CVoid>, pappdata: ConstPtr<DrtData>): Hresult

public expect fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult

public expect fun peerCollabAsyncInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult

public expect fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult

public expect fun peerCollabCancelInvitation(hinvitation: Handle): Hresult

public expect fun peerCollabCloseHandle(hinvitation: Handle): Hresult

public expect fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult

public expect fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult

public expect fun peerCollabDeleteObject(pobjectid: ConstPtr<Guid>): Hresult

public expect fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabEnumApplications(pcendpoint: ConstPtr<PeerEndpoint>, papplicationid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabEnumContacts(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabEnumEndpoints(pccontact: ConstPtr<PeerContact>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabEnumObjects(pcendpoint: ConstPtr<PeerEndpoint>, pobjectid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr<Pwstr>): Hresult

public expect fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr<MutPtr<PeerAppLaunchInfo>>): Hresult

public expect fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr<MutPtr<PeerApplicationRegistrationInfo>>): Hresult

public expect fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult

public expect fun peerCollabGetEndpointName(ppwzendpointname: MutPtr<Pwstr>): Hresult

public expect fun peerCollabGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerCollabEventData>>): Hresult

public expect fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult

public expect fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr<PeerEndpoint>, pppresenceinfo: MutPtr<MutPtr<PeerPresenceInfo>>): Hresult

public expect fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr<UInt>): Hresult

public expect fun peerCollabInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult

public expect fun peerCollabInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult

public expect fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult

public expect fun peerCollabQueryContactData(pcendpoint: ConstPtr<PeerEndpoint>, ppwzcontactdata: MutPtr<Pwstr>): Hresult

public expect fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult

public expect fun peerCollabRegisterApplication(pcapplication: ConstPtr<PeerApplicationRegistrationInfo>, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerCollabEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult

public expect fun peerCollabSetObject(pcobject: ConstPtr<PeerObject>): Hresult

public expect fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr<PeerPresenceInfo>): Hresult

public expect fun peerCollabShutdown(): Hresult

public expect fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult

public expect fun peerCollabSignout(dwsigninoptions: UInt): Hresult

public expect fun peerCollabStartup(wversionrequested: UShort): Hresult

public expect fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult

public expect fun peerCollabUnregisterApplication(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult

public expect fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult

public expect fun peerCollabUpdateContact(pcontact: ConstPtr<PeerContact>): Hresult

public expect fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult

public expect fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt

public expect fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr<CVoid>): UInt

public expect fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr<Long>): UInt

public expect fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool

public expect fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt

public expect fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt

public expect fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt

public expect fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt

public expect fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt

public expect fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt

public expect fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt

public expect fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr<PeerdistRetrievalOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt

public expect fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, cbcontentlength: ULong, ppublishoptions: ConstPtr<PeerdistPublicationOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr<Long>): UInt

public expect fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt

public expect fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>): UInt

public expect fun peerDistShutdown(hpeerdist: Long): UInt

public expect fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr<Long>, pdwsupportedversion: MutPtr<UInt>): UInt

public expect fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt

public expect fun peerEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult

public expect fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerEnumIdentities(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerFreeData(pvdata: ConstPtr<CVoid>)

public expect fun peerGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult

public expect fun peerGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult

public expect fun peerGraphAddRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult

public expect fun peerGraphClose(hgraph: ConstPtr<CVoid>): Hresult

public expect fun peerGraphCloseDirectConnection(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult

public expect fun peerGraphConnect(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult

public expect fun peerGraphCreate(pgraphproperties: ConstPtr<PeerGraphProperties>, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult

public expect fun peerGraphDeleteRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, flocal: Bool): Hresult

public expect fun peerGraphEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult

public expect fun peerGraphEnumConnections(hgraph: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphEnumNodes(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphEnumRecords(hgraph: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphExportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphFreeData(pvdata: ConstPtr<CVoid>)

public expect fun peerGraphGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGraphEventData>>): Hresult

public expect fun peerGraphGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult

public expect fun peerGraphGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult

public expect fun peerGraphGetNodeInfo(hgraph: ConstPtr<CVoid>, ullnodeid: ULong, ppnodeinfo: MutPtr<MutPtr<PeerNodeInfo>>): Hresult

public expect fun peerGraphGetProperties(hgraph: ConstPtr<CVoid>, ppgraphproperties: MutPtr<MutPtr<PeerGraphProperties>>): Hresult

public expect fun peerGraphGetRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult

public expect fun peerGraphGetStatus(hgraph: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult

public expect fun peerGraphImportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphListen(hgraph: ConstPtr<CVoid>, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult

public expect fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr<Guid>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphOpenDirectConnection(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult

public expect fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult

public expect fun peerGraphRegisterEvent(hgraph: ConstPtr<CVoid>, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr<PeerGraphEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphSearchRecords(hgraph: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGraphSendData(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult

public expect fun peerGraphSetNodeAttributes(hgraph: ConstPtr<CVoid>, pwzattributes: Pcwstr): Hresult

public expect fun peerGraphSetPresence(hgraph: ConstPtr<CVoid>, fpresent: Bool): Hresult

public expect fun peerGraphSetProperties(hgraph: ConstPtr<CVoid>, pgraphproperties: ConstPtr<PeerGraphProperties>): Hresult

public expect fun peerGraphShutdown(): Hresult

public expect fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult

public expect fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult

public expect fun peerGraphUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult

public expect fun peerGraphUpdateRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult

public expect fun peerGraphValidateDeferredRecords(hgraph: ConstPtr<CVoid>, crecordids: UInt, precordids: ConstPtr<Guid>): Hresult

public expect fun peerGroupAddRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult

public expect fun peerGroupClose(hgroup: ConstPtr<CVoid>): Hresult

public expect fun peerGroupCloseDirectConnection(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult

public expect fun peerGroupConnect(hgroup: ConstPtr<CVoid>): Hresult

public expect fun peerGroupConnectByAddress(hgroup: ConstPtr<CVoid>, caddresses: UInt, paddresses: ConstPtr<PeerAddress>): Hresult

public expect fun peerGroupCreate(pproperties: ConstPtr<PeerGroupProperties>, phgroup: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupCreateInvitation(hgroup: ConstPtr<CVoid>, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr<Filetime>, croles: UInt, proles: ConstPtr<Guid>, ppwzinvitation: MutPtr<Pwstr>): Hresult

public expect fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr<CVoid>, ppwzinvitation: MutPtr<Pwstr>): Hresult

public expect fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult

public expect fun peerGroupDeleteRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>): Hresult

public expect fun peerGroupEnumConnections(hgroup: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupEnumMembers(hgroup: ConstPtr<CVoid>, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupEnumRecords(hgroup: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupExportConfig(hgroup: ConstPtr<CVoid>, pwzpassword: Pcwstr, ppwzxml: MutPtr<Pwstr>): Hresult

public expect fun peerGroupExportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGroupEventData>>): Hresult

public expect fun peerGroupGetProperties(hgroup: ConstPtr<CVoid>, ppproperties: MutPtr<MutPtr<PeerGroupProperties>>): Hresult

public expect fun peerGroupGetRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult

public expect fun peerGroupGetStatus(hgroup: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult

public expect fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr<Pwstr>, ppwzgroup: MutPtr<Pwstr>): Hresult

public expect fun peerGroupImportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupIssueCredentials(hgroup: ConstPtr<CVoid>, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr<PeerCredentialInfo>, dwflags: UInt, ppwzinvitation: MutPtr<Pwstr>): Hresult

public expect fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupOpenDirectConnection(hgroup: ConstPtr<CVoid>, pwzidentity: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult

public expect fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr<MutPtr<PeerInvitationInfo>>): Hresult

public expect fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult

public expect fun peerGroupRegisterEvent(hgroup: ConstPtr<CVoid>, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerGroupEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr<CVoid>, hpeereventhandle: ConstPtr<CVoid>): Hresult

public expect fun peerGroupSearchRecords(hgroup: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerGroupSendData(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult

public expect fun peerGroupSetProperties(hgroup: ConstPtr<CVoid>, pproperties: ConstPtr<PeerGroupProperties>): Hresult

public expect fun peerGroupShutdown(): Hresult

public expect fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult

public expect fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult

public expect fun peerGroupUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult

public expect fun peerGroupUpdateRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult

public expect fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult

public expect fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr<ULong>): Hresult

public expect fun peerIdentityGetDefault(ppwzpeername: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr<Pwstr>): Hresult

public expect fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr<Pwstr>): Hresult

public expect fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr<Pwstr>): Hresult

public expect fun peerPnrpEndResolve(hresolve: ConstPtr<CVoid>): Hresult

public expect fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr<UInt>, ppcloudinfo: MutPtr<MutPtr<PeerPnrpCloudInfo>>): Hresult

public expect fun peerPnrpGetEndpoint(hresolve: ConstPtr<CVoid>, ppendpoint: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult

public expect fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>, phregistration: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr<UInt>, ppendpoints: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult

public expect fun peerPnrpShutdown(): Hresult

public expect fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun peerPnrpStartup(wversionrequested: UShort): Hresult

public expect fun peerPnrpUnregister(hregistration: ConstPtr<CVoid>): Hresult

public expect fun peerPnrpUpdateRegistration(hregistration: ConstPtr<CVoid>, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>): Hresult
