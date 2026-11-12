package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.AccessState
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SspiAsyncContext
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessInformation
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterArray
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MemExtendedParameter

public expect fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt

public expect fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus

public expect fun rtlPrefixString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryPackageIdentity(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, packaged: MutPtr<Boolean>): Ntstatus

public expect fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, dynamicid: MutPtr<Guid>, flags: MutPtr<ULong>): Ntstatus

public expect fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte

public expect fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte

public expect fun rtlRandom(seed: MutPtr<UInt>): UInt

public expect fun rtlRandomEx(seed: MutPtr<UInt>): UInt

public expect fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefixtableentry: ConstPtr<UnicodePrefixTableEntry>)

public expect fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr<UInt>): Ntstatus

public expect fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: UInt): Ntstatus

public expect fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr<Long>)

public expect fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr<Long>)

public expect fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr<UInt>, dacl: MutPtr<Acl>, daclsize: MutPtr<UInt>, sacl: MutPtr<Acl>, saclsize: MutPtr<UInt>, owner: Psid, ownersize: MutPtr<UInt>, primarygroup: Psid, primarygroupsize: MutPtr<UInt>): Ntstatus

public expect fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus

public expect fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus

public expect fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSubAuthorityCountSid(sid: Psid): MutPtr<UByte>

public expect fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr<UInt>

public expect fun rtlTimeToSecondsSince1980(time: ConstPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean

public expect fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlValidSid(sid: Psid): Boolean

public expect fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr<UnicodeString>): Ntstatus

public expect fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt

public expect fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr<UnicodeString>): UInt

public expect fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr<TokenAccessInformation>, clienttokeninformation: ConstPtr<TokenAccessInformation>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean

public expect fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr<CVoid>, clienttoken: ConstPtr<CVoid>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean

public expect fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>)

public expect fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>)

public expect fun seAdjustObjectSecurity(objectname: ConstPtr<UnicodeString>, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, adjusteddescriptor: MutPtr<PsecurityDescriptor>, applyadjusteddescriptor: MutPtr<Boolean>): Ntstatus

public expect fun seAppendPrivileges(accessstate: MutPtr<AccessState>, privileges: ConstPtr<PrivilegeSet>): Ntstatus

public expect fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt)

public expect fun seAuditHardLinkCreation(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean)

public expect fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean, transactionid: ConstPtr<Guid>)

public expect fun seAuditTransactionStateChange(transactionid: ConstPtr<Guid>, resourcemanagerid: ConstPtr<Guid>, newtransactionstate: UInt)

public expect fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean

public expect fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean

public expect fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean

public expect fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean

public expect fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean

public expect fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean

public expect fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr<SecuritySubjectContext>)

public expect fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, aceremoved: MutPtr<Boolean>)

public expect fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr<SecurityQualityOfService>, remotesession: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus

public expect fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>, clientsecurityqos: ConstPtr<SecurityQualityOfService>, serverisremote: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus

public expect fun seDeleteClientSecurity(clientcontext: MutPtr<SecurityClientContext>)

public expect fun seDeleteObjectAuditAlarm(obj: ConstPtr<CVoid>, handle: Handle)

public expect fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr<CVoid>, handle: Handle, transactionid: ConstPtr<Guid>)

public expect fun seExamineSacl(sacl: ConstPtr<Acl>, resourcesacl: ConstPtr<Acl>, token: ConstPtr<CVoid>, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr<Boolean>, generatealarm: MutPtr<Boolean>)

public expect fun seFilterToken(existingtoken: ConstPtr<CVoid>, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, filteredtoken: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun seFreePrivileges(privileges: ConstPtr<PrivilegeSet>)

public expect fun seImpersonateClient(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread)

public expect fun seImpersonateClientEx(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread): Ntstatus

public expect fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr<MutPtr<UnicodeString>>): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr<Luid>): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr<Luid>, pserversilo: Pesilo): Ntstatus

public expect fun seOpenObjectAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>)

public expect fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>)

public expect fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>)

public expect fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>)

public expect fun sePrivilegeCheck(requiredprivileges: MutPtr<PrivilegeSet>, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, accessmode: Byte): Boolean

public expect fun seQueryAuthenticationIdToken(token: ConstPtr<CVoid>, authenticationid: MutPtr<Luid>): Ntstatus

public expect fun seQueryInformationToken(token: ConstPtr<CVoid>, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr<UInt>, securitydescriptor: PsecurityDescriptor, length: MutPtr<UInt>, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun seQueryServerSiloToken(token: ConstPtr<CVoid>, pserversilo: MutPtr<Pesilo>): Ntstatus

public expect fun seQuerySessionIdToken(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>): Ntstatus

public expect fun seQuerySessionIdTokenEx(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>, isservicesession: MutPtr<Boolean>): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus

public expect fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>, auditsubcategoryid: UInt): Ntstatus

public expect fun seSetAccessStateGenericMapping(accessstate: MutPtr<AccessState>, genericmapping: ConstPtr<GenericMapping>)

public expect fun seSetSecurityDescriptorInfo(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus

public expect fun seSetSecurityDescriptorInfoEx(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus

public expect fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr<CVoid>, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>): Boolean

public expect fun seTokenFromAccessInformation(accessinformation: ConstPtr<TokenAccessInformation>, token: MutPtr<CVoid>, length: UInt, requiredlength: MutPtr<UInt>): Ntstatus

public expect fun seTokenIsAdmin(token: ConstPtr<CVoid>): Boolean

public expect fun seTokenIsRestricted(token: ConstPtr<CVoid>): Boolean

public expect fun seTokenIsWriteRestricted(token: ConstPtr<CVoid>): Boolean

public expect fun seTokenType(token: ConstPtr<CVoid>): TokenType

public expect fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus

public expect fun secLookupAccountName(name: ConstPtr<UnicodeString>, sidsize: MutPtr<UInt>, sid: Psid, nameuse: MutPtr<SidNameUse>, domainsize: MutPtr<UInt>, referenceddomain: MutPtr<UnicodeString>): Ntstatus

public expect fun secLookupAccountSid(sid: Psid, namesize: MutPtr<UInt>, namebuffer: MutPtr<UnicodeString>, domainsize: MutPtr<UInt>, domainbuffer: MutPtr<UnicodeString>, nameuse: MutPtr<SidNameUse>): Ntstatus

public expect fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr<UInt>): Ntstatus

public expect fun secMakeSPN(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, targetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx2(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, intargetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, totalsize: MutPtr<UInt>, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus

public expect fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: ConstPtr<UnicodeString>, pszpackage: ConstPtr<UnicodeString>, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult

public expect fun sspiCreateAsyncContext(): MutPtr<SspiAsyncContext>

public expect fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcontext: ConstPtr<SecHandle>): Hresult

public expect fun sspiFreeAsyncContext(handle: ConstPtr<SspiAsyncContext>)

public expect fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>): Hresult

public expect fun sspiGetAsyncCallStatus(handle: ConstPtr<SspiAsyncContext>): Hresult

public expect fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult

public expect fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UnicodeString>, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult

public expect fun sspiReinitAsyncContext(handle: MutPtr<SspiAsyncContext>): Ntstatus

public expect fun sspiSetAsyncNotifyCallback(context: ConstPtr<SspiAsyncContext>, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr<CVoid>): Hresult

public expect fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult

public expect fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus

public expect fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus

public expect fun zwCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun zwCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus

public expect fun zwDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus

public expect fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus

public expect fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus

public expect fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun zwOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus

public expect fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus

public expect fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus

public expect fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus

public expect fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus

public expect fun zwQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus

public expect fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr<CVoid>, objectinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus

public expect fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus

public expect fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus

public expect fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus

public expect fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus

public expect fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus
