package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.LsaForestTrustInformation
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public expect fun aDsBuildEnumerator(padscontainer: MutPtr<CVoid>, ppenumvariant: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr<UInt>, dwobjecttypes: UInt, pvar: MutPtr<Variant.Variant>): Hresult

public expect fun aDsBuildVarArrayStr(lpppathnames: ConstPtr<Pcwstr>, dwpathnames: UInt, pvar: MutPtr<Variant.Variant>): Hresult

public expect fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr<MutPtr<UByte>>, pdwdestlen: MutPtr<UInt>): Hresult

public expect fun aDsEncodeBinaryData(pbsrcdata: MutPtr<UByte>, dwsrclen: UInt, ppszdestdata: MutPtr<Pwstr>): Hresult

public expect fun aDsEnumerateNext(penumvariant: MutPtr<CVoid>, celements: UInt, pvar: MutPtr<Variant.Variant>, pcelementsfetched: MutPtr<UInt>): Hresult

public expect fun aDsFreeEnumerator(penumvariant: MutPtr<CVoid>): Hresult

public expect fun aDsGetLastError(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult

public expect fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr<AdsAttrInfo>): Bool

public expect fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr<CVoid>, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr<Hwnd>): Hresult

public expect fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr<Adspropinitparams>): Bool

public expect fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr<Adsproperror>): Bool

public expect fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr<Byte>): Bool

public expect fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr)

public expect fun adsFreeAdsValues(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt)

public expect fun adsTypeToPropVariant(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt, pvariant: MutPtr<Variant.Variant>): Hresult

public expect fun allocADsMem(cb: UInt): MutPtr<CVoid>

public expect fun allocADsStr(pstr: Pcwstr): Pwstr

public expect fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr<Variant.Variant>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult

public expect fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>): UInt

public expect fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>, subnetnames: MutPtr<MutPtr<Pstr>>): UInt

public expect fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>, subnetnames: MutPtr<MutPtr<Pwstr>>): UInt

public expect fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt

public expect fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt

public expect fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt

public expect fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt

public expect fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, phds: MutPtr<Handle>): UInt

public expect fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt

public expect fun dsBrowseForContainerA(pinfo: MutPtr<Dsbrowseinfoa>): Int

public expect fun dsBrowseForContainerW(pinfo: MutPtr<Dsbrowseinfow>): Int

public expect fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt

public expect fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt

public expect fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcstr>, ppresult: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcwstr>, ppresult: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt

public expect fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt

public expect fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pportnumber: MutPtr<UShort>, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt

public expect fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pcportname: MutPtr<UInt>, portname: Pwstr, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt

public expect fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt

public expect fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt

public expect fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool

public expect fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool

public expect fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcstr): UInt

public expect fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcwstr): UInt

public expect fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsa>>, domaincount: MutPtr<UInt>): UInt

public expect fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsw>>, domaincount: MutPtr<UInt>): UInt

public expect fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>)

public expect fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>)

public expect fun dsFreeNameResultA(presult: ConstPtr<DsNameResulta>)

public expect fun dsFreeNameResultW(presult: ConstPtr<DsNameResultw>)

public expect fun dsFreePasswordCredentials(authidentity: ConstPtr<CVoid>)

public expect fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr<DsSchemaGuidMapa>)

public expect fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr<DsSchemaGuidMapw>)

public expect fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr<Pstr>)

public expect fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr<Pwstr>)

public expect fun dsGetDcCloseW(getdccontexthandle: Handle)

public expect fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr<Guid>, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfoa>>): UInt

public expect fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr<Guid>, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfow>>): UInt

public expect fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pstr>): UInt

public expect fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pwstr>): UInt

public expect fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt

public expect fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt

public expect fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pstr>>): UInt

public expect fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt

public expect fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt

public expect fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult

public expect fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon

public expect fun dsGetRdnW(ppdn: MutPtr<Pwstr>, pcdn: MutPtr<UInt>, ppkey: MutPtr<Pwstr>, pckey: MutPtr<UInt>, ppval: MutPtr<Pwstr>, pcval: MutPtr<UInt>): UInt

public expect fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr<Pstr>): UInt

public expect fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr<Pwstr>): UInt

public expect fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pstr>>): UInt

public expect fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcwstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pwstr>>): UInt

public expect fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsListRolesA(hds: Handle, pproles: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListRolesW(hds: Handle, pproles: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsListSitesA(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResulta>>): UInt

public expect fun dsListSitesW(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResultw>>): UInt

public expect fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt

public expect fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt

public expect fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapa>>): UInt

public expect fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapw>>): UInt

public expect fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr<LsaForestTrustInformation>, oldforesttrustinfo: ConstPtr<LsaForestTrustInformation>, mergedforesttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt

public expect fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr<Pcstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt

public expect fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr<Pcwstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt

public expect fun dsQuerySitesFree(rgsiteinfo: ConstPtr<DsSiteCostInfo>)

public expect fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pstr): UInt

public expect fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pwstr): UInt

public expect fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt

public expect fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt

public expect fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt

public expect fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt

public expect fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt

public expect fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt

public expect fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt

public expect fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt

public expect fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt

public expect fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr<CVoid>)

public expect fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt

public expect fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt

public expect fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfoa>>>): UInt

public expect fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfow>>>): UInt

public expect fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt

public expect fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt

public expect fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt

public expect fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt

public expect fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt

public expect fun dsRoleFreeMemory(buffer: MutPtr<CVoid>)

public expect fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt

public expect fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt

public expect fun dsUnBindA(phds: ConstPtr<Handle>): UInt

public expect fun dsUnBindW(phds: ConstPtr<Handle>): UInt

public expect fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pstr): UInt

public expect fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pwstr): UInt

public expect fun dsValidateSubnetNameA(subnetname: Pcstr): UInt

public expect fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt

public expect fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr<Pcstr>): UInt

public expect fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr<Pcwstr>): UInt

public expect fun freeADsMem(pmem: MutPtr<CVoid>): Bool

public expect fun freeADsStr(pstr: Pcwstr): Bool

public expect fun propVariantToAdsType(pvariant: MutPtr<Variant.Variant>, dwnumvariant: UInt, ppadsvalues: MutPtr<MutPtr<Adsvalue>>, pdwnumvalues: MutPtr<UInt>): Hresult

public expect fun reallocADsMem(poldmem: MutPtr<CVoid>, cbold: UInt, cbnew: UInt): MutPtr<CVoid>

public expect fun reallocADsStr(ppstr: MutPtr<Pwstr>, pstr: Pcwstr): Bool

public expect fun securityDescriptorToBinarySD(vvarsecdes: Variant.Variant, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, pdwsdlength: MutPtr<UInt>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult
