package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface FnCallback {
    public operator fun invoke(hrstatus: HRESULT, hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, hcursor: HANDLE)
}

public fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQADsPathToFormatName", longArrayOf(lpwcsadspath, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQBeginTransaction(pptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQBeginTransaction", longArrayOf(pptransaction)).toInt()
}

public fun MQCloseCursor(hcursor: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCloseCursor", longArrayOf(hcursor)).toInt()
}

public fun MQCloseQueue(hqueue: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCloseQueue", longArrayOf(hqueue)).toInt()
}

public fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCreateCursor", longArrayOf(hqueue, phcursor)).toInt()
}

public fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCreateQueue", longArrayOf(psecuritydescriptor, pqueueprops, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQDeleteQueue", longArrayOf(lpwcsformatname)).toInt()
}

public fun MQFreeMemory(pvmemory: Long) {
    Win32DynamicFfi.invoke("mqrt.dll", "MQFreeMemory", longArrayOf(pvmemory))
}

public fun MQFreeSecurityContext(hsecuritycontext: HANDLE) {
    Win32DynamicFfi.invoke("mqrt.dll", "MQFreeSecurityContext", longArrayOf(hsecuritycontext))
}

public fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetMachineProperties", longArrayOf(lpwcsmachinename, pguidmachineid, pqmprops)).toInt()
}

public fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetOverlappedResult", longArrayOf(lpoverlapped)).toInt()
}

public fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetPrivateComputerInformation", longArrayOf(lpwcscomputername, pprivateprops)).toInt()
}

public fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetQueueProperties", longArrayOf(lpwcsformatname, pqueueprops)).toInt()
}

public fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetQueueSecurity", longArrayOf(lpwcsformatname, requestedinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetSecurityContext", longArrayOf(lpcertbuffer, dwcertbufferlength.toLong(), phsecuritycontext)).toInt()
}

public fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetSecurityContextEx", longArrayOf(lpcertbuffer, dwcertbufferlength.toLong(), phsecuritycontext)).toInt()
}

public fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQHandleToFormatName", longArrayOf(hqueue, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQInstanceToFormatName", longArrayOf(pguid, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQLocateBegin", longArrayOf(lpwcscontext, prestriction, pcolumns, psort, phenum)).toInt()
}

public fun MQLocateEnd(henum: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQLocateEnd", longArrayOf(henum)).toInt()
}

public fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQLocateNext", longArrayOf(henum, pcprops, apropvar)).toInt()
}

public fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQMarkMessageRejected", longArrayOf(hqueue, ulllookupid.toLong())).toInt()
}

public fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQMgmtAction", longArrayOf(pcomputername, pobjectname, paction)).toInt()
}

public fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQMgmtGetInfo", longArrayOf(pcomputername, pobjectname, pmgmtprops)).toInt()
}

public fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQMoveMessage", longArrayOf(hsourcequeue, hdestinationqueue, ulllookupid.toLong(), ptransaction)).toInt()
}

public fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQOpenQueue", longArrayOf(lpwcsformatname, dwaccess.toLong(), dwsharemode.toLong(), phqueue)).toInt()
}

public fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQPathNameToFormatName", longArrayOf(lpwcspathname, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQPurgeQueue(hqueue: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQPurgeQueue", longArrayOf(hqueue)).toInt()
}

public fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQReceiveMessage", longArrayOf(hsource, dwtimeout.toLong(), dwaction.toLong(), pmessageprops, lpoverlapped, Win32DynamicFfi.objectSlot(fnreceivecallback), hcursor, ptransaction)).toInt()
}

public fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQReceiveMessageByLookupId", longArrayOf(hsource, ulllookupid.toLong(), dwlookupaction.toLong(), pmessageprops, lpoverlapped, Win32DynamicFfi.objectSlot(fnreceivecallback), ptransaction)).toInt()
}

public fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQRegisterCertificate", longArrayOf(dwflags.toLong(), lpcertbuffer, dwcertbufferlength.toLong())).toInt()
}

public fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQSendMessage", longArrayOf(hdestinationqueue, pmessageprops, ptransaction)).toInt()
}

public fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQSetQueueProperties", longArrayOf(lpwcsformatname, pqueueprops)).toInt()
}

public fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQSetQueueSecurity", longArrayOf(lpwcsformatname, securityinformation.toLong(), psecuritydescriptor)).toInt()
}
