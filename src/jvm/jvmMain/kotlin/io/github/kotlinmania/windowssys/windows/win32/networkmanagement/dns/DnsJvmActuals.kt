@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32NetworkmanagementDnsJniBridge {
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
        val stream = WindowsWin32NetworkmanagementDnsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(cancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(pwszconnectionname: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(pnamelist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(pproxyinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(pproxyinfoex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(pproxylist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(pnamelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pwszconnectionname: Long, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(pwszconnectionname: Long, pproxylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(policyentrytag: Int, ppolicyentrylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsFree(pdata: Long, freetype: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(pcservers: Long, ppservers: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(proxyname: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(hostname: Long, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: Long, completioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(config: Int, flag: Int, pwsadaptername: Long, preserved: Long, pbuffer: Long, pbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(queryresults: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(precord1: Long, precord2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(precord: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(precordset: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(precordlist: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(hcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(pservicename: Long, phostname: Long, pip4: Long, pip6: Long, wport: Short, wpriority: Short, wweight: Short, dwpropertiescount: Int, keys: Long, values: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(porig: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(pinstance: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(cservers: Int, pservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int
}

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(credentialflags.toInt(), credentials.rawAddress, pcontext.rawAddress)

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(credentialflags.toInt(), credentials.rawAddress, pcontext.rawAddress)

public actual fun dnsCancelQuery(pcancelhandle: ConstPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(pcancelhandle.rawAddress)

public actual fun dnsCancelQueryRaw(cancelhandle: ConstPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(cancelhandle.rawAddress)

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag).toUInt()

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(pwszconnectionname.rawAddress, type).toUInt()

public actual fun dnsConnectionFreeNameList(pnamelist: MutPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(pnamelist.rawAddress)
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(pproxyinfo.rawAddress)
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(pproxyinfoex.rawAddress)
}

public actual fun dnsConnectionFreeProxyList(pproxylist: MutPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(pproxylist.rawAddress)
}

public actual fun dnsConnectionGetNameList(pnamelist: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(pnamelist.rawAddress).toUInt()

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(pwszconnectionname.rawAddress, type, pproxyinfo.rawAddress).toUInt()

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(pwszhosturl.rawAddress, pselectioncontext.rawAddress, dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pproxyinfoex.rawAddress).toUInt()

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.rawAddress, pselectioncontext.rawAddress, dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pwszconnectionname.rawAddress, pproxyinfoex.rawAddress).toUInt()

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(pwszconnectionname.rawAddress, pproxylist.rawAddress).toUInt()

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.rawAddress).toUInt()

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(pwszconnectionname.rawAddress, type, pproxyinfo.rawAddress).toUInt()

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(pconnectionifindexentries.rawAddress).toUInt()

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(pdnsbuffer.rawAddress, wmessagelength.toShort(), pprecord.rawAddress)

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(pdnsbuffer.rawAddress, wmessagelength.toShort(), pprecord.rawAddress)

public actual fun dnsFree(pdata: ConstPtr, freetype: DnsFreeType) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsFree(pdata.rawAddress, freetype)
}

public actual fun dnsFreeCustomServers(pcservers: MutPtr, ppservers: MutPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(pcservers.rawAddress, ppservers.rawAddress)
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(proxyname.rawAddress)
}

public actual fun dnsGetApplicationSettings(pcservers: MutPtr, ppdefaultservers: MutPtr, psettings: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(pcservers.rawAddress, ppdefaultservers.rawAddress, psettings.rawAddress).toUInt()

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr, defaultproxyinformation: MutPtr, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(hostname.rawAddress, proxyinformation.rawAddress, defaultproxyinformation.rawAddress, 0L, completioncontext.rawAddress).toUInt()

public actual fun dnsModifyRecordsInSetA(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(paddrecords.rawAddress, pdeleterecords.rawAddress, options.toInt(), hcredentials.rawAddress, pextralist.rawAddress, preserved.rawAddress)

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(paddrecords.rawAddress, pdeleterecords.rawAddress, options.toInt(), hcredentials.rawAddress, pextralist.rawAddress, preserved.rawAddress)

public actual fun dnsModifyRecordsInSetW(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(paddrecords.rawAddress, pdeleterecords.rawAddress, options.toInt(), hcredentials.rawAddress, pextralist.rawAddress, preserved.rawAddress)

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(pname1.rawAddress, pname2.rawAddress)

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(pname1.rawAddress, pname2.rawAddress)

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr, pbuffer: MutPtr, pbuflen: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(config, flag.toInt(), pwsadaptername.rawAddress, preserved.rawAddress, pbuffer.rawAddress, pbuflen.rawAddress)

public actual fun dnsQueryEx(pqueryrequest: ConstPtr, pqueryresults: MutPtr, pcancelhandle: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(pqueryrequest.rawAddress, pqueryresults.rawAddress, pcancelhandle.rawAddress)

public actual fun dnsQueryRaw(queryrequest: ConstPtr, cancelhandle: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(queryrequest.rawAddress, cancelhandle.rawAddress)

public actual fun dnsQueryRawResultFree(queryresults: ConstPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(queryresults.rawAddress)
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(pszname.rawAddress, wtype.toShort(), options.toInt(), pextra.rawAddress, ppqueryresults.rawAddress, preserved.rawAddress).toUInt()

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(pszname.rawAddress, wtype.toShort(), options.toInt(), pextra.rawAddress, ppqueryresults.rawAddress, preserved.rawAddress).toUInt()

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(pszname.rawAddress, wtype.toShort(), options.toInt(), pextra.rawAddress, ppqueryresults.rawAddress, preserved.rawAddress).toUInt()

public actual fun dnsRecordCompare(precord1: ConstPtr, precord2: ConstPtr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(precord1.rawAddress, precord2.rawAddress)

public actual fun dnsRecordCopyEx(precord: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr =
    MutPtr(WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(precord.rawAddress, charsetin, charsetout))

public actual fun dnsRecordSetCompare(prr1: MutPtr, prr2: MutPtr, ppdiff1: MutPtr, ppdiff2: MutPtr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(prr1.rawAddress, prr2.rawAddress, ppdiff1.rawAddress, ppdiff2.rawAddress)

public actual fun dnsRecordSetCopyEx(precordset: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr =
    MutPtr(WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(precordset.rawAddress, charsetin, charsetout))

public actual fun dnsRecordSetDetach(precordlist: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(precordlist.rawAddress))

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(hcontext.rawAddress)
}

public actual fun dnsReplaceRecordSetA(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(preplaceset.rawAddress, options.toInt(), hcontext.rawAddress, pextrainfo.rawAddress, preserved.rawAddress)

public actual fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(preplaceset.rawAddress, options.toInt(), hcontext.rawAddress, pextrainfo.rawAddress, preserved.rawAddress)

public actual fun dnsReplaceRecordSetW(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(preplaceset.rawAddress, options.toInt(), hcontext.rawAddress, pextrainfo.rawAddress, preserved.rawAddress)

public actual fun dnsServiceBrowse(prequest: ConstPtr, pcancel: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(prequest.rawAddress, pcancel.rawAddress)

public actual fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(pcancelhandle.rawAddress)

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr, pip6: ConstPtr, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr, values: ConstPtr): MutPtr =
    MutPtr(WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(pservicename.rawAddress, phostname.rawAddress, pip4.rawAddress, pip6.rawAddress, wport.toShort(), wpriority.toShort(), wweight.toShort(), dwpropertiescount.toInt(), keys.rawAddress, values.rawAddress))

public actual fun dnsServiceCopyInstance(porig: ConstPtr): MutPtr =
    MutPtr(WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(porig.rawAddress))

public actual fun dnsServiceDeRegister(prequest: ConstPtr, pcancel: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(prequest.rawAddress, pcancel.rawAddress).toUInt()

public actual fun dnsServiceFreeInstance(pinstance: ConstPtr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(pinstance.rawAddress)
}

public actual fun dnsServiceRegister(prequest: ConstPtr, pcancel: MutPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(prequest.rawAddress, pcancel.rawAddress).toUInt()

public actual fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(pcancelhandle.rawAddress).toUInt()

public actual fun dnsServiceResolve(prequest: ConstPtr, pcancel: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(prequest.rawAddress, pcancel.rawAddress)

public actual fun dnsServiceResolveCancel(pcancelhandle: ConstPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(pcancelhandle.rawAddress)

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr, psettings: ConstPtr): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(cservers.toInt(), pservers.rawAddress, psettings.rawAddress).toUInt()

public actual fun dnsStartMulticastQuery(pqueryrequest: ConstPtr, phandle: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(pqueryrequest.rawAddress, phandle.rawAddress)

public actual fun dnsStopMulticastQuery(phandle: MutPtr): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(phandle.rawAddress)

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(pszname.rawAddress, format)

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(pszname.rawAddress, format)

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(pszname.rawAddress, format)

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(pdnsbuffer.rawAddress, pdwbuffersize.rawAddress, pszname.rawAddress, wtype.toShort(), xid.toShort(), frecursiondesired)

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(pdnsbuffer.rawAddress, pdwbuffersize.rawAddress, pszname.rawAddress, wtype.toShort(), xid.toShort(), frecursiondesired)
