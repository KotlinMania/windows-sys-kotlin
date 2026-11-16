@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.Bffcallback
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public class Adsproperror internal constructor(
    hwndPageCtorArg: Hwnd,
    pszPageTitleCtorArg: Pwstr,
    pszObjPathCtorArg: Pwstr,
    pszObjClassCtorArg: Pwstr,
    public var hr: Hresult,
    pszErrorCtorArg: Pwstr,
) {
    public var hwndPage: Hwnd = hwndPageCtorArg
        internal set

    public var pszPageTitle: Pwstr = pszPageTitleCtorArg
        internal set

    public var pszObjPath: Pwstr = pszObjPathCtorArg
        internal set

    public var pszObjClass: Pwstr = pszObjClassCtorArg
        internal set

    public var pszError: Pwstr = pszErrorCtorArg
        internal set

    public constructor() : this(
        hwndPageCtorArg = MutPtr(0L),
        pszPageTitleCtorArg = MutPtr(0L),
        pszObjPathCtorArg = MutPtr(0L),
        pszObjClassCtorArg = MutPtr(0L),
        hr = 0,
        pszErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hwndPage

    public operator fun component2(): Pwstr = this.pszPageTitle

    public operator fun component3(): Pwstr = this.pszObjPath

    public operator fun component4(): Pwstr = this.pszObjClass

    public operator fun component5(): Hresult = this.hr

    public operator fun component6(): Pwstr = this.pszError

    public fun copy(hwndPage: Hwnd = this.hwndPage, pszPageTitle: Pwstr = this.pszPageTitle, pszObjPath: Pwstr = this.pszObjPath, pszObjClass: Pwstr = this.pszObjClass, hr: Hresult = this.hr, pszError: Pwstr = this.pszError): Adsproperror = Adsproperror(hwndPageCtorArg = hwndPage, pszPageTitleCtorArg = pszPageTitle, pszObjPathCtorArg = pszObjPath, pszObjClassCtorArg = pszObjClass, hr = hr, pszErrorCtorArg = pszError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adsproperror) return false
        if (this.hwndPage != other.hwndPage) return false
        if (this.pszPageTitle != other.pszPageTitle) return false
        if (this.pszObjPath != other.pszObjPath) return false
        if (this.pszObjClass != other.pszObjClass) return false
        if (this.hr != other.hr) return false
        if (this.pszError != other.pszError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndPage.hashCode()
        result = 31 * result + this.pszPageTitle.hashCode()
        result = 31 * result + this.pszObjPath.hashCode()
        result = 31 * result + this.pszObjClass.hashCode()
        result = 31 * result + this.hr.hashCode()
        result = 31 * result + this.pszError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndPage: Hwnd = MutPtr(0L),
            pszPageTitle: Pwstr = MutPtr(0L),
            pszObjPath: Pwstr = MutPtr(0L),
            pszObjClass: Pwstr = MutPtr(0L),
            hr: Hresult = 0,
            pszError: Pwstr = MutPtr(0L),
        ): Adsproperror =
            Adsproperror(
                hwndPageCtorArg = hwndPage,
                pszPageTitleCtorArg = pszPageTitle,
                pszObjPathCtorArg = pszObjPath,
                pszObjClassCtorArg = pszObjClass,
                hr = hr,
                pszErrorCtorArg = pszError,
            )
    }
}

public class Adspropinitparams internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var hr: Hresult,
    pDsObjCtorArg: MutPtr,
    pwzCNCtorArg: Pwstr,
    pWritableAttrsCtorArg: MutPtr,
) {
    public var pDsObj: MutPtr = pDsObjCtorArg
        internal set

    public var pwzCN: Pwstr = pwzCNCtorArg
        internal set

    public var pWritableAttrs: MutPtr = pWritableAttrsCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hr = 0,
        pDsObjCtorArg = MutPtr(0L),
        pwzCNCtorArg = MutPtr(0L),
        pWritableAttrsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hresult = this.hr

    public operator fun component4(): MutPtr = this.pDsObj

    public operator fun component5(): Pwstr = this.pwzCN

    public operator fun component6(): MutPtr = this.pWritableAttrs

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hr: Hresult = this.hr, pDsObj: MutPtr = this.pDsObj, pwzCN: Pwstr = this.pwzCN, pWritableAttrs: MutPtr = this.pWritableAttrs): Adspropinitparams = Adspropinitparams(dwSize = dwSize, dwFlags = dwFlags, hr = hr, pDsObjCtorArg = pDsObj, pwzCNCtorArg = pwzCN, pWritableAttrsCtorArg = pWritableAttrs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adspropinitparams) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hr != other.hr) return false
        if (this.pDsObj != other.pDsObj) return false
        if (this.pwzCN != other.pwzCN) return false
        if (this.pWritableAttrs != other.pWritableAttrs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hr.hashCode()
        result = 31 * result + this.pDsObj.hashCode()
        result = 31 * result + this.pwzCN.hashCode()
        result = 31 * result + this.pWritableAttrs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hr: Hresult = 0,
            pDsObj: MutPtr = MutPtr(0L),
            pwzCN: Pwstr = MutPtr(0L),
            pWritableAttrs: MutPtr = MutPtr(0L),
        ): Adspropinitparams =
            Adspropinitparams(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hr = hr,
                pDsObjCtorArg = pDsObj,
                pwzCNCtorArg = pwzCN,
                pWritableAttrsCtorArg = pWritableAttrs,
            )
    }
}

public data class Adsvalue(
    public var dwType: Adstype = 0,
    public var anonymous: Adsvalue0 = Adsvalue0(),
)

public class Adsvalue0 internal constructor(
    dNStringCtorArg: MutPtr,
    caseExactStringCtorArg: MutPtr,
    caseIgnoreStringCtorArg: MutPtr,
    printableStringCtorArg: MutPtr,
    numericStringCtorArg: MutPtr,
    public var boolean: UInt,
    public var integer: UInt,
    public var octetString: AdsOctetString,
    public var uTCTime: Systemtime,
    public var largeInteger: Long,
    clsNameCtorArg: MutPtr,
    public var providerSpecific: AdsProvSpecific,
    pCaseIgnoreListCtorArg: MutPtr,
    pOctetListCtorArg: MutPtr,
    pPathCtorArg: MutPtr,
    pPostalAddressCtorArg: MutPtr,
    public var timestamp: AdsTimestamp,
    public var backLink: AdsBacklink,
    pTypedNameCtorArg: MutPtr,
    public var hold: AdsHold,
    pNetAddressCtorArg: MutPtr,
    pReplicaPointerCtorArg: MutPtr,
    pFaxNumberCtorArg: MutPtr,
    public var email: AdsEmail,
    public var securityDescriptor: AdsNtSecurityDescriptor,
    pDNWithBinaryCtorArg: MutPtr,
    pDNWithStringCtorArg: MutPtr,
) {
    public var dNString: MutPtr = dNStringCtorArg
        internal set

    public var caseExactString: MutPtr = caseExactStringCtorArg
        internal set

    public var caseIgnoreString: MutPtr = caseIgnoreStringCtorArg
        internal set

    public var printableString: MutPtr = printableStringCtorArg
        internal set

    public var numericString: MutPtr = numericStringCtorArg
        internal set

    public var clsName: MutPtr = clsNameCtorArg
        internal set

    public var pCaseIgnoreList: MutPtr = pCaseIgnoreListCtorArg
        internal set

    public var pOctetList: MutPtr = pOctetListCtorArg
        internal set

    public var pPath: MutPtr = pPathCtorArg
        internal set

    public var pPostalAddress: MutPtr = pPostalAddressCtorArg
        internal set

    public var pTypedName: MutPtr = pTypedNameCtorArg
        internal set

    public var pNetAddress: MutPtr = pNetAddressCtorArg
        internal set

    public var pReplicaPointer: MutPtr = pReplicaPointerCtorArg
        internal set

    public var pFaxNumber: MutPtr = pFaxNumberCtorArg
        internal set

    public var pDNWithBinary: MutPtr = pDNWithBinaryCtorArg
        internal set

    public var pDNWithString: MutPtr = pDNWithStringCtorArg
        internal set

    public constructor() : this(
        dNStringCtorArg = MutPtr(0L),
        caseExactStringCtorArg = MutPtr(0L),
        caseIgnoreStringCtorArg = MutPtr(0L),
        printableStringCtorArg = MutPtr(0L),
        numericStringCtorArg = MutPtr(0L),
        boolean = 0u,
        integer = 0u,
        octetString = AdsOctetString(),
        uTCTime = Systemtime(),
        largeInteger = 0L,
        clsNameCtorArg = MutPtr(0L),
        providerSpecific = AdsProvSpecific(),
        pCaseIgnoreListCtorArg = MutPtr(0L),
        pOctetListCtorArg = MutPtr(0L),
        pPathCtorArg = MutPtr(0L),
        pPostalAddressCtorArg = MutPtr(0L),
        timestamp = AdsTimestamp(),
        backLink = AdsBacklink(),
        pTypedNameCtorArg = MutPtr(0L),
        hold = AdsHold(),
        pNetAddressCtorArg = MutPtr(0L),
        pReplicaPointerCtorArg = MutPtr(0L),
        pFaxNumberCtorArg = MutPtr(0L),
        email = AdsEmail(),
        securityDescriptor = AdsNtSecurityDescriptor(),
        pDNWithBinaryCtorArg = MutPtr(0L),
        pDNWithStringCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dNString: MutPtr = MutPtr(0L),
            caseExactString: MutPtr = MutPtr(0L),
            caseIgnoreString: MutPtr = MutPtr(0L),
            printableString: MutPtr = MutPtr(0L),
            numericString: MutPtr = MutPtr(0L),
            boolean: UInt = 0u,
            integer: UInt = 0u,
            octetString: AdsOctetString = AdsOctetString(),
            uTCTime: Systemtime = Systemtime(),
            largeInteger: Long = 0L,
            clsName: MutPtr = MutPtr(0L),
            providerSpecific: AdsProvSpecific = AdsProvSpecific(),
            pCaseIgnoreList: MutPtr = MutPtr(0L),
            pOctetList: MutPtr = MutPtr(0L),
            pPath: MutPtr = MutPtr(0L),
            pPostalAddress: MutPtr = MutPtr(0L),
            timestamp: AdsTimestamp = AdsTimestamp(),
            backLink: AdsBacklink = AdsBacklink(),
            pTypedName: MutPtr = MutPtr(0L),
            hold: AdsHold = AdsHold(),
            pNetAddress: MutPtr = MutPtr(0L),
            pReplicaPointer: MutPtr = MutPtr(0L),
            pFaxNumber: MutPtr = MutPtr(0L),
            email: AdsEmail = AdsEmail(),
            securityDescriptor: AdsNtSecurityDescriptor = AdsNtSecurityDescriptor(),
            pDNWithBinary: MutPtr = MutPtr(0L),
            pDNWithString: MutPtr = MutPtr(0L),
        ): Adsvalue0 =
            Adsvalue0(
                dNStringCtorArg = dNString,
                caseExactStringCtorArg = caseExactString,
                caseIgnoreStringCtorArg = caseIgnoreString,
                printableStringCtorArg = printableString,
                numericStringCtorArg = numericString,
                boolean = boolean,
                integer = integer,
                octetString = octetString,
                uTCTime = uTCTime,
                largeInteger = largeInteger,
                clsNameCtorArg = clsName,
                providerSpecific = providerSpecific,
                pCaseIgnoreListCtorArg = pCaseIgnoreList,
                pOctetListCtorArg = pOctetList,
                pPathCtorArg = pPath,
                pPostalAddressCtorArg = pPostalAddress,
                timestamp = timestamp,
                backLink = backLink,
                pTypedNameCtorArg = pTypedName,
                hold = hold,
                pNetAddressCtorArg = pNetAddress,
                pReplicaPointerCtorArg = pReplicaPointer,
                pFaxNumberCtorArg = pFaxNumber,
                email = email,
                securityDescriptor = securityDescriptor,
                pDNWithBinaryCtorArg = pDNWithBinary,
                pDNWithStringCtorArg = pDNWithString,
            )
    }
}

public class AdsAttrDef internal constructor(
    pszAttrNameCtorArg: Pwstr,
    public var dwADsType: Adstype,
    public var dwMinRange: UInt,
    public var dwMaxRange: UInt,
    public var fMultiValued: Bool,
) {
    public var pszAttrName: Pwstr = pszAttrNameCtorArg
        internal set

    public constructor() : this(
        pszAttrNameCtorArg = MutPtr(0L),
        dwADsType = 0,
        dwMinRange = 0u,
        dwMaxRange = 0u,
        fMultiValued = 0,
    )

    public operator fun component1(): Pwstr = this.pszAttrName

    public operator fun component2(): Adstype = this.dwADsType

    public operator fun component3(): UInt = this.dwMinRange

    public operator fun component4(): UInt = this.dwMaxRange

    public operator fun component5(): Bool = this.fMultiValued

    public fun copy(pszAttrName: Pwstr = this.pszAttrName, dwADsType: Adstype = this.dwADsType, dwMinRange: UInt = this.dwMinRange, dwMaxRange: UInt = this.dwMaxRange, fMultiValued: Bool = this.fMultiValued): AdsAttrDef = AdsAttrDef(pszAttrNameCtorArg = pszAttrName, dwADsType = dwADsType, dwMinRange = dwMinRange, dwMaxRange = dwMaxRange, fMultiValued = fMultiValued)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsAttrDef) return false
        if (this.pszAttrName != other.pszAttrName) return false
        if (this.dwADsType != other.dwADsType) return false
        if (this.dwMinRange != other.dwMinRange) return false
        if (this.dwMaxRange != other.dwMaxRange) return false
        if (this.fMultiValued != other.fMultiValued) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttrName.hashCode()
        result = 31 * result + this.dwADsType.hashCode()
        result = 31 * result + this.dwMinRange.hashCode()
        result = 31 * result + this.dwMaxRange.hashCode()
        result = 31 * result + this.fMultiValued.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttrName: Pwstr = MutPtr(0L),
            dwADsType: Adstype = 0,
            dwMinRange: UInt = 0u,
            dwMaxRange: UInt = 0u,
            fMultiValued: Bool = 0,
        ): AdsAttrDef =
            AdsAttrDef(
                pszAttrNameCtorArg = pszAttrName,
                dwADsType = dwADsType,
                dwMinRange = dwMinRange,
                dwMaxRange = dwMaxRange,
                fMultiValued = fMultiValued,
            )
    }
}

public class AdsAttrInfo internal constructor(
    pszAttrNameCtorArg: Pwstr,
    public var dwControlCode: UInt,
    public var dwADsType: Adstype,
    pADsValuesCtorArg: MutPtr,
    public var dwNumValues: UInt,
) {
    public var pszAttrName: Pwstr = pszAttrNameCtorArg
        internal set

    public var pADsValues: MutPtr = pADsValuesCtorArg
        internal set

    public constructor() : this(
        pszAttrNameCtorArg = MutPtr(0L),
        dwControlCode = 0u,
        dwADsType = 0,
        pADsValuesCtorArg = MutPtr(0L),
        dwNumValues = 0u,
    )

    public operator fun component1(): Pwstr = this.pszAttrName

    public operator fun component2(): UInt = this.dwControlCode

    public operator fun component3(): Adstype = this.dwADsType

    public operator fun component4(): MutPtr = this.pADsValues

    public operator fun component5(): UInt = this.dwNumValues

    public fun copy(pszAttrName: Pwstr = this.pszAttrName, dwControlCode: UInt = this.dwControlCode, dwADsType: Adstype = this.dwADsType, pADsValues: MutPtr = this.pADsValues, dwNumValues: UInt = this.dwNumValues): AdsAttrInfo = AdsAttrInfo(pszAttrNameCtorArg = pszAttrName, dwControlCode = dwControlCode, dwADsType = dwADsType, pADsValuesCtorArg = pADsValues, dwNumValues = dwNumValues)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsAttrInfo) return false
        if (this.pszAttrName != other.pszAttrName) return false
        if (this.dwControlCode != other.dwControlCode) return false
        if (this.dwADsType != other.dwADsType) return false
        if (this.pADsValues != other.pADsValues) return false
        if (this.dwNumValues != other.dwNumValues) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttrName.hashCode()
        result = 31 * result + this.dwControlCode.hashCode()
        result = 31 * result + this.dwADsType.hashCode()
        result = 31 * result + this.pADsValues.hashCode()
        result = 31 * result + this.dwNumValues.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttrName: Pwstr = MutPtr(0L),
            dwControlCode: UInt = 0u,
            dwADsType: Adstype = 0,
            pADsValues: MutPtr = MutPtr(0L),
            dwNumValues: UInt = 0u,
        ): AdsAttrInfo =
            AdsAttrInfo(
                pszAttrNameCtorArg = pszAttrName,
                dwControlCode = dwControlCode,
                dwADsType = dwADsType,
                pADsValuesCtorArg = pADsValues,
                dwNumValues = dwNumValues,
            )
    }
}

public class AdsBacklink internal constructor(
    public var remoteID: UInt,
    objectNameCtorArg: Pwstr,
) {
    public var objectName: Pwstr = objectNameCtorArg
        internal set

    public constructor() : this(
        remoteID = 0u,
        objectNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.remoteID

    public operator fun component2(): Pwstr = this.objectName

    public fun copy(remoteID: UInt = this.remoteID, objectName: Pwstr = this.objectName): AdsBacklink = AdsBacklink(remoteID = remoteID, objectNameCtorArg = objectName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsBacklink) return false
        if (this.remoteID != other.remoteID) return false
        if (this.objectName != other.objectName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteID.hashCode()
        result = 31 * result + this.objectName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            remoteID: UInt = 0u,
            objectName: Pwstr = MutPtr(0L),
        ): AdsBacklink =
            AdsBacklink(
                remoteID = remoteID,
                objectNameCtorArg = objectName,
            )
    }
}

public class AdsCaseignoreList internal constructor(
    nextCtorArg: MutPtr,
    stringCtorArg: Pwstr,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public var string: Pwstr = stringCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        stringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.next

    public operator fun component2(): Pwstr = this.string

    public fun copy(next: MutPtr = this.next, string: Pwstr = this.string): AdsCaseignoreList = AdsCaseignoreList(nextCtorArg = next, stringCtorArg = string)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsCaseignoreList) return false
        if (this.next != other.next) return false
        if (this.string != other.string) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.string.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
            string: Pwstr = MutPtr(0L),
        ): AdsCaseignoreList =
            AdsCaseignoreList(
                nextCtorArg = next,
                stringCtorArg = string,
            )
    }
}

public class AdsClassDef internal constructor(
    pszClassNameCtorArg: Pwstr,
    public var dwMandatoryAttrs: UInt,
    ppszMandatoryAttrsCtorArg: MutPtr,
    public var optionalAttrs: UInt,
    ppszOptionalAttrsCtorArg: MutPtr,
    public var dwNamingAttrs: UInt,
    ppszNamingAttrsCtorArg: MutPtr,
    public var dwSuperClasses: UInt,
    ppszSuperClassesCtorArg: MutPtr,
    public var fIsContainer: Bool,
) {
    public var pszClassName: Pwstr = pszClassNameCtorArg
        internal set

    public var ppszMandatoryAttrs: MutPtr = ppszMandatoryAttrsCtorArg
        internal set

    public var ppszOptionalAttrs: MutPtr = ppszOptionalAttrsCtorArg
        internal set

    public var ppszNamingAttrs: MutPtr = ppszNamingAttrsCtorArg
        internal set

    public var ppszSuperClasses: MutPtr = ppszSuperClassesCtorArg
        internal set

    public constructor() : this(
        pszClassNameCtorArg = MutPtr(0L),
        dwMandatoryAttrs = 0u,
        ppszMandatoryAttrsCtorArg = MutPtr(0L),
        optionalAttrs = 0u,
        ppszOptionalAttrsCtorArg = MutPtr(0L),
        dwNamingAttrs = 0u,
        ppszNamingAttrsCtorArg = MutPtr(0L),
        dwSuperClasses = 0u,
        ppszSuperClassesCtorArg = MutPtr(0L),
        fIsContainer = 0,
    )

    public operator fun component1(): Pwstr = this.pszClassName

    public operator fun component2(): UInt = this.dwMandatoryAttrs

    public operator fun component3(): MutPtr = this.ppszMandatoryAttrs

    public operator fun component4(): UInt = this.optionalAttrs

    public operator fun component5(): MutPtr = this.ppszOptionalAttrs

    public operator fun component6(): UInt = this.dwNamingAttrs

    public operator fun component7(): MutPtr = this.ppszNamingAttrs

    public operator fun component8(): UInt = this.dwSuperClasses

    public operator fun component9(): MutPtr = this.ppszSuperClasses

    public operator fun component10(): Bool = this.fIsContainer

    public fun copy(pszClassName: Pwstr = this.pszClassName, dwMandatoryAttrs: UInt = this.dwMandatoryAttrs, ppszMandatoryAttrs: MutPtr = this.ppszMandatoryAttrs, optionalAttrs: UInt = this.optionalAttrs, ppszOptionalAttrs: MutPtr = this.ppszOptionalAttrs, dwNamingAttrs: UInt = this.dwNamingAttrs, ppszNamingAttrs: MutPtr = this.ppszNamingAttrs, dwSuperClasses: UInt = this.dwSuperClasses, ppszSuperClasses: MutPtr = this.ppszSuperClasses, fIsContainer: Bool = this.fIsContainer): AdsClassDef = AdsClassDef(pszClassNameCtorArg = pszClassName, dwMandatoryAttrs = dwMandatoryAttrs, ppszMandatoryAttrsCtorArg = ppszMandatoryAttrs, optionalAttrs = optionalAttrs, ppszOptionalAttrsCtorArg = ppszOptionalAttrs, dwNamingAttrs = dwNamingAttrs, ppszNamingAttrsCtorArg = ppszNamingAttrs, dwSuperClasses = dwSuperClasses, ppszSuperClassesCtorArg = ppszSuperClasses, fIsContainer = fIsContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsClassDef) return false
        if (this.pszClassName != other.pszClassName) return false
        if (this.dwMandatoryAttrs != other.dwMandatoryAttrs) return false
        if (this.ppszMandatoryAttrs != other.ppszMandatoryAttrs) return false
        if (this.optionalAttrs != other.optionalAttrs) return false
        if (this.ppszOptionalAttrs != other.ppszOptionalAttrs) return false
        if (this.dwNamingAttrs != other.dwNamingAttrs) return false
        if (this.ppszNamingAttrs != other.ppszNamingAttrs) return false
        if (this.dwSuperClasses != other.dwSuperClasses) return false
        if (this.ppszSuperClasses != other.ppszSuperClasses) return false
        if (this.fIsContainer != other.fIsContainer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszClassName.hashCode()
        result = 31 * result + this.dwMandatoryAttrs.hashCode()
        result = 31 * result + this.ppszMandatoryAttrs.hashCode()
        result = 31 * result + this.optionalAttrs.hashCode()
        result = 31 * result + this.ppszOptionalAttrs.hashCode()
        result = 31 * result + this.dwNamingAttrs.hashCode()
        result = 31 * result + this.ppszNamingAttrs.hashCode()
        result = 31 * result + this.dwSuperClasses.hashCode()
        result = 31 * result + this.ppszSuperClasses.hashCode()
        result = 31 * result + this.fIsContainer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszClassName: Pwstr = MutPtr(0L),
            dwMandatoryAttrs: UInt = 0u,
            ppszMandatoryAttrs: MutPtr = MutPtr(0L),
            optionalAttrs: UInt = 0u,
            ppszOptionalAttrs: MutPtr = MutPtr(0L),
            dwNamingAttrs: UInt = 0u,
            ppszNamingAttrs: MutPtr = MutPtr(0L),
            dwSuperClasses: UInt = 0u,
            ppszSuperClasses: MutPtr = MutPtr(0L),
            fIsContainer: Bool = 0,
        ): AdsClassDef =
            AdsClassDef(
                pszClassNameCtorArg = pszClassName,
                dwMandatoryAttrs = dwMandatoryAttrs,
                ppszMandatoryAttrsCtorArg = ppszMandatoryAttrs,
                optionalAttrs = optionalAttrs,
                ppszOptionalAttrsCtorArg = ppszOptionalAttrs,
                dwNamingAttrs = dwNamingAttrs,
                ppszNamingAttrsCtorArg = ppszNamingAttrs,
                dwSuperClasses = dwSuperClasses,
                ppszSuperClassesCtorArg = ppszSuperClasses,
                fIsContainer = fIsContainer,
            )
    }
}

public class AdsDnWithBinary internal constructor(
    public var dwLength: UInt,
    lpBinaryValueCtorArg: MutPtr,
    pszDNStringCtorArg: Pwstr,
) {
    public var lpBinaryValue: MutPtr = lpBinaryValueCtorArg
        internal set

    public var pszDNString: Pwstr = pszDNStringCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        lpBinaryValueCtorArg = MutPtr(0L),
        pszDNStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): MutPtr = this.lpBinaryValue

    public operator fun component3(): Pwstr = this.pszDNString

    public fun copy(dwLength: UInt = this.dwLength, lpBinaryValue: MutPtr = this.lpBinaryValue, pszDNString: Pwstr = this.pszDNString): AdsDnWithBinary = AdsDnWithBinary(dwLength = dwLength, lpBinaryValueCtorArg = lpBinaryValue, pszDNStringCtorArg = pszDNString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsDnWithBinary) return false
        if (this.dwLength != other.dwLength) return false
        if (this.lpBinaryValue != other.lpBinaryValue) return false
        if (this.pszDNString != other.pszDNString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.lpBinaryValue.hashCode()
        result = 31 * result + this.pszDNString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwLength: UInt = 0u,
            lpBinaryValue: MutPtr = MutPtr(0L),
            pszDNString: Pwstr = MutPtr(0L),
        ): AdsDnWithBinary =
            AdsDnWithBinary(
                dwLength = dwLength,
                lpBinaryValueCtorArg = lpBinaryValue,
                pszDNStringCtorArg = pszDNString,
            )
    }
}

public class AdsDnWithString internal constructor(
    pszStringValueCtorArg: Pwstr,
    pszDNStringCtorArg: Pwstr,
) {
    public var pszStringValue: Pwstr = pszStringValueCtorArg
        internal set

    public var pszDNString: Pwstr = pszDNStringCtorArg
        internal set

    public constructor() : this(
        pszStringValueCtorArg = MutPtr(0L),
        pszDNStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszStringValue

    public operator fun component2(): Pwstr = this.pszDNString

    public fun copy(pszStringValue: Pwstr = this.pszStringValue, pszDNString: Pwstr = this.pszDNString): AdsDnWithString = AdsDnWithString(pszStringValueCtorArg = pszStringValue, pszDNStringCtorArg = pszDNString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsDnWithString) return false
        if (this.pszStringValue != other.pszStringValue) return false
        if (this.pszDNString != other.pszDNString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszStringValue.hashCode()
        result = 31 * result + this.pszDNString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszStringValue: Pwstr = MutPtr(0L),
            pszDNString: Pwstr = MutPtr(0L),
        ): AdsDnWithString =
            AdsDnWithString(
                pszStringValueCtorArg = pszStringValue,
                pszDNStringCtorArg = pszDNString,
            )
    }
}

