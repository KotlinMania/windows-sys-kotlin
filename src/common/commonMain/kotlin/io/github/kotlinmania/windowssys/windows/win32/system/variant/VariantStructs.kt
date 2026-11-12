package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public data class Variant(
    public var anonymous: Variant0 = Variant0(),
)

public data class Variant0(
    public var anonymous: Variant00 = Variant00(),
    public var decVal: Decimal = Decimal(),
)

public data class Variant00(
    public var vt: Varenum = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: Variant000 = Variant000(),
)

public class Variant000 internal constructor(
    public var llVal: Long,
    public var lVal: Int,
    public var bVal: UByte,
    public var iVal: Short,
    public var fltVal: Float,
    public var dblVal: Double,
    public var boolVal: VariantBool,
    public var obsoleteVariantBool: VariantBool,
    public var scode: Int,
    public var cyVal: CY,
    public var date: Double,
    bstrValCtorArg: Bstr,
    punkValCtorArg: MutPtr,
    pdispValCtorArg: MutPtr,
    parrayCtorArg: MutPtr,
    pbValCtorArg: MutPtr,
    piValCtorArg: MutPtr,
    plValCtorArg: MutPtr,
    pllValCtorArg: MutPtr,
    pfltValCtorArg: MutPtr,
    pdblValCtorArg: MutPtr,
    pboolValCtorArg: MutPtr,
    obsoleteVariantPboolCtorArg: MutPtr,
    pscodeCtorArg: MutPtr,
    pcyValCtorArg: MutPtr,
    pdateCtorArg: MutPtr,
    pbstrValCtorArg: MutPtr,
    ppunkValCtorArg: MutPtr,
    ppdispValCtorArg: MutPtr,
    pparrayCtorArg: MutPtr,
    pvarValCtorArg: MutPtr,
    byrefCtorArg: MutPtr,
    public var cVal: Byte,
    public var uiVal: UShort,
    public var ulVal: UInt,
    public var ullVal: ULong,
    public var intVal: Int,
    public var uintVal: UInt,
    pdecValCtorArg: MutPtr,
    pcValCtorArg: Pstr,
    puiValCtorArg: MutPtr,
    pulValCtorArg: MutPtr,
    pullValCtorArg: MutPtr,
    pintValCtorArg: MutPtr,
    puintValCtorArg: MutPtr,
    public var anonymous: Variant0000,
) {
    public var bstrVal: Bstr = bstrValCtorArg
        internal set

    public var punkVal: MutPtr = punkValCtorArg
        internal set

    public var pdispVal: MutPtr = pdispValCtorArg
        internal set

    public var parray: MutPtr = parrayCtorArg
        internal set

    public var pbVal: MutPtr = pbValCtorArg
        internal set

    public var piVal: MutPtr = piValCtorArg
        internal set

    public var plVal: MutPtr = plValCtorArg
        internal set

    public var pllVal: MutPtr = pllValCtorArg
        internal set

    public var pfltVal: MutPtr = pfltValCtorArg
        internal set

    public var pdblVal: MutPtr = pdblValCtorArg
        internal set

    public var pboolVal: MutPtr = pboolValCtorArg
        internal set

    public var obsoleteVariantPbool: MutPtr = obsoleteVariantPboolCtorArg
        internal set

    public var pscode: MutPtr = pscodeCtorArg
        internal set

    public var pcyVal: MutPtr = pcyValCtorArg
        internal set

    public var pdate: MutPtr = pdateCtorArg
        internal set

    public var pbstrVal: MutPtr = pbstrValCtorArg
        internal set

    public var ppunkVal: MutPtr = ppunkValCtorArg
        internal set

    public var ppdispVal: MutPtr = ppdispValCtorArg
        internal set

    public var pparray: MutPtr = pparrayCtorArg
        internal set

    public var pvarVal: MutPtr = pvarValCtorArg
        internal set

    public var byref: MutPtr = byrefCtorArg
        internal set

    public var pdecVal: MutPtr = pdecValCtorArg
        internal set

    public var pcVal: Pstr = pcValCtorArg
        internal set

    public var puiVal: MutPtr = puiValCtorArg
        internal set

    public var pulVal: MutPtr = pulValCtorArg
        internal set

    public var pullVal: MutPtr = pullValCtorArg
        internal set

    public var pintVal: MutPtr = pintValCtorArg
        internal set

    public var puintVal: MutPtr = puintValCtorArg
        internal set

    public constructor() : this(
        llVal = 0L,
        lVal = 0,
        bVal = 0u,
        iVal = 0,
        fltVal = 0.0f,
        dblVal = 0.0,
        boolVal = 0,
        obsoleteVariantBool = 0,
        scode = 0,
        cyVal = CY(),
        date = 0.0,
        bstrValCtorArg = ConstPtr(0L),
        punkValCtorArg = MutPtr(0L),
        pdispValCtorArg = MutPtr(0L),
        parrayCtorArg = MutPtr(0L),
        pbValCtorArg = MutPtr(0L),
        piValCtorArg = MutPtr(0L),
        plValCtorArg = MutPtr(0L),
        pllValCtorArg = MutPtr(0L),
        pfltValCtorArg = MutPtr(0L),
        pdblValCtorArg = MutPtr(0L),
        pboolValCtorArg = MutPtr(0L),
        obsoleteVariantPboolCtorArg = MutPtr(0L),
        pscodeCtorArg = MutPtr(0L),
        pcyValCtorArg = MutPtr(0L),
        pdateCtorArg = MutPtr(0L),
        pbstrValCtorArg = MutPtr(0L),
        ppunkValCtorArg = MutPtr(0L),
        ppdispValCtorArg = MutPtr(0L),
        pparrayCtorArg = MutPtr(0L),
        pvarValCtorArg = MutPtr(0L),
        byrefCtorArg = MutPtr(0L),
        cVal = 0,
        uiVal = 0u,
        ulVal = 0u,
        ullVal = 0uL,
        intVal = 0,
        uintVal = 0u,
        pdecValCtorArg = MutPtr(0L),
        pcValCtorArg = MutPtr(0L),
        puiValCtorArg = MutPtr(0L),
        pulValCtorArg = MutPtr(0L),
        pullValCtorArg = MutPtr(0L),
        pintValCtorArg = MutPtr(0L),
        puintValCtorArg = MutPtr(0L),
        anonymous = Variant0000(),
    )

    public companion object {
        public operator fun invoke(
            llVal: Long = 0L,
            lVal: Int = 0,
            bVal: UByte = 0u,
            iVal: Short = 0,
            fltVal: Float = 0.0f,
            dblVal: Double = 0.0,
            boolVal: VariantBool = 0,
            obsoleteVariantBool: VariantBool = 0,
            scode: Int = 0,
            cyVal: CY = CY(),
            date: Double = 0.0,
            bstrVal: Bstr = ConstPtr(0L),
            punkVal: MutPtr = MutPtr(0L),
            pdispVal: MutPtr = MutPtr(0L),
            parray: MutPtr = MutPtr(0L),
            pbVal: MutPtr = MutPtr(0L),
            piVal: MutPtr = MutPtr(0L),
            plVal: MutPtr = MutPtr(0L),
            pllVal: MutPtr = MutPtr(0L),
            pfltVal: MutPtr = MutPtr(0L),
            pdblVal: MutPtr = MutPtr(0L),
            pboolVal: MutPtr = MutPtr(0L),
            obsoleteVariantPbool: MutPtr = MutPtr(0L),
            pscode: MutPtr = MutPtr(0L),
            pcyVal: MutPtr = MutPtr(0L),
            pdate: MutPtr = MutPtr(0L),
            pbstrVal: MutPtr = MutPtr(0L),
            ppunkVal: MutPtr = MutPtr(0L),
            ppdispVal: MutPtr = MutPtr(0L),
            pparray: MutPtr = MutPtr(0L),
            pvarVal: MutPtr = MutPtr(0L),
            byref: MutPtr = MutPtr(0L),
            cVal: Byte = 0,
            uiVal: UShort = 0u,
            ulVal: UInt = 0u,
            ullVal: ULong = 0uL,
            intVal: Int = 0,
            uintVal: UInt = 0u,
            pdecVal: MutPtr = MutPtr(0L),
            pcVal: Pstr = MutPtr(0L),
            puiVal: MutPtr = MutPtr(0L),
            pulVal: MutPtr = MutPtr(0L),
            pullVal: MutPtr = MutPtr(0L),
            pintVal: MutPtr = MutPtr(0L),
            puintVal: MutPtr = MutPtr(0L),
            anonymous: Variant0000 = Variant0000(),
        ): Variant000 =
            Variant000(
                llVal = llVal,
                lVal = lVal,
                bVal = bVal,
                iVal = iVal,
                fltVal = fltVal,
                dblVal = dblVal,
                boolVal = boolVal,
                obsoleteVariantBool = obsoleteVariantBool,
                scode = scode,
                cyVal = cyVal,
                date = date,
                bstrValCtorArg = bstrVal,
                punkValCtorArg = punkVal,
                pdispValCtorArg = pdispVal,
                parrayCtorArg = parray,
                pbValCtorArg = pbVal,
                piValCtorArg = piVal,
                plValCtorArg = plVal,
                pllValCtorArg = pllVal,
                pfltValCtorArg = pfltVal,
                pdblValCtorArg = pdblVal,
                pboolValCtorArg = pboolVal,
                obsoleteVariantPboolCtorArg = obsoleteVariantPbool,
                pscodeCtorArg = pscode,
                pcyValCtorArg = pcyVal,
                pdateCtorArg = pdate,
                pbstrValCtorArg = pbstrVal,
                ppunkValCtorArg = ppunkVal,
                ppdispValCtorArg = ppdispVal,
                pparrayCtorArg = pparray,
                pvarValCtorArg = pvarVal,
                byrefCtorArg = byref,
                cVal = cVal,
                uiVal = uiVal,
                ulVal = ulVal,
                ullVal = ullVal,
                intVal = intVal,
                uintVal = uintVal,
                pdecValCtorArg = pdecVal,
                pcValCtorArg = pcVal,
                puiValCtorArg = puiVal,
                pulValCtorArg = pulVal,
                pullValCtorArg = pullVal,
                pintValCtorArg = pintVal,
                puintValCtorArg = puintVal,
                anonymous = anonymous,
            )
    }
}

