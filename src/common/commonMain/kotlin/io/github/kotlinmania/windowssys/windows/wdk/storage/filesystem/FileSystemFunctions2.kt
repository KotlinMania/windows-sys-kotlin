package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback1 {
    public operator fun invoke(handle: Long, callbackdata: Long)
}

public fun RtlNtStatusToDosErrorNoTeb(status: Win32.Foundation.NTSTATUS): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNtStatusToDosErrorNoTeb", longArrayOf(Win32DynamicFfi.objectSlot(status))).toUInt()
}

public fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlOemStringToCountedUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlOemStringToUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlOemToUnicodeN", longArrayOf(unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, oemstring, bytesinoemstring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlPrefixString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryPackageIdentity", longArrayOf(tokenobject, packagefullname, packagesize, appid, appidsize, packaged))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryPackageIdentityEx", longArrayOf(tokenobject, packagefullname, packagesize, appid, appidsize, dynamicid, flags))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryProcessPlaceholderCompatibilityMode", longArrayOf()).toByte()
}

public fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryThreadPlaceholderCompatibilityMode", longArrayOf()).toByte()
}

public fun RtlRandom(seed: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRandom", longArrayOf(seed)).toUInt()
}

public fun RtlRandomEx(seed: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRandomEx", longArrayOf(seed)).toUInt()
}

public fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlRemoveUnicodePrefix", longArrayOf(prefixtable, prefixtableentry))
}

public fun RtlReplaceSidInSd(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, oldsid: Win32.Security.PSID, newsid: Win32.Security.PSID, numchanges: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlReplaceSidInSd", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(oldsid), Win32DynamicFfi.objectSlot(newsid), numchanges))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlReserveChunk", longArrayOf(compressionformat.toLong(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSecondsSince1970ToTime", longArrayOf(elapsedseconds.toLong(), time))
}

public fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSecondsSince1980ToTime", longArrayOf(elapsedseconds.toLong(), time))
}

public fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: Win32.Security.PSID, ownersize: Long, primarygroup: Win32.Security.PSID, primarygroupsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSelfRelativeToAbsoluteSD", longArrayOf(Win32DynamicFfi.objectSlot(selfrelativesecuritydescriptor), Win32DynamicFfi.objectSlot(absolutesecuritydescriptor), absolutesecuritydescriptorsize, dacl, daclsize, sacl, saclsize, Win32DynamicFfi.objectSlot(owner), ownersize, Win32DynamicFfi.objectSlot(primarygroup), primarygroupsize))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlSetGroupSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, group: Win32.Security.PSID, groupdefaulted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSetGroupSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(group), if (groupdefaulted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlSetOwnerSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, owner: Win32.Security.PSID, ownerdefaulted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSetOwnerSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(owner), if (ownerdefaulted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetProcessPlaceholderCompatibilityMode", longArrayOf(mode.toLong())).toByte()
}

public fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetThreadPlaceholderCompatibilityMode", longArrayOf(mode.toLong())).toByte()
}

public fun RtlSubAuthorityCountSid(sid: Win32.Security.PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubAuthorityCountSid", longArrayOf(Win32DynamicFfi.objectSlot(sid)))
}

public fun RtlSubAuthoritySid(sid: Win32.Security.PSID, subauthority: UInt): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubAuthoritySid", longArrayOf(Win32DynamicFfi.objectSlot(sid), subauthority.toLong()))
}

public fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlTimeToSecondsSince1980", longArrayOf(time, elapsedseconds))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToCountedOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToCustomCPN", longArrayOf(customcp, customcpstring, maxbytesincustomcpstring.toLong(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToMultiByteN", longArrayOf(multibytestring, maxbytesinmultibytestring.toLong(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToOemN", longArrayOf(oemstring, maxbytesinoemstring.toLong(), bytesinoemstring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeStringToCountedOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeStringToOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToCustomCPN", longArrayOf(customcp, customcpstring, maxbytesincustomcpstring.toLong(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToMultiByteN", longArrayOf(multibytestring, maxbytesinmultibytestring.toLong(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToOemN", longArrayOf(oemstring, maxbytesinoemstring.toLong(), bytesinoemstring, unicodestring, bytesinunicodestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlValidSid(sid: Win32.Security.PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidSid", longArrayOf(Win32DynamicFfi.objectSlot(sid)))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlValidateUnicodeString(flags: UInt, string: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlValidateUnicodeString", longArrayOf(flags.toLong(), string))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxOemStringToUnicodeSize", longArrayOf(oemstring)).toUInt()
}

public fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxUnicodeStringToOemSize", longArrayOf(unicodestring)).toUInt()
}

public fun SeAccessCheckFromState(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheckFromState", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), primarytokeninformation, clienttokeninformation, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAccessCheckFromStateEx(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheckFromStateEx", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), primarytoken, clienttoken, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustAccessStateForAccessConstraints", longArrayOf(objecttype, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate))
}

public fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustAccessStateForTrustLabel", longArrayOf(objecttype, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate))
}

public fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: Win32.Security.PSECURITY_DESCRIPTOR, proposeddescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustObjectSecurity", longArrayOf(objectname, Win32DynamicFfi.objectSlot(originaldescriptor), Win32DynamicFfi.objectSlot(proposeddescriptor), subjectsecuritycontext, adjusteddescriptor, applyadjusteddescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun SeAppendPrivileges(accessstate: Long, privileges: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAppendPrivileges", longArrayOf(accessstate, privileges))
    return Win32.Foundation.NTSTATUS()
}

public fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditFipsCryptoSelftests", longArrayOf(if (bsuccess) 1L else 0L, selftestcode.toLong()))
}

public fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditHardLinkCreation", longArrayOf(filename, linkname, if (bsuccess) 1L else 0L))
}

public fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditHardLinkCreationWithTransaction", longArrayOf(filename, linkname, if (bsuccess) 1L else 0L, transactionid))
}

public fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditTransactionStateChange", longArrayOf(transactionid, resourcemanagerid, newtransactionstate.toLong()))
}

public fun SeAuditingAnyFileEventsWithContext(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingAnyFileEventsWithContext", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingAnyFileEventsWithContextEx", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext, stagingenabled))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEvents", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor)))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEventsWithContext", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEventsWithContextEx", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext, stagingenabled))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileOrGlobalEvents", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingHardLinkEvents", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor)))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingHardLinkEventsWithContext", longArrayOf(if (accessgranted) 1L else 0L, Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeCaptureSubjectContextEx(thread: Foundation.PETHREAD, process: Foundation.PEPROCESS, subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCaptureSubjectContextEx", longArrayOf(Win32DynamicFfi.objectSlot(thread), Win32DynamicFfi.objectSlot(process), subjectcontext))
}

public fun SeCheckForCriticalAceRemoval(currentdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, newdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCheckForCriticalAceRemoval", longArrayOf(Win32DynamicFfi.objectSlot(currentdescriptor), Win32DynamicFfi.objectSlot(newdescriptor), subjectsecuritycontext, aceremoved))
}

public fun SeCreateClientSecurity(clientthread: Foundation.PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCreateClientSecurity", longArrayOf(Win32DynamicFfi.objectSlot(clientthread), clientsecurityqos, if (remotesession) 1L else 0L, clientcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCreateClientSecurityFromSubjectContext", longArrayOf(subjectcontext, clientsecurityqos, if (serverisremote) 1L else 0L, clientcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun SeDeleteClientSecurity(clientcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteClientSecurity", longArrayOf(clientcontext))
}

public fun SeDeleteObjectAuditAlarm(obj: Long, handle: Win32.Foundation.HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteObjectAuditAlarm", longArrayOf(obj, Win32DynamicFfi.objectSlot(handle)))
}

public fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: Win32.Foundation.HANDLE, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteObjectAuditAlarmWithTransaction", longArrayOf(obj, Win32DynamicFfi.objectSlot(handle), transactionid))
}

public fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeExamineSacl", longArrayOf(sacl, resourcesacl, token, desiredaccess.toLong(), if (accessgranted) 1L else 0L, generateaudit, generatealarm))
}

public fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeFilterToken", longArrayOf(existingtoken, flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, filteredtoken))
    return Win32.Foundation.NTSTATUS()
}

public fun SeFreePrivileges(privileges: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeFreePrivileges", longArrayOf(privileges))
}

public fun SeImpersonateClient(clientcontext: Long, serverthread: Foundation.PETHREAD) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeImpersonateClient", longArrayOf(clientcontext, Win32DynamicFfi.objectSlot(serverthread)))
}

public fun SeImpersonateClientEx(clientcontext: Long, serverthread: Foundation.PETHREAD): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeImpersonateClientEx", longArrayOf(clientcontext, Win32DynamicFfi.objectSlot(serverthread)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeLocateProcessImageName(process: Foundation.PEPROCESS, pimagefilename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeLocateProcessImageName", longArrayOf(Win32DynamicFfi.objectSlot(process), pimagefilename))
    return Win32.Foundation.NTSTATUS()
}

public fun SeMarkLogonSessionForTerminationNotification(logonid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeMarkLogonSessionForTerminationNotification", longArrayOf(logonid))
    return Win32.Foundation.NTSTATUS()
}

public fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: Foundation.PESILO): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeMarkLogonSessionForTerminationNotificationEx", longArrayOf(logonid, Win32DynamicFfi.objectSlot(pserversilo)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectAuditAlarm", longArrayOf(objecttypename, obj, absoluteobjectname, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), generateonclose))
}

public fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectAuditAlarmWithTransaction", longArrayOf(objecttypename, obj, absoluteobjectname, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), transactionid, generateonclose))
}

public fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectForDeleteAuditAlarm", longArrayOf(objecttypename, obj, absoluteobjectname, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), generateonclose))
}

public fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectForDeleteAuditAlarmWithTransaction", longArrayOf(objecttypename, obj, absoluteobjectname, Win32DynamicFfi.objectSlot(securitydescriptor), accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), transactionid, generateonclose))
}

public fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SePrivilegeCheck", longArrayOf(requiredprivileges, subjectsecuritycontext, accessmode.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryAuthenticationIdToken", longArrayOf(token, authenticationid))
    return Win32.Foundation.NTSTATUS()
}

public fun SeQueryInformationToken(token: Long, tokeninformationclass: Win32.Security.TOKEN_INFORMATION_CLASS, tokeninformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryInformationToken", longArrayOf(token, Win32DynamicFfi.objectSlot(tokeninformationclass), tokeninformation))
    return Win32.Foundation.NTSTATUS()
}

public fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySecurityDescriptorInfo", longArrayOf(securityinformation, Win32DynamicFfi.objectSlot(securitydescriptor), length, objectssecuritydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun SeQueryServerSiloToken(token: Long, pserversilo: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryServerSiloToken", longArrayOf(token, pserversilo))
    return Win32.Foundation.NTSTATUS()
}

public fun SeQuerySessionIdToken(token: Long, sessionid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySessionIdToken", longArrayOf(token, sessionid))
    return Win32.Foundation.NTSTATUS()
}

public fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySessionIdTokenEx", longArrayOf(token, sessionid, isservicesession))
    return Win32.Foundation.NTSTATUS()
}

public fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterLogonSessionTerminatedRoutine", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterLogonSessionTerminatedRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine), context))
    return Win32.Foundation.NTSTATUS()
}

public fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: Win32.Security.PSID, auditparameters: Long, auditsubcategoryid: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReportSecurityEventWithSubCategory", longArrayOf(flags.toLong(), sourcename, Win32DynamicFfi.objectSlot(usersid), auditparameters, auditsubcategoryid.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetAccessStateGenericMapping", longArrayOf(accessstate, genericmapping))
}

public fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: Foundation.POOL_TYPE, genericmapping: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetSecurityDescriptorInfo", longArrayOf(obj, securityinformation, Win32DynamicFfi.objectSlot(modificationdescriptor), objectssecuritydescriptor, Win32DynamicFfi.objectSlot(pooltype), genericmapping))
    return Win32.Foundation.NTSTATUS()
}

public fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: Foundation.POOL_TYPE, genericmapping: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetSecurityDescriptorInfoEx", longArrayOf(obj, securityinformation, Win32DynamicFfi.objectSlot(modificationdescriptor), objectssecuritydescriptor, autoinheritflags.toLong(), Win32DynamicFfi.objectSlot(pooltype), genericmapping))
    return Win32.Foundation.NTSTATUS()
}

public fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, accessstate: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeShouldCheckForAccessRightsFromParent", longArrayOf(objecttype, Win32DynamicFfi.objectSlot(childdescriptor), accessstate))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenFromAccessInformation", longArrayOf(accessinformation, token, length.toLong(), requiredlength))
    return Win32.Foundation.NTSTATUS()
}

public fun SeTokenIsAdmin(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsAdmin", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenIsRestricted(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsRestricted", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenIsWriteRestricted(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsWriteRestricted", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenType(token: Long): Win32.Security.TOKEN_TYPE {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenType", longArrayOf(token))
    return Win32.Security.TOKEN_TYPE()
}

public fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterLogonSessionTerminatedRoutine", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterLogonSessionTerminatedRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine), context))
    return Win32.Foundation.NTSTATUS()
}

public fun SecLookupAccountName(name: Long, sidsize: Long, sid: Win32.Security.PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupAccountName", longArrayOf(name, sidsize, Win32DynamicFfi.objectSlot(sid), nameuse, domainsize, referenceddomain))
    return Win32.Foundation.NTSTATUS()
}

public fun SecLookupAccountSid(sid: Win32.Security.PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupAccountSid", longArrayOf(Win32DynamicFfi.objectSlot(sid), namesize, namebuffer, domainsize, domainbuffer, nameuse))
    return Win32.Foundation.NTSTATUS()
}

public fun SecLookupWellKnownSid(sidtype: Win32.Security.WELL_KNOWN_SID_TYPE, sid: Win32.Security.PSID, sidbuffersize: UInt, sidsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupWellKnownSid", longArrayOf(Win32DynamicFfi.objectSlot(sidtype), Win32DynamicFfi.objectSlot(sid), sidbuffersize.toLong(), sidsize))
    return Win32.Foundation.NTSTATUS()
}

public fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPN", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, spn, length, if (allocate) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPNEx", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, targetinfo, spn, length, if (allocate) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPNEx2", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, intargetinfo, spn, totalsize, if (allocate) 1L else 0L, if (istargetinfomarshaled) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetContextAttributesW", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcceptSecurityContextAsync", longArrayOf(asynccontext, phcredential, phcontext, pinput, fcontextreq.toLong(), targetdatarep.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Win32.Security.Authentication.Identity.SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcquireCredentialsHandleAsyncA", longArrayOf(asynccontext, pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Win32.Security.Authentication.Identity.SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcquireCredentialsHandleAsyncW", longArrayOf(asynccontext, pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun SspiCreateAsyncContext(): Long {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiCreateAsyncContext", longArrayOf())
}

public fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiDeleteSecurityContextAsync", longArrayOf(asynccontext, phcontext)).toInt()
}

public fun SspiFreeAsyncContext(handle: Long) {
    Win32DynamicFfi.invoke("ksecdd.sys", "SspiFreeAsyncContext", longArrayOf(handle))
}

public fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiFreeCredentialsHandleAsync", longArrayOf(asynccontext, phcredential)).toInt()
}

public fun SspiGetAsyncCallStatus(handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiGetAsyncCallStatus", longArrayOf(handle)).toInt()
}

public fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiInitializeSecurityContextAsyncA", longArrayOf(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiInitializeSecurityContextAsyncW", longArrayOf(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiReinitAsyncContext(handle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "SspiReinitAsyncContext", longArrayOf(handle))
    return Win32.Foundation.NTSTATUS()
}

public fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiSetAsyncNotifyCallback", longArrayOf(context, Win32DynamicFfi.objectSlot(callback), callbackdata)).toInt()
}

public fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "VerifySignature", longArrayOf(phcontext, pmessage, messageseqno.toLong(), pfqop)).toInt()
}

public fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), desiredaccess.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeResultListAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Win32.Foundation.HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAdjustGroupsToken(tokenhandle: Win32.Foundation.HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAdjustGroupsToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), if (resettodefault) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAdjustPrivilegesToken(tokenhandle: Win32.Foundation.HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAdjustPrivilegesToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), if (disableallprivileges) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAllocateVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, zerobits.toLong(), regionsize, allocationtype.toLong(), protect.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAllocateVirtualMemoryEx(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateVirtualMemoryEx", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, allocationtype.toLong(), pageprotection.toLong(), extendedparameters, extendedparametercount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCancelIoFileEx(filehandle: Win32.Foundation.HANDLE, iorequesttocancel: Long, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCancelIoFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iorequesttocancel, iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCloseObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: Win32.System.Kernel.EVENT_TYPE, initialstate: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(eventtype), if (initialstate) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Win32.Foundation.HANDLE, extendedparameters: Long, extendedparametercount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateSectionEx", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), Win32DynamicFfi.objectSlot(filehandle), extendedparameters, extendedparametercount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDeleteFile(objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteFile", longArrayOf(objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDuplicateObject(sourceprocesshandle: Win32.Foundation.HANDLE, sourcehandle: Win32.Foundation.HANDLE, targetprocesshandle: Win32.Foundation.HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDuplicateObject", longArrayOf(Win32DynamicFfi.objectSlot(sourceprocesshandle), Win32DynamicFfi.objectSlot(sourcehandle), Win32DynamicFfi.objectSlot(targetprocesshandle), targethandle, desiredaccess.toLong(), handleattributes.toLong(), options.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDuplicateToken(existingtokenhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: Win32.Security.TOKEN_TYPE, newtokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDuplicateToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), desiredaccess.toLong(), objectattributes, if (effectiveonly) 1L else 0L, Win32DynamicFfi.objectSlot(tokentype), newtokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFilterToken(existingtokenhandle: Win32.Foundation.HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFilterToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFlushBuffersFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushBuffersFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFlushBuffersFileEx(filehandle: Win32.Foundation.HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushBuffersFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), flags.toLong(), parameters, parameterssize.toLong(), iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFlushVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, iostatus))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFreeVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFreeVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, freetype.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFsControlFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFsControlFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwImpersonateAnonymousToken(threadhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwImpersonateAnonymousToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwLockFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwLockFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, byteoffset, length, key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwNotifyChangeKey(keyhandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwNotifyChangeKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, clienttoken: Win32.Foundation.HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenObjectAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), grantedaccess.toLong(), privileges, if (objectcreation) 1L else 0L, if (accessgranted) 1L else 0L, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenProcessToken(processhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcessToken", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), desiredaccess.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenProcessTokenEx(processhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcessTokenEx", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), desiredaccess.toLong(), handleattributes.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenThreadToken(threadhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenThreadToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), desiredaccess.toLong(), if (openasself) 1L else 0L, tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenThreadTokenEx(threadhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenThreadTokenEx", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), desiredaccess.toLong(), if (openasself) 1L else 0L, handleattributes.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrivilegeCheck(clienttoken: Win32.Foundation.HANDLE, requiredprivileges: Long, result: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegeCheck", longArrayOf(Win32DynamicFfi.objectSlot(clienttoken), requiredprivileges, result))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Win32.Foundation.HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegeObjectAuditAlarm", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), privileges, if (accessgranted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Win32.Foundation.HANDLE, privileges: Long, accessgranted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegedServiceAuditAlarm", longArrayOf(subsystemname, servicename, Win32DynamicFfi.objectSlot(clienttoken), privileges, if (accessgranted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryDirectoryFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryDirectoryFileEx(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryDirectoryObject(directoryhandle: Win32.Foundation.HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryObject", longArrayOf(Win32DynamicFfi.objectSlot(directoryhandle), buffer, length.toLong(), if (returnsingleentry) 1L else 0L, if (restartscan) 1L else 0L, context, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryEaFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryEaFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryFullAttributesFile", longArrayOf(objectattributes, fileinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationToken(tokenhandle: Win32.Foundation.HANDLE, tokeninformationclass: Win32.Security.TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), Win32DynamicFfi.objectSlot(tokeninformationclass), tokeninformation, tokeninformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryObject(handle: Win32.Foundation.HANDLE, objectinformationclass: Foundation.OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), Win32DynamicFfi.objectSlot(objectinformationclass), objectinformation, objectinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryQuotaInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Win32.Security.PSID, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryQuotaInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), Win32DynamicFfi.objectSlot(startsid), if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQuerySecurityObject(handle: Win32.Foundation.HANDLE, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySecurityObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor), length.toLong(), lengthneeded))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, memoryinformationclass.toLong(), memoryinformation, memoryinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryVolumeInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryVolumeInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetEaFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetEaFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetEvent(eventhandle: Win32.Foundation.HANDLE, previousstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetEvent", longArrayOf(Win32DynamicFfi.objectSlot(eventhandle), previousstate))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationToken(tokenhandle: Win32.Foundation.HANDLE, tokeninformationclass: Win32.Security.TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), Win32DynamicFfi.objectSlot(tokeninformationclass), tokeninformation, tokeninformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationVirtualMemory(processhandle: Win32.Foundation.HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), vminformationclass.toLong(), numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetQuotaInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetQuotaInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetSecurityObject(handle: Win32.Foundation.HANDLE, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetSecurityObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetVolumeInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetVolumeInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwUnlockFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwUnlockFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, byteoffset, length, key.toLong()))
    return Win32.Foundation.NTSTATUS()
}