public class AdsEmail internal constructor(
    addressCtorArg: Pwstr,
    public var type: UInt,
) {
    public var address: Pwstr = addressCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        type = 0u,
    )

    public operator fun component1(): Pwstr = this.address

    public operator fun component2(): UInt = this.type

    public fun copy(address: Pwstr = this.address, type: UInt = this.type): AdsEmail = AdsEmail(addressCtorArg = address, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsEmail) return false
        if (this.address != other.address) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: Pwstr = MutPtr(0L),
            type: UInt = 0u,
        ): AdsEmail =
            AdsEmail(
                addressCtorArg = address,
                type = type,
            )
    }
}

public class AdsFaxnumber internal constructor(
    telephoneNumberCtorArg: Pwstr,
    public var numberOfBits: UInt,
    parametersCtorArg: MutPtr,
) {
    public var telephoneNumber: Pwstr = telephoneNumberCtorArg
        internal set

    public var parameters: MutPtr = parametersCtorArg
        internal set

    public constructor() : this(
        telephoneNumberCtorArg = MutPtr(0L),
        numberOfBits = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.telephoneNumber

    public operator fun component2(): UInt = this.numberOfBits

    public operator fun component3(): MutPtr = this.parameters

    public fun copy(telephoneNumber: Pwstr = this.telephoneNumber, numberOfBits: UInt = this.numberOfBits, parameters: MutPtr = this.parameters): AdsFaxnumber = AdsFaxnumber(telephoneNumberCtorArg = telephoneNumber, numberOfBits = numberOfBits, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsFaxnumber) return false
        if (this.telephoneNumber != other.telephoneNumber) return false
        if (this.numberOfBits != other.numberOfBits) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.telephoneNumber.hashCode()
        result = 31 * result + this.numberOfBits.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            telephoneNumber: Pwstr = MutPtr(0L),
            numberOfBits: UInt = 0u,
            parameters: MutPtr = MutPtr(0L),
        ): AdsFaxnumber =
            AdsFaxnumber(
                telephoneNumberCtorArg = telephoneNumber,
                numberOfBits = numberOfBits,
                parametersCtorArg = parameters,
            )
    }
}

public class AdsHold internal constructor(
    objectNameCtorArg: Pwstr,
    public var amount: UInt,
) {
    public var objectName: Pwstr = objectNameCtorArg
        internal set

    public constructor() : this(
        objectNameCtorArg = MutPtr(0L),
        amount = 0u,
    )

    public operator fun component1(): Pwstr = this.objectName

    public operator fun component2(): UInt = this.amount

    public fun copy(objectName: Pwstr = this.objectName, amount: UInt = this.amount): AdsHold = AdsHold(objectNameCtorArg = objectName, amount = amount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsHold) return false
        if (this.objectName != other.objectName) return false
        if (this.amount != other.amount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectName.hashCode()
        result = 31 * result + this.amount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectName: Pwstr = MutPtr(0L),
            amount: UInt = 0u,
        ): AdsHold =
            AdsHold(
                objectNameCtorArg = objectName,
                amount = amount,
            )
    }
}

public class AdsNetaddress internal constructor(
    public var addressType: UInt,
    public var addressLength: UInt,
    addressCtorArg: MutPtr,
) {
    public var address: MutPtr = addressCtorArg
        internal set

    public constructor() : this(
        addressType = 0u,
        addressLength = 0u,
        addressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.addressType

    public operator fun component2(): UInt = this.addressLength

    public operator fun component3(): MutPtr = this.address

    public fun copy(addressType: UInt = this.addressType, addressLength: UInt = this.addressLength, address: MutPtr = this.address): AdsNetaddress = AdsNetaddress(addressType = addressType, addressLength = addressLength, addressCtorArg = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsNetaddress) return false
        if (this.addressType != other.addressType) return false
        if (this.addressLength != other.addressLength) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.addressLength.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsNetaddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsNetaddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AdsNetaddress =
                    AdsNetaddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AdsNetaddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.addressLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.address)
                }
            }

        public operator fun invoke(
            addressType: UInt = 0u,
            addressLength: UInt = 0u,
            address: MutPtr = MutPtr(0L),
        ): AdsNetaddress =
            AdsNetaddress(
                addressType = addressType,
                addressLength = addressLength,
                addressCtorArg = address,
            )
    }
}

public class AdsNtSecurityDescriptor internal constructor(
    public var dwLength: UInt,
    lpValueCtorArg: MutPtr,
) {
    public var lpValue: MutPtr = lpValueCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): MutPtr = this.lpValue

    public fun copy(dwLength: UInt = this.dwLength, lpValue: MutPtr = this.lpValue): AdsNtSecurityDescriptor = AdsNtSecurityDescriptor(dwLength = dwLength, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsNtSecurityDescriptor) return false
        if (this.dwLength != other.dwLength) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsNtSecurityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsNtSecurityDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AdsNtSecurityDescriptor =
                    AdsNtSecurityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AdsNtSecurityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpValue)
                }
            }

        public operator fun invoke(
            dwLength: UInt = 0u,
            lpValue: MutPtr = MutPtr(0L),
        ): AdsNtSecurityDescriptor =
            AdsNtSecurityDescriptor(
                dwLength = dwLength,
                lpValueCtorArg = lpValue,
            )
    }
}

public class AdsObjectInfo internal constructor(
    pszRDNCtorArg: Pwstr,
    pszObjectDNCtorArg: Pwstr,
    pszParentDNCtorArg: Pwstr,
    pszSchemaDNCtorArg: Pwstr,
    pszClassNameCtorArg: Pwstr,
) {
    public var pszRDN: Pwstr = pszRDNCtorArg
        internal set

    public var pszObjectDN: Pwstr = pszObjectDNCtorArg
        internal set

    public var pszParentDN: Pwstr = pszParentDNCtorArg
        internal set

    public var pszSchemaDN: Pwstr = pszSchemaDNCtorArg
        internal set

    public var pszClassName: Pwstr = pszClassNameCtorArg
        internal set

    public constructor() : this(
        pszRDNCtorArg = MutPtr(0L),
        pszObjectDNCtorArg = MutPtr(0L),
        pszParentDNCtorArg = MutPtr(0L),
        pszSchemaDNCtorArg = MutPtr(0L),
        pszClassNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszRDN

    public operator fun component2(): Pwstr = this.pszObjectDN

    public operator fun component3(): Pwstr = this.pszParentDN

    public operator fun component4(): Pwstr = this.pszSchemaDN

    public operator fun component5(): Pwstr = this.pszClassName

    public fun copy(pszRDN: Pwstr = this.pszRDN, pszObjectDN: Pwstr = this.pszObjectDN, pszParentDN: Pwstr = this.pszParentDN, pszSchemaDN: Pwstr = this.pszSchemaDN, pszClassName: Pwstr = this.pszClassName): AdsObjectInfo = AdsObjectInfo(pszRDNCtorArg = pszRDN, pszObjectDNCtorArg = pszObjectDN, pszParentDNCtorArg = pszParentDN, pszSchemaDNCtorArg = pszSchemaDN, pszClassNameCtorArg = pszClassName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsObjectInfo) return false
        if (this.pszRDN != other.pszRDN) return false
        if (this.pszObjectDN != other.pszObjectDN) return false
        if (this.pszParentDN != other.pszParentDN) return false
        if (this.pszSchemaDN != other.pszSchemaDN) return false
        if (this.pszClassName != other.pszClassName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszRDN.hashCode()
        result = 31 * result + this.pszObjectDN.hashCode()
        result = 31 * result + this.pszParentDN.hashCode()
        result = 31 * result + this.pszSchemaDN.hashCode()
        result = 31 * result + this.pszClassName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszRDN: Pwstr = MutPtr(0L),
            pszObjectDN: Pwstr = MutPtr(0L),
            pszParentDN: Pwstr = MutPtr(0L),
            pszSchemaDN: Pwstr = MutPtr(0L),
            pszClassName: Pwstr = MutPtr(0L),
        ): AdsObjectInfo =
            AdsObjectInfo(
                pszRDNCtorArg = pszRDN,
                pszObjectDNCtorArg = pszObjectDN,
                pszParentDNCtorArg = pszParentDN,
                pszSchemaDNCtorArg = pszSchemaDN,
                pszClassNameCtorArg = pszClassName,
            )
    }
}

public class AdsOctetList internal constructor(
    nextCtorArg: MutPtr,
    public var length: UInt,
    dataCtorArg: MutPtr,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public var data: MutPtr = dataCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        length = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.next

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr = this.data

    public fun copy(next: MutPtr = this.next, length: UInt = this.length, data: MutPtr = this.data): AdsOctetList = AdsOctetList(nextCtorArg = next, length = length, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsOctetList) return false
        if (this.next != other.next) return false
        if (this.length != other.length) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsOctetList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsOctetList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AdsOctetList =
                    AdsOctetList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AdsOctetList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.data)
                }
            }

        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            data: MutPtr = MutPtr(0L),
        ): AdsOctetList =
            AdsOctetList(
                nextCtorArg = next,
                length = length,
                dataCtorArg = data,
            )
    }
}

public class AdsOctetString internal constructor(
    public var dwLength: UInt,
    lpValueCtorArg: MutPtr,
) {
    public var lpValue: MutPtr = lpValueCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): MutPtr = this.lpValue

    public fun copy(dwLength: UInt = this.dwLength, lpValue: MutPtr = this.lpValue): AdsOctetString = AdsOctetString(dwLength = dwLength, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsOctetString) return false
        if (this.dwLength != other.dwLength) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsOctetString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsOctetString> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AdsOctetString =
                    AdsOctetString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AdsOctetString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpValue)
                }
            }

        public operator fun invoke(
            dwLength: UInt = 0u,
            lpValue: MutPtr = MutPtr(0L),
        ): AdsOctetString =
            AdsOctetString(
                dwLength = dwLength,
                lpValueCtorArg = lpValue,
            )
    }
}

public class AdsPath internal constructor(
    public var type: UInt,
    volumeNameCtorArg: Pwstr,
    pathCtorArg: Pwstr,
) {
    public var volumeName: Pwstr = volumeNameCtorArg
        internal set

    public var path: Pwstr = pathCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        volumeNameCtorArg = MutPtr(0L),
        pathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): Pwstr = this.volumeName

    public operator fun component3(): Pwstr = this.path

    public fun copy(type: UInt = this.type, volumeName: Pwstr = this.volumeName, path: Pwstr = this.path): AdsPath = AdsPath(type = type, volumeNameCtorArg = volumeName, pathCtorArg = path)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsPath) return false
        if (this.type != other.type) return false
        if (this.volumeName != other.volumeName) return false
        if (this.path != other.path) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.volumeName.hashCode()
        result = 31 * result + this.path.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UInt = 0u,
            volumeName: Pwstr = MutPtr(0L),
            path: Pwstr = MutPtr(0L),
        ): AdsPath =
            AdsPath(
                type = type,
                volumeNameCtorArg = volumeName,
                pathCtorArg = path,
            )
    }
}

public class AdsPostaladdress internal constructor(
    postalAddressCtorArg: List<Pwstr>,
) {
    public var postalAddress: List<Pwstr> = postalAddressCtorArg
        internal set

    public constructor() : this(
        postalAddressCtorArg = List(6) { MutPtr(0L) },
    )

    public operator fun component1(): List<Pwstr> = this.postalAddress

    public fun copy(postalAddress: List<Pwstr> = this.postalAddress): AdsPostaladdress = AdsPostaladdress(postalAddressCtorArg = postalAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsPostaladdress) return false
        if (this.postalAddress != other.postalAddress) return false
        return true
    }

    override fun hashCode(): Int = this.postalAddress.hashCode()

    public companion object {
        public operator fun invoke(
            postalAddress: List<Pwstr> = List(6) { MutPtr(0L) },
        ): AdsPostaladdress =
            AdsPostaladdress(
                postalAddressCtorArg = postalAddress,
            )
    }
}

public class AdsProvSpecific internal constructor(
    public var dwLength: UInt,
    lpValueCtorArg: MutPtr,
) {
    public var lpValue: MutPtr = lpValueCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): MutPtr = this.lpValue

    public fun copy(dwLength: UInt = this.dwLength, lpValue: MutPtr = this.lpValue): AdsProvSpecific = AdsProvSpecific(dwLength = dwLength, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsProvSpecific) return false
        if (this.dwLength != other.dwLength) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsProvSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsProvSpecific> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AdsProvSpecific =
                    AdsProvSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AdsProvSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpValue)
                }
            }

        public operator fun invoke(
            dwLength: UInt = 0u,
            lpValue: MutPtr = MutPtr(0L),
        ): AdsProvSpecific =
            AdsProvSpecific(
                dwLength = dwLength,
                lpValueCtorArg = lpValue,
            )
    }
}

public class AdsReplicapointer internal constructor(
    serverNameCtorArg: Pwstr,
    public var replicaType: UInt,
    public var replicaNumber: UInt,
    public var count: UInt,
    replicaAddressHintsCtorArg: MutPtr,
) {
    public var serverName: Pwstr = serverNameCtorArg
        internal set

    public var replicaAddressHints: MutPtr = replicaAddressHintsCtorArg
        internal set

    public constructor() : this(
        serverNameCtorArg = MutPtr(0L),
        replicaType = 0u,
        replicaNumber = 0u,
        count = 0u,
        replicaAddressHintsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.serverName

    public operator fun component2(): UInt = this.replicaType

    public operator fun component3(): UInt = this.replicaNumber

    public operator fun component4(): UInt = this.count

    public operator fun component5(): MutPtr = this.replicaAddressHints

    public fun copy(serverName: Pwstr = this.serverName, replicaType: UInt = this.replicaType, replicaNumber: UInt = this.replicaNumber, count: UInt = this.count, replicaAddressHints: MutPtr = this.replicaAddressHints): AdsReplicapointer = AdsReplicapointer(serverNameCtorArg = serverName, replicaType = replicaType, replicaNumber = replicaNumber, count = count, replicaAddressHintsCtorArg = replicaAddressHints)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsReplicapointer) return false
        if (this.serverName != other.serverName) return false
        if (this.replicaType != other.replicaType) return false
        if (this.replicaNumber != other.replicaNumber) return false
        if (this.count != other.count) return false
        if (this.replicaAddressHints != other.replicaAddressHints) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serverName.hashCode()
        result = 31 * result + this.replicaType.hashCode()
        result = 31 * result + this.replicaNumber.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.replicaAddressHints.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serverName: Pwstr = MutPtr(0L),
            replicaType: UInt = 0u,
            replicaNumber: UInt = 0u,
            count: UInt = 0u,
            replicaAddressHints: MutPtr = MutPtr(0L),
        ): AdsReplicapointer =
            AdsReplicapointer(
                serverNameCtorArg = serverName,
                replicaType = replicaType,
                replicaNumber = replicaNumber,
                count = count,
                replicaAddressHintsCtorArg = replicaAddressHints,
            )
    }
}

public data class AdsSearchprefInfo(
    public var dwSearchPref: AdsSearchprefEnum = 0,
    public var vValue: Adsvalue = Adsvalue(),
    public var dwStatus: AdsStatusenum = 0,
)

public class AdsSearchColumn internal constructor(
    pszAttrNameCtorArg: Pwstr,
    public var dwADsType: Adstype,
    pADsValuesCtorArg: MutPtr,
    public var dwNumValues: UInt,
    hReservedCtorArg: Handle,
) {
    public var pszAttrName: Pwstr = pszAttrNameCtorArg
        internal set

    public var pADsValues: MutPtr = pADsValuesCtorArg
        internal set

    public var hReserved: Handle = hReservedCtorArg
        internal set

    public constructor() : this(
        pszAttrNameCtorArg = MutPtr(0L),
        dwADsType = 0,
        pADsValuesCtorArg = MutPtr(0L),
        dwNumValues = 0u,
        hReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszAttrName

    public operator fun component2(): Adstype = this.dwADsType

    public operator fun component3(): MutPtr = this.pADsValues

    public operator fun component4(): UInt = this.dwNumValues

    public operator fun component5(): Handle = this.hReserved

    public fun copy(pszAttrName: Pwstr = this.pszAttrName, dwADsType: Adstype = this.dwADsType, pADsValues: MutPtr = this.pADsValues, dwNumValues: UInt = this.dwNumValues, hReserved: Handle = this.hReserved): AdsSearchColumn = AdsSearchColumn(pszAttrNameCtorArg = pszAttrName, dwADsType = dwADsType, pADsValuesCtorArg = pADsValues, dwNumValues = dwNumValues, hReservedCtorArg = hReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsSearchColumn) return false
        if (this.pszAttrName != other.pszAttrName) return false
        if (this.dwADsType != other.dwADsType) return false
        if (this.pADsValues != other.pADsValues) return false
        if (this.dwNumValues != other.dwNumValues) return false
        if (this.hReserved != other.hReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttrName.hashCode()
        result = 31 * result + this.dwADsType.hashCode()
        result = 31 * result + this.pADsValues.hashCode()
        result = 31 * result + this.dwNumValues.hashCode()
        result = 31 * result + this.hReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttrName: Pwstr = MutPtr(0L),
            dwADsType: Adstype = 0,
            pADsValues: MutPtr = MutPtr(0L),
            dwNumValues: UInt = 0u,
            hReserved: Handle = MutPtr(0L),
        ): AdsSearchColumn =
            AdsSearchColumn(
                pszAttrNameCtorArg = pszAttrName,
                dwADsType = dwADsType,
                pADsValuesCtorArg = pADsValues,
                dwNumValues = dwNumValues,
                hReservedCtorArg = hReserved,
            )
    }
}

public class AdsSortkey internal constructor(
    pszAttrTypeCtorArg: Pwstr,
    pszReservedCtorArg: Pwstr,
    public var fReverseorder: Boolean,
) {
    public var pszAttrType: Pwstr = pszAttrTypeCtorArg
        internal set

    public var pszReserved: Pwstr = pszReservedCtorArg
        internal set

    public constructor() : this(
        pszAttrTypeCtorArg = MutPtr(0L),
        pszReservedCtorArg = MutPtr(0L),
        fReverseorder = false,
    )

    public operator fun component1(): Pwstr = this.pszAttrType

    public operator fun component2(): Pwstr = this.pszReserved

    public operator fun component3(): Boolean = this.fReverseorder

    public fun copy(pszAttrType: Pwstr = this.pszAttrType, pszReserved: Pwstr = this.pszReserved, fReverseorder: Boolean = this.fReverseorder): AdsSortkey = AdsSortkey(pszAttrTypeCtorArg = pszAttrType, pszReservedCtorArg = pszReserved, fReverseorder = fReverseorder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsSortkey) return false
        if (this.pszAttrType != other.pszAttrType) return false
        if (this.pszReserved != other.pszReserved) return false
        if (this.fReverseorder != other.fReverseorder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttrType.hashCode()
        result = 31 * result + this.pszReserved.hashCode()
        result = 31 * result + this.fReverseorder.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttrType: Pwstr = MutPtr(0L),
            pszReserved: Pwstr = MutPtr(0L),
            fReverseorder: Boolean = false,
        ): AdsSortkey =
            AdsSortkey(
                pszAttrTypeCtorArg = pszAttrType,
                pszReservedCtorArg = pszReserved,
                fReverseorder = fReverseorder,
            )
    }
}

public data class AdsTimestamp(
    public var wholeSeconds: UInt = 0u,
    public var eventID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsTimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdsTimestamp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AdsTimestamp =
                    AdsTimestamp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AdsTimestamp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wholeSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eventID)
                }
            }
    }
}

public class AdsTypedname internal constructor(
    objectNameCtorArg: Pwstr,
    public var level: UInt,
    public var interval: UInt,
) {
    public var objectName: Pwstr = objectNameCtorArg
        internal set

    public constructor() : this(
        objectNameCtorArg = MutPtr(0L),
        level = 0u,
        interval = 0u,
    )

    public operator fun component1(): Pwstr = this.objectName

    public operator fun component2(): UInt = this.level

    public operator fun component3(): UInt = this.interval

    public fun copy(objectName: Pwstr = this.objectName, level: UInt = this.level, interval: UInt = this.interval): AdsTypedname = AdsTypedname(objectNameCtorArg = objectName, level = level, interval = interval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsTypedname) return false
        if (this.objectName != other.objectName) return false
        if (this.level != other.level) return false
        if (this.interval != other.interval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectName.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.interval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectName: Pwstr = MutPtr(0L),
            level: UInt = 0u,
            interval: UInt = 0u,
        ): AdsTypedname =
            AdsTypedname(
                objectNameCtorArg = objectName,
                level = level,
                interval = interval,
            )
    }
}

public class AdsVlv internal constructor(
    public var dwBeforeCount: UInt,
    public var dwAfterCount: UInt,
    public var dwOffset: UInt,
    public var dwContentCount: UInt,
    pszTargetCtorArg: Pwstr,
    public var dwContextIDLength: UInt,
    lpContextIDCtorArg: MutPtr,
) {
    public var pszTarget: Pwstr = pszTargetCtorArg
        internal set

    public var lpContextID: MutPtr = lpContextIDCtorArg
        internal set

    public constructor() : this(
        dwBeforeCount = 0u,
        dwAfterCount = 0u,
        dwOffset = 0u,
        dwContentCount = 0u,
        pszTargetCtorArg = MutPtr(0L),
        dwContextIDLength = 0u,
        lpContextIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwBeforeCount

    public operator fun component2(): UInt = this.dwAfterCount

    public operator fun component3(): UInt = this.dwOffset

    public operator fun component4(): UInt = this.dwContentCount

    public operator fun component5(): Pwstr = this.pszTarget

    public operator fun component6(): UInt = this.dwContextIDLength

    public operator fun component7(): MutPtr = this.lpContextID

    public fun copy(dwBeforeCount: UInt = this.dwBeforeCount, dwAfterCount: UInt = this.dwAfterCount, dwOffset: UInt = this.dwOffset, dwContentCount: UInt = this.dwContentCount, pszTarget: Pwstr = this.pszTarget, dwContextIDLength: UInt = this.dwContextIDLength, lpContextID: MutPtr = this.lpContextID): AdsVlv = AdsVlv(dwBeforeCount = dwBeforeCount, dwAfterCount = dwAfterCount, dwOffset = dwOffset, dwContentCount = dwContentCount, pszTargetCtorArg = pszTarget, dwContextIDLength = dwContextIDLength, lpContextIDCtorArg = lpContextID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AdsVlv) return false
        if (this.dwBeforeCount != other.dwBeforeCount) return false
        if (this.dwAfterCount != other.dwAfterCount) return false
        if (this.dwOffset != other.dwOffset) return false
        if (this.dwContentCount != other.dwContentCount) return false
        if (this.pszTarget != other.pszTarget) return false
        if (this.dwContextIDLength != other.dwContextIDLength) return false
        if (this.lpContextID != other.lpContextID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBeforeCount.hashCode()
        result = 31 * result + this.dwAfterCount.hashCode()
        result = 31 * result + this.dwOffset.hashCode()
        result = 31 * result + this.dwContentCount.hashCode()
        result = 31 * result + this.pszTarget.hashCode()
        result = 31 * result + this.dwContextIDLength.hashCode()
        result = 31 * result + this.lpContextID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwBeforeCount: UInt = 0u,
            dwAfterCount: UInt = 0u,
            dwOffset: UInt = 0u,
            dwContentCount: UInt = 0u,
            pszTarget: Pwstr = MutPtr(0L),
            dwContextIDLength: UInt = 0u,
            lpContextID: MutPtr = MutPtr(0L),
        ): AdsVlv =
            AdsVlv(
                dwBeforeCount = dwBeforeCount,
                dwAfterCount = dwAfterCount,
                dwOffset = dwOffset,
                dwContentCount = dwContentCount,
                pszTargetCtorArg = pszTarget,
                dwContextIDLength = dwContextIDLength,
                lpContextIDCtorArg = lpContextID,
            )
    }
}

public class Cqform internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var clsid: Guid,
    hIconCtorArg: Hicon,
    pszTitleCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        clsid = Guid(),
        hIconCtorArg = MutPtr(0L),
        pszTitleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Guid = this.clsid

    public operator fun component4(): Hicon = this.hIcon

    public operator fun component5(): Pcwstr = this.pszTitle

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, clsid: Guid = this.clsid, hIcon: Hicon = this.hIcon, pszTitle: Pcwstr = this.pszTitle): Cqform = Cqform(cbStruct = cbStruct, dwFlags = dwFlags, clsid = clsid, hIconCtorArg = hIcon, pszTitleCtorArg = pszTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cqform) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.clsid != other.clsid) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszTitle != other.pszTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            clsid: Guid = Guid(),
            hIcon: Hicon = MutPtr(0L),
            pszTitle: Pcwstr = ConstPtr(0L),
        ): Cqform =
            Cqform(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                clsid = clsid,
                hIconCtorArg = hIcon,
                pszTitleCtorArg = pszTitle,
            )
    }
}

public class Cqpage internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var pPageProc: Lpcqpageproc,
    hInstanceCtorArg: Hinstance,
    public var idPageName: Int,
    public var idPageTemplate: Int,
    public var pDlgProc: Dlgproc,
    public var lParam: Lparam,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        pPageProc = null,
        hInstanceCtorArg = MutPtr(0L),
        idPageName = 0,
        idPageTemplate = 0,
        pDlgProc = null,
        lParam = 0L,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Lpcqpageproc = this.pPageProc

    public operator fun component4(): Hinstance = this.hInstance

    public operator fun component5(): Int = this.idPageName

    public operator fun component6(): Int = this.idPageTemplate

    public operator fun component7(): Dlgproc = this.pDlgProc

    public operator fun component8(): Lparam = this.lParam

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, pPageProc: Lpcqpageproc = this.pPageProc, hInstance: Hinstance = this.hInstance, idPageName: Int = this.idPageName, idPageTemplate: Int = this.idPageTemplate, pDlgProc: Dlgproc = this.pDlgProc, lParam: Lparam = this.lParam): Cqpage = Cqpage(cbStruct = cbStruct, dwFlags = dwFlags, pPageProc = pPageProc, hInstanceCtorArg = hInstance, idPageName = idPageName, idPageTemplate = idPageTemplate, pDlgProc = pDlgProc, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cqpage) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pPageProc != other.pPageProc) return false
        if (this.hInstance != other.hInstance) return false
        if (this.idPageName != other.idPageName) return false
        if (this.idPageTemplate != other.idPageTemplate) return false
        if (this.pDlgProc != other.pDlgProc) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pPageProc.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.idPageName.hashCode()
        result = 31 * result + this.idPageTemplate.hashCode()
        result = 31 * result + this.pDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            pPageProc: Lpcqpageproc = null,
            hInstance: Hinstance = MutPtr(0L),
            idPageName: Int = 0,
            idPageTemplate: Int = 0,
            pDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
        ): Cqpage =
            Cqpage(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                pPageProc = pPageProc,
                hInstanceCtorArg = hInstance,
                idPageName = idPageName,
                idPageTemplate = idPageTemplate,
                pDlgProc = pDlgProc,
                lParam = lParam,
            )
    }
}

public class Domaindesc internal constructor(
    pszNameCtorArg: Pwstr,
    pszPathCtorArg: Pwstr,
    pszNCNameCtorArg: Pwstr,
    pszTrustParentCtorArg: Pwstr,
    pszObjectClassCtorArg: Pwstr,
    public var ulFlags: UInt,
    public var fDownLevel: Bool,
    pdChildListCtorArg: MutPtr,
    pdNextSiblingCtorArg: MutPtr,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszPath: Pwstr = pszPathCtorArg
        internal set

    public var pszNCName: Pwstr = pszNCNameCtorArg
        internal set

    public var pszTrustParent: Pwstr = pszTrustParentCtorArg
        internal set

    public var pszObjectClass: Pwstr = pszObjectClassCtorArg
        internal set

    public var pdChildList: MutPtr = pdChildListCtorArg
        internal set

    public var pdNextSibling: MutPtr = pdNextSiblingCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        pszPathCtorArg = MutPtr(0L),
        pszNCNameCtorArg = MutPtr(0L),
        pszTrustParentCtorArg = MutPtr(0L),
        pszObjectClassCtorArg = MutPtr(0L),
        ulFlags = 0u,
        fDownLevel = 0,
        pdChildListCtorArg = MutPtr(0L),
        pdNextSiblingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): Pwstr = this.pszPath

    public operator fun component3(): Pwstr = this.pszNCName

    public operator fun component4(): Pwstr = this.pszTrustParent

    public operator fun component5(): Pwstr = this.pszObjectClass

    public operator fun component6(): UInt = this.ulFlags

    public operator fun component7(): Bool = this.fDownLevel

    public operator fun component8(): MutPtr = this.pdChildList

    public operator fun component9(): MutPtr = this.pdNextSibling

    public fun copy(pszName: Pwstr = this.pszName, pszPath: Pwstr = this.pszPath, pszNCName: Pwstr = this.pszNCName, pszTrustParent: Pwstr = this.pszTrustParent, pszObjectClass: Pwstr = this.pszObjectClass, ulFlags: UInt = this.ulFlags, fDownLevel: Bool = this.fDownLevel, pdChildList: MutPtr = this.pdChildList, pdNextSibling: MutPtr = this.pdNextSibling): Domaindesc = Domaindesc(pszNameCtorArg = pszName, pszPathCtorArg = pszPath, pszNCNameCtorArg = pszNCName, pszTrustParentCtorArg = pszTrustParent, pszObjectClassCtorArg = pszObjectClass, ulFlags = ulFlags, fDownLevel = fDownLevel, pdChildListCtorArg = pdChildList, pdNextSiblingCtorArg = pdNextSibling)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Domaindesc) return false
        if (this.pszName != other.pszName) return false
        if (this.pszPath != other.pszPath) return false
        if (this.pszNCName != other.pszNCName) return false
        if (this.pszTrustParent != other.pszTrustParent) return false
        if (this.pszObjectClass != other.pszObjectClass) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.fDownLevel != other.fDownLevel) return false
        if (this.pdChildList != other.pdChildList) return false
        if (this.pdNextSibling != other.pdNextSibling) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszPath.hashCode()
        result = 31 * result + this.pszNCName.hashCode()
        result = 31 * result + this.pszTrustParent.hashCode()
        result = 31 * result + this.pszObjectClass.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.fDownLevel.hashCode()
        result = 31 * result + this.pdChildList.hashCode()
        result = 31 * result + this.pdNextSibling.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            pszPath: Pwstr = MutPtr(0L),
            pszNCName: Pwstr = MutPtr(0L),
            pszTrustParent: Pwstr = MutPtr(0L),
            pszObjectClass: Pwstr = MutPtr(0L),
            ulFlags: UInt = 0u,
            fDownLevel: Bool = 0,
            pdChildList: MutPtr = MutPtr(0L),
            pdNextSibling: MutPtr = MutPtr(0L),
        ): Domaindesc =
            Domaindesc(
                pszNameCtorArg = pszName,
                pszPathCtorArg = pszPath,
                pszNCNameCtorArg = pszNCName,
                pszTrustParentCtorArg = pszTrustParent,
                pszObjectClassCtorArg = pszObjectClass,
                ulFlags = ulFlags,
                fDownLevel = fDownLevel,
                pdChildListCtorArg = pdChildList,
                pdNextSiblingCtorArg = pdNextSibling,
            )
    }
}

public class DomainControllerInfoa internal constructor(
    domainControllerNameCtorArg: Pstr,
    domainControllerAddressCtorArg: Pstr,
    public var domainControllerAddressType: UInt,
    public var domainGuid: Guid,
    domainNameCtorArg: Pstr,
    dnsForestNameCtorArg: Pstr,
    public var flags: UInt,
    dcSiteNameCtorArg: Pstr,
    clientSiteNameCtorArg: Pstr,
) {
    public var domainControllerName: Pstr = domainControllerNameCtorArg
        internal set

    public var domainControllerAddress: Pstr = domainControllerAddressCtorArg
        internal set

    public var domainName: Pstr = domainNameCtorArg
        internal set

    public var dnsForestName: Pstr = dnsForestNameCtorArg
        internal set

    public var dcSiteName: Pstr = dcSiteNameCtorArg
        internal set

    public var clientSiteName: Pstr = clientSiteNameCtorArg
        internal set

    public constructor() : this(
        domainControllerNameCtorArg = MutPtr(0L),
        domainControllerAddressCtorArg = MutPtr(0L),
        domainControllerAddressType = 0u,
        domainGuid = Guid(),
        domainNameCtorArg = MutPtr(0L),
        dnsForestNameCtorArg = MutPtr(0L),
        flags = 0u,
        dcSiteNameCtorArg = MutPtr(0L),
        clientSiteNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.domainControllerName

    public operator fun component2(): Pstr = this.domainControllerAddress

    public operator fun component3(): UInt = this.domainControllerAddressType

    public operator fun component4(): Guid = this.domainGuid

    public operator fun component5(): Pstr = this.domainName

    public operator fun component6(): Pstr = this.dnsForestName

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): Pstr = this.dcSiteName

    public operator fun component9(): Pstr = this.clientSiteName

    public fun copy(domainControllerName: Pstr = this.domainControllerName, domainControllerAddress: Pstr = this.domainControllerAddress, domainControllerAddressType: UInt = this.domainControllerAddressType, domainGuid: Guid = this.domainGuid, domainName: Pstr = this.domainName, dnsForestName: Pstr = this.dnsForestName, flags: UInt = this.flags, dcSiteName: Pstr = this.dcSiteName, clientSiteName: Pstr = this.clientSiteName): DomainControllerInfoa = DomainControllerInfoa(domainControllerNameCtorArg = domainControllerName, domainControllerAddressCtorArg = domainControllerAddress, domainControllerAddressType = domainControllerAddressType, domainGuid = domainGuid, domainNameCtorArg = domainName, dnsForestNameCtorArg = dnsForestName, flags = flags, dcSiteNameCtorArg = dcSiteName, clientSiteNameCtorArg = clientSiteName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DomainControllerInfoa) return false
        if (this.domainControllerName != other.domainControllerName) return false
        if (this.domainControllerAddress != other.domainControllerAddress) return false
        if (this.domainControllerAddressType != other.domainControllerAddressType) return false
        if (this.domainGuid != other.domainGuid) return false
        if (this.domainName != other.domainName) return false
        if (this.dnsForestName != other.dnsForestName) return false
        if (this.flags != other.flags) return false
        if (this.dcSiteName != other.dcSiteName) return false
        if (this.clientSiteName != other.clientSiteName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainControllerName.hashCode()
        result = 31 * result + this.domainControllerAddress.hashCode()
        result = 31 * result + this.domainControllerAddressType.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.dnsForestName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dcSiteName.hashCode()
        result = 31 * result + this.clientSiteName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainControllerName: Pstr = MutPtr(0L),
            domainControllerAddress: Pstr = MutPtr(0L),
            domainControllerAddressType: UInt = 0u,
            domainGuid: Guid = Guid(),
            domainName: Pstr = MutPtr(0L),
            dnsForestName: Pstr = MutPtr(0L),
            flags: UInt = 0u,
            dcSiteName: Pstr = MutPtr(0L),
            clientSiteName: Pstr = MutPtr(0L),
        ): DomainControllerInfoa =
            DomainControllerInfoa(
                domainControllerNameCtorArg = domainControllerName,
                domainControllerAddressCtorArg = domainControllerAddress,
                domainControllerAddressType = domainControllerAddressType,
                domainGuid = domainGuid,
                domainNameCtorArg = domainName,
                dnsForestNameCtorArg = dnsForestName,
                flags = flags,
                dcSiteNameCtorArg = dcSiteName,
                clientSiteNameCtorArg = clientSiteName,
            )
    }
}

public class DomainControllerInfow internal constructor(
    domainControllerNameCtorArg: Pwstr,
    domainControllerAddressCtorArg: Pwstr,
    public var domainControllerAddressType: UInt,
    public var domainGuid: Guid,
    domainNameCtorArg: Pwstr,
    dnsForestNameCtorArg: Pwstr,
    public var flags: UInt,
    dcSiteNameCtorArg: Pwstr,
    clientSiteNameCtorArg: Pwstr,
) {
    public var domainControllerName: Pwstr = domainControllerNameCtorArg
        internal set

    public var domainControllerAddress: Pwstr = domainControllerAddressCtorArg
        internal set

    public var domainName: Pwstr = domainNameCtorArg
        internal set

    public var dnsForestName: Pwstr = dnsForestNameCtorArg
        internal set

    public var dcSiteName: Pwstr = dcSiteNameCtorArg
        internal set

    public var clientSiteName: Pwstr = clientSiteNameCtorArg
        internal set

    public constructor() : this(
        domainControllerNameCtorArg = MutPtr(0L),
        domainControllerAddressCtorArg = MutPtr(0L),
        domainControllerAddressType = 0u,
        domainGuid = Guid(),
        domainNameCtorArg = MutPtr(0L),
        dnsForestNameCtorArg = MutPtr(0L),
        flags = 0u,
        dcSiteNameCtorArg = MutPtr(0L),
        clientSiteNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.domainControllerName

    public operator fun component2(): Pwstr = this.domainControllerAddress

    public operator fun component3(): UInt = this.domainControllerAddressType

    public operator fun component4(): Guid = this.domainGuid

    public operator fun component5(): Pwstr = this.domainName

    public operator fun component6(): Pwstr = this.dnsForestName

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): Pwstr = this.dcSiteName

    public operator fun component9(): Pwstr = this.clientSiteName

    public fun copy(domainControllerName: Pwstr = this.domainControllerName, domainControllerAddress: Pwstr = this.domainControllerAddress, domainControllerAddressType: UInt = this.domainControllerAddressType, domainGuid: Guid = this.domainGuid, domainName: Pwstr = this.domainName, dnsForestName: Pwstr = this.dnsForestName, flags: UInt = this.flags, dcSiteName: Pwstr = this.dcSiteName, clientSiteName: Pwstr = this.clientSiteName): DomainControllerInfow = DomainControllerInfow(domainControllerNameCtorArg = domainControllerName, domainControllerAddressCtorArg = domainControllerAddress, domainControllerAddressType = domainControllerAddressType, domainGuid = domainGuid, domainNameCtorArg = domainName, dnsForestNameCtorArg = dnsForestName, flags = flags, dcSiteNameCtorArg = dcSiteName, clientSiteNameCtorArg = clientSiteName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DomainControllerInfow) return false
        if (this.domainControllerName != other.domainControllerName) return false
        if (this.domainControllerAddress != other.domainControllerAddress) return false
        if (this.domainControllerAddressType != other.domainControllerAddressType) return false
        if (this.domainGuid != other.domainGuid) return false
        if (this.domainName != other.domainName) return false
        if (this.dnsForestName != other.dnsForestName) return false
        if (this.flags != other.flags) return false
        if (this.dcSiteName != other.dcSiteName) return false
        if (this.clientSiteName != other.clientSiteName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainControllerName.hashCode()
        result = 31 * result + this.domainControllerAddress.hashCode()
        result = 31 * result + this.domainControllerAddressType.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.dnsForestName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dcSiteName.hashCode()
        result = 31 * result + this.clientSiteName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainControllerName: Pwstr = MutPtr(0L),
            domainControllerAddress: Pwstr = MutPtr(0L),
            domainControllerAddressType: UInt = 0u,
            domainGuid: Guid = Guid(),
            domainName: Pwstr = MutPtr(0L),
            dnsForestName: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            dcSiteName: Pwstr = MutPtr(0L),
            clientSiteName: Pwstr = MutPtr(0L),
        ): DomainControllerInfow =
            DomainControllerInfow(
                domainControllerNameCtorArg = domainControllerName,
                domainControllerAddressCtorArg = domainControllerAddress,
                domainControllerAddressType = domainControllerAddressType,
                domainGuid = domainGuid,
                domainNameCtorArg = domainName,
                dnsForestNameCtorArg = dnsForestName,
                flags = flags,
                dcSiteNameCtorArg = dcSiteName,
                clientSiteNameCtorArg = clientSiteName,
            )
    }
}

public data class DomainTree(
    public var dsSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var aDomains: List<Domaindesc> = List(1) { Domaindesc() },
)

public class DsaNewobjDispinfo internal constructor(
    public var dwSize: UInt,
    hObjClassIconCtorArg: Hicon,
    lpszWizTitleCtorArg: Pwstr,
    lpszContDisplayNameCtorArg: Pwstr,
) {
    public var hObjClassIcon: Hicon = hObjClassIconCtorArg
        internal set

    public var lpszWizTitle: Pwstr = lpszWizTitleCtorArg
        internal set

    public var lpszContDisplayName: Pwstr = lpszContDisplayNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hObjClassIconCtorArg = MutPtr(0L),
        lpszWizTitleCtorArg = MutPtr(0L),
        lpszContDisplayNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hicon = this.hObjClassIcon

    public operator fun component3(): Pwstr = this.lpszWizTitle

    public operator fun component4(): Pwstr = this.lpszContDisplayName

    public fun copy(dwSize: UInt = this.dwSize, hObjClassIcon: Hicon = this.hObjClassIcon, lpszWizTitle: Pwstr = this.lpszWizTitle, lpszContDisplayName: Pwstr = this.lpszContDisplayName): DsaNewobjDispinfo = DsaNewobjDispinfo(dwSize = dwSize, hObjClassIconCtorArg = hObjClassIcon, lpszWizTitleCtorArg = lpszWizTitle, lpszContDisplayNameCtorArg = lpszContDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsaNewobjDispinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hObjClassIcon != other.hObjClassIcon) return false
        if (this.lpszWizTitle != other.lpszWizTitle) return false
        if (this.lpszContDisplayName != other.lpszContDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hObjClassIcon.hashCode()
        result = 31 * result + this.lpszWizTitle.hashCode()
        result = 31 * result + this.lpszContDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hObjClassIcon: Hicon = MutPtr(0L),
            lpszWizTitle: Pwstr = MutPtr(0L),
            lpszContDisplayName: Pwstr = MutPtr(0L),
        ): DsaNewobjDispinfo =
            DsaNewobjDispinfo(
                dwSize = dwSize,
                hObjClassIconCtorArg = hObjClassIcon,
                lpszWizTitleCtorArg = lpszWizTitle,
                lpszContDisplayNameCtorArg = lpszContDisplayName,
            )
    }
}

public class Dsbitema internal constructor(
    public var cbStruct: UInt,
    pszADsPathCtorArg: Pcwstr,
    pszClassCtorArg: Pcwstr,
    public var dwMask: UInt,
    public var dwState: UInt,
    public var dwStateMask: UInt,
    public var szDisplayName: ByteArray,
    public var szIconLocation: ByteArray,
    public var iIconResID: Int,
) {
    public var pszADsPath: Pcwstr = pszADsPathCtorArg
        internal set

    public var pszClass: Pcwstr = pszClassCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pszADsPathCtorArg = ConstPtr(0L),
        pszClassCtorArg = ConstPtr(0L),
        dwMask = 0u,
        dwState = 0u,
        dwStateMask = 0u,
        szDisplayName = ByteArray(64),
        szIconLocation = ByteArray(260),
        iIconResID = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pszADsPath

    public operator fun component3(): Pcwstr = this.pszClass

    public operator fun component4(): UInt = this.dwMask

    public operator fun component5(): UInt = this.dwState

    public operator fun component6(): UInt = this.dwStateMask

    public operator fun component7(): ByteArray = this.szDisplayName

    public operator fun component8(): ByteArray = this.szIconLocation

    public operator fun component9(): Int = this.iIconResID

    public fun copy(cbStruct: UInt = this.cbStruct, pszADsPath: Pcwstr = this.pszADsPath, pszClass: Pcwstr = this.pszClass, dwMask: UInt = this.dwMask, dwState: UInt = this.dwState, dwStateMask: UInt = this.dwStateMask, szDisplayName: ByteArray = this.szDisplayName, szIconLocation: ByteArray = this.szIconLocation, iIconResID: Int = this.iIconResID): Dsbitema = Dsbitema(cbStruct = cbStruct, pszADsPathCtorArg = pszADsPath, pszClassCtorArg = pszClass, dwMask = dwMask, dwState = dwState, dwStateMask = dwStateMask, szDisplayName = szDisplayName, szIconLocation = szIconLocation, iIconResID = iIconResID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbitema) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszADsPath != other.pszADsPath) return false
        if (this.pszClass != other.pszClass) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szIconLocation.contentEquals(other.szIconLocation)) return false
        if (this.iIconResID != other.iIconResID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszADsPath.hashCode()
        result = 31 * result + this.pszClass.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szIconLocation.contentHashCode()
        result = 31 * result + this.iIconResID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pszADsPath: Pcwstr = ConstPtr(0L),
            pszClass: Pcwstr = ConstPtr(0L),
            dwMask: UInt = 0u,
            dwState: UInt = 0u,
            dwStateMask: UInt = 0u,
            szDisplayName: ByteArray = ByteArray(64),
            szIconLocation: ByteArray = ByteArray(260),
            iIconResID: Int = 0,
        ): Dsbitema =
            Dsbitema(
                cbStruct = cbStruct,
                pszADsPathCtorArg = pszADsPath,
                pszClassCtorArg = pszClass,
                dwMask = dwMask,
                dwState = dwState,
                dwStateMask = dwStateMask,
                szDisplayName = szDisplayName,
                szIconLocation = szIconLocation,
                iIconResID = iIconResID,
            )
    }
}

public class Dsbitemw internal constructor(
    public var cbStruct: UInt,
    pszADsPathCtorArg: Pcwstr,
    pszClassCtorArg: Pcwstr,
    public var dwMask: UInt,
    public var dwState: UInt,
    public var dwStateMask: UInt,
    public var szDisplayName: UShortArray,
    public var szIconLocation: UShortArray,
    public var iIconResID: Int,
) {
    public var pszADsPath: Pcwstr = pszADsPathCtorArg
        internal set

    public var pszClass: Pcwstr = pszClassCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pszADsPathCtorArg = ConstPtr(0L),
        pszClassCtorArg = ConstPtr(0L),
        dwMask = 0u,
        dwState = 0u,
        dwStateMask = 0u,
        szDisplayName = UShortArray(64),
        szIconLocation = UShortArray(260),
        iIconResID = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pszADsPath

    public operator fun component3(): Pcwstr = this.pszClass

    public operator fun component4(): UInt = this.dwMask

    public operator fun component5(): UInt = this.dwState

    public operator fun component6(): UInt = this.dwStateMask

    public operator fun component7(): UShortArray = this.szDisplayName

    public operator fun component8(): UShortArray = this.szIconLocation

    public operator fun component9(): Int = this.iIconResID

    public fun copy(cbStruct: UInt = this.cbStruct, pszADsPath: Pcwstr = this.pszADsPath, pszClass: Pcwstr = this.pszClass, dwMask: UInt = this.dwMask, dwState: UInt = this.dwState, dwStateMask: UInt = this.dwStateMask, szDisplayName: UShortArray = this.szDisplayName, szIconLocation: UShortArray = this.szIconLocation, iIconResID: Int = this.iIconResID): Dsbitemw = Dsbitemw(cbStruct = cbStruct, pszADsPathCtorArg = pszADsPath, pszClassCtorArg = pszClass, dwMask = dwMask, dwState = dwState, dwStateMask = dwStateMask, szDisplayName = szDisplayName, szIconLocation = szIconLocation, iIconResID = iIconResID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbitemw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszADsPath != other.pszADsPath) return false
        if (this.pszClass != other.pszClass) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szIconLocation.contentEquals(other.szIconLocation)) return false
        if (this.iIconResID != other.iIconResID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszADsPath.hashCode()
        result = 31 * result + this.pszClass.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szIconLocation.contentHashCode()
        result = 31 * result + this.iIconResID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pszADsPath: Pcwstr = ConstPtr(0L),
            pszClass: Pcwstr = ConstPtr(0L),
            dwMask: UInt = 0u,
            dwState: UInt = 0u,
            dwStateMask: UInt = 0u,
            szDisplayName: UShortArray = UShortArray(64),
            szIconLocation: UShortArray = UShortArray(260),
            iIconResID: Int = 0,
        ): Dsbitemw =
            Dsbitemw(
                cbStruct = cbStruct,
                pszADsPathCtorArg = pszADsPath,
                pszClassCtorArg = pszClass,
                dwMask = dwMask,
                dwState = dwState,
                dwStateMask = dwStateMask,
                szDisplayName = szDisplayName,
                szIconLocation = szIconLocation,
                iIconResID = iIconResID,
            )
    }
}

public class Dsbrowseinfoa internal constructor(
    public var cbStruct: UInt,
    hwndOwnerCtorArg: Hwnd,
    pszCaptionCtorArg: Pcstr,
    pszTitleCtorArg: Pcstr,
    pszRootCtorArg: Pcwstr,
    pszPathCtorArg: Pwstr,
    public var cchPath: UInt,
    public var dwFlags: UInt,
    public var pfnCallback: Bffcallback,
    public var lParam: Lparam,
    public var dwReturnFormat: UInt,
    pUserNameCtorArg: Pcwstr,
    pPasswordCtorArg: Pcwstr,
    pszObjectClassCtorArg: Pwstr,
    public var cchObjectClass: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pszCaption: Pcstr = pszCaptionCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pszRoot: Pcwstr = pszRootCtorArg
        internal set

    public var pszPath: Pwstr = pszPathCtorArg
        internal set

    public var pUserName: Pcwstr = pUserNameCtorArg
        internal set

    public var pPassword: Pcwstr = pPasswordCtorArg
        internal set

    public var pszObjectClass: Pwstr = pszObjectClassCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pszCaptionCtorArg = ConstPtr(0L),
        pszTitleCtorArg = ConstPtr(0L),
        pszRootCtorArg = ConstPtr(0L),
        pszPathCtorArg = MutPtr(0L),
        cchPath = 0u,
        dwFlags = 0u,
        pfnCallback = null,
        lParam = 0L,
        dwReturnFormat = 0u,
        pUserNameCtorArg = ConstPtr(0L),
        pPasswordCtorArg = ConstPtr(0L),
        pszObjectClassCtorArg = MutPtr(0L),
        cchObjectClass = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Pcstr = this.pszCaption

    public operator fun component4(): Pcstr = this.pszTitle

    public operator fun component5(): Pcwstr = this.pszRoot

    public operator fun component6(): Pwstr = this.pszPath

    public operator fun component7(): UInt = this.cchPath

    public operator fun component8(): UInt = this.dwFlags

    public operator fun component9(): Bffcallback = this.pfnCallback

    public operator fun component10(): Lparam = this.lParam

    public operator fun component11(): UInt = this.dwReturnFormat

    public operator fun component12(): Pcwstr = this.pUserName

    public operator fun component13(): Pcwstr = this.pPassword

    public operator fun component14(): Pwstr = this.pszObjectClass

    public operator fun component15(): UInt = this.cchObjectClass

    public fun copy(cbStruct: UInt = this.cbStruct, hwndOwner: Hwnd = this.hwndOwner, pszCaption: Pcstr = this.pszCaption, pszTitle: Pcstr = this.pszTitle, pszRoot: Pcwstr = this.pszRoot, pszPath: Pwstr = this.pszPath, cchPath: UInt = this.cchPath, dwFlags: UInt = this.dwFlags, pfnCallback: Bffcallback = this.pfnCallback, lParam: Lparam = this.lParam, dwReturnFormat: UInt = this.dwReturnFormat, pUserName: Pcwstr = this.pUserName, pPassword: Pcwstr = this.pPassword, pszObjectClass: Pwstr = this.pszObjectClass, cchObjectClass: UInt = this.cchObjectClass): Dsbrowseinfoa = Dsbrowseinfoa(cbStruct = cbStruct, hwndOwnerCtorArg = hwndOwner, pszCaptionCtorArg = pszCaption, pszTitleCtorArg = pszTitle, pszRootCtorArg = pszRoot, pszPathCtorArg = pszPath, cchPath = cchPath, dwFlags = dwFlags, pfnCallback = pfnCallback, lParam = lParam, dwReturnFormat = dwReturnFormat, pUserNameCtorArg = pUserName, pPasswordCtorArg = pPassword, pszObjectClassCtorArg = pszObjectClass, cchObjectClass = cchObjectClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbrowseinfoa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pszRoot != other.pszRoot) return false
        if (this.pszPath != other.pszPath) return false
        if (this.cchPath != other.cchPath) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.lParam != other.lParam) return false
        if (this.dwReturnFormat != other.dwReturnFormat) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pPassword != other.pPassword) return false
        if (this.pszObjectClass != other.pszObjectClass) return false
        if (this.cchObjectClass != other.cchObjectClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pszRoot.hashCode()
        result = 31 * result + this.pszPath.hashCode()
        result = 31 * result + this.cchPath.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwReturnFormat.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pPassword.hashCode()
        result = 31 * result + this.pszObjectClass.hashCode()
        result = 31 * result + this.cchObjectClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pszCaption: Pcstr = ConstPtr(0L),
            pszTitle: Pcstr = ConstPtr(0L),
            pszRoot: Pcwstr = ConstPtr(0L),
            pszPath: Pwstr = MutPtr(0L),
            cchPath: UInt = 0u,
            dwFlags: UInt = 0u,
            pfnCallback: Bffcallback = null,
            lParam: Lparam = 0L,
            dwReturnFormat: UInt = 0u,
            pUserName: Pcwstr = ConstPtr(0L),
            pPassword: Pcwstr = ConstPtr(0L),
            pszObjectClass: Pwstr = MutPtr(0L),
            cchObjectClass: UInt = 0u,
        ): Dsbrowseinfoa =
            Dsbrowseinfoa(
                cbStruct = cbStruct,
                hwndOwnerCtorArg = hwndOwner,
                pszCaptionCtorArg = pszCaption,
                pszTitleCtorArg = pszTitle,
                pszRootCtorArg = pszRoot,
                pszPathCtorArg = pszPath,
                cchPath = cchPath,
                dwFlags = dwFlags,
                pfnCallback = pfnCallback,
                lParam = lParam,
                dwReturnFormat = dwReturnFormat,
                pUserNameCtorArg = pUserName,
                pPasswordCtorArg = pPassword,
                pszObjectClassCtorArg = pszObjectClass,
                cchObjectClass = cchObjectClass,
            )
    }
}

public class Dsbrowseinfow internal constructor(
    public var cbStruct: UInt,
    hwndOwnerCtorArg: Hwnd,
    pszCaptionCtorArg: Pcwstr,
    pszTitleCtorArg: Pcwstr,
    pszRootCtorArg: Pcwstr,
    pszPathCtorArg: Pwstr,
    public var cchPath: UInt,
    public var dwFlags: UInt,
    public var pfnCallback: Bffcallback,
    public var lParam: Lparam,
    public var dwReturnFormat: UInt,
    pUserNameCtorArg: Pcwstr,
    pPasswordCtorArg: Pcwstr,
    pszObjectClassCtorArg: Pwstr,
    public var cchObjectClass: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pszCaption: Pcwstr = pszCaptionCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pszRoot: Pcwstr = pszRootCtorArg
        internal set

    public var pszPath: Pwstr = pszPathCtorArg
        internal set

    public var pUserName: Pcwstr = pUserNameCtorArg
        internal set

    public var pPassword: Pcwstr = pPasswordCtorArg
        internal set

    public var pszObjectClass: Pwstr = pszObjectClassCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pszCaptionCtorArg = ConstPtr(0L),
        pszTitleCtorArg = ConstPtr(0L),
        pszRootCtorArg = ConstPtr(0L),
        pszPathCtorArg = MutPtr(0L),
        cchPath = 0u,
        dwFlags = 0u,
        pfnCallback = null,
        lParam = 0L,
        dwReturnFormat = 0u,
        pUserNameCtorArg = ConstPtr(0L),
        pPasswordCtorArg = ConstPtr(0L),
        pszObjectClassCtorArg = MutPtr(0L),
        cchObjectClass = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Pcwstr = this.pszCaption

    public operator fun component4(): Pcwstr = this.pszTitle

    public operator fun component5(): Pcwstr = this.pszRoot

    public operator fun component6(): Pwstr = this.pszPath

    public operator fun component7(): UInt = this.cchPath

    public operator fun component8(): UInt = this.dwFlags

    public operator fun component9(): Bffcallback = this.pfnCallback

    public operator fun component10(): Lparam = this.lParam

    public operator fun component11(): UInt = this.dwReturnFormat

    public operator fun component12(): Pcwstr = this.pUserName

    public operator fun component13(): Pcwstr = this.pPassword

    public operator fun component14(): Pwstr = this.pszObjectClass

    public operator fun component15(): UInt = this.cchObjectClass

    public fun copy(cbStruct: UInt = this.cbStruct, hwndOwner: Hwnd = this.hwndOwner, pszCaption: Pcwstr = this.pszCaption, pszTitle: Pcwstr = this.pszTitle, pszRoot: Pcwstr = this.pszRoot, pszPath: Pwstr = this.pszPath, cchPath: UInt = this.cchPath, dwFlags: UInt = this.dwFlags, pfnCallback: Bffcallback = this.pfnCallback, lParam: Lparam = this.lParam, dwReturnFormat: UInt = this.dwReturnFormat, pUserName: Pcwstr = this.pUserName, pPassword: Pcwstr = this.pPassword, pszObjectClass: Pwstr = this.pszObjectClass, cchObjectClass: UInt = this.cchObjectClass): Dsbrowseinfow = Dsbrowseinfow(cbStruct = cbStruct, hwndOwnerCtorArg = hwndOwner, pszCaptionCtorArg = pszCaption, pszTitleCtorArg = pszTitle, pszRootCtorArg = pszRoot, pszPathCtorArg = pszPath, cchPath = cchPath, dwFlags = dwFlags, pfnCallback = pfnCallback, lParam = lParam, dwReturnFormat = dwReturnFormat, pUserNameCtorArg = pUserName, pPasswordCtorArg = pPassword, pszObjectClassCtorArg = pszObjectClass, cchObjectClass = cchObjectClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbrowseinfow) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pszRoot != other.pszRoot) return false
        if (this.pszPath != other.pszPath) return false
        if (this.cchPath != other.cchPath) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.lParam != other.lParam) return false
        if (this.dwReturnFormat != other.dwReturnFormat) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pPassword != other.pPassword) return false
        if (this.pszObjectClass != other.pszObjectClass) return false
        if (this.cchObjectClass != other.cchObjectClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pszRoot.hashCode()
        result = 31 * result + this.pszPath.hashCode()
        result = 31 * result + this.cchPath.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwReturnFormat.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pPassword.hashCode()
        result = 31 * result + this.pszObjectClass.hashCode()
        result = 31 * result + this.cchObjectClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pszCaption: Pcwstr = ConstPtr(0L),
            pszTitle: Pcwstr = ConstPtr(0L),
            pszRoot: Pcwstr = ConstPtr(0L),
            pszPath: Pwstr = MutPtr(0L),
            cchPath: UInt = 0u,
            dwFlags: UInt = 0u,
            pfnCallback: Bffcallback = null,
            lParam: Lparam = 0L,
            dwReturnFormat: UInt = 0u,
            pUserName: Pcwstr = ConstPtr(0L),
            pPassword: Pcwstr = ConstPtr(0L),
            pszObjectClass: Pwstr = MutPtr(0L),
            cchObjectClass: UInt = 0u,
        ): Dsbrowseinfow =
            Dsbrowseinfow(
                cbStruct = cbStruct,
                hwndOwnerCtorArg = hwndOwner,
                pszCaptionCtorArg = pszCaption,
                pszTitleCtorArg = pszTitle,
                pszRootCtorArg = pszRoot,
                pszPathCtorArg = pszPath,
                cchPath = cchPath,
                dwFlags = dwFlags,
                pfnCallback = pfnCallback,
                lParam = lParam,
                dwReturnFormat = dwReturnFormat,
                pUserNameCtorArg = pUserName,
                pPasswordCtorArg = pPassword,
                pszObjectClassCtorArg = pszObjectClass,
                cchObjectClass = cchObjectClass,
            )
    }
}

public data class Dsclasscreationinfo(
    public var dwFlags: UInt = 0u,
    public var clsidWizardDialog: Guid = Guid(),
    public var clsidWizardPrimaryPage: Guid = Guid(),
    public var cWizardExtensions: UInt = 0u,
    public var aWizardExtensions: List<Guid> = List(1) { Guid() },
)

public data class Dscolumn(
    public var dwFlags: UInt = 0u,
    public var fmt: Int = 0,
    public var cx: Int = 0,
    public var idsName: Int = 0,
    public var offsetProperty: Int = 0,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dscolumn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dscolumn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dscolumn =
                    Dscolumn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dscolumn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.idsName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.offsetProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class Dsdisplayspecoptions(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var offsetAttribPrefix: UInt = 0u,
    public var offsetUserName: UInt = 0u,
    public var offsetPassword: UInt = 0u,
    public var offsetServer: UInt = 0u,
    public var offsetServerConfigPath: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsdisplayspecoptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsdisplayspecoptions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Dsdisplayspecoptions =
                    Dsdisplayspecoptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dsdisplayspecoptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetAttribPrefix)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offsetUserName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offsetPassword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offsetServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offsetServerConfigPath)
                }
            }
    }
}

public data class Dsobject(
    public var dwFlags: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var offsetName: UInt = 0u,
    public var offsetClass: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsobject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsobject> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dsobject =
                    Dsobject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dsobject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProviderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offsetClass)
                }
            }
    }
}

public data class Dsobjectnames(
    public var clsidNamespace: Guid = Guid(),
    public var cItems: UInt = 0u,
    public var aObjects: List<Dsobject> = List(1) { Dsobject() },
)

public data class DsopFilterFlags(
    public var uplevel: DsopUplevelFilterFlags = DsopUplevelFilterFlags(),
    public var flDownlevel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsopFilterFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsopFilterFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DsopFilterFlags =
                    DsopFilterFlags(
                        (DsopUplevelFilterFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DsopFilterFlags) {
                    (DsopUplevelFilterFlags.typeLayout()).writeNative(addr, value.uplevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flDownlevel)
                }
            }
    }
}

public class DsopInitInfo internal constructor(
    public var cbSize: UInt,
    pwzTargetComputerCtorArg: Pcwstr,
    public var cDsScopeInfos: UInt,
    aDsScopeInfosCtorArg: MutPtr,
    public var flOptions: UInt,
    public var cAttributesToFetch: UInt,
    apwzAttributeNamesCtorArg: ConstPtr,
) {
    public var pwzTargetComputer: Pcwstr = pwzTargetComputerCtorArg
        internal set

    public var aDsScopeInfos: MutPtr = aDsScopeInfosCtorArg
        internal set

    public var apwzAttributeNames: ConstPtr = apwzAttributeNamesCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwzTargetComputerCtorArg = ConstPtr(0L),
        cDsScopeInfos = 0u,
        aDsScopeInfosCtorArg = MutPtr(0L),
        flOptions = 0u,
        cAttributesToFetch = 0u,
        apwzAttributeNamesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pwzTargetComputer

    public operator fun component3(): UInt = this.cDsScopeInfos

    public operator fun component4(): MutPtr = this.aDsScopeInfos

    public operator fun component5(): UInt = this.flOptions

    public operator fun component6(): UInt = this.cAttributesToFetch

    public operator fun component7(): ConstPtr = this.apwzAttributeNames

    public fun copy(cbSize: UInt = this.cbSize, pwzTargetComputer: Pcwstr = this.pwzTargetComputer, cDsScopeInfos: UInt = this.cDsScopeInfos, aDsScopeInfos: MutPtr = this.aDsScopeInfos, flOptions: UInt = this.flOptions, cAttributesToFetch: UInt = this.cAttributesToFetch, apwzAttributeNames: ConstPtr = this.apwzAttributeNames): DsopInitInfo = DsopInitInfo(cbSize = cbSize, pwzTargetComputerCtorArg = pwzTargetComputer, cDsScopeInfos = cDsScopeInfos, aDsScopeInfosCtorArg = aDsScopeInfos, flOptions = flOptions, cAttributesToFetch = cAttributesToFetch, apwzAttributeNamesCtorArg = apwzAttributeNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsopInitInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwzTargetComputer != other.pwzTargetComputer) return false
        if (this.cDsScopeInfos != other.cDsScopeInfos) return false
        if (this.aDsScopeInfos != other.aDsScopeInfos) return false
        if (this.flOptions != other.flOptions) return false
        if (this.cAttributesToFetch != other.cAttributesToFetch) return false
        if (this.apwzAttributeNames != other.apwzAttributeNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwzTargetComputer.hashCode()
        result = 31 * result + this.cDsScopeInfos.hashCode()
        result = 31 * result + this.aDsScopeInfos.hashCode()
        result = 31 * result + this.flOptions.hashCode()
        result = 31 * result + this.cAttributesToFetch.hashCode()
        result = 31 * result + this.apwzAttributeNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwzTargetComputer: Pcwstr = ConstPtr(0L),
            cDsScopeInfos: UInt = 0u,
            aDsScopeInfos: MutPtr = MutPtr(0L),
            flOptions: UInt = 0u,
            cAttributesToFetch: UInt = 0u,
            apwzAttributeNames: ConstPtr = ConstPtr(0L),
        ): DsopInitInfo =
            DsopInitInfo(
                cbSize = cbSize,
                pwzTargetComputerCtorArg = pwzTargetComputer,
                cDsScopeInfos = cDsScopeInfos,
                aDsScopeInfosCtorArg = aDsScopeInfos,
                flOptions = flOptions,
                cAttributesToFetch = cAttributesToFetch,
                apwzAttributeNamesCtorArg = apwzAttributeNames,
            )
    }
}

public class DsopScopeInitInfo internal constructor(
    public var cbSize: UInt,
    public var flType: UInt,
    public var flScope: UInt,
    public var filterFlags: DsopFilterFlags,
    pwzDcNameCtorArg: Pcwstr,
    pwzADsPathCtorArg: Pcwstr,
    public var hr: Hresult,
) {
    public var pwzDcName: Pcwstr = pwzDcNameCtorArg
        internal set

    public var pwzADsPath: Pcwstr = pwzADsPathCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flType = 0u,
        flScope = 0u,
        filterFlags = DsopFilterFlags(),
        pwzDcNameCtorArg = ConstPtr(0L),
        pwzADsPathCtorArg = ConstPtr(0L),
        hr = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.flType

    public operator fun component3(): UInt = this.flScope

    public operator fun component4(): DsopFilterFlags = this.filterFlags

    public operator fun component5(): Pcwstr = this.pwzDcName

    public operator fun component6(): Pcwstr = this.pwzADsPath

    public operator fun component7(): Hresult = this.hr

    public fun copy(cbSize: UInt = this.cbSize, flType: UInt = this.flType, flScope: UInt = this.flScope, filterFlags: DsopFilterFlags = this.filterFlags, pwzDcName: Pcwstr = this.pwzDcName, pwzADsPath: Pcwstr = this.pwzADsPath, hr: Hresult = this.hr): DsopScopeInitInfo = DsopScopeInitInfo(cbSize = cbSize, flType = flType, flScope = flScope, filterFlags = filterFlags, pwzDcNameCtorArg = pwzDcName, pwzADsPathCtorArg = pwzADsPath, hr = hr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsopScopeInitInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flType != other.flType) return false
        if (this.flScope != other.flScope) return false
        if (this.filterFlags != other.filterFlags) return false
        if (this.pwzDcName != other.pwzDcName) return false
        if (this.pwzADsPath != other.pwzADsPath) return false
        if (this.hr != other.hr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flType.hashCode()
        result = 31 * result + this.flScope.hashCode()
        result = 31 * result + this.filterFlags.hashCode()
        result = 31 * result + this.pwzDcName.hashCode()
        result = 31 * result + this.pwzADsPath.hashCode()
        result = 31 * result + this.hr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flType: UInt = 0u,
            flScope: UInt = 0u,
            filterFlags: DsopFilterFlags = DsopFilterFlags(),
            pwzDcName: Pcwstr = ConstPtr(0L),
            pwzADsPath: Pcwstr = ConstPtr(0L),
            hr: Hresult = 0,
        ): DsopScopeInitInfo =
            DsopScopeInitInfo(
                cbSize = cbSize,
                flType = flType,
                flScope = flScope,
                filterFlags = filterFlags,
                pwzDcNameCtorArg = pwzDcName,
                pwzADsPathCtorArg = pwzADsPath,
                hr = hr,
            )
    }
}

public data class DsopUplevelFilterFlags(
    public var flBothModes: UInt = 0u,
    public var flMixedModeOnly: UInt = 0u,
    public var flNativeModeOnly: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsopUplevelFilterFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsopUplevelFilterFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DsopUplevelFilterFlags =
                    DsopUplevelFilterFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DsopUplevelFilterFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flBothModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flMixedModeOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flNativeModeOnly)
                }
            }
    }
}

public data class Dspropertypageinfo(
    public var offsetString: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dspropertypageinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dspropertypageinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Dspropertypageinfo =
                    Dspropertypageinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dspropertypageinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetString)
                }
            }
    }
}

public data class Dsqueryclasslist(
    public var cbStruct: UInt = 0u,
    public var cClasses: Int = 0,
    public var offsetClass: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsqueryclasslist) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.cClasses != other.cClasses) return false
        if (!this.offsetClass.contentEquals(other.offsetClass)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.cClasses.hashCode()
        result = 31 * result + this.offsetClass.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsqueryclasslist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsqueryclasslist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Dsqueryclasslist =
                    Dsqueryclasslist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Dsqueryclasslist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cClasses)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.offsetClass.toList())
                }
            }
    }
}

public class Dsqueryinitparams internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    pDefaultScopeCtorArg: Pwstr,
    pDefaultSaveLocationCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pPasswordCtorArg: Pwstr,
    pServerCtorArg: Pwstr,
) {
    public var pDefaultScope: Pwstr = pDefaultScopeCtorArg
        internal set

    public var pDefaultSaveLocation: Pwstr = pDefaultSaveLocationCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pPassword: Pwstr = pPasswordCtorArg
        internal set

    public var pServer: Pwstr = pServerCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        pDefaultScopeCtorArg = MutPtr(0L),
        pDefaultSaveLocationCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pPasswordCtorArg = MutPtr(0L),
        pServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pDefaultScope

    public operator fun component4(): Pwstr = this.pDefaultSaveLocation

    public operator fun component5(): Pwstr = this.pUserName

    public operator fun component6(): Pwstr = this.pPassword

    public operator fun component7(): Pwstr = this.pServer

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, pDefaultScope: Pwstr = this.pDefaultScope, pDefaultSaveLocation: Pwstr = this.pDefaultSaveLocation, pUserName: Pwstr = this.pUserName, pPassword: Pwstr = this.pPassword, pServer: Pwstr = this.pServer): Dsqueryinitparams = Dsqueryinitparams(cbStruct = cbStruct, dwFlags = dwFlags, pDefaultScopeCtorArg = pDefaultScope, pDefaultSaveLocationCtorArg = pDefaultSaveLocation, pUserNameCtorArg = pUserName, pPasswordCtorArg = pPassword, pServerCtorArg = pServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsqueryinitparams) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pDefaultScope != other.pDefaultScope) return false
        if (this.pDefaultSaveLocation != other.pDefaultSaveLocation) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pPassword != other.pPassword) return false
        if (this.pServer != other.pServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pDefaultScope.hashCode()
        result = 31 * result + this.pDefaultSaveLocation.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pPassword.hashCode()
        result = 31 * result + this.pServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            pDefaultScope: Pwstr = MutPtr(0L),
            pDefaultSaveLocation: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pPassword: Pwstr = MutPtr(0L),
            pServer: Pwstr = MutPtr(0L),
        ): Dsqueryinitparams =
            Dsqueryinitparams(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                pDefaultScopeCtorArg = pDefaultScope,
                pDefaultSaveLocationCtorArg = pDefaultSaveLocation,
                pUserNameCtorArg = pUserName,
                pPasswordCtorArg = pPassword,
                pServerCtorArg = pServer,
            )
    }
}

public class Dsqueryparams internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var offsetQuery: Int,
    public var iColumns: Int,
    public var dwReserved: UInt,
    public var aColumns: List<Dscolumn>,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        offsetQuery = 0,
        iColumns = 0,
        dwReserved = 0u,
        aColumns = List(1) { Dscolumn() },
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): Int = this.offsetQuery

    public operator fun component5(): Int = this.iColumns

    public operator fun component6(): UInt = this.dwReserved

    public operator fun component7(): List<Dscolumn> = this.aColumns

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, offsetQuery: Int = this.offsetQuery, iColumns: Int = this.iColumns, dwReserved: UInt = this.dwReserved, aColumns: List<Dscolumn> = this.aColumns): Dsqueryparams = Dsqueryparams(cbStruct = cbStruct, dwFlags = dwFlags, hInstanceCtorArg = hInstance, offsetQuery = offsetQuery, iColumns = iColumns, dwReserved = dwReserved, aColumns = aColumns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsqueryparams) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.offsetQuery != other.offsetQuery) return false
        if (this.iColumns != other.iColumns) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.aColumns != other.aColumns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.offsetQuery.hashCode()
        result = 31 * result + this.iColumns.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.aColumns.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            offsetQuery: Int = 0,
            iColumns: Int = 0,
            dwReserved: UInt = 0u,
            aColumns: List<Dscolumn> = List(1) { Dscolumn() },
        ): Dsqueryparams =
            Dsqueryparams(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                offsetQuery = offsetQuery,
                iColumns = iColumns,
                dwReserved = dwReserved,
                aColumns = aColumns,
            )
    }
}

public data class DsroleOperationStateInfo(
    public var operationState: DsroleOperationState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsroleOperationStateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsroleOperationStateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DsroleOperationStateInfo =
                    DsroleOperationStateInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DsroleOperationStateInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operationState)
                }
            }
    }
}

public class DsrolePrimaryDomainInfoBasic internal constructor(
    public var machineRole: DsroleMachineRole,
    public var flags: UInt,
    domainNameFlatCtorArg: Pwstr,
    domainNameDnsCtorArg: Pwstr,
    domainForestNameCtorArg: Pwstr,
    public var domainGuid: Guid,
) {
    public var domainNameFlat: Pwstr = domainNameFlatCtorArg
        internal set

    public var domainNameDns: Pwstr = domainNameDnsCtorArg
        internal set

    public var domainForestName: Pwstr = domainForestNameCtorArg
        internal set

    public constructor() : this(
        machineRole = 0,
        flags = 0u,
        domainNameFlatCtorArg = MutPtr(0L),
        domainNameDnsCtorArg = MutPtr(0L),
        domainForestNameCtorArg = MutPtr(0L),
        domainGuid = Guid(),
    )

    public operator fun component1(): DsroleMachineRole = this.machineRole

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Pwstr = this.domainNameFlat

    public operator fun component4(): Pwstr = this.domainNameDns

    public operator fun component5(): Pwstr = this.domainForestName

    public operator fun component6(): Guid = this.domainGuid

    public fun copy(machineRole: DsroleMachineRole = this.machineRole, flags: UInt = this.flags, domainNameFlat: Pwstr = this.domainNameFlat, domainNameDns: Pwstr = this.domainNameDns, domainForestName: Pwstr = this.domainForestName, domainGuid: Guid = this.domainGuid): DsrolePrimaryDomainInfoBasic = DsrolePrimaryDomainInfoBasic(machineRole = machineRole, flags = flags, domainNameFlatCtorArg = domainNameFlat, domainNameDnsCtorArg = domainNameDns, domainForestNameCtorArg = domainForestName, domainGuid = domainGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsrolePrimaryDomainInfoBasic) return false
        if (this.machineRole != other.machineRole) return false
        if (this.flags != other.flags) return false
        if (this.domainNameFlat != other.domainNameFlat) return false
        if (this.domainNameDns != other.domainNameDns) return false
        if (this.domainForestName != other.domainForestName) return false
        if (this.domainGuid != other.domainGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.machineRole.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.domainNameFlat.hashCode()
        result = 31 * result + this.domainNameDns.hashCode()
        result = 31 * result + this.domainForestName.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            machineRole: DsroleMachineRole = 0,
            flags: UInt = 0u,
            domainNameFlat: Pwstr = MutPtr(0L),
            domainNameDns: Pwstr = MutPtr(0L),
            domainForestName: Pwstr = MutPtr(0L),
            domainGuid: Guid = Guid(),
        ): DsrolePrimaryDomainInfoBasic =
            DsrolePrimaryDomainInfoBasic(
                machineRole = machineRole,
                flags = flags,
                domainNameFlatCtorArg = domainNameFlat,
                domainNameDnsCtorArg = domainNameDns,
                domainForestNameCtorArg = domainForestName,
                domainGuid = domainGuid,
            )
    }
}

public data class DsroleUpgradeStatusInfo(
    public var operationState: UInt = 0u,
    public var previousServerState: DsroleServerState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsroleUpgradeStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsroleUpgradeStatusInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DsroleUpgradeStatusInfo =
                    DsroleUpgradeStatusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DsroleUpgradeStatusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.operationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.previousServerState)
                }
            }
    }
}

public class DsDomainControllerInfo1a internal constructor(
    netbiosNameCtorArg: Pstr,
    dnsHostNameCtorArg: Pstr,
    siteNameCtorArg: Pstr,
    computerObjectNameCtorArg: Pstr,
    serverObjectNameCtorArg: Pstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
) {
    public var netbiosName: Pstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pstr = siteNameCtorArg
        internal set

    public var computerObjectName: Pstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pstr = serverObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
    )

    public operator fun component1(): Pstr = this.netbiosName

    public operator fun component2(): Pstr = this.dnsHostName

    public operator fun component3(): Pstr = this.siteName

    public operator fun component4(): Pstr = this.computerObjectName

    public operator fun component5(): Pstr = this.serverObjectName

    public operator fun component6(): Bool = this.fIsPdc

    public operator fun component7(): Bool = this.fDsEnabled

    public fun copy(netbiosName: Pstr = this.netbiosName, dnsHostName: Pstr = this.dnsHostName, siteName: Pstr = this.siteName, computerObjectName: Pstr = this.computerObjectName, serverObjectName: Pstr = this.serverObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled): DsDomainControllerInfo1a = DsDomainControllerInfo1a(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo1a) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pstr = MutPtr(0L),
            dnsHostName: Pstr = MutPtr(0L),
            siteName: Pstr = MutPtr(0L),
            computerObjectName: Pstr = MutPtr(0L),
            serverObjectName: Pstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
        ): DsDomainControllerInfo1a =
            DsDomainControllerInfo1a(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
            )
    }
}

public class DsDomainControllerInfo1w internal constructor(
    netbiosNameCtorArg: Pwstr,
    dnsHostNameCtorArg: Pwstr,
    siteNameCtorArg: Pwstr,
    computerObjectNameCtorArg: Pwstr,
    serverObjectNameCtorArg: Pwstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
) {
    public var netbiosName: Pwstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pwstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pwstr = siteNameCtorArg
        internal set

    public var computerObjectName: Pwstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pwstr = serverObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
    )

    public operator fun component1(): Pwstr = this.netbiosName

    public operator fun component2(): Pwstr = this.dnsHostName

    public operator fun component3(): Pwstr = this.siteName

    public operator fun component4(): Pwstr = this.computerObjectName

    public operator fun component5(): Pwstr = this.serverObjectName

    public operator fun component6(): Bool = this.fIsPdc

    public operator fun component7(): Bool = this.fDsEnabled

    public fun copy(netbiosName: Pwstr = this.netbiosName, dnsHostName: Pwstr = this.dnsHostName, siteName: Pwstr = this.siteName, computerObjectName: Pwstr = this.computerObjectName, serverObjectName: Pwstr = this.serverObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled): DsDomainControllerInfo1w = DsDomainControllerInfo1w(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo1w) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pwstr = MutPtr(0L),
            dnsHostName: Pwstr = MutPtr(0L),
            siteName: Pwstr = MutPtr(0L),
            computerObjectName: Pwstr = MutPtr(0L),
            serverObjectName: Pwstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
        ): DsDomainControllerInfo1w =
            DsDomainControllerInfo1w(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
            )
    }
}

public class DsDomainControllerInfo2a internal constructor(
    netbiosNameCtorArg: Pstr,
    dnsHostNameCtorArg: Pstr,
    siteNameCtorArg: Pstr,
    siteObjectNameCtorArg: Pstr,
    computerObjectNameCtorArg: Pstr,
    serverObjectNameCtorArg: Pstr,
    ntdsDsaObjectNameCtorArg: Pstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
    public var fIsGc: Bool,
    public var siteObjectGuid: Guid,
    public var computerObjectGuid: Guid,
    public var serverObjectGuid: Guid,
    public var ntdsDsaObjectGuid: Guid,
) {
    public var netbiosName: Pstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pstr = siteNameCtorArg
        internal set

    public var siteObjectName: Pstr = siteObjectNameCtorArg
        internal set

    public var computerObjectName: Pstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pstr = serverObjectNameCtorArg
        internal set

    public var ntdsDsaObjectName: Pstr = ntdsDsaObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        siteObjectNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        ntdsDsaObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
        fIsGc = 0,
        siteObjectGuid = Guid(),
        computerObjectGuid = Guid(),
        serverObjectGuid = Guid(),
        ntdsDsaObjectGuid = Guid(),
    )

    public operator fun component1(): Pstr = this.netbiosName

    public operator fun component2(): Pstr = this.dnsHostName

    public operator fun component3(): Pstr = this.siteName

    public operator fun component4(): Pstr = this.siteObjectName

    public operator fun component5(): Pstr = this.computerObjectName

    public operator fun component6(): Pstr = this.serverObjectName

    public operator fun component7(): Pstr = this.ntdsDsaObjectName

    public operator fun component8(): Bool = this.fIsPdc

    public operator fun component9(): Bool = this.fDsEnabled

    public operator fun component10(): Bool = this.fIsGc

    public operator fun component11(): Guid = this.siteObjectGuid

    public operator fun component12(): Guid = this.computerObjectGuid

    public operator fun component13(): Guid = this.serverObjectGuid

    public operator fun component14(): Guid = this.ntdsDsaObjectGuid

    public fun copy(netbiosName: Pstr = this.netbiosName, dnsHostName: Pstr = this.dnsHostName, siteName: Pstr = this.siteName, siteObjectName: Pstr = this.siteObjectName, computerObjectName: Pstr = this.computerObjectName, serverObjectName: Pstr = this.serverObjectName, ntdsDsaObjectName: Pstr = this.ntdsDsaObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled, fIsGc: Bool = this.fIsGc, siteObjectGuid: Guid = this.siteObjectGuid, computerObjectGuid: Guid = this.computerObjectGuid, serverObjectGuid: Guid = this.serverObjectGuid, ntdsDsaObjectGuid: Guid = this.ntdsDsaObjectGuid): DsDomainControllerInfo2a = DsDomainControllerInfo2a(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, siteObjectNameCtorArg = siteObjectName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, ntdsDsaObjectNameCtorArg = ntdsDsaObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled, fIsGc = fIsGc, siteObjectGuid = siteObjectGuid, computerObjectGuid = computerObjectGuid, serverObjectGuid = serverObjectGuid, ntdsDsaObjectGuid = ntdsDsaObjectGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo2a) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.siteObjectName != other.siteObjectName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.ntdsDsaObjectName != other.ntdsDsaObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        if (this.fIsGc != other.fIsGc) return false
        if (this.siteObjectGuid != other.siteObjectGuid) return false
        if (this.computerObjectGuid != other.computerObjectGuid) return false
        if (this.serverObjectGuid != other.serverObjectGuid) return false
        if (this.ntdsDsaObjectGuid != other.ntdsDsaObjectGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.siteObjectName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.ntdsDsaObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        result = 31 * result + this.fIsGc.hashCode()
        result = 31 * result + this.siteObjectGuid.hashCode()
        result = 31 * result + this.computerObjectGuid.hashCode()
        result = 31 * result + this.serverObjectGuid.hashCode()
        result = 31 * result + this.ntdsDsaObjectGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pstr = MutPtr(0L),
            dnsHostName: Pstr = MutPtr(0L),
            siteName: Pstr = MutPtr(0L),
            siteObjectName: Pstr = MutPtr(0L),
            computerObjectName: Pstr = MutPtr(0L),
            serverObjectName: Pstr = MutPtr(0L),
            ntdsDsaObjectName: Pstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
            fIsGc: Bool = 0,
            siteObjectGuid: Guid = Guid(),
            computerObjectGuid: Guid = Guid(),
            serverObjectGuid: Guid = Guid(),
            ntdsDsaObjectGuid: Guid = Guid(),
        ): DsDomainControllerInfo2a =
            DsDomainControllerInfo2a(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                siteObjectNameCtorArg = siteObjectName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                ntdsDsaObjectNameCtorArg = ntdsDsaObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
                fIsGc = fIsGc,
                siteObjectGuid = siteObjectGuid,
                computerObjectGuid = computerObjectGuid,
                serverObjectGuid = serverObjectGuid,
                ntdsDsaObjectGuid = ntdsDsaObjectGuid,
            )
    }
}

public class DsDomainControllerInfo2w internal constructor(
    netbiosNameCtorArg: Pwstr,
    dnsHostNameCtorArg: Pwstr,
    siteNameCtorArg: Pwstr,
    siteObjectNameCtorArg: Pwstr,
    computerObjectNameCtorArg: Pwstr,
    serverObjectNameCtorArg: Pwstr,
    ntdsDsaObjectNameCtorArg: Pwstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
    public var fIsGc: Bool,
    public var siteObjectGuid: Guid,
    public var computerObjectGuid: Guid,
    public var serverObjectGuid: Guid,
    public var ntdsDsaObjectGuid: Guid,
) {
    public var netbiosName: Pwstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pwstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pwstr = siteNameCtorArg
        internal set

    public var siteObjectName: Pwstr = siteObjectNameCtorArg
        internal set

    public var computerObjectName: Pwstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pwstr = serverObjectNameCtorArg
        internal set

    public var ntdsDsaObjectName: Pwstr = ntdsDsaObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        siteObjectNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        ntdsDsaObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
        fIsGc = 0,
        siteObjectGuid = Guid(),
        computerObjectGuid = Guid(),
        serverObjectGuid = Guid(),
        ntdsDsaObjectGuid = Guid(),
    )

    public operator fun component1(): Pwstr = this.netbiosName

    public operator fun component2(): Pwstr = this.dnsHostName

    public operator fun component3(): Pwstr = this.siteName

    public operator fun component4(): Pwstr = this.siteObjectName

    public operator fun component5(): Pwstr = this.computerObjectName

    public operator fun component6(): Pwstr = this.serverObjectName

    public operator fun component7(): Pwstr = this.ntdsDsaObjectName

    public operator fun component8(): Bool = this.fIsPdc

    public operator fun component9(): Bool = this.fDsEnabled

    public operator fun component10(): Bool = this.fIsGc

    public operator fun component11(): Guid = this.siteObjectGuid

    public operator fun component12(): Guid = this.computerObjectGuid

    public operator fun component13(): Guid = this.serverObjectGuid

    public operator fun component14(): Guid = this.ntdsDsaObjectGuid

    public fun copy(netbiosName: Pwstr = this.netbiosName, dnsHostName: Pwstr = this.dnsHostName, siteName: Pwstr = this.siteName, siteObjectName: Pwstr = this.siteObjectName, computerObjectName: Pwstr = this.computerObjectName, serverObjectName: Pwstr = this.serverObjectName, ntdsDsaObjectName: Pwstr = this.ntdsDsaObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled, fIsGc: Bool = this.fIsGc, siteObjectGuid: Guid = this.siteObjectGuid, computerObjectGuid: Guid = this.computerObjectGuid, serverObjectGuid: Guid = this.serverObjectGuid, ntdsDsaObjectGuid: Guid = this.ntdsDsaObjectGuid): DsDomainControllerInfo2w = DsDomainControllerInfo2w(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, siteObjectNameCtorArg = siteObjectName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, ntdsDsaObjectNameCtorArg = ntdsDsaObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled, fIsGc = fIsGc, siteObjectGuid = siteObjectGuid, computerObjectGuid = computerObjectGuid, serverObjectGuid = serverObjectGuid, ntdsDsaObjectGuid = ntdsDsaObjectGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo2w) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.siteObjectName != other.siteObjectName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.ntdsDsaObjectName != other.ntdsDsaObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        if (this.fIsGc != other.fIsGc) return false
        if (this.siteObjectGuid != other.siteObjectGuid) return false
        if (this.computerObjectGuid != other.computerObjectGuid) return false
        if (this.serverObjectGuid != other.serverObjectGuid) return false
        if (this.ntdsDsaObjectGuid != other.ntdsDsaObjectGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.siteObjectName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.ntdsDsaObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        result = 31 * result + this.fIsGc.hashCode()
        result = 31 * result + this.siteObjectGuid.hashCode()
        result = 31 * result + this.computerObjectGuid.hashCode()
        result = 31 * result + this.serverObjectGuid.hashCode()
        result = 31 * result + this.ntdsDsaObjectGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pwstr = MutPtr(0L),
            dnsHostName: Pwstr = MutPtr(0L),
            siteName: Pwstr = MutPtr(0L),
            siteObjectName: Pwstr = MutPtr(0L),
            computerObjectName: Pwstr = MutPtr(0L),
            serverObjectName: Pwstr = MutPtr(0L),
            ntdsDsaObjectName: Pwstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
            fIsGc: Bool = 0,
            siteObjectGuid: Guid = Guid(),
            computerObjectGuid: Guid = Guid(),
            serverObjectGuid: Guid = Guid(),
            ntdsDsaObjectGuid: Guid = Guid(),
        ): DsDomainControllerInfo2w =
            DsDomainControllerInfo2w(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                siteObjectNameCtorArg = siteObjectName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                ntdsDsaObjectNameCtorArg = ntdsDsaObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
                fIsGc = fIsGc,
                siteObjectGuid = siteObjectGuid,
                computerObjectGuid = computerObjectGuid,
                serverObjectGuid = serverObjectGuid,
                ntdsDsaObjectGuid = ntdsDsaObjectGuid,
            )
    }
}

public class DsDomainControllerInfo3a internal constructor(
    netbiosNameCtorArg: Pstr,
    dnsHostNameCtorArg: Pstr,
    siteNameCtorArg: Pstr,
    siteObjectNameCtorArg: Pstr,
    computerObjectNameCtorArg: Pstr,
    serverObjectNameCtorArg: Pstr,
    ntdsDsaObjectNameCtorArg: Pstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
    public var fIsGc: Bool,
    public var fIsRodc: Bool,
    public var siteObjectGuid: Guid,
    public var computerObjectGuid: Guid,
    public var serverObjectGuid: Guid,
    public var ntdsDsaObjectGuid: Guid,
) {
    public var netbiosName: Pstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pstr = siteNameCtorArg
        internal set

    public var siteObjectName: Pstr = siteObjectNameCtorArg
        internal set

    public var computerObjectName: Pstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pstr = serverObjectNameCtorArg
        internal set

    public var ntdsDsaObjectName: Pstr = ntdsDsaObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        siteObjectNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        ntdsDsaObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
        fIsGc = 0,
        fIsRodc = 0,
        siteObjectGuid = Guid(),
        computerObjectGuid = Guid(),
        serverObjectGuid = Guid(),
        ntdsDsaObjectGuid = Guid(),
    )

    public operator fun component1(): Pstr = this.netbiosName

    public operator fun component2(): Pstr = this.dnsHostName

    public operator fun component3(): Pstr = this.siteName

    public operator fun component4(): Pstr = this.siteObjectName

    public operator fun component5(): Pstr = this.computerObjectName

    public operator fun component6(): Pstr = this.serverObjectName

    public operator fun component7(): Pstr = this.ntdsDsaObjectName

    public operator fun component8(): Bool = this.fIsPdc

    public operator fun component9(): Bool = this.fDsEnabled

    public operator fun component10(): Bool = this.fIsGc

    public operator fun component11(): Bool = this.fIsRodc

    public operator fun component12(): Guid = this.siteObjectGuid

    public operator fun component13(): Guid = this.computerObjectGuid

    public operator fun component14(): Guid = this.serverObjectGuid

    public operator fun component15(): Guid = this.ntdsDsaObjectGuid

    public fun copy(netbiosName: Pstr = this.netbiosName, dnsHostName: Pstr = this.dnsHostName, siteName: Pstr = this.siteName, siteObjectName: Pstr = this.siteObjectName, computerObjectName: Pstr = this.computerObjectName, serverObjectName: Pstr = this.serverObjectName, ntdsDsaObjectName: Pstr = this.ntdsDsaObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled, fIsGc: Bool = this.fIsGc, fIsRodc: Bool = this.fIsRodc, siteObjectGuid: Guid = this.siteObjectGuid, computerObjectGuid: Guid = this.computerObjectGuid, serverObjectGuid: Guid = this.serverObjectGuid, ntdsDsaObjectGuid: Guid = this.ntdsDsaObjectGuid): DsDomainControllerInfo3a = DsDomainControllerInfo3a(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, siteObjectNameCtorArg = siteObjectName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, ntdsDsaObjectNameCtorArg = ntdsDsaObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled, fIsGc = fIsGc, fIsRodc = fIsRodc, siteObjectGuid = siteObjectGuid, computerObjectGuid = computerObjectGuid, serverObjectGuid = serverObjectGuid, ntdsDsaObjectGuid = ntdsDsaObjectGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo3a) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.siteObjectName != other.siteObjectName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.ntdsDsaObjectName != other.ntdsDsaObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        if (this.fIsGc != other.fIsGc) return false
        if (this.fIsRodc != other.fIsRodc) return false
        if (this.siteObjectGuid != other.siteObjectGuid) return false
        if (this.computerObjectGuid != other.computerObjectGuid) return false
        if (this.serverObjectGuid != other.serverObjectGuid) return false
        if (this.ntdsDsaObjectGuid != other.ntdsDsaObjectGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.siteObjectName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.ntdsDsaObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        result = 31 * result + this.fIsGc.hashCode()
        result = 31 * result + this.fIsRodc.hashCode()
        result = 31 * result + this.siteObjectGuid.hashCode()
        result = 31 * result + this.computerObjectGuid.hashCode()
        result = 31 * result + this.serverObjectGuid.hashCode()
        result = 31 * result + this.ntdsDsaObjectGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pstr = MutPtr(0L),
            dnsHostName: Pstr = MutPtr(0L),
            siteName: Pstr = MutPtr(0L),
            siteObjectName: Pstr = MutPtr(0L),
            computerObjectName: Pstr = MutPtr(0L),
            serverObjectName: Pstr = MutPtr(0L),
            ntdsDsaObjectName: Pstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
            fIsGc: Bool = 0,
            fIsRodc: Bool = 0,
            siteObjectGuid: Guid = Guid(),
            computerObjectGuid: Guid = Guid(),
            serverObjectGuid: Guid = Guid(),
            ntdsDsaObjectGuid: Guid = Guid(),
        ): DsDomainControllerInfo3a =
            DsDomainControllerInfo3a(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                siteObjectNameCtorArg = siteObjectName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                ntdsDsaObjectNameCtorArg = ntdsDsaObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
                fIsGc = fIsGc,
                fIsRodc = fIsRodc,
                siteObjectGuid = siteObjectGuid,
                computerObjectGuid = computerObjectGuid,
                serverObjectGuid = serverObjectGuid,
                ntdsDsaObjectGuid = ntdsDsaObjectGuid,
            )
    }
}

public class DsDomainControllerInfo3w internal constructor(
    netbiosNameCtorArg: Pwstr,
    dnsHostNameCtorArg: Pwstr,
    siteNameCtorArg: Pwstr,
    siteObjectNameCtorArg: Pwstr,
    computerObjectNameCtorArg: Pwstr,
    serverObjectNameCtorArg: Pwstr,
    ntdsDsaObjectNameCtorArg: Pwstr,
    public var fIsPdc: Bool,
    public var fDsEnabled: Bool,
    public var fIsGc: Bool,
    public var fIsRodc: Bool,
    public var siteObjectGuid: Guid,
    public var computerObjectGuid: Guid,
    public var serverObjectGuid: Guid,
    public var ntdsDsaObjectGuid: Guid,
) {
    public var netbiosName: Pwstr = netbiosNameCtorArg
        internal set

    public var dnsHostName: Pwstr = dnsHostNameCtorArg
        internal set

    public var siteName: Pwstr = siteNameCtorArg
        internal set

    public var siteObjectName: Pwstr = siteObjectNameCtorArg
        internal set

    public var computerObjectName: Pwstr = computerObjectNameCtorArg
        internal set

    public var serverObjectName: Pwstr = serverObjectNameCtorArg
        internal set

    public var ntdsDsaObjectName: Pwstr = ntdsDsaObjectNameCtorArg
        internal set

    public constructor() : this(
        netbiosNameCtorArg = MutPtr(0L),
        dnsHostNameCtorArg = MutPtr(0L),
        siteNameCtorArg = MutPtr(0L),
        siteObjectNameCtorArg = MutPtr(0L),
        computerObjectNameCtorArg = MutPtr(0L),
        serverObjectNameCtorArg = MutPtr(0L),
        ntdsDsaObjectNameCtorArg = MutPtr(0L),
        fIsPdc = 0,
        fDsEnabled = 0,
        fIsGc = 0,
        fIsRodc = 0,
        siteObjectGuid = Guid(),
        computerObjectGuid = Guid(),
        serverObjectGuid = Guid(),
        ntdsDsaObjectGuid = Guid(),
    )

    public operator fun component1(): Pwstr = this.netbiosName

    public operator fun component2(): Pwstr = this.dnsHostName

    public operator fun component3(): Pwstr = this.siteName

    public operator fun component4(): Pwstr = this.siteObjectName

    public operator fun component5(): Pwstr = this.computerObjectName

    public operator fun component6(): Pwstr = this.serverObjectName

    public operator fun component7(): Pwstr = this.ntdsDsaObjectName

    public operator fun component8(): Bool = this.fIsPdc

    public operator fun component9(): Bool = this.fDsEnabled

    public operator fun component10(): Bool = this.fIsGc

    public operator fun component11(): Bool = this.fIsRodc

    public operator fun component12(): Guid = this.siteObjectGuid

    public operator fun component13(): Guid = this.computerObjectGuid

    public operator fun component14(): Guid = this.serverObjectGuid

    public operator fun component15(): Guid = this.ntdsDsaObjectGuid

    public fun copy(netbiosName: Pwstr = this.netbiosName, dnsHostName: Pwstr = this.dnsHostName, siteName: Pwstr = this.siteName, siteObjectName: Pwstr = this.siteObjectName, computerObjectName: Pwstr = this.computerObjectName, serverObjectName: Pwstr = this.serverObjectName, ntdsDsaObjectName: Pwstr = this.ntdsDsaObjectName, fIsPdc: Bool = this.fIsPdc, fDsEnabled: Bool = this.fDsEnabled, fIsGc: Bool = this.fIsGc, fIsRodc: Bool = this.fIsRodc, siteObjectGuid: Guid = this.siteObjectGuid, computerObjectGuid: Guid = this.computerObjectGuid, serverObjectGuid: Guid = this.serverObjectGuid, ntdsDsaObjectGuid: Guid = this.ntdsDsaObjectGuid): DsDomainControllerInfo3w = DsDomainControllerInfo3w(netbiosNameCtorArg = netbiosName, dnsHostNameCtorArg = dnsHostName, siteNameCtorArg = siteName, siteObjectNameCtorArg = siteObjectName, computerObjectNameCtorArg = computerObjectName, serverObjectNameCtorArg = serverObjectName, ntdsDsaObjectNameCtorArg = ntdsDsaObjectName, fIsPdc = fIsPdc, fDsEnabled = fDsEnabled, fIsGc = fIsGc, fIsRodc = fIsRodc, siteObjectGuid = siteObjectGuid, computerObjectGuid = computerObjectGuid, serverObjectGuid = serverObjectGuid, ntdsDsaObjectGuid = ntdsDsaObjectGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainControllerInfo3w) return false
        if (this.netbiosName != other.netbiosName) return false
        if (this.dnsHostName != other.dnsHostName) return false
        if (this.siteName != other.siteName) return false
        if (this.siteObjectName != other.siteObjectName) return false
        if (this.computerObjectName != other.computerObjectName) return false
        if (this.serverObjectName != other.serverObjectName) return false
        if (this.ntdsDsaObjectName != other.ntdsDsaObjectName) return false
        if (this.fIsPdc != other.fIsPdc) return false
        if (this.fDsEnabled != other.fDsEnabled) return false
        if (this.fIsGc != other.fIsGc) return false
        if (this.fIsRodc != other.fIsRodc) return false
        if (this.siteObjectGuid != other.siteObjectGuid) return false
        if (this.computerObjectGuid != other.computerObjectGuid) return false
        if (this.serverObjectGuid != other.serverObjectGuid) return false
        if (this.ntdsDsaObjectGuid != other.ntdsDsaObjectGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosName.hashCode()
        result = 31 * result + this.dnsHostName.hashCode()
        result = 31 * result + this.siteName.hashCode()
        result = 31 * result + this.siteObjectName.hashCode()
        result = 31 * result + this.computerObjectName.hashCode()
        result = 31 * result + this.serverObjectName.hashCode()
        result = 31 * result + this.ntdsDsaObjectName.hashCode()
        result = 31 * result + this.fIsPdc.hashCode()
        result = 31 * result + this.fDsEnabled.hashCode()
        result = 31 * result + this.fIsGc.hashCode()
        result = 31 * result + this.fIsRodc.hashCode()
        result = 31 * result + this.siteObjectGuid.hashCode()
        result = 31 * result + this.computerObjectGuid.hashCode()
        result = 31 * result + this.serverObjectGuid.hashCode()
        result = 31 * result + this.ntdsDsaObjectGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosName: Pwstr = MutPtr(0L),
            dnsHostName: Pwstr = MutPtr(0L),
            siteName: Pwstr = MutPtr(0L),
            siteObjectName: Pwstr = MutPtr(0L),
            computerObjectName: Pwstr = MutPtr(0L),
            serverObjectName: Pwstr = MutPtr(0L),
            ntdsDsaObjectName: Pwstr = MutPtr(0L),
            fIsPdc: Bool = 0,
            fDsEnabled: Bool = 0,
            fIsGc: Bool = 0,
            fIsRodc: Bool = 0,
            siteObjectGuid: Guid = Guid(),
            computerObjectGuid: Guid = Guid(),
            serverObjectGuid: Guid = Guid(),
            ntdsDsaObjectGuid: Guid = Guid(),
        ): DsDomainControllerInfo3w =
            DsDomainControllerInfo3w(
                netbiosNameCtorArg = netbiosName,
                dnsHostNameCtorArg = dnsHostName,
                siteNameCtorArg = siteName,
                siteObjectNameCtorArg = siteObjectName,
                computerObjectNameCtorArg = computerObjectName,
                serverObjectNameCtorArg = serverObjectName,
                ntdsDsaObjectNameCtorArg = ntdsDsaObjectName,
                fIsPdc = fIsPdc,
                fDsEnabled = fDsEnabled,
                fIsGc = fIsGc,
                fIsRodc = fIsRodc,
                siteObjectGuid = siteObjectGuid,
                computerObjectGuid = computerObjectGuid,
                serverObjectGuid = serverObjectGuid,
                ntdsDsaObjectGuid = ntdsDsaObjectGuid,
            )
    }
}

public class DsDomainTrustsa internal constructor(
    netbiosDomainNameCtorArg: Pstr,
    dnsDomainNameCtorArg: Pstr,
    public var flags: UInt,
    public var parentIndex: UInt,
    public var trustType: UInt,
    public var trustAttributes: UInt,
    domainSidCtorArg: Psid,
    public var domainGuid: Guid,
) {
    public var netbiosDomainName: Pstr = netbiosDomainNameCtorArg
        internal set

    public var dnsDomainName: Pstr = dnsDomainNameCtorArg
        internal set

    public var domainSid: Psid = domainSidCtorArg
        internal set

    public constructor() : this(
        netbiosDomainNameCtorArg = MutPtr(0L),
        dnsDomainNameCtorArg = MutPtr(0L),
        flags = 0u,
        parentIndex = 0u,
        trustType = 0u,
        trustAttributes = 0u,
        domainSidCtorArg = MutPtr(0L),
        domainGuid = Guid(),
    )

    public operator fun component1(): Pstr = this.netbiosDomainName

    public operator fun component2(): Pstr = this.dnsDomainName

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.parentIndex

    public operator fun component5(): UInt = this.trustType

    public operator fun component6(): UInt = this.trustAttributes

    public operator fun component7(): Psid = this.domainSid

    public operator fun component8(): Guid = this.domainGuid

    public fun copy(netbiosDomainName: Pstr = this.netbiosDomainName, dnsDomainName: Pstr = this.dnsDomainName, flags: UInt = this.flags, parentIndex: UInt = this.parentIndex, trustType: UInt = this.trustType, trustAttributes: UInt = this.trustAttributes, domainSid: Psid = this.domainSid, domainGuid: Guid = this.domainGuid): DsDomainTrustsa = DsDomainTrustsa(netbiosDomainNameCtorArg = netbiosDomainName, dnsDomainNameCtorArg = dnsDomainName, flags = flags, parentIndex = parentIndex, trustType = trustType, trustAttributes = trustAttributes, domainSidCtorArg = domainSid, domainGuid = domainGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainTrustsa) return false
        if (this.netbiosDomainName != other.netbiosDomainName) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.flags != other.flags) return false
        if (this.parentIndex != other.parentIndex) return false
        if (this.trustType != other.trustType) return false
        if (this.trustAttributes != other.trustAttributes) return false
        if (this.domainSid != other.domainSid) return false
        if (this.domainGuid != other.domainGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosDomainName.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.parentIndex.hashCode()
        result = 31 * result + this.trustType.hashCode()
        result = 31 * result + this.trustAttributes.hashCode()
        result = 31 * result + this.domainSid.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosDomainName: Pstr = MutPtr(0L),
            dnsDomainName: Pstr = MutPtr(0L),
            flags: UInt = 0u,
            parentIndex: UInt = 0u,
            trustType: UInt = 0u,
            trustAttributes: UInt = 0u,
            domainSid: Psid = MutPtr(0L),
            domainGuid: Guid = Guid(),
        ): DsDomainTrustsa =
            DsDomainTrustsa(
                netbiosDomainNameCtorArg = netbiosDomainName,
                dnsDomainNameCtorArg = dnsDomainName,
                flags = flags,
                parentIndex = parentIndex,
                trustType = trustType,
                trustAttributes = trustAttributes,
                domainSidCtorArg = domainSid,
                domainGuid = domainGuid,
            )
    }
}

public class DsDomainTrustsw internal constructor(
    netbiosDomainNameCtorArg: Pwstr,
    dnsDomainNameCtorArg: Pwstr,
    public var flags: UInt,
    public var parentIndex: UInt,
    public var trustType: UInt,
    public var trustAttributes: UInt,
    domainSidCtorArg: Psid,
    public var domainGuid: Guid,
) {
    public var netbiosDomainName: Pwstr = netbiosDomainNameCtorArg
        internal set

    public var dnsDomainName: Pwstr = dnsDomainNameCtorArg
        internal set

    public var domainSid: Psid = domainSidCtorArg
        internal set

    public constructor() : this(
        netbiosDomainNameCtorArg = MutPtr(0L),
        dnsDomainNameCtorArg = MutPtr(0L),
        flags = 0u,
        parentIndex = 0u,
        trustType = 0u,
        trustAttributes = 0u,
        domainSidCtorArg = MutPtr(0L),
        domainGuid = Guid(),
    )

    public operator fun component1(): Pwstr = this.netbiosDomainName

    public operator fun component2(): Pwstr = this.dnsDomainName

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.parentIndex

    public operator fun component5(): UInt = this.trustType

    public operator fun component6(): UInt = this.trustAttributes

    public operator fun component7(): Psid = this.domainSid

    public operator fun component8(): Guid = this.domainGuid

    public fun copy(netbiosDomainName: Pwstr = this.netbiosDomainName, dnsDomainName: Pwstr = this.dnsDomainName, flags: UInt = this.flags, parentIndex: UInt = this.parentIndex, trustType: UInt = this.trustType, trustAttributes: UInt = this.trustAttributes, domainSid: Psid = this.domainSid, domainGuid: Guid = this.domainGuid): DsDomainTrustsw = DsDomainTrustsw(netbiosDomainNameCtorArg = netbiosDomainName, dnsDomainNameCtorArg = dnsDomainName, flags = flags, parentIndex = parentIndex, trustType = trustType, trustAttributes = trustAttributes, domainSidCtorArg = domainSid, domainGuid = domainGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsDomainTrustsw) return false
        if (this.netbiosDomainName != other.netbiosDomainName) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.flags != other.flags) return false
        if (this.parentIndex != other.parentIndex) return false
        if (this.trustType != other.trustType) return false
        if (this.trustAttributes != other.trustAttributes) return false
        if (this.domainSid != other.domainSid) return false
        if (this.domainGuid != other.domainGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netbiosDomainName.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.parentIndex.hashCode()
        result = 31 * result + this.trustType.hashCode()
        result = 31 * result + this.trustAttributes.hashCode()
        result = 31 * result + this.domainSid.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netbiosDomainName: Pwstr = MutPtr(0L),
            dnsDomainName: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            parentIndex: UInt = 0u,
            trustType: UInt = 0u,
            trustAttributes: UInt = 0u,
            domainSid: Psid = MutPtr(0L),
            domainGuid: Guid = Guid(),
        ): DsDomainTrustsw =
            DsDomainTrustsw(
                netbiosDomainNameCtorArg = netbiosDomainName,
                dnsDomainNameCtorArg = dnsDomainName,
                flags = flags,
                parentIndex = parentIndex,
                trustType = trustType,
                trustAttributes = trustAttributes,
                domainSidCtorArg = domainSid,
                domainGuid = domainGuid,
            )
    }
}

public class DsNameResulta internal constructor(
    public var cItems: UInt,
    rItemsCtorArg: MutPtr,
) {
    public var rItems: MutPtr = rItemsCtorArg
        internal set

    public constructor() : this(
        cItems = 0u,
        rItemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cItems

    public operator fun component2(): MutPtr = this.rItems

    public fun copy(cItems: UInt = this.cItems, rItems: MutPtr = this.rItems): DsNameResulta = DsNameResulta(cItems = cItems, rItemsCtorArg = rItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsNameResulta) return false
        if (this.cItems != other.cItems) return false
        if (this.rItems != other.rItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cItems.hashCode()
        result = 31 * result + this.rItems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsNameResulta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsNameResulta> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DsNameResulta =
                    DsNameResulta(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DsNameResulta) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rItems)
                }
            }

        public operator fun invoke(
            cItems: UInt = 0u,
            rItems: MutPtr = MutPtr(0L),
        ): DsNameResulta =
            DsNameResulta(
                cItems = cItems,
                rItemsCtorArg = rItems,
            )
    }
}

public class DsNameResultw internal constructor(
    public var cItems: UInt,
    rItemsCtorArg: MutPtr,
) {
    public var rItems: MutPtr = rItemsCtorArg
        internal set

    public constructor() : this(
        cItems = 0u,
        rItemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cItems

    public operator fun component2(): MutPtr = this.rItems

    public fun copy(cItems: UInt = this.cItems, rItems: MutPtr = this.rItems): DsNameResultw = DsNameResultw(cItems = cItems, rItemsCtorArg = rItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsNameResultw) return false
        if (this.cItems != other.cItems) return false
        if (this.rItems != other.rItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cItems.hashCode()
        result = 31 * result + this.rItems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsNameResultw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsNameResultw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DsNameResultw =
                    DsNameResultw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DsNameResultw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rItems)
                }
            }

        public operator fun invoke(
            cItems: UInt = 0u,
            rItems: MutPtr = MutPtr(0L),
        ): DsNameResultw =
            DsNameResultw(
                cItems = cItems,
                rItemsCtorArg = rItems,
            )
    }
}

public class DsNameResultItema internal constructor(
    public var status: UInt,
    pDomainCtorArg: Pstr,
    pNameCtorArg: Pstr,
) {
    public var pDomain: Pstr = pDomainCtorArg
        internal set

    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        status = 0u,
        pDomainCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.status

    public operator fun component2(): Pstr = this.pDomain

    public operator fun component3(): Pstr = this.pName

    public fun copy(status: UInt = this.status, pDomain: Pstr = this.pDomain, pName: Pstr = this.pName): DsNameResultItema = DsNameResultItema(status = status, pDomainCtorArg = pDomain, pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsNameResultItema) return false
        if (this.status != other.status) return false
        if (this.pDomain != other.pDomain) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pDomain.hashCode()
        result = 31 * result + this.pName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: UInt = 0u,
            pDomain: Pstr = MutPtr(0L),
            pName: Pstr = MutPtr(0L),
        ): DsNameResultItema =
            DsNameResultItema(
                status = status,
                pDomainCtorArg = pDomain,
                pNameCtorArg = pName,
            )
    }
}

public class DsNameResultItemw internal constructor(
    public var status: UInt,
    pDomainCtorArg: Pwstr,
    pNameCtorArg: Pwstr,
) {
    public var pDomain: Pwstr = pDomainCtorArg
        internal set

    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        status = 0u,
        pDomainCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.status

    public operator fun component2(): Pwstr = this.pDomain

    public operator fun component3(): Pwstr = this.pName

    public fun copy(status: UInt = this.status, pDomain: Pwstr = this.pDomain, pName: Pwstr = this.pName): DsNameResultItemw = DsNameResultItemw(status = status, pDomainCtorArg = pDomain, pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsNameResultItemw) return false
        if (this.status != other.status) return false
        if (this.pDomain != other.pDomain) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pDomain.hashCode()
        result = 31 * result + this.pName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: UInt = 0u,
            pDomain: Pwstr = MutPtr(0L),
            pName: Pwstr = MutPtr(0L),
        ): DsNameResultItemw =
            DsNameResultItemw(
                status = status,
                pDomainCtorArg = pDomain,
                pNameCtorArg = pName,
            )
    }
}

public class DsReplAttrMetaData internal constructor(
    pszAttributeNameCtorArg: Pwstr,
    public var dwVersion: UInt,
    public var ftimeLastOriginatingChange: Filetime,
    public var uuidLastOriginatingDsaInvocationID: Guid,
    public var usnOriginatingChange: Long,
    public var usnLocalChange: Long,
) {
    public var pszAttributeName: Pwstr = pszAttributeNameCtorArg
        internal set

    public constructor() : this(
        pszAttributeNameCtorArg = MutPtr(0L),
        dwVersion = 0u,
        ftimeLastOriginatingChange = Filetime(),
        uuidLastOriginatingDsaInvocationID = Guid(),
        usnOriginatingChange = 0L,
        usnLocalChange = 0L,
    )

    public operator fun component1(): Pwstr = this.pszAttributeName

    public operator fun component2(): UInt = this.dwVersion

    public operator fun component3(): Filetime = this.ftimeLastOriginatingChange

    public operator fun component4(): Guid = this.uuidLastOriginatingDsaInvocationID

    public operator fun component5(): Long = this.usnOriginatingChange

    public operator fun component6(): Long = this.usnLocalChange

    public fun copy(pszAttributeName: Pwstr = this.pszAttributeName, dwVersion: UInt = this.dwVersion, ftimeLastOriginatingChange: Filetime = this.ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID: Guid = this.uuidLastOriginatingDsaInvocationID, usnOriginatingChange: Long = this.usnOriginatingChange, usnLocalChange: Long = this.usnLocalChange): DsReplAttrMetaData = DsReplAttrMetaData(pszAttributeNameCtorArg = pszAttributeName, dwVersion = dwVersion, ftimeLastOriginatingChange = ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID, usnOriginatingChange = usnOriginatingChange, usnLocalChange = usnLocalChange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplAttrMetaData) return false
        if (this.pszAttributeName != other.pszAttributeName) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ftimeLastOriginatingChange != other.ftimeLastOriginatingChange) return false
        if (this.uuidLastOriginatingDsaInvocationID != other.uuidLastOriginatingDsaInvocationID) return false
        if (this.usnOriginatingChange != other.usnOriginatingChange) return false
        if (this.usnLocalChange != other.usnLocalChange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttributeName.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ftimeLastOriginatingChange.hashCode()
        result = 31 * result + this.uuidLastOriginatingDsaInvocationID.hashCode()
        result = 31 * result + this.usnOriginatingChange.hashCode()
        result = 31 * result + this.usnLocalChange.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttributeName: Pwstr = MutPtr(0L),
            dwVersion: UInt = 0u,
            ftimeLastOriginatingChange: Filetime = Filetime(),
            uuidLastOriginatingDsaInvocationID: Guid = Guid(),
            usnOriginatingChange: Long = 0L,
            usnLocalChange: Long = 0L,
        ): DsReplAttrMetaData =
            DsReplAttrMetaData(
                pszAttributeNameCtorArg = pszAttributeName,
                dwVersion = dwVersion,
                ftimeLastOriginatingChange = ftimeLastOriginatingChange,
                uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID,
                usnOriginatingChange = usnOriginatingChange,
                usnLocalChange = usnLocalChange,
            )
    }
}

public class DsReplAttrMetaData2 internal constructor(
    pszAttributeNameCtorArg: Pwstr,
    public var dwVersion: UInt,
    public var ftimeLastOriginatingChange: Filetime,
    public var uuidLastOriginatingDsaInvocationID: Guid,
    public var usnOriginatingChange: Long,
    public var usnLocalChange: Long,
    pszLastOriginatingDsaDNCtorArg: Pwstr,
) {
    public var pszAttributeName: Pwstr = pszAttributeNameCtorArg
        internal set

    public var pszLastOriginatingDsaDN: Pwstr = pszLastOriginatingDsaDNCtorArg
        internal set

    public constructor() : this(
        pszAttributeNameCtorArg = MutPtr(0L),
        dwVersion = 0u,
        ftimeLastOriginatingChange = Filetime(),
        uuidLastOriginatingDsaInvocationID = Guid(),
        usnOriginatingChange = 0L,
        usnLocalChange = 0L,
        pszLastOriginatingDsaDNCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszAttributeName

    public operator fun component2(): UInt = this.dwVersion

    public operator fun component3(): Filetime = this.ftimeLastOriginatingChange

    public operator fun component4(): Guid = this.uuidLastOriginatingDsaInvocationID

    public operator fun component5(): Long = this.usnOriginatingChange

    public operator fun component6(): Long = this.usnLocalChange

    public operator fun component7(): Pwstr = this.pszLastOriginatingDsaDN

    public fun copy(pszAttributeName: Pwstr = this.pszAttributeName, dwVersion: UInt = this.dwVersion, ftimeLastOriginatingChange: Filetime = this.ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID: Guid = this.uuidLastOriginatingDsaInvocationID, usnOriginatingChange: Long = this.usnOriginatingChange, usnLocalChange: Long = this.usnLocalChange, pszLastOriginatingDsaDN: Pwstr = this.pszLastOriginatingDsaDN): DsReplAttrMetaData2 = DsReplAttrMetaData2(pszAttributeNameCtorArg = pszAttributeName, dwVersion = dwVersion, ftimeLastOriginatingChange = ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID, usnOriginatingChange = usnOriginatingChange, usnLocalChange = usnLocalChange, pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplAttrMetaData2) return false
        if (this.pszAttributeName != other.pszAttributeName) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ftimeLastOriginatingChange != other.ftimeLastOriginatingChange) return false
        if (this.uuidLastOriginatingDsaInvocationID != other.uuidLastOriginatingDsaInvocationID) return false
        if (this.usnOriginatingChange != other.usnOriginatingChange) return false
        if (this.usnLocalChange != other.usnLocalChange) return false
        if (this.pszLastOriginatingDsaDN != other.pszLastOriginatingDsaDN) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttributeName.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ftimeLastOriginatingChange.hashCode()
        result = 31 * result + this.uuidLastOriginatingDsaInvocationID.hashCode()
        result = 31 * result + this.usnOriginatingChange.hashCode()
        result = 31 * result + this.usnLocalChange.hashCode()
        result = 31 * result + this.pszLastOriginatingDsaDN.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttributeName: Pwstr = MutPtr(0L),
            dwVersion: UInt = 0u,
            ftimeLastOriginatingChange: Filetime = Filetime(),
            uuidLastOriginatingDsaInvocationID: Guid = Guid(),
            usnOriginatingChange: Long = 0L,
            usnLocalChange: Long = 0L,
            pszLastOriginatingDsaDN: Pwstr = MutPtr(0L),
        ): DsReplAttrMetaData2 =
            DsReplAttrMetaData2(
                pszAttributeNameCtorArg = pszAttributeName,
                dwVersion = dwVersion,
                ftimeLastOriginatingChange = ftimeLastOriginatingChange,
                uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID,
                usnOriginatingChange = usnOriginatingChange,
                usnLocalChange = usnLocalChange,
                pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN,
            )
    }
}

public data class DsReplAttrMetaDataBlob(
    public var oszAttributeName: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DsReplAttrValueMetaData(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaData> = List(1) { DsReplValueMetaData() },
)

public data class DsReplAttrValueMetaData2(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaData2> = List(1) { DsReplValueMetaData2() },
)

public data class DsReplAttrValueMetaDataExt(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaDataExt> = List(1) { DsReplValueMetaDataExt() },
)

public data class DsReplCursor(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
)

public data class DsReplCursors(
    public var cNumCursors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgCursor: List<DsReplCursor> = List(1) { DsReplCursor() },
)

public data class DsReplCursors2(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DsReplCursor2> = List(1) { DsReplCursor2() },
)

public data class DsReplCursors3w(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DsReplCursor3w> = List(1) { DsReplCursor3w() },
)

public data class DsReplCursor2(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
)

public class DsReplCursor3w internal constructor(
    public var uuidSourceDsaInvocationID: Guid,
    public var usnAttributeFilter: Long,
    public var ftimeLastSyncSuccess: Filetime,
    pszSourceDsaDNCtorArg: Pwstr,
) {
    public var pszSourceDsaDN: Pwstr = pszSourceDsaDNCtorArg
        internal set

    public constructor() : this(
        uuidSourceDsaInvocationID = Guid(),
        usnAttributeFilter = 0L,
        ftimeLastSyncSuccess = Filetime(),
        pszSourceDsaDNCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.uuidSourceDsaInvocationID

    public operator fun component2(): Long = this.usnAttributeFilter

    public operator fun component3(): Filetime = this.ftimeLastSyncSuccess

    public operator fun component4(): Pwstr = this.pszSourceDsaDN

    public fun copy(uuidSourceDsaInvocationID: Guid = this.uuidSourceDsaInvocationID, usnAttributeFilter: Long = this.usnAttributeFilter, ftimeLastSyncSuccess: Filetime = this.ftimeLastSyncSuccess, pszSourceDsaDN: Pwstr = this.pszSourceDsaDN): DsReplCursor3w = DsReplCursor3w(uuidSourceDsaInvocationID = uuidSourceDsaInvocationID, usnAttributeFilter = usnAttributeFilter, ftimeLastSyncSuccess = ftimeLastSyncSuccess, pszSourceDsaDNCtorArg = pszSourceDsaDN)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplCursor3w) return false
        if (this.uuidSourceDsaInvocationID != other.uuidSourceDsaInvocationID) return false
        if (this.usnAttributeFilter != other.usnAttributeFilter) return false
        if (this.ftimeLastSyncSuccess != other.ftimeLastSyncSuccess) return false
        if (this.pszSourceDsaDN != other.pszSourceDsaDN) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uuidSourceDsaInvocationID.hashCode()
        result = 31 * result + this.usnAttributeFilter.hashCode()
        result = 31 * result + this.ftimeLastSyncSuccess.hashCode()
        result = 31 * result + this.pszSourceDsaDN.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uuidSourceDsaInvocationID: Guid = Guid(),
            usnAttributeFilter: Long = 0L,
            ftimeLastSyncSuccess: Filetime = Filetime(),
            pszSourceDsaDN: Pwstr = MutPtr(0L),
        ): DsReplCursor3w =
            DsReplCursor3w(
                uuidSourceDsaInvocationID = uuidSourceDsaInvocationID,
                usnAttributeFilter = usnAttributeFilter,
                ftimeLastSyncSuccess = ftimeLastSyncSuccess,
                pszSourceDsaDNCtorArg = pszSourceDsaDN,
            )
    }
}

public data class DsReplCursorBlob(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var oszSourceDsaDN: UInt = 0u,
)

public data class DsReplKccDsaFailuresw(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgDsaFailure: List<DsReplKccDsaFailurew> = List(1) { DsReplKccDsaFailurew() },
)

public class DsReplKccDsaFailurew internal constructor(
    pszDsaDNCtorArg: Pwstr,
    public var uuidDsaObjGuid: Guid,
    public var ftimeFirstFailure: Filetime,
    public var cNumFailures: UInt,
    public var dwLastResult: UInt,
) {
    public var pszDsaDN: Pwstr = pszDsaDNCtorArg
        internal set

    public constructor() : this(
        pszDsaDNCtorArg = MutPtr(0L),
        uuidDsaObjGuid = Guid(),
        ftimeFirstFailure = Filetime(),
        cNumFailures = 0u,
        dwLastResult = 0u,
    )

    public operator fun component1(): Pwstr = this.pszDsaDN

    public operator fun component2(): Guid = this.uuidDsaObjGuid

    public operator fun component3(): Filetime = this.ftimeFirstFailure

    public operator fun component4(): UInt = this.cNumFailures

    public operator fun component5(): UInt = this.dwLastResult

    public fun copy(pszDsaDN: Pwstr = this.pszDsaDN, uuidDsaObjGuid: Guid = this.uuidDsaObjGuid, ftimeFirstFailure: Filetime = this.ftimeFirstFailure, cNumFailures: UInt = this.cNumFailures, dwLastResult: UInt = this.dwLastResult): DsReplKccDsaFailurew = DsReplKccDsaFailurew(pszDsaDNCtorArg = pszDsaDN, uuidDsaObjGuid = uuidDsaObjGuid, ftimeFirstFailure = ftimeFirstFailure, cNumFailures = cNumFailures, dwLastResult = dwLastResult)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplKccDsaFailurew) return false
        if (this.pszDsaDN != other.pszDsaDN) return false
        if (this.uuidDsaObjGuid != other.uuidDsaObjGuid) return false
        if (this.ftimeFirstFailure != other.ftimeFirstFailure) return false
        if (this.cNumFailures != other.cNumFailures) return false
        if (this.dwLastResult != other.dwLastResult) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszDsaDN.hashCode()
        result = 31 * result + this.uuidDsaObjGuid.hashCode()
        result = 31 * result + this.ftimeFirstFailure.hashCode()
        result = 31 * result + this.cNumFailures.hashCode()
        result = 31 * result + this.dwLastResult.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszDsaDN: Pwstr = MutPtr(0L),
            uuidDsaObjGuid: Guid = Guid(),
            ftimeFirstFailure: Filetime = Filetime(),
            cNumFailures: UInt = 0u,
            dwLastResult: UInt = 0u,
        ): DsReplKccDsaFailurew =
            DsReplKccDsaFailurew(
                pszDsaDNCtorArg = pszDsaDN,
                uuidDsaObjGuid = uuidDsaObjGuid,
                ftimeFirstFailure = ftimeFirstFailure,
                cNumFailures = cNumFailures,
                dwLastResult = dwLastResult,
            )
    }
}

public data class DsReplKccDsaFailurewBlob(
    public var oszDsaDN: UInt = 0u,
    public var uuidDsaObjGuid: Guid = Guid(),
    public var ftimeFirstFailure: Filetime = Filetime(),
    public var cNumFailures: UInt = 0u,
    public var dwLastResult: UInt = 0u,
)

public data class DsReplNeighborsw(
    public var cNumNeighbors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgNeighbor: List<DsReplNeighborw> = List(1) { DsReplNeighborw() },
)

public class DsReplNeighborw internal constructor(
    pszNamingContextCtorArg: Pwstr,
    pszSourceDsaDNCtorArg: Pwstr,
    pszSourceDsaAddressCtorArg: Pwstr,
    pszAsyncIntersiteTransportDNCtorArg: Pwstr,
    public var dwReplicaFlags: UInt,
    public var dwReserved: UInt,
    public var uuidNamingContextObjGuid: Guid,
    public var uuidSourceDsaObjGuid: Guid,
    public var uuidSourceDsaInvocationID: Guid,
    public var uuidAsyncIntersiteTransportObjGuid: Guid,
    public var usnLastObjChangeSynced: Long,
    public var usnAttributeFilter: Long,
    public var ftimeLastSyncSuccess: Filetime,
    public var ftimeLastSyncAttempt: Filetime,
    public var dwLastSyncResult: UInt,
    public var cNumConsecutiveSyncFailures: UInt,
) {
    public var pszNamingContext: Pwstr = pszNamingContextCtorArg
        internal set

    public var pszSourceDsaDN: Pwstr = pszSourceDsaDNCtorArg
        internal set

    public var pszSourceDsaAddress: Pwstr = pszSourceDsaAddressCtorArg
        internal set

    public var pszAsyncIntersiteTransportDN: Pwstr = pszAsyncIntersiteTransportDNCtorArg
        internal set

    public constructor() : this(
        pszNamingContextCtorArg = MutPtr(0L),
        pszSourceDsaDNCtorArg = MutPtr(0L),
        pszSourceDsaAddressCtorArg = MutPtr(0L),
        pszAsyncIntersiteTransportDNCtorArg = MutPtr(0L),
        dwReplicaFlags = 0u,
        dwReserved = 0u,
        uuidNamingContextObjGuid = Guid(),
        uuidSourceDsaObjGuid = Guid(),
        uuidSourceDsaInvocationID = Guid(),
        uuidAsyncIntersiteTransportObjGuid = Guid(),
        usnLastObjChangeSynced = 0L,
        usnAttributeFilter = 0L,
        ftimeLastSyncSuccess = Filetime(),
        ftimeLastSyncAttempt = Filetime(),
        dwLastSyncResult = 0u,
        cNumConsecutiveSyncFailures = 0u,
    )

    public operator fun component1(): Pwstr = this.pszNamingContext

    public operator fun component2(): Pwstr = this.pszSourceDsaDN

    public operator fun component3(): Pwstr = this.pszSourceDsaAddress

    public operator fun component4(): Pwstr = this.pszAsyncIntersiteTransportDN

    public operator fun component5(): UInt = this.dwReplicaFlags

    public operator fun component6(): UInt = this.dwReserved

    public operator fun component7(): Guid = this.uuidNamingContextObjGuid

    public operator fun component8(): Guid = this.uuidSourceDsaObjGuid

    public operator fun component9(): Guid = this.uuidSourceDsaInvocationID

    public operator fun component10(): Guid = this.uuidAsyncIntersiteTransportObjGuid

    public operator fun component11(): Long = this.usnLastObjChangeSynced

    public operator fun component12(): Long = this.usnAttributeFilter

    public operator fun component13(): Filetime = this.ftimeLastSyncSuccess

    public operator fun component14(): Filetime = this.ftimeLastSyncAttempt

    public operator fun component15(): UInt = this.dwLastSyncResult

    public operator fun component16(): UInt = this.cNumConsecutiveSyncFailures

    public fun copy(pszNamingContext: Pwstr = this.pszNamingContext, pszSourceDsaDN: Pwstr = this.pszSourceDsaDN, pszSourceDsaAddress: Pwstr = this.pszSourceDsaAddress, pszAsyncIntersiteTransportDN: Pwstr = this.pszAsyncIntersiteTransportDN, dwReplicaFlags: UInt = this.dwReplicaFlags, dwReserved: UInt = this.dwReserved, uuidNamingContextObjGuid: Guid = this.uuidNamingContextObjGuid, uuidSourceDsaObjGuid: Guid = this.uuidSourceDsaObjGuid, uuidSourceDsaInvocationID: Guid = this.uuidSourceDsaInvocationID, uuidAsyncIntersiteTransportObjGuid: Guid = this.uuidAsyncIntersiteTransportObjGuid, usnLastObjChangeSynced: Long = this.usnLastObjChangeSynced, usnAttributeFilter: Long = this.usnAttributeFilter, ftimeLastSyncSuccess: Filetime = this.ftimeLastSyncSuccess, ftimeLastSyncAttempt: Filetime = this.ftimeLastSyncAttempt, dwLastSyncResult: UInt = this.dwLastSyncResult, cNumConsecutiveSyncFailures: UInt = this.cNumConsecutiveSyncFailures): DsReplNeighborw = DsReplNeighborw(pszNamingContextCtorArg = pszNamingContext, pszSourceDsaDNCtorArg = pszSourceDsaDN, pszSourceDsaAddressCtorArg = pszSourceDsaAddress, pszAsyncIntersiteTransportDNCtorArg = pszAsyncIntersiteTransportDN, dwReplicaFlags = dwReplicaFlags, dwReserved = dwReserved, uuidNamingContextObjGuid = uuidNamingContextObjGuid, uuidSourceDsaObjGuid = uuidSourceDsaObjGuid, uuidSourceDsaInvocationID = uuidSourceDsaInvocationID, uuidAsyncIntersiteTransportObjGuid = uuidAsyncIntersiteTransportObjGuid, usnLastObjChangeSynced = usnLastObjChangeSynced, usnAttributeFilter = usnAttributeFilter, ftimeLastSyncSuccess = ftimeLastSyncSuccess, ftimeLastSyncAttempt = ftimeLastSyncAttempt, dwLastSyncResult = dwLastSyncResult, cNumConsecutiveSyncFailures = cNumConsecutiveSyncFailures)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplNeighborw) return false
        if (this.pszNamingContext != other.pszNamingContext) return false
        if (this.pszSourceDsaDN != other.pszSourceDsaDN) return false
        if (this.pszSourceDsaAddress != other.pszSourceDsaAddress) return false
        if (this.pszAsyncIntersiteTransportDN != other.pszAsyncIntersiteTransportDN) return false
        if (this.dwReplicaFlags != other.dwReplicaFlags) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.uuidNamingContextObjGuid != other.uuidNamingContextObjGuid) return false
        if (this.uuidSourceDsaObjGuid != other.uuidSourceDsaObjGuid) return false
        if (this.uuidSourceDsaInvocationID != other.uuidSourceDsaInvocationID) return false
        if (this.uuidAsyncIntersiteTransportObjGuid != other.uuidAsyncIntersiteTransportObjGuid) return false
        if (this.usnLastObjChangeSynced != other.usnLastObjChangeSynced) return false
        if (this.usnAttributeFilter != other.usnAttributeFilter) return false
        if (this.ftimeLastSyncSuccess != other.ftimeLastSyncSuccess) return false
        if (this.ftimeLastSyncAttempt != other.ftimeLastSyncAttempt) return false
        if (this.dwLastSyncResult != other.dwLastSyncResult) return false
        if (this.cNumConsecutiveSyncFailures != other.cNumConsecutiveSyncFailures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszNamingContext.hashCode()
        result = 31 * result + this.pszSourceDsaDN.hashCode()
        result = 31 * result + this.pszSourceDsaAddress.hashCode()
        result = 31 * result + this.pszAsyncIntersiteTransportDN.hashCode()
        result = 31 * result + this.dwReplicaFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.uuidNamingContextObjGuid.hashCode()
        result = 31 * result + this.uuidSourceDsaObjGuid.hashCode()
        result = 31 * result + this.uuidSourceDsaInvocationID.hashCode()
        result = 31 * result + this.uuidAsyncIntersiteTransportObjGuid.hashCode()
        result = 31 * result + this.usnLastObjChangeSynced.hashCode()
        result = 31 * result + this.usnAttributeFilter.hashCode()
        result = 31 * result + this.ftimeLastSyncSuccess.hashCode()
        result = 31 * result + this.ftimeLastSyncAttempt.hashCode()
        result = 31 * result + this.dwLastSyncResult.hashCode()
        result = 31 * result + this.cNumConsecutiveSyncFailures.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszNamingContext: Pwstr = MutPtr(0L),
            pszSourceDsaDN: Pwstr = MutPtr(0L),
            pszSourceDsaAddress: Pwstr = MutPtr(0L),
            pszAsyncIntersiteTransportDN: Pwstr = MutPtr(0L),
            dwReplicaFlags: UInt = 0u,
            dwReserved: UInt = 0u,
            uuidNamingContextObjGuid: Guid = Guid(),
            uuidSourceDsaObjGuid: Guid = Guid(),
            uuidSourceDsaInvocationID: Guid = Guid(),
            uuidAsyncIntersiteTransportObjGuid: Guid = Guid(),
            usnLastObjChangeSynced: Long = 0L,
            usnAttributeFilter: Long = 0L,
            ftimeLastSyncSuccess: Filetime = Filetime(),
            ftimeLastSyncAttempt: Filetime = Filetime(),
            dwLastSyncResult: UInt = 0u,
            cNumConsecutiveSyncFailures: UInt = 0u,
        ): DsReplNeighborw =
            DsReplNeighborw(
                pszNamingContextCtorArg = pszNamingContext,
                pszSourceDsaDNCtorArg = pszSourceDsaDN,
                pszSourceDsaAddressCtorArg = pszSourceDsaAddress,
                pszAsyncIntersiteTransportDNCtorArg = pszAsyncIntersiteTransportDN,
                dwReplicaFlags = dwReplicaFlags,
                dwReserved = dwReserved,
                uuidNamingContextObjGuid = uuidNamingContextObjGuid,
                uuidSourceDsaObjGuid = uuidSourceDsaObjGuid,
                uuidSourceDsaInvocationID = uuidSourceDsaInvocationID,
                uuidAsyncIntersiteTransportObjGuid = uuidAsyncIntersiteTransportObjGuid,
                usnLastObjChangeSynced = usnLastObjChangeSynced,
                usnAttributeFilter = usnAttributeFilter,
                ftimeLastSyncSuccess = ftimeLastSyncSuccess,
                ftimeLastSyncAttempt = ftimeLastSyncAttempt,
                dwLastSyncResult = dwLastSyncResult,
                cNumConsecutiveSyncFailures = cNumConsecutiveSyncFailures,
            )
    }
}

public data class DsReplNeighborwBlob(
    public var oszNamingContext: UInt = 0u,
    public var oszSourceDsaDN: UInt = 0u,
    public var oszSourceDsaAddress: UInt = 0u,
    public var oszAsyncIntersiteTransportDN: UInt = 0u,
    public var dwReplicaFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidSourceDsaObjGuid: Guid = Guid(),
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var uuidAsyncIntersiteTransportObjGuid: Guid = Guid(),
    public var usnLastObjChangeSynced: Long = 0L,
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var ftimeLastSyncAttempt: Filetime = Filetime(),
    public var dwLastSyncResult: UInt = 0u,
    public var cNumConsecutiveSyncFailures: UInt = 0u,
)

public data class DsReplObjMetaData(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DsReplAttrMetaData> = List(1) { DsReplAttrMetaData() },
)

public data class DsReplObjMetaData2(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DsReplAttrMetaData2> = List(1) { DsReplAttrMetaData2() },
)

public class DsReplOpw internal constructor(
    public var ftimeEnqueued: Filetime,
    public var ulSerialNumber: UInt,
    public var ulPriority: UInt,
    public var opType: DsReplOpType,
    public var ulOptions: UInt,
    pszNamingContextCtorArg: Pwstr,
    pszDsaDNCtorArg: Pwstr,
    pszDsaAddressCtorArg: Pwstr,
    public var uuidNamingContextObjGuid: Guid,
    public var uuidDsaObjGuid: Guid,
) {
    public var pszNamingContext: Pwstr = pszNamingContextCtorArg
        internal set

    public var pszDsaDN: Pwstr = pszDsaDNCtorArg
        internal set

    public var pszDsaAddress: Pwstr = pszDsaAddressCtorArg
        internal set

    public constructor() : this(
        ftimeEnqueued = Filetime(),
        ulSerialNumber = 0u,
        ulPriority = 0u,
        opType = 0,
        ulOptions = 0u,
        pszNamingContextCtorArg = MutPtr(0L),
        pszDsaDNCtorArg = MutPtr(0L),
        pszDsaAddressCtorArg = MutPtr(0L),
        uuidNamingContextObjGuid = Guid(),
        uuidDsaObjGuid = Guid(),
    )

    public operator fun component1(): Filetime = this.ftimeEnqueued

    public operator fun component2(): UInt = this.ulSerialNumber

    public operator fun component3(): UInt = this.ulPriority

    public operator fun component4(): DsReplOpType = this.opType

    public operator fun component5(): UInt = this.ulOptions

    public operator fun component6(): Pwstr = this.pszNamingContext

    public operator fun component7(): Pwstr = this.pszDsaDN

    public operator fun component8(): Pwstr = this.pszDsaAddress

    public operator fun component9(): Guid = this.uuidNamingContextObjGuid

    public operator fun component10(): Guid = this.uuidDsaObjGuid

    public fun copy(ftimeEnqueued: Filetime = this.ftimeEnqueued, ulSerialNumber: UInt = this.ulSerialNumber, ulPriority: UInt = this.ulPriority, opType: DsReplOpType = this.opType, ulOptions: UInt = this.ulOptions, pszNamingContext: Pwstr = this.pszNamingContext, pszDsaDN: Pwstr = this.pszDsaDN, pszDsaAddress: Pwstr = this.pszDsaAddress, uuidNamingContextObjGuid: Guid = this.uuidNamingContextObjGuid, uuidDsaObjGuid: Guid = this.uuidDsaObjGuid): DsReplOpw = DsReplOpw(ftimeEnqueued = ftimeEnqueued, ulSerialNumber = ulSerialNumber, ulPriority = ulPriority, opType = opType, ulOptions = ulOptions, pszNamingContextCtorArg = pszNamingContext, pszDsaDNCtorArg = pszDsaDN, pszDsaAddressCtorArg = pszDsaAddress, uuidNamingContextObjGuid = uuidNamingContextObjGuid, uuidDsaObjGuid = uuidDsaObjGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplOpw) return false
        if (this.ftimeEnqueued != other.ftimeEnqueued) return false
        if (this.ulSerialNumber != other.ulSerialNumber) return false
        if (this.ulPriority != other.ulPriority) return false
        if (this.opType != other.opType) return false
        if (this.ulOptions != other.ulOptions) return false
        if (this.pszNamingContext != other.pszNamingContext) return false
        if (this.pszDsaDN != other.pszDsaDN) return false
        if (this.pszDsaAddress != other.pszDsaAddress) return false
        if (this.uuidNamingContextObjGuid != other.uuidNamingContextObjGuid) return false
        if (this.uuidDsaObjGuid != other.uuidDsaObjGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ftimeEnqueued.hashCode()
        result = 31 * result + this.ulSerialNumber.hashCode()
        result = 31 * result + this.ulPriority.hashCode()
        result = 31 * result + this.opType.hashCode()
        result = 31 * result + this.ulOptions.hashCode()
        result = 31 * result + this.pszNamingContext.hashCode()
        result = 31 * result + this.pszDsaDN.hashCode()
        result = 31 * result + this.pszDsaAddress.hashCode()
        result = 31 * result + this.uuidNamingContextObjGuid.hashCode()
        result = 31 * result + this.uuidDsaObjGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ftimeEnqueued: Filetime = Filetime(),
            ulSerialNumber: UInt = 0u,
            ulPriority: UInt = 0u,
            opType: DsReplOpType = 0,
            ulOptions: UInt = 0u,
            pszNamingContext: Pwstr = MutPtr(0L),
            pszDsaDN: Pwstr = MutPtr(0L),
            pszDsaAddress: Pwstr = MutPtr(0L),
            uuidNamingContextObjGuid: Guid = Guid(),
            uuidDsaObjGuid: Guid = Guid(),
        ): DsReplOpw =
            DsReplOpw(
                ftimeEnqueued = ftimeEnqueued,
                ulSerialNumber = ulSerialNumber,
                ulPriority = ulPriority,
                opType = opType,
                ulOptions = ulOptions,
                pszNamingContextCtorArg = pszNamingContext,
                pszDsaDNCtorArg = pszDsaDN,
                pszDsaAddressCtorArg = pszDsaAddress,
                uuidNamingContextObjGuid = uuidNamingContextObjGuid,
                uuidDsaObjGuid = uuidDsaObjGuid,
            )
    }
}

public data class DsReplOpwBlob(
    public var ftimeEnqueued: Filetime = Filetime(),
    public var ulSerialNumber: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var opType: DsReplOpType = 0,
    public var ulOptions: UInt = 0u,
    public var oszNamingContext: UInt = 0u,
    public var oszDsaDN: UInt = 0u,
    public var oszDsaAddress: UInt = 0u,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidDsaObjGuid: Guid = Guid(),
)

public data class DsReplPendingOpsw(
    public var ftimeCurrentOpStarted: Filetime = Filetime(),
    public var cNumPendingOps: UInt = 0u,
    public var rgPendingOp: List<DsReplOpw> = List(1) { DsReplOpw() },
)

public data class DsReplQueueStatisticsw(
    public var ftimeCurrentOpStarted: Filetime = Filetime(),
    public var cNumPendingOps: UInt = 0u,
    public var ftimeOldestSync: Filetime = Filetime(),
    public var ftimeOldestAdd: Filetime = Filetime(),
    public var ftimeOldestMod: Filetime = Filetime(),
    public var ftimeOldestDel: Filetime = Filetime(),
    public var ftimeOldestUpdRefs: Filetime = Filetime(),
)

public class DsReplValueMetaData internal constructor(
    pszAttributeNameCtorArg: Pwstr,
    pszObjectDnCtorArg: Pwstr,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
    public var ftimeDeleted: Filetime,
    public var ftimeCreated: Filetime,
    public var dwVersion: UInt,
    public var ftimeLastOriginatingChange: Filetime,
    public var uuidLastOriginatingDsaInvocationID: Guid,
    public var usnOriginatingChange: Long,
    public var usnLocalChange: Long,
) {
    public var pszAttributeName: Pwstr = pszAttributeNameCtorArg
        internal set

    public var pszObjectDn: Pwstr = pszObjectDnCtorArg
        internal set

    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        pszAttributeNameCtorArg = MutPtr(0L),
        pszObjectDnCtorArg = MutPtr(0L),
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
        ftimeDeleted = Filetime(),
        ftimeCreated = Filetime(),
        dwVersion = 0u,
        ftimeLastOriginatingChange = Filetime(),
        uuidLastOriginatingDsaInvocationID = Guid(),
        usnOriginatingChange = 0L,
        usnLocalChange = 0L,
    )

    public operator fun component1(): Pwstr = this.pszAttributeName

    public operator fun component2(): Pwstr = this.pszObjectDn

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): MutPtr = this.pbData

    public operator fun component5(): Filetime = this.ftimeDeleted

    public operator fun component6(): Filetime = this.ftimeCreated

    public operator fun component7(): UInt = this.dwVersion

    public operator fun component8(): Filetime = this.ftimeLastOriginatingChange

    public operator fun component9(): Guid = this.uuidLastOriginatingDsaInvocationID

    public operator fun component10(): Long = this.usnOriginatingChange

    public operator fun component11(): Long = this.usnLocalChange

    public fun copy(pszAttributeName: Pwstr = this.pszAttributeName, pszObjectDn: Pwstr = this.pszObjectDn, cbData: UInt = this.cbData, pbData: MutPtr = this.pbData, ftimeDeleted: Filetime = this.ftimeDeleted, ftimeCreated: Filetime = this.ftimeCreated, dwVersion: UInt = this.dwVersion, ftimeLastOriginatingChange: Filetime = this.ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID: Guid = this.uuidLastOriginatingDsaInvocationID, usnOriginatingChange: Long = this.usnOriginatingChange, usnLocalChange: Long = this.usnLocalChange): DsReplValueMetaData = DsReplValueMetaData(pszAttributeNameCtorArg = pszAttributeName, pszObjectDnCtorArg = pszObjectDn, cbData = cbData, pbDataCtorArg = pbData, ftimeDeleted = ftimeDeleted, ftimeCreated = ftimeCreated, dwVersion = dwVersion, ftimeLastOriginatingChange = ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID, usnOriginatingChange = usnOriginatingChange, usnLocalChange = usnLocalChange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplValueMetaData) return false
        if (this.pszAttributeName != other.pszAttributeName) return false
        if (this.pszObjectDn != other.pszObjectDn) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        if (this.ftimeDeleted != other.ftimeDeleted) return false
        if (this.ftimeCreated != other.ftimeCreated) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ftimeLastOriginatingChange != other.ftimeLastOriginatingChange) return false
        if (this.uuidLastOriginatingDsaInvocationID != other.uuidLastOriginatingDsaInvocationID) return false
        if (this.usnOriginatingChange != other.usnOriginatingChange) return false
        if (this.usnLocalChange != other.usnLocalChange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttributeName.hashCode()
        result = 31 * result + this.pszObjectDn.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.ftimeDeleted.hashCode()
        result = 31 * result + this.ftimeCreated.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ftimeLastOriginatingChange.hashCode()
        result = 31 * result + this.uuidLastOriginatingDsaInvocationID.hashCode()
        result = 31 * result + this.usnOriginatingChange.hashCode()
        result = 31 * result + this.usnLocalChange.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttributeName: Pwstr = MutPtr(0L),
            pszObjectDn: Pwstr = MutPtr(0L),
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
            ftimeDeleted: Filetime = Filetime(),
            ftimeCreated: Filetime = Filetime(),
            dwVersion: UInt = 0u,
            ftimeLastOriginatingChange: Filetime = Filetime(),
            uuidLastOriginatingDsaInvocationID: Guid = Guid(),
            usnOriginatingChange: Long = 0L,
            usnLocalChange: Long = 0L,
        ): DsReplValueMetaData =
            DsReplValueMetaData(
                pszAttributeNameCtorArg = pszAttributeName,
                pszObjectDnCtorArg = pszObjectDn,
                cbData = cbData,
                pbDataCtorArg = pbData,
                ftimeDeleted = ftimeDeleted,
                ftimeCreated = ftimeCreated,
                dwVersion = dwVersion,
                ftimeLastOriginatingChange = ftimeLastOriginatingChange,
                uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID,
                usnOriginatingChange = usnOriginatingChange,
                usnLocalChange = usnLocalChange,
            )
    }
}

public class DsReplValueMetaData2 internal constructor(
    pszAttributeNameCtorArg: Pwstr,
    pszObjectDnCtorArg: Pwstr,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
    public var ftimeDeleted: Filetime,
    public var ftimeCreated: Filetime,
    public var dwVersion: UInt,
    public var ftimeLastOriginatingChange: Filetime,
    public var uuidLastOriginatingDsaInvocationID: Guid,
    public var usnOriginatingChange: Long,
    public var usnLocalChange: Long,
    pszLastOriginatingDsaDNCtorArg: Pwstr,
) {
    public var pszAttributeName: Pwstr = pszAttributeNameCtorArg
        internal set

    public var pszObjectDn: Pwstr = pszObjectDnCtorArg
        internal set

    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public var pszLastOriginatingDsaDN: Pwstr = pszLastOriginatingDsaDNCtorArg
        internal set

    public constructor() : this(
        pszAttributeNameCtorArg = MutPtr(0L),
        pszObjectDnCtorArg = MutPtr(0L),
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
        ftimeDeleted = Filetime(),
        ftimeCreated = Filetime(),
        dwVersion = 0u,
        ftimeLastOriginatingChange = Filetime(),
        uuidLastOriginatingDsaInvocationID = Guid(),
        usnOriginatingChange = 0L,
        usnLocalChange = 0L,
        pszLastOriginatingDsaDNCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszAttributeName

    public operator fun component2(): Pwstr = this.pszObjectDn

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): MutPtr = this.pbData

    public operator fun component5(): Filetime = this.ftimeDeleted

    public operator fun component6(): Filetime = this.ftimeCreated

    public operator fun component7(): UInt = this.dwVersion

    public operator fun component8(): Filetime = this.ftimeLastOriginatingChange

    public operator fun component9(): Guid = this.uuidLastOriginatingDsaInvocationID

    public operator fun component10(): Long = this.usnOriginatingChange

    public operator fun component11(): Long = this.usnLocalChange

    public operator fun component12(): Pwstr = this.pszLastOriginatingDsaDN

    public fun copy(pszAttributeName: Pwstr = this.pszAttributeName, pszObjectDn: Pwstr = this.pszObjectDn, cbData: UInt = this.cbData, pbData: MutPtr = this.pbData, ftimeDeleted: Filetime = this.ftimeDeleted, ftimeCreated: Filetime = this.ftimeCreated, dwVersion: UInt = this.dwVersion, ftimeLastOriginatingChange: Filetime = this.ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID: Guid = this.uuidLastOriginatingDsaInvocationID, usnOriginatingChange: Long = this.usnOriginatingChange, usnLocalChange: Long = this.usnLocalChange, pszLastOriginatingDsaDN: Pwstr = this.pszLastOriginatingDsaDN): DsReplValueMetaData2 = DsReplValueMetaData2(pszAttributeNameCtorArg = pszAttributeName, pszObjectDnCtorArg = pszObjectDn, cbData = cbData, pbDataCtorArg = pbData, ftimeDeleted = ftimeDeleted, ftimeCreated = ftimeCreated, dwVersion = dwVersion, ftimeLastOriginatingChange = ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID, usnOriginatingChange = usnOriginatingChange, usnLocalChange = usnLocalChange, pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplValueMetaData2) return false
        if (this.pszAttributeName != other.pszAttributeName) return false
        if (this.pszObjectDn != other.pszObjectDn) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        if (this.ftimeDeleted != other.ftimeDeleted) return false
        if (this.ftimeCreated != other.ftimeCreated) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ftimeLastOriginatingChange != other.ftimeLastOriginatingChange) return false
        if (this.uuidLastOriginatingDsaInvocationID != other.uuidLastOriginatingDsaInvocationID) return false
        if (this.usnOriginatingChange != other.usnOriginatingChange) return false
        if (this.usnLocalChange != other.usnLocalChange) return false
        if (this.pszLastOriginatingDsaDN != other.pszLastOriginatingDsaDN) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttributeName.hashCode()
        result = 31 * result + this.pszObjectDn.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.ftimeDeleted.hashCode()
        result = 31 * result + this.ftimeCreated.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ftimeLastOriginatingChange.hashCode()
        result = 31 * result + this.uuidLastOriginatingDsaInvocationID.hashCode()
        result = 31 * result + this.usnOriginatingChange.hashCode()
        result = 31 * result + this.usnLocalChange.hashCode()
        result = 31 * result + this.pszLastOriginatingDsaDN.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttributeName: Pwstr = MutPtr(0L),
            pszObjectDn: Pwstr = MutPtr(0L),
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
            ftimeDeleted: Filetime = Filetime(),
            ftimeCreated: Filetime = Filetime(),
            dwVersion: UInt = 0u,
            ftimeLastOriginatingChange: Filetime = Filetime(),
            uuidLastOriginatingDsaInvocationID: Guid = Guid(),
            usnOriginatingChange: Long = 0L,
            usnLocalChange: Long = 0L,
            pszLastOriginatingDsaDN: Pwstr = MutPtr(0L),
        ): DsReplValueMetaData2 =
            DsReplValueMetaData2(
                pszAttributeNameCtorArg = pszAttributeName,
                pszObjectDnCtorArg = pszObjectDn,
                cbData = cbData,
                pbDataCtorArg = pbData,
                ftimeDeleted = ftimeDeleted,
                ftimeCreated = ftimeCreated,
                dwVersion = dwVersion,
                ftimeLastOriginatingChange = ftimeLastOriginatingChange,
                uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID,
                usnOriginatingChange = usnOriginatingChange,
                usnLocalChange = usnLocalChange,
                pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN,
            )
    }
}

public data class DsReplValueMetaDataBlob(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DsReplValueMetaDataBlobExt(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
    public var dwUserIdentifier: UInt = 0u,
    public var dwPriorLinkState: UInt = 0u,
    public var dwCurrentLinkState: UInt = 0u,
)

public class DsReplValueMetaDataExt internal constructor(
    pszAttributeNameCtorArg: Pwstr,
    pszObjectDnCtorArg: Pwstr,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
    public var ftimeDeleted: Filetime,
    public var ftimeCreated: Filetime,
    public var dwVersion: UInt,
    public var ftimeLastOriginatingChange: Filetime,
    public var uuidLastOriginatingDsaInvocationID: Guid,
    public var usnOriginatingChange: Long,
    public var usnLocalChange: Long,
    pszLastOriginatingDsaDNCtorArg: Pwstr,
    public var dwUserIdentifier: UInt,
    public var dwPriorLinkState: UInt,
    public var dwCurrentLinkState: UInt,
) {
    public var pszAttributeName: Pwstr = pszAttributeNameCtorArg
        internal set

    public var pszObjectDn: Pwstr = pszObjectDnCtorArg
        internal set

    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public var pszLastOriginatingDsaDN: Pwstr = pszLastOriginatingDsaDNCtorArg
        internal set

    public constructor() : this(
        pszAttributeNameCtorArg = MutPtr(0L),
        pszObjectDnCtorArg = MutPtr(0L),
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
        ftimeDeleted = Filetime(),
        ftimeCreated = Filetime(),
        dwVersion = 0u,
        ftimeLastOriginatingChange = Filetime(),
        uuidLastOriginatingDsaInvocationID = Guid(),
        usnOriginatingChange = 0L,
        usnLocalChange = 0L,
        pszLastOriginatingDsaDNCtorArg = MutPtr(0L),
        dwUserIdentifier = 0u,
        dwPriorLinkState = 0u,
        dwCurrentLinkState = 0u,
    )

    public operator fun component1(): Pwstr = this.pszAttributeName

    public operator fun component2(): Pwstr = this.pszObjectDn

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): MutPtr = this.pbData

    public operator fun component5(): Filetime = this.ftimeDeleted

    public operator fun component6(): Filetime = this.ftimeCreated

    public operator fun component7(): UInt = this.dwVersion

    public operator fun component8(): Filetime = this.ftimeLastOriginatingChange

    public operator fun component9(): Guid = this.uuidLastOriginatingDsaInvocationID

    public operator fun component10(): Long = this.usnOriginatingChange

    public operator fun component11(): Long = this.usnLocalChange

    public operator fun component12(): Pwstr = this.pszLastOriginatingDsaDN

    public operator fun component13(): UInt = this.dwUserIdentifier

    public operator fun component14(): UInt = this.dwPriorLinkState

    public operator fun component15(): UInt = this.dwCurrentLinkState

    public fun copy(pszAttributeName: Pwstr = this.pszAttributeName, pszObjectDn: Pwstr = this.pszObjectDn, cbData: UInt = this.cbData, pbData: MutPtr = this.pbData, ftimeDeleted: Filetime = this.ftimeDeleted, ftimeCreated: Filetime = this.ftimeCreated, dwVersion: UInt = this.dwVersion, ftimeLastOriginatingChange: Filetime = this.ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID: Guid = this.uuidLastOriginatingDsaInvocationID, usnOriginatingChange: Long = this.usnOriginatingChange, usnLocalChange: Long = this.usnLocalChange, pszLastOriginatingDsaDN: Pwstr = this.pszLastOriginatingDsaDN, dwUserIdentifier: UInt = this.dwUserIdentifier, dwPriorLinkState: UInt = this.dwPriorLinkState, dwCurrentLinkState: UInt = this.dwCurrentLinkState): DsReplValueMetaDataExt = DsReplValueMetaDataExt(pszAttributeNameCtorArg = pszAttributeName, pszObjectDnCtorArg = pszObjectDn, cbData = cbData, pbDataCtorArg = pbData, ftimeDeleted = ftimeDeleted, ftimeCreated = ftimeCreated, dwVersion = dwVersion, ftimeLastOriginatingChange = ftimeLastOriginatingChange, uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID, usnOriginatingChange = usnOriginatingChange, usnLocalChange = usnLocalChange, pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN, dwUserIdentifier = dwUserIdentifier, dwPriorLinkState = dwPriorLinkState, dwCurrentLinkState = dwCurrentLinkState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsReplValueMetaDataExt) return false
        if (this.pszAttributeName != other.pszAttributeName) return false
        if (this.pszObjectDn != other.pszObjectDn) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        if (this.ftimeDeleted != other.ftimeDeleted) return false
        if (this.ftimeCreated != other.ftimeCreated) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ftimeLastOriginatingChange != other.ftimeLastOriginatingChange) return false
        if (this.uuidLastOriginatingDsaInvocationID != other.uuidLastOriginatingDsaInvocationID) return false
        if (this.usnOriginatingChange != other.usnOriginatingChange) return false
        if (this.usnLocalChange != other.usnLocalChange) return false
        if (this.pszLastOriginatingDsaDN != other.pszLastOriginatingDsaDN) return false
        if (this.dwUserIdentifier != other.dwUserIdentifier) return false
        if (this.dwPriorLinkState != other.dwPriorLinkState) return false
        if (this.dwCurrentLinkState != other.dwCurrentLinkState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAttributeName.hashCode()
        result = 31 * result + this.pszObjectDn.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.ftimeDeleted.hashCode()
        result = 31 * result + this.ftimeCreated.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ftimeLastOriginatingChange.hashCode()
        result = 31 * result + this.uuidLastOriginatingDsaInvocationID.hashCode()
        result = 31 * result + this.usnOriginatingChange.hashCode()
        result = 31 * result + this.usnLocalChange.hashCode()
        result = 31 * result + this.pszLastOriginatingDsaDN.hashCode()
        result = 31 * result + this.dwUserIdentifier.hashCode()
        result = 31 * result + this.dwPriorLinkState.hashCode()
        result = 31 * result + this.dwCurrentLinkState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAttributeName: Pwstr = MutPtr(0L),
            pszObjectDn: Pwstr = MutPtr(0L),
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
            ftimeDeleted: Filetime = Filetime(),
            ftimeCreated: Filetime = Filetime(),
            dwVersion: UInt = 0u,
            ftimeLastOriginatingChange: Filetime = Filetime(),
            uuidLastOriginatingDsaInvocationID: Guid = Guid(),
            usnOriginatingChange: Long = 0L,
            usnLocalChange: Long = 0L,
            pszLastOriginatingDsaDN: Pwstr = MutPtr(0L),
            dwUserIdentifier: UInt = 0u,
            dwPriorLinkState: UInt = 0u,
            dwCurrentLinkState: UInt = 0u,
        ): DsReplValueMetaDataExt =
            DsReplValueMetaDataExt(
                pszAttributeNameCtorArg = pszAttributeName,
                pszObjectDnCtorArg = pszObjectDn,
                cbData = cbData,
                pbDataCtorArg = pbData,
                ftimeDeleted = ftimeDeleted,
                ftimeCreated = ftimeCreated,
                dwVersion = dwVersion,
                ftimeLastOriginatingChange = ftimeLastOriginatingChange,
                uuidLastOriginatingDsaInvocationID = uuidLastOriginatingDsaInvocationID,
                usnOriginatingChange = usnOriginatingChange,
                usnLocalChange = usnLocalChange,
                pszLastOriginatingDsaDNCtorArg = pszLastOriginatingDsaDN,
                dwUserIdentifier = dwUserIdentifier,
                dwPriorLinkState = dwPriorLinkState,
                dwCurrentLinkState = dwCurrentLinkState,
            )
    }
}

