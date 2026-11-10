package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public expect fun aDsBuildEnumerator(padscontainer: COpaquePointer?, ppenumvariant: COpaquePointer?): Hresult

public expect fun aDsBuildVarArrayInt(lpdwobjecttypes: COpaquePointer?, dwobjecttypes: UInt, pvar: COpaquePointer?): Hresult

public expect fun aDsBuildVarArrayStr(lpppathnames: COpaquePointer?, dwpathnames: UInt, pvar: COpaquePointer?): Hresult

public expect fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: COpaquePointer?, pdwdestlen: COpaquePointer?): Hresult

public expect fun aDsEncodeBinaryData(pbsrcdata: COpaquePointer?, dwsrclen: UInt, ppszdestdata: COpaquePointer?): Hresult

public expect fun aDsEnumerateNext(penumvariant: COpaquePointer?, celements: UInt, pvar: COpaquePointer?, pcelementsfetched: COpaquePointer?): Hresult

public expect fun aDsFreeEnumerator(penumvariant: COpaquePointer?): Hresult

public expect fun aDsGetLastError(lperror: COpaquePointer?, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult

public expect fun aDsGetObject(lpszpathname: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult

public expect fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult

public expect fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: COpaquePointer?): Bool

public expect fun aDsPropCreateNotifyObj(pappthddataobj: COpaquePointer?, pwzadsobjname: Pcwstr, phnotifyobj: COpaquePointer?): Hresult

public expect fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: COpaquePointer?): Bool

public expect fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: COpaquePointer?): Bool

public expect fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: COpaquePointer?): Bool

public expect fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr)

public expect fun adsFreeAdsValues(padsvalues: COpaquePointer?, dwnumvalues: UInt)

public expect fun adsTypeToPropVariant(padsvalues: COpaquePointer?, dwnumvalues: UInt, pvariant: COpaquePointer?): Hresult

public expect fun allocADsMem(cb: UInt): COpaquePointer?

public expect fun allocADsStr(pstr: Pcwstr): Pwstr

public expect fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult

public expect fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt

public expect fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt

public expect fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt

public expect fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt

public expect fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: COpaquePointer?): UInt

public expect fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: COpaquePointer?, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt

public expect fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: COpaquePointer?, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt

public expect fun dsBindToISTGA(sitename: Pcstr, phds: COpaquePointer?): UInt

public expect fun dsBindToISTGW(sitename: Pcwstr, phds: COpaquePointer?): UInt

public expect fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: COpaquePointer?): UInt

public expect fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt

public expect fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt

public expect fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, phds: COpaquePointer?): UInt

public expect fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt

public expect fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt

public expect fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, phds: COpaquePointer?): UInt

public expect fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt

public expect fun dsBrowseForContainerA(pinfo: COpaquePointer?): Int

public expect fun dsBrowseForContainerW(pinfo: COpaquePointer?): Int

public expect fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt

public expect fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt

public expect fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt

public expect fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt

public expect fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt

public expect fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt

public expect fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pportnumber: COpaquePointer?, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt

public expect fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pcportname: COpaquePointer?, portname: Pwstr, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt

public expect fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt

public expect fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt

public expect fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool

public expect fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool

public expect fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcstr): UInt

public expect fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcwstr): UInt

public expect fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt

public expect fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt

public expect fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?)

public expect fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?)

public expect fun dsFreeNameResultA(presult: COpaquePointer?)

public expect fun dsFreeNameResultW(presult: COpaquePointer?)

public expect fun dsFreePasswordCredentials(authidentity: COpaquePointer?)

public expect fun dsFreeSchemaGuidMapA(pguidmap: COpaquePointer?)

public expect fun dsFreeSchemaGuidMapW(pguidmap: COpaquePointer?)

public expect fun dsFreeSpnArrayA(cspn: UInt, rpszspn: COpaquePointer?)

public expect fun dsFreeSpnArrayW(cspn: UInt, rpszspn: COpaquePointer?)

public expect fun dsGetDcCloseW(getdccontexthandle: Handle)

public expect fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: COpaquePointer?, sitename: Pcstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt

public expect fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: COpaquePointer?, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt

public expect fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt

public expect fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt

public expect fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: COpaquePointer?, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt

public expect fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: COpaquePointer?, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt

public expect fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt

public expect fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt

public expect fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt

public expect fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt

public expect fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: COpaquePointer?): UInt

public expect fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult

public expect fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon

public expect fun dsGetRdnW(ppdn: COpaquePointer?, pcdn: COpaquePointer?, ppkey: COpaquePointer?, pckey: COpaquePointer?, ppval: COpaquePointer?, pcval: COpaquePointer?): UInt

public expect fun dsGetSiteNameA(computername: Pcstr, sitename: COpaquePointer?): UInt

public expect fun dsGetSiteNameW(computername: Pcwstr, sitename: COpaquePointer?): UInt

public expect fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt

public expect fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt

public expect fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: COpaquePointer?): UInt

public expect fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: COpaquePointer?): UInt

public expect fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: COpaquePointer?): UInt

public expect fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: COpaquePointer?): UInt

public expect fun dsListRolesA(hds: Handle, pproles: COpaquePointer?): UInt

public expect fun dsListRolesW(hds: Handle, pproles: COpaquePointer?): UInt

public expect fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: COpaquePointer?): UInt

public expect fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: COpaquePointer?): UInt

public expect fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: COpaquePointer?): UInt

public expect fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: COpaquePointer?): UInt

public expect fun dsListSitesA(hds: Handle, ppsites: COpaquePointer?): UInt

public expect fun dsListSitesW(hds: Handle, ppsites: COpaquePointer?): UInt

public expect fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: COpaquePointer?): UInt

public expect fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: COpaquePointer?): UInt

public expect fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt

public expect fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt

public expect fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt

public expect fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt

public expect fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: COpaquePointer?, oldforesttrustinfo: COpaquePointer?, mergedforesttrustinfo: COpaquePointer?): UInt

public expect fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt

public expect fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt

public expect fun dsQuerySitesFree(rgsiteinfo: COpaquePointer?)

public expect fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pstr): UInt

public expect fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pwstr): UInt

public expect fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt

public expect fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt

public expect fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt

public expect fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt

public expect fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt

public expect fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt

public expect fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt

public expect fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: COpaquePointer?)

public expect fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: COpaquePointer?): UInt

public expect fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, ppinfo: COpaquePointer?): UInt

public expect fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt

public expect fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt

public expect fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: COpaquePointer?, options: UInt): UInt

public expect fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt

public expect fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt

public expect fun dsRoleFreeMemory(buffer: COpaquePointer?)

public expect fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: COpaquePointer?): UInt

public expect fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt

public expect fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt

public expect fun dsUnBindA(phds: COpaquePointer?): UInt

public expect fun dsUnBindW(phds: COpaquePointer?): UInt

public expect fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pstr): UInt

public expect fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pwstr): UInt

public expect fun dsValidateSubnetNameA(subnetname: Pcstr): UInt

public expect fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt

public expect fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: COpaquePointer?): UInt

public expect fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: COpaquePointer?): UInt

public expect fun freeADsMem(pmem: COpaquePointer?): Bool

public expect fun freeADsStr(pstr: Pcwstr): Bool

public expect fun propVariantToAdsType(pvariant: COpaquePointer?, dwnumvariant: UInt, ppadsvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult

public expect fun reallocADsMem(poldmem: COpaquePointer?, cbold: UInt, cbnew: UInt): COpaquePointer?

public expect fun reallocADsStr(ppstr: COpaquePointer?, pstr: Pcwstr): Bool

public expect fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: COpaquePointer?, pdwsdlength: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult
