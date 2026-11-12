package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public fun interface AcceptSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: UInt, param4: UInt, param5: MutPtr, param6: MutPtr, param7: MutPtr, param8: MutPtr): Hresult
}

public typealias AcceptSecurityContextFn = AcceptSecurityContextFnFn?

public fun interface AcquireCredentialsHandleFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: SecGetKeyFn, param6: MutPtr, param7: MutPtr, param8: MutPtr): Hresult
}

public typealias AcquireCredentialsHandleFnA = AcquireCredentialsHandleFnAFn?

public fun interface AcquireCredentialsHandleFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: SecGetKeyFn, param6: MutPtr, param7: MutPtr, param8: MutPtr): Hresult
}

public typealias AcquireCredentialsHandleFnW = AcquireCredentialsHandleFnWFn?

public fun interface AddCredentialsFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: UInt, param4: MutPtr, param5: SecGetKeyFn, param6: MutPtr, param7: MutPtr): Hresult
}

public typealias AddCredentialsFnA = AddCredentialsFnAFn?

public fun interface AddCredentialsFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: UInt, param4: MutPtr, param5: SecGetKeyFn, param6: MutPtr, param7: MutPtr): Hresult
}

public typealias AddCredentialsFnW = AddCredentialsFnWFn?

public fun interface ApplyControlTokenFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias ApplyControlTokenFn = ApplyControlTokenFnFn?

public typealias AscReqFlags = UInt

public typealias AscReqHighFlags = ULong

public fun interface ChangePasswordFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: Boolean, param6: UInt, param7: MutPtr): Hresult
}

public typealias ChangePasswordFnA = ChangePasswordFnAFn?

public fun interface ChangePasswordFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: Boolean, param6: UInt, param7: MutPtr): Hresult
}

public typealias ChangePasswordFnW = ChangePasswordFnWFn?

public fun interface CompleteAuthTokenFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias CompleteAuthTokenFn = CompleteAuthTokenFnFn?

public typealias CredFetch = Int

public fun interface CredFreeCredentialsFnFn {
    public operator fun invoke(count: UInt, credentials: MutPtr)
}

public typealias CredFreeCredentialsFn = CredFreeCredentialsFnFn?

public fun interface CredReadDomainCredentialsFnFn {
    public operator fun invoke(logonid: ConstPtr, credflags: UInt, targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Ntstatus
}

public typealias CredReadDomainCredentialsFn = CredReadDomainCredentialsFnFn?

public fun interface CredReadFnFn {
    public operator fun invoke(logonid: ConstPtr, credflags: UInt, targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr): Ntstatus
}

public typealias CredReadFn = CredReadFnFn?

public fun interface CredWriteFnFn {
    public operator fun invoke(logonid: ConstPtr, credflags: UInt, credential: ConstPtr, flags: UInt): Ntstatus
}

public typealias CredWriteFn = CredWriteFnFn?

public fun interface CrediUnmarshalandDecodeStringFnFn {
    public operator fun invoke(marshaledstring: Pcwstr, blob: MutPtr, blobsize: MutPtr, isfailurefatal: MutPtr): Ntstatus
}

public typealias CrediUnmarshalandDecodeStringFn = CrediUnmarshalandDecodeStringFnFn?

public fun interface DecryptMessageFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: UInt, param3: MutPtr): Hresult
}

public typealias DecryptMessageFn = DecryptMessageFnFn?

public fun interface DeleteSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr): Hresult
}

public typealias DeleteSecurityContextFn = DeleteSecurityContextFnFn?

public typealias DomainPasswordProperties = UInt

public fun interface EncryptMessageFnFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias EncryptMessageFn = EncryptMessageFnFn?

public fun interface EnumerateSecurityPackagesFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias EnumerateSecurityPackagesFnA = EnumerateSecurityPackagesFnAFn?

public fun interface EnumerateSecurityPackagesFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias EnumerateSecurityPackagesFnW = EnumerateSecurityPackagesFnWFn?

public typealias ExportSecurityContextFlags = UInt

public fun interface ExportSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: MutPtr): Hresult
}

public typealias ExportSecurityContextFn = ExportSecurityContextFnFn?

public typealias ExtendedNameFormat = Int

public fun interface FreeContextBufferFnFn {
    public operator fun invoke(param0: MutPtr): Hresult
}

public typealias FreeContextBufferFn = FreeContextBufferFnFn?

public fun interface FreeCredentialsHandleFnFn {
    public operator fun invoke(param0: MutPtr): Hresult
}

public typealias FreeCredentialsHandleFn = FreeCredentialsHandleFnFn?

public fun interface ImpersonateSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr): Hresult
}

public typealias ImpersonateSecurityContextFn = ImpersonateSecurityContextFnFn?

public fun interface ImportSecurityContextFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr): Hresult
}

public typealias ImportSecurityContextFnA = ImportSecurityContextFnAFn?

public fun interface ImportSecurityContextFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr): Hresult
}

public typealias ImportSecurityContextFnW = ImportSecurityContextFnWFn?

public fun interface InitializeSecurityContextFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: UInt, param4: UInt, param5: UInt, param6: MutPtr, param7: UInt, param8: MutPtr, param9: MutPtr, param10: MutPtr, param11: MutPtr): Hresult
}

public typealias InitializeSecurityContextFnA = InitializeSecurityContextFnAFn?

public fun interface InitializeSecurityContextFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: UInt, param4: UInt, param5: UInt, param6: MutPtr, param7: UInt, param8: MutPtr, param9: MutPtr, param10: MutPtr, param11: MutPtr): Hresult
}

public typealias InitializeSecurityContextFnW = InitializeSecurityContextFnWFn?

public fun interface InitSecurityInterfaceAFn {
    public operator fun invoke(): MutPtr
}

public typealias InitSecurityInterfaceA = InitSecurityInterfaceAFn?

public fun interface InitSecurityInterfaceWFn {
    public operator fun invoke(): MutPtr
}

public typealias InitSecurityInterfaceW = InitSecurityInterfaceWFn?

public typealias IscReqFlags = UInt

public typealias IscReqHighFlags = ULong

public typealias KerbAddressType = UInt

public typealias KerbCertificateInfoType = Int

public typealias KerbCryptoKeyType = Int

public typealias KerbLogonSubmitType = Int

public typealias KerbProfileBufferType = Int

public typealias KerbProtocolMessageType = Int

public typealias KerbRequestFlags = UInt

public typealias KerbTicketFlags = UInt

public typealias KsecContextType = Int

public fun interface KspCompleteTokenFnFn {
    public operator fun invoke(contextid: ULong, token: ConstPtr): Ntstatus
}

public typealias KspCompleteTokenFn = KspCompleteTokenFnFn?

public fun interface KspDeleteContextFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: MutPtr): Ntstatus
}

public typealias KspDeleteContextFn = KspDeleteContextFnFn?

public fun interface KspGetTokenFnFn {
    public operator fun invoke(contextid: ULong, impersonationtoken: MutPtr, rawtoken: MutPtr): Ntstatus
}

public typealias KspGetTokenFn = KspGetTokenFnFn?

public fun interface KspInitContextFnFn {
    public operator fun invoke(contextid: ULong, contextdata: ConstPtr, newcontextid: MutPtr): Ntstatus
}

public typealias KspInitContextFn = KspInitContextFnFn?

public fun interface KspInitPackageFnFn {
    public operator fun invoke(functiontable: ConstPtr): Ntstatus
}

public typealias KspInitPackageFn = KspInitPackageFnFn?

public fun interface KspMakeSignatureFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: ConstPtr, messageseqno: UInt): Ntstatus
}

public typealias KspMakeSignatureFn = KspMakeSignatureFnFn?

public fun interface KspMapHandleFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: MutPtr): Ntstatus
}

public typealias KspMapHandleFn = KspMapHandleFnFn?

public fun interface KspQueryAttributesFnFn {
    public operator fun invoke(contextid: ULong, attribute: UInt, buffer: MutPtr): Ntstatus
}

public typealias KspQueryAttributesFn = KspQueryAttributesFnFn?

public fun interface KspSealMessageFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: ConstPtr, messageseqno: UInt): Ntstatus
}

public typealias KspSealMessageFn = KspSealMessageFnFn?

public fun interface KspSerializeAuthDataFnFn {
    public operator fun invoke(pvauthdata: ConstPtr, size: MutPtr, serializeddata: MutPtr): Ntstatus
}

public typealias KspSerializeAuthDataFn = KspSerializeAuthDataFnFn?

public fun interface KspSetPagingModeFnFn {
    public operator fun invoke(pagingmode: Boolean): Ntstatus
}

public typealias KspSetPagingModeFn = KspSetPagingModeFnFn?

public fun interface KspUnsealMessageFnFn {
    public operator fun invoke(contextid: ULong, message: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Ntstatus
}

public typealias KspUnsealMessageFn = KspUnsealMessageFnFn?

public fun interface KspVerifySignatureFnFn {
    public operator fun invoke(contextid: ULong, message: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Ntstatus
}

public typealias KspVerifySignatureFn = KspVerifySignatureFnFn?

public fun interface LsaApPostLogonUserFn {
    public operator fun invoke(postlogonuserinfo: ConstPtr): Ntstatus
}

public typealias LsaApPostLogonUser = LsaApPostLogonUserFn?

public typealias LsaAuthInformationAuthType = UInt

public typealias LsaForestTrustCollisionRecordType = Int

public typealias LsaForestTrustRecordType = Int

public typealias LsaHandle = Long

public typealias LsaLookupDomainInfoClass = Int

public typealias LsaTokenInformationType = Int

public fun interface MakeSignatureFnFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias MakeSignatureFn = MakeSignatureFnFn?

public typealias Msv10 = UInt

public typealias Msv10Avid = Int

public typealias Msv10CredentialKeyType = Int

public typealias Msv10LogonSubmitType = Int

public typealias Msv10ProfileBufferType = Int

public typealias Msv10ProtocolMessageType = Int

public typealias MsvSubauthLogonParameterControl = UInt

public typealias MsvSubAuthenticationFilter = UInt

public typealias MsvSupplementalCredentialFlags = UInt

public typealias NegotiateMessages = Int

public typealias NetlogonLogonInfoClass = Int

public fun interface PksecCreateContextListFn {
    public operator fun invoke(type: KsecContextType): MutPtr
}

public typealias PksecCreateContextList = PksecCreateContextListFn?

public fun interface PksecDereferenceListEntryFn {
    public operator fun invoke(entry: ConstPtr, delete: MutPtr)
}

public typealias PksecDereferenceListEntry = PksecDereferenceListEntryFn?

public fun interface PksecInsertListEntryFn {
    public operator fun invoke(list: ConstPtr, entry: ConstPtr)
}

public typealias PksecInsertListEntry = PksecInsertListEntryFn?

public fun interface PksecLocatePkgByIdFn {
    public operator fun invoke(packageid: UInt): MutPtr
}

public typealias PksecLocatePkgById = PksecLocatePkgByIdFn?

public fun interface PksecReferenceListEntryFn {
    public operator fun invoke(entry: ConstPtr, signature: UInt, removenoref: Boolean): Ntstatus
}

public typealias PksecReferenceListEntry = PksecReferenceListEntryFn?

public fun interface PksecSerializeSchannelAuthDataFn {
    public operator fun invoke(pvauthdata: ConstPtr, size: MutPtr, serializeddata: MutPtr): Ntstatus
}

public typealias PksecSerializeSchannelAuthData = PksecSerializeSchannelAuthDataFn?

public fun interface PksecSerializeWinntAuthDataFn {
    public operator fun invoke(pvauthdata: ConstPtr, size: MutPtr, serializeddata: MutPtr): Ntstatus
}

public typealias PksecSerializeWinntAuthData = PksecSerializeWinntAuthDataFn?

public typealias Pku2uLogonSubmitType = Int

public fun interface PlsaAddCredentialFn {
    public operator fun invoke(logonid: ConstPtr, authenticationpackage: UInt, primarykeyvalue: ConstPtr, credentials: ConstPtr): Ntstatus
}

public typealias PlsaAddCredential = PlsaAddCredentialFn?

public fun interface PlsaAllocateClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr, lengthrequired: UInt, clientbaseaddress: MutPtr): Ntstatus
}

public typealias PlsaAllocateClientBuffer = PlsaAllocateClientBufferFn?

public fun interface PlsaAllocateLsaHeapFn {
    public operator fun invoke(length: UInt): MutPtr
}

public typealias PlsaAllocateLsaHeap = PlsaAllocateLsaHeapFn?

public fun interface PlsaAllocatePrivateHeapFn {
    public operator fun invoke(length: ULong): MutPtr
}

public typealias PlsaAllocatePrivateHeap = PlsaAllocatePrivateHeapFn?

public fun interface PlsaAllocateSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr, size: UInt): MutPtr
}

public typealias PlsaAllocateSharedMemory = PlsaAllocateSharedMemoryFn?

public fun interface PlsaApCallPackageFn {
    public operator fun invoke(clientrequest: ConstPtr, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaApCallPackage = PlsaApCallPackageFn?

public fun interface PlsaApCallPackagePassthroughFn {
    public operator fun invoke(clientrequest: ConstPtr, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaApCallPackagePassthrough = PlsaApCallPackagePassthroughFn?

public fun interface PlsaApInitializePackageFn {
    public operator fun invoke(authenticationpackageid: UInt, lsadispatchtable: ConstPtr, database: ConstPtr, confidentiality: ConstPtr, authenticationpackagename: MutPtr): Ntstatus
}

public typealias PlsaApInitializePackage = PlsaApInitializePackageFn?

public fun interface PlsaApLogonTerminatedFn {
    public operator fun invoke(logonid: ConstPtr)
}

public typealias PlsaApLogonTerminated = PlsaApLogonTerminatedFn?

public fun interface PlsaApLogonUserFn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, authenticationinformation: ConstPtr, clientauthenticationbase: ConstPtr, authenticationinformationlength: UInt, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, substatus: MutPtr, tokeninformationtype: MutPtr, tokeninformation: MutPtr, accountname: MutPtr, authenticatingauthority: MutPtr): Ntstatus
}

public typealias PlsaApLogonUser = PlsaApLogonUserFn?

public fun interface PlsaApLogonUserExFn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, authenticationinformation: ConstPtr, clientauthenticationbase: ConstPtr, authenticationinformationlength: UInt, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, substatus: MutPtr, tokeninformationtype: MutPtr, tokeninformation: MutPtr, accountname: MutPtr, authenticatingauthority: MutPtr, machinename: MutPtr): Ntstatus
}

public typealias PlsaApLogonUserEx = PlsaApLogonUserExFn?

public fun interface PlsaApLogonUserEx2Fn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbuffersize: UInt, profilebuffer: MutPtr, profilebuffersize: MutPtr, logonid: MutPtr, substatus: MutPtr, tokeninformationtype: MutPtr, tokeninformation: MutPtr, accountname: MutPtr, authenticatingauthority: MutPtr, machinename: MutPtr, primarycredentials: MutPtr, supplementalcredentials: MutPtr): Ntstatus
}

public typealias PlsaApLogonUserEx2 = PlsaApLogonUserEx2Fn?

public fun interface PlsaApLogonUserEx3Fn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbuffersize: UInt, surrogatelogon: MutPtr, profilebuffer: MutPtr, profilebuffersize: MutPtr, logonid: MutPtr, substatus: MutPtr, tokeninformationtype: MutPtr, tokeninformation: MutPtr, accountname: MutPtr, authenticatingauthority: MutPtr, machinename: MutPtr, primarycredentials: MutPtr, supplementalcredentials: MutPtr): Ntstatus
}

public typealias PlsaApLogonUserEx3 = PlsaApLogonUserEx3Fn?

public fun interface PlsaApPostLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbuffersize: UInt, surrogatelogon: ConstPtr, profilebuffer: ConstPtr, profilebuffersize: UInt, logonid: ConstPtr, status: Ntstatus, substatus: Ntstatus, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr, accountname: ConstPtr, authenticatingauthority: ConstPtr, machinename: ConstPtr, primarycredentials: ConstPtr, supplementalcredentials: ConstPtr): Ntstatus
}

public typealias PlsaApPostLogonUserSurrogate = PlsaApPostLogonUserSurrogateFn?

public fun interface PlsaApPreLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: ConstPtr, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbuffersize: UInt, surrogatelogon: MutPtr, substatus: MutPtr): Ntstatus
}

public typealias PlsaApPreLogonUserSurrogate = PlsaApPreLogonUserSurrogateFn?

public fun interface PlsaAuditAccountLogonFn {
    public operator fun invoke(auditid: UInt, success: Boolean, source: ConstPtr, clientname: ConstPtr, mappedname: ConstPtr, status: Ntstatus): Ntstatus
}

public typealias PlsaAuditAccountLogon = PlsaAuditAccountLogonFn?

public fun interface PlsaAuditLogonFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: ConstPtr, authenticatingauthority: ConstPtr, workstationname: ConstPtr, usersid: Psid, logontype: SecurityLogonType, tokensource: ConstPtr, logonid: ConstPtr)
}

public typealias PlsaAuditLogon = PlsaAuditLogonFn?

public fun interface PlsaAuditLogonExFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: ConstPtr, authenticatingauthority: ConstPtr, workstationname: ConstPtr, usersid: Psid, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokensource: ConstPtr, logonid: ConstPtr)
}

public typealias PlsaAuditLogonEx = PlsaAuditLogonExFn?

public fun interface PlsaCallbackFunctionFn {
    public operator fun invoke(argument1: ULong, argument2: ULong, inputbuffer: MutPtr, outputbuffer: MutPtr): Ntstatus
}

public typealias PlsaCallbackFunction = PlsaCallbackFunctionFn?

