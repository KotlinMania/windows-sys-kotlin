package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(hrstatus: HRESULT, hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, hcursor: Foundation.HANDLE)
}

public fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQADsPathToFormatName", longArrayOf(lpwcsadspath, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQBeginTransaction(pptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQBeginTransaction", longArrayOf(pptransaction)).toInt()
}

public fun MQCloseCursor(hcursor: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCloseCursor", longArrayOf(Win32DynamicFfi.objectSlot(hcursor))).toInt()
}

public fun MQCloseQueue(hqueue: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCloseQueue", longArrayOf(hqueue)).toInt()
}

public fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCreateCursor", longArrayOf(hqueue, phcursor)).toInt()
}

public fun MQCreateQueue(psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQCreateQueue", longArrayOf(Win32DynamicFfi.objectSlot(psecuritydescriptor), pqueueprops, lpwcsformatname, lpdwformatnamelength)).toInt()
}

public fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQDeleteQueue", longArrayOf(lpwcsformatname)).toInt()
}

public fun MQFreeMemory(pvmemory: Long) {
    Win32DynamicFfi.invoke("mqrt.dll", "MQFreeMemory", longArrayOf(pvmemory))
}

public fun MQFreeSecurityContext(hsecuritycontext: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("mqrt.dll", "MQFreeSecurityContext", longArrayOf(Win32DynamicFfi.objectSlot(hsecuritycontext)))
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

public fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQGetQueueSecurity", longArrayOf(lpwcsformatname, requestedinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor), nlength.toLong(), lpnlengthneeded)).toInt()
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

public fun MQLocateEnd(henum: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQLocateEnd", longArrayOf(Win32DynamicFfi.objectSlot(henum))).toInt()
}

public fun MQLocateNext(henum: Foundation.HANDLE, pcprops: Long, apropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQLocateNext", longArrayOf(Win32DynamicFfi.objectSlot(henum), pcprops, apropvar)).toInt()
}

public fun MQMarkMessageRejected(hqueue: Foundation.HANDLE, ulllookupid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQMarkMessageRejected", longArrayOf(Win32DynamicFfi.objectSlot(hqueue), ulllookupid.toLong())).toInt()
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

public fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: Foundation.HANDLE, ptransaction: Long): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQReceiveMessage", longArrayOf(hsource, dwtimeout.toLong(), dwaction.toLong(), pmessageprops, lpoverlapped, Win32DynamicFfi.objectSlot(fnreceivecallback), Win32DynamicFfi.objectSlot(hcursor), ptransaction)).toInt()
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

public fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): HRESULT {
    return Win32DynamicFfi.invoke("mqrt.dll", "MQSetQueueSecurity", longArrayOf(lpwcsformatname, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toInt()
}
