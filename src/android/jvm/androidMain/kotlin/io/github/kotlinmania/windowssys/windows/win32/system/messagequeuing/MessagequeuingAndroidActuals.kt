@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWin32SystemMessagequeuingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(lpwcsadspath: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(pptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQCloseCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQCloseQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQCreateCursor(hqueue: Long, phcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQCreateQueue(psecuritydescriptor: Long, pqueueprops: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(lpwcsformatname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQFreeMemory(pvmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(hsecuritycontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(lpwcsmachinename: Long, pguidmachineid: Long, pqmprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(lpwcscomputername: Long, pprivateprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(lpwcsformatname: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(hqueue: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(pguid: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQLocateBegin(lpwcscontext: Long, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQLocateEnd(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQLocateNext(henum: Long, pcprops: Long, apropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(hqueue: Long, ulllookupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQMgmtAction(pcomputername: Long, pobjectname: Long, paction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(pcomputername: Long, pobjectname: Long, pmgmtprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQOpenQueue(lpwcsformatname: Long, dwaccess: Int, dwsharemode: Int, phqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(lpwcspathname: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(hsource: Long, dwtimeout: Int, dwaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, hcursor: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(hsource: Long, ulllookupid: Long, dwlookupaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(dwflags: Int, lpcertbuffer: Long, dwcertbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(lpwcsformatname: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(lpwcsadspath, lpwcsformatname, lpdwformatnamelength)

public actual fun MQBeginTransaction(pptransaction: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(pptransaction)

public actual fun MQCloseCursor(hcursor: HANDLE): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQCloseCursor(hcursor)

public actual fun MQCloseQueue(hqueue: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQCloseQueue(hqueue)

public actual fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQCreateCursor(hqueue, phcursor)

public actual fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQCreateQueue(psecuritydescriptor, pqueueprops, lpwcsformatname, lpdwformatnamelength)

public actual fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(lpwcsformatname)

public actual fun MQFreeMemory(pvmemory: Long) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQFreeMemory(pvmemory)
}

public actual fun MQFreeSecurityContext(hsecuritycontext: HANDLE) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(hsecuritycontext)
}

public actual fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(lpwcsmachinename, pguidmachineid, pqmprops)

public actual fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(lpoverlapped)

public actual fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(lpwcscomputername, pprivateprops)

public actual fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(lpwcsformatname, pqueueprops)

public actual fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(lpwcsformatname, requestedinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(lpcertbuffer, dwcertbufferlength.toInt(), phsecuritycontext)

public actual fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(lpcertbuffer, dwcertbufferlength.toInt(), phsecuritycontext)

public actual fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(hqueue, lpwcsformatname, lpdwformatnamelength)

public actual fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(pguid, lpwcsformatname, lpdwformatnamelength)

public actual fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQLocateBegin(lpwcscontext, prestriction, pcolumns, psort, phenum)

public actual fun MQLocateEnd(henum: HANDLE): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQLocateEnd(henum)

public actual fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQLocateNext(henum, pcprops, apropvar)

public actual fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(hqueue, ulllookupid.toLong())

public actual fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQMgmtAction(pcomputername, pobjectname, paction)

public actual fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(pcomputername, pobjectname, pmgmtprops)

public actual fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid.toLong(), ptransaction)

public actual fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQOpenQueue(lpwcsformatname, dwaccess.toInt(), dwsharemode.toInt(), phqueue)

public actual fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(lpwcspathname, lpwcsformatname, lpdwformatnamelength)

public actual fun MQPurgeQueue(hqueue: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(hqueue)

public actual fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(hsource, dwtimeout.toInt(), dwaction.toInt(), pmessageprops, lpoverlapped, fnreceivecallback.toLong(), hcursor, ptransaction)

public actual fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(hsource, ulllookupid.toLong(), dwlookupaction.toInt(), pmessageprops, lpoverlapped, fnreceivecallback.toLong(), ptransaction)

public actual fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(dwflags.toInt(), lpcertbuffer, dwcertbufferlength.toInt())

public actual fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQSendMessage(hdestinationqueue, pmessageprops, ptransaction)

public actual fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(lpwcsformatname, pqueueprops)

public actual fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(lpwcsformatname, securityinformation.toInt(), psecuritydescriptor)