public class DsRepsyncallErrinfoa internal constructor(
    pszSvrIdCtorArg: Pstr,
    public var error: DsRepsyncallError,
    public var dwWin32Err: UInt,
    pszSrcIdCtorArg: Pstr,
) {
    public var pszSvrId: Pstr = pszSvrIdCtorArg
        internal set

    public var pszSrcId: Pstr = pszSrcIdCtorArg
        internal set

    public constructor() : this(
        pszSvrIdCtorArg = MutPtr(0L),
        error = 0,
        dwWin32Err = 0u,
        pszSrcIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszSvrId

    public operator fun component2(): DsRepsyncallError = this.error

    public operator fun component3(): UInt = this.dwWin32Err

    public operator fun component4(): Pstr = this.pszSrcId

    public fun copy(pszSvrId: Pstr = this.pszSvrId, error: DsRepsyncallError = this.error, dwWin32Err: UInt = this.dwWin32Err, pszSrcId: Pstr = this.pszSrcId): DsRepsyncallErrinfoa = DsRepsyncallErrinfoa(pszSvrIdCtorArg = pszSvrId, error = error, dwWin32Err = dwWin32Err, pszSrcIdCtorArg = pszSrcId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallErrinfoa) return false
        if (this.pszSvrId != other.pszSvrId) return false
        if (this.error != other.error) return false
        if (this.dwWin32Err != other.dwWin32Err) return false
        if (this.pszSrcId != other.pszSrcId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszSvrId.hashCode()
        result = 31 * result + this.error.hashCode()
        result = 31 * result + this.dwWin32Err.hashCode()
        result = 31 * result + this.pszSrcId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszSvrId: Pstr = MutPtr(0L),
            error: DsRepsyncallError = 0,
            dwWin32Err: UInt = 0u,
            pszSrcId: Pstr = MutPtr(0L),
        ): DsRepsyncallErrinfoa =
            DsRepsyncallErrinfoa(
                pszSvrIdCtorArg = pszSvrId,
                error = error,
                dwWin32Err = dwWin32Err,
                pszSrcIdCtorArg = pszSrcId,
            )
    }
}

public class DsRepsyncallErrinfow internal constructor(
    pszSvrIdCtorArg: Pwstr,
    public var error: DsRepsyncallError,
    public var dwWin32Err: UInt,
    pszSrcIdCtorArg: Pwstr,
) {
    public var pszSvrId: Pwstr = pszSvrIdCtorArg
        internal set

    public var pszSrcId: Pwstr = pszSrcIdCtorArg
        internal set

    public constructor() : this(
        pszSvrIdCtorArg = MutPtr(0L),
        error = 0,
        dwWin32Err = 0u,
        pszSrcIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszSvrId

    public operator fun component2(): DsRepsyncallError = this.error

    public operator fun component3(): UInt = this.dwWin32Err

    public operator fun component4(): Pwstr = this.pszSrcId

    public fun copy(pszSvrId: Pwstr = this.pszSvrId, error: DsRepsyncallError = this.error, dwWin32Err: UInt = this.dwWin32Err, pszSrcId: Pwstr = this.pszSrcId): DsRepsyncallErrinfow = DsRepsyncallErrinfow(pszSvrIdCtorArg = pszSvrId, error = error, dwWin32Err = dwWin32Err, pszSrcIdCtorArg = pszSrcId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallErrinfow) return false
        if (this.pszSvrId != other.pszSvrId) return false
        if (this.error != other.error) return false
        if (this.dwWin32Err != other.dwWin32Err) return false
        if (this.pszSrcId != other.pszSrcId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszSvrId.hashCode()
        result = 31 * result + this.error.hashCode()
        result = 31 * result + this.dwWin32Err.hashCode()
        result = 31 * result + this.pszSrcId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszSvrId: Pwstr = MutPtr(0L),
            error: DsRepsyncallError = 0,
            dwWin32Err: UInt = 0u,
            pszSrcId: Pwstr = MutPtr(0L),
        ): DsRepsyncallErrinfow =
            DsRepsyncallErrinfow(
                pszSvrIdCtorArg = pszSvrId,
                error = error,
                dwWin32Err = dwWin32Err,
                pszSrcIdCtorArg = pszSrcId,
            )
    }
}

public class DsRepsyncallSynca internal constructor(
    pszSrcIdCtorArg: Pstr,
    pszDstIdCtorArg: Pstr,
    pszNCCtorArg: Pstr,
    pguidSrcCtorArg: MutPtr,
    pguidDstCtorArg: MutPtr,
) {
    public var pszSrcId: Pstr = pszSrcIdCtorArg
        internal set

    public var pszDstId: Pstr = pszDstIdCtorArg
        internal set

    public var pszNC: Pstr = pszNCCtorArg
        internal set

    public var pguidSrc: MutPtr = pguidSrcCtorArg
        internal set

    public var pguidDst: MutPtr = pguidDstCtorArg
        internal set

    public constructor() : this(
        pszSrcIdCtorArg = MutPtr(0L),
        pszDstIdCtorArg = MutPtr(0L),
        pszNCCtorArg = MutPtr(0L),
        pguidSrcCtorArg = MutPtr(0L),
        pguidDstCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszSrcId

    public operator fun component2(): Pstr = this.pszDstId

    public operator fun component3(): Pstr = this.pszNC

    public operator fun component4(): MutPtr = this.pguidSrc

    public operator fun component5(): MutPtr = this.pguidDst

    public fun copy(pszSrcId: Pstr = this.pszSrcId, pszDstId: Pstr = this.pszDstId, pszNC: Pstr = this.pszNC, pguidSrc: MutPtr = this.pguidSrc, pguidDst: MutPtr = this.pguidDst): DsRepsyncallSynca = DsRepsyncallSynca(pszSrcIdCtorArg = pszSrcId, pszDstIdCtorArg = pszDstId, pszNCCtorArg = pszNC, pguidSrcCtorArg = pguidSrc, pguidDstCtorArg = pguidDst)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallSynca) return false
        if (this.pszSrcId != other.pszSrcId) return false
        if (this.pszDstId != other.pszDstId) return false
        if (this.pszNC != other.pszNC) return false
        if (this.pguidSrc != other.pguidSrc) return false
        if (this.pguidDst != other.pguidDst) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszSrcId.hashCode()
        result = 31 * result + this.pszDstId.hashCode()
        result = 31 * result + this.pszNC.hashCode()
        result = 31 * result + this.pguidSrc.hashCode()
        result = 31 * result + this.pguidDst.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszSrcId: Pstr = MutPtr(0L),
            pszDstId: Pstr = MutPtr(0L),
            pszNC: Pstr = MutPtr(0L),
            pguidSrc: MutPtr = MutPtr(0L),
            pguidDst: MutPtr = MutPtr(0L),
        ): DsRepsyncallSynca =
            DsRepsyncallSynca(
                pszSrcIdCtorArg = pszSrcId,
                pszDstIdCtorArg = pszDstId,
                pszNCCtorArg = pszNC,
                pguidSrcCtorArg = pguidSrc,
                pguidDstCtorArg = pguidDst,
            )
    }
}

public class DsRepsyncallSyncw internal constructor(
    pszSrcIdCtorArg: Pwstr,
    pszDstIdCtorArg: Pwstr,
    pszNCCtorArg: Pwstr,
    pguidSrcCtorArg: MutPtr,
    pguidDstCtorArg: MutPtr,
) {
    public var pszSrcId: Pwstr = pszSrcIdCtorArg
        internal set

    public var pszDstId: Pwstr = pszDstIdCtorArg
        internal set

    public var pszNC: Pwstr = pszNCCtorArg
        internal set

    public var pguidSrc: MutPtr = pguidSrcCtorArg
        internal set

    public var pguidDst: MutPtr = pguidDstCtorArg
        internal set

    public constructor() : this(
        pszSrcIdCtorArg = MutPtr(0L),
        pszDstIdCtorArg = MutPtr(0L),
        pszNCCtorArg = MutPtr(0L),
        pguidSrcCtorArg = MutPtr(0L),
        pguidDstCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszSrcId

    public operator fun component2(): Pwstr = this.pszDstId

    public operator fun component3(): Pwstr = this.pszNC

    public operator fun component4(): MutPtr = this.pguidSrc

    public operator fun component5(): MutPtr = this.pguidDst

    public fun copy(pszSrcId: Pwstr = this.pszSrcId, pszDstId: Pwstr = this.pszDstId, pszNC: Pwstr = this.pszNC, pguidSrc: MutPtr = this.pguidSrc, pguidDst: MutPtr = this.pguidDst): DsRepsyncallSyncw = DsRepsyncallSyncw(pszSrcIdCtorArg = pszSrcId, pszDstIdCtorArg = pszDstId, pszNCCtorArg = pszNC, pguidSrcCtorArg = pguidSrc, pguidDstCtorArg = pguidDst)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallSyncw) return false
        if (this.pszSrcId != other.pszSrcId) return false
        if (this.pszDstId != other.pszDstId) return false
        if (this.pszNC != other.pszNC) return false
        if (this.pguidSrc != other.pguidSrc) return false
        if (this.pguidDst != other.pguidDst) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszSrcId.hashCode()
        result = 31 * result + this.pszDstId.hashCode()
        result = 31 * result + this.pszNC.hashCode()
        result = 31 * result + this.pguidSrc.hashCode()
        result = 31 * result + this.pguidDst.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszSrcId: Pwstr = MutPtr(0L),
            pszDstId: Pwstr = MutPtr(0L),
            pszNC: Pwstr = MutPtr(0L),
            pguidSrc: MutPtr = MutPtr(0L),
            pguidDst: MutPtr = MutPtr(0L),
        ): DsRepsyncallSyncw =
            DsRepsyncallSyncw(
                pszSrcIdCtorArg = pszSrcId,
                pszDstIdCtorArg = pszDstId,
                pszNCCtorArg = pszNC,
                pguidSrcCtorArg = pguidSrc,
                pguidDstCtorArg = pguidDst,
            )
    }
}

public class DsRepsyncallUpdatea internal constructor(
    public var event: DsRepsyncallEvent,
    pErrInfoCtorArg: MutPtr,
    pSyncCtorArg: MutPtr,
) {
    public var pErrInfo: MutPtr = pErrInfoCtorArg
        internal set

    public var pSync: MutPtr = pSyncCtorArg
        internal set

    public constructor() : this(
        event = 0,
        pErrInfoCtorArg = MutPtr(0L),
        pSyncCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DsRepsyncallEvent = this.event

    public operator fun component2(): MutPtr = this.pErrInfo

    public operator fun component3(): MutPtr = this.pSync

    public fun copy(event: DsRepsyncallEvent = this.event, pErrInfo: MutPtr = this.pErrInfo, pSync: MutPtr = this.pSync): DsRepsyncallUpdatea = DsRepsyncallUpdatea(event = event, pErrInfoCtorArg = pErrInfo, pSyncCtorArg = pSync)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallUpdatea) return false
        if (this.event != other.event) return false
        if (this.pErrInfo != other.pErrInfo) return false
        if (this.pSync != other.pSync) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.pErrInfo.hashCode()
        result = 31 * result + this.pSync.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsRepsyncallUpdatea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsRepsyncallUpdatea> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DsRepsyncallUpdatea =
                    DsRepsyncallUpdatea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DsRepsyncallUpdatea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.event)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pErrInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pSync)
                }
            }

        public operator fun invoke(
            event: DsRepsyncallEvent = 0,
            pErrInfo: MutPtr = MutPtr(0L),
            pSync: MutPtr = MutPtr(0L),
        ): DsRepsyncallUpdatea =
            DsRepsyncallUpdatea(
                event = event,
                pErrInfoCtorArg = pErrInfo,
                pSyncCtorArg = pSync,
            )
    }
}

public class DsRepsyncallUpdatew internal constructor(
    public var event: DsRepsyncallEvent,
    pErrInfoCtorArg: MutPtr,
    pSyncCtorArg: MutPtr,
) {
    public var pErrInfo: MutPtr = pErrInfoCtorArg
        internal set

    public var pSync: MutPtr = pSyncCtorArg
        internal set

    public constructor() : this(
        event = 0,
        pErrInfoCtorArg = MutPtr(0L),
        pSyncCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DsRepsyncallEvent = this.event

    public operator fun component2(): MutPtr = this.pErrInfo

    public operator fun component3(): MutPtr = this.pSync

    public fun copy(event: DsRepsyncallEvent = this.event, pErrInfo: MutPtr = this.pErrInfo, pSync: MutPtr = this.pSync): DsRepsyncallUpdatew = DsRepsyncallUpdatew(event = event, pErrInfoCtorArg = pErrInfo, pSyncCtorArg = pSync)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsRepsyncallUpdatew) return false
        if (this.event != other.event) return false
        if (this.pErrInfo != other.pErrInfo) return false
        if (this.pSync != other.pSync) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.pErrInfo.hashCode()
        result = 31 * result + this.pSync.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsRepsyncallUpdatew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsRepsyncallUpdatew> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DsRepsyncallUpdatew =
                    DsRepsyncallUpdatew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DsRepsyncallUpdatew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.event)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pErrInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pSync)
                }
            }

        public operator fun invoke(
            event: DsRepsyncallEvent = 0,
            pErrInfo: MutPtr = MutPtr(0L),
            pSync: MutPtr = MutPtr(0L),
        ): DsRepsyncallUpdatew =
            DsRepsyncallUpdatew(
                event = event,
                pErrInfoCtorArg = pErrInfo,
                pSyncCtorArg = pSync,
            )
    }
}

public class DsSchemaGuidMapa internal constructor(
    public var guid: Guid,
    public var guidType: UInt,
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        guidType = 0u,
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): UInt = this.guidType

    public operator fun component3(): Pstr = this.pName

    public fun copy(guid: Guid = this.guid, guidType: UInt = this.guidType, pName: Pstr = this.pName): DsSchemaGuidMapa = DsSchemaGuidMapa(guid = guid, guidType = guidType, pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsSchemaGuidMapa) return false
        if (this.guid != other.guid) return false
        if (this.guidType != other.guidType) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.pName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            guidType: UInt = 0u,
            pName: Pstr = MutPtr(0L),
        ): DsSchemaGuidMapa =
            DsSchemaGuidMapa(
                guid = guid,
                guidType = guidType,
                pNameCtorArg = pName,
            )
    }
}

public class DsSchemaGuidMapw internal constructor(
    public var guid: Guid,
    public var guidType: UInt,
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        guidType = 0u,
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): UInt = this.guidType

    public operator fun component3(): Pwstr = this.pName

    public fun copy(guid: Guid = this.guid, guidType: UInt = this.guidType, pName: Pwstr = this.pName): DsSchemaGuidMapw = DsSchemaGuidMapw(guid = guid, guidType = guidType, pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsSchemaGuidMapw) return false
        if (this.guid != other.guid) return false
        if (this.guidType != other.guidType) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.pName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            guidType: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
        ): DsSchemaGuidMapw =
            DsSchemaGuidMapw(
                guid = guid,
                guidType = guidType,
                pNameCtorArg = pName,
            )
    }
}

public class DsSelection internal constructor(
    pwzNameCtorArg: Pwstr,
    pwzADsPathCtorArg: Pwstr,
    pwzClassCtorArg: Pwstr,
    pwzUPNCtorArg: Pwstr,
    pvarFetchedAttributesCtorArg: MutPtr,
    public var flScopeType: UInt,
) {
    public var pwzName: Pwstr = pwzNameCtorArg
        internal set

    public var pwzADsPath: Pwstr = pwzADsPathCtorArg
        internal set

    public var pwzClass: Pwstr = pwzClassCtorArg
        internal set

    public var pwzUPN: Pwstr = pwzUPNCtorArg
        internal set

    public var pvarFetchedAttributes: MutPtr = pvarFetchedAttributesCtorArg
        internal set

    public constructor() : this(
        pwzNameCtorArg = MutPtr(0L),
        pwzADsPathCtorArg = MutPtr(0L),
        pwzClassCtorArg = MutPtr(0L),
        pwzUPNCtorArg = MutPtr(0L),
        pvarFetchedAttributesCtorArg = MutPtr(0L),
        flScopeType = 0u,
    )

    public operator fun component1(): Pwstr = this.pwzName

    public operator fun component2(): Pwstr = this.pwzADsPath

    public operator fun component3(): Pwstr = this.pwzClass

    public operator fun component4(): Pwstr = this.pwzUPN

    public operator fun component5(): MutPtr = this.pvarFetchedAttributes

    public operator fun component6(): UInt = this.flScopeType

    public fun copy(pwzName: Pwstr = this.pwzName, pwzADsPath: Pwstr = this.pwzADsPath, pwzClass: Pwstr = this.pwzClass, pwzUPN: Pwstr = this.pwzUPN, pvarFetchedAttributes: MutPtr = this.pvarFetchedAttributes, flScopeType: UInt = this.flScopeType): DsSelection = DsSelection(pwzNameCtorArg = pwzName, pwzADsPathCtorArg = pwzADsPath, pwzClassCtorArg = pwzClass, pwzUPNCtorArg = pwzUPN, pvarFetchedAttributesCtorArg = pvarFetchedAttributes, flScopeType = flScopeType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsSelection) return false
        if (this.pwzName != other.pwzName) return false
        if (this.pwzADsPath != other.pwzADsPath) return false
        if (this.pwzClass != other.pwzClass) return false
        if (this.pwzUPN != other.pwzUPN) return false
        if (this.pvarFetchedAttributes != other.pvarFetchedAttributes) return false
        if (this.flScopeType != other.flScopeType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzName.hashCode()
        result = 31 * result + this.pwzADsPath.hashCode()
        result = 31 * result + this.pwzClass.hashCode()
        result = 31 * result + this.pwzUPN.hashCode()
        result = 31 * result + this.pvarFetchedAttributes.hashCode()
        result = 31 * result + this.flScopeType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzName: Pwstr = MutPtr(0L),
            pwzADsPath: Pwstr = MutPtr(0L),
            pwzClass: Pwstr = MutPtr(0L),
            pwzUPN: Pwstr = MutPtr(0L),
            pvarFetchedAttributes: MutPtr = MutPtr(0L),
            flScopeType: UInt = 0u,
        ): DsSelection =
            DsSelection(
                pwzNameCtorArg = pwzName,
                pwzADsPathCtorArg = pwzADsPath,
                pwzClassCtorArg = pwzClass,
                pwzUPNCtorArg = pwzUPN,
                pvarFetchedAttributesCtorArg = pvarFetchedAttributes,
                flScopeType = flScopeType,
            )
    }
}

public data class DsSelectionList(
    public var cItems: UInt = 0u,
    public var cFetchedAttributes: UInt = 0u,
    public var aDsSelection: List<DsSelection> = List(1) { DsSelection() },
)

public data class DsSiteCostInfo(
    public var errorCode: UInt = 0u,
    public var cost: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsSiteCostInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsSiteCostInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DsSiteCostInfo =
                    DsSiteCostInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DsSiteCostInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cost)
                }
            }
    }
}

public class Openquerywindow internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var clsidHandler: Guid,
    pHandlerParametersCtorArg: MutPtr,
    public var clsidDefaultForm: Guid,
    pPersistQueryCtorArg: MutPtr,
    public var anonymous: Openquerywindow0,
) {
    public var pHandlerParameters: MutPtr = pHandlerParametersCtorArg
        internal set

    public var pPersistQuery: MutPtr = pPersistQueryCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        clsidHandler = Guid(),
        pHandlerParametersCtorArg = MutPtr(0L),
        clsidDefaultForm = Guid(),
        pPersistQueryCtorArg = MutPtr(0L),
        anonymous = Openquerywindow0(),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Guid = this.clsidHandler

    public operator fun component4(): MutPtr = this.pHandlerParameters

    public operator fun component5(): Guid = this.clsidDefaultForm

    public operator fun component6(): MutPtr = this.pPersistQuery

    public operator fun component7(): Openquerywindow0 = this.anonymous

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, clsidHandler: Guid = this.clsidHandler, pHandlerParameters: MutPtr = this.pHandlerParameters, clsidDefaultForm: Guid = this.clsidDefaultForm, pPersistQuery: MutPtr = this.pPersistQuery, anonymous: Openquerywindow0 = this.anonymous): Openquerywindow = Openquerywindow(cbStruct = cbStruct, dwFlags = dwFlags, clsidHandler = clsidHandler, pHandlerParametersCtorArg = pHandlerParameters, clsidDefaultForm = clsidDefaultForm, pPersistQueryCtorArg = pPersistQuery, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Openquerywindow) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.clsidHandler != other.clsidHandler) return false
        if (this.pHandlerParameters != other.pHandlerParameters) return false
        if (this.clsidDefaultForm != other.clsidDefaultForm) return false
        if (this.pPersistQuery != other.pPersistQuery) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.clsidHandler.hashCode()
        result = 31 * result + this.pHandlerParameters.hashCode()
        result = 31 * result + this.clsidDefaultForm.hashCode()
        result = 31 * result + this.pPersistQuery.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            clsidHandler: Guid = Guid(),
            pHandlerParameters: MutPtr = MutPtr(0L),
            clsidDefaultForm: Guid = Guid(),
            pPersistQuery: MutPtr = MutPtr(0L),
            anonymous: Openquerywindow0 = Openquerywindow0(),
        ): Openquerywindow =
            Openquerywindow(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                clsidHandler = clsidHandler,
                pHandlerParametersCtorArg = pHandlerParameters,
                clsidDefaultForm = clsidDefaultForm,
                pPersistQueryCtorArg = pPersistQuery,
                anonymous = anonymous,
            )
    }
}

public class Openquerywindow0 internal constructor(
    pFormParametersCtorArg: MutPtr,
    ppbFormParametersCtorArg: MutPtr,
) {
    public var pFormParameters: MutPtr = pFormParametersCtorArg
        internal set

    public var ppbFormParameters: MutPtr = ppbFormParametersCtorArg
        internal set

    public constructor() : this(
        pFormParametersCtorArg = MutPtr(0L),
        ppbFormParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pFormParameters

    public operator fun component2(): MutPtr = this.ppbFormParameters

    public fun copy(pFormParameters: MutPtr = this.pFormParameters, ppbFormParameters: MutPtr = this.ppbFormParameters): Openquerywindow0 = Openquerywindow0(pFormParametersCtorArg = pFormParameters, ppbFormParametersCtorArg = ppbFormParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Openquerywindow0) return false
        if (this.pFormParameters != other.pFormParameters) return false
        if (this.ppbFormParameters != other.ppbFormParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pFormParameters.hashCode()
        result = 31 * result + this.ppbFormParameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pFormParameters: MutPtr = MutPtr(0L),
            ppbFormParameters: MutPtr = MutPtr(0L),
        ): Openquerywindow0 =
            Openquerywindow0(
                pFormParametersCtorArg = pFormParameters,
                ppbFormParametersCtorArg = ppbFormParameters,
            )
    }
}

public data class Schedule(
    public var size: UInt = 0u,
    public var bandwidth: UInt = 0u,
    public var numberOfSchedules: UInt = 0u,
    public var schedules: List<ScheduleHeader> = List(1) { ScheduleHeader() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Schedule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Schedule> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Schedule =
                    Schedule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScheduleHeader.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Schedule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfSchedules)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScheduleHeader.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.schedules)
                }
            }
    }
}

public data class ScheduleHeader(
    public var type: UInt = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScheduleHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScheduleHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScheduleHeader =
                    ScheduleHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScheduleHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offset)
                }
            }
    }
}
