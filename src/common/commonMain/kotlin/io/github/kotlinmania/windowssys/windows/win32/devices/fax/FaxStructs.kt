@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public class FaxConfigurationa internal constructor(
    public var sizeOfStruct: UInt,
    public var retries: UInt,
    public var retryDelay: UInt,
    public var dirtyDays: UInt,
    public var branding: Bool,
    public var useDeviceTsid: Bool,
    public var serverCp: Bool,
    public var pauseServerQueue: Bool,
    public var startCheapTime: FaxTime,
    public var stopCheapTime: FaxTime,
    public var archiveOutgoingFaxes: Bool,
    archiveDirectoryCtorArg: Pcstr,
    reservedCtorArg: Pcstr,
) {
    public var archiveDirectory: Pcstr = archiveDirectoryCtorArg
        internal set

    public var reserved: Pcstr = reservedCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        retries = 0u,
        retryDelay = 0u,
        dirtyDays = 0u,
        branding = 0,
        useDeviceTsid = 0,
        serverCp = 0,
        pauseServerQueue = 0,
        startCheapTime = FaxTime(),
        stopCheapTime = FaxTime(),
        archiveOutgoingFaxes = 0,
        archiveDirectoryCtorArg = ConstPtr(0L),
        reservedCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.retries

    public operator fun component3(): UInt = this.retryDelay

    public operator fun component4(): UInt = this.dirtyDays

    public operator fun component5(): Bool = this.branding

    public operator fun component6(): Bool = this.useDeviceTsid

    public operator fun component7(): Bool = this.serverCp

    public operator fun component8(): Bool = this.pauseServerQueue

    public operator fun component9(): FaxTime = this.startCheapTime

    public operator fun component10(): FaxTime = this.stopCheapTime

    public operator fun component11(): Bool = this.archiveOutgoingFaxes

    public operator fun component12(): Pcstr = this.archiveDirectory

    public operator fun component13(): Pcstr = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, retries: UInt = this.retries, retryDelay: UInt = this.retryDelay, dirtyDays: UInt = this.dirtyDays, branding: Bool = this.branding, useDeviceTsid: Bool = this.useDeviceTsid, serverCp: Bool = this.serverCp, pauseServerQueue: Bool = this.pauseServerQueue, startCheapTime: FaxTime = this.startCheapTime, stopCheapTime: FaxTime = this.stopCheapTime, archiveOutgoingFaxes: Bool = this.archiveOutgoingFaxes, archiveDirectory: Pcstr = this.archiveDirectory, reserved: Pcstr = this.reserved): FaxConfigurationa = FaxConfigurationa(sizeOfStruct = sizeOfStruct, retries = retries, retryDelay = retryDelay, dirtyDays = dirtyDays, branding = branding, useDeviceTsid = useDeviceTsid, serverCp = serverCp, pauseServerQueue = pauseServerQueue, startCheapTime = startCheapTime, stopCheapTime = stopCheapTime, archiveOutgoingFaxes = archiveOutgoingFaxes, archiveDirectoryCtorArg = archiveDirectory, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxConfigurationa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.retries != other.retries) return false
        if (this.retryDelay != other.retryDelay) return false
        if (this.dirtyDays != other.dirtyDays) return false
        if (this.branding != other.branding) return false
        if (this.useDeviceTsid != other.useDeviceTsid) return false
        if (this.serverCp != other.serverCp) return false
        if (this.pauseServerQueue != other.pauseServerQueue) return false
        if (this.startCheapTime != other.startCheapTime) return false
        if (this.stopCheapTime != other.stopCheapTime) return false
        if (this.archiveOutgoingFaxes != other.archiveOutgoingFaxes) return false
        if (this.archiveDirectory != other.archiveDirectory) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.retries.hashCode()
        result = 31 * result + this.retryDelay.hashCode()
        result = 31 * result + this.dirtyDays.hashCode()
        result = 31 * result + this.branding.hashCode()
        result = 31 * result + this.useDeviceTsid.hashCode()
        result = 31 * result + this.serverCp.hashCode()
        result = 31 * result + this.pauseServerQueue.hashCode()
        result = 31 * result + this.startCheapTime.hashCode()
        result = 31 * result + this.stopCheapTime.hashCode()
        result = 31 * result + this.archiveOutgoingFaxes.hashCode()
        result = 31 * result + this.archiveDirectory.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            retries: UInt = 0u,
            retryDelay: UInt = 0u,
            dirtyDays: UInt = 0u,
            branding: Bool = 0,
            useDeviceTsid: Bool = 0,
            serverCp: Bool = 0,
            pauseServerQueue: Bool = 0,
            startCheapTime: FaxTime = FaxTime(),
            stopCheapTime: FaxTime = FaxTime(),
            archiveOutgoingFaxes: Bool = 0,
            archiveDirectory: Pcstr = ConstPtr(0L),
            reserved: Pcstr = ConstPtr(0L),
        ): FaxConfigurationa =
            FaxConfigurationa(
                sizeOfStruct = sizeOfStruct,
                retries = retries,
                retryDelay = retryDelay,
                dirtyDays = dirtyDays,
                branding = branding,
                useDeviceTsid = useDeviceTsid,
                serverCp = serverCp,
                pauseServerQueue = pauseServerQueue,
                startCheapTime = startCheapTime,
                stopCheapTime = stopCheapTime,
                archiveOutgoingFaxes = archiveOutgoingFaxes,
                archiveDirectoryCtorArg = archiveDirectory,
                reservedCtorArg = reserved,
            )
    }
}

public class FaxConfigurationw internal constructor(
    public var sizeOfStruct: UInt,
    public var retries: UInt,
    public var retryDelay: UInt,
    public var dirtyDays: UInt,
    public var branding: Bool,
    public var useDeviceTsid: Bool,
    public var serverCp: Bool,
    public var pauseServerQueue: Bool,
    public var startCheapTime: FaxTime,
    public var stopCheapTime: FaxTime,
    public var archiveOutgoingFaxes: Bool,
    archiveDirectoryCtorArg: Pcwstr,
    reservedCtorArg: Pcwstr,
) {
    public var archiveDirectory: Pcwstr = archiveDirectoryCtorArg
        internal set

    public var reserved: Pcwstr = reservedCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        retries = 0u,
        retryDelay = 0u,
        dirtyDays = 0u,
        branding = 0,
        useDeviceTsid = 0,
        serverCp = 0,
        pauseServerQueue = 0,
        startCheapTime = FaxTime(),
        stopCheapTime = FaxTime(),
        archiveOutgoingFaxes = 0,
        archiveDirectoryCtorArg = ConstPtr(0L),
        reservedCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.retries

    public operator fun component3(): UInt = this.retryDelay

    public operator fun component4(): UInt = this.dirtyDays

    public operator fun component5(): Bool = this.branding

    public operator fun component6(): Bool = this.useDeviceTsid

    public operator fun component7(): Bool = this.serverCp

    public operator fun component8(): Bool = this.pauseServerQueue

    public operator fun component9(): FaxTime = this.startCheapTime

    public operator fun component10(): FaxTime = this.stopCheapTime

    public operator fun component11(): Bool = this.archiveOutgoingFaxes

    public operator fun component12(): Pcwstr = this.archiveDirectory

    public operator fun component13(): Pcwstr = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, retries: UInt = this.retries, retryDelay: UInt = this.retryDelay, dirtyDays: UInt = this.dirtyDays, branding: Bool = this.branding, useDeviceTsid: Bool = this.useDeviceTsid, serverCp: Bool = this.serverCp, pauseServerQueue: Bool = this.pauseServerQueue, startCheapTime: FaxTime = this.startCheapTime, stopCheapTime: FaxTime = this.stopCheapTime, archiveOutgoingFaxes: Bool = this.archiveOutgoingFaxes, archiveDirectory: Pcwstr = this.archiveDirectory, reserved: Pcwstr = this.reserved): FaxConfigurationw = FaxConfigurationw(sizeOfStruct = sizeOfStruct, retries = retries, retryDelay = retryDelay, dirtyDays = dirtyDays, branding = branding, useDeviceTsid = useDeviceTsid, serverCp = serverCp, pauseServerQueue = pauseServerQueue, startCheapTime = startCheapTime, stopCheapTime = stopCheapTime, archiveOutgoingFaxes = archiveOutgoingFaxes, archiveDirectoryCtorArg = archiveDirectory, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxConfigurationw) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.retries != other.retries) return false
        if (this.retryDelay != other.retryDelay) return false
        if (this.dirtyDays != other.dirtyDays) return false
        if (this.branding != other.branding) return false
        if (this.useDeviceTsid != other.useDeviceTsid) return false
        if (this.serverCp != other.serverCp) return false
        if (this.pauseServerQueue != other.pauseServerQueue) return false
        if (this.startCheapTime != other.startCheapTime) return false
        if (this.stopCheapTime != other.stopCheapTime) return false
        if (this.archiveOutgoingFaxes != other.archiveOutgoingFaxes) return false
        if (this.archiveDirectory != other.archiveDirectory) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.retries.hashCode()
        result = 31 * result + this.retryDelay.hashCode()
        result = 31 * result + this.dirtyDays.hashCode()
        result = 31 * result + this.branding.hashCode()
        result = 31 * result + this.useDeviceTsid.hashCode()
        result = 31 * result + this.serverCp.hashCode()
        result = 31 * result + this.pauseServerQueue.hashCode()
        result = 31 * result + this.startCheapTime.hashCode()
        result = 31 * result + this.stopCheapTime.hashCode()
        result = 31 * result + this.archiveOutgoingFaxes.hashCode()
        result = 31 * result + this.archiveDirectory.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            retries: UInt = 0u,
            retryDelay: UInt = 0u,
            dirtyDays: UInt = 0u,
            branding: Bool = 0,
            useDeviceTsid: Bool = 0,
            serverCp: Bool = 0,
            pauseServerQueue: Bool = 0,
            startCheapTime: FaxTime = FaxTime(),
            stopCheapTime: FaxTime = FaxTime(),
            archiveOutgoingFaxes: Bool = 0,
            archiveDirectory: Pcwstr = ConstPtr(0L),
            reserved: Pcwstr = ConstPtr(0L),
        ): FaxConfigurationw =
            FaxConfigurationw(
                sizeOfStruct = sizeOfStruct,
                retries = retries,
                retryDelay = retryDelay,
                dirtyDays = dirtyDays,
                branding = branding,
                useDeviceTsid = useDeviceTsid,
                serverCp = serverCp,
                pauseServerQueue = pauseServerQueue,
                startCheapTime = startCheapTime,
                stopCheapTime = stopCheapTime,
                archiveOutgoingFaxes = archiveOutgoingFaxes,
                archiveDirectoryCtorArg = archiveDirectory,
                reservedCtorArg = reserved,
            )
    }
}

public class FaxContextInfoa internal constructor(
    public var sizeOfStruct: UInt,
    hDCCtorArg: Hdc,
    public var serverName: ByteArray,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        hDCCtorArg = MutPtr(0L),
        serverName = ByteArray(16),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Hdc = this.hDC

    public operator fun component3(): ByteArray = this.serverName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, hDC: Hdc = this.hDC, serverName: ByteArray = this.serverName): FaxContextInfoa = FaxContextInfoa(sizeOfStruct = sizeOfStruct, hDCCtorArg = hDC, serverName = serverName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxContextInfoa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.serverName.contentEquals(other.serverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.serverName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            hDC: Hdc = MutPtr(0L),
            serverName: ByteArray = ByteArray(16),
        ): FaxContextInfoa =
            FaxContextInfoa(
                sizeOfStruct = sizeOfStruct,
                hDCCtorArg = hDC,
                serverName = serverName,
            )
    }
}

public class FaxContextInfow internal constructor(
    public var sizeOfStruct: UInt,
    hDCCtorArg: Hdc,
    public var serverName: UShortArray,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        hDCCtorArg = MutPtr(0L),
        serverName = UShortArray(16),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Hdc = this.hDC

    public operator fun component3(): UShortArray = this.serverName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, hDC: Hdc = this.hDC, serverName: UShortArray = this.serverName): FaxContextInfow = FaxContextInfow(sizeOfStruct = sizeOfStruct, hDCCtorArg = hDC, serverName = serverName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxContextInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.serverName.contentEquals(other.serverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.serverName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            hDC: Hdc = MutPtr(0L),
            serverName: UShortArray = UShortArray(16),
        ): FaxContextInfow =
            FaxContextInfow(
                sizeOfStruct = sizeOfStruct,
                hDCCtorArg = hDC,
                serverName = serverName,
            )
    }
}