public class Variant0000 internal constructor(
    pvRecordCtorArg: MutPtr,
    pRecInfoCtorArg: MutPtr,
) {
    public var pvRecord: MutPtr = pvRecordCtorArg
        internal set

    public var pRecInfo: MutPtr = pRecInfoCtorArg
        internal set

    public constructor() : this(
        pvRecordCtorArg = MutPtr(0L),
        pRecInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pvRecord

    public operator fun component2(): MutPtr = this.pRecInfo

    public fun copy(pvRecord: MutPtr = this.pvRecord, pRecInfo: MutPtr = this.pRecInfo): Variant0000 = Variant0000(pvRecordCtorArg = pvRecord, pRecInfoCtorArg = pRecInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Variant0000) return false
        if (this.pvRecord != other.pvRecord) return false
        if (this.pRecInfo != other.pRecInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvRecord.hashCode()
        result = 31 * result + this.pRecInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Variant0000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Variant0000> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Variant0000 =
                    Variant0000(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Variant0000) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pvRecord)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pRecInfo)
                }
            }

        public operator fun invoke(
            pvRecord: MutPtr = MutPtr(0L),
            pRecInfo: MutPtr = MutPtr(0L),
        ): Variant0000 =
            Variant0000(
                pvRecordCtorArg = pvRecord,
                pRecInfoCtorArg = pRecInfo,
            )
    }
}
