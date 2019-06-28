package com.simonfong.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.simonfong.myapplication.IteratorPattern.IteratorPatternActivity;
import com.simonfong.myapplication.abstractfactorypattern.AbstractFactoryPatternActivity;
import com.simonfong.myapplication.adapterpattern.AdapterPatternActivity;
import com.simonfong.myapplication.bridge.BridgePatternActivity;
import com.simonfong.myapplication.builderpattern.BuilderPatternActivity;
import com.simonfong.myapplication.chainofresponsibility.ChainOfResponsibilityPatternActivity;
import com.simonfong.myapplication.commandpattern.CommandPatternActivity;
import com.simonfong.myapplication.composite.CompositePatternActivity;
import com.simonfong.myapplication.decorator.DecoratorPatternActivity;
import com.simonfong.myapplication.facade.FacadePatternActivity;
import com.simonfong.myapplication.factorypattern.FactoryPatternActivity;
import com.simonfong.myapplication.filter.FilterPatternActivity;
import com.simonfong.myapplication.flyweight.FlyweightPatternActivity;
import com.simonfong.myapplication.interpreterpattern.InterpreterPatternActivity;
import com.simonfong.myapplication.prototypepattern.PrototypePatternActivity;
import com.simonfong.myapplication.proxy.ProxyPatternActivity;
import com.simonfong.myapplication.simgletonpattern.SingletonPatternActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * https://www.runoob.com/design-pattern/command-pattern.html
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.factory_pattern)
    Button mFactoryPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.factory_pattern, R.id.abstract_factory_pattern, R.id.singleton_pattern, R.id.builder_pattern,
            R.id.prototype_pattern, R.id.adapter_pattern, R.id.bridge_pattern, R.id.filter_pattern, R.id.composite_pattern,
            R.id.decorator_pattern, R.id.facade_pattern, R.id.flyweight_pattern, R.id.proxy_pattern, R.id.chain_of_responsibility,
            R.id.command_pattern, R.id.interpreter_pattern, R.id.iterator_pattern
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.factory_pattern:
                startActivity(FactoryPatternActivity.class);
                break;
            case R.id.abstract_factory_pattern:
                startActivity(AbstractFactoryPatternActivity.class);
                break;
            case R.id.singleton_pattern:
                startActivity(SingletonPatternActivity.class);
                break;
            case R.id.builder_pattern:
                startActivity(BuilderPatternActivity.class);
                break;
            case R.id.prototype_pattern:
                startActivity(PrototypePatternActivity.class);
                break;
            case R.id.adapter_pattern:
                startActivity(AdapterPatternActivity.class);
                break;
            case R.id.bridge_pattern:
                startActivity(BridgePatternActivity.class);
                break;
            case R.id.filter_pattern:
                startActivity(FilterPatternActivity.class);
                break;
            case R.id.composite_pattern:
                startActivity(CompositePatternActivity.class);
                break;
            case R.id.decorator_pattern:
                startActivity(DecoratorPatternActivity.class);
                break;
            case R.id.facade_pattern:
                startActivity(FacadePatternActivity.class);
                break;
            case R.id.flyweight_pattern:
                startActivity(FlyweightPatternActivity.class);
                break;
            case R.id.proxy_pattern:
                startActivity(ProxyPatternActivity.class);
                break;
            case R.id.chain_of_responsibility:
                startActivity(ChainOfResponsibilityPatternActivity.class);
                break;
            case R.id.command_pattern:
                startActivity(CommandPatternActivity.class);
                break;
            case R.id.interpreter_pattern:
                startActivity(InterpreterPatternActivity.class);
                break;
            case R.id.iterator_pattern:
                startActivity(IteratorPatternActivity.class);
                break;
            default:
        }
    }

    private void startActivity(Class clazz) {
        startActivity(new Intent(MainActivity.this, clazz));
    }
}