public class FaxCoverpageInfoa internal constructor(
    public var sizeOfStruct: UInt,
    coverPageNameCtorArg: Pcstr,
    public var useServerCoverPage: Bool,
    recNameCtorArg: Pcstr,
    recFaxNumberCtorArg: Pcstr,
    recCompanyCtorArg: Pcstr,
    recStreetAddressCtorArg: Pcstr,
    recCityCtorArg: Pcstr,
    recStateCtorArg: Pcstr,
    recZipCtorArg: Pcstr,
    recCountryCtorArg: Pcstr,
    recTitleCtorArg: Pcstr,
    recDepartmentCtorArg: Pcstr,
    recOfficeLocationCtorArg: Pcstr,
    recHomePhoneCtorArg: Pcstr,
    recOfficePhoneCtorArg: Pcstr,
    sdrNameCtorArg: Pcstr,
    sdrFaxNumberCtorArg: Pcstr,
    sdrCompanyCtorArg: Pcstr,
    sdrAddressCtorArg: Pcstr,
    sdrTitleCtorArg: Pcstr,
    sdrDepartmentCtorArg: Pcstr,
    sdrOfficeLocationCtorArg: Pcstr,
    sdrHomePhoneCtorArg: Pcstr,
    sdrOfficePhoneCtorArg: Pcstr,
    noteCtorArg: Pcstr,
    subjectCtorArg: Pcstr,
    public var timeSent: Systemtime,
    public var pageCount: UInt,
) {
    public var coverPageName: Pcstr = coverPageNameCtorArg
        internal set

    public var recName: Pcstr = recNameCtorArg
        internal set

    public var recFaxNumber: Pcstr = recFaxNumberCtorArg
        internal set

    public var recCompany: Pcstr = recCompanyCtorArg
        internal set

    public var recStreetAddress: Pcstr = recStreetAddressCtorArg
        internal set

    public var recCity: Pcstr = recCityCtorArg
        internal set

    public var recState: Pcstr = recStateCtorArg
        internal set

    public var recZip: Pcstr = recZipCtorArg
        internal set

    public var recCountry: Pcstr = recCountryCtorArg
        internal set

    public var recTitle: Pcstr = recTitleCtorArg
        internal set

    public var recDepartment: Pcstr = recDepartmentCtorArg
        internal set

    public var recOfficeLocation: Pcstr = recOfficeLocationCtorArg
        internal set

    public var recHomePhone: Pcstr = recHomePhoneCtorArg
        internal set

    public var recOfficePhone: Pcstr = recOfficePhoneCtorArg
        internal set

    public var sdrName: Pcstr = sdrNameCtorArg
        internal set

    public var sdrFaxNumber: Pcstr = sdrFaxNumberCtorArg
        internal set

    public var sdrCompany: Pcstr = sdrCompanyCtorArg
        internal set

    public var sdrAddress: Pcstr = sdrAddressCtorArg
        internal set

    public var sdrTitle: Pcstr = sdrTitleCtorArg
        internal set

    public var sdrDepartment: Pcstr = sdrDepartmentCtorArg
        internal set

    public var sdrOfficeLocation: Pcstr = sdrOfficeLocationCtorArg
        internal set

    public var sdrHomePhone: Pcstr = sdrHomePhoneCtorArg
        internal set

    public var sdrOfficePhone: Pcstr = sdrOfficePhoneCtorArg
        internal set

    public var note: Pcstr = noteCtorArg
        internal set

    public var subject: Pcstr = subjectCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        coverPageNameCtorArg = ConstPtr(0L),
        useServerCoverPage = 0,
        recNameCtorArg = ConstPtr(0L),
        recFaxNumberCtorArg = ConstPtr(0L),
        recCompanyCtorArg = ConstPtr(0L),
        recStreetAddressCtorArg = ConstPtr(0L),
        recCityCtorArg = ConstPtr(0L),
        recStateCtorArg = ConstPtr(0L),
        recZipCtorArg = ConstPtr(0L),
        recCountryCtorArg = ConstPtr(0L),
        recTitleCtorArg = ConstPtr(0L),
        recDepartmentCtorArg = ConstPtr(0L),
        recOfficeLocationCtorArg = ConstPtr(0L),
        recHomePhoneCtorArg = ConstPtr(0L),
        recOfficePhoneCtorArg = ConstPtr(0L),
        sdrNameCtorArg = ConstPtr(0L),
        sdrFaxNumberCtorArg = ConstPtr(0L),
        sdrCompanyCtorArg = ConstPtr(0L),
        sdrAddressCtorArg = ConstPtr(0L),
        sdrTitleCtorArg = ConstPtr(0L),
        sdrDepartmentCtorArg = ConstPtr(0L),
        sdrOfficeLocationCtorArg = ConstPtr(0L),
        sdrHomePhoneCtorArg = ConstPtr(0L),
        sdrOfficePhoneCtorArg = ConstPtr(0L),
        noteCtorArg = ConstPtr(0L),
        subjectCtorArg = ConstPtr(0L),
        timeSent = Systemtime(),
        pageCount = 0u,
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            coverPageName: Pcstr = ConstPtr(0L),
            useServerCoverPage: Bool = 0,
            recName: Pcstr = ConstPtr(0L),
            recFaxNumber: Pcstr = ConstPtr(0L),
            recCompany: Pcstr = ConstPtr(0L),
            recStreetAddress: Pcstr = ConstPtr(0L),
            recCity: Pcstr = ConstPtr(0L),
            recState: Pcstr = ConstPtr(0L),
            recZip: Pcstr = ConstPtr(0L),
            recCountry: Pcstr = ConstPtr(0L),
            recTitle: Pcstr = ConstPtr(0L),
            recDepartment: Pcstr = ConstPtr(0L),
            recOfficeLocation: Pcstr = ConstPtr(0L),
            recHomePhone: Pcstr = ConstPtr(0L),
            recOfficePhone: Pcstr = ConstPtr(0L),
            sdrName: Pcstr = ConstPtr(0L),
            sdrFaxNumber: Pcstr = ConstPtr(0L),
            sdrCompany: Pcstr = ConstPtr(0L),
            sdrAddress: Pcstr = ConstPtr(0L),
            sdrTitle: Pcstr = ConstPtr(0L),
            sdrDepartment: Pcstr = ConstPtr(0L),
            sdrOfficeLocation: Pcstr = ConstPtr(0L),
            sdrHomePhone: Pcstr = ConstPtr(0L),
            sdrOfficePhone: Pcstr = ConstPtr(0L),
            note: Pcstr = ConstPtr(0L),
            subject: Pcstr = ConstPtr(0L),
            timeSent: Systemtime = Systemtime(),
            pageCount: UInt = 0u,
        ): FaxCoverpageInfoa =
            FaxCoverpageInfoa(
                sizeOfStruct = sizeOfStruct,
                coverPageNameCtorArg = coverPageName,
                useServerCoverPage = useServerCoverPage,
                recNameCtorArg = recName,
                recFaxNumberCtorArg = recFaxNumber,
                recCompanyCtorArg = recCompany,
                recStreetAddressCtorArg = recStreetAddress,
                recCityCtorArg = recCity,
                recStateCtorArg = recState,
                recZipCtorArg = recZip,
                recCountryCtorArg = recCountry,
                recTitleCtorArg = recTitle,
                recDepartmentCtorArg = recDepartment,
                recOfficeLocationCtorArg = recOfficeLocation,
                recHomePhoneCtorArg = recHomePhone,
                recOfficePhoneCtorArg = recOfficePhone,
                sdrNameCtorArg = sdrName,
                sdrFaxNumberCtorArg = sdrFaxNumber,
                sdrCompanyCtorArg = sdrCompany,
                sdrAddressCtorArg = sdrAddress,
                sdrTitleCtorArg = sdrTitle,
                sdrDepartmentCtorArg = sdrDepartment,
                sdrOfficeLocationCtorArg = sdrOfficeLocation,
                sdrHomePhoneCtorArg = sdrHomePhone,
                sdrOfficePhoneCtorArg = sdrOfficePhone,
                noteCtorArg = note,
                subjectCtorArg = subject,
                timeSent = timeSent,
                pageCount = pageCount,
            )
    }
}

public class FaxCoverpageInfow internal constructor(
    public var sizeOfStruct: UInt,
    coverPageNameCtorArg: Pcwstr,
    public var useServerCoverPage: Bool,
    recNameCtorArg: Pcwstr,
    recFaxNumberCtorArg: Pcwstr,
    recCompanyCtorArg: Pcwstr,
    recStreetAddressCtorArg: Pcwstr,
    recCityCtorArg: Pcwstr,
    recStateCtorArg: Pcwstr,
    recZipCtorArg: Pcwstr,
    recCountryCtorArg: Pcwstr,
    recTitleCtorArg: Pcwstr,
    recDepartmentCtorArg: Pcwstr,
    recOfficeLocationCtorArg: Pcwstr,
    recHomePhoneCtorArg: Pcwstr,
    recOfficePhoneCtorArg: Pcwstr,
    sdrNameCtorArg: Pcwstr,
    sdrFaxNumberCtorArg: Pcwstr,
    sdrCompanyCtorArg: Pcwstr,
    sdrAddressCtorArg: Pcwstr,
    sdrTitleCtorArg: Pcwstr,
    sdrDepartmentCtorArg: Pcwstr,
    sdrOfficeLocationCtorArg: Pcwstr,
    sdrHomePhoneCtorArg: Pcwstr,
    sdrOfficePhoneCtorArg: Pcwstr,
    noteCtorArg: Pcwstr,
    subjectCtorArg: Pcwstr,
    public var timeSent: Systemtime,
    public var pageCount: UInt,
) {
    public var coverPageName: Pcwstr = coverPageNameCtorArg
        internal set

    public var recName: Pcwstr = recNameCtorArg
        internal set

    public var recFaxNumber: Pcwstr = recFaxNumberCtorArg
        internal set

    public var recCompany: Pcwstr = recCompanyCtorArg
        internal set

    public var recStreetAddress: Pcwstr = recStreetAddressCtorArg
        internal set

    public var recCity: Pcwstr = recCityCtorArg
        internal set

    public var recState: Pcwstr = recStateCtorArg
        internal set

    public var recZip: Pcwstr = recZipCtorArg
        internal set

    public var recCountry: Pcwstr = recCountryCtorArg
        internal set

    public var recTitle: Pcwstr = recTitleCtorArg
        internal set

    public var recDepartment: Pcwstr = recDepartmentCtorArg
        internal set

    public var recOfficeLocation: Pcwstr = recOfficeLocationCtorArg
        internal set

    public var recHomePhone: Pcwstr = recHomePhoneCtorArg
        internal set

    public var recOfficePhone: Pcwstr = recOfficePhoneCtorArg
        internal set

    public var sdrName: Pcwstr = sdrNameCtorArg
        internal set

    public var sdrFaxNumber: Pcwstr = sdrFaxNumberCtorArg
        internal set

    public var sdrCompany: Pcwstr = sdrCompanyCtorArg
        internal set

    public var sdrAddress: Pcwstr = sdrAddressCtorArg
        internal set

    public var sdrTitle: Pcwstr = sdrTitleCtorArg
        internal set

    public var sdrDepartment: Pcwstr = sdrDepartmentCtorArg
        internal set

    public var sdrOfficeLocation: Pcwstr = sdrOfficeLocationCtorArg
        internal set

    public var sdrHomePhone: Pcwstr = sdrHomePhoneCtorArg
        internal set

    public var sdrOfficePhone: Pcwstr = sdrOfficePhoneCtorArg
        internal set

    public var note: Pcwstr = noteCtorArg
        internal set

    public var subject: Pcwstr = subjectCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        coverPageNameCtorArg = ConstPtr(0L),
        useServerCoverPage = 0,
        recNameCtorArg = ConstPtr(0L),
        recFaxNumberCtorArg = ConstPtr(0L),
        recCompanyCtorArg = ConstPtr(0L),
        recStreetAddressCtorArg = ConstPtr(0L),
        recCityCtorArg = ConstPtr(0L),
        recStateCtorArg = ConstPtr(0L),
        recZipCtorArg = ConstPtr(0L),
        recCountryCtorArg = ConstPtr(0L),
        recTitleCtorArg = ConstPtr(0L),
        recDepartmentCtorArg = ConstPtr(0L),
        recOfficeLocationCtorArg = ConstPtr(0L),
        recHomePhoneCtorArg = ConstPtr(0L),
        recOfficePhoneCtorArg = ConstPtr(0L),
        sdrNameCtorArg = ConstPtr(0L),
        sdrFaxNumberCtorArg = ConstPtr(0L),
        sdrCompanyCtorArg = ConstPtr(0L),
        sdrAddressCtorArg = ConstPtr(0L),
        sdrTitleCtorArg = ConstPtr(0L),
        sdrDepartmentCtorArg = ConstPtr(0L),
        sdrOfficeLocationCtorArg = ConstPtr(0L),
        sdrHomePhoneCtorArg = ConstPtr(0L),
        sdrOfficePhoneCtorArg = ConstPtr(0L),
        noteCtorArg = ConstPtr(0L),
        subjectCtorArg = ConstPtr(0L),
        timeSent = Systemtime(),
        pageCount = 0u,
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            coverPageName: Pcwstr = ConstPtr(0L),
            useServerCoverPage: Bool = 0,
            recName: Pcwstr = ConstPtr(0L),
            recFaxNumber: Pcwstr = ConstPtr(0L),
            recCompany: Pcwstr = ConstPtr(0L),
            recStreetAddress: Pcwstr = ConstPtr(0L),
            recCity: Pcwstr = ConstPtr(0L),
            recState: Pcwstr = ConstPtr(0L),
            recZip: Pcwstr = ConstPtr(0L),
            recCountry: Pcwstr = ConstPtr(0L),
            recTitle: Pcwstr = ConstPtr(0L),
            recDepartment: Pcwstr = ConstPtr(0L),
            recOfficeLocation: Pcwstr = ConstPtr(0L),
            recHomePhone: Pcwstr = ConstPtr(0L),
            recOfficePhone: Pcwstr = ConstPtr(0L),
            sdrName: Pcwstr = ConstPtr(0L),
            sdrFaxNumber: Pcwstr = ConstPtr(0L),
            sdrCompany: Pcwstr = ConstPtr(0L),
            sdrAddress: Pcwstr = ConstPtr(0L),
            sdrTitle: Pcwstr = ConstPtr(0L),
            sdrDepartment: Pcwstr = ConstPtr(0L),
            sdrOfficeLocation: Pcwstr = ConstPtr(0L),
            sdrHomePhone: Pcwstr = ConstPtr(0L),
            sdrOfficePhone: Pcwstr = ConstPtr(0L),
            note: Pcwstr = ConstPtr(0L),
            subject: Pcwstr = ConstPtr(0L),
            timeSent: Systemtime = Systemtime(),
            pageCount: UInt = 0u,
        ): FaxCoverpageInfow =
            FaxCoverpageInfow(
                sizeOfStruct = sizeOfStruct,
                coverPageNameCtorArg = coverPageName,
                useServerCoverPage = useServerCoverPage,
                recNameCtorArg = recName,
                recFaxNumberCtorArg = recFaxNumber,
                recCompanyCtorArg = recCompany,
                recStreetAddressCtorArg = recStreetAddress,
                recCityCtorArg = recCity,
                recStateCtorArg = recState,
                recZipCtorArg = recZip,
                recCountryCtorArg = recCountry,
                recTitleCtorArg = recTitle,
                recDepartmentCtorArg = recDepartment,
                recOfficeLocationCtorArg = recOfficeLocation,
                recHomePhoneCtorArg = recHomePhone,
                recOfficePhoneCtorArg = recOfficePhone,
                sdrNameCtorArg = sdrName,
                sdrFaxNumberCtorArg = sdrFaxNumber,
                sdrCompanyCtorArg = sdrCompany,
                sdrAddressCtorArg = sdrAddress,
                sdrTitleCtorArg = sdrTitle,
                sdrDepartmentCtorArg = sdrDepartment,
                sdrOfficeLocationCtorArg = sdrOfficeLocation,
                sdrHomePhoneCtorArg = sdrHomePhone,
                sdrOfficePhoneCtorArg = sdrOfficePhone,
                noteCtorArg = note,
                subjectCtorArg = subject,
                timeSent = timeSent,
                pageCount = pageCount,
            )
    }
}

