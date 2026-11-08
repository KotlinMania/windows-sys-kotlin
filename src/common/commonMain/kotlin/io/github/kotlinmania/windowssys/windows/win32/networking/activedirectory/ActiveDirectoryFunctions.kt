package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsBuildEnumerator", longArrayOf(padscontainer, ppenumvariant)).toInt()
}

public fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsBuildVarArrayInt", longArrayOf(lpdwobjecttypes, dwobjecttypes.toLong(), pvar)).toInt()
}

public fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsBuildVarArrayStr", longArrayOf(lpppathnames, dwpathnames.toLong(), pvar)).toInt()
}

public fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsDecodeBinaryData", longArrayOf(szsrcdata, ppbdestdata, pdwdestlen)).toInt()
}

public fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsEncodeBinaryData", longArrayOf(pbsrcdata, dwsrclen.toLong(), ppszdestdata)).toInt()
}

public fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsEnumerateNext", longArrayOf(penumvariant, celements.toLong(), pvar, pcelementsfetched)).toInt()
}

public fun ADsFreeEnumerator(penumvariant: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsFreeEnumerator", longArrayOf(penumvariant)).toInt()
}

public fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsGetLastError", longArrayOf(lperror, lperrorbuf, dwerrorbuflen.toLong(), lpnamebuf, dwnamebuflen.toLong())).toInt()
}

public fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsGetObject", longArrayOf(lpszpathname, riid, ppobject)).toInt()
}

public fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "ADsOpenObject", longArrayOf(lpszpathname, lpszusername, lpszpassword, dwreserved.toLong(), riid, ppobject)).toInt()
}

public fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropCheckIfWritable", longArrayOf(pwzattr, pwritableattrs)).toInt()
}

public fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropCreateNotifyObj", longArrayOf(pappthddataobj, pwzadsobjname, phnotifyobj)).toInt()
}

public fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropGetInitInfo", longArrayOf(hnotifyobj, pinitparams)).toInt()
}

public fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropSendErrorMessage", longArrayOf(hnotifyobj, perror)).toInt()
}

public fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropSetHwnd", longArrayOf(hnotifyobj, hpage)).toInt()
}

public fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropSetHwndWithTitle", longArrayOf(hnotifyobj, hpage, ptztitle)).toInt()
}

public fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL {
    return Win32DynamicFfi.invoke("dsprop.dll", "ADsPropShowErrorDialog", longArrayOf(hnotifyobj, hpage)).toInt()
}

public fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR) {
    Win32DynamicFfi.invoke("activeds.dll", "ADsSetLastError", longArrayOf(dwerr.toLong(), pszerror, pszprovider))
}

public fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt) {
    Win32DynamicFfi.invoke("activeds.dll", "AdsFreeAdsValues", longArrayOf(padsvalues, dwnumvalues.toLong()))
}

public fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "AdsTypeToPropVariant", longArrayOf(padsvalues, dwnumvalues.toLong(), pvariant)).toInt()
}

public fun AllocADsMem(cb: UInt): Long {
    return Win32DynamicFfi.invoke("activeds.dll", "AllocADsMem", longArrayOf(cb.toLong()))
}

public fun AllocADsStr(pstr: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("activeds.dll", "AllocADsStr", longArrayOf(pstr))
}

public fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "BinarySDToSecurityDescriptor", longArrayOf(psecuritydescriptor, pvarsec, pszservername, username, password, dwflags.toLong())).toInt()
}

public fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsAddSidHistoryA", longArrayOf(hds, flags.toLong(), srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal)).toUInt()
}

public fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsAddSidHistoryW", longArrayOf(hds, flags.toLong(), srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal)).toUInt()
}

public fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsAddressToSiteNamesA", longArrayOf(computername, entrycount.toLong(), socketaddresses, sitenames)).toUInt()
}

public fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsAddressToSiteNamesExA", longArrayOf(computername, entrycount.toLong(), socketaddresses, sitenames, subnetnames)).toUInt()
}

public fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsAddressToSiteNamesExW", longArrayOf(computername, entrycount.toLong(), socketaddresses, sitenames, subnetnames)).toUInt()
}

public fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsAddressToSiteNamesW", longArrayOf(computername, entrycount.toLong(), socketaddresses, sitenames)).toUInt()
}

public fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindA", longArrayOf(domaincontrollername, dnsdomainname, phds)).toUInt()
}

public fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindByInstanceA", longArrayOf(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags.toLong(), phds)).toUInt()
}

public fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindByInstanceW", longArrayOf(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags.toLong(), phds)).toUInt()
}

public fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindToISTGA", longArrayOf(sitename, phds)).toUInt()
}

public fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindToISTGW", longArrayOf(sitename, phds)).toUInt()
}

public fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindW", longArrayOf(domaincontrollername, dnsdomainname, phds)).toUInt()
}

public fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithCredA", longArrayOf(domaincontrollername, dnsdomainname, authidentity, phds)).toUInt()
}

public fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithCredW", longArrayOf(domaincontrollername, dnsdomainname, authidentity, phds)).toUInt()
}

public fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithSpnA", longArrayOf(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds)).toUInt()
}

public fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithSpnExA", longArrayOf(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags.toLong(), phds)).toUInt()
}

public fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithSpnExW", longArrayOf(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags.toLong(), phds)).toUInt()
}

public fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindWithSpnW", longArrayOf(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds)).toUInt()
}

public fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsBindingSetTimeout", longArrayOf(hds, ctimeoutsecs.toLong())).toUInt()
}

public fun DsBrowseForContainerA(pinfo: Long): Int {
    return Win32DynamicFfi.invoke("dsuiext.dll", "DsBrowseForContainerA", longArrayOf(pinfo)).toInt()
}

public fun DsBrowseForContainerW(pinfo: Long): Int {
    return Win32DynamicFfi.invoke("dsuiext.dll", "DsBrowseForContainerW", longArrayOf(pinfo)).toInt()
}

public fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsClientMakeSpnForTargetServerA", longArrayOf(serviceclass, servicename, pcspnlength, pszspn)).toUInt()
}

public fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsClientMakeSpnForTargetServerW", longArrayOf(serviceclass, servicename, pcspnlength, pszspn)).toUInt()
}

public fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsCrackNamesA", longArrayOf(hds, flags.toLong(), formatoffered.toLong(), formatdesired.toLong(), cnames.toLong(), rpnames, ppresult)).toUInt()
}

public fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsCrackNamesW", longArrayOf(hds, flags.toLong(), formatoffered.toLong(), formatdesired.toLong(), cnames.toLong(), rpnames, ppresult)).toUInt()
}

public fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpn2A", longArrayOf(pszspn, cspn.toLong(), pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport)).toUInt()
}

public fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpn2W", longArrayOf(pszspn, cspn.toLong(), pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport)).toUInt()
}

public fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpn3W", longArrayOf(pszspn, cspn.toLong(), pchostname, hostname, pcinstancename, instancename, pportnumber, pcdomainname, domainname, pcrealmname, realmname)).toUInt()
}

public fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpn4W", longArrayOf(pszspn, cspn.toLong(), pchostname, hostname, pcinstancename, instancename, pcportname, portname, pcdomainname, domainname, pcrealmname, realmname)).toUInt()
}

public fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpnA", longArrayOf(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport)).toUInt()
}

public fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackSpnW", longArrayOf(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport)).toUInt()
}

public fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackUnquotedMangledRdnA", longArrayOf(pszrdn, cchrdn.toLong(), pguid, pedsmanglefor)).toInt()
}

public fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsCrackUnquotedMangledRdnW", longArrayOf(pszrdn, cchrdn.toLong(), pguid, pedsmanglefor)).toInt()
}

public fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsDeregisterDnsHostRecordsA", longArrayOf(servername, dnsdomainname, domainguid, dsaguid, dnshostname)).toUInt()
}

public fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsDeregisterDnsHostRecordsW", longArrayOf(servername, dnsdomainname, domainguid, dsaguid, dnshostname)).toUInt()
}

public fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsEnumerateDomainTrustsA", longArrayOf(servername, flags.toLong(), domains, domaincount)).toUInt()
}

public fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsEnumerateDomainTrustsW", longArrayOf(servername, flags.toLong(), domains, domaincount)).toUInt()
}

public fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeDomainControllerInfoA", longArrayOf(infolevel.toLong(), cinfo.toLong(), pinfo))
}

public fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeDomainControllerInfoW", longArrayOf(infolevel.toLong(), cinfo.toLong(), pinfo))
}

