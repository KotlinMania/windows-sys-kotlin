@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun aDsBuildEnumerator(padscontainer: MutPtr, ppenumvariant: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator")

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr, dwobjecttypes: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt")

public actual fun aDsBuildVarArrayStr(lpppathnames: ConstPtr, dwpathnames: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr")

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr, pdwdestlen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData")

public actual fun aDsEncodeBinaryData(pbsrcdata: MutPtr, dwsrclen: UInt, ppszdestdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData")

public actual fun aDsEnumerateNext(penumvariant: MutPtr, celements: UInt, pvar: MutPtr, pcelementsfetched: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext")

public actual fun aDsFreeEnumerator(penumvariant: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator")

public actual fun aDsGetLastError(lperror: MutPtr, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError")

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsGetObject")

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr, ppobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject")

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable")

public actual fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj")

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo")

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage")

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd")

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle")

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog")

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError")

public actual fun adsFreeAdsValues(padsvalues: MutPtr, dwnumvalues: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues")

public actual fun adsTypeToPropVariant(padsvalues: MutPtr, dwnumvalues: UInt, pvariant: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant")

public actual fun allocADsMem(cb: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem")

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr")

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor")

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA")

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW")

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA")

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA")

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW")

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW")

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindA")

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA")

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW")

public actual fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA")

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW")

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindW")

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA")

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW")

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA")

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA")

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW")

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, phds: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW")

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout")

public actual fun dsBrowseForContainerA(pinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA")

public actual fun dsBrowseForContainerW(pinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW")

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA")

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW")

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA")

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW")

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A")

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W")

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pportnumber: MutPtr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W")

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pcportname: MutPtr, portname: Pwstr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W")

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA")

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW")

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA")

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW")

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA")

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW")

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA")

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW")

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA")

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW")

public actual fun dsFreeNameResultA(presult: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA")

public actual fun dsFreeNameResultW(presult: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW")

public actual fun dsFreePasswordCredentials(authidentity: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials")

public actual fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA")

public actual fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW")

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA")

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW")

public actual fun dsGetDcCloseW(getdccontexthandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW")

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA")

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW")

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA")

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW")

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA")

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW")

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA")

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW")

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA")

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW")

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW")

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName")

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon")

public actual fun dsGetRdnW(ppdn: MutPtr, pcdn: MutPtr, ppkey: MutPtr, pckey: MutPtr, ppval: MutPtr, pcval: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW")

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA")

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW")

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA")

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW")

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA")

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW")

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA")

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW")

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA")

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW")

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA")

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW")

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA")

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW")

public actual fun dsListRolesA(hds: Handle, pproles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA")

public actual fun dsListRolesW(hds: Handle, pproles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW")

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA")

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW")

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA")

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW")

public actual fun dsListSitesA(hds: Handle, ppsites: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA")

public actual fun dsListSitesW(hds: Handle, ppsites: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW")

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA")

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW")

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA")

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW")

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA")

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW")

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr, oldforesttrustinfo: ConstPtr, mergedforesttrustinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW")

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA")

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW")

public actual fun dsQuerySitesFree(rgsiteinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree")

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA")

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW")

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA")

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW")

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA")

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW")

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA")

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW")

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck")

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA")

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW")

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo")

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W")

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, ppinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW")

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA")

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW")

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA")

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA")

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW")

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW")

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA")

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW")

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA")

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW")

public actual fun dsRoleFreeMemory(buffer: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory")

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation")

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA")

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW")

public actual fun dsUnBindA(phds: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA")

public actual fun dsUnBindW(phds: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW")

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA")

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW")

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA")

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW")

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA")

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW")

public actual fun freeADsMem(pmem: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem")

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr")

public actual fun propVariantToAdsType(pvariant: MutPtr, dwnumvariant: UInt, ppadsvalues: MutPtr, pdwnumvalues: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType")

public actual fun reallocADsMem(poldmem: MutPtr, cbold: UInt, cbnew: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem")

public actual fun reallocADsStr(ppstr: MutPtr, pstr: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr")

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: MutPtr, pdwsdlength: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingActivedirectorySecurityDescriptorToBinarySD")