public class FaxDeviceStatusa internal constructor(
    public var sizeOfStruct: UInt,
    callerIdCtorArg: Pcstr,
    csidCtorArg: Pcstr,
    public var currentPage: UInt,
    public var deviceId: UInt,
    deviceNameCtorArg: Pcstr,
    documentNameCtorArg: Pcstr,
    public var jobType: UInt,
    phoneNumberCtorArg: Pcstr,
    routingStringCtorArg: Pcstr,
    senderNameCtorArg: Pcstr,
    recipientNameCtorArg: Pcstr,
    public var size: UInt,
    public var startTime: Filetime,
    public var status: UInt,
    statusStringCtorArg: Pcstr,
    public var submittedTime: Filetime,
    public var totalPages: UInt,
    tsidCtorArg: Pcstr,
    userNameCtorArg: Pcstr,
) {
    public var callerId: Pcstr = callerIdCtorArg
        internal set

    public var csid: Pcstr = csidCtorArg
        internal set

    public var deviceName: Pcstr = deviceNameCtorArg
        internal set

    public var documentName: Pcstr = documentNameCtorArg
        internal set

    public var phoneNumber: Pcstr = phoneNumberCtorArg
        internal set

    public var routingString: Pcstr = routingStringCtorArg
        internal set

    public var senderName: Pcstr = senderNameCtorArg
        internal set

    public var recipientName: Pcstr = recipientNameCtorArg
        internal set

    public var statusString: Pcstr = statusStringCtorArg
        internal set

    public var tsid: Pcstr = tsidCtorArg
        internal set

    public var userName: Pcstr = userNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        callerIdCtorArg = ConstPtr(0L),
        csidCtorArg = ConstPtr(0L),
        currentPage = 0u,
        deviceId = 0u,
        deviceNameCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
        jobType = 0u,
        phoneNumberCtorArg = ConstPtr(0L),
        routingStringCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        size = 0u,
        startTime = Filetime(),
        status = 0u,
        statusStringCtorArg = ConstPtr(0L),
        submittedTime = Filetime(),
        totalPages = 0u,
        tsidCtorArg = ConstPtr(0L),
        userNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            callerId: Pcstr = ConstPtr(0L),
            csid: Pcstr = ConstPtr(0L),
            currentPage: UInt = 0u,
            deviceId: UInt = 0u,
            deviceName: Pcstr = ConstPtr(0L),
            documentName: Pcstr = ConstPtr(0L),
            jobType: UInt = 0u,
            phoneNumber: Pcstr = ConstPtr(0L),
            routingString: Pcstr = ConstPtr(0L),
            senderName: Pcstr = ConstPtr(0L),
            recipientName: Pcstr = ConstPtr(0L),
            size: UInt = 0u,
            startTime: Filetime = Filetime(),
            status: UInt = 0u,
            statusString: Pcstr = ConstPtr(0L),
            submittedTime: Filetime = Filetime(),
            totalPages: UInt = 0u,
            tsid: Pcstr = ConstPtr(0L),
            userName: Pcstr = ConstPtr(0L),
        ): FaxDeviceStatusa =
            FaxDeviceStatusa(
                sizeOfStruct = sizeOfStruct,
                callerIdCtorArg = callerId,
                csidCtorArg = csid,
                currentPage = currentPage,
                deviceId = deviceId,
                deviceNameCtorArg = deviceName,
                documentNameCtorArg = documentName,
                jobType = jobType,
                phoneNumberCtorArg = phoneNumber,
                routingStringCtorArg = routingString,
                senderNameCtorArg = senderName,
                recipientNameCtorArg = recipientName,
                size = size,
                startTime = startTime,
                status = status,
                statusStringCtorArg = statusString,
                submittedTime = submittedTime,
                totalPages = totalPages,
                tsidCtorArg = tsid,
                userNameCtorArg = userName,
            )
    }
}

public class FaxDeviceStatusw internal constructor(
    public var sizeOfStruct: UInt,
    callerIdCtorArg: Pcwstr,
    csidCtorArg: Pcwstr,
    public var currentPage: UInt,
    public var deviceId: UInt,
    deviceNameCtorArg: Pcwstr,
    documentNameCtorArg: Pcwstr,
    public var jobType: UInt,
    phoneNumberCtorArg: Pcwstr,
    routingStringCtorArg: Pcwstr,
    senderNameCtorArg: Pcwstr,
    recipientNameCtorArg: Pcwstr,
    public var size: UInt,
    public var startTime: Filetime,
    public var status: UInt,
    statusStringCtorArg: Pcwstr,
    public var submittedTime: Filetime,
    public var totalPages: UInt,
    tsidCtorArg: Pcwstr,
    userNameCtorArg: Pcwstr,
) {
    public var callerId: Pcwstr = callerIdCtorArg
        internal set

    public var csid: Pcwstr = csidCtorArg
        internal set

    public var deviceName: Pcwstr = deviceNameCtorArg
        internal set

    public var documentName: Pcwstr = documentNameCtorArg
        internal set

    public var phoneNumber: Pcwstr = phoneNumberCtorArg
        internal set

    public var routingString: Pcwstr = routingStringCtorArg
        internal set

    public var senderName: Pcwstr = senderNameCtorArg
        internal set

    public var recipientName: Pcwstr = recipientNameCtorArg
        internal set

    public var statusString: Pcwstr = statusStringCtorArg
        internal set

    public var tsid: Pcwstr = tsidCtorArg
        internal set

    public var userName: Pcwstr = userNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        callerIdCtorArg = ConstPtr(0L),
        csidCtorArg = ConstPtr(0L),
        currentPage = 0u,
        deviceId = 0u,
        deviceNameCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
        jobType = 0u,
        phoneNumberCtorArg = ConstPtr(0L),
        routingStringCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        size = 0u,
        startTime = Filetime(),
        status = 0u,
        statusStringCtorArg = ConstPtr(0L),
        submittedTime = Filetime(),
        totalPages = 0u,
        tsidCtorArg = ConstPtr(0L),
        userNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            callerId: Pcwstr = ConstPtr(0L),
            csid: Pcwstr = ConstPtr(0L),
            currentPage: UInt = 0u,
            deviceId: UInt = 0u,
            deviceName: Pcwstr = ConstPtr(0L),
            documentName: Pcwstr = ConstPtr(0L),
            jobType: UInt = 0u,
            phoneNumber: Pcwstr = ConstPtr(0L),
            routingString: Pcwstr = ConstPtr(0L),
            senderName: Pcwstr = ConstPtr(0L),
            recipientName: Pcwstr = ConstPtr(0L),
            size: UInt = 0u,
            startTime: Filetime = Filetime(),
            status: UInt = 0u,
            statusString: Pcwstr = ConstPtr(0L),
            submittedTime: Filetime = Filetime(),
            totalPages: UInt = 0u,
            tsid: Pcwstr = ConstPtr(0L),
            userName: Pcwstr = ConstPtr(0L),
        ): FaxDeviceStatusw =
            FaxDeviceStatusw(
                sizeOfStruct = sizeOfStruct,
                callerIdCtorArg = callerId,
                csidCtorArg = csid,
                currentPage = currentPage,
                deviceId = deviceId,
                deviceNameCtorArg = deviceName,
                documentNameCtorArg = documentName,
                jobType = jobType,
                phoneNumberCtorArg = phoneNumber,
                routingStringCtorArg = routingString,
                senderNameCtorArg = senderName,
                recipientNameCtorArg = recipientName,
                size = size,
                startTime = startTime,
                status = status,
                statusStringCtorArg = statusString,
                submittedTime = submittedTime,
                totalPages = totalPages,
                tsidCtorArg = tsid,
                userNameCtorArg = userName,
            )
    }
}

public class FaxDevStatus internal constructor(
    public var sizeOfStruct: UInt,
    public var statusId: UInt,
    public var stringId: UInt,
    public var pageCount: UInt,
    csiCtorArg: Pwstr,
    callerIdCtorArg: Pwstr,
    routingInfoCtorArg: Pwstr,
    public var errorCode: UInt,
    public var reserved: UIntArray,
) {
    public var csi: Pwstr = csiCtorArg
        internal set

    public var callerId: Pwstr = callerIdCtorArg
        internal set

    public var routingInfo: Pwstr = routingInfoCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        statusId = 0u,
        stringId = 0u,
        pageCount = 0u,
        csiCtorArg = MutPtr(0L),
        callerIdCtorArg = MutPtr(0L),
        routingInfoCtorArg = MutPtr(0L),
        errorCode = 0u,
        reserved = UIntArray(3),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.statusId

    public operator fun component3(): UInt = this.stringId

    public operator fun component4(): UInt = this.pageCount

    public operator fun component5(): Pwstr = this.csi

    public operator fun component6(): Pwstr = this.callerId

    public operator fun component7(): Pwstr = this.routingInfo

    public operator fun component8(): UInt = this.errorCode

    public operator fun component9(): UIntArray = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, statusId: UInt = this.statusId, stringId: UInt = this.stringId, pageCount: UInt = this.pageCount, csi: Pwstr = this.csi, callerId: Pwstr = this.callerId, routingInfo: Pwstr = this.routingInfo, errorCode: UInt = this.errorCode, reserved: UIntArray = this.reserved): FaxDevStatus = FaxDevStatus(sizeOfStruct = sizeOfStruct, statusId = statusId, stringId = stringId, pageCount = pageCount, csiCtorArg = csi, callerIdCtorArg = callerId, routingInfoCtorArg = routingInfo, errorCode = errorCode, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxDevStatus) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.statusId != other.statusId) return false
        if (this.stringId != other.stringId) return false
        if (this.pageCount != other.pageCount) return false
        if (this.csi != other.csi) return false
        if (this.callerId != other.callerId) return false
        if (this.routingInfo != other.routingInfo) return false
        if (this.errorCode != other.errorCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.statusId.hashCode()
        result = 31 * result + this.stringId.hashCode()
        result = 31 * result + this.pageCount.hashCode()
        result = 31 * result + this.csi.hashCode()
        result = 31 * result + this.callerId.hashCode()
        result = 31 * result + this.routingInfo.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            statusId: UInt = 0u,
            stringId: UInt = 0u,
            pageCount: UInt = 0u,
            csi: Pwstr = MutPtr(0L),
            callerId: Pwstr = MutPtr(0L),
            routingInfo: Pwstr = MutPtr(0L),
            errorCode: UInt = 0u,
            reserved: UIntArray = UIntArray(3),
        ): FaxDevStatus =
            FaxDevStatus(
                sizeOfStruct = sizeOfStruct,
                statusId = statusId,
                stringId = stringId,
                pageCount = pageCount,
                csiCtorArg = csi,
                callerIdCtorArg = callerId,
                routingInfoCtorArg = routingInfo,
                errorCode = errorCode,
                reserved = reserved,
            )
    }
}

public data class FaxEventa(
    public var sizeOfStruct: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var deviceId: UInt = 0u,
    public var eventId: UInt = 0u,
    public var jobId: UInt = 0u,
)

public data class FaxEventw(
    public var sizeOfStruct: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var deviceId: UInt = 0u,
    public var eventId: UInt = 0u,
    public var jobId: UInt = 0u,
)

public class FaxGlobalRoutingInfoa internal constructor(
    public var sizeOfStruct: UInt,
    public var priority: UInt,
    guidCtorArg: Pcstr,
    friendlyNameCtorArg: Pcstr,
    functionNameCtorArg: Pcstr,
    extensionImageNameCtorArg: Pcstr,
    extensionFriendlyNameCtorArg: Pcstr,
) {
    public var guid: Pcstr = guidCtorArg
        internal set

    public var friendlyName: Pcstr = friendlyNameCtorArg
        internal set

    public var functionName: Pcstr = functionNameCtorArg
        internal set

    public var extensionImageName: Pcstr = extensionImageNameCtorArg
        internal set

    public var extensionFriendlyName: Pcstr = extensionFriendlyNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        priority = 0u,
        guidCtorArg = ConstPtr(0L),
        friendlyNameCtorArg = ConstPtr(0L),
        functionNameCtorArg = ConstPtr(0L),
        extensionImageNameCtorArg = ConstPtr(0L),
        extensionFriendlyNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.priority

    public operator fun component3(): Pcstr = this.guid

    public operator fun component4(): Pcstr = this.friendlyName

    public operator fun component5(): Pcstr = this.functionName

    public operator fun component6(): Pcstr = this.extensionImageName

    public operator fun component7(): Pcstr = this.extensionFriendlyName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, priority: UInt = this.priority, guid: Pcstr = this.guid, friendlyName: Pcstr = this.friendlyName, functionName: Pcstr = this.functionName, extensionImageName: Pcstr = this.extensionImageName, extensionFriendlyName: Pcstr = this.extensionFriendlyName): FaxGlobalRoutingInfoa = FaxGlobalRoutingInfoa(sizeOfStruct = sizeOfStruct, priority = priority, guidCtorArg = guid, friendlyNameCtorArg = friendlyName, functionNameCtorArg = functionName, extensionImageNameCtorArg = extensionImageName, extensionFriendlyNameCtorArg = extensionFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxGlobalRoutingInfoa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.priority != other.priority) return false
        if (this.guid != other.guid) return false
        if (this.friendlyName != other.friendlyName) return false
        if (this.functionName != other.functionName) return false
        if (this.extensionImageName != other.extensionImageName) return false
        if (this.extensionFriendlyName != other.extensionFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.friendlyName.hashCode()
        result = 31 * result + this.functionName.hashCode()
        result = 31 * result + this.extensionImageName.hashCode()
        result = 31 * result + this.extensionFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            priority: UInt = 0u,
            guid: Pcstr = ConstPtr(0L),
            friendlyName: Pcstr = ConstPtr(0L),
            functionName: Pcstr = ConstPtr(0L),
            extensionImageName: Pcstr = ConstPtr(0L),
            extensionFriendlyName: Pcstr = ConstPtr(0L),
        ): FaxGlobalRoutingInfoa =
            FaxGlobalRoutingInfoa(
                sizeOfStruct = sizeOfStruct,
                priority = priority,
                guidCtorArg = guid,
                friendlyNameCtorArg = friendlyName,
                functionNameCtorArg = functionName,
                extensionImageNameCtorArg = extensionImageName,
                extensionFriendlyNameCtorArg = extensionFriendlyName,
            )
    }
}

public class FaxGlobalRoutingInfow internal constructor(
    public var sizeOfStruct: UInt,
    public var priority: UInt,
    guidCtorArg: Pcwstr,
    friendlyNameCtorArg: Pcwstr,
    functionNameCtorArg: Pcwstr,
    extensionImageNameCtorArg: Pcwstr,
    extensionFriendlyNameCtorArg: Pcwstr,
) {
    public var guid: Pcwstr = guidCtorArg
        internal set

    public var friendlyName: Pcwstr = friendlyNameCtorArg
        internal set

    public var functionName: Pcwstr = functionNameCtorArg
        internal set

    public var extensionImageName: Pcwstr = extensionImageNameCtorArg
        internal set

    public var extensionFriendlyName: Pcwstr = extensionFriendlyNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        priority = 0u,
        guidCtorArg = ConstPtr(0L),
        friendlyNameCtorArg = ConstPtr(0L),
        functionNameCtorArg = ConstPtr(0L),
        extensionImageNameCtorArg = ConstPtr(0L),
        extensionFriendlyNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.priority

    public operator fun component3(): Pcwstr = this.guid

    public operator fun component4(): Pcwstr = this.friendlyName

    public operator fun component5(): Pcwstr = this.functionName

    public operator fun component6(): Pcwstr = this.extensionImageName

    public operator fun component7(): Pcwstr = this.extensionFriendlyName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, priority: UInt = this.priority, guid: Pcwstr = this.guid, friendlyName: Pcwstr = this.friendlyName, functionName: Pcwstr = this.functionName, extensionImageName: Pcwstr = this.extensionImageName, extensionFriendlyName: Pcwstr = this.extensionFriendlyName): FaxGlobalRoutingInfow = FaxGlobalRoutingInfow(sizeOfStruct = sizeOfStruct, priority = priority, guidCtorArg = guid, friendlyNameCtorArg = friendlyName, functionNameCtorArg = functionName, extensionImageNameCtorArg = extensionImageName, extensionFriendlyNameCtorArg = extensionFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxGlobalRoutingInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.priority != other.priority) return false
        if (this.guid != other.guid) return false
        if (this.friendlyName != other.friendlyName) return false
        if (this.functionName != other.functionName) return false
        if (this.extensionImageName != other.extensionImageName) return false
        if (this.extensionFriendlyName != other.extensionFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.friendlyName.hashCode()
        result = 31 * result + this.functionName.hashCode()
        result = 31 * result + this.extensionImageName.hashCode()
        result = 31 * result + this.extensionFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            priority: UInt = 0u,
            guid: Pcwstr = ConstPtr(0L),
            friendlyName: Pcwstr = ConstPtr(0L),
            functionName: Pcwstr = ConstPtr(0L),
            extensionImageName: Pcwstr = ConstPtr(0L),
            extensionFriendlyName: Pcwstr = ConstPtr(0L),
        ): FaxGlobalRoutingInfow =
            FaxGlobalRoutingInfow(
                sizeOfStruct = sizeOfStruct,
                priority = priority,
                guidCtorArg = guid,
                friendlyNameCtorArg = friendlyName,
                functionNameCtorArg = functionName,
                extensionImageNameCtorArg = extensionImageName,
                extensionFriendlyNameCtorArg = extensionFriendlyName,
            )
    }
}

public class FaxJobEntrya internal constructor(
    public var sizeOfStruct: UInt,
    public var jobId: UInt,
    userNameCtorArg: Pcstr,
    public var jobType: UInt,
    public var queueStatus: UInt,
    public var status: UInt,
    public var size: UInt,
    public var pageCount: UInt,
    recipientNumberCtorArg: Pcstr,
    recipientNameCtorArg: Pcstr,
    tsidCtorArg: Pcstr,
    senderNameCtorArg: Pcstr,
    senderCompanyCtorArg: Pcstr,
    senderDeptCtorArg: Pcstr,
    billingCodeCtorArg: Pcstr,
    public var scheduleAction: UInt,
    public var scheduleTime: Systemtime,
    public var deliveryReportType: UInt,
    deliveryReportAddressCtorArg: Pcstr,
    documentNameCtorArg: Pcstr,
) {
    public var userName: Pcstr = userNameCtorArg
        internal set

    public var recipientNumber: Pcstr = recipientNumberCtorArg
        internal set

    public var recipientName: Pcstr = recipientNameCtorArg
        internal set

    public var tsid: Pcstr = tsidCtorArg
        internal set

    public var senderName: Pcstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcstr = senderDeptCtorArg
        internal set

    public var billingCode: Pcstr = billingCodeCtorArg
        internal set

    public var deliveryReportAddress: Pcstr = deliveryReportAddressCtorArg
        internal set

    public var documentName: Pcstr = documentNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        jobId = 0u,
        userNameCtorArg = ConstPtr(0L),
        jobType = 0u,
        queueStatus = 0u,
        status = 0u,
        size = 0u,
        pageCount = 0u,
        recipientNumberCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        billingCodeCtorArg = ConstPtr(0L),
        scheduleAction = 0u,
        scheduleTime = Systemtime(),
        deliveryReportType = 0u,
        deliveryReportAddressCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            jobId: UInt = 0u,
            userName: Pcstr = ConstPtr(0L),
            jobType: UInt = 0u,
            queueStatus: UInt = 0u,
            status: UInt = 0u,
            size: UInt = 0u,
            pageCount: UInt = 0u,
            recipientNumber: Pcstr = ConstPtr(0L),
            recipientName: Pcstr = ConstPtr(0L),
            tsid: Pcstr = ConstPtr(0L),
            senderName: Pcstr = ConstPtr(0L),
            senderCompany: Pcstr = ConstPtr(0L),
            senderDept: Pcstr = ConstPtr(0L),
            billingCode: Pcstr = ConstPtr(0L),
            scheduleAction: UInt = 0u,
            scheduleTime: Systemtime = Systemtime(),
            deliveryReportType: UInt = 0u,
            deliveryReportAddress: Pcstr = ConstPtr(0L),
            documentName: Pcstr = ConstPtr(0L),
        ): FaxJobEntrya =
            FaxJobEntrya(
                sizeOfStruct = sizeOfStruct,
                jobId = jobId,
                userNameCtorArg = userName,
                jobType = jobType,
                queueStatus = queueStatus,
                status = status,
                size = size,
                pageCount = pageCount,
                recipientNumberCtorArg = recipientNumber,
                recipientNameCtorArg = recipientName,
                tsidCtorArg = tsid,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                billingCodeCtorArg = billingCode,
                scheduleAction = scheduleAction,
                scheduleTime = scheduleTime,
                deliveryReportType = deliveryReportType,
                deliveryReportAddressCtorArg = deliveryReportAddress,
                documentNameCtorArg = documentName,
            )
    }
}

public class FaxJobEntryw internal constructor(
    public var sizeOfStruct: UInt,
    public var jobId: UInt,
    userNameCtorArg: Pcwstr,
    public var jobType: UInt,
    public var queueStatus: UInt,
    public var status: UInt,
    public var size: UInt,
    public var pageCount: UInt,
    recipientNumberCtorArg: Pcwstr,
    recipientNameCtorArg: Pcwstr,
    tsidCtorArg: Pcwstr,
    senderNameCtorArg: Pcwstr,
    senderCompanyCtorArg: Pcwstr,
    senderDeptCtorArg: Pcwstr,
    billingCodeCtorArg: Pcwstr,
    public var scheduleAction: UInt,
    public var scheduleTime: Systemtime,
    public var deliveryReportType: UInt,
    deliveryReportAddressCtorArg: Pcwstr,
    documentNameCtorArg: Pcwstr,
) {
    public var userName: Pcwstr = userNameCtorArg
        internal set

    public var recipientNumber: Pcwstr = recipientNumberCtorArg
        internal set

    public var recipientName: Pcwstr = recipientNameCtorArg
        internal set

    public var tsid: Pcwstr = tsidCtorArg
        internal set

    public var senderName: Pcwstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcwstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcwstr = senderDeptCtorArg
        internal set

    public var billingCode: Pcwstr = billingCodeCtorArg
        internal set

    public var deliveryReportAddress: Pcwstr = deliveryReportAddressCtorArg
        internal set

    public var documentName: Pcwstr = documentNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        jobId = 0u,
        userNameCtorArg = ConstPtr(0L),
        jobType = 0u,
        queueStatus = 0u,
        status = 0u,
        size = 0u,
        pageCount = 0u,
        recipientNumberCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        billingCodeCtorArg = ConstPtr(0L),
        scheduleAction = 0u,
        scheduleTime = Systemtime(),
        deliveryReportType = 0u,
        deliveryReportAddressCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            jobId: UInt = 0u,
            userName: Pcwstr = ConstPtr(0L),
            jobType: UInt = 0u,
            queueStatus: UInt = 0u,
            status: UInt = 0u,
            size: UInt = 0u,
            pageCount: UInt = 0u,
            recipientNumber: Pcwstr = ConstPtr(0L),
            recipientName: Pcwstr = ConstPtr(0L),
            tsid: Pcwstr = ConstPtr(0L),
            senderName: Pcwstr = ConstPtr(0L),
            senderCompany: Pcwstr = ConstPtr(0L),
            senderDept: Pcwstr = ConstPtr(0L),
            billingCode: Pcwstr = ConstPtr(0L),
            scheduleAction: UInt = 0u,
            scheduleTime: Systemtime = Systemtime(),
            deliveryReportType: UInt = 0u,
            deliveryReportAddress: Pcwstr = ConstPtr(0L),
            documentName: Pcwstr = ConstPtr(0L),
        ): FaxJobEntryw =
            FaxJobEntryw(
                sizeOfStruct = sizeOfStruct,
                jobId = jobId,
                userNameCtorArg = userName,
                jobType = jobType,
                queueStatus = queueStatus,
                status = status,
                size = size,
                pageCount = pageCount,
                recipientNumberCtorArg = recipientNumber,
                recipientNameCtorArg = recipientName,
                tsidCtorArg = tsid,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                billingCodeCtorArg = billingCode,
                scheduleAction = scheduleAction,
                scheduleTime = scheduleTime,
                deliveryReportType = deliveryReportType,
                deliveryReportAddressCtorArg = deliveryReportAddress,
                documentNameCtorArg = documentName,
            )
    }
}

public class FaxJobParama internal constructor(
    public var sizeOfStruct: UInt,
    recipientNumberCtorArg: Pcstr,
    recipientNameCtorArg: Pcstr,
    tsidCtorArg: Pcstr,
    senderNameCtorArg: Pcstr,
    senderCompanyCtorArg: Pcstr,
    senderDeptCtorArg: Pcstr,
    billingCodeCtorArg: Pcstr,
    public var scheduleAction: UInt,
    public var scheduleTime: Systemtime,
    public var deliveryReportType: UInt,
    deliveryReportAddressCtorArg: Pcstr,
    documentNameCtorArg: Pcstr,
    public var callHandle: UInt,
    public var reserved: IntArray,
) {
    public var recipientNumber: Pcstr = recipientNumberCtorArg
        internal set

    public var recipientName: Pcstr = recipientNameCtorArg
        internal set

    public var tsid: Pcstr = tsidCtorArg
        internal set

    public var senderName: Pcstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcstr = senderDeptCtorArg
        internal set

    public var billingCode: Pcstr = billingCodeCtorArg
        internal set

    public var deliveryReportAddress: Pcstr = deliveryReportAddressCtorArg
        internal set

    public var documentName: Pcstr = documentNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        recipientNumberCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        billingCodeCtorArg = ConstPtr(0L),
        scheduleAction = 0u,
        scheduleTime = Systemtime(),
        deliveryReportType = 0u,
        deliveryReportAddressCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
        callHandle = 0u,
        reserved = IntArray(3),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pcstr = this.recipientNumber

    public operator fun component3(): Pcstr = this.recipientName

    public operator fun component4(): Pcstr = this.tsid

    public operator fun component5(): Pcstr = this.senderName

    public operator fun component6(): Pcstr = this.senderCompany

    public operator fun component7(): Pcstr = this.senderDept

    public operator fun component8(): Pcstr = this.billingCode

    public operator fun component9(): UInt = this.scheduleAction

    public operator fun component10(): Systemtime = this.scheduleTime

    public operator fun component11(): UInt = this.deliveryReportType

    public operator fun component12(): Pcstr = this.deliveryReportAddress

    public operator fun component13(): Pcstr = this.documentName

    public operator fun component14(): UInt = this.callHandle

    public operator fun component15(): IntArray = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, recipientNumber: Pcstr = this.recipientNumber, recipientName: Pcstr = this.recipientName, tsid: Pcstr = this.tsid, senderName: Pcstr = this.senderName, senderCompany: Pcstr = this.senderCompany, senderDept: Pcstr = this.senderDept, billingCode: Pcstr = this.billingCode, scheduleAction: UInt = this.scheduleAction, scheduleTime: Systemtime = this.scheduleTime, deliveryReportType: UInt = this.deliveryReportType, deliveryReportAddress: Pcstr = this.deliveryReportAddress, documentName: Pcstr = this.documentName, callHandle: UInt = this.callHandle, reserved: IntArray = this.reserved): FaxJobParama = FaxJobParama(sizeOfStruct = sizeOfStruct, recipientNumberCtorArg = recipientNumber, recipientNameCtorArg = recipientName, tsidCtorArg = tsid, senderNameCtorArg = senderName, senderCompanyCtorArg = senderCompany, senderDeptCtorArg = senderDept, billingCodeCtorArg = billingCode, scheduleAction = scheduleAction, scheduleTime = scheduleTime, deliveryReportType = deliveryReportType, deliveryReportAddressCtorArg = deliveryReportAddress, documentNameCtorArg = documentName, callHandle = callHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxJobParama) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.recipientName != other.recipientName) return false
        if (this.tsid != other.tsid) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.billingCode != other.billingCode) return false
        if (this.scheduleAction != other.scheduleAction) return false
        if (this.scheduleTime != other.scheduleTime) return false
        if (this.deliveryReportType != other.deliveryReportType) return false
        if (this.deliveryReportAddress != other.deliveryReportAddress) return false
        if (this.documentName != other.documentName) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.billingCode.hashCode()
        result = 31 * result + this.scheduleAction.hashCode()
        result = 31 * result + this.scheduleTime.hashCode()
        result = 31 * result + this.deliveryReportType.hashCode()
        result = 31 * result + this.deliveryReportAddress.hashCode()
        result = 31 * result + this.documentName.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            recipientNumber: Pcstr = ConstPtr(0L),
            recipientName: Pcstr = ConstPtr(0L),
            tsid: Pcstr = ConstPtr(0L),
            senderName: Pcstr = ConstPtr(0L),
            senderCompany: Pcstr = ConstPtr(0L),
            senderDept: Pcstr = ConstPtr(0L),
            billingCode: Pcstr = ConstPtr(0L),
            scheduleAction: UInt = 0u,
            scheduleTime: Systemtime = Systemtime(),
            deliveryReportType: UInt = 0u,
            deliveryReportAddress: Pcstr = ConstPtr(0L),
            documentName: Pcstr = ConstPtr(0L),
            callHandle: UInt = 0u,
            reserved: IntArray = IntArray(3),
        ): FaxJobParama =
            FaxJobParama(
                sizeOfStruct = sizeOfStruct,
                recipientNumberCtorArg = recipientNumber,
                recipientNameCtorArg = recipientName,
                tsidCtorArg = tsid,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                billingCodeCtorArg = billingCode,
                scheduleAction = scheduleAction,
                scheduleTime = scheduleTime,
                deliveryReportType = deliveryReportType,
                deliveryReportAddressCtorArg = deliveryReportAddress,
                documentNameCtorArg = documentName,
                callHandle = callHandle,
                reserved = reserved,
            )
    }
}

public class FaxJobParamw internal constructor(
    public var sizeOfStruct: UInt,
    recipientNumberCtorArg: Pcwstr,
    recipientNameCtorArg: Pcwstr,
    tsidCtorArg: Pcwstr,
    senderNameCtorArg: Pcwstr,
    senderCompanyCtorArg: Pcwstr,
    senderDeptCtorArg: Pcwstr,
    billingCodeCtorArg: Pcwstr,
    public var scheduleAction: UInt,
    public var scheduleTime: Systemtime,
    public var deliveryReportType: UInt,
    deliveryReportAddressCtorArg: Pcwstr,
    documentNameCtorArg: Pcwstr,
    public var callHandle: UInt,
    public var reserved: IntArray,
) {
    public var recipientNumber: Pcwstr = recipientNumberCtorArg
        internal set

    public var recipientName: Pcwstr = recipientNameCtorArg
        internal set

    public var tsid: Pcwstr = tsidCtorArg
        internal set

    public var senderName: Pcwstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcwstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcwstr = senderDeptCtorArg
        internal set

    public var billingCode: Pcwstr = billingCodeCtorArg
        internal set

    public var deliveryReportAddress: Pcwstr = deliveryReportAddressCtorArg
        internal set

    public var documentName: Pcwstr = documentNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        recipientNumberCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        billingCodeCtorArg = ConstPtr(0L),
        scheduleAction = 0u,
        scheduleTime = Systemtime(),
        deliveryReportType = 0u,
        deliveryReportAddressCtorArg = ConstPtr(0L),
        documentNameCtorArg = ConstPtr(0L),
        callHandle = 0u,
        reserved = IntArray(3),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pcwstr = this.recipientNumber

    public operator fun component3(): Pcwstr = this.recipientName

    public operator fun component4(): Pcwstr = this.tsid

    public operator fun component5(): Pcwstr = this.senderName

    public operator fun component6(): Pcwstr = this.senderCompany

    public operator fun component7(): Pcwstr = this.senderDept

    public operator fun component8(): Pcwstr = this.billingCode

    public operator fun component9(): UInt = this.scheduleAction

    public operator fun component10(): Systemtime = this.scheduleTime

    public operator fun component11(): UInt = this.deliveryReportType

    public operator fun component12(): Pcwstr = this.deliveryReportAddress

    public operator fun component13(): Pcwstr = this.documentName

    public operator fun component14(): UInt = this.callHandle

    public operator fun component15(): IntArray = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, recipientNumber: Pcwstr = this.recipientNumber, recipientName: Pcwstr = this.recipientName, tsid: Pcwstr = this.tsid, senderName: Pcwstr = this.senderName, senderCompany: Pcwstr = this.senderCompany, senderDept: Pcwstr = this.senderDept, billingCode: Pcwstr = this.billingCode, scheduleAction: UInt = this.scheduleAction, scheduleTime: Systemtime = this.scheduleTime, deliveryReportType: UInt = this.deliveryReportType, deliveryReportAddress: Pcwstr = this.deliveryReportAddress, documentName: Pcwstr = this.documentName, callHandle: UInt = this.callHandle, reserved: IntArray = this.reserved): FaxJobParamw = FaxJobParamw(sizeOfStruct = sizeOfStruct, recipientNumberCtorArg = recipientNumber, recipientNameCtorArg = recipientName, tsidCtorArg = tsid, senderNameCtorArg = senderName, senderCompanyCtorArg = senderCompany, senderDeptCtorArg = senderDept, billingCodeCtorArg = billingCode, scheduleAction = scheduleAction, scheduleTime = scheduleTime, deliveryReportType = deliveryReportType, deliveryReportAddressCtorArg = deliveryReportAddress, documentNameCtorArg = documentName, callHandle = callHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxJobParamw) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.recipientName != other.recipientName) return false
        if (this.tsid != other.tsid) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.billingCode != other.billingCode) return false
        if (this.scheduleAction != other.scheduleAction) return false
        if (this.scheduleTime != other.scheduleTime) return false
        if (this.deliveryReportType != other.deliveryReportType) return false
        if (this.deliveryReportAddress != other.deliveryReportAddress) return false
        if (this.documentName != other.documentName) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.billingCode.hashCode()
        result = 31 * result + this.scheduleAction.hashCode()
        result = 31 * result + this.scheduleTime.hashCode()
        result = 31 * result + this.deliveryReportType.hashCode()
        result = 31 * result + this.deliveryReportAddress.hashCode()
        result = 31 * result + this.documentName.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            recipientNumber: Pcwstr = ConstPtr(0L),
            recipientName: Pcwstr = ConstPtr(0L),
            tsid: Pcwstr = ConstPtr(0L),
            senderName: Pcwstr = ConstPtr(0L),
            senderCompany: Pcwstr = ConstPtr(0L),
            senderDept: Pcwstr = ConstPtr(0L),
            billingCode: Pcwstr = ConstPtr(0L),
            scheduleAction: UInt = 0u,
            scheduleTime: Systemtime = Systemtime(),
            deliveryReportType: UInt = 0u,
            deliveryReportAddress: Pcwstr = ConstPtr(0L),
            documentName: Pcwstr = ConstPtr(0L),
            callHandle: UInt = 0u,
            reserved: IntArray = IntArray(3),
        ): FaxJobParamw =
            FaxJobParamw(
                sizeOfStruct = sizeOfStruct,
                recipientNumberCtorArg = recipientNumber,
                recipientNameCtorArg = recipientName,
                tsidCtorArg = tsid,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                billingCodeCtorArg = billingCode,
                scheduleAction = scheduleAction,
                scheduleTime = scheduleTime,
                deliveryReportType = deliveryReportType,
                deliveryReportAddressCtorArg = deliveryReportAddress,
                documentNameCtorArg = documentName,
                callHandle = callHandle,
                reserved = reserved,
            )
    }
}

public class FaxLogCategorya internal constructor(
    nameCtorArg: Pcstr,
    public var category: UInt,
    public var level: UInt,
) {
    public var name: Pcstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        category = 0u,
        level = 0u,
    )

    public operator fun component1(): Pcstr = this.name

    public operator fun component2(): UInt = this.category

    public operator fun component3(): UInt = this.level

    public fun copy(name: Pcstr = this.name, category: UInt = this.category, level: UInt = this.level): FaxLogCategorya = FaxLogCategorya(nameCtorArg = name, category = category, level = level)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxLogCategorya) return false
        if (this.name != other.name) return false
        if (this.category != other.category) return false
        if (this.level != other.level) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.level.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcstr = ConstPtr(0L),
            category: UInt = 0u,
            level: UInt = 0u,
        ): FaxLogCategorya =
            FaxLogCategorya(
                nameCtorArg = name,
                category = category,
                level = level,
            )
    }
}

public class FaxLogCategoryw internal constructor(
    nameCtorArg: Pcwstr,
    public var category: UInt,
    public var level: UInt,
) {
    public var name: Pcwstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        category = 0u,
        level = 0u,
    )

    public operator fun component1(): Pcwstr = this.name

    public operator fun component2(): UInt = this.category

    public operator fun component3(): UInt = this.level

    public fun copy(name: Pcwstr = this.name, category: UInt = this.category, level: UInt = this.level): FaxLogCategoryw = FaxLogCategoryw(nameCtorArg = name, category = category, level = level)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxLogCategoryw) return false
        if (this.name != other.name) return false
        if (this.category != other.category) return false
        if (this.level != other.level) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.level.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcwstr = ConstPtr(0L),
            category: UInt = 0u,
            level: UInt = 0u,
        ): FaxLogCategoryw =
            FaxLogCategoryw(
                nameCtorArg = name,
                category = category,
                level = level,
            )
    }
}

public class FaxPortInfoa internal constructor(
    public var sizeOfStruct: UInt,
    public var deviceId: UInt,
    public var state: UInt,
    public var flags: UInt,
    public var rings: UInt,
    public var priority: UInt,
    deviceNameCtorArg: Pcstr,
    tsidCtorArg: Pcstr,
    csidCtorArg: Pcstr,
) {
    public var deviceName: Pcstr = deviceNameCtorArg
        internal set

    public var tsid: Pcstr = tsidCtorArg
        internal set

    public var csid: Pcstr = csidCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        deviceId = 0u,
        state = 0u,
        flags = 0u,
        rings = 0u,
        priority = 0u,
        deviceNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        csidCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.deviceId

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.rings

    public operator fun component6(): UInt = this.priority

    public operator fun component7(): Pcstr = this.deviceName

    public operator fun component8(): Pcstr = this.tsid

    public operator fun component9(): Pcstr = this.csid

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, deviceId: UInt = this.deviceId, state: UInt = this.state, flags: UInt = this.flags, rings: UInt = this.rings, priority: UInt = this.priority, deviceName: Pcstr = this.deviceName, tsid: Pcstr = this.tsid, csid: Pcstr = this.csid): FaxPortInfoa = FaxPortInfoa(sizeOfStruct = sizeOfStruct, deviceId = deviceId, state = state, flags = flags, rings = rings, priority = priority, deviceNameCtorArg = deviceName, tsidCtorArg = tsid, csidCtorArg = csid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxPortInfoa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.deviceId != other.deviceId) return false
        if (this.state != other.state) return false
        if (this.flags != other.flags) return false
        if (this.rings != other.rings) return false
        if (this.priority != other.priority) return false
        if (this.deviceName != other.deviceName) return false
        if (this.tsid != other.tsid) return false
        if (this.csid != other.csid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rings.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.csid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            deviceId: UInt = 0u,
            state: UInt = 0u,
            flags: UInt = 0u,
            rings: UInt = 0u,
            priority: UInt = 0u,
            deviceName: Pcstr = ConstPtr(0L),
            tsid: Pcstr = ConstPtr(0L),
            csid: Pcstr = ConstPtr(0L),
        ): FaxPortInfoa =
            FaxPortInfoa(
                sizeOfStruct = sizeOfStruct,
                deviceId = deviceId,
                state = state,
                flags = flags,
                rings = rings,
                priority = priority,
                deviceNameCtorArg = deviceName,
                tsidCtorArg = tsid,
                csidCtorArg = csid,
            )
    }
}

public class FaxPortInfow internal constructor(
    public var sizeOfStruct: UInt,
    public var deviceId: UInt,
    public var state: UInt,
    public var flags: UInt,
    public var rings: UInt,
    public var priority: UInt,
    deviceNameCtorArg: Pcwstr,
    tsidCtorArg: Pcwstr,
    csidCtorArg: Pcwstr,
) {
    public var deviceName: Pcwstr = deviceNameCtorArg
        internal set

    public var tsid: Pcwstr = tsidCtorArg
        internal set

    public var csid: Pcwstr = csidCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        deviceId = 0u,
        state = 0u,
        flags = 0u,
        rings = 0u,
        priority = 0u,
        deviceNameCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        csidCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.deviceId

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.rings

    public operator fun component6(): UInt = this.priority

    public operator fun component7(): Pcwstr = this.deviceName

    public operator fun component8(): Pcwstr = this.tsid

    public operator fun component9(): Pcwstr = this.csid

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, deviceId: UInt = this.deviceId, state: UInt = this.state, flags: UInt = this.flags, rings: UInt = this.rings, priority: UInt = this.priority, deviceName: Pcwstr = this.deviceName, tsid: Pcwstr = this.tsid, csid: Pcwstr = this.csid): FaxPortInfow = FaxPortInfow(sizeOfStruct = sizeOfStruct, deviceId = deviceId, state = state, flags = flags, rings = rings, priority = priority, deviceNameCtorArg = deviceName, tsidCtorArg = tsid, csidCtorArg = csid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxPortInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.deviceId != other.deviceId) return false
        if (this.state != other.state) return false
        if (this.flags != other.flags) return false
        if (this.rings != other.rings) return false
        if (this.priority != other.priority) return false
        if (this.deviceName != other.deviceName) return false
        if (this.tsid != other.tsid) return false
        if (this.csid != other.csid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rings.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.csid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            deviceId: UInt = 0u,
            state: UInt = 0u,
            flags: UInt = 0u,
            rings: UInt = 0u,
            priority: UInt = 0u,
            deviceName: Pcwstr = ConstPtr(0L),
            tsid: Pcwstr = ConstPtr(0L),
            csid: Pcwstr = ConstPtr(0L),
        ): FaxPortInfow =
            FaxPortInfow(
                sizeOfStruct = sizeOfStruct,
                deviceId = deviceId,
                state = state,
                flags = flags,
                rings = rings,
                priority = priority,
                deviceNameCtorArg = deviceName,
                tsidCtorArg = tsid,
                csidCtorArg = csid,
            )
    }
}

