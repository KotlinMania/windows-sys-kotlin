@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.SipIndirectData

public data class CatalogInfo(
    public var cbStruct: UInt = 0u,
    public var wszCatalogFile: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CatalogInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (!this.wszCatalogFile.contentEquals(other.wszCatalogFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.wszCatalogFile.contentHashCode()
        return result
    }
}

public data class Cryptcatattribute(
    public var cbStruct: UInt = 0u,
    public var pwszReferenceTag: Pwstr = null,
    public var dwAttrTypeAndAction: CryptcatattributeFlags = 0u,
    public var cbValue: UInt = 0u,
    public var pbValue: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
)

public data class Cryptcatcdf(
    public var cbStruct: UInt = 0u,
    public var hFile: Handle = null,
    public var dwCurFilePos: UInt = 0u,
    public var dwLastMemberOffset: UInt = 0u,
    public var fEOF: Bool = 0,
    public var pwszResultDir: Pwstr = null,
    public var hCATStore: Handle = null,
)

public data class Cryptcatmember(
    public var cbStruct: UInt = 0u,
    public var pwszReferenceTag: Pwstr = null,
    public var pwszFileName: Pwstr = null,
    public var gSubjectType: Guid = Guid(),
    public var fdwMemberFlags: UInt = 0u,
    public var pIndirectData: SipIndirectData? = null,
    public var dwCertVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hReserved: Handle = null,
    public var sEncodedIndirectData: CryptIntegerBlob = CryptIntegerBlob(),
    public var sEncodedMemberInfo: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class Cryptcatstore(
    public var cbStruct: UInt = 0u,
    public var dwPublicVersion: UInt = 0u,
    public var pwszP7File: Pwstr = null,
    public var hProv: Int = 0,
    public var dwEncodingType: UInt = 0u,
    public var fdwStoreFlags: CryptcatOpenFlags = 0u,
    public var hReserved: Handle = null,
    public var hAttrs: Handle = null,
    public var hCryptMsg: COpaquePointer? = null,
    public var hSorted: Handle = null,
)

public data class MsAddinfoCatalogmember(
    public var cbStruct: UInt = 0u,
    public var pStore: Cryptcatstore? = null,
    public var pMember: Cryptcatmember? = null,
)
