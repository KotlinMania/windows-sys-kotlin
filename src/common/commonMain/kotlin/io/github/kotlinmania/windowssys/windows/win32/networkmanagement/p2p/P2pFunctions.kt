package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun drtClose(hdrt: ConstPtr)

public expect fun drtContinueSearch(hsearchcontext: ConstPtr): Hresult

public expect fun drtCreateDerivedKey(plocalcert: ConstPtr, pkey: MutPtr): Hresult

public expect fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr, plocalcert: ConstPtr, ppsecurityprovider: MutPtr): Hresult

public expect fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr): Hresult

public expect fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr, phtransport: MutPtr): Hresult

public expect fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr): Hresult

public expect fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr): Hresult

public expect fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr)

public expect fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr)

public expect fun drtDeleteIpv6UdpTransport(htransport: ConstPtr): Hresult

public expect fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr)

public expect fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr)

public expect fun drtEndSearch(hsearchcontext: ConstPtr): Hresult

public expect fun drtGetEventData(hdrt: ConstPtr, uleventdatalen: UInt, peventdata: MutPtr): Hresult

public expect fun drtGetEventDataSize(hdrt: ConstPtr, puleventdatalen: MutPtr): Hresult

public expect fun drtGetInstanceName(hdrt: ConstPtr, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult

public expect fun drtGetInstanceNameSize(hdrt: ConstPtr, pulcbinstancenamesize: MutPtr): Hresult

public expect fun drtGetSearchPath(hsearchcontext: ConstPtr, ulsearchpathsize: UInt, psearchpath: MutPtr): Hresult

public expect fun drtGetSearchPathSize(hsearchcontext: ConstPtr, pulsearchpathsize: MutPtr): Hresult

public expect fun drtGetSearchResult(hsearchcontext: ConstPtr, ulsearchresultsize: UInt, psearchresult: MutPtr): Hresult

public expect fun drtGetSearchResultSize(hsearchcontext: ConstPtr, pulsearchresultsize: MutPtr): Hresult

public expect fun drtOpen(psettings: ConstPtr, hevent: Handle, pvcontext: ConstPtr, phdrt: MutPtr): Hresult

public expect fun drtRegisterKey(hdrt: ConstPtr, pregistration: ConstPtr, pvkeycontext: ConstPtr, phkeyregistration: MutPtr): Hresult

public expect fun drtStartSearch(hdrt: ConstPtr, pkey: ConstPtr, pinfo: ConstPtr, timeout: UInt, hevent: Handle, pvcontext: ConstPtr, hsearchcontext: MutPtr): Hresult

public expect fun drtUnregisterKey(hkeyregistration: ConstPtr)

public expect fun drtUpdateKey(hkeyregistration: ConstPtr, pappdata: ConstPtr): Hresult

public expect fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult

public expect fun peerCollabAsyncInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult

public expect fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult

public expect fun peerCollabCancelInvitation(hinvitation: Handle): Hresult

public expect fun peerCollabCloseHandle(hinvitation: Handle): Hresult

public expect fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult

public expect fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr): Hresult

public expect fun peerCollabDeleteObject(pobjectid: ConstPtr): Hresult

public expect fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr): Hresult

public expect fun peerCollabEnumApplications(pcendpoint: ConstPtr, papplicationid: ConstPtr, phpeerenum: MutPtr): Hresult

public expect fun peerCollabEnumContacts(phpeerenum: MutPtr): Hresult

public expect fun peerCollabEnumEndpoints(pccontact: ConstPtr, phpeerenum: MutPtr): Hresult

public expect fun peerCollabEnumObjects(pcendpoint: ConstPtr, pobjectid: ConstPtr, phpeerenum: MutPtr): Hresult

public expect fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr): Hresult

public expect fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr): Hresult

public expect fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr): Hresult

public expect fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr): Hresult

public expect fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr): Hresult

public expect fun peerCollabGetEndpointName(ppwzendpointname: MutPtr): Hresult

public expect fun peerCollabGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult

public expect fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr): Hresult

public expect fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr, pppresenceinfo: MutPtr): Hresult

public expect fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr): Hresult

public expect fun peerCollabInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult

public expect fun peerCollabInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult

public expect fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult

public expect fun peerCollabQueryContactData(pcendpoint: ConstPtr, ppwzcontactdata: MutPtr): Hresult