public class FaxPrintInfoa internal constructor(
    public var sizeOfStruct: UInt,
    docNameCtorArg: Pcstr,
    recipientNameCtorArg: Pcstr,
    recipientNumberCtorArg: Pcstr,
    senderNameCtorArg: Pcstr,
    senderCompanyCtorArg: Pcstr,
    senderDeptCtorArg: Pcstr,
    senderBillingCodeCtorArg: Pcstr,
    reservedCtorArg: Pcstr,
    drEmailAddressCtorArg: Pcstr,
    outputFileNameCtorArg: Pcstr,
) {
    public var docName: Pcstr = docNameCtorArg
        internal set

    public var recipientName: Pcstr = recipientNameCtorArg
        internal set

    public var recipientNumber: Pcstr = recipientNumberCtorArg
        internal set

    public var senderName: Pcstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcstr = senderDeptCtorArg
        internal set

    public var senderBillingCode: Pcstr = senderBillingCodeCtorArg
        internal set

    public var reserved: Pcstr = reservedCtorArg
        internal set

    public var drEmailAddress: Pcstr = drEmailAddressCtorArg
        internal set

    public var outputFileName: Pcstr = outputFileNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        docNameCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        recipientNumberCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        senderBillingCodeCtorArg = ConstPtr(0L),
        reservedCtorArg = ConstPtr(0L),
        drEmailAddressCtorArg = ConstPtr(0L),
        outputFileNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pcstr = this.docName

    public operator fun component3(): Pcstr = this.recipientName

    public operator fun component4(): Pcstr = this.recipientNumber

    public operator fun component5(): Pcstr = this.senderName

    public operator fun component6(): Pcstr = this.senderCompany

    public operator fun component7(): Pcstr = this.senderDept

    public operator fun component8(): Pcstr = this.senderBillingCode

    public operator fun component9(): Pcstr = this.reserved

    public operator fun component10(): Pcstr = this.drEmailAddress

    public operator fun component11(): Pcstr = this.outputFileName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, docName: Pcstr = this.docName, recipientName: Pcstr = this.recipientName, recipientNumber: Pcstr = this.recipientNumber, senderName: Pcstr = this.senderName, senderCompany: Pcstr = this.senderCompany, senderDept: Pcstr = this.senderDept, senderBillingCode: Pcstr = this.senderBillingCode, reserved: Pcstr = this.reserved, drEmailAddress: Pcstr = this.drEmailAddress, outputFileName: Pcstr = this.outputFileName): FaxPrintInfoa = FaxPrintInfoa(sizeOfStruct = sizeOfStruct, docNameCtorArg = docName, recipientNameCtorArg = recipientName, recipientNumberCtorArg = recipientNumber, senderNameCtorArg = senderName, senderCompanyCtorArg = senderCompany, senderDeptCtorArg = senderDept, senderBillingCodeCtorArg = senderBillingCode, reservedCtorArg = reserved, drEmailAddressCtorArg = drEmailAddress, outputFileNameCtorArg = outputFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxPrintInfoa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.docName != other.docName) return false
        if (this.recipientName != other.recipientName) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.senderBillingCode != other.senderBillingCode) return false
        if (this.reserved != other.reserved) return false
        if (this.drEmailAddress != other.drEmailAddress) return false
        if (this.outputFileName != other.outputFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.docName.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.senderBillingCode.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.drEmailAddress.hashCode()
        result = 31 * result + this.outputFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            docName: Pcstr = ConstPtr(0L),
            recipientName: Pcstr = ConstPtr(0L),
            recipientNumber: Pcstr = ConstPtr(0L),
            senderName: Pcstr = ConstPtr(0L),
            senderCompany: Pcstr = ConstPtr(0L),
            senderDept: Pcstr = ConstPtr(0L),
            senderBillingCode: Pcstr = ConstPtr(0L),
            reserved: Pcstr = ConstPtr(0L),
            drEmailAddress: Pcstr = ConstPtr(0L),
            outputFileName: Pcstr = ConstPtr(0L),
        ): FaxPrintInfoa =
            FaxPrintInfoa(
                sizeOfStruct = sizeOfStruct,
                docNameCtorArg = docName,
                recipientNameCtorArg = recipientName,
                recipientNumberCtorArg = recipientNumber,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                senderBillingCodeCtorArg = senderBillingCode,
                reservedCtorArg = reserved,
                drEmailAddressCtorArg = drEmailAddress,
                outputFileNameCtorArg = outputFileName,
            )
    }
}

public class FaxPrintInfow internal constructor(
    public var sizeOfStruct: UInt,
    docNameCtorArg: Pcwstr,
    recipientNameCtorArg: Pcwstr,
    recipientNumberCtorArg: Pcwstr,
    senderNameCtorArg: Pcwstr,
    senderCompanyCtorArg: Pcwstr,
    senderDeptCtorArg: Pcwstr,
    senderBillingCodeCtorArg: Pcwstr,
    reservedCtorArg: Pcwstr,
    drEmailAddressCtorArg: Pcwstr,
    outputFileNameCtorArg: Pcwstr,
) {
    public var docName: Pcwstr = docNameCtorArg
        internal set

    public var recipientName: Pcwstr = recipientNameCtorArg
        internal set

    public var recipientNumber: Pcwstr = recipientNumberCtorArg
        internal set

    public var senderName: Pcwstr = senderNameCtorArg
        internal set

    public var senderCompany: Pcwstr = senderCompanyCtorArg
        internal set

    public var senderDept: Pcwstr = senderDeptCtorArg
        internal set

    public var senderBillingCode: Pcwstr = senderBillingCodeCtorArg
        internal set

    public var reserved: Pcwstr = reservedCtorArg
        internal set

    public var drEmailAddress: Pcwstr = drEmailAddressCtorArg
        internal set

    public var outputFileName: Pcwstr = outputFileNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        docNameCtorArg = ConstPtr(0L),
        recipientNameCtorArg = ConstPtr(0L),
        recipientNumberCtorArg = ConstPtr(0L),
        senderNameCtorArg = ConstPtr(0L),
        senderCompanyCtorArg = ConstPtr(0L),
        senderDeptCtorArg = ConstPtr(0L),
        senderBillingCodeCtorArg = ConstPtr(0L),
        reservedCtorArg = ConstPtr(0L),
        drEmailAddressCtorArg = ConstPtr(0L),
        outputFileNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pcwstr = this.docName

    public operator fun component3(): Pcwstr = this.recipientName

    public operator fun component4(): Pcwstr = this.recipientNumber

    public operator fun component5(): Pcwstr = this.senderName

    public operator fun component6(): Pcwstr = this.senderCompany

    public operator fun component7(): Pcwstr = this.senderDept

    public operator fun component8(): Pcwstr = this.senderBillingCode

    public operator fun component9(): Pcwstr = this.reserved

    public operator fun component10(): Pcwstr = this.drEmailAddress

    public operator fun component11(): Pcwstr = this.outputFileName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, docName: Pcwstr = this.docName, recipientName: Pcwstr = this.recipientName, recipientNumber: Pcwstr = this.recipientNumber, senderName: Pcwstr = this.senderName, senderCompany: Pcwstr = this.senderCompany, senderDept: Pcwstr = this.senderDept, senderBillingCode: Pcwstr = this.senderBillingCode, reserved: Pcwstr = this.reserved, drEmailAddress: Pcwstr = this.drEmailAddress, outputFileName: Pcwstr = this.outputFileName): FaxPrintInfow = FaxPrintInfow(sizeOfStruct = sizeOfStruct, docNameCtorArg = docName, recipientNameCtorArg = recipientName, recipientNumberCtorArg = recipientNumber, senderNameCtorArg = senderName, senderCompanyCtorArg = senderCompany, senderDeptCtorArg = senderDept, senderBillingCodeCtorArg = senderBillingCode, reservedCtorArg = reserved, drEmailAddressCtorArg = drEmailAddress, outputFileNameCtorArg = outputFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxPrintInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.docName != other.docName) return false
        if (this.recipientName != other.recipientName) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.senderBillingCode != other.senderBillingCode) return false
        if (this.reserved != other.reserved) return false
        if (this.drEmailAddress != other.drEmailAddress) return false
        if (this.outputFileName != other.outputFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.docName.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.senderBillingCode.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.drEmailAddress.hashCode()
        result = 31 * result + this.outputFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            docName: Pcwstr = ConstPtr(0L),
            recipientName: Pcwstr = ConstPtr(0L),
            recipientNumber: Pcwstr = ConstPtr(0L),
            senderName: Pcwstr = ConstPtr(0L),
            senderCompany: Pcwstr = ConstPtr(0L),
            senderDept: Pcwstr = ConstPtr(0L),
            senderBillingCode: Pcwstr = ConstPtr(0L),
            reserved: Pcwstr = ConstPtr(0L),
            drEmailAddress: Pcwstr = ConstPtr(0L),
            outputFileName: Pcwstr = ConstPtr(0L),
        ): FaxPrintInfow =
            FaxPrintInfow(
                sizeOfStruct = sizeOfStruct,
                docNameCtorArg = docName,
                recipientNameCtorArg = recipientName,
                recipientNumberCtorArg = recipientNumber,
                senderNameCtorArg = senderName,
                senderCompanyCtorArg = senderCompany,
                senderDeptCtorArg = senderDept,
                senderBillingCodeCtorArg = senderBillingCode,
                reservedCtorArg = reserved,
                drEmailAddressCtorArg = drEmailAddress,
                outputFileNameCtorArg = outputFileName,
            )
    }
}

public class FaxReceive internal constructor(
    public var sizeOfStruct: UInt,
    fileNameCtorArg: Pwstr,
    receiverNameCtorArg: Pwstr,
    receiverNumberCtorArg: Pwstr,
    public var reserved: UIntArray,
) {
    public var fileName: Pwstr = fileNameCtorArg
        internal set

    public var receiverName: Pwstr = receiverNameCtorArg
        internal set

    public var receiverNumber: Pwstr = receiverNumberCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        fileNameCtorArg = MutPtr(0L),
        receiverNameCtorArg = MutPtr(0L),
        receiverNumberCtorArg = MutPtr(0L),
        reserved = UIntArray(4),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pwstr = this.fileName

    public operator fun component3(): Pwstr = this.receiverName

    public operator fun component4(): Pwstr = this.receiverNumber

    public operator fun component5(): UIntArray = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, fileName: Pwstr = this.fileName, receiverName: Pwstr = this.receiverName, receiverNumber: Pwstr = this.receiverNumber, reserved: UIntArray = this.reserved): FaxReceive = FaxReceive(sizeOfStruct = sizeOfStruct, fileNameCtorArg = fileName, receiverNameCtorArg = receiverName, receiverNumberCtorArg = receiverNumber, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxReceive) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.fileName != other.fileName) return false
        if (this.receiverName != other.receiverName) return false
        if (this.receiverNumber != other.receiverNumber) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.receiverName.hashCode()
        result = 31 * result + this.receiverNumber.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            fileName: Pwstr = MutPtr(0L),
            receiverName: Pwstr = MutPtr(0L),
            receiverNumber: Pwstr = MutPtr(0L),
            reserved: UIntArray = UIntArray(4),
        ): FaxReceive =
            FaxReceive(
                sizeOfStruct = sizeOfStruct,
                fileNameCtorArg = fileName,
                receiverNameCtorArg = receiverName,
                receiverNumberCtorArg = receiverNumber,
                reserved = reserved,
            )
    }
}

public class FaxRoute internal constructor(
    public var sizeOfStruct: UInt,
    public var jobId: UInt,
    public var elapsedTime: ULong,
    public var receiveTime: ULong,
    public var pageCount: UInt,
    csidCtorArg: Pcwstr,
    tsidCtorArg: Pcwstr,
    callerIdCtorArg: Pcwstr,
    routingInfoCtorArg: Pcwstr,
    receiverNameCtorArg: Pcwstr,
    receiverNumberCtorArg: Pcwstr,
    deviceNameCtorArg: Pcwstr,
    public var deviceId: UInt,
    routingInfoDataCtorArg: MutPtr<UByte>,
    public var routingInfoDataSize: UInt,
) {
    public var csid: Pcwstr = csidCtorArg
        internal set

    public var tsid: Pcwstr = tsidCtorArg
        internal set

    public var callerId: Pcwstr = callerIdCtorArg
        internal set

    public var routingInfo: Pcwstr = routingInfoCtorArg
        internal set

    public var receiverName: Pcwstr = receiverNameCtorArg
        internal set

    public var receiverNumber: Pcwstr = receiverNumberCtorArg
        internal set

    public var deviceName: Pcwstr = deviceNameCtorArg
        internal set

    public var routingInfoData: MutPtr<UByte> = routingInfoDataCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        jobId = 0u,
        elapsedTime = 0uL,
        receiveTime = 0uL,
        pageCount = 0u,
        csidCtorArg = ConstPtr(0L),
        tsidCtorArg = ConstPtr(0L),
        callerIdCtorArg = ConstPtr(0L),
        routingInfoCtorArg = ConstPtr(0L),
        receiverNameCtorArg = ConstPtr(0L),
        receiverNumberCtorArg = ConstPtr(0L),
        deviceNameCtorArg = ConstPtr(0L),
        deviceId = 0u,
        routingInfoDataCtorArg = MutPtr(0L),
        routingInfoDataSize = 0u,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.jobId

    public operator fun component3(): ULong = this.elapsedTime

    public operator fun component4(): ULong = this.receiveTime

    public operator fun component5(): UInt = this.pageCount

    public operator fun component6(): Pcwstr = this.csid

    public operator fun component7(): Pcwstr = this.tsid

    public operator fun component8(): Pcwstr = this.callerId

    public operator fun component9(): Pcwstr = this.routingInfo

    public operator fun component10(): Pcwstr = this.receiverName

    public operator fun component11(): Pcwstr = this.receiverNumber

    public operator fun component12(): Pcwstr = this.deviceName

    public operator fun component13(): UInt = this.deviceId

    public operator fun component14(): MutPtr<UByte> = this.routingInfoData

    public operator fun component15(): UInt = this.routingInfoDataSize

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, jobId: UInt = this.jobId, elapsedTime: ULong = this.elapsedTime, receiveTime: ULong = this.receiveTime, pageCount: UInt = this.pageCount, csid: Pcwstr = this.csid, tsid: Pcwstr = this.tsid, callerId: Pcwstr = this.callerId, routingInfo: Pcwstr = this.routingInfo, receiverName: Pcwstr = this.receiverName, receiverNumber: Pcwstr = this.receiverNumber, deviceName: Pcwstr = this.deviceName, deviceId: UInt = this.deviceId, routingInfoData: MutPtr<UByte> = this.routingInfoData, routingInfoDataSize: UInt = this.routingInfoDataSize): FaxRoute = FaxRoute(sizeOfStruct = sizeOfStruct, jobId = jobId, elapsedTime = elapsedTime, receiveTime = receiveTime, pageCount = pageCount, csidCtorArg = csid, tsidCtorArg = tsid, callerIdCtorArg = callerId, routingInfoCtorArg = routingInfo, receiverNameCtorArg = receiverName, receiverNumberCtorArg = receiverNumber, deviceNameCtorArg = deviceName, deviceId = deviceId, routingInfoDataCtorArg = routingInfoData, routingInfoDataSize = routingInfoDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxRoute) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.jobId != other.jobId) return false
        if (this.elapsedTime != other.elapsedTime) return false
        if (this.receiveTime != other.receiveTime) return false
        if (this.pageCount != other.pageCount) return false
        if (this.csid != other.csid) return false
        if (this.tsid != other.tsid) return false
        if (this.callerId != other.callerId) return false
        if (this.routingInfo != other.routingInfo) return false
        if (this.receiverName != other.receiverName) return false
        if (this.receiverNumber != other.receiverNumber) return false
        if (this.deviceName != other.deviceName) return false
        if (this.deviceId != other.deviceId) return false
        if (this.routingInfoData != other.routingInfoData) return false
        if (this.routingInfoDataSize != other.routingInfoDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.jobId.hashCode()
        result = 31 * result + this.elapsedTime.hashCode()
        result = 31 * result + this.receiveTime.hashCode()
        result = 31 * result + this.pageCount.hashCode()
        result = 31 * result + this.csid.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.callerId.hashCode()
        result = 31 * result + this.routingInfo.hashCode()
        result = 31 * result + this.receiverName.hashCode()
        result = 31 * result + this.receiverNumber.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.routingInfoData.hashCode()
        result = 31 * result + this.routingInfoDataSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            jobId: UInt = 0u,
            elapsedTime: ULong = 0uL,
            receiveTime: ULong = 0uL,
            pageCount: UInt = 0u,
            csid: Pcwstr = ConstPtr(0L),
            tsid: Pcwstr = ConstPtr(0L),
            callerId: Pcwstr = ConstPtr(0L),
            routingInfo: Pcwstr = ConstPtr(0L),
            receiverName: Pcwstr = ConstPtr(0L),
            receiverNumber: Pcwstr = ConstPtr(0L),
            deviceName: Pcwstr = ConstPtr(0L),
            deviceId: UInt = 0u,
            routingInfoData: MutPtr<UByte> = MutPtr(0L),
            routingInfoDataSize: UInt = 0u,
        ): FaxRoute =
            FaxRoute(
                sizeOfStruct = sizeOfStruct,
                jobId = jobId,
                elapsedTime = elapsedTime,
                receiveTime = receiveTime,
                pageCount = pageCount,
                csidCtorArg = csid,
                tsidCtorArg = tsid,
                callerIdCtorArg = callerId,
                routingInfoCtorArg = routingInfo,
                receiverNameCtorArg = receiverName,
                receiverNumberCtorArg = receiverNumber,
                deviceNameCtorArg = deviceName,
                deviceId = deviceId,
                routingInfoDataCtorArg = routingInfoData,
                routingInfoDataSize = routingInfoDataSize,
            )
    }
}