public fun interface PlsaCallPackageFn {
    public operator fun invoke(authenticationpackage: ConstPtr, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaCallPackage = PlsaCallPackageFn?

public fun interface PlsaCallPackageexFn {
    public operator fun invoke(authenticationpackage: ConstPtr, clientbufferbase: ConstPtr, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaCallPackageex = PlsaCallPackageexFn?

public fun interface PlsaCallPackagePassthroughFn {
    public operator fun invoke(authenticationpackage: ConstPtr, clientbufferbase: ConstPtr, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaCallPackagePassthrough = PlsaCallPackagePassthroughFn?

public fun interface PlsaCancelNotificationFn {
    public operator fun invoke(notifyhandle: Handle): Ntstatus
}

public typealias PlsaCancelNotification = PlsaCancelNotificationFn?

public fun interface PlsaCheckProtectedUserByTokenFn {
    public operator fun invoke(usertoken: Handle, protecteduser: MutPtr): Ntstatus
}

public typealias PlsaCheckProtectedUserByToken = PlsaCheckProtectedUserByTokenFn?

public fun interface PlsaClientCallbackFn {
    public operator fun invoke(callback: Pcstr, argument1: ULong, argument2: ULong, input: ConstPtr, output: MutPtr): Ntstatus
}

public typealias PlsaClientCallback = PlsaClientCallbackFn?

public fun interface PlsaCloseSamUserFn {
    public operator fun invoke(userhandle: ConstPtr): Ntstatus
}

public typealias PlsaCloseSamUser = PlsaCloseSamUserFn?

public fun interface PlsaConvertAuthDataToTokenFn {
    public operator fun invoke(userauthdata: ConstPtr, userauthdatasize: UInt, impersonationlevel: SecurityImpersonationLevel, tokensource: ConstPtr, logontype: SecurityLogonType, authorityname: ConstPtr, token: MutPtr, logonid: MutPtr, accountname: MutPtr, substatus: MutPtr): Ntstatus
}

public typealias PlsaConvertAuthDataToToken = PlsaConvertAuthDataToTokenFn?

public fun interface PlsaCopyFromClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr, length: UInt, buffertocopy: MutPtr, clientbaseaddress: ConstPtr): Ntstatus
}

public typealias PlsaCopyFromClientBuffer = PlsaCopyFromClientBufferFn?

public fun interface PlsaCopyToClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr, length: UInt, clientbaseaddress: MutPtr, buffertocopy: ConstPtr): Ntstatus
}

public typealias PlsaCopyToClientBuffer = PlsaCopyToClientBufferFn?

public fun interface PlsaCrackSingleNameFn {
    public operator fun invoke(formatoffered: UInt, performatgc: Boolean, nameinput: ConstPtr, prefix: ConstPtr, requestedformat: UInt, crackedname: MutPtr, dnsdomainname: MutPtr, substatus: MutPtr): Ntstatus
}

public typealias PlsaCrackSingleName = PlsaCrackSingleNameFn?

public fun interface PlsaCreateLogonSessionFn {
    public operator fun invoke(logonid: MutPtr): Ntstatus
}

public typealias PlsaCreateLogonSession = PlsaCreateLogonSessionFn?

public fun interface PlsaCreateSharedMemoryFn {
    public operator fun invoke(maxsize: UInt, initialsize: UInt): MutPtr
}

public typealias PlsaCreateSharedMemory = PlsaCreateSharedMemoryFn?

public fun interface PlsaCreateThreadFn {
    public operator fun invoke(securityattributes: ConstPtr, stacksize: UInt, startfunction: LpthreadStartRoutine, threadparameter: ConstPtr, creationflags: UInt, threadid: MutPtr): Handle
}

public typealias PlsaCreateThread = PlsaCreateThreadFn?

public fun interface PlsaCreateTokenFn {
    public operator fun invoke(logonid: ConstPtr, tokensource: ConstPtr, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr, tokengroups: ConstPtr, accountname: ConstPtr, authorityname: ConstPtr, workstation: ConstPtr, profilepath: ConstPtr, token: MutPtr, substatus: MutPtr): Ntstatus
}

public typealias PlsaCreateToken = PlsaCreateTokenFn?

public fun interface PlsaCreateTokenExFn {
    public operator fun invoke(logonid: ConstPtr, tokensource: ConstPtr, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr, tokengroups: ConstPtr, workstation: ConstPtr, profilepath: ConstPtr, sessioninformation: ConstPtr, sessioninformationtype: SecpkgSessioninfoType, token: MutPtr, substatus: MutPtr): Ntstatus
}

public typealias PlsaCreateTokenEx = PlsaCreateTokenExFn?

public fun interface PlsaDeleteCredentialFn {
    public operator fun invoke(logonid: ConstPtr, authenticationpackage: UInt, primarykeyvalue: ConstPtr): Ntstatus
}

public typealias PlsaDeleteCredential = PlsaDeleteCredentialFn?

public fun interface PlsaDeleteLogonSessionFn {
    public operator fun invoke(logonid: ConstPtr): Ntstatus
}

public typealias PlsaDeleteLogonSession = PlsaDeleteLogonSessionFn?

public fun interface PlsaDeleteSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr): Boolean
}

public typealias PlsaDeleteSharedMemory = PlsaDeleteSharedMemoryFn?

public fun interface PlsaDuplicateHandleFn {
    public operator fun invoke(sourcehandle: Handle, destionationhandle: MutPtr): Ntstatus
}

public typealias PlsaDuplicateHandle = PlsaDuplicateHandleFn?

public fun interface PlsaExpandAuthDataForDomainFn {
    public operator fun invoke(userauthdata: ConstPtr, userauthdatasize: UInt, reserved: ConstPtr, expandedauthdata: MutPtr, expandedauthdatasize: MutPtr): Ntstatus
}

public typealias PlsaExpandAuthDataForDomain = PlsaExpandAuthDataForDomainFn?

public fun interface PlsaFreeClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr, clientbaseaddress: ConstPtr): Ntstatus
}

public typealias PlsaFreeClientBuffer = PlsaFreeClientBufferFn?

public fun interface PlsaFreeLsaHeapFn {
    public operator fun invoke(base: ConstPtr)
}

public typealias PlsaFreeLsaHeap = PlsaFreeLsaHeapFn?

public fun interface PlsaFreePrivateHeapFn {
    public operator fun invoke(base: ConstPtr)
}

public typealias PlsaFreePrivateHeap = PlsaFreePrivateHeapFn?

public fun interface PlsaFreeSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr, memory: MutPtr)
}

public typealias PlsaFreeSharedMemory = PlsaFreeSharedMemoryFn?

public fun interface PlsaGetAppModeInfoFn {
    public operator fun invoke(userfunction: MutPtr, argument1: MutPtr, argument2: MutPtr, userdata: MutPtr, returntolsa: MutPtr): Ntstatus
}

public typealias PlsaGetAppModeInfo = PlsaGetAppModeInfoFn?

public fun interface PlsaGetAuthDataForUserFn {
    public operator fun invoke(name: ConstPtr, nametype: SecpkgNameType, prefix: ConstPtr, userauthdata: MutPtr, userauthdatasize: MutPtr, userflatname: MutPtr): Ntstatus
}

public typealias PlsaGetAuthDataForUser = PlsaGetAuthDataForUserFn?

public fun interface PlsaGetCallInfoFn {
    public operator fun invoke(info: MutPtr): Boolean
}

public typealias PlsaGetCallInfo = PlsaGetCallInfoFn?

public fun interface PlsaGetClientInfoFn {
    public operator fun invoke(clientinfo: MutPtr): Ntstatus
}

public typealias PlsaGetClientInfo = PlsaGetClientInfoFn?

public fun interface PlsaGetClientInfoExFn {
    public operator fun invoke(clientinfo: MutPtr, structsize: UInt): Ntstatus
}

public typealias PlsaGetClientInfoEx = PlsaGetClientInfoExFn?

public fun interface PlsaGetCredentialsFn {
    public operator fun invoke(logonid: ConstPtr, authenticationpackage: UInt, querycontext: MutPtr, retrieveallcredentials: Boolean, primarykeyvalue: ConstPtr, primarykeylength: MutPtr, credentials: ConstPtr): Ntstatus
}

public typealias PlsaGetCredentials = PlsaGetCredentialsFn?

