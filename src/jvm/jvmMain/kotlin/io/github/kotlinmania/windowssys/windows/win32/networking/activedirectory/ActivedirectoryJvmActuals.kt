@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private object WindowsWin32NetworkingActivedirectoryJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkingActivedirectoryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(szsrcdata: Long, ppbdestdata: Long, pdwdestlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: Int, ppszdestdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(penumvariant: Long, celements: Int, pvar: Long, pcelementsfetched: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(penumvariant: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(lperror: Long, lperrorbuf: Long, dwerrorbuflen: Int, lpnamebuf: Long, dwnamebuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(lpszpathname: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(lpszpathname: Long, lpszusername: Long, lpszpassword: Long, dwreserved: Int, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(pwzattr: Long, pwritableattrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: Long, phnotifyobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(hnotifyobj: Long, pinitparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(hnotifyobj: Long, perror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(hnotifyobj: Long, hpage: Long, ptztitle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(dwerr: Int, pszerror: Long, pszprovider: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(padsvalues: Long, dwnumvalues: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(padsvalues: Long, dwnumvalues: Int, pvariant: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(cb: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(pstr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(psecuritydescriptor: Long, pvarsec: Long, pszservername: Long, username: Long, password: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindA(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindW(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(hds: Long, ctimeoutsecs: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pportnumber: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pcportname: Long, portname: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(presult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(presult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(authidentity: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(pguidmap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(pguidmap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(getdccontexthandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(servername: Long, trusteddomainname: Long, flags: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(pszobjectclass: Long, pszbuffer: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(dwflags: Int, pszobjectclass: Long, cximage: Int, cyimage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(domainname: Long, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(hds: Long, pszfromsite: Long, rgsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(hds: Long, pwszfromsite: Long, rgwsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(rgsiteinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(hds: Long, taskid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(infotype: Int, pinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, pszattributename: Long, pszvalue: Long, dwflags: Int, dwenumerationcontext: Int, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(lpserver: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(phds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(subnetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(subnetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(pmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(pstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(pvariant: Long, dwnumvariant: Int, ppadsvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(poldmem: Long, cbold: Int, cbnew: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(ppstr: Long, pstr: Long): Int
}

public actual fun aDsBuildEnumerator(padscontainer: MutPtr, ppenumvariant: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(padscontainer.rawAddress, ppenumvariant.rawAddress)

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr, dwobjecttypes: UInt, pvar: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(lpdwobjecttypes.rawAddress, dwobjecttypes.toInt(), pvar.rawAddress)

public actual fun aDsBuildVarArrayStr(lpppathnames: ConstPtr, dwpathnames: UInt, pvar: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(lpppathnames.rawAddress, dwpathnames.toInt(), pvar.rawAddress)

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr, pdwdestlen: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(szsrcdata.rawAddress, ppbdestdata.rawAddress, pdwdestlen.rawAddress)

public actual fun aDsEncodeBinaryData(pbsrcdata: MutPtr, dwsrclen: UInt, ppszdestdata: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(pbsrcdata.rawAddress, dwsrclen.toInt(), ppszdestdata.rawAddress)

public actual fun aDsEnumerateNext(penumvariant: MutPtr, celements: UInt, pvar: MutPtr, pcelementsfetched: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(penumvariant.rawAddress, celements.toInt(), pvar.rawAddress, pcelementsfetched.rawAddress)

public actual fun aDsFreeEnumerator(penumvariant: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(penumvariant.rawAddress)

public actual fun aDsGetLastError(lperror: MutPtr, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(lperror.rawAddress, lperrorbuf.rawAddress, dwerrorbuflen.toInt(), lpnamebuf.rawAddress, dwnamebuflen.toInt())

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(lpszpathname.rawAddress, riid.rawAddress, ppobject.rawAddress)

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr, ppobject: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(lpszpathname.rawAddress, lpszusername.rawAddress, lpszpassword.rawAddress, dwreserved.toInt(), riid.rawAddress, ppobject.rawAddress)

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(pwzattr.rawAddress, pwritableattrs.rawAddress)

public actual fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(pappthddataobj.rawAddress, pwzadsobjname.rawAddress, phnotifyobj.rawAddress)

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(hnotifyobj.rawAddress, pinitparams.rawAddress)

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(hnotifyobj.rawAddress, perror.rawAddress)

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(hnotifyobj.rawAddress, hpage.rawAddress)

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(hnotifyobj.rawAddress, hpage.rawAddress, ptztitle.rawAddress)

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(hnotifyobj.rawAddress, hpage.rawAddress)

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(dwerr.toInt(), pszerror.rawAddress, pszprovider.rawAddress)
}

public actual fun adsFreeAdsValues(padsvalues: MutPtr, dwnumvalues: UInt) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(padsvalues.rawAddress, dwnumvalues.toInt())
}

public actual fun adsTypeToPropVariant(padsvalues: MutPtr, dwnumvalues: UInt, pvariant: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(padsvalues.rawAddress, dwnumvalues.toInt(), pvariant.rawAddress)

public actual fun allocADsMem(cb: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(cb.toInt()))

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(pstr.rawAddress))

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(psecuritydescriptor.rawAddress, pvarsec.rawAddress, pszservername.rawAddress, username.rawAddress, password.rawAddress, dwflags.toInt())

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(hds.rawAddress, flags.toInt(), srcdomain.rawAddress, srcprincipal.rawAddress, srcdomaincontroller.rawAddress, srcdomaincreds.rawAddress, dstdomain.rawAddress, dstprincipal.rawAddress).toUInt()

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(hds.rawAddress, flags.toInt(), srcdomain.rawAddress, srcprincipal.rawAddress, srcdomaincontroller.rawAddress, srcdomaincreds.rawAddress, dstdomain.rawAddress, dstprincipal.rawAddress).toUInt()

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(computername.rawAddress, entrycount.toInt(), socketaddresses.rawAddress, sitenames.rawAddress).toUInt()

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(computername.rawAddress, entrycount.toInt(), socketaddresses.rawAddress, sitenames.rawAddress, subnetnames.rawAddress).toUInt()

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(computername.rawAddress, entrycount.toInt(), socketaddresses.rawAddress, sitenames.rawAddress, subnetnames.rawAddress).toUInt()

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(computername.rawAddress, entrycount.toInt(), socketaddresses.rawAddress, sitenames.rawAddress).toUInt()

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindA(domaincontrollername.rawAddress, dnsdomainname.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(servername.rawAddress, annotation.rawAddress, instanceguid.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, bindflags.toInt(), phds.rawAddress).toUInt()

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(servername.rawAddress, annotation.rawAddress, instanceguid.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, bindflags.toInt(), phds.rawAddress).toUInt()

public actual fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(sitename.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(sitename.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindW(domaincontrollername.rawAddress, dnsdomainname.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, bindflags.toInt(), phds.rawAddress).toUInt()

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, bindflags.toInt(), phds.rawAddress).toUInt()

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, phds: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(domaincontrollername.rawAddress, dnsdomainname.rawAddress, authidentity.rawAddress, serviceprincipalname.rawAddress, phds.rawAddress).toUInt()

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(hds.rawAddress, ctimeoutsecs.toInt()).toUInt()

public actual fun dsBrowseForContainerA(pinfo: MutPtr): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(pinfo.rawAddress)

public actual fun dsBrowseForContainerW(pinfo: MutPtr): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(pinfo.rawAddress)

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(serviceclass.rawAddress, servicename.rawAddress, pcspnlength.rawAddress, pszspn.rawAddress).toUInt()

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(serviceclass.rawAddress, servicename.rawAddress, pcspnlength.rawAddress, pszspn.rawAddress).toUInt()

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(hds.rawAddress, flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress, ppresult.rawAddress).toUInt()

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(hds.rawAddress, flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress, ppresult.rawAddress).toUInt()

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(pszspn.rawAddress, cspn.toInt(), pcserviceclass.rawAddress, serviceclass.rawAddress, pcservicename.rawAddress, servicename.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pinstanceport.rawAddress).toUInt()

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(pszspn.rawAddress, cspn.toInt(), pcserviceclass.rawAddress, serviceclass.rawAddress, pcservicename.rawAddress, servicename.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pinstanceport.rawAddress).toUInt()

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pportnumber: MutPtr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(pszspn.rawAddress, cspn.toInt(), pchostname.rawAddress, hostname.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pportnumber.rawAddress, pcdomainname.rawAddress, domainname.rawAddress, pcrealmname.rawAddress, realmname.rawAddress).toUInt()

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pcportname: MutPtr, portname: Pwstr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(pszspn.rawAddress, cspn.toInt(), pchostname.rawAddress, hostname.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pcportname.rawAddress, portname.rawAddress, pcdomainname.rawAddress, domainname.rawAddress, pcrealmname.rawAddress, realmname.rawAddress).toUInt()

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(pszspn.rawAddress, pcserviceclass.rawAddress, serviceclass.rawAddress, pcservicename.rawAddress, servicename.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pinstanceport.rawAddress).toUInt()

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(pszspn.rawAddress, pcserviceclass.rawAddress, serviceclass.rawAddress, pcservicename.rawAddress, servicename.rawAddress, pcinstancename.rawAddress, instancename.rawAddress, pinstanceport.rawAddress).toUInt()

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(pszrdn.rawAddress, cchrdn.toInt(), pguid.rawAddress, pedsmanglefor.rawAddress)

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(pszrdn.rawAddress, cchrdn.toInt(), pguid.rawAddress, pedsmanglefor.rawAddress)

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(servername.rawAddress, dnsdomainname.rawAddress, domainguid.rawAddress, dsaguid.rawAddress, dnshostname.rawAddress).toUInt()

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(servername.rawAddress, dnsdomainname.rawAddress, domainguid.rawAddress, dsaguid.rawAddress, dnshostname.rawAddress).toUInt()

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(servername.rawAddress, flags.toInt(), domains.rawAddress, domaincount.rawAddress).toUInt()

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(servername.rawAddress, flags.toInt(), domains.rawAddress, domaincount.rawAddress).toUInt()

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress)
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress)
}

public actual fun dsFreeNameResultA(presult: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(presult.rawAddress)
}

public actual fun dsFreeNameResultW(presult: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(presult.rawAddress)
}

public actual fun dsFreePasswordCredentials(authidentity: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(authidentity.rawAddress)
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(pguidmap.rawAddress)
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(pguidmap.rawAddress)
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(cspn.toInt(), rpszspn.rawAddress)
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(cspn.toInt(), rpszspn.rawAddress)
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(getdccontexthandle.rawAddress)
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(computername.rawAddress, domainname.rawAddress, domainguid.rawAddress, sitename.rawAddress, flags.toInt(), domaincontrollerinfo.rawAddress).toUInt()

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(computername.rawAddress, domainname.rawAddress, domainguid.rawAddress, sitename.rawAddress, flags.toInt(), domaincontrollerinfo.rawAddress).toUInt()

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(getdccontexthandle.rawAddress, sockaddresscount.rawAddress, sockaddresses.rawAddress, dnshostname.rawAddress).toUInt()

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(getdccontexthandle.rawAddress, sockaddresscount.rawAddress, sockaddresses.rawAddress, dnshostname.rawAddress).toUInt()

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(dnsname.rawAddress, optionflags.toInt(), sitename.rawAddress, domainguid.rawAddress, dnsforestname.rawAddress, dcflags.toInt(), retgetdccontext.rawAddress).toUInt()

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(dnsname.rawAddress, optionflags.toInt(), sitename.rawAddress, domainguid.rawAddress, dnsforestname.rawAddress, dcflags.toInt(), retgetdccontext.rawAddress).toUInt()

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(servername.rawAddress, entrycount.rawAddress, sitenames.rawAddress).toUInt()

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(servername.rawAddress, entrycount.rawAddress, sitenames.rawAddress).toUInt()

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(hds.rawAddress, domainname.rawAddress, infolevel.toInt(), pcout.rawAddress, ppinfo.rawAddress).toUInt()

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(hds.rawAddress, domainname.rawAddress, infolevel.toInt(), pcout.rawAddress, ppinfo.rawAddress).toUInt()

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(servername.rawAddress, trusteddomainname.rawAddress, flags.toInt(), foresttrustinfo.rawAddress).toUInt()

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(pszobjectclass.rawAddress, pszbuffer.rawAddress, cchbuffer.toInt())

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    MutPtr(WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(dwflags.toInt(), pszobjectclass.rawAddress, cximage, cyimage))

public actual fun dsGetRdnW(ppdn: MutPtr, pcdn: MutPtr, ppkey: MutPtr, pckey: MutPtr, ppval: MutPtr, pcval: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(ppdn.rawAddress, pcdn.rawAddress, ppkey.rawAddress, pckey.rawAddress, ppval.rawAddress, pcval.rawAddress).toUInt()

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(computername.rawAddress, sitename.rawAddress).toUInt()

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(computername.rawAddress, sitename.rawAddress).toUInt()

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(servicetype, serviceclass.rawAddress, servicename.rawAddress, instanceport.toShort(), cinstancenames.toShort(), pinstancenames.rawAddress, pinstanceports.rawAddress, pcspn.rawAddress, prpszspn.rawAddress).toUInt()

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(servicetype, serviceclass.rawAddress, servicename.rawAddress, instanceport.toShort(), cinstancenames.toShort(), pinstancenames.rawAddress, pinstanceports.rawAddress, pcspn.rawAddress, prpszspn.rawAddress).toUInt()

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(hds.rawAddress, flags.toInt(), srcprincipal.rawAddress, dstprincipal.rawAddress).toUInt()

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(hds.rawAddress, flags.toInt(), srcprincipal.rawAddress, dstprincipal.rawAddress).toUInt()

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(pszdn.rawAddress, edsmanglefor)

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(pszdn.rawAddress, edsmanglefor)

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(pszrdn.rawAddress, crdn.toInt(), edsmanglefordesired)

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(pszrdn.rawAddress, crdn.toInt(), edsmanglefordesired)

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(hds.rawAddress, site.rawAddress, ppdomains.rawAddress).toUInt()

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(hds.rawAddress, site.rawAddress, ppdomains.rawAddress).toUInt()

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(hds.rawAddress, server.rawAddress, ppinfo.rawAddress).toUInt()

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(hds.rawAddress, server.rawAddress, ppinfo.rawAddress).toUInt()

public actual fun dsListRolesA(hds: Handle, pproles: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(hds.rawAddress, pproles.rawAddress).toUInt()

public actual fun dsListRolesW(hds: Handle, pproles: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(hds.rawAddress, pproles.rawAddress).toUInt()

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(hds.rawAddress, domain.rawAddress, site.rawAddress, ppservers.rawAddress).toUInt()

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(hds.rawAddress, domain.rawAddress, site.rawAddress, ppservers.rawAddress).toUInt()

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(hds.rawAddress, site.rawAddress, ppservers.rawAddress).toUInt()

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(hds.rawAddress, site.rawAddress, ppservers.rawAddress).toUInt()

public actual fun dsListSitesA(hds: Handle, ppsites: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(hds.rawAddress, ppsites.rawAddress).toUInt()

public actual fun dsListSitesW(hds: Handle, ppsites: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(hds.rawAddress, ppsites.rawAddress).toUInt()

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(user.rawAddress, domain.rawAddress, password.rawAddress, pauthidentity.rawAddress).toUInt()

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(user.rawAddress, domain.rawAddress, password.rawAddress, pauthidentity.rawAddress).toUInt()

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(serviceclass.rawAddress, servicename.rawAddress, instancename.rawAddress, instanceport.toShort(), referrer.rawAddress, pcspnlength.rawAddress, pszspn.rawAddress).toUInt()

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(serviceclass.rawAddress, servicename.rawAddress, instancename.rawAddress, instanceport.toShort(), referrer.rawAddress, pcspnlength.rawAddress, pszspn.rawAddress).toUInt()

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(hds.rawAddress, cguids.toInt(), rguids.rawAddress, ppguidmap.rawAddress).toUInt()

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(hds.rawAddress, cguids.toInt(), rguids.rawAddress, ppguidmap.rawAddress).toUInt()

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr, oldforesttrustinfo: ConstPtr, mergedforesttrustinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(domainname.rawAddress, newforesttrustinfo.rawAddress, oldforesttrustinfo.rawAddress, mergedforesttrustinfo.rawAddress).toUInt()

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(hds.rawAddress, pszfromsite.rawAddress, rgsztosites.rawAddress, ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress).toUInt()

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(hds.rawAddress, pwszfromsite.rawAddress, rgwsztosites.rawAddress, ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress).toUInt()

public actual fun dsQuerySitesFree(rgsiteinfo: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(rgsiteinfo.rawAddress)
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress, pcquotedrdnvaluelength.rawAddress, psquotedrdnvalue.rawAddress).toUInt()

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress, pcquotedrdnvaluelength.rawAddress, psquotedrdnvalue.rawAddress).toUInt()

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(hds.rawAddress, domaindn.rawAddress).toUInt()

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(hds.rawAddress, domaindn.rawAddress).toUInt()

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(hds.rawAddress, serverdn.rawAddress, domaindn.rawAddress, flastdcindomain.rawAddress, fcommit).toUInt()

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(hds.rawAddress, serverdn.rawAddress, domaindn.rawAddress, flastdcindomain.rawAddress, fcommit).toUInt()

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(hds.rawAddress, namecontext.rawAddress, sourcedsadn.rawAddress, transportdn.rawAddress, sourcedsaaddress.rawAddress, pschedule.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(hds.rawAddress, namecontext.rawAddress, sourcedsadn.rawAddress, transportdn.rawAddress, sourcedsaaddress.rawAddress, pschedule.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(hds.rawAddress, taskid, dwflags.toInt()).toUInt()

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(hds.rawAddress, namecontext.rawAddress, dsasrc.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(hds.rawAddress, namecontext.rawAddress, dsasrc.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(infotype, pinfo.rawAddress)
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(hds.rawAddress, infotype, pszobject.rawAddress, puuidforsourcedsaobjguid.rawAddress, pszattributename.rawAddress, pszvalue.rawAddress, dwflags.toInt(), dwenumerationcontext.toInt(), ppinfo.rawAddress).toUInt()

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, ppinfo: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(hds.rawAddress, infotype, pszobject.rawAddress, puuidforsourcedsaobjguid.rawAddress, ppinfo.rawAddress).toUInt()

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(hds.rawAddress, namecontext.rawAddress, puuidsourcedsa.rawAddress, transportdn.rawAddress, sourcedsaaddress.rawAddress, pschedule.rawAddress, replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(hds.rawAddress, namecontext.rawAddress, puuidsourcedsa.rawAddress, transportdn.rawAddress, sourcedsaaddress.rawAddress, pschedule.rawAddress, replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(hds.rawAddress, namecontext.rawAddress, puuiddsasrc.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(hds.rawAddress, psznamecontext.rawAddress, ulflags.toInt(), pfncallback, pcallbackdata.rawAddress, perrors.rawAddress).toUInt()

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(hds.rawAddress, psznamecontext.rawAddress, ulflags.toInt(), pfncallback, pcallbackdata.rawAddress, perrors.rawAddress).toUInt()

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(hds.rawAddress, namecontext.rawAddress, puuiddsasrc.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(hds.rawAddress, namecontext.rawAddress, dsadest.rawAddress, puuiddsadest.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(hds.rawAddress, namecontext.rawAddress, dsadest.rawAddress, puuiddsadest.rawAddress, options.toInt()).toUInt()

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(hds.rawAddress, namecontext.rawAddress, puuiddsasrc.rawAddress, uloptions.toInt()).toUInt()

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(hds.rawAddress, namecontext.rawAddress, puuiddsasrc.rawAddress, uloptions.toInt()).toUInt()

public actual fun dsRoleFreeMemory(buffer: MutPtr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(buffer.rawAddress)
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(lpserver.rawAddress, infolevel, buffer.rawAddress).toUInt()

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(operation, serviceclass.rawAddress, userobjectdn.rawAddress).toUInt()

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(operation, serviceclass.rawAddress, userobjectdn.rawAddress).toUInt()

public actual fun dsUnBindA(phds: ConstPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(phds.rawAddress).toUInt()

public actual fun dsUnBindW(phds: ConstPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(phds.rawAddress).toUInt()

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress, pcunquotedrdnvaluelength.rawAddress, psunquotedrdnvalue.rawAddress).toUInt()

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress, pcunquotedrdnvaluelength.rawAddress, psunquotedrdnvalue.rawAddress).toUInt()

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(subnetname.rawAddress).toUInt()

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(subnetname.rawAddress).toUInt()

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(hds.rawAddress, operation, pszaccount.rawAddress, cspn.toInt(), rpszspn.rawAddress).toUInt()

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(hds.rawAddress, operation, pszaccount.rawAddress, cspn.toInt(), rpszspn.rawAddress).toUInt()

public actual fun freeADsMem(pmem: MutPtr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(pmem.rawAddress)

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(pstr.rawAddress)

public actual fun propVariantToAdsType(pvariant: MutPtr, dwnumvariant: UInt, ppadsvalues: MutPtr, pdwnumvalues: MutPtr): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(pvariant.rawAddress, dwnumvariant.toInt(), ppadsvalues.rawAddress, pdwnumvalues.rawAddress)

public actual fun reallocADsMem(poldmem: MutPtr, cbold: UInt, cbnew: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(poldmem.rawAddress, cbold.toInt(), cbnew.toInt()))

public actual fun reallocADsStr(ppstr: MutPtr, pstr: Pcwstr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(ppstr.rawAddress, pstr.rawAddress)

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant.Variant, ppsecuritydescriptor: MutPtr, pdwsdlength: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    0