public data class FaxRouteCallbackroutines(
    public var sizeOfStruct: UInt = 0u,
    public var faxRouteAddFile: Pfaxrouteaddfile = null,
    public var faxRouteDeleteFile: Pfaxroutedeletefile = null,
    public var faxRouteGetFile: Pfaxroutegetfile = null,
    public var faxRouteEnumFiles: Pfaxrouteenumfiles = null,
    public var faxRouteModifyRoutingData: Pfaxroutemodifyroutingdata = null,
)

public class FaxRoutingMethoda internal constructor(
    public var sizeOfStruct: UInt,
    public var deviceId: UInt,
    public var enabled: Bool,
    deviceNameCtorArg: Pcstr,
    guidCtorArg: Pcstr,
    friendlyNameCtorArg: Pcstr,
    functionNameCtorArg: Pcstr,
    extensionImageNameCtorArg: Pcstr,
    extensionFriendlyNameCtorArg: Pcstr,
) {
    public var deviceName: Pcstr = deviceNameCtorArg
        internal set

    public var guid: Pcstr = guidCtorArg
        internal set

    public var friendlyName: Pcstr = friendlyNameCtorArg
        internal set

    public var functionName: Pcstr = functionNameCtorArg
        internal set

    public var extensionImageName: Pcstr = extensionImageNameCtorArg
        internal set

    public var extensionFriendlyName: Pcstr = extensionFriendlyNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        deviceId = 0u,
        enabled = 0,
        deviceNameCtorArg = ConstPtr(0L),
        guidCtorArg = ConstPtr(0L),
        friendlyNameCtorArg = ConstPtr(0L),
        functionNameCtorArg = ConstPtr(0L),
        extensionImageNameCtorArg = ConstPtr(0L),
        extensionFriendlyNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.deviceId

    public operator fun component3(): Bool = this.enabled

    public operator fun component4(): Pcstr = this.deviceName

    public operator fun component5(): Pcstr = this.guid

    public operator fun component6(): Pcstr = this.friendlyName

    public operator fun component7(): Pcstr = this.functionName

    public operator fun component8(): Pcstr = this.extensionImageName

    public operator fun component9(): Pcstr = this.extensionFriendlyName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, deviceId: UInt = this.deviceId, enabled: Bool = this.enabled, deviceName: Pcstr = this.deviceName, guid: Pcstr = this.guid, friendlyName: Pcstr = this.friendlyName, functionName: Pcstr = this.functionName, extensionImageName: Pcstr = this.extensionImageName, extensionFriendlyName: Pcstr = this.extensionFriendlyName): FaxRoutingMethoda = FaxRoutingMethoda(sizeOfStruct = sizeOfStruct, deviceId = deviceId, enabled = enabled, deviceNameCtorArg = deviceName, guidCtorArg = guid, friendlyNameCtorArg = friendlyName, functionNameCtorArg = functionName, extensionImageNameCtorArg = extensionImageName, extensionFriendlyNameCtorArg = extensionFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxRoutingMethoda) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.deviceId != other.deviceId) return false
        if (this.enabled != other.enabled) return false
        if (this.deviceName != other.deviceName) return false
        if (this.guid != other.guid) return false
        if (this.friendlyName != other.friendlyName) return false
        if (this.functionName != other.functionName) return false
        if (this.extensionImageName != other.extensionImageName) return false
        if (this.extensionFriendlyName != other.extensionFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.friendlyName.hashCode()
        result = 31 * result + this.functionName.hashCode()
        result = 31 * result + this.extensionImageName.hashCode()
        result = 31 * result + this.extensionFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            deviceId: UInt = 0u,
            enabled: Bool = 0,
            deviceName: Pcstr = ConstPtr(0L),
            guid: Pcstr = ConstPtr(0L),
            friendlyName: Pcstr = ConstPtr(0L),
            functionName: Pcstr = ConstPtr(0L),
            extensionImageName: Pcstr = ConstPtr(0L),
            extensionFriendlyName: Pcstr = ConstPtr(0L),
        ): FaxRoutingMethoda =
            FaxRoutingMethoda(
                sizeOfStruct = sizeOfStruct,
                deviceId = deviceId,
                enabled = enabled,
                deviceNameCtorArg = deviceName,
                guidCtorArg = guid,
                friendlyNameCtorArg = friendlyName,
                functionNameCtorArg = functionName,
                extensionImageNameCtorArg = extensionImageName,
                extensionFriendlyNameCtorArg = extensionFriendlyName,
            )
    }
}

public class FaxRoutingMethodw internal constructor(
    public var sizeOfStruct: UInt,
    public var deviceId: UInt,
    public var enabled: Bool,
    deviceNameCtorArg: Pcwstr,
    guidCtorArg: Pcwstr,
    friendlyNameCtorArg: Pcwstr,
    functionNameCtorArg: Pcwstr,
    extensionImageNameCtorArg: Pcwstr,
    extensionFriendlyNameCtorArg: Pcwstr,
) {
    public var deviceName: Pcwstr = deviceNameCtorArg
        internal set

    public var guid: Pcwstr = guidCtorArg
        internal set

    public var friendlyName: Pcwstr = friendlyNameCtorArg
        internal set

    public var functionName: Pcwstr = functionNameCtorArg
        internal set

    public var extensionImageName: Pcwstr = extensionImageNameCtorArg
        internal set

    public var extensionFriendlyName: Pcwstr = extensionFriendlyNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        deviceId = 0u,
        enabled = 0,
        deviceNameCtorArg = ConstPtr(0L),
        guidCtorArg = ConstPtr(0L),
        friendlyNameCtorArg = ConstPtr(0L),
        functionNameCtorArg = ConstPtr(0L),
        extensionImageNameCtorArg = ConstPtr(0L),
        extensionFriendlyNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.deviceId

    public operator fun component3(): Bool = this.enabled

    public operator fun component4(): Pcwstr = this.deviceName

    public operator fun component5(): Pcwstr = this.guid

    public operator fun component6(): Pcwstr = this.friendlyName

    public operator fun component7(): Pcwstr = this.functionName

    public operator fun component8(): Pcwstr = this.extensionImageName

    public operator fun component9(): Pcwstr = this.extensionFriendlyName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, deviceId: UInt = this.deviceId, enabled: Bool = this.enabled, deviceName: Pcwstr = this.deviceName, guid: Pcwstr = this.guid, friendlyName: Pcwstr = this.friendlyName, functionName: Pcwstr = this.functionName, extensionImageName: Pcwstr = this.extensionImageName, extensionFriendlyName: Pcwstr = this.extensionFriendlyName): FaxRoutingMethodw = FaxRoutingMethodw(sizeOfStruct = sizeOfStruct, deviceId = deviceId, enabled = enabled, deviceNameCtorArg = deviceName, guidCtorArg = guid, friendlyNameCtorArg = friendlyName, functionNameCtorArg = functionName, extensionImageNameCtorArg = extensionImageName, extensionFriendlyNameCtorArg = extensionFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxRoutingMethodw) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.deviceId != other.deviceId) return false
        if (this.enabled != other.enabled) return false
        if (this.deviceName != other.deviceName) return false
        if (this.guid != other.guid) return false
        if (this.friendlyName != other.friendlyName) return false
        if (this.functionName != other.functionName) return false
        if (this.extensionImageName != other.extensionImageName) return false
        if (this.extensionFriendlyName != other.extensionFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.friendlyName.hashCode()
        result = 31 * result + this.functionName.hashCode()
        result = 31 * result + this.extensionImageName.hashCode()
        result = 31 * result + this.extensionFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            deviceId: UInt = 0u,
            enabled: Bool = 0,
            deviceName: Pcwstr = ConstPtr(0L),
            guid: Pcwstr = ConstPtr(0L),
            friendlyName: Pcwstr = ConstPtr(0L),
            functionName: Pcwstr = ConstPtr(0L),
            extensionImageName: Pcwstr = ConstPtr(0L),
            extensionFriendlyName: Pcwstr = ConstPtr(0L),
        ): FaxRoutingMethodw =
            FaxRoutingMethodw(
                sizeOfStruct = sizeOfStruct,
                deviceId = deviceId,
                enabled = enabled,
                deviceNameCtorArg = deviceName,
                guidCtorArg = guid,
                friendlyNameCtorArg = friendlyName,
                functionNameCtorArg = functionName,
                extensionImageNameCtorArg = extensionImageName,
                extensionFriendlyNameCtorArg = extensionFriendlyName,
            )
    }
}

public class FaxSend internal constructor(
    public var sizeOfStruct: UInt,
    fileNameCtorArg: Pwstr,
    callerNameCtorArg: Pwstr,
    callerNumberCtorArg: Pwstr,
    receiverNameCtorArg: Pwstr,
    receiverNumberCtorArg: Pwstr,
    public var branding: Bool,
    public var callHandle: UInt,
    public var reserved: UIntArray,
) {
    public var fileName: Pwstr = fileNameCtorArg
        internal set

    public var callerName: Pwstr = callerNameCtorArg
        internal set

    public var callerNumber: Pwstr = callerNumberCtorArg
        internal set

    public var receiverName: Pwstr = receiverNameCtorArg
        internal set

    public var receiverNumber: Pwstr = receiverNumberCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        fileNameCtorArg = MutPtr(0L),
        callerNameCtorArg = MutPtr(0L),
        callerNumberCtorArg = MutPtr(0L),
        receiverNameCtorArg = MutPtr(0L),
        receiverNumberCtorArg = MutPtr(0L),
        branding = 0,
        callHandle = 0u,
        reserved = UIntArray(3),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pwstr = this.fileName

    public operator fun component3(): Pwstr = this.callerName

    public operator fun component4(): Pwstr = this.callerNumber

    public operator fun component5(): Pwstr = this.receiverName

    public operator fun component6(): Pwstr = this.receiverNumber

    public operator fun component7(): Bool = this.branding

    public operator fun component8(): UInt = this.callHandle

    public operator fun component9(): UIntArray = this.reserved

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, fileName: Pwstr = this.fileName, callerName: Pwstr = this.callerName, callerNumber: Pwstr = this.callerNumber, receiverName: Pwstr = this.receiverName, receiverNumber: Pwstr = this.receiverNumber, branding: Bool = this.branding, callHandle: UInt = this.callHandle, reserved: UIntArray = this.reserved): FaxSend = FaxSend(sizeOfStruct = sizeOfStruct, fileNameCtorArg = fileName, callerNameCtorArg = callerName, callerNumberCtorArg = callerNumber, receiverNameCtorArg = receiverName, receiverNumberCtorArg = receiverNumber, branding = branding, callHandle = callHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxSend) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.fileName != other.fileName) return false
        if (this.callerName != other.callerName) return false
        if (this.callerNumber != other.callerNumber) return false
        if (this.receiverName != other.receiverName) return false
        if (this.receiverNumber != other.receiverNumber) return false
        if (this.branding != other.branding) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.callerName.hashCode()
        result = 31 * result + this.callerNumber.hashCode()
        result = 31 * result + this.receiverName.hashCode()
        result = 31 * result + this.receiverNumber.hashCode()
        result = 31 * result + this.branding.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            fileName: Pwstr = MutPtr(0L),
            callerName: Pwstr = MutPtr(0L),
            callerNumber: Pwstr = MutPtr(0L),
            receiverName: Pwstr = MutPtr(0L),
            receiverNumber: Pwstr = MutPtr(0L),
            branding: Bool = 0,
            callHandle: UInt = 0u,
            reserved: UIntArray = UIntArray(3),
        ): FaxSend =
            FaxSend(
                sizeOfStruct = sizeOfStruct,
                fileNameCtorArg = fileName,
                callerNameCtorArg = callerName,
                callerNumberCtorArg = callerNumber,
                receiverNameCtorArg = receiverName,
                receiverNumberCtorArg = receiverNumber,
                branding = branding,
                callHandle = callHandle,
                reserved = reserved,
            )
    }
}

public data class FaxTime(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaxTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaxTime> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): FaxTime =
                    FaxTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FaxTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minute)
                }
            }
    }
}

public data class Stinotify(
    public var dwSize: UInt = 0u,
    public var guidNotificationCode: Guid = Guid(),
    public var abNotificationData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stinotify) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidNotificationCode != other.guidNotificationCode) return false
        if (!this.abNotificationData.contentEquals(other.abNotificationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidNotificationCode.hashCode()
        result = 31 * result + this.abNotificationData.contentHashCode()
        return result
    }
}