public fun interface PlsaGetExtendedCallFlagsFn {
    public operator fun invoke(flags: MutPtr): Ntstatus
}

public typealias PlsaGetExtendedCallFlags = PlsaGetExtendedCallFlagsFn?

public fun interface PlsaGetServiceAccountPasswordFn {
    public operator fun invoke(accountname: ConstPtr, domainname: ConstPtr, credfetch: CredFetch, filetimeexpiry: MutPtr, currentpassword: MutPtr, previouspassword: MutPtr, filetimecurrpwdvalidforoutbound: MutPtr): Ntstatus
}

public typealias PlsaGetServiceAccountPassword = PlsaGetServiceAccountPasswordFn?

public fun interface PlsaGetUserAuthDataFn {
    public operator fun invoke(userhandle: ConstPtr, userauthdata: MutPtr, userauthdatasize: MutPtr): Ntstatus
}

public typealias PlsaGetUserAuthData = PlsaGetUserAuthDataFn?

public fun interface PlsaGetUserCredentialsFn {
    public operator fun invoke(userhandle: ConstPtr, primarycreds: MutPtr, primarycredssize: MutPtr, supplementalcreds: MutPtr, supplementalcredssize: MutPtr): Ntstatus
}

public typealias PlsaGetUserCredentials = PlsaGetUserCredentialsFn?

public fun interface PlsaImpersonateClientFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaImpersonateClient = PlsaImpersonateClientFn?

public fun interface PlsaLocatePkgByIdFn {
    public operator fun invoke(packgeid: UInt): MutPtr
}

public typealias PlsaLocatePkgById = PlsaLocatePkgByIdFn?

public fun interface PlsaMapBufferFn {
    public operator fun invoke(inputbuffer: ConstPtr, outputbuffer: MutPtr): Ntstatus
}

public typealias PlsaMapBuffer = PlsaMapBufferFn?

public fun interface PlsaOpenSamUserFn {
    public operator fun invoke(name: ConstPtr, nametype: SecpkgNameType, prefix: ConstPtr, allowguest: Boolean, reserved: UInt, userhandle: MutPtr): Ntstatus
}

public typealias PlsaOpenSamUser = PlsaOpenSamUserFn?

public fun interface PlsaOpenTokenByLogonIdFn {
    public operator fun invoke(logonid: ConstPtr, rettokenhandle: MutPtr): Ntstatus
}

public typealias PlsaOpenTokenByLogonId = PlsaOpenTokenByLogonIdFn?

public fun interface PlsaProtectMemoryFn {
    public operator fun invoke(buffer: MutPtr, buffersize: UInt)
}

public typealias PlsaProtectMemory = PlsaProtectMemoryFn?

public fun interface PlsaQueryClientRequestFn {
    public operator fun invoke(clientrequest: ConstPtr, querytype: UInt, replybuffer: MutPtr): Ntstatus
}

public typealias PlsaQueryClientRequest = PlsaQueryClientRequestFn?

public fun interface PlsaRedirectedLogonCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle, buffer: MutPtr, bufferlength: UInt, returnbuffer: MutPtr, returnbufferlength: MutPtr): Ntstatus
}

public typealias PlsaRedirectedLogonCallback = PlsaRedirectedLogonCallbackFn?

public fun interface PlsaRedirectedLogonCleanupCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle)
}

public typealias PlsaRedirectedLogonCleanupCallback = PlsaRedirectedLogonCleanupCallbackFn?

public fun interface PlsaRedirectedLogonGetLogonCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, logonbuffer: MutPtr, logonbufferlength: MutPtr): Ntstatus
}

public typealias PlsaRedirectedLogonGetLogonCreds = PlsaRedirectedLogonGetLogonCredsFn?

public fun interface PlsaRedirectedLogonGetSidFn {
    public operator fun invoke(redirectedlogonhandle: Handle, sid: MutPtr): Ntstatus
}

public typealias PlsaRedirectedLogonGetSid = PlsaRedirectedLogonGetSidFn?

public fun interface PlsaRedirectedLogonGetSuppCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, supplementalcredentials: MutPtr): Ntstatus
}

public typealias PlsaRedirectedLogonGetSuppCreds = PlsaRedirectedLogonGetSuppCredsFn?

public fun interface PlsaRedirectedLogonInitFn {
    public operator fun invoke(redirectedlogonhandle: Handle, packagename: ConstPtr, sessionid: UInt, logonid: ConstPtr): Ntstatus
}

public typealias PlsaRedirectedLogonInit = PlsaRedirectedLogonInitFn?

public fun interface PlsaRegisterCallbackFn {
    public operator fun invoke(callbackid: UInt, callback: PlsaCallbackFunction): Ntstatus
}

public typealias PlsaRegisterCallback = PlsaRegisterCallbackFn?

public fun interface PlsaRegisterNotificationFn {
    public operator fun invoke(startfunction: LpthreadStartRoutine, parameter: ConstPtr, notificationtype: UInt, notificationclass: UInt, notificationflags: UInt, intervalminutes: UInt, waitevent: Handle): Handle
}

public typealias PlsaRegisterNotification = PlsaRegisterNotificationFn?

public fun interface PlsaSaveSupplementalCredentialsFn {
    public operator fun invoke(logonid: ConstPtr, supplementalcredsize: UInt, supplementalcreds: ConstPtr, synchronous: Boolean): Ntstatus
}

public typealias PlsaSaveSupplementalCredentials = PlsaSaveSupplementalCredentialsFn?

public fun interface PlsaSetAppModeInfoFn {
    public operator fun invoke(userfunction: UInt, argument1: ULong, argument2: ULong, userdata: ConstPtr, returntolsa: Boolean): Ntstatus
}

public typealias PlsaSetAppModeInfo = PlsaSetAppModeInfoFn?

public fun interface PlsaUnloadPackageFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaUnloadPackage = PlsaUnloadPackageFn?

public fun interface PlsaUpdatePrimaryCredentialsFn {
    public operator fun invoke(primarycredentials: ConstPtr, credentials: ConstPtr): Ntstatus
}

public typealias PlsaUpdatePrimaryCredentials = PlsaUpdatePrimaryCredentialsFn?

public typealias PolicyAuditEventType = Int

public typealias PolicyDomainInformationClass = Int

public typealias PolicyInformationClass = Int

public typealias PolicyLsaServerRole = Int

public typealias PolicyNotificationInformationClass = Int

public fun interface PsamCredentialUpdateFreeRoutineFn {
    public operator fun invoke(p: ConstPtr)
}

public typealias PsamCredentialUpdateFreeRoutine = PsamCredentialUpdateFreeRoutineFn?

