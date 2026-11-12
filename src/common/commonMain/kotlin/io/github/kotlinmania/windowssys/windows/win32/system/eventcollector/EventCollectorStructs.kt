package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class EcVariant(
    public var anonymous: EcVariant0 = EcVariant0(),
    public var count: UInt = 0u,
    public var type: UInt = 0u,
)

public class EcVariant0 internal constructor(
    public var booleanVal: Bool,
    public var uInt32Val: UInt,
    public var dateTimeVal: ULong,
    stringValCtorArg: Pcwstr,
    binaryValCtorArg: MutPtr<UByte>,
    booleanArrCtorArg: MutPtr<Bool>,
    int32ArrCtorArg: MutPtr<Int>,
    stringArrCtorArg: MutPtr<Pwstr>,
    public var propertyHandleVal: Int,
) {
    public var stringVal: Pcwstr = stringValCtorArg
        internal set

    public var binaryVal: MutPtr<UByte> = binaryValCtorArg
        internal set

    public var booleanArr: MutPtr<Bool> = booleanArrCtorArg
        internal set

    public var int32Arr: MutPtr<Int> = int32ArrCtorArg
        internal set

    public var stringArr: MutPtr<Pwstr> = stringArrCtorArg
        internal set

    public constructor() : this(
        booleanVal = 0,
        uInt32Val = 0u,
        dateTimeVal = 0uL,
        stringValCtorArg = ConstPtr(0L),
        binaryValCtorArg = MutPtr(0L),
        booleanArrCtorArg = MutPtr(0L),
        int32ArrCtorArg = MutPtr(0L),
        stringArrCtorArg = MutPtr(0L),
        propertyHandleVal = 0,
    )

    public operator fun component1(): Bool = this.booleanVal

    public operator fun component2(): UInt = this.uInt32Val

    public operator fun component3(): ULong = this.dateTimeVal

    public operator fun component4(): Pcwstr = this.stringVal

    public operator fun component5(): MutPtr<UByte> = this.binaryVal

    public operator fun component6(): MutPtr<Bool> = this.booleanArr

    public operator fun component7(): MutPtr<Int> = this.int32Arr

    public operator fun component8(): MutPtr<Pwstr> = this.stringArr

    public operator fun component9(): Int = this.propertyHandleVal

    public fun copy(booleanVal: Bool = this.booleanVal, uInt32Val: UInt = this.uInt32Val, dateTimeVal: ULong = this.dateTimeVal, stringVal: Pcwstr = this.stringVal, binaryVal: MutPtr<UByte> = this.binaryVal, booleanArr: MutPtr<Bool> = this.booleanArr, int32Arr: MutPtr<Int> = this.int32Arr, stringArr: MutPtr<Pwstr> = this.stringArr, propertyHandleVal: Int = this.propertyHandleVal): EcVariant0 = EcVariant0(booleanVal = booleanVal, uInt32Val = uInt32Val, dateTimeVal = dateTimeVal, stringValCtorArg = stringVal, binaryValCtorArg = binaryVal, booleanArrCtorArg = booleanArr, int32ArrCtorArg = int32Arr, stringArrCtorArg = stringArr, propertyHandleVal = propertyHandleVal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EcVariant0) return false
        if (this.booleanVal != other.booleanVal) return false
        if (this.uInt32Val != other.uInt32Val) return false
        if (this.dateTimeVal != other.dateTimeVal) return false
        if (this.stringVal != other.stringVal) return false
        if (this.binaryVal != other.binaryVal) return false
        if (this.booleanArr != other.booleanArr) return false
        if (this.int32Arr != other.int32Arr) return false
        if (this.stringArr != other.stringArr) return false
        if (this.propertyHandleVal != other.propertyHandleVal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.booleanVal.hashCode()
        result = 31 * result + this.uInt32Val.hashCode()
        result = 31 * result + this.dateTimeVal.hashCode()
        result = 31 * result + this.stringVal.hashCode()
        result = 31 * result + this.binaryVal.hashCode()
        result = 31 * result + this.booleanArr.hashCode()
        result = 31 * result + this.int32Arr.hashCode()
        result = 31 * result + this.stringArr.hashCode()
        result = 31 * result + this.propertyHandleVal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            booleanVal: Bool = 0,
            uInt32Val: UInt = 0u,
            dateTimeVal: ULong = 0uL,
            stringVal: Pcwstr = ConstPtr(0L),
            binaryVal: MutPtr<UByte> = MutPtr(0L),
            booleanArr: MutPtr<Bool> = MutPtr(0L),
            int32Arr: MutPtr<Int> = MutPtr(0L),
            stringArr: MutPtr<Pwstr> = MutPtr(0L),
            propertyHandleVal: Int = 0,
        ): EcVariant0 =
            EcVariant0(
                booleanVal = booleanVal,
                uInt32Val = uInt32Val,
                dateTimeVal = dateTimeVal,
                stringValCtorArg = stringVal,
                binaryValCtorArg = binaryVal,
                booleanArrCtorArg = booleanArr,
                int32ArrCtorArg = int32Arr,
                stringArrCtorArg = stringArr,
                propertyHandleVal = propertyHandleVal,
            )
    }
}