public class Stisubscribe internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwFilter: UInt,
    hWndNotifyCtorArg: Hwnd,
    hEventCtorArg: Handle,
    public var uiNotificationMessage: UInt,
) {
    public var hWndNotify: Hwnd = hWndNotifyCtorArg
        internal set

    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwFilter = 0u,
        hWndNotifyCtorArg = MutPtr(0L),
        hEventCtorArg = MutPtr(0L),
        uiNotificationMessage = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwFilter

    public operator fun component4(): Hwnd = this.hWndNotify

    public operator fun component5(): Handle = this.hEvent

    public operator fun component6(): UInt = this.uiNotificationMessage

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwFilter: UInt = this.dwFilter, hWndNotify: Hwnd = this.hWndNotify, hEvent: Handle = this.hEvent, uiNotificationMessage: UInt = this.uiNotificationMessage): Stisubscribe = Stisubscribe(dwSize = dwSize, dwFlags = dwFlags, dwFilter = dwFilter, hWndNotifyCtorArg = hWndNotify, hEventCtorArg = hEvent, uiNotificationMessage = uiNotificationMessage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stisubscribe) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwFilter != other.dwFilter) return false
        if (this.hWndNotify != other.hWndNotify) return false
        if (this.hEvent != other.hEvent) return false
        if (this.uiNotificationMessage != other.uiNotificationMessage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwFilter.hashCode()
        result = 31 * result + this.hWndNotify.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        result = 31 * result + this.uiNotificationMessage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwFilter: UInt = 0u,
            hWndNotify: Hwnd = MutPtr(0L),
            hEvent: Handle = MutPtr(0L),
            uiNotificationMessage: UInt = 0u,
        ): Stisubscribe =
            Stisubscribe(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwFilter = dwFilter,
                hWndNotifyCtorArg = hWndNotify,
                hEventCtorArg = hEvent,
                uiNotificationMessage = uiNotificationMessage,
            )
    }
}

public class StiDeviceInformationw internal constructor(
    public var dwSize: UInt,
    public var deviceType: UInt,
    public var szDeviceInternalName: UShortArray,
    public var deviceCapabilitiesA: StiDevCaps,
    public var dwHardwareConfiguration: UInt,
    pszVendorDescriptionCtorArg: Pwstr,
    pszDeviceDescriptionCtorArg: Pwstr,
    pszPortNameCtorArg: Pwstr,
    pszPropProviderCtorArg: Pwstr,
    pszLocalNameCtorArg: Pwstr,
) {
    public var pszVendorDescription: Pwstr = pszVendorDescriptionCtorArg
        internal set

    public var pszDeviceDescription: Pwstr = pszDeviceDescriptionCtorArg
        internal set

    public var pszPortName: Pwstr = pszPortNameCtorArg
        internal set

    public var pszPropProvider: Pwstr = pszPropProviderCtorArg
        internal set

    public var pszLocalName: Pwstr = pszLocalNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        deviceType = 0u,
        szDeviceInternalName = UShortArray(128),
        deviceCapabilitiesA = StiDevCaps(),
        dwHardwareConfiguration = 0u,
        pszVendorDescriptionCtorArg = MutPtr(0L),
        pszDeviceDescriptionCtorArg = MutPtr(0L),
        pszPortNameCtorArg = MutPtr(0L),
        pszPropProviderCtorArg = MutPtr(0L),
        pszLocalNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.deviceType

    public operator fun component3(): UShortArray = this.szDeviceInternalName

    public operator fun component4(): StiDevCaps = this.deviceCapabilitiesA

    public operator fun component5(): UInt = this.dwHardwareConfiguration

    public operator fun component6(): Pwstr = this.pszVendorDescription

    public operator fun component7(): Pwstr = this.pszDeviceDescription

    public operator fun component8(): Pwstr = this.pszPortName

    public operator fun component9(): Pwstr = this.pszPropProvider

    public operator fun component10(): Pwstr = this.pszLocalName

    public fun copy(dwSize: UInt = this.dwSize, deviceType: UInt = this.deviceType, szDeviceInternalName: UShortArray = this.szDeviceInternalName, deviceCapabilitiesA: StiDevCaps = this.deviceCapabilitiesA, dwHardwareConfiguration: UInt = this.dwHardwareConfiguration, pszVendorDescription: Pwstr = this.pszVendorDescription, pszDeviceDescription: Pwstr = this.pszDeviceDescription, pszPortName: Pwstr = this.pszPortName, pszPropProvider: Pwstr = this.pszPropProvider, pszLocalName: Pwstr = this.pszLocalName): StiDeviceInformationw = StiDeviceInformationw(dwSize = dwSize, deviceType = deviceType, szDeviceInternalName = szDeviceInternalName, deviceCapabilitiesA = deviceCapabilitiesA, dwHardwareConfiguration = dwHardwareConfiguration, pszVendorDescriptionCtorArg = pszVendorDescription, pszDeviceDescriptionCtorArg = pszDeviceDescription, pszPortNameCtorArg = pszPortName, pszPropProviderCtorArg = pszPropProvider, pszLocalNameCtorArg = pszLocalName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StiDeviceInformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.deviceType != other.deviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.dwHardwareConfiguration != other.dwHardwareConfiguration) return false
        if (this.pszVendorDescription != other.pszVendorDescription) return false
        if (this.pszDeviceDescription != other.pszDeviceDescription) return false
        if (this.pszPortName != other.pszPortName) return false
        if (this.pszPropProvider != other.pszPropProvider) return false
        if (this.pszLocalName != other.pszLocalName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.dwHardwareConfiguration.hashCode()
        result = 31 * result + this.pszVendorDescription.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszPortName.hashCode()
        result = 31 * result + this.pszPropProvider.hashCode()
        result = 31 * result + this.pszLocalName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            deviceType: UInt = 0u,
            szDeviceInternalName: UShortArray = UShortArray(128),
            deviceCapabilitiesA: StiDevCaps = StiDevCaps(),
            dwHardwareConfiguration: UInt = 0u,
            pszVendorDescription: Pwstr = MutPtr(0L),
            pszDeviceDescription: Pwstr = MutPtr(0L),
            pszPortName: Pwstr = MutPtr(0L),
            pszPropProvider: Pwstr = MutPtr(0L),
            pszLocalName: Pwstr = MutPtr(0L),
        ): StiDeviceInformationw =
            StiDeviceInformationw(
                dwSize = dwSize,
                deviceType = deviceType,
                szDeviceInternalName = szDeviceInternalName,
                deviceCapabilitiesA = deviceCapabilitiesA,
                dwHardwareConfiguration = dwHardwareConfiguration,
                pszVendorDescriptionCtorArg = pszVendorDescription,
                pszDeviceDescriptionCtorArg = pszDeviceDescription,
                pszPortNameCtorArg = pszPortName,
                pszPropProviderCtorArg = pszPropProvider,
                pszLocalNameCtorArg = pszLocalName,
            )
    }
}

public data class StiDeviceStatus(
    public var dwSize: UInt = 0u,
    public var statusMask: UInt = 0u,
    public var dwOnlineState: UInt = 0u,
    public var dwHardwareStatusCode: UInt = 0u,
    public var dwEventHandlingState: UInt = 0u,
    public var dwPollingInterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDeviceStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDeviceStatus> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): StiDeviceStatus =
                    StiDeviceStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: StiDeviceStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOnlineState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHardwareStatusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwEventHandlingState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPollingInterval)
                }
            }
    }
}

public data class StiDevCaps(
    public var dwGeneric: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDevCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDevCaps> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): StiDevCaps =
                    StiDevCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StiDevCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGeneric)
                }
            }
    }
}

public data class StiDiag(
    public var dwSize: UInt = 0u,
    public var dwBasicDiagCode: UInt = 0u,
    public var dwVendorDiagCode: UInt = 0u,
    public var dwStatusMask: UInt = 0u,
    public var sErrorInfo: ErrorInfow = ErrorInfow(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDiag> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiDiag> {
                override val sizeBytes: Long = 540L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): StiDiag =
                    StiDiag(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (ErrorInfow.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StiDiag) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBasicDiagCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVendorDiagCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStatusMask)
                    (ErrorInfow.typeLayout()).writeNative(addr + 16L, value.sErrorInfo)
                }
            }
    }
}

public data class StiUsdCaps(
    public var dwVersion: UInt = 0u,
    public var dwGenericCaps: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiUsdCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StiUsdCaps> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): StiUsdCaps =
                    StiUsdCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StiUsdCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGenericCaps)
                }
            }
    }
}

public class StiWiaDeviceInformationw internal constructor(
    public var dwSize: UInt,
    public var deviceType: UInt,
    public var szDeviceInternalName: UShortArray,
    public var deviceCapabilitiesA: StiDevCaps,
    public var dwHardwareConfiguration: UInt,
    pszVendorDescriptionCtorArg: Pwstr,
    pszDeviceDescriptionCtorArg: Pwstr,
    pszPortNameCtorArg: Pwstr,
    pszPropProviderCtorArg: Pwstr,
    pszLocalNameCtorArg: Pwstr,
    pszUiDllCtorArg: Pwstr,
    pszServerCtorArg: Pwstr,
) {
    public var pszVendorDescription: Pwstr = pszVendorDescriptionCtorArg
        internal set

    public var pszDeviceDescription: Pwstr = pszDeviceDescriptionCtorArg
        internal set

    public var pszPortName: Pwstr = pszPortNameCtorArg
        internal set

    public var pszPropProvider: Pwstr = pszPropProviderCtorArg
        internal set

    public var pszLocalName: Pwstr = pszLocalNameCtorArg
        internal set

    public var pszUiDll: Pwstr = pszUiDllCtorArg
        internal set

    public var pszServer: Pwstr = pszServerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        deviceType = 0u,
        szDeviceInternalName = UShortArray(128),
        deviceCapabilitiesA = StiDevCaps(),
        dwHardwareConfiguration = 0u,
        pszVendorDescriptionCtorArg = MutPtr(0L),
        pszDeviceDescriptionCtorArg = MutPtr(0L),
        pszPortNameCtorArg = MutPtr(0L),
        pszPropProviderCtorArg = MutPtr(0L),
        pszLocalNameCtorArg = MutPtr(0L),
        pszUiDllCtorArg = MutPtr(0L),
        pszServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.deviceType

    public operator fun component3(): UShortArray = this.szDeviceInternalName

    public operator fun component4(): StiDevCaps = this.deviceCapabilitiesA

    public operator fun component5(): UInt = this.dwHardwareConfiguration

    public operator fun component6(): Pwstr = this.pszVendorDescription

    public operator fun component7(): Pwstr = this.pszDeviceDescription

    public operator fun component8(): Pwstr = this.pszPortName

    public operator fun component9(): Pwstr = this.pszPropProvider

    public operator fun component10(): Pwstr = this.pszLocalName

    public operator fun component11(): Pwstr = this.pszUiDll

    public operator fun component12(): Pwstr = this.pszServer

    public fun copy(dwSize: UInt = this.dwSize, deviceType: UInt = this.deviceType, szDeviceInternalName: UShortArray = this.szDeviceInternalName, deviceCapabilitiesA: StiDevCaps = this.deviceCapabilitiesA, dwHardwareConfiguration: UInt = this.dwHardwareConfiguration, pszVendorDescription: Pwstr = this.pszVendorDescription, pszDeviceDescription: Pwstr = this.pszDeviceDescription, pszPortName: Pwstr = this.pszPortName, pszPropProvider: Pwstr = this.pszPropProvider, pszLocalName: Pwstr = this.pszLocalName, pszUiDll: Pwstr = this.pszUiDll, pszServer: Pwstr = this.pszServer): StiWiaDeviceInformationw = StiWiaDeviceInformationw(dwSize = dwSize, deviceType = deviceType, szDeviceInternalName = szDeviceInternalName, deviceCapabilitiesA = deviceCapabilitiesA, dwHardwareConfiguration = dwHardwareConfiguration, pszVendorDescriptionCtorArg = pszVendorDescription, pszDeviceDescriptionCtorArg = pszDeviceDescription, pszPortNameCtorArg = pszPortName, pszPropProviderCtorArg = pszPropProvider, pszLocalNameCtorArg = pszLocalName, pszUiDllCtorArg = pszUiDll, pszServerCtorArg = pszServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StiWiaDeviceInformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.deviceType != other.deviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.dwHardwareConfiguration != other.dwHardwareConfiguration) return false
        if (this.pszVendorDescription != other.pszVendorDescription) return false
        if (this.pszDeviceDescription != other.pszDeviceDescription) return false
        if (this.pszPortName != other.pszPortName) return false
        if (this.pszPropProvider != other.pszPropProvider) return false
        if (this.pszLocalName != other.pszLocalName) return false
        if (this.pszUiDll != other.pszUiDll) return false
        if (this.pszServer != other.pszServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.dwHardwareConfiguration.hashCode()
        result = 31 * result + this.pszVendorDescription.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszPortName.hashCode()
        result = 31 * result + this.pszPropProvider.hashCode()
        result = 31 * result + this.pszLocalName.hashCode()
        result = 31 * result + this.pszUiDll.hashCode()
        result = 31 * result + this.pszServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            deviceType: UInt = 0u,
            szDeviceInternalName: UShortArray = UShortArray(128),
            deviceCapabilitiesA: StiDevCaps = StiDevCaps(),
            dwHardwareConfiguration: UInt = 0u,
            pszVendorDescription: Pwstr = MutPtr(0L),
            pszDeviceDescription: Pwstr = MutPtr(0L),
            pszPortName: Pwstr = MutPtr(0L),
            pszPropProvider: Pwstr = MutPtr(0L),
            pszLocalName: Pwstr = MutPtr(0L),
            pszUiDll: Pwstr = MutPtr(0L),
            pszServer: Pwstr = MutPtr(0L),
        ): StiWiaDeviceInformationw =
            StiWiaDeviceInformationw(
                dwSize = dwSize,
                deviceType = deviceType,
                szDeviceInternalName = szDeviceInternalName,
                deviceCapabilitiesA = deviceCapabilitiesA,
                dwHardwareConfiguration = dwHardwareConfiguration,
                pszVendorDescriptionCtorArg = pszVendorDescription,
                pszDeviceDescriptionCtorArg = pszDeviceDescription,
                pszPortNameCtorArg = pszPortName,
                pszPropProviderCtorArg = pszPropProvider,
                pszLocalNameCtorArg = pszLocalName,
                pszUiDllCtorArg = pszUiDll,
                pszServerCtorArg = pszServer,
            )
    }
}

public data class ErrorInfow(
    public var dwSize: UInt = 0u,
    public var dwGenericError: UInt = 0u,
    public var dwVendorError: UInt = 0u,
    public var szExtendedErrorText: UShortArray = UShortArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ErrorInfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwGenericError != other.dwGenericError) return false
        if (this.dwVendorError != other.dwVendorError) return false
        if (!this.szExtendedErrorText.contentEquals(other.szExtendedErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwGenericError.hashCode()
        result = 31 * result + this.dwVendorError.hashCode()
        result = 31 * result + this.szExtendedErrorText.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrorInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrorInfow> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ErrorInfow =
                    ErrorInfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ErrorInfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGenericError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVendorError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                    ).writeNative(addr + 12L, value.szExtendedErrorText)
                }
            }
    }
}
