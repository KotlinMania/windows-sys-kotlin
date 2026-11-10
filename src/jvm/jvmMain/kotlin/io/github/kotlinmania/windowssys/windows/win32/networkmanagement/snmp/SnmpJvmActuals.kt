@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32NetworkmanagementSnmpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCancelMsg(session: Long, reqid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCleanupEx(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpClose(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpContextToStr(context: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCountVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCreatePdu(session: Long, pduType: Int, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCreateSession(hwnd: Long, wmsg: Int, fcallback: Long, lpclientdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpCreateVbl(session: Long, name: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpDeleteVb(vbl: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpDuplicatePdu(session: Long, pdu: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpDuplicateVbl(session: Long, vbl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpEntityToStr(entity: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpFreeContext(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpFreeDescriptor(syntax: Int, descriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpFreeEntity(entity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpFreePdu(pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpFreeVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetLastError(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetPduData(pdu: Long, pduType: Long, requestId: Long, errorStatus: Long, errorIndex: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetRetransmitMode(nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetTranslateMode(ntranslatemode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpGetVendorInfo(vendorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpListen(hentity: Long, lstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpListenEx(hentity: Long, lstatus: Int, nuseentityaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrClose(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrCtl(session: Long, dwctlcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrOidToStr(oid: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrOpen(lpagentaddress: Long, lpagentcommunity: Long, ntimeout: Int, nretries: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrRequest(session: Long, requesttype: Byte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrStrToOid(string: Long, oid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpMgrTrapListen(phtrapavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpOidCompare(xoid: Long, yoid: Long, maxlen: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpOidCopy(srcoid: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpOidToStr(srcoid: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpOpen(hwnd: Long, wmsg: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetPduData(pdu: Long, pduType: Long, requestId: Long, nonRepeaters: Long, maxRepetitions: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetPort(hentity: Long, nport: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetRetransmitMode(nretransmitmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetRetry(hentity: Long, npolicyretry: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetTimeout(hentity: Long, npolicytimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetTranslateMode(ntranslatemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpStrToContext(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpStrToEntity(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpStrToOid(string: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSvcGetUptime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogLevel(nloglevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogType(nlogtype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyFree(pany: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilDbgPrint(nloglevel: Int, szformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilIdsToA(ids: Long, idlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemAlloc(nbytes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemFree(pmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemReAlloc(pmem: Long, nbytes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsFree(poctets: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCmp(poid1: Long, poid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidFree(poid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidToA(oid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintAsnAny(pany: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintOid(oid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindFree(pvb: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListFree(pvbl: Long)
}

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCancelMsg(session, reqid).toUInt()

public actual fun snmpCleanup(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCleanup().toUInt()

public actual fun snmpCleanupEx(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCleanupEx().toUInt()

public actual fun snmpClose(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpClose(session).toUInt()

public actual fun snmpContextToStr(context: Long, string: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpContextToStr(context, (string?.value ?: 0L)).toUInt()

public actual fun snmpCountVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCountVbl(vbl).toUInt()

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCreatePdu(session, pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist)

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: COpaquePointer?): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCreateSession((hwnd?.value ?: 0L), wmsg.toInt(), 0L, (lpclientdata?.value ?: 0L))

public actual fun snmpCreateVbl(session: Long, name: COpaquePointer?, value: COpaquePointer?): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpCreateVbl(session, (name?.value ?: 0L), (value?.value ?: 0L))

public actual fun snmpDecodeMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?, msgbufdesc: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpDecodeMsg(session, (srcentity?.value ?: 0L), (dstentity?.value ?: 0L), (context?.value ?: 0L), (pdu?.value ?: 0L), (msgbufdesc?.value ?: 0L)).toUInt()

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpDeleteVb(vbl, index.toInt()).toUInt()

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicatePdu(session, pdu)

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicateVbl(session, vbl)

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpEncodeMsg(session, srcentity, dstentity, context, pdu, (msgbufdesc?.value ?: 0L)).toUInt()

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpEntityToStr(entity, size.toInt(), (string?.value ?: 0L)).toUInt()

public actual fun snmpFreeContext(context: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpFreeContext(context).toUInt()

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpFreeDescriptor(syntax.toInt(), (descriptor?.value ?: 0L)).toUInt()

public actual fun snmpFreeEntity(entity: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpFreeEntity(entity).toUInt()

public actual fun snmpFreePdu(pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpFreePdu(pdu).toUInt()

public actual fun snmpFreeVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpFreeVbl(vbl).toUInt()

public actual fun snmpGetLastError(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetLastError(session).toUInt()

public actual fun snmpGetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, errorStatus: COpaquePointer?, errorIndex: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetPduData(pdu, (pduType?.value ?: 0L), (requestId?.value ?: 0L), (errorStatus?.value ?: 0L), (errorIndex?.value ?: 0L), (varbindlist?.value ?: 0L)).toUInt()

public actual fun snmpGetRetransmitMode(nretransmitmode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetransmitMode((nretransmitmode?.value ?: 0L)).toUInt()

public actual fun snmpGetRetry(hentity: Long, npolicyretry: COpaquePointer?, nactualretry: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetry(hentity, (npolicyretry?.value ?: 0L), (nactualretry?.value ?: 0L)).toUInt()

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: COpaquePointer?, nactualtimeout: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetTimeout(hentity, (npolicytimeout?.value ?: 0L), (nactualtimeout?.value ?: 0L)).toUInt()

public actual fun snmpGetTranslateMode(ntranslatemode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetTranslateMode((ntranslatemode?.value ?: 0L)).toUInt()

public actual fun snmpGetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetVb(vbl, index.toInt(), (name?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun snmpGetVendorInfo(vendorinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpGetVendorInfo((vendorinfo?.value ?: 0L)).toUInt()

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpListen(hentity, lstatus.toInt()).toUInt()

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpListenEx(hentity, lstatus.toInt(), nuseentityaddr.toInt()).toUInt()

public actual fun snmpMgrClose(session: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrClose((session?.value ?: 0L))

public actual fun snmpMgrCtl(session: COpaquePointer?, dwctlcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrCtl((session?.value ?: 0L), dwctlcode.toInt(), (lpvinbuffer?.value ?: 0L), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L))

public actual fun snmpMgrGetTrap(enterprise: COpaquePointer?, ipaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrap((enterprise?.value ?: 0L), (ipaddress?.value ?: 0L), (generictrap?.value ?: 0L), (specifictrap?.value ?: 0L), (timestamp?.value ?: 0L), (variablebindings?.value ?: 0L))

public actual fun snmpMgrGetTrapEx(enterprise: COpaquePointer?, agentaddress: COpaquePointer?, sourceaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, community: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrapEx((enterprise?.value ?: 0L), (agentaddress?.value ?: 0L), (sourceaddress?.value ?: 0L), (generictrap?.value ?: 0L), (specifictrap?.value ?: 0L), (community?.value ?: 0L), (timestamp?.value ?: 0L), (variablebindings?.value ?: 0L))

public actual fun snmpMgrOidToStr(oid: COpaquePointer?, string: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOidToStr((oid?.value ?: 0L), (string?.value ?: 0L))

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): COpaquePointer? =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOpen((lpagentaddress?.value ?: 0L), (lpagentcommunity?.value ?: 0L), ntimeout, nretries).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snmpMgrRequest(session: COpaquePointer?, requesttype: UByte, variablebindings: COpaquePointer?, errorstatus: COpaquePointer?, errorindex: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrRequest((session?.value ?: 0L), requesttype.toByte(), (variablebindings?.value ?: 0L), (errorstatus?.value ?: 0L), (errorindex?.value ?: 0L))

public actual fun snmpMgrStrToOid(string: Pcstr, oid: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrStrToOid((string?.value ?: 0L), (oid?.value ?: 0L))

public actual fun snmpMgrTrapListen(phtrapavailable: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpMgrTrapListen((phtrapavailable?.value ?: 0L))

public actual fun snmpOidCompare(xoid: COpaquePointer?, yoid: COpaquePointer?, maxlen: UInt, result: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpOidCompare((xoid?.value ?: 0L), (yoid?.value ?: 0L), maxlen.toInt(), (result?.value ?: 0L)).toUInt()

public actual fun snmpOidCopy(srcoid: COpaquePointer?, dstoid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpOidCopy((srcoid?.value ?: 0L), (dstoid?.value ?: 0L)).toUInt()

public actual fun snmpOidToStr(srcoid: COpaquePointer?, size: UInt, string: Pstr): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpOidToStr((srcoid?.value ?: 0L), size.toInt(), (string?.value ?: 0L)).toUInt()

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpOpen((hwnd?.value ?: 0L), wmsg.toInt())

public actual fun snmpRecvMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpRecvMsg(session, (srcentity?.value ?: 0L), (dstentity?.value ?: 0L), (context?.value ?: 0L), (pdu?.value ?: 0L)).toUInt()

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: COpaquePointer?, state: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpRegister(session, srcentity, dstentity, context, (notification?.value ?: 0L), state.toInt()).toUInt()

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSendMsg(session, srcentity, dstentity, context, pdu).toUInt()

public actual fun snmpSetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, nonRepeaters: COpaquePointer?, maxRepetitions: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetPduData(pdu, (pduType?.value ?: 0L), (requestId?.value ?: 0L), (nonRepeaters?.value ?: 0L), (maxRepetitions?.value ?: 0L), (varbindlist?.value ?: 0L)).toUInt()

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetPort(hentity, nport.toInt()).toUInt()

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetransmitMode(nretransmitmode.toInt()).toUInt()

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetry(hentity, npolicyretry.toInt()).toUInt()

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetTimeout(hentity, npolicytimeout.toInt()).toUInt()

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetTranslateMode(ntranslatemode.toInt()).toUInt()

public actual fun snmpSetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSetVb(vbl, index.toInt(), (name?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun snmpStartup(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpStartup((nmajorversion?.value ?: 0L), (nminorversion?.value ?: 0L), (nlevel?.value ?: 0L), (ntranslatemode?.value ?: 0L), (nretransmitmode?.value ?: 0L)).toUInt()

public actual fun snmpStartupEx(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpStartupEx((nmajorversion?.value ?: 0L), (nminorversion?.value ?: 0L), (nlevel?.value ?: 0L), (ntranslatemode?.value ?: 0L), (nretransmitmode?.value ?: 0L)).toUInt()

public actual fun snmpStrToContext(session: Long, string: COpaquePointer?): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpStrToContext(session, (string?.value ?: 0L))

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpStrToEntity(session, (string?.value ?: 0L))

public actual fun snmpStrToOid(string: Pcstr, dstoid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpStrToOid((string?.value ?: 0L), (dstoid?.value ?: 0L)).toUInt()

public actual fun snmpSvcGetUptime(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSvcGetUptime().toUInt()

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogLevel(nloglevel)
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogType(nlogtype)
}

public actual fun snmpUtilAsnAnyCpy(panydst: COpaquePointer?, panysrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyCpy((panydst?.value ?: 0L), (panysrc?.value ?: 0L))

public actual fun snmpUtilAsnAnyFree(pany: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyFree((pany?.value ?: 0L))
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilDbgPrint(nloglevel, (szformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun snmpUtilIdsToA(ids: COpaquePointer?, idlength: UInt): Pstr =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilIdsToA((ids?.value ?: 0L), idlength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snmpUtilMemAlloc(nbytes: UInt): COpaquePointer? =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemAlloc(nbytes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snmpUtilMemFree(pmem: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemFree((pmem?.value ?: 0L))
}

public actual fun snmpUtilMemReAlloc(pmem: COpaquePointer?, nbytes: UInt): COpaquePointer? =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemReAlloc((pmem?.value ?: 0L), nbytes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snmpUtilOctetsCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCmp((poctets1?.value ?: 0L), (poctets2?.value ?: 0L))

public actual fun snmpUtilOctetsCpy(poctetsdst: COpaquePointer?, poctetssrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCpy((poctetsdst?.value ?: 0L), (poctetssrc?.value ?: 0L))

public actual fun snmpUtilOctetsFree(poctets: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsFree((poctets?.value ?: 0L))
}

public actual fun snmpUtilOctetsNCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?, nchars: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsNCmp((poctets1?.value ?: 0L), (poctets2?.value ?: 0L), nchars.toInt())

public actual fun snmpUtilOidAppend(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidAppend((poiddst?.value ?: 0L), (poidsrc?.value ?: 0L))

public actual fun snmpUtilOidCmp(poid1: COpaquePointer?, poid2: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCmp((poid1?.value ?: 0L), (poid2?.value ?: 0L))

public actual fun snmpUtilOidCpy(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCpy((poiddst?.value ?: 0L), (poidsrc?.value ?: 0L))

public actual fun snmpUtilOidFree(poid: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidFree((poid?.value ?: 0L))
}

public actual fun snmpUtilOidNCmp(poid1: COpaquePointer?, poid2: COpaquePointer?, nsubids: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidNCmp((poid1?.value ?: 0L), (poid2?.value ?: 0L), nsubids.toInt())

public actual fun snmpUtilOidToA(oid: COpaquePointer?): Pstr =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidToA((oid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snmpUtilPrintAsnAny(pany: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintAsnAny((pany?.value ?: 0L))
}

public actual fun snmpUtilPrintOid(oid: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintOid((oid?.value ?: 0L))
}

public actual fun snmpUtilVarBindCpy(pvbdst: COpaquePointer?, pvbsrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindCpy((pvbdst?.value ?: 0L), (pvbsrc?.value ?: 0L))

public actual fun snmpUtilVarBindFree(pvb: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindFree((pvb?.value ?: 0L))
}

public actual fun snmpUtilVarBindListCpy(pvbldst: COpaquePointer?, pvblsrc: COpaquePointer?): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListCpy((pvbldst?.value ?: 0L), (pvblsrc?.value ?: 0L))

public actual fun snmpUtilVarBindListFree(pvbl: COpaquePointer?) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListFree((pvbl?.value ?: 0L))
}
