package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun aDsBuildEnumerator(padscontainer: MutPtr, ppenumvariant: MutPtr): Hresult

public expect fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr, dwobjecttypes: UInt, pvar: MutPtr): Hresult

public expect fun aDsBuildVarArrayStr(lpppathnames: ConstPtr, dwpathnames: UInt, pvar: MutPtr): Hresult

public expect fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr, pdwdestlen: MutPtr): Hresult

public expect fun aDsEncodeBinaryData(pbsrcdata: MutPtr, dwsrclen: UInt, ppszdestdata: MutPtr): Hresult

public expect fun aDsEnumerateNext(penumvariant: MutPtr, celements: UInt, pvar: MutPtr, pcelementsfetched: MutPtr): Hresult

public expect fun aDsFreeEnumerator(penumvariant: MutPtr): Hresult

public expect fun aDsGetLastError(lperror: MutPtr, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult

public expect fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult

public expect fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr, ppobject: MutPtr): Hresult

public expect fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr): Bool

public expect fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr): Hresult

public expect fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr): Bool

public expect fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr): Bool

public expect fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr): Bool

public expect fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool

public expect fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr)

public expect fun adsFreeAdsValues(padsvalues: MutPtr, dwnumvalues: UInt)

public expect fun adsTypeToPropVariant(padsvalues: MutPtr, dwnumvalues: UInt, pvariant: MutPtr): Hresult

public expect fun allocADsMem(cb: UInt): MutPtr

public expect fun allocADsStr(pstr: Pcwstr): Pwstr

public expect fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult

public expect fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr, dstdomain: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt

public expect fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt

public expect fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt

public expect fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt

public expect fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr): UInt

public expect fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt

public expect fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt

public expect fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr): UInt

public expect fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr): UInt

public expect fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr): UInt

public expect fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, phds: MutPtr): UInt

public expect fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, phds: MutPtr): UInt

public expect fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, phds: MutPtr): UInt

public expect fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt

public expect fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt

public expect fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, phds: MutPtr): UInt

public expect fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt

public expect fun dsBrowseForContainerA(pinfo: MutPtr): Int

public expect fun dsBrowseForContainerW(pinfo: MutPtr): Int

public expect fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt

public expect fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt

public expect fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt

public expect fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt

public expect fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt

public expect fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt

public expect fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pportnumber: MutPtr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt

public expect fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pcportname: MutPtr, portname: Pwstr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt

public expect fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt

public expect fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt

public expect fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool

public expect fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool

public expect fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcstr): UInt

public expect fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcwstr): UInt

public expect fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt

public expect fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt

public expect fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr)

public expect fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr)

public expect fun dsFreeNameResultA(presult: ConstPtr)

public expect fun dsFreeNameResultW(presult: ConstPtr)

public expect fun dsFreePasswordCredentials(authidentity: ConstPtr)

public expect fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr)

public expect fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr)

public expect fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr)

public expect fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr)

public expect fun dsGetDcCloseW(getdccontexthandle: Handle)

public expect fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt

public expect fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt

public expect fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt

public expect fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt

public expect fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr): UInt

public expect fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr): UInt

public expect fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr, sitenames: MutPtr): UInt

public expect fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr, sitenames: MutPtr): UInt

public expect fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt

public expect fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt

public expect fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr): UInt

public expect fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult

public expect fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon

public expect fun dsGetRdnW(ppdn: MutPtr, pcdn: MutPtr, ppkey: MutPtr, pckey: MutPtr, ppval: MutPtr, pcval: MutPtr): UInt

public expect fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr): UInt

public expect fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr): UInt

public expect fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt

public expect fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt

public expect fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt

public expect fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt

public expect fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool

public expect fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr): UInt

public expect fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr): UInt

public expect fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr): UInt

public expect fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr): UInt

public expect fun dsListRolesA(hds: Handle, pproles: MutPtr): UInt

public expect fun dsListRolesW(hds: Handle, pproles: MutPtr): UInt

public expect fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr): UInt

public expect fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr): UInt

public expect fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr): UInt

public expect fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr): UInt

public expect fun dsListSitesA(hds: Handle, ppsites: MutPtr): UInt

public expect fun dsListSitesW(hds: Handle, ppsites: MutPtr): UInt

public expect fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr): UInt

public expect fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr): UInt

public expect fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt

public expect fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt

public expect fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt

public expect fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt

public expect fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr, oldforesttrustinfo: ConstPtr, mergedforesttrustinfo: MutPtr): UInt

public expect fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt

public expect fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt

public expect fun dsQuerySitesFree(rgsiteinfo: ConstPtr)

public expect fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pstr): UInt

public expect fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pwstr): UInt

public expect fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt

public expect fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt

public expect fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr, fcommit: Bool): UInt

public expect fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr, fcommit: Bool): UInt

public expect fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, options: UInt): UInt

public expect fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, options: UInt): UInt

public expect fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt

public expect fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt

public expect fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt

public expect fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr)

public expect fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr): UInt

public expect fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, ppinfo: MutPtr): UInt

public expect fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, options: UInt): UInt

public expect fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt

public expect fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt

public expect fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, options: UInt): UInt

public expect fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr, options: UInt): UInt

public expect fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr, options: UInt): UInt

public expect fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt

public expect fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt

public expect fun dsRoleFreeMemory(buffer: MutPtr)

public expect fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr): UInt

public expect fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt

public expect fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt

public expect fun dsUnBindA(phds: ConstPtr): UInt

public expect fun dsUnBindW(phds: ConstPtr): UInt

public expect fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pstr): UInt

public expect fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pwstr): UInt

public expect fun dsValidateSubnetNameA(subnetname: Pcstr): UInt

public expect fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt

public expect fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr): UInt

public expect fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr): UInt

public expect fun freeADsMem(pmem: MutPtr): Bool

public expect fun freeADsStr(pstr: Pcwstr): Bool

public expect fun propVariantToAdsType(pvariant: MutPtr, dwnumvariant: UInt, ppadsvalues: MutPtr, pdwnumvalues: MutPtr): Hresult

public expect fun reallocADsMem(poldmem: MutPtr, cbold: UInt, cbnew: UInt): MutPtr

public expect fun reallocADsStr(ppstr: MutPtr, pstr: Pcwstr): Bool

public expect fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: MutPtr, pdwsdlength: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult
