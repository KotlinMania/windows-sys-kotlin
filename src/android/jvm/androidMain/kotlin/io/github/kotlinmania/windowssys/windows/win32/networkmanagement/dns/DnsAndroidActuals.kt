@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32NetworkmanagementDnsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw(cancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(policyentrytag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo(pwszconnectionname: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList(pnamelist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo(pproxyinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx(pproxyinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList(pproxylist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList(pnamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pwszconnectionname: Long, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList(pwszconnectionname: Long, pproxylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(policyentrytag: Int, ppolicyentrylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsFree(pdata: Long, freetype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers(pcservers: Long, ppservers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName(proxyname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation(hostname: Long, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: Long, completioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(config: Int, flag: Int, pwsadaptername: Long, preserved: Long, pbuffer: Long, pbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree(queryresults: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryA(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsQueryW(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare(precord1: Long, precord2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx(precord: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx(precordset: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach(precordlist: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle(hcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance(pservicename: Long, phostname: Long, pip4: Long, pip6: Long, wport: Short, wpriority: Short, wweight: Short, dwpropertiescount: Int, keys: Long, values: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance(porig: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance(pinstance: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(cservers: Int, pservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery(phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int
}

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(credentialflags.toInt(), (credentials?.value ?: 0L), (pcontext?.value ?: 0L))

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(credentialflags.toInt(), (credentials?.value ?: 0L), (pcontext?.value ?: 0L))

public actual fun dnsCancelQuery(pcancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery((pcancelhandle?.value ?: 0L))

public actual fun dnsCancelQueryRaw(cancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw((cancelhandle?.value ?: 0L))

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(policyentrytag).toUInt()

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo((pwszconnectionname?.value ?: 0L), type).toUInt()

public actual fun dnsConnectionFreeNameList(pnamelist: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList((pnamelist?.value ?: 0L))
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo((pproxyinfo?.value ?: 0L))
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx((pproxyinfoex?.value ?: 0L))
}

public actual fun dnsConnectionFreeProxyList(pproxylist: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList((pproxylist?.value ?: 0L))
}

public actual fun dnsConnectionGetNameList(pnamelist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList((pnamelist?.value ?: 0L)).toUInt()

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo((pwszconnectionname?.value ?: 0L), type, (pproxyinfo?.value ?: 0L)).toUInt()

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl((pwszhosturl?.value ?: 0L), (pselectioncontext?.value ?: 0L), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), (pproxyinfoex?.value ?: 0L)).toUInt()

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx((pwszhosturl?.value ?: 0L), (pselectioncontext?.value ?: 0L), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), (pwszconnectionname?.value ?: 0L), (pproxyinfoex?.value ?: 0L)).toUInt()

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList((pwszconnectionname?.value ?: 0L), (pproxylist?.value ?: 0L)).toUInt()

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(policyentrytag, (ppolicyentrylist?.value ?: 0L)).toUInt()

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo((pwszconnectionname?.value ?: 0L), type, (pproxyinfo?.value ?: 0L)).toUInt()

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable((pconnectionifindexentries?.value ?: 0L)).toUInt()

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8((pdnsbuffer?.value ?: 0L), wmessagelength.toShort(), (pprecord?.value ?: 0L))

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW((pdnsbuffer?.value ?: 0L), wmessagelength.toShort(), (pprecord?.value ?: 0L))

public actual fun dnsFree(pdata: COpaquePointer?, freetype: DnsFreeType) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsFree((pdata?.value ?: 0L), freetype)
}

public actual fun dnsFreeCustomServers(pcservers: COpaquePointer?, ppservers: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers((pcservers?.value ?: 0L), (ppservers?.value ?: 0L))
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName((proxyname?.value ?: 0L))
}

public actual fun dnsGetApplicationSettings(pcservers: COpaquePointer?, ppdefaultservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings((pcservers?.value ?: 0L), (ppdefaultservers?.value ?: 0L), (psettings?.value ?: 0L)).toUInt()

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: COpaquePointer?, defaultproxyinformation: COpaquePointer?, completionroutine: DnsProxyCompletionRoutine, completioncontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation((hostname?.value ?: 0L), (proxyinformation?.value ?: 0L), (defaultproxyinformation?.value ?: 0L), 0L, (completioncontext?.value ?: 0L)).toUInt()

public actual fun dnsModifyRecordsInSetA(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA((paddrecords?.value ?: 0L), (pdeleterecords?.value ?: 0L), options.toInt(), (hcredentials?.value ?: 0L), (pextralist?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8((paddrecords?.value ?: 0L), (pdeleterecords?.value ?: 0L), options.toInt(), (hcredentials?.value ?: 0L), (pextralist?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsModifyRecordsInSetW(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW((paddrecords?.value ?: 0L), (pdeleterecords?.value ?: 0L), options.toInt(), (hcredentials?.value ?: 0L), (pextralist?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA((pname1?.value ?: 0L), (pname2?.value ?: 0L))

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW((pname1?.value ?: 0L), (pname2?.value ?: 0L))

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: COpaquePointer?, pbuffer: COpaquePointer?, pbuflen: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(config, flag.toInt(), (pwsadaptername?.value ?: 0L), (preserved?.value ?: 0L), (pbuffer?.value ?: 0L), (pbuflen?.value ?: 0L))

public actual fun dnsQueryEx(pqueryrequest: COpaquePointer?, pqueryresults: COpaquePointer?, pcancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryEx((pqueryrequest?.value ?: 0L), (pqueryresults?.value ?: 0L), (pcancelhandle?.value ?: 0L))

public actual fun dnsQueryRaw(queryrequest: COpaquePointer?, cancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw((queryrequest?.value ?: 0L), (cancelhandle?.value ?: 0L))

public actual fun dnsQueryRawResultFree(queryresults: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree((queryresults?.value ?: 0L))
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryA((pszname?.value ?: 0L), wtype.toShort(), options.toInt(), (pextra?.value ?: 0L), (ppqueryresults?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8((pszname?.value ?: 0L), wtype.toShort(), options.toInt(), (pextra?.value ?: 0L), (ppqueryresults?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsQueryW((pszname?.value ?: 0L), wtype.toShort(), options.toInt(), (pextra?.value ?: 0L), (ppqueryresults?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun dnsRecordCompare(precord1: COpaquePointer?, precord2: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare((precord1?.value ?: 0L), (precord2?.value ?: 0L))

public actual fun dnsRecordCopyEx(precord: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx((precord?.value ?: 0L), charsetin, charsetout).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dnsRecordSetCompare(prr1: COpaquePointer?, prr2: COpaquePointer?, ppdiff1: COpaquePointer?, ppdiff2: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare((prr1?.value ?: 0L), (prr2?.value ?: 0L), (ppdiff1?.value ?: 0L), (ppdiff2?.value ?: 0L))

public actual fun dnsRecordSetCopyEx(precordset: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx((precordset?.value ?: 0L), charsetin, charsetout).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dnsRecordSetDetach(precordlist: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach((precordlist?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle((hcontext?.value ?: 0L))
}

public actual fun dnsReplaceRecordSetA(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA((preplaceset?.value ?: 0L), options.toInt(), (hcontext?.value ?: 0L), (pextrainfo?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsReplaceRecordSetUTF8(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8((preplaceset?.value ?: 0L), options.toInt(), (hcontext?.value ?: 0L), (pextrainfo?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsReplaceRecordSetW(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW((preplaceset?.value ?: 0L), options.toInt(), (hcontext?.value ?: 0L), (pextrainfo?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun dnsServiceBrowse(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse((prequest?.value ?: 0L), (pcancel?.value ?: 0L))

public actual fun dnsServiceBrowseCancel(pcancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel((pcancelhandle?.value ?: 0L))

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: COpaquePointer?, pip6: COpaquePointer?, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: COpaquePointer?, values: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance((pservicename?.value ?: 0L), (phostname?.value ?: 0L), (pip4?.value ?: 0L), (pip6?.value ?: 0L), wport.toShort(), wpriority.toShort(), wweight.toShort(), dwpropertiescount.toInt(), (keys?.value ?: 0L), (values?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dnsServiceCopyInstance(porig: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance((porig?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dnsServiceDeRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister((prequest?.value ?: 0L), (pcancel?.value ?: 0L)).toUInt()

public actual fun dnsServiceFreeInstance(pinstance: COpaquePointer?) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance((pinstance?.value ?: 0L))
}

public actual fun dnsServiceRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister((prequest?.value ?: 0L), (pcancel?.value ?: 0L)).toUInt()

public actual fun dnsServiceRegisterCancel(pcancelhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel((pcancelhandle?.value ?: 0L)).toUInt()

public actual fun dnsServiceResolve(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve((prequest?.value ?: 0L), (pcancel?.value ?: 0L))

public actual fun dnsServiceResolveCancel(pcancelhandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel((pcancelhandle?.value ?: 0L))

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(cservers.toInt(), (pservers?.value ?: 0L), (psettings?.value ?: 0L)).toUInt()

public actual fun dnsStartMulticastQuery(pqueryrequest: COpaquePointer?, phandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery((pqueryrequest?.value ?: 0L), (phandle?.value ?: 0L))

public actual fun dnsStopMulticastQuery(phandle: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery((phandle?.value ?: 0L))

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA((pszname?.value ?: 0L), format)

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8((pszname?.value ?: 0L), format)

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW((pszname?.value ?: 0L), format)

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8((pdnsbuffer?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pszname?.value ?: 0L), wtype.toShort(), xid.toShort(), frecursiondesired)

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW((pdnsbuffer?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pszname?.value ?: 0L), wtype.toShort(), xid.toShort(), frecursiondesired)