public fun DsFreeNameResultA(presult: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeNameResultA", longArrayOf(presult))
}

public fun DsFreeNameResultW(presult: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeNameResultW", longArrayOf(presult))
}

public fun DsFreePasswordCredentials(authidentity: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreePasswordCredentials", longArrayOf(authidentity))
}

public fun DsFreeSchemaGuidMapA(pguidmap: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeSchemaGuidMapA", longArrayOf(pguidmap))
}

public fun DsFreeSchemaGuidMapW(pguidmap: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeSchemaGuidMapW", longArrayOf(pguidmap))
}

public fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeSpnArrayA", longArrayOf(cspn.toLong(), rpszspn))
}

public fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsFreeSpnArrayW", longArrayOf(cspn.toLong(), rpszspn))
}

public fun DsGetDcCloseW(getdccontexthandle: HANDLE) {
    Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcCloseW", longArrayOf(getdccontexthandle))
}

public fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcNameA", longArrayOf(computername, domainname, domainguid, sitename, flags.toLong(), domaincontrollerinfo)).toUInt()
}

public fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcNameW", longArrayOf(computername, domainname, domainguid, sitename, flags.toLong(), domaincontrollerinfo)).toUInt()
}

public fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcNextA", longArrayOf(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname)).toUInt()
}

public fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcNextW", longArrayOf(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname)).toUInt()
}

public fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcOpenA", longArrayOf(dnsname, optionflags.toLong(), sitename, domainguid, dnsforestname, dcflags.toLong(), retgetdccontext)).toUInt()
}

public fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcOpenW", longArrayOf(dnsname, optionflags.toLong(), sitename, domainguid, dnsforestname, dcflags.toLong(), retgetdccontext)).toUInt()
}

public fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcSiteCoverageA", longArrayOf(servername, entrycount, sitenames)).toUInt()
}

public fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetDcSiteCoverageW", longArrayOf(servername, entrycount, sitenames)).toUInt()
}

public fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsGetDomainControllerInfoA", longArrayOf(hds, domainname, infolevel.toLong(), pcout, ppinfo)).toUInt()
}

public fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsGetDomainControllerInfoW", longArrayOf(hds, domainname, infolevel.toLong(), pcout, ppinfo)).toUInt()
}

public fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetForestTrustInformationW", longArrayOf(servername, trusteddomainname, flags.toLong(), foresttrustinfo)).toUInt()
}

public fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dsuiext.dll", "DsGetFriendlyClassName", longArrayOf(pszobjectclass, pszbuffer, cchbuffer.toLong())).toInt()
}

public fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON {
    return Win32DynamicFfi.invoke("dsuiext.dll", "DsGetIcon", longArrayOf(dwflags.toLong(), pszobjectclass, cximage.toLong(), cyimage.toLong()))
}

public fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsGetRdnW", longArrayOf(ppdn, pcdn, ppkey, pckey, ppval, pcval)).toUInt()
}

public fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetSiteNameA", longArrayOf(computername, sitename)).toUInt()
}

public fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsGetSiteNameW", longArrayOf(computername, sitename)).toUInt()
}

public fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsGetSpnA", longArrayOf(servicetype.toLong(), serviceclass, servicename, instanceport.toLong(), cinstancenames.toLong(), pinstancenames, pinstanceports, pcspn, prpszspn)).toUInt()
}

public fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsGetSpnW", longArrayOf(servicetype.toLong(), serviceclass, servicename, instanceport.toLong(), cinstancenames.toLong(), pinstancenames, pinstanceports, pcspn, prpszspn)).toUInt()
}

public fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsInheritSecurityIdentityA", longArrayOf(hds, flags.toLong(), srcprincipal, dstprincipal)).toUInt()
}

public fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsInheritSecurityIdentityW", longArrayOf(hds, flags.toLong(), srcprincipal, dstprincipal)).toUInt()
}

public fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsIsMangledDnA", longArrayOf(pszdn, edsmanglefor.toLong())).toInt()
}

public fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsIsMangledDnW", longArrayOf(pszdn, edsmanglefor.toLong())).toInt()
}

public fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsIsMangledRdnValueA", longArrayOf(pszrdn, crdn.toLong(), edsmanglefordesired.toLong())).toInt()
}

public fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsIsMangledRdnValueW", longArrayOf(pszrdn, crdn.toLong(), edsmanglefordesired.toLong())).toInt()
}

public fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListDomainsInSiteA", longArrayOf(hds, site, ppdomains)).toUInt()
}

public fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListDomainsInSiteW", longArrayOf(hds, site, ppdomains)).toUInt()
}

public fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListInfoForServerA", longArrayOf(hds, server, ppinfo)).toUInt()
}

public fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListInfoForServerW", longArrayOf(hds, server, ppinfo)).toUInt()
}

public fun DsListRolesA(hds: HANDLE, pproles: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListRolesA", longArrayOf(hds, pproles)).toUInt()
}

public fun DsListRolesW(hds: HANDLE, pproles: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListRolesW", longArrayOf(hds, pproles)).toUInt()
}

public fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListServersForDomainInSiteA", longArrayOf(hds, domain, site, ppservers)).toUInt()
}

public fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListServersForDomainInSiteW", longArrayOf(hds, domain, site, ppservers)).toUInt()
}

public fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListServersInSiteA", longArrayOf(hds, site, ppservers)).toUInt()
}

public fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListServersInSiteW", longArrayOf(hds, site, ppservers)).toUInt()
}

public fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListSitesA", longArrayOf(hds, ppsites)).toUInt()
}

public fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsListSitesW", longArrayOf(hds, ppsites)).toUInt()
}

public fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsMakePasswordCredentialsA", longArrayOf(user, domain, password, pauthidentity)).toUInt()
}

public fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsMakePasswordCredentialsW", longArrayOf(user, domain, password, pauthidentity)).toUInt()
}

public fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsMakeSpnA", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, pcspnlength, pszspn)).toUInt()
}

public fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsMakeSpnW", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, pcspnlength, pszspn)).toUInt()
}

public fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsMapSchemaGuidsA", longArrayOf(hds, cguids.toLong(), rguids, ppguidmap)).toUInt()
}

public fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsMapSchemaGuidsW", longArrayOf(hds, cguids.toLong(), rguids, ppguidmap)).toUInt()
}

public fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsMergeForestTrustInformationW", longArrayOf(domainname, newforesttrustinfo, oldforesttrustinfo, mergedforesttrustinfo)).toUInt()
}

public fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsQuerySitesByCostA", longArrayOf(hds, pszfromsite, rgsztosites, ctosites.toLong(), dwflags.toLong(), prgsiteinfo)).toUInt()
}

public fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsQuerySitesByCostW", longArrayOf(hds, pwszfromsite, rgwsztosites, ctosites.toLong(), dwflags.toLong(), prgsiteinfo)).toUInt()
}

public fun DsQuerySitesFree(rgsiteinfo: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsQuerySitesFree", longArrayOf(rgsiteinfo))
}

public fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsQuoteRdnValueA", longArrayOf(cunquotedrdnvaluelength.toLong(), psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue)).toUInt()
}

public fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsQuoteRdnValueW", longArrayOf(cunquotedrdnvaluelength.toLong(), psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue)).toUInt()
}

public fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsRemoveDsDomainA", longArrayOf(hds, domaindn)).toUInt()
}

public fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsRemoveDsDomainW", longArrayOf(hds, domaindn)).toUInt()
}

public fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsRemoveDsServerA", longArrayOf(hds, serverdn, domaindn, flastdcindomain, fcommit.toLong())).toUInt()
}

public fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsRemoveDsServerW", longArrayOf(hds, serverdn, domaindn, flastdcindomain, fcommit.toLong())).toUInt()
}

public fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaAddA", longArrayOf(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options.toLong())).toUInt()
}

public fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaAddW", longArrayOf(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options.toLong())).toUInt()
}

public fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaConsistencyCheck", longArrayOf(hds, taskid.toLong(), dwflags.toLong())).toUInt()
}

public fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaDelA", longArrayOf(hds, namecontext, dsasrc, options.toLong())).toUInt()
}

public fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaDelW", longArrayOf(hds, namecontext, dsasrc, options.toLong())).toUInt()
}

public fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long) {
    Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaFreeInfo", longArrayOf(infotype.toLong(), pinfo))
}

public fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaGetInfo2W", longArrayOf(hds, infotype.toLong(), pszobject, puuidforsourcedsaobjguid, pszattributename, pszvalue, dwflags.toLong(), dwenumerationcontext.toLong(), ppinfo)).toUInt()
}

public fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaGetInfoW", longArrayOf(hds, infotype.toLong(), pszobject, puuidforsourcedsaobjguid, ppinfo)).toUInt()
}

public fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaModifyA", longArrayOf(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags.toLong(), modifyfields.toLong(), options.toLong())).toUInt()
}

public fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaModifyW", longArrayOf(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags.toLong(), modifyfields.toLong(), options.toLong())).toUInt()
}

public fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaSyncA", longArrayOf(hds, namecontext, puuiddsasrc, options.toLong())).toUInt()
}

public fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaSyncAllA", longArrayOf(hds, psznamecontext, ulflags.toLong(), pfncallback, pcallbackdata, perrors)).toUInt()
}

public fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaSyncAllW", longArrayOf(hds, psznamecontext, ulflags.toLong(), pfncallback, pcallbackdata, perrors)).toUInt()
}

public fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaSyncW", longArrayOf(hds, namecontext, puuiddsasrc, options.toLong())).toUInt()
}

public fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaUpdateRefsA", longArrayOf(hds, namecontext, dsadest, puuiddsadest, options.toLong())).toUInt()
}

public fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaUpdateRefsW", longArrayOf(hds, namecontext, dsadest, puuiddsadest, options.toLong())).toUInt()
}

public fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaVerifyObjectsA", longArrayOf(hds, namecontext, puuiddsasrc, uloptions.toLong())).toUInt()
}

public fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsReplicaVerifyObjectsW", longArrayOf(hds, namecontext, puuiddsasrc, uloptions.toLong())).toUInt()
}

public fun DsRoleFreeMemory(buffer: Long) {
    Win32DynamicFfi.invoke("netapi32.dll", "DsRoleFreeMemory", longArrayOf(buffer))
}

public fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsRoleGetPrimaryDomainInformation", longArrayOf(lpserver, infolevel.toLong(), buffer)).toUInt()
}

public fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsServerRegisterSpnA", longArrayOf(operation.toLong(), serviceclass, userobjectdn)).toUInt()
}

public fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsServerRegisterSpnW", longArrayOf(operation.toLong(), serviceclass, userobjectdn)).toUInt()
}

public fun DsUnBindA(phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsUnBindA", longArrayOf(phds)).toUInt()
}

public fun DsUnBindW(phds: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsUnBindW", longArrayOf(phds)).toUInt()
}

public fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsUnquoteRdnValueA", longArrayOf(cquotedrdnvaluelength.toLong(), psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue)).toUInt()
}

public fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dsparse.dll", "DsUnquoteRdnValueW", longArrayOf(cquotedrdnvaluelength.toLong(), psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue)).toUInt()
}

public fun DsValidateSubnetNameA(subnetname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsValidateSubnetNameA", longArrayOf(subnetname)).toUInt()
}

public fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DsValidateSubnetNameW", longArrayOf(subnetname)).toUInt()
}

public fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsWriteAccountSpnA", longArrayOf(hds, operation.toLong(), pszaccount, cspn.toLong(), rpszspn)).toUInt()
}

public fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt {
    return Win32DynamicFfi.invoke("ntdsapi.dll", "DsWriteAccountSpnW", longArrayOf(hds, operation.toLong(), pszaccount, cspn.toLong(), rpszspn)).toUInt()
}

public fun FreeADsMem(pmem: Long): BOOL {
    return Win32DynamicFfi.invoke("activeds.dll", "FreeADsMem", longArrayOf(pmem)).toInt()
}

public fun FreeADsStr(pstr: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("activeds.dll", "FreeADsStr", longArrayOf(pstr)).toInt()
}

public fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "PropVariantToAdsType", longArrayOf(pvariant, dwnumvariant.toLong(), ppadsvalues, pdwnumvalues)).toInt()
}

public fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long {
    return Win32DynamicFfi.invoke("activeds.dll", "ReallocADsMem", longArrayOf(poldmem, cbold.toLong(), cbnew.toLong()))
}

public fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("activeds.dll", "ReallocADsStr", longArrayOf(ppstr, pstr)).toInt()
}

public fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("activeds.dll", "SecurityDescriptorToBinarySD", longArrayOf(Win32DynamicFfi.objectSlot(vvarsecdes), ppsecuritydescriptor, pdwsdlength, pszservername, username, password, dwflags.toLong())).toInt()
}
