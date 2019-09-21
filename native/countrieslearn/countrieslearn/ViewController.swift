//
//  ViewController.swift
//  countrieslearn
//
//  Created by Angélica Oliveira on 10/09/19.
//  Copyright © 2019 Angélica Oliveira. All rights reserved.
//

import UIKit
import SharedData

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let countriesRepo = CountriesRepositoryImpl()
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        countriesRepo.getCountriesAsync(responseCallback: CountriesCallback(label: label))
        view.addSubview(label)
    }


}

class CountriesCallback: ResponseCallback {
    let label: UILabel
    init(label: UILabel) {
        self.label = label
    }
    func onResponse(response: Any?) {
        label.text = (response as! String)
    }
    
    
}

