@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32NetworkmanagementSnmpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCancelMsg(session: Long, reqid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCleanupEx(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpClose(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpContextToStr(context: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCountVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCreatePdu(session: Long, pdu_type: Int, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCreateSession(hwnd: Long, wmsg: Int, fcallback: Long, lpclientdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpCreateVbl(session: Long, name: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpDeleteVb(vbl: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicatePdu(session: Long, pdu: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicateVbl(session: Long, vbl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpEntityToStr(entity: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpFreeContext(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpFreeDescriptor(syntax: Int, descriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpFreeEntity(entity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpFreePdu(pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpFreeVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetLastError(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetransmitMode(nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetTranslateMode(ntranslatemode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpGetVendorInfo(vendorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpListen(hentity: Long, lstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpListenEx(hentity: Long, lstatus: Int, nuseentityaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrClose(session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrCtl(session: Long, dwctlcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOidToStr(oid: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOpen(lpagentaddress: Long, lpagentcommunity: Long, ntimeout: Int, nretries: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrRequest(session: Long, requesttype: Byte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrStrToOid(string: Long, oid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpMgrTrapListen(phtrapavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpOidCompare(xoid: Long, yoid: Long, maxlen: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpOidCopy(srcoid: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpOidToStr(srcoid: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpOpen(hwnd: Long, wmsg: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetPort(hentity: Long, nport: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetransmitMode(nretransmitmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetry(hentity: Long, npolicyretry: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetTimeout(hentity: Long, npolicytimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetTranslateMode(ntranslatemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpStrToContext(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpStrToEntity(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpStrToOid(string: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSvcGetUptime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogLevel(nloglevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogType(nlogtype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyFree(pany: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilIdsToA(ids: Long, idlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemAlloc(nbytes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemFree(pmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemReAlloc(pmem: Long, nbytes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsFree(poctets: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCmp(poid1: Long, poid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidFree(poid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidToA(oid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintAsnAny(pany: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintOid(oid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindFree(pvb: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListFree(pvbl: Long)
}

public actual fun SnmpCancelMsg(session: Long, reqid: Int): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCancelMsg(session, reqid).toUInt()

public actual fun SnmpCleanup(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanup().toUInt()

public actual fun SnmpCleanupEx(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanupEx().toUInt()

public actual fun SnmpClose(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpClose(session).toUInt()

public actual fun SnmpContextToStr(context: Long, string: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpContextToStr(context, string).toUInt()

public actual fun SnmpCountVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCountVbl(vbl).toUInt()

public actual fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCreatePdu(session, pdu_type.toInt(), request_id, error_status, error_index, varbindlist)

public actual fun SnmpCreateSession(hwnd: HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateSession(hwnd, wmsg.toInt(), fcallback.toLong(), lpclientdata)

public actual fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateVbl(session, name, value)

public actual fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpDecodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc).toUInt()

public actual fun SnmpDeleteVb(vbl: Long, index: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpDeleteVb(vbl, index.toInt()).toUInt()

public actual fun SnmpDuplicatePdu(session: Long, pdu: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicatePdu(session, pdu)

public actual fun SnmpDuplicateVbl(session: Long, vbl: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicateVbl(session, vbl)

public actual fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpEncodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc).toUInt()

public actual fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpEntityToStr(entity, size.toInt(), string).toUInt()

public actual fun SnmpFreeContext(context: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeContext(context).toUInt()

public actual fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeDescriptor(syntax.toInt(), descriptor).toUInt()

public actual fun SnmpFreeEntity(entity: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeEntity(entity).toUInt()

public actual fun SnmpFreePdu(pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpFreePdu(pdu).toUInt()

public actual fun SnmpFreeVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeVbl(vbl).toUInt()

public actual fun SnmpGetLastError(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetLastError(session).toUInt()

public actual fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetPduData(pdu, pdu_type, request_id, error_status, error_index, varbindlist).toUInt()

public actual fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetransmitMode(nretransmitmode).toUInt()

public actual fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetry(hentity, npolicyretry, nactualretry).toUInt()

public actual fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTimeout(hentity, npolicytimeout, nactualtimeout).toUInt()

public actual fun SnmpGetTranslateMode(ntranslatemode: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTranslateMode(ntranslatemode).toUInt()

public actual fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVb(vbl, index.toInt(), name, value).toUInt()

public actual fun SnmpGetVendorInfo(vendorinfo: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVendorInfo(vendorinfo).toUInt()

public actual fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpListen(hentity, lstatus.toInt()).toUInt()

public actual fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpListenEx(hentity, lstatus.toInt(), nuseentityaddr.toInt()).toUInt()

public actual fun SnmpMgrClose(session: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrClose(session)

public actual fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrCtl(session, dwctlcode.toInt(), lpvinbuffer, cbinbuffer.toInt(), lpvoutbuffer, cboutbuffer.toInt(), lpcbbytesreturned)

public actual fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrap(enterprise, ipaddress, generictrap, specifictrap, timestamp, variablebindings)

public actual fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrapEx(enterprise, agentaddress, sourceaddress, generictrap, specifictrap, community, timestamp, variablebindings)

public actual fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOidToStr(oid, string)

public actual fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOpen(lpagentaddress, lpagentcommunity, ntimeout, nretries)

public actual fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrRequest(session, requesttype.toByte(), variablebindings, errorstatus, errorindex)

public actual fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrStrToOid(string, oid)

public actual fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrTrapListen(phtrapavailable)

public actual fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCompare(xoid, yoid, maxlen.toInt(), result).toUInt()

public actual fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCopy(srcoid, dstoid).toUInt()

public actual fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpOidToStr(srcoid, size.toInt(), string).toUInt()

public actual fun SnmpOpen(hwnd: HWND, wmsg: UInt): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpOpen(hwnd, wmsg.toInt())

public actual fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpRecvMsg(session, srcentity, dstentity, context, pdu).toUInt()

public actual fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpRegister(session, srcentity, dstentity, context, notification, state.toInt()).toUInt()

public actual fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSendMsg(session, srcentity, dstentity, context, pdu).toUInt()

public actual fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPduData(pdu, pdu_type, request_id, non_repeaters, max_repetitions, varbindlist).toUInt()

public actual fun SnmpSetPort(hentity: Long, nport: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPort(hentity, nport.toInt()).toUInt()

public actual fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetransmitMode(nretransmitmode.toInt()).toUInt()

public actual fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetry(hentity, npolicyretry.toInt()).toUInt()

public actual fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTimeout(hentity, npolicytimeout.toInt()).toUInt()

public actual fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTranslateMode(ntranslatemode.toInt()).toUInt()

public actual fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSetVb(vbl, index.toInt(), name, value).toUInt()

public actual fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpStartup(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode).toUInt()

public actual fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpStartupEx(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode).toUInt()

public actual fun SnmpStrToContext(session: Long, string: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToContext(session, string)

public actual fun SnmpStrToEntity(session: Long, string: PCSTR): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToEntity(session, string)

public actual fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToOid(string, dstoid).toUInt()

public actual fun SnmpSvcGetUptime(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcGetUptime().toUInt()

public actual fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogLevel(nloglevel)
}

public actual fun SnmpSvcSetLogType(nlogtype: Int) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogType(nlogtype)
}

public actual fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyCpy(panydst, panysrc)

public actual fun SnmpUtilAsnAnyFree(pany: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyFree(pany)
}

public actual fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR) {
}

public actual fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilIdsToA(ids, idlength.toInt())

public actual fun SnmpUtilMemAlloc(nbytes: UInt): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemAlloc(nbytes.toInt())

public actual fun SnmpUtilMemFree(pmem: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemFree(pmem)
}

public actual fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemReAlloc(pmem, nbytes.toInt())

public actual fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCmp(poctets1, poctets2)

public actual fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCpy(poctetsdst, poctetssrc)

public actual fun SnmpUtilOctetsFree(poctets: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsFree(poctets)
}

public actual fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsNCmp(poctets1, poctets2, nchars.toInt())

public actual fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidAppend(poiddst, poidsrc)

public actual fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCmp(poid1, poid2)

public actual fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCpy(poiddst, poidsrc)

public actual fun SnmpUtilOidFree(poid: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidFree(poid)
}

public actual fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidNCmp(poid1, poid2, nsubids.toInt())

public actual fun SnmpUtilOidToA(oid: Long): PSTR =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidToA(oid)

public actual fun SnmpUtilPrintAsnAny(pany: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintAsnAny(pany)
}

public actual fun SnmpUtilPrintOid(oid: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintOid(oid)
}

public actual fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindCpy(pvbdst, pvbsrc)

public actual fun SnmpUtilVarBindFree(pvb: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindFree(pvb)
}

public actual fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListCpy(pvbldst, pvblsrc)

public actual fun SnmpUtilVarBindListFree(pvbl: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListFree(pvbl)
}
