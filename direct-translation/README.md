# Direct Rust-to-Kotlin candidates

Source: windows-sys 0.61.2, **249 Rust files** in this checkout. The latest complete
run is [pass 05](pass-05/coverage.md). It uses existing proc-macro2-kotlin → Syn AST
recognition and source-span emission. There is no custom lexer/parser or decompiler.
Existing production sources are untouched; these are **not adopted code**.

## Current coverage

All 249 files were attempted. Across the 248 files with item receipts:

| Disposition | Declarations |
|---|---:|
| Mapped constants and aliases | 118,014 |
| Additional Kotlin syntax needing integration | 43,130 |
| Unsupported original items retained with diagnostics | 16,729 |
| Total counted top-level items | 177,873 |

The root `lib.rs` is emission-blocked by file attributes and is outside that item
denominator. Counts include cfg alternatives and containers, not unique APIs or
body coverage. Four files are completely mapped; 26 more have all items emitted as
mapped/syntax candidates; 195 are partial; 23 contain only unsupported items;
one is blocked. This is per-file output coverage, not whole-project compilation,
Windows ABI/runtime validation or production adoption.

The syntax candidates include **20,189 foreign signatures, 12,969 records,
3,779 aliases and 6,193 literal-macro constants**. DLL/ABI/export names, attributes, array lengths and unresolved types
remain explicit integration requirements. No fake function bodies are generated.
The Syn array-span repair unlocked 2,595 records between passes 03 and 04. The
new literal-macro rule adds 6,193 constants between passes 04 and 05; native
static-pointer adapters remain an explicit coder obligation.

## Open the output

- [Console: signatures, records and constants](pass-05/files/Windows/Win32/System/Console/mod/candidate.kt)
- [OpenGL: all top-level items have Kotlin output](pass-05/files/Windows/Win32/Graphics/OpenGL/mod/candidate.kt), with native integration still required
- [Complete HLSL constants](pass-05/files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt)
- [Beep: all declarations now have Kotlin output, with pointer adapters still required](pass-05/files/Windows/Win32/Devices/Beep/mod/candidate.kt)
- [Ceip foreign signature shape](pass-05/files/Windows/Win32/System/Diagnostics/Ceip/mod/candidate.kt)
- [All files and remaining categories](pass-05/coverage.md)

Each candidate has adjacent `input.rs`, `declarations.tsv`, comment-move records
and a receipt. Unsupported items retain original Rust beside a diagnostic.
Comments and declaration order are preserved; required moves within replaced nodes
are recorded. Original source is always available. Ordinary diffs against all 85
common port files are indexed in [comparisons](comparisons-pass-05/index.json).
Diffs are comparison evidence, not automatic correctness or adoption decisions.

## What was verified

**165 translator tests pass**. The existing Syn parser's array/macro token repairs
pass 419 JVM and 417 macOS tests. Its rebuilt translator preserves nested-array
comments, generates identical repeated output and compiles the unchanged fixture.
[Array evidence and Console adjudication](syntax-validation-02-array-spans/adjudication.md)
separate that syntax check from fixed-size/Copy/layout semantics.
[Literal-macro evidence](string-validation-02/adjudication.md) records 14 Rust/Kotlin
content observations, using the original Rust macros and clearly labeled test-only
value adapters. Raw generated output compiles unchanged with those adapters; this
is not native pointer lifetime, address identity or ABI validation.

Earlier scalar/cast checks match 19 Rust boundary observations, with unchanged Kotlin
compilation. Complete HLSL Rust and generated Kotlin both produce `49152|1`.
[Receipts](validation/) cover those bounded checks, not every declaration.

A separate native-bridge mode was validated for
[Ceip](link-validation-04-raw-imports/validation.json) and
[52 Threading functions](link-validation-05-threading-raw/validation.json):
source-derived raw DLL archives, Kotlin/Native compilation, Windows PE linking and
exact DLL/export imports. No Windows executable was run. Pass 05 syntax output does
not inherit those ABI claims, and whole-project integration does not gate emission.

## What remains

The largest unsupported categories are 8,938 impl blocks, 5,939 constants involving
richer values, and 1,500 unions. There are also 246 module items, 63 macros, 34 tuple/unit records, 7 uses and 2 functions. Original source is
retained for every one. Next improvements should implement reusable AST rules on
representative cases and rerun the inventory, rather than hand-patch these files.

Cross-file namespace binding, target cfg selection, native storage/layout, ownership,
callbacks and production adoption remain coder integration work. Syntax-shaped
arrays do not enforce Rust lengths or value semantics. Diagnostics keep those limits
visible; unresolved declarations are not counted as fully mapped translations.

## Reproducibility and protection

Pass 05 executable SHA-256:
`48587deaffc35820d005660532afaed8601e7381b5a9fa0db858e2521f3c735c`.
[Verification](pass-05/verification.json) checks every source/output hash, item count
and ordered source span. `run.json` records the exact source binding and options.
The observed pass took about 285 seconds under concurrent load, not an isolated
benchmark. Older passes/executables are retained unchanged. A pass is complete only
when its `summary.json` exists; older in-progress manifests are historical partials.
The original [pass 02 baseline](pass-02/coverage.md) has now completed all 249 files:
118,014 mapped and 59,859 unsupported items. Its original executable was not replaced.
Pass 01 is still running and remains a historical partial.

`inventory.json` records original paths/hashes. `baseline-state.json` and preservation
receipts protect the 105 pre-existing dirty paths and staged changes. Output is kept
separate from production/restoration/configuration files. Local commits protect the
sources and evidence; binary build products remain local and ignored. No pushes,
remote CI, PRs, public publication or releases are performed.

See the generator's [canonical design](../../rust-kotlin/docs/design.md) and
[current literal-macro increment](../../rust-kotlin/docs/windows-string-candidates.md).
