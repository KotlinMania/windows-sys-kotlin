package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAlgorithmIdentifier
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAttributeTypeValue
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.MsAddinfoCatalogmember

public data class MsAddinfoBlob(
    public var cbStruct: UInt = 0u,
    public var cbMemObject: UInt = 0u,
    public var pbMemObject: COpaquePointer? = null,
    public var cbMemSignedMsg: UInt = 0u,
    public var pbMemSignedMsg: COpaquePointer? = null,
)

public data class MsAddinfoFlat(public var cbStruct: UInt = 0u, public var pIndirectData: SipIndirectData? = null)

public data class SipAddNewprovider(
    public var cbStruct: UInt = 0u,
    public var pgSubject: Guid? = null,
    public var pwszDLLFileName: Pwstr = null,
    public var pwszMagicNumber: Pwstr = null,
    public var pwszIsFunctionName: Pwstr = null,
    public var pwszGetFuncName: Pwstr = null,
    public var pwszPutFuncName: Pwstr = null,
    public var pwszCreateFuncName: Pwstr = null,
    public var pwszVerifyFuncName: Pwstr = null,
    public var pwszRemoveFuncName: Pwstr = null,
    public var pwszIsFunctionNameFmt2: Pwstr = null,
    public var pwszGetCapFuncName: Pwstr = null,
)

public data class SipCapSetV2(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: Bool = 0,
    public var dwReserved: UInt = 0u,
)

public data class SipCapSetV3(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: Bool = 0,
    public var anonymous: SipCapSetV30 = SipCapSetV30(),
)

public data class SipCapSetV30(public var dwFlags: UInt = 0u, public var dwReserved: UInt = 0u)

public data class SipDispatchInfo(
    public var cbSize: UInt = 0u,
    public var hSIP: Handle = null,
    public var pfGet: PCryptSipgetSignedDataMsg = null,
    public var pfPut: PCryptSipputSignedDataMsg = null,
    public var pfCreate: PCryptSipcreateIndirectData = null,
    public var pfVerify: PCryptSipverifyIndirectData = null,
    public var pfRemove: PCryptSipremoveSignedDataMsg = null,
)

public data class SipIndirectData(
    public var data: CryptAttributeTypeValue = CryptAttributeTypeValue(),
    public var digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var digest: CryptIntegerBlob = CryptIntegerBlob(),
)

public class SipSubjectinfo(
    public var cbSize: UInt = 0u,
    public var pgSubjectType: Guid? = null,
    public var hFile: Handle = null,
    public var pwsFileName: Pcwstr = null,
    public var pwsDisplayName: Pcwstr = null,
    public var dwReserved1: UInt = 0u,
    public var dwIntVersion: UInt = 0u,
    public var hProv: Int = 0,
    public var digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var dwFlags: UInt = 0u,
    public var dwEncodingType: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var fdwCAPISettings: UInt = 0u,
    public var fdwSecuritySettings: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwUnionChoice: UInt = 0u,
    public var anonymous: SipSubjectinfo0 = SipSubjectinfo0(),
    public var pClientData: COpaquePointer? = null,
)

public data class SipSubjectinfo0(
    public var psFlat: MsAddinfoFlat? = null,
    public var psCatMember: MsAddinfoCatalogmember? = null,
    public var psBlob: MsAddinfoBlob? = null,
)
