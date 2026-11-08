package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_ALGORITHM_IDENTIFIER
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_ATTRIBUTE_TYPE_VALUE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_INTEGER_BLOB

public data class MS_ADDINFO_BLOB(
    public var cbStruct: UInt = 0u,
    public var cbMemObject: UInt = 0u,
    public var pbMemObject: Long = 0L,
    public var cbMemSignedMsg: UInt = 0u,
    public var pbMemSignedMsg: Long = 0L,
)

public data class MS_ADDINFO_FLAT(public var cbStruct: UInt = 0u, public var pIndirectData: Long = 0L)

public data class SIP_ADD_NEWPROVIDER(
    public var cbStruct: UInt = 0u,
    public var pgSubject: Long = 0L,
    public var pwszDLLFileName: PWSTR = 0L,
    public var pwszMagicNumber: PWSTR = 0L,
    public var pwszIsFunctionName: PWSTR = 0L,
    public var pwszGetFuncName: PWSTR = 0L,
    public var pwszPutFuncName: PWSTR = 0L,
    public var pwszCreateFuncName: PWSTR = 0L,
    public var pwszVerifyFuncName: PWSTR = 0L,
    public var pwszRemoveFuncName: PWSTR = 0L,
    public var pwszIsFunctionNameFmt2: PWSTR = 0L,
    public var pwszGetCapFuncName: PWSTR = 0L,
)

public data class SIP_CAP_SET_V2(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: BOOL = 0,
    public var dwReserved: UInt = 0u,
)

public data class SIP_CAP_SET_V3(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: BOOL = 0,
    public var Anonymous: SIP_CAP_SET_V3_0 = SIP_CAP_SET_V3_0(),
)

public data class SIP_CAP_SET_V3_0(public var dwFlags: UInt = 0u, public var dwReserved: UInt = 0u)

public data class SIP_DISPATCH_INFO(
    public var cbSize: UInt = 0u,
    public var hSIP: HANDLE = 0L,
    public var pfGet: pCryptSIPGetSignedDataMsg = null,
    public var pfPut: pCryptSIPPutSignedDataMsg = null,
    public var pfCreate: pCryptSIPCreateIndirectData = null,
    public var pfVerify: pCryptSIPVerifyIndirectData = null,
    public var pfRemove: pCryptSIPRemoveSignedDataMsg = null,
)

public data class SIP_INDIRECT_DATA(
    public var Data: CRYPT_ATTRIBUTE_TYPE_VALUE = CRYPT_ATTRIBUTE_TYPE_VALUE(),
    public var DigestAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Digest: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public class SIP_SUBJECTINFO(
    public var cbSize: UInt = 0u,
    public var pgSubjectType: Long = 0L,
    public var hFile: HANDLE = 0L,
    public var pwsFileName: PCWSTR = 0L,
    public var pwsDisplayName: PCWSTR = 0L,
    public var dwReserved1: UInt = 0u,
    public var dwIntVersion: UInt = 0u,
    public var hProv: ULong = 0uL,
    public var DigestAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var dwFlags: UInt = 0u,
    public var dwEncodingType: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var fdwCAPISettings: UInt = 0u,
    public var fdwSecuritySettings: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwUnionChoice: UInt = 0u,
    public var Anonymous: SIP_SUBJECTINFO_0 = SIP_SUBJECTINFO_0(),
    public var pClientData: Long = 0L,
)

public data class SIP_SUBJECTINFO_0(
    public var psFlat: Long = 0L,
    public var psCatMember: Long = 0L,
    public var psBlob: Long = 0L,
)