public expect fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr): Hresult

public expect fun peerCollabRegisterApplication(pcapplication: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult

public expect fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult

public expect fun peerCollabSetObject(pcobject: ConstPtr): Hresult

public expect fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr): Hresult

public expect fun peerCollabShutdown(): Hresult

public expect fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult

public expect fun peerCollabSignout(dwsigninoptions: UInt): Hresult

public expect fun peerCollabStartup(wversionrequested: UShort): Hresult

public expect fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr): Hresult

public expect fun peerCollabUnregisterApplication(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabUnregisterEvent(hpeerevent: ConstPtr): Hresult

public expect fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr): Hresult

public expect fun peerCollabUpdateContact(pcontact: ConstPtr): Hresult

public expect fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr): Hresult

public expect fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt

public expect fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt

public expect fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt

public expect fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr): UInt

public expect fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt

public expect fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr): UInt

public expect fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr): UInt

public expect fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr): UInt

public expect fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr): UInt

public expect fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt

public expect fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool

public expect fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt

public expect fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt

public expect fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt

public expect fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt

public expect fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, poverlapped: ConstPtr): UInt

public expect fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt

public expect fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt

public expect fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt

public expect fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt

public expect fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt

public expect fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr): UInt

public expect fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, cbcontentlength: ULong, ppublishoptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr): UInt

public expect fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, lpoverlapped: ConstPtr): UInt

public expect fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr): UInt

public expect fun peerDistShutdown(hpeerdist: Long): UInt

public expect fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr, pdwsupportedversion: MutPtr): UInt

public expect fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt

public expect fun peerEndEnumeration(hpeerenum: ConstPtr): Hresult

public expect fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerEnumIdentities(phpeerenum: MutPtr): Hresult

public expect fun peerFreeData(pvdata: ConstPtr)

public expect fun peerGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult

public expect fun peerGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult

public expect fun peerGraphAddRecord(hgraph: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult

public expect fun peerGraphClose(hgraph: ConstPtr): Hresult

public expect fun peerGraphCloseDirectConnection(hgraph: ConstPtr, ullconnectionid: ULong): Hresult

public expect fun peerGraphConnect(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult

public expect fun peerGraphCreate(pgraphproperties: ConstPtr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, phgraph: MutPtr): Hresult

public expect fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult

public expect fun peerGraphDeleteRecord(hgraph: ConstPtr, precordid: ConstPtr, flocal: Bool): Hresult

public expect fun peerGraphEndEnumeration(hpeerenum: ConstPtr): Hresult

public expect fun peerGraphEnumConnections(hgraph: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult

public expect fun peerGraphEnumNodes(hgraph: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerGraphEnumRecords(hgraph: ConstPtr, precordtype: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerGraphExportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphFreeData(pvdata: ConstPtr)

public expect fun peerGraphGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult

public expect fun peerGraphGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult

public expect fun peerGraphGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult

public expect fun peerGraphGetNodeInfo(hgraph: ConstPtr, ullnodeid: ULong, ppnodeinfo: MutPtr): Hresult

public expect fun peerGraphGetProperties(hgraph: ConstPtr, ppgraphproperties: MutPtr): Hresult

public expect fun peerGraphGetRecord(hgraph: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult

public expect fun peerGraphGetStatus(hgraph: ConstPtr, pdwstatus: MutPtr): Hresult

public expect fun peerGraphImportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphListen(hgraph: ConstPtr, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult

public expect fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr, phgraph: MutPtr): Hresult

public expect fun peerGraphOpenDirectConnection(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult

public expect fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult

public expect fun peerGraphRegisterEvent(hgraph: ConstPtr, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult

public expect fun peerGraphSearchRecords(hgraph: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerGraphSendData(hgraph: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult

public expect fun peerGraphSetNodeAttributes(hgraph: ConstPtr, pwzattributes: Pcwstr): Hresult

public expect fun peerGraphSetPresence(hgraph: ConstPtr, fpresent: Bool): Hresult

public expect fun peerGraphSetProperties(hgraph: ConstPtr, pgraphproperties: ConstPtr): Hresult

public expect fun peerGraphShutdown(): Hresult

public expect fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult

public expect fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult

public expect fun peerGraphUnregisterEvent(hpeerevent: ConstPtr): Hresult

public expect fun peerGraphUpdateRecord(hgraph: ConstPtr, precord: ConstPtr): Hresult

public expect fun peerGraphValidateDeferredRecords(hgraph: ConstPtr, crecordids: UInt, precordids: ConstPtr): Hresult

public expect fun peerGroupAddRecord(hgroup: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult

public expect fun peerGroupClose(hgroup: ConstPtr): Hresult

public expect fun peerGroupCloseDirectConnection(hgroup: ConstPtr, ullconnectionid: ULong): Hresult

public expect fun peerGroupConnect(hgroup: ConstPtr): Hresult

public expect fun peerGroupConnectByAddress(hgroup: ConstPtr, caddresses: UInt, paddresses: ConstPtr): Hresult

public expect fun peerGroupCreate(pproperties: ConstPtr, phgroup: MutPtr): Hresult

public expect fun peerGroupCreateInvitation(hgroup: ConstPtr, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr, croles: UInt, proles: ConstPtr, ppwzinvitation: MutPtr): Hresult

public expect fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr, ppwzinvitation: MutPtr): Hresult

public expect fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult

public expect fun peerGroupDeleteRecord(hgroup: ConstPtr, precordid: ConstPtr): Hresult

public expect fun peerGroupEnumConnections(hgroup: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult

public expect fun peerGroupEnumMembers(hgroup: ConstPtr, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerGroupEnumRecords(hgroup: ConstPtr, precordtype: ConstPtr, phpeerenum: MutPtr): Hresult

public expect fun peerGroupExportConfig(hgroup: ConstPtr, pwzpassword: Pcwstr, ppwzxml: MutPtr): Hresult

public expect fun peerGroupExportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult

public expect fun peerGroupGetProperties(hgroup: ConstPtr, ppproperties: MutPtr): Hresult

public expect fun peerGroupGetRecord(hgroup: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult

public expect fun peerGroupGetStatus(hgroup: ConstPtr, pdwstatus: MutPtr): Hresult

public expect fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr, ppwzgroup: MutPtr): Hresult

public expect fun peerGroupImportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupIssueCredentials(hgroup: ConstPtr, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr, dwflags: UInt, ppwzinvitation: MutPtr): Hresult

public expect fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult

public expect fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult

public expect fun peerGroupOpenDirectConnection(hgroup: ConstPtr, pwzidentity: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult

public expect fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr): Hresult

public expect fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult

public expect fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult

public expect fun peerGroupRegisterEvent(hgroup: ConstPtr, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult

public expect fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr, hpeereventhandle: ConstPtr): Hresult

public expect fun peerGroupSearchRecords(hgroup: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult

public expect fun peerGroupSendData(hgroup: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult

public expect fun peerGroupSetProperties(hgroup: ConstPtr, pproperties: ConstPtr): Hresult

public expect fun peerGroupShutdown(): Hresult

public expect fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult

public expect fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult

public expect fun peerGroupUnregisterEvent(hpeerevent: ConstPtr): Hresult

public expect fun peerGroupUpdateRecord(hgroup: ConstPtr, precord: ConstPtr): Hresult

public expect fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr): Hresult

public expect fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr): Hresult

public expect fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult

public expect fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr): Hresult

public expect fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr): Hresult

public expect fun peerIdentityGetDefault(ppwzpeername: MutPtr): Hresult

public expect fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr): Hresult

public expect fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr): Hresult

public expect fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr): Hresult

public expect fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr): Hresult

public expect fun peerPnrpEndResolve(hresolve: ConstPtr): Hresult

public expect fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr, ppcloudinfo: MutPtr): Hresult

public expect fun peerPnrpGetEndpoint(hresolve: ConstPtr, ppendpoint: MutPtr): Hresult

public expect fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr, phregistration: MutPtr): Hresult

public expect fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr, ppendpoints: MutPtr): Hresult

public expect fun peerPnrpShutdown(): Hresult

public expect fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr): Hresult

public expect fun peerPnrpStartup(wversionrequested: UShort): Hresult

public expect fun peerPnrpUnregister(hregistration: ConstPtr): Hresult

public expect fun peerPnrpUpdateRegistration(hregistration: ConstPtr, pregistrationinfo: ConstPtr): Hresult