public fun interface PsamCredentialUpdateNotifyRoutineFn {
    public operator fun invoke(clearpassword: ConstPtr, oldcredentials: ConstPtr, oldcredentialsize: UInt, useraccountcontrol: UInt, upn: ConstPtr, username: ConstPtr, netbiosdomainname: ConstPtr, dnsdomainname: ConstPtr, newcredentials: MutPtr, newcredentialsize: MutPtr): Ntstatus
}

public typealias PsamCredentialUpdateNotifyRoutine = PsamCredentialUpdateNotifyRoutineFn?

public fun interface PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn {
    public operator fun invoke(table: MutPtr): Ntstatus
}

public typealias PsamCredentialUpdateRegisterMappedEntrypointsRoutine = PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn?

public fun interface PsamCredentialUpdateRegisterRoutineFn {
    public operator fun invoke(credentialname: MutPtr): Boolean
}

public typealias PsamCredentialUpdateRegisterRoutine = PsamCredentialUpdateRegisterRoutineFn?

public fun interface PsamInitNotificationRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PsamInitNotificationRoutine = PsamInitNotificationRoutineFn?

public fun interface PsamPasswordFilterRoutineFn {
    public operator fun invoke(accountname: ConstPtr, fullname: ConstPtr, password: ConstPtr, setoperation: Boolean): Boolean
}

public typealias PsamPasswordFilterRoutine = PsamPasswordFilterRoutineFn?

public fun interface PsamPasswordNotificationRoutineFn {
    public operator fun invoke(username: MutPtr, relativeid: UInt, newpassword: MutPtr): Ntstatus
}

public typealias PsamPasswordNotificationRoutine = PsamPasswordNotificationRoutineFn?

public fun interface QueryContextAttributesExFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnA = QueryContextAttributesExFnAFn?

public fun interface QueryContextAttributesExFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnW = QueryContextAttributesExFnWFn?

public fun interface QueryContextAttributesFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr): Hresult
}

public typealias QueryContextAttributesFnA = QueryContextAttributesFnAFn?

public fun interface QueryContextAttributesFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr): Hresult
}

public typealias QueryContextAttributesFnW = QueryContextAttributesFnWFn?

public fun interface QueryCredentialsAttributesExFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnA = QueryCredentialsAttributesExFnAFn?

public fun interface QueryCredentialsAttributesExFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnW = QueryCredentialsAttributesExFnWFn?

public fun interface QueryCredentialsAttributesFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr): Hresult
}

public typealias QueryCredentialsAttributesFnA = QueryCredentialsAttributesFnAFn?

public fun interface QueryCredentialsAttributesFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr): Hresult
}

public typealias QueryCredentialsAttributesFnW = QueryCredentialsAttributesFnWFn?

public fun interface QuerySecurityContextTokenFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias QuerySecurityContextTokenFn = QuerySecurityContextTokenFnFn?

public fun interface QuerySecurityPackageInfoFnAFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias QuerySecurityPackageInfoFnA = QuerySecurityPackageInfoFnAFn?

public fun interface QuerySecurityPackageInfoFnWFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Hresult
}

public typealias QuerySecurityPackageInfoFnW = QuerySecurityPackageInfoFnWFn?

public fun interface RevertSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr): Hresult
}

public typealias RevertSecurityContextFn = RevertSecurityContextFnFn?

public typealias SaslAuthzidState = Int

public typealias SchannelAlertTokenAlertType = UInt

public typealias SchannelCredFlags = UInt

public typealias SchannelSessionTokenFlags = UInt

public typealias SecpkgAttr = UInt

public typealias SecpkgAttrLctStatus = Int

public typealias SecpkgCallPackageMessageType = Int

public typealias SecpkgCred = UInt

public typealias SecpkgCredClass = Int

public typealias SecpkgExtendedInformationClass = Int

public typealias SecpkgNameType = Int

public typealias SecpkgPackageChangeType = UInt

public typealias SecpkgSessioninfoType = Int

public typealias SecurityPackageOptionsType = UInt

public typealias SecApplicationProtocolNegotiationExt = Int

public typealias SecApplicationProtocolNegotiationStatus = Int

public fun interface SecGetKeyFnFn {
    public operator fun invoke(arg: MutPtr, principal: MutPtr, keyver: UInt, key: MutPtr, status: MutPtr)
}

public typealias SecGetKeyFn = SecGetKeyFnFn?

public typealias SecTrafficSecretType = Int

public fun interface SetContextAttributesFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias SetContextAttributesFnA = SetContextAttributesFnAFn?

public fun interface SetContextAttributesFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias SetContextAttributesFnW = SetContextAttributesFnWFn?

public fun interface SetCredentialsAttributesFnAFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias SetCredentialsAttributesFnA = SetCredentialsAttributesFnAFn?

public fun interface SetCredentialsAttributesFnWFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr, param3: UInt): Hresult
}

public typealias SetCredentialsAttributesFnW = SetCredentialsAttributesFnWFn?

public typealias SeAdtParameterType = Int

public typealias Sldatatype = UInt

public typealias Slidtype = Int

public typealias Sllicensingstatus = Int

public typealias Slreferraltype = Int

public typealias SlActivationType = Int

public typealias SlGenuineState = Int

public fun interface SslCrackCertificateFnFn {
    public operator fun invoke(pbcertificate: MutPtr, cbcertificate: UInt, verifysignature: Bool, ppcertificate: MutPtr): Bool
}

public typealias SslCrackCertificateFn = SslCrackCertificateFnFn?

public fun interface SslEmptyCacheFnAFn {
    public operator fun invoke(psztargetname: Pcstr, dwflags: UInt): Bool
}

public typealias SslEmptyCacheFnA = SslEmptyCacheFnAFn?

public fun interface SslEmptyCacheFnWFn {
    public operator fun invoke(psztargetname: Pcwstr, dwflags: UInt): Bool
}

public typealias SslEmptyCacheFnW = SslEmptyCacheFnWFn?

public fun interface SslFreeCertificateFnFn {
    public operator fun invoke(pcertificate: MutPtr)
}

public typealias SslFreeCertificateFn = SslFreeCertificateFnFn?

public typealias SchGetExtensionsOptions = Int

public typealias SecDelegationType = Int

public fun interface SpAcceptCredentialsFnFn {
    public operator fun invoke(logontype: SecurityLogonType, accountname: ConstPtr, primarycredentials: ConstPtr, supplementalcredentials: ConstPtr): Ntstatus
}

public typealias SpAcceptCredentialsFn = SpAcceptCredentialsFnFn?

public fun interface SpAcceptLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, inputbuffer: ConstPtr, contextrequirements: UInt, targetdatarep: UInt, newcontexthandle: MutPtr, outputbuffer: MutPtr, contextattributes: MutPtr, expirationtime: MutPtr, mappedcontext: MutPtr, contextdata: MutPtr): Ntstatus
}

public typealias SpAcceptLsaModeContextFn = SpAcceptLsaModeContextFnFn?

public fun interface SpAcquireCredentialsHandleFnFn {
    public operator fun invoke(principalname: ConstPtr, credentialuseflags: UInt, logonid: ConstPtr, authorizationdata: ConstPtr, getkeyfunciton: ConstPtr, getkeyargument: ConstPtr, credentialhandle: MutPtr, expirationtime: MutPtr): Ntstatus
}

public typealias SpAcquireCredentialsHandleFn = SpAcquireCredentialsHandleFnFn?

public fun interface SpAddCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, principalname: ConstPtr, pkg: ConstPtr, credentialuseflags: UInt, authorizationdata: ConstPtr, getkeyfunciton: ConstPtr, getkeyargument: ConstPtr, expirationtime: MutPtr): Ntstatus
}

public typealias SpAddCredentialsFn = SpAddCredentialsFnFn?

public fun interface SpApplyControlTokenFnFn {
    public operator fun invoke(contexthandle: ULong, controltoken: ConstPtr): Ntstatus
}

public typealias SpApplyControlTokenFn = SpApplyControlTokenFnFn?

public fun interface SpChangeAccountPasswordFnFn {
    public operator fun invoke(pdomainname: ConstPtr, paccountname: ConstPtr, poldpassword: ConstPtr, pnewpassword: ConstPtr, impersonating: Boolean, poutput: MutPtr): Ntstatus
}

public typealias SpChangeAccountPasswordFn = SpChangeAccountPasswordFnFn?

public fun interface SpCompleteAuthTokenFnFn {
    public operator fun invoke(contexthandle: ULong, inputbuffer: ConstPtr): Ntstatus
}

public typealias SpCompleteAuthTokenFn = SpCompleteAuthTokenFnFn?

public fun interface SpDeleteContextFnFn {
    public operator fun invoke(contexthandle: ULong): Ntstatus
}

public typealias SpDeleteContextFn = SpDeleteContextFnFn?

public fun interface SpDeleteCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, key: ConstPtr): Ntstatus
}

public typealias SpDeleteCredentialsFn = SpDeleteCredentialsFnFn?

public fun interface SpExchangeMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: ConstPtr, contextrequirements: UInt, metadatalength: UInt, metadata: ConstPtr, contexthandle: MutPtr): Ntstatus
}

public typealias SpExchangeMetaDataFn = SpExchangeMetaDataFnFn?

public fun interface SpExportSecurityContextFnFn {
    public operator fun invoke(phcontext: ULong, fflags: UInt, ppackedcontext: MutPtr, ptoken: MutPtr): Ntstatus
}

public typealias SpExportSecurityContextFn = SpExportSecurityContextFnFn?

public fun interface SpExtractTargetInfoFnFn {
    public operator fun invoke(clientrequest: ConstPtr, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbufferlength: UInt, ppvtargetinfo: MutPtr, pcbtargetinfo: MutPtr): Ntstatus
}

public typealias SpExtractTargetInfoFn = SpExtractTargetInfoFnFn?

public fun interface SpFormatCredentialsFnFn {
    public operator fun invoke(credentials: ConstPtr, formattedcredentials: MutPtr): Ntstatus
}

public typealias SpFormatCredentialsFn = SpFormatCredentialsFnFn?

public fun interface SpFreeCredentialsHandleFnFn {
    public operator fun invoke(credentialhandle: ULong): Ntstatus
}

public typealias SpFreeCredentialsHandleFn = SpFreeCredentialsHandleFnFn?

public fun interface SpGetContextTokenFnFn {
    public operator fun invoke(contexthandle: ULong, impersonationtoken: MutPtr): Ntstatus
}

public typealias SpGetContextTokenFn = SpGetContextTokenFnFn?

public fun interface SpGetCredUIContextFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: ConstPtr, flatcreduicontextlength: MutPtr, flatcreduicontext: MutPtr): Ntstatus
}

public typealias SpGetCredUIContextFn = SpGetCredUIContextFnFn?

public fun interface SpGetCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: MutPtr): Ntstatus
}

public typealias SpGetCredentialsFn = SpGetCredentialsFnFn?

public fun interface SpGetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, ppinformation: MutPtr): Ntstatus
}

public typealias SpGetExtendedInformationFn = SpGetExtendedInformationFnFn?

public fun interface SpGetInfoFnFn {
    public operator fun invoke(packageinfo: MutPtr): Ntstatus
}

public typealias SpGetInfoFn = SpGetInfoFnFn?

public fun interface SpGetRemoteCredGuardLogonBufferFnFn {
    public operator fun invoke(credhandle: ULong, contexthandle: ULong, targetname: ConstPtr, redirectedlogonhandle: MutPtr, callback: MutPtr, cleanupcallback: MutPtr, logonbuffersize: MutPtr, logonbuffer: MutPtr): Ntstatus
}

public typealias SpGetRemoteCredGuardLogonBufferFn = SpGetRemoteCredGuardLogonBufferFnFn?

public fun interface SpGetRemoteCredGuardSupplementalCredsFnFn {
    public operator fun invoke(credhandle: ULong, targetname: ConstPtr, redirectedlogonhandle: MutPtr, callback: MutPtr, cleanupcallback: MutPtr, supplementalcredssize: MutPtr, supplementalcreds: MutPtr): Ntstatus
}

public typealias SpGetRemoteCredGuardSupplementalCredsFn = SpGetRemoteCredGuardSupplementalCredsFnFn?

public fun interface SpGetTbalSupplementalCredsFnFn {
    public operator fun invoke(logonid: Luid, supplementalcredssize: MutPtr, supplementalcreds: MutPtr): Ntstatus
}

public typealias SpGetTbalSupplementalCredsFn = SpGetTbalSupplementalCredsFnFn?

public fun interface SpGetUserInfoFnFn {
    public operator fun invoke(logonid: ConstPtr, flags: UInt, userdata: MutPtr): Ntstatus
}

public typealias SpGetUserInfoFn = SpGetUserInfoFnFn?

public fun interface SpImportSecurityContextFnFn {
    public operator fun invoke(ppackedcontext: ConstPtr, token: Handle, phcontext: MutPtr): Ntstatus
}

public typealias SpImportSecurityContextFn = SpImportSecurityContextFnFn?

public fun interface SpInitLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, targetname: ConstPtr, contextrequirements: UInt, targetdatarep: UInt, inputbuffers: ConstPtr, newcontexthandle: MutPtr, outputbuffers: MutPtr, contextattributes: MutPtr, expirationtime: MutPtr, mappedcontext: MutPtr, contextdata: MutPtr): Ntstatus
}

public typealias SpInitLsaModeContextFn = SpInitLsaModeContextFnFn?

public fun interface SpInitUserModeContextFnFn {
    public operator fun invoke(contexthandle: ULong, packedcontext: ConstPtr): Ntstatus
}

public typealias SpInitUserModeContextFn = SpInitUserModeContextFnFn?

public fun interface SpInitializeFnFn {
    public operator fun invoke(packageid: ULong, parameters: ConstPtr, functiontable: ConstPtr): Ntstatus
}

public typealias SpInitializeFn = SpInitializeFnFn?

public fun interface SpInstanceInitFnFn {
    public operator fun invoke(version: UInt, functiontable: ConstPtr, userfunctions: MutPtr): Ntstatus
}

public typealias SpInstanceInitFn = SpInstanceInitFnFn?

public fun interface SpLsaModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: MutPtr, pptables: MutPtr, pctables: MutPtr): Ntstatus
}

public typealias SpLsaModeInitializeFn = SpLsaModeInitializeFnFn?

public fun interface SpMakeSignatureFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: ConstPtr, messagesequencenumber: UInt): Ntstatus
}

public typealias SpMakeSignatureFn = SpMakeSignatureFnFn?

public fun interface SpMarshalAttributeDataFnFn {
    public operator fun invoke(attributeinfo: UInt, attribute: UInt, attributedatasize: UInt, attributedata: ConstPtr, marshaledattributedatasize: MutPtr, marshaledattributedata: MutPtr): Ntstatus
}

public typealias SpMarshalAttributeDataFn = SpMarshalAttributeDataFnFn?

public fun interface SpMarshallSupplementalCredsFnFn {
    public operator fun invoke(credentialsize: UInt, credentials: ConstPtr, marshalledcredsize: MutPtr, marshalledcreds: MutPtr): Ntstatus
}

public typealias SpMarshallSupplementalCredsFn = SpMarshallSupplementalCredsFnFn?

public fun interface SpQueryContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: MutPtr): Ntstatus
}

public typealias SpQueryContextAttributesFn = SpQueryContextAttributesFnFn?

public fun interface SpQueryCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: MutPtr): Ntstatus
}

public typealias SpQueryCredentialsAttributesFn = SpQueryCredentialsAttributesFnFn?

public fun interface SpQueryMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: ConstPtr, contextrequirements: UInt, metadatalength: MutPtr, metadata: MutPtr, contexthandle: MutPtr): Ntstatus
}

public typealias SpQueryMetaDataFn = SpQueryMetaDataFnFn?

public fun interface SpSaveCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: ConstPtr): Ntstatus
}

public typealias SpSaveCredentialsFn = SpSaveCredentialsFnFn?

public fun interface SpSealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: ConstPtr, messagesequencenumber: UInt): Ntstatus
}

public typealias SpSealMessageFn = SpSealMessageFnFn?

public fun interface SpSetContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: ConstPtr, buffersize: UInt): Ntstatus
}

public typealias SpSetContextAttributesFn = SpSetContextAttributesFnFn?

public fun interface SpSetCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: ConstPtr, buffersize: UInt): Ntstatus
}

public typealias SpSetCredentialsAttributesFn = SpSetCredentialsAttributesFnFn?

public fun interface SpSetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, info: ConstPtr): Ntstatus
}

public typealias SpSetExtendedInformationFn = SpSetExtendedInformationFnFn?

public fun interface SpShutdownFnFn {
    public operator fun invoke(): Ntstatus
}

public typealias SpShutdownFn = SpShutdownFnFn?

public fun interface SpUnsealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: ConstPtr, messagesequencenumber: UInt, qualityofprotection: MutPtr): Ntstatus
}

public typealias SpUnsealMessageFn = SpUnsealMessageFnFn?

public fun interface SpUpdateCredentialsFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: ConstPtr, flatcreduicontextlength: UInt, flatcreduicontext: ConstPtr): Ntstatus
}

public typealias SpUpdateCredentialsFn = SpUpdateCredentialsFnFn?

public fun interface SpUserModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: MutPtr, pptables: MutPtr, pctables: MutPtr): Ntstatus
}

public typealias SpUserModeInitializeFn = SpUserModeInitializeFnFn?

public fun interface SpValidateTargetInfoFnFn {
    public operator fun invoke(clientrequest: ConstPtr, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbufferlength: UInt, targetinfo: ConstPtr): Ntstatus
}

public typealias SpValidateTargetInfoFn = SpValidateTargetInfoFnFn?

public fun interface SpVerifySignatureFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: ConstPtr, messagesequencenumber: UInt, qualityofprotection: MutPtr): Ntstatus
}

public typealias SpVerifySignatureFn = SpVerifySignatureFnFn?

public fun interface SslDeserializeCertificateStoreFnFn {
    public operator fun invoke(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr): Hresult
}

public typealias SslDeserializeCertificateStoreFn = SslDeserializeCertificateStoreFnFn?

public fun interface SslGetExtensionsFnFn {
    public operator fun invoke(clienthello: ConstPtr, clienthellobytesize: UInt, genericextensions: MutPtr, genericextensionscount: UByte, bytestoread: MutPtr, flags: SchGetExtensionsOptions): Hresult
}

public typealias SslGetExtensionsFn = SslGetExtensionsFnFn?

public fun interface SslGetServerIdentityFnFn {
    public operator fun invoke(clienthello: ConstPtr, clienthellosize: UInt, serveridentity: MutPtr, serveridentitysize: MutPtr, flags: UInt): Hresult
}

public typealias SslGetServerIdentityFn = SslGetServerIdentityFnFn?

public typealias TokenbindingExtensionFormat = Int

public typealias TokenbindingKeyParametersType = Int

public typealias TokenbindingType = Int

public typealias TrustedDomainTrustAttributes = UInt

public typealias TrustedDomainTrustDirection = UInt

public typealias TrustedDomainTrustType = UInt

public typealias TrustedInformationClass = Int

public fun interface VerifySignatureFnFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: UInt, param3: MutPtr): Hresult
}

public typealias VerifySignatureFn = VerifySignatureFnFn?

public typealias Hmapper = Long

public typealias ETlsAlgorithmUsage = Int

public typealias ETlsHashAlgorithm = Int

public typealias ETlsSignatureAlgorithm = Int
